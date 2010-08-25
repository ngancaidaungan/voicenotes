package com.sforce.soap.AccessController;

/**
 * Generated class, please do not edit.
 */
public class UserWrapper implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public UserWrapper() {
  }
    
  
  /**
   * element  : email of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo email__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","email","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean email__is_set = false;

  private java.lang.String email;

  public java.lang.String getEmail() {
    return email;
  }

  

  public void setEmail(java.lang.String email) {
    this.email = email;
    email__is_set = true;
  }
  
  /**
   * element  : firstName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo firstName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","firstName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean firstName__is_set = false;

  private java.lang.String firstName;

  public java.lang.String getFirstName() {
    return firstName;
  }

  

  public void setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
    firstName__is_set = true;
  }
  
  /**
   * element  : hcpId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo hcpId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","hcpId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean hcpId__is_set = false;

  private java.lang.String hcpId;

  public java.lang.String getHcpId() {
    return hcpId;
  }

  

  public void setHcpId(java.lang.String hcpId) {
    this.hcpId = hcpId;
    hcpId__is_set = true;
  }
  
  /**
   * element  : lastName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo lastName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","lastName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean lastName__is_set = false;

  private java.lang.String lastName;

  public java.lang.String getLastName() {
    return lastName;
  }

  

  public void setLastName(java.lang.String lastName) {
    this.lastName = lastName;
    lastName__is_set = true;
  }
  
  /**
   * element  : password of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo password__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","password","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean password__is_set = false;

  private java.lang.String password;

  public java.lang.String getPassword() {
    return password;
  }

  

  public void setPassword(java.lang.String password) {
    this.password = password;
    password__is_set = true;
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
   
    __typeMapper.writeString(__out, email__typeInfo, email, email__is_set);
    __typeMapper.writeString(__out, firstName__typeInfo, firstName, firstName__is_set);
    __typeMapper.writeString(__out, hcpId__typeInfo, hcpId, hcpId__is_set);
    __typeMapper.writeString(__out, lastName__typeInfo, lastName, lastName__is_set);
    __typeMapper.writeString(__out, password__typeInfo, password, password__is_set);
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
    if (__typeMapper.isElement(__in, email__typeInfo)) {
      setEmail((java.lang.String)__typeMapper.readString(__in, email__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, firstName__typeInfo)) {
      setFirstName((java.lang.String)__typeMapper.readString(__in, firstName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, hcpId__typeInfo)) {
      setHcpId((java.lang.String)__typeMapper.readString(__in, hcpId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, lastName__typeInfo)) {
      setLastName((java.lang.String)__typeMapper.readString(__in, lastName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, password__typeInfo)) {
      setPassword((java.lang.String)__typeMapper.readString(__in, password__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserWrapper ");
    
    sb.append(" email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(email)+"'\n");
    sb.append(" firstName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(firstName)+"'\n");
    sb.append(" hcpId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(hcpId)+"'\n");
    sb.append(" lastName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(lastName)+"'\n");
    sb.append(" password=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(password)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}