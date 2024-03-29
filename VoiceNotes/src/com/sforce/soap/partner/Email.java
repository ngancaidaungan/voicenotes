package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class Email implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Email() {
  }
    
  
  /**
   * element  : bccSender of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo bccSender__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","bccSender","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean bccSender__is_set = false;

  private java.lang.Boolean bccSender;

  public java.lang.Boolean getBccSender() {
    return bccSender;
  }

  

  public void setBccSender(java.lang.Boolean bccSender) {
    this.bccSender = bccSender;
    bccSender__is_set = true;
  }
  
  /**
   * element  : emailPriority of type {urn:partner.soap.sforce.com}EmailPriority
   * java type: com.sforce.soap.partner.EmailPriority
   */
  private static final com.sforce.ws.bind.TypeInfo emailPriority__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","emailPriority","urn:partner.soap.sforce.com","EmailPriority",1,1,true);

  private boolean emailPriority__is_set = false;

  private com.sforce.soap.partner.EmailPriority emailPriority;

  public com.sforce.soap.partner.EmailPriority getEmailPriority() {
    return emailPriority;
  }

  

  public void setEmailPriority(com.sforce.soap.partner.EmailPriority emailPriority) {
    this.emailPriority = emailPriority;
    emailPriority__is_set = true;
  }
  
  /**
   * element  : replyTo of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo replyTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","replyTo","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean replyTo__is_set = false;

  private java.lang.String replyTo;

  public java.lang.String getReplyTo() {
    return replyTo;
  }

  

  public void setReplyTo(java.lang.String replyTo) {
    this.replyTo = replyTo;
    replyTo__is_set = true;
  }
  
  /**
   * element  : saveAsActivity of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo saveAsActivity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","saveAsActivity","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean saveAsActivity__is_set = false;

  private java.lang.Boolean saveAsActivity;

  public java.lang.Boolean getSaveAsActivity() {
    return saveAsActivity;
  }

  

  public void setSaveAsActivity(java.lang.Boolean saveAsActivity) {
    this.saveAsActivity = saveAsActivity;
    saveAsActivity__is_set = true;
  }
  
  /**
   * element  : senderDisplayName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo senderDisplayName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","senderDisplayName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean senderDisplayName__is_set = false;

  private java.lang.String senderDisplayName;

  public java.lang.String getSenderDisplayName() {
    return senderDisplayName;
  }

  

  public void setSenderDisplayName(java.lang.String senderDisplayName) {
    this.senderDisplayName = senderDisplayName;
    senderDisplayName__is_set = true;
  }
  
  /**
   * element  : subject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo subject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","subject","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean subject__is_set = false;

  private java.lang.String subject;

  public java.lang.String getSubject() {
    return subject;
  }

  

  public void setSubject(java.lang.String subject) {
    this.subject = subject;
    subject__is_set = true;
  }
  
  /**
   * element  : useSignature of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useSignature__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","useSignature","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean useSignature__is_set = false;

  private java.lang.Boolean useSignature;

  public java.lang.Boolean getUseSignature() {
    return useSignature;
  }

  

  public void setUseSignature(java.lang.Boolean useSignature) {
    this.useSignature = useSignature;
    useSignature__is_set = true;
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
   
    __typeMapper.writeObject(__out, bccSender__typeInfo, bccSender, bccSender__is_set);
    __typeMapper.writeObject(__out, emailPriority__typeInfo, emailPriority, emailPriority__is_set);
    __typeMapper.writeString(__out, replyTo__typeInfo, replyTo, replyTo__is_set);
    __typeMapper.writeObject(__out, saveAsActivity__typeInfo, saveAsActivity, saveAsActivity__is_set);
    __typeMapper.writeString(__out, senderDisplayName__typeInfo, senderDisplayName, senderDisplayName__is_set);
    __typeMapper.writeString(__out, subject__typeInfo, subject, subject__is_set);
    __typeMapper.writeObject(__out, useSignature__typeInfo, useSignature, useSignature__is_set);
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
    if (__typeMapper.verifyElement(__in, bccSender__typeInfo)) {
      setBccSender((java.lang.Boolean)__typeMapper.readObject(__in, bccSender__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, emailPriority__typeInfo)) {
      setEmailPriority((com.sforce.soap.partner.EmailPriority)__typeMapper.readObject(__in, emailPriority__typeInfo, com.sforce.soap.partner.EmailPriority.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, replyTo__typeInfo)) {
      setReplyTo((java.lang.String)__typeMapper.readString(__in, replyTo__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, saveAsActivity__typeInfo)) {
      setSaveAsActivity((java.lang.Boolean)__typeMapper.readObject(__in, saveAsActivity__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, senderDisplayName__typeInfo)) {
      setSenderDisplayName((java.lang.String)__typeMapper.readString(__in, senderDisplayName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, subject__typeInfo)) {
      setSubject((java.lang.String)__typeMapper.readString(__in, subject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, useSignature__typeInfo)) {
      setUseSignature((java.lang.Boolean)__typeMapper.readObject(__in, useSignature__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Email ");
    
    sb.append(" bccSender=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(bccSender)+"'\n");
    sb.append(" emailPriority=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(emailPriority)+"'\n");
    sb.append(" replyTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(replyTo)+"'\n");
    sb.append(" saveAsActivity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(saveAsActivity)+"'\n");
    sb.append(" senderDisplayName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(senderDisplayName)+"'\n");
    sb.append(" subject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(subject)+"'\n");
    sb.append(" useSignature=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useSignature)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}