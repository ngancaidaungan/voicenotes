package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class SendEmailResponse_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SendEmailResponse_element() {
  }
    
  
  /**
   * element  : result of type {urn:partner.soap.sforce.com}SendEmailResult
   * java type: com.sforce.soap.partner.SendEmailResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo result__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","result","urn:partner.soap.sforce.com","SendEmailResult",0,10,true);

  private boolean result__is_set = false;

  private com.sforce.soap.partner.SendEmailResult[] result = new com.sforce.soap.partner.SendEmailResult[0];

  public com.sforce.soap.partner.SendEmailResult[] getResult() {
    return result;
  }

  

  public void setResult(com.sforce.soap.partner.SendEmailResult[] result) {
    this.result = result;
    result__is_set = true;
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
   
    __typeMapper.writeObject(__out, result__typeInfo, result, result__is_set);
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
    if (__typeMapper.isElement(__in, result__typeInfo)) {
      setResult((com.sforce.soap.partner.SendEmailResult[])__typeMapper.readObject(__in, result__typeInfo, com.sforce.soap.partner.SendEmailResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SendEmailResponse_element ");
    
    sb.append(" result=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(result)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}