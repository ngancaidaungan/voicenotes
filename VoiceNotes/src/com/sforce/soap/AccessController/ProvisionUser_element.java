package com.sforce.soap.AccessController;

/**
 * Generated class, please do not edit.
 */
public class ProvisionUser_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ProvisionUser_element() {
  }
    
  
  /**
   * element  : u of type {http://soap.sforce.com/schemas/class/AccessController}UserWrapper
   * java type: com.sforce.soap.AccessController.UserWrapper
   */
  private static final com.sforce.ws.bind.TypeInfo u__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","u","http://soap.sforce.com/schemas/class/AccessController","UserWrapper",1,1,true);

  private boolean u__is_set = false;

  private com.sforce.soap.AccessController.UserWrapper u;

  public com.sforce.soap.AccessController.UserWrapper getU() {
    return u;
  }

  

  public void setU(com.sforce.soap.AccessController.UserWrapper u) {
    this.u = u;
    u__is_set = true;
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
   
    __typeMapper.writeObject(__out, u__typeInfo, u, u__is_set);
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
    if (__typeMapper.verifyElement(__in, u__typeInfo)) {
      setU((com.sforce.soap.AccessController.UserWrapper)__typeMapper.readObject(__in, u__typeInfo, com.sforce.soap.AccessController.UserWrapper.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProvisionUser_element ");
    
    sb.append(" u=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(u)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}