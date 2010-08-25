package com.sforce.soap.AccessController;

/**
 * Generated class, please do not edit.
 */
public class DebuggingHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DebuggingHeader_element() {
  }
    
  
  /**
   * element  : categories of type {http://soap.sforce.com/schemas/class/AccessController}LogInfo
   * java type: com.sforce.soap.AccessController.LogInfo[]
   */
  private static final com.sforce.ws.bind.TypeInfo categories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","categories","http://soap.sforce.com/schemas/class/AccessController","LogInfo",0,-1,true);

  private boolean categories__is_set = false;

  private com.sforce.soap.AccessController.LogInfo[] categories = new com.sforce.soap.AccessController.LogInfo[0];

  public com.sforce.soap.AccessController.LogInfo[] getCategories() {
    return categories;
  }

  

  public void setCategories(com.sforce.soap.AccessController.LogInfo[] categories) {
    this.categories = categories;
    categories__is_set = true;
  }
  
  /**
   * element  : debugLevel of type {http://soap.sforce.com/schemas/class/AccessController}LogType
   * java type: com.sforce.soap.AccessController.LogType
   */
  private static final com.sforce.ws.bind.TypeInfo debugLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","debugLevel","http://soap.sforce.com/schemas/class/AccessController","LogType",1,1,true);

  private boolean debugLevel__is_set = false;

  private com.sforce.soap.AccessController.LogType debugLevel;

  public com.sforce.soap.AccessController.LogType getDebugLevel() {
    return debugLevel;
  }

  

  public void setDebugLevel(com.sforce.soap.AccessController.LogType debugLevel) {
    this.debugLevel = debugLevel;
    debugLevel__is_set = true;
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
    __typeMapper.writeObject(__out, categories__typeInfo, categories, categories__is_set);
    __typeMapper.writeObject(__out, debugLevel__typeInfo, debugLevel, debugLevel__is_set);
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
    if (__typeMapper.isElement(__in, categories__typeInfo)) {
      setCategories((com.sforce.soap.AccessController.LogInfo[])__typeMapper.readObject(__in, categories__typeInfo, com.sforce.soap.AccessController.LogInfo[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, debugLevel__typeInfo)) {
      setDebugLevel((com.sforce.soap.AccessController.LogType)__typeMapper.readObject(__in, debugLevel__typeInfo, com.sforce.soap.AccessController.LogType.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DebuggingHeader_element ");
    sb.append(super.toString());
    sb.append(" categories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(categories)+"'\n");
    sb.append(" debugLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(debugLevel)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}