package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutItem implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeLayoutItem() {
  }
    
  
  /**
   * element  : editable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo editable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","editable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean editable__is_set = false;

  private boolean editable;

  public boolean getEditable() {
    return editable;
  }

  

  public boolean isEditable() {
    return editable;
  }

  

  public void setEditable(boolean editable) {
    this.editable = editable;
    editable__is_set = true;
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
   * element  : layoutComponents of type {urn:partner.soap.sforce.com}DescribeLayoutComponent
   * java type: com.sforce.soap.partner.DescribeLayoutComponent[]
   */
  private static final com.sforce.ws.bind.TypeInfo layoutComponents__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","layoutComponents","urn:partner.soap.sforce.com","DescribeLayoutComponent",0,-1,true);

  private boolean layoutComponents__is_set = false;

  private com.sforce.soap.partner.DescribeLayoutComponent[] layoutComponents = new com.sforce.soap.partner.DescribeLayoutComponent[0];

  public com.sforce.soap.partner.DescribeLayoutComponent[] getLayoutComponents() {
    return layoutComponents;
  }

  

  public void setLayoutComponents(com.sforce.soap.partner.DescribeLayoutComponent[] layoutComponents) {
    this.layoutComponents = layoutComponents;
    layoutComponents__is_set = true;
  }
  
  /**
   * element  : placeholder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo placeholder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","placeholder","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean placeholder__is_set = false;

  private boolean placeholder;

  public boolean getPlaceholder() {
    return placeholder;
  }

  

  public boolean isPlaceholder() {
    return placeholder;
  }

  

  public void setPlaceholder(boolean placeholder) {
    this.placeholder = placeholder;
    placeholder__is_set = true;
  }
  
  /**
   * element  : required of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo required__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","required","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean required__is_set = false;

  private boolean required;

  public boolean getRequired() {
    return required;
  }

  

  public boolean isRequired() {
    return required;
  }

  

  public void setRequired(boolean required) {
    this.required = required;
    required__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, editable__typeInfo, editable, editable__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeObject(__out, layoutComponents__typeInfo, layoutComponents, layoutComponents__is_set);
    __typeMapper.writeBoolean(__out, placeholder__typeInfo, placeholder, placeholder__is_set);
    __typeMapper.writeBoolean(__out, required__typeInfo, required, required__is_set);
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
    if (__typeMapper.verifyElement(__in, editable__typeInfo)) {
      setEditable((boolean)__typeMapper.readBoolean(__in, editable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, layoutComponents__typeInfo)) {
      setLayoutComponents((com.sforce.soap.partner.DescribeLayoutComponent[])__typeMapper.readObject(__in, layoutComponents__typeInfo, com.sforce.soap.partner.DescribeLayoutComponent[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, placeholder__typeInfo)) {
      setPlaceholder((boolean)__typeMapper.readBoolean(__in, placeholder__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, required__typeInfo)) {
      setRequired((boolean)__typeMapper.readBoolean(__in, required__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutItem ");
    
    sb.append(" editable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(editable)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" layoutComponents=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutComponents)+"'\n");
    sb.append(" placeholder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(placeholder)+"'\n");
    sb.append(" required=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(required)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}