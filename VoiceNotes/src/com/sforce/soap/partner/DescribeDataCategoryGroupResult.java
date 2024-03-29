package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeDataCategoryGroupResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeDataCategoryGroupResult() {
  }
    
  
  /**
   * element  : categoryCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo categoryCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","categoryCount","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean categoryCount__is_set = false;

  private int categoryCount;

  public int getCategoryCount() {
    return categoryCount;
  }

  

  public void setCategoryCount(int categoryCount) {
    this.categoryCount = categoryCount;
    categoryCount__is_set = true;
  }
  
  /**
   * element  : description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean description__is_set = false;

  private java.lang.String description;

  public java.lang.String getDescription() {
    return description;
  }

  

  public void setDescription(java.lang.String description) {
    this.description = description;
    description__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : sobject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sobject","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sobject__is_set = false;

  private java.lang.String sobject;

  public java.lang.String getSobject() {
    return sobject;
  }

  

  public void setSobject(java.lang.String sobject) {
    this.sobject = sobject;
    sobject__is_set = true;
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
   
    __typeMapper.writeInt(__out, categoryCount__typeInfo, categoryCount, categoryCount__is_set);
    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, sobject__typeInfo, sobject, sobject__is_set);
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
    if (__typeMapper.verifyElement(__in, categoryCount__typeInfo)) {
      setCategoryCount((int)__typeMapper.readInt(__in, categoryCount__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobject__typeInfo)) {
      setSobject((java.lang.String)__typeMapper.readString(__in, sobject__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeDataCategoryGroupResult ");
    
    sb.append(" categoryCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(categoryCount)+"'\n");
    sb.append(" description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" sobject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobject)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}