package com.android.salesforce.view;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.android.salesforce.R;
import com.android.salesforce.model.Account;
import com.android.salesforce.service.ConnectionManager;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;

public class AccountListController extends Activity {
	private static final String TAG = "Account List Controller";
	private PartnerConnection connection;
	private List<Account> accounts;
		
	@Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accounts);
        
        connection = ConnectionManager.getConnectionManager().getConnection();
        accounts = getAccounts();

    	ListView lv = (ListView) findViewById(R.id.list);     	
    	lv.setAdapter(new ArrayAdapter<Account>(this, R.layout.account_list_item, accounts));
    	lv.setTextFilterEnabled(true);
    	lv.setOnItemClickListener(new OnItemClickListener() {
    		public void onItemClick(AdapterView<?> parent, View view, int position, long id) { 	    
    			Intent myIntent = new Intent(AccountListController.this, VoiceNoteController.class); 
    			myIntent.putExtra("id", accounts.get(position).getId());
    			myIntent.putExtra("name", accounts.get(position).getName());
    	    	startActivity(myIntent);   			
    		}
    	});      
    }
	
	private List<Account> getAccounts() {
		List<Account> accounts = new ArrayList();
		QueryResult result = null;
		try {
			result = connection.query("Select Id, Name from Account order by Name");
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (SObject product : result.getRecords()) {
			Account a = new Account();
			a.setId((String)product.getField("Id"));
			a.setName((String)product.getField("Name"));
			accounts.add(a);			
		}
		return accounts;
	}
    
}
