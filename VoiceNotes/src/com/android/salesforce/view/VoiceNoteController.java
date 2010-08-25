package com.android.salesforce.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import com.android.salesforce.R;
import com.android.salesforce.service.ConnectionManager;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import android.media.MediaRecorder;


public class VoiceNoteController extends Activity {
	private static final String TAG = "Voice Note Controller";
	private PartnerConnection connection;
	private String accountId;
	private String accountName;
	private static Button submitButton;
	private MediaRecorder recorder = new MediaRecorder();
	private String path;
	private String encodedAudio;
	byte[] inbuff;
	private static TextView txtAccountName;
	private String newCaseNumber;
	private static Button startButton;
	
	@Override 
    public void onCreate(Bundle savedInstanceState) {
		
		Log.v(TAG, "STARTING NEW ACTIVITY");
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.new_note);
        startButton = (Button) findViewById(R.id.btnStart);
        startButton.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        
        accountId = getIntent().getStringExtra("id"); 
        accountName = getIntent().getStringExtra("name"); 
        
        path = "myRecording";
        this.path = sanitizePath(path);
        initFormFunction(); 
        initAudioObjects();
	}
	
	private String sanitizePath(String path) {
		if (!path.startsWith("/")) {
	      path = "/VoiceNotes/Recordings/" + path;
	    }
	    if (!path.contains(".")) {
	      path += ".3gp"; 
	    }
	    return Environment.getExternalStorageDirectory().getAbsolutePath() + path;
	  }
	
	private void initFormFunction() {	
		txtAccountName = (TextView) findViewById(R.id.txtAccountName); 
		txtAccountName.setText(accountName);
		submitButton = (Button) findViewById(R.id.btnSubmitInquiry);	   	
		submitButton.setOnClickListener(new OnClickListener() {
    		@Override
    	    public void onClick(View v) {   			
    			new InquiryHandler().execute(); 
    	    }
       });
	}
	
	private class InquiryHandler extends AsyncTask<Void, Void, Void> {
		private ProgressDialog pd = new ProgressDialog(VoiceNoteController.this);
		
		protected void onPreExecute() {  
			pd.setMessage("Submitting Inquiry.."); 
			pd.setIndeterminate(true);
			pd.setCancelable(false);
			pd.show();  
		}
		
		@Override
		protected Void doInBackground(Void... unused) {
	        connection = ConnectionManager.getConnectionManager().getConnection();
			insertVoiceNote();
	        return null;
		}

	    protected void onPostExecute(Void unused) {
	    	pd.dismiss();
			AlertDialog.Builder adb=new AlertDialog.Builder(VoiceNoteController.this);
			adb.setTitle("Success!");
			adb.setMessage("Your voice note was successfully attached to "+accountName);
			adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					Intent myIntent = new Intent(VoiceNoteController.this, AccountListController.class); 
			    	startActivity(myIntent);
				}
			});
			
			adb.show();
	    }
	}
	
	private void initAudioObjects() {	
		
    	startButton.setOnClickListener(new OnClickListener() {
    		@Override
    	    public void onClick(View v) {
    			try {
    				startButton.getBackground().setColorFilter(0xffff0000, PorterDuff.Mode.MULTIPLY);
    				startButton.setText("Stop Recording");
    				startButton.setOnClickListener(new OnClickListener() {
    		    		@Override
    		    	    public void onClick(View v) {
    		    			try {
    							stopRecording();
    						} catch (IOException e) {
    							// TODO Auto-generated catch block
    							e.printStackTrace();
    						}
    		    	    }
    				});
    				startRecording();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    }
       });
	}
	
	
	private void insertVoiceNote() {
		SaveResult[] results = null;
		
		SObject att = new SObject();
		att.setType("Attachment");
		att.setField("Body", inbuff);
		att.setField("Name", "VoiceNote.3gp");
		att.setField("ParentId", accountId);
        SObject[] atts = {att};
        
        try {
            results = connection.create(atts);
        } catch (ConnectionException e) {
            e.printStackTrace();
        }
	} 
	

	public void startRecording() throws IOException {
		String state = android.os.Environment.getExternalStorageState();
	    if(!state.equals(android.os.Environment.MEDIA_MOUNTED))  {
	        throw new IOException("SD Card is not mounted.  It is " + state + ".");
	    }

	    // make sure the directory we plan to store the recording in exists
	    File directory = new File(path).getParentFile();
	    if (!directory.exists() && !directory.mkdirs()) {
	      throw new IOException("Path to file could not be created.");
	    }

	    recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
	   	recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP); 
	   	recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
	   	recorder.setOutputFile(path);
	   	recorder.prepare();
    	recorder.start();	  
	}

	public void stopRecording() throws IOException {
		recorder.stop();
		recorder.release();
        startButton.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
		startButton.setText("Audio Captured");
		startButton.setOnClickListener(new OnClickListener() {
    		@Override
    	    public void onClick(View v) {
    			try {
					startRecording(); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    }
		});
		
		readFile();
	}
	  
	public void readFile() throws IOException { 
		File file = new File(path);
		FileInputStream is = new FileInputStream(file);
		inbuff = new byte[(int)file.length()];
		is.read(inbuff);
	}
}
