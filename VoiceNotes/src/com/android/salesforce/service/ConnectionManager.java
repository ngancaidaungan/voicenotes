package com.android.salesforce.service;

import java.util.logging.Logger;

import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.GetUserInfoResult;
import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.android.salesforce.util.StaticInformation;
import android.util.Log;

public class ConnectionManager {
	
	private static final String TAG = "CONNECTION MANAGER";
	private static ConnectionManager ref;
	private static PartnerConnection connection;
	
	private ConnectionManager() { }

	public static ConnectionManager getConnectionManager() {
		if (ref == null)
			ref = new ConnectionManager();
		return ref;
	}
	
	public PartnerConnection getConnection() {
		if (StaticInformation.SESSION_ID.length() == 0) {
			try { 
				Log.i(TAG, "Fetching new connection....");
				Log.i(TAG, "Logging in as: " + StaticInformation.USER_NAME + " with password: " + StaticInformation.USER_PW);
				ConnectorConfig config = new ConnectorConfig();
                config.setUsername(StaticInformation.USER_NAME);
                config.setPassword(StaticInformation.USER_PW);
				connection = Connector.newConnection(config);				
				StaticInformation.SESSION_ID = config.getSessionId();
				Log.i(TAG, "Session id is: " + StaticInformation.SESSION_ID);
			} catch (ConnectionException ce) {
				Log.i(TAG, "ConnectionException: " +ce.getMessage()); 
			}        	
        } else {
        	Log.i(TAG, "Using existing connection....");
        }
        
		return connection;
	}
}