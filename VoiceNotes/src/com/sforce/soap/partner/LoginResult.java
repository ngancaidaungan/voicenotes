package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class LoginResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public LoginResult() {
  }
    
  
  /**
   * element  : metadataServerUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo metadataServerUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","metadataServerUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean metadataServerUrl__is_set = false;

  private java.lang.String metadataServerUrl;

  public java.lang.String getMetadataServerUrl() {
    return metadataServerUrl;
  }

  

  public void setMetadataServerUrl(java.lang.String metadataServerUrl) {
    this.metadataServerUrl = metadataServerUrl;
    metadataServerUrl__is_set = true;
  }
  
  /**
   * element  : passwordExpired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo passwordExpired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","passwordExpired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean passwordExpired__is_set = false;

  private boolean passwordExpired;

  public boolean getPasswordExpired() {
    return passwordExpired;
  }

  

  public boolean isPasswordExpired() {
    return passwordExpired;
  }

  

  public void setPasswordExpired(boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
    passwordExpired__is_set = true;
  }
  
  /**
   * element  : sandbox of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo sandbox__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sandbox","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean sandbox__is_set = false;

  private boolean sandbox;

  public boolean getSandbox() {
    return sandbox;
  }

  

  public boolean isSandbox() {
    return sandbox;
  }

  

  public void setSandbox(boolean sandbox) {
    this.sandbox = sandbox;
    sandbox__is_set = true;
  }
  
  /**
   * element  : serverUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo serverUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","serverUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean serverUrl__is_set = false;

  private java.lang.String serverUrl;

  public java.lang.String getServerUrl() {
    return serverUrl;
  }

  

  public void setServerUrl(java.lang.String serverUrl) {
    this.serverUrl = serverUrl;
    serverUrl__is_set = true;
  }
  
  /**
   * element  : sessionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sessionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sessionId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sessionId__is_set = false;

  private java.lang.String sessionId;

  public java.lang.String getSessionId() {
    return sessionId;
  }

  

  public void setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    sessionId__is_set = true;
  }
  
  /**
   * element  : userId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo userId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","userId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean userId__is_set = false;

  private java.lang.String userId;

  public java.lang.String getUserId() {
    return userId;
  }

  

  public void setUserId(java.lang.String userId) {
    this.userId = userId;
    userId__is_set = true;
  }
  
  /**
   * element  : userInfo of type {urn:partner.soap.sforce.com}GetUserInfoResult
   * java type: com.sforce.soap.partner.GetUserInfoResult
   */
  private static final com.sforce.ws.bind.TypeInfo userInfo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","userInfo","urn:partner.soap.sforce.com","GetUserInfoResult",0,1,true);

  private boolean userInfo__is_set = false;

  private com.sforce.soap.partner.GetUserInfoResult userInfo;

  public com.sforce.soap.partner.GetUserInfoResult getUserInfo() {
    return userInfo;
  }

  

  public void setUserInfo(com.sforce.soap.partner.GetUserInfoResult userInfo) {
    this.userInfo = userInfo;
    userInfo__is_set = true;
  }
  

  /**
   */
  public void write(com.mavens.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeString(__out, metadataServerUrl__typeInfo, metadataServerUrl, metadataServerUrl__is_set);
    __typeMapper.writeBoolean(__out, passwordExpired__typeInfo, passwordExpired, passwordExpired__is_set);
    __typeMapper.writeBoolean(__out, sandbox__typeInfo, sandbox, sandbox__is_set);
    __typeMapper.writeString(__out, serverUrl__typeInfo, serverUrl, serverUrl__is_set);
    __typeMapper.writeString(__out, sessionId__typeInfo, sessionId, sessionId__is_set);
    __typeMapper.writeString(__out, userId__typeInfo, userId, userId__is_set);
    __typeMapper.writeObject(__out, userInfo__typeInfo, userInfo, userInfo__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, metadataServerUrl__typeInfo)) {
      setMetadataServerUrl((java.lang.String)__typeMapper.readString(__in, metadataServerUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, passwordExpired__typeInfo)) {
      setPasswordExpired((boolean)__typeMapper.readBoolean(__in, passwordExpired__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sandbox__typeInfo)) {
      setSandbox((boolean)__typeMapper.readBoolean(__in, sandbox__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, serverUrl__typeInfo)) {
      setServerUrl((java.lang.String)__typeMapper.readString(__in, serverUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sessionId__typeInfo)) {
      setSessionId((java.lang.String)__typeMapper.readString(__in, sessionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, userId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, userId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, userInfo__typeInfo)) {
      setUserInfo((com.sforce.soap.partner.GetUserInfoResult)__typeMapper.readObject(__in, userInfo__typeInfo, com.sforce.soap.partner.GetUserInfoResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LoginResult ");
    
    sb.append(" metadataServerUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(metadataServerUrl)+"'\n");
    sb.append(" passwordExpired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(passwordExpired)+"'\n");
    sb.append(" sandbox=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sandbox)+"'\n");
    sb.append(" serverUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(serverUrl)+"'\n");
    sb.append(" sessionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sessionId)+"'\n");
    sb.append(" userId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(userId)+"'\n");
    sb.append(" userInfo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(userInfo)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}