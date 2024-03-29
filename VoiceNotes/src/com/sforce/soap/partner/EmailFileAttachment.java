package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class EmailFileAttachment implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public EmailFileAttachment() {
  }
    
  
  /**
   * element  : body of type {http://www.w3.org/2001/XMLSchema}base64Binary
   * java type: byte[]
   */
  private static final com.sforce.ws.bind.TypeInfo body__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","body","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true);

  private boolean body__is_set = false;

  private byte[] body;

  public byte[] getBody() {
    return body;
  }

  

  public void setBody(byte[] body) {
    this.body = body;
    body__is_set = true;
  }
  
  /**
   * element  : contentType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contentType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","contentType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean contentType__is_set = false;

  private java.lang.String contentType;

  public java.lang.String getContentType() {
    return contentType;
  }

  

  public void setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    contentType__is_set = true;
  }
  
  /**
   * element  : fileName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo fileName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","fileName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean fileName__is_set = false;

  private java.lang.String fileName;

  public java.lang.String getFileName() {
    return fileName;
  }

  

  public void setFileName(java.lang.String fileName) {
    this.fileName = fileName;
    fileName__is_set = true;
  }
  
  /**
   * element  : inline of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo inline__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","inline","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean inline__is_set = false;

  private boolean inline;

  public boolean getInline() {
    return inline;
  }

  

  public boolean isInline() {
    return inline;
  }

  

  public void setInline(boolean inline) {
    this.inline = inline;
    inline__is_set = true;
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
   
    __typeMapper.writeObject(__out, body__typeInfo, body, body__is_set);
    __typeMapper.writeString(__out, contentType__typeInfo, contentType, contentType__is_set);
    __typeMapper.writeString(__out, fileName__typeInfo, fileName, fileName__is_set);
    __typeMapper.writeBoolean(__out, inline__typeInfo, inline, inline__is_set);
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
    if (__typeMapper.isElement(__in, body__typeInfo)) {
      setBody((byte[])__typeMapper.readObject(__in, body__typeInfo, byte[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, contentType__typeInfo)) {
      setContentType((java.lang.String)__typeMapper.readString(__in, contentType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, fileName__typeInfo)) {
      setFileName((java.lang.String)__typeMapper.readString(__in, fileName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, inline__typeInfo)) {
      setInline((boolean)__typeMapper.readBoolean(__in, inline__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailFileAttachment ");
    
    sb.append(" body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(body)+"'\n");
    sb.append(" contentType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contentType)+"'\n");
    sb.append(" fileName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fileName)+"'\n");
    sb.append(" inline=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(inline)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}