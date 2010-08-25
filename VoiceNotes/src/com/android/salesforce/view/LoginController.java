package com.android.salesforce.view;

import com.android.salesforce.R;
import com.sforce.soap.partner.PartnerConnection;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.android.salesforce.service.ConnectionManager;
import com.android.salesforce.util.StaticInformation;

public class LoginController extends Activity {
	private static final String TAG = "Voice2Task Start Page";
	private static Button loginButton;
	private static EditText userId;
	private static EditText userPw;
	private PartnerConnection connection; 
	
    @Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_menu);               		
        initFormFunction();		
    }

	private void initFormFunction() {
    	userId = (EditText) findViewById(R.id.salesforce_user_id);
		userPw = (EditText) findViewById(R.id.salesforce_user_password);
		   	
		loginButton = (Button) findViewById(R.id.btnLogin);	   	
    	loginButton.setOnClickListener(new OnClickListener() {
    		@Override
    	    public void onClick(View v) {  
    			new LoginHandler().execute();
    	    }
       });
	}
	
	private class LoginHandler extends AsyncTask<Void, Void, Void> {
		private ProgressDialog pd = new ProgressDialog(LoginController.this);
		
		protected void onPreExecute() {  
			pd.setMessage("Logging In..."); 
			pd.setIndeterminate(true);
			pd.setCancelable(false);
			pd.show();  
		}
		 
		@Override
		protected Void doInBackground(Void... unused) {
			StaticInformation.USER_NAME = userId.getText().toString();
			StaticInformation.USER_PW = userPw.getText().toString();
			
			connection = ConnectionManager.getConnectionManager().getConnection();
			return null;
		}

	    protected void onPostExecute(Void unused) {
	    	goToAccountList(); 
	    	pd.dismiss();
	    }
	}

	private void goToAccountList() {
		Intent myIntent = new Intent(LoginController.this, AccountListController.class); 
    	startActivity(myIntent);
	}
}
