package com.sforce.soap.AccessController;

/**
 * Generated class, please do not edit.
 */
public class LogInfo implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public LogInfo() {
  }
    
  
  /**
   * element  : category of type {http://soap.sforce.com/schemas/class/AccessController}LogCategory
   * java type: com.sforce.soap.AccessController.LogCategory
   */
  private static final com.sforce.ws.bind.TypeInfo category__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","category","http://soap.sforce.com/schemas/class/AccessController","LogCategory",1,1,true);

  private boolean category__is_set = false;

  private com.sforce.soap.AccessController.LogCategory category;

  public com.sforce.soap.AccessController.LogCategory getCategory() {
    return category;
  }

  

  public void setCategory(com.sforce.soap.AccessController.LogCategory category) {
    this.category = category;
    category__is_set = true;
  }
  
  /**
   * element  : level of type {http://soap.sforce.com/schemas/class/AccessController}LogCategoryLevel
   * java type: com.sforce.soap.AccessController.LogCategoryLevel
   */
  private static final com.sforce.ws.bind.TypeInfo level__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/schemas/class/AccessController","level","http://soap.sforce.com/schemas/class/AccessController","LogCategoryLevel",1,1,true);

  private boolean level__is_set = false;

  private com.sforce.soap.AccessController.LogCategoryLevel level;

  public com.sforce.soap.AccessController.LogCategoryLevel getLevel() {
    return level;
  }

  

  public void setLevel(com.sforce.soap.AccessController.LogCategoryLevel level) {
    this.level = level;
    level__is_set = true;
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
   
    __typeMapper.writeObject(__out, category__typeInfo, category, category__is_set);
    __typeMapper.writeObject(__out, level__typeInfo, level, level__is_set);
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
    if (__typeMapper.verifyElement(__in, category__typeInfo)) {
      setCategory((com.sforce.soap.AccessController.LogCategory)__typeMapper.readObject(__in, category__typeInfo, com.sforce.soap.AccessController.LogCategory.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, level__typeInfo)) {
      setLevel((com.sforce.soap.AccessController.LogCategoryLevel)__typeMapper.readObject(__in, level__typeInfo, com.sforce.soap.AccessController.LogCategoryLevel.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LogInfo ");
    
    sb.append(" category=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(category)+"'\n");
    sb.append(" level=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(level)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}