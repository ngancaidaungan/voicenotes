package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class Update_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Update_element() {
  }
    
  
  /**
   * element  : sObjects of type {urn:sobject.partner.soap.sforce.com}sObject
   * java type: com.sforce.soap.partner.sobject.SObject[]
   */
  private static final com.sforce.ws.bind.TypeInfo sObjects__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sObjects","urn:sobject.partner.soap.sforce.com","sObject",0,-1,true);

  private boolean sObjects__is_set = false;

  private com.sforce.soap.partner.sobject.SObject[] sObjects = new com.sforce.soap.partner.sobject.SObject[0];

  public com.sforce.soap.partner.sobject.SObject[] getSObjects() {
    return sObjects;
  }

  

  public void setSObjects(com.sforce.soap.partner.sobject.SObject[] sObjects) {
    this.sObjects = sObjects;
    sObjects__is_set = true;
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
   
    __typeMapper.writeObject(__out, sObjects__typeInfo, sObjects, sObjects__is_set);
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
    if (__typeMapper.isElement(__in, sObjects__typeInfo)) {
      setSObjects((com.sforce.soap.partner.sobject.SObject[])__typeMapper.readObject(__in, sObjects__typeInfo, com.sforce.soap.partner.sobject.SObject[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Update_element ");
    
    sb.append(" sObjects=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sObjects)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}