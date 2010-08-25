package com.sforce.soap.AccessController;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.bind.XMLizable;
import com.sforce.ws.bind.TypeMapper;

import java.util.HashMap;

import com.mavens.xml.namespace.QName;

import android.util.Log;

/**
 * Generated class, please do not edit.
 */
public class PublicConnection {

  private TypeMapper __typeMapper = new TypeMapper();
  private ConnectorConfig __config;
  private HashMap<QName, XMLizable> __extraHeaders = new HashMap<QName, XMLizable>();

  public ConnectorConfig getConfig() {
    return __config;
  }

  
  private com.sforce.soap.AccessController.DebuggingInfo_element __DebuggingInfo;

  public void setDebuggingInfo(java.lang.String debugLog) {
    __DebuggingInfo = new com.sforce.soap.AccessController.DebuggingInfo_element();
     
       __DebuggingInfo.setDebugLog(debugLog);
  }

  public void clearDebuggingInfo() {
    __DebuggingInfo = null;
  }

  public com.sforce.soap.AccessController.DebuggingInfo_element getDebuggingInfo() {
    return  __DebuggingInfo;
  }

  public void __setDebuggingInfo(com.sforce.soap.AccessController.DebuggingInfo_element __header) {
    __DebuggingInfo = __header ;
  }

  
  private com.sforce.soap.AccessController.DebuggingHeader_element __DebuggingHeader;

  public void setDebuggingHeader(com.sforce.soap.AccessController.LogInfo[] categories,com.sforce.soap.AccessController.LogType debugLevel) {
    __DebuggingHeader = new com.sforce.soap.AccessController.DebuggingHeader_element();
     
       __DebuggingHeader.setCategories(categories);
       __DebuggingHeader.setDebugLevel(debugLevel);
  }

  public void clearDebuggingHeader() {
    __DebuggingHeader = null;
  }

  public com.sforce.soap.AccessController.DebuggingHeader_element getDebuggingHeader() {
    return  __DebuggingHeader;
  }

  public void __setDebuggingHeader(com.sforce.soap.AccessController.DebuggingHeader_element __header) {
    __DebuggingHeader = __header ;
  }

  
  private com.sforce.soap.AccessController.CallOptions_element __CallOptions;

  public void setCallOptions(java.lang.String client) {
    __CallOptions = new com.sforce.soap.AccessController.CallOptions_element();
     
       __CallOptions.setClient(client);
  }

  public void clearCallOptions() {
    __CallOptions = null;
  }

  public com.sforce.soap.AccessController.CallOptions_element getCallOptions() {
    return  __CallOptions;
  }

  public void __setCallOptions(com.sforce.soap.AccessController.CallOptions_element __header) {
    __CallOptions = __header ;
  }

  
  private com.sforce.soap.AccessController.SessionHeader_element __SessionHeader;

  public void setSessionHeader(java.lang.String sessionId) {
    __SessionHeader = new com.sforce.soap.AccessController.SessionHeader_element();
     
       __SessionHeader.setSessionId(sessionId);
  }

  public void clearSessionHeader() {
    __SessionHeader = null;
  }

  public com.sforce.soap.AccessController.SessionHeader_element getSessionHeader() {
    return  __SessionHeader;
  }

  public void __setSessionHeader(com.sforce.soap.AccessController.SessionHeader_element __header) {
    __SessionHeader = __header ;
  }

  
  private com.sforce.soap.AccessController.AllowFieldTruncationHeader_element __AllowFieldTruncationHeader;

  public void setAllowFieldTruncationHeader(boolean allowFieldTruncation) {
    __AllowFieldTruncationHeader = new com.sforce.soap.AccessController.AllowFieldTruncationHeader_element();
     
       __AllowFieldTruncationHeader.setAllowFieldTruncation(allowFieldTruncation);
  }

  public void clearAllowFieldTruncationHeader() {
    __AllowFieldTruncationHeader = null;
  }

  public com.sforce.soap.AccessController.AllowFieldTruncationHeader_element getAllowFieldTruncationHeader() {
    return  __AllowFieldTruncationHeader;
  }

  public void __setAllowFieldTruncationHeader(com.sforce.soap.AccessController.AllowFieldTruncationHeader_element __header) {
    __AllowFieldTruncationHeader = __header ;
  }

  

  public PublicConnection(ConnectorConfig config) throws ConnectionException {
    this.__config = config;
    this.__typeMapper.setPackagePrefix(null); 
    this.__typeMapper.setConfig(config);

    

    
      __SessionHeader = new SessionHeader_element();
      __SessionHeader.setSessionId(config.getSessionId());
    
  }

  private com.sforce.ws.transport.SoapConnection newConnection() {
      com.sforce.ws.transport.SoapConnection __c   = new com.sforce.ws.transport.SoapConnection(
           __config.getServiceEndpoint(), null, __typeMapper, __config);

      __c.setConnection(this);
      __c.setKnownHeaders(knownHeaders);
      
      Log.v("XXXXXXXXX SENDING TO: ", __config.getServiceEndpoint());
      
      return __c;
   }

  
  public java.lang.String provisionUser(com.sforce.soap.AccessController.UserWrapper u)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.AccessController.ProvisionUser_element __request = new com.sforce.soap.AccessController.ProvisionUser_element();
    com.sforce.soap.AccessController.ProvisionUserResponse_element __response = new com.sforce.soap.AccessController.ProvisionUserResponse_element();

  
    __request.setU(u);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__DebuggingHeader != null) __connection.addHeader(DebuggingHeader_qname, __DebuggingHeader);
    
    if (__AllowFieldTruncationHeader != null) __connection.addHeader(AllowFieldTruncationHeader_qname, __AllowFieldTruncationHeader);
    

    addHeaders(__connection);

    __response = (com.sforce.soap.AccessController.ProvisionUserResponse_element) __connection.send("",
       provisionUser_qname, __request, provisionUserResponse_qname,
       com.sforce.soap.AccessController.ProvisionUserResponse_element.class);

    return __response.getResult();
  }
  


  private void addHeaders(com.sforce.ws.transport.SoapConnection __connection) {
    for(java.util.Map.Entry<QName, XMLizable> entry : __extraHeaders.entrySet()) {
      __connection.addHeader(entry.getKey(), entry.getValue());
    }
  }

  public void addExtraHeader(QName __headerName, XMLizable __value) {
    __extraHeaders.put(__headerName, __value);
  }

	public void removeExtraHeader(QName __headerName) {
		__extraHeaders.remove(__headerName);
	}

	public XMLizable getExtraHeader(QName __headerName) {
		return __extraHeaders.get(__headerName);
	}
	
	public void clearExtraHeaders() {
		__extraHeaders = new HashMap<QName, XMLizable>();
	}    private static final com.mavens.xml.namespace.QName provisionUser_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "provisionUser");
    private static final com.mavens.xml.namespace.QName provisionUserResponse_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "provisionUserResponse");
    private static final com.mavens.xml.namespace.QName DebuggingInfo_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "DebuggingInfo");
    private static final com.mavens.xml.namespace.QName DebuggingHeader_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "DebuggingHeader");
    private static final com.mavens.xml.namespace.QName CallOptions_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "CallOptions");
    private static final com.mavens.xml.namespace.QName SessionHeader_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "SessionHeader");
    private static final com.mavens.xml.namespace.QName AllowFieldTruncationHeader_qname = new com.mavens.xml.namespace.QName("http://soap.sforce.com/schemas/class/AccessController", "AllowFieldTruncationHeader");


  private static HashMap<QName, java.lang.Class> knownHeaders = new HashMap<QName, java.lang.Class>();

  static {  knownHeaders.put(DebuggingInfo_qname,com.sforce.soap.AccessController.DebuggingInfo_element.class);
  knownHeaders.put(DebuggingHeader_qname,com.sforce.soap.AccessController.DebuggingHeader_element.class);
  knownHeaders.put(CallOptions_qname,com.sforce.soap.AccessController.CallOptions_element.class);
  knownHeaders.put(SessionHeader_qname,com.sforce.soap.AccessController.SessionHeader_element.class);
  knownHeaders.put(AllowFieldTruncationHeader_qname,com.sforce.soap.AccessController.AllowFieldTruncationHeader_element.class);

  }
}