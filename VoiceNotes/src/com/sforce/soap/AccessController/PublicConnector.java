package com.sforce.soap.AccessController;

import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.ConnectionException;

/**
 * Generated class, please do not edit.
 */
public class PublicConnector{

  public static final String END_POINT = "http://opinion-developer-edition.na7.force.com/api/services/Soap/class/AccessController";

  public static PublicConnection newConnection(String username, String password) throws ConnectionException {
    ConnectorConfig config = new ConnectorConfig();
    config.setUsername(username);
    config.setPassword(password);
    return newConnection(config);
  }

  public static PublicConnection newConnection(ConnectorConfig config) throws ConnectionException {
    if (config.getAuthEndpoint() == null) {
      config.setAuthEndpoint(END_POINT);
    }
    if (config.getServiceEndpoint() == null) {
      config.setServiceEndpoint(END_POINT);
    }
    return new PublicConnection(config);
  }
}