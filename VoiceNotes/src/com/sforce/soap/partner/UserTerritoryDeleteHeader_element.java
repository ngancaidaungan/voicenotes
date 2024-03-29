package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class UserTerritoryDeleteHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public UserTerritoryDeleteHeader_element() {
  }
    
  
  /**
   * element  : transferToUserId of type {urn:partner.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo transferToUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","transferToUserId","urn:partner.soap.sforce.com","ID",1,1,true);

  private boolean transferToUserId__is_set = false;

  private java.lang.String transferToUserId;

  public java.lang.String getTransferToUserId() {
    return transferToUserId;
  }

  

  public void setTransferToUserId(java.lang.String transferToUserId) {
    this.transferToUserId = transferToUserId;
    transferToUserId__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, transferToUserId__typeInfo, transferToUserId, transferToUserId__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, transferToUserId__typeInfo)) {
      setTransferToUserId((java.lang.String)__typeMapper.readString(__in, transferToUserId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserTerritoryDeleteHeader_element ");
    sb.append(super.toString());
    sb.append(" transferToUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(transferToUserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}