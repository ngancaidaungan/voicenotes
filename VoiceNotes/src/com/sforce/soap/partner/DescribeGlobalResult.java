package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class DescribeGlobalResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public DescribeGlobalResult() {
  }
    
  
  /**
   * element  : encoding of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo encoding__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","encoding","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean encoding__is_set = false;

  private java.lang.String encoding;

  public java.lang.String getEncoding() {
    return encoding;
  }

  

  public void setEncoding(java.lang.String encoding) {
    this.encoding = encoding;
    encoding__is_set = true;
  }
  
  /**
   * element  : maxBatchSize of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo maxBatchSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","maxBatchSize","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean maxBatchSize__is_set = false;

  private int maxBatchSize;

  public int getMaxBatchSize() {
    return maxBatchSize;
  }

  

  public void setMaxBatchSize(int maxBatchSize) {
    this.maxBatchSize = maxBatchSize;
    maxBatchSize__is_set = true;
  }
  
  /**
   * element  : sobjects of type {urn:partner.soap.sforce.com}DescribeGlobalSObjectResult
   * java type: com.sforce.soap.partner.DescribeGlobalSObjectResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo sobjects__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sobjects","urn:partner.soap.sforce.com","DescribeGlobalSObjectResult",0,-1,true);

  private boolean sobjects__is_set = false;

  private com.sforce.soap.partner.DescribeGlobalSObjectResult[] sobjects = new com.sforce.soap.partner.DescribeGlobalSObjectResult[0];

  public com.sforce.soap.partner.DescribeGlobalSObjectResult[] getSobjects() {
    return sobjects;
  }

  

  public void setSobjects(com.sforce.soap.partner.DescribeGlobalSObjectResult[] sobjects) {
    this.sobjects = sobjects;
    sobjects__is_set = true;
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
   
    __typeMapper.writeString(__out, encoding__typeInfo, encoding, encoding__is_set);
    __typeMapper.writeInt(__out, maxBatchSize__typeInfo, maxBatchSize, maxBatchSize__is_set);
    __typeMapper.writeObject(__out, sobjects__typeInfo, sobjects, sobjects__is_set);
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
    if (__typeMapper.verifyElement(__in, encoding__typeInfo)) {
      setEncoding((java.lang.String)__typeMapper.readString(__in, encoding__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, maxBatchSize__typeInfo)) {
      setMaxBatchSize((int)__typeMapper.readInt(__in, maxBatchSize__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sobjects__typeInfo)) {
      setSobjects((com.sforce.soap.partner.DescribeGlobalSObjectResult[])__typeMapper.readObject(__in, sobjects__typeInfo, com.sforce.soap.partner.DescribeGlobalSObjectResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeGlobalResult ");
    
    sb.append(" encoding=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(encoding)+"'\n");
    sb.append(" maxBatchSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(maxBatchSize)+"'\n");
    sb.append(" sobjects=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobjects)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}