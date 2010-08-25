/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ public abstract class MessageFactory
/*     */ {
/* 203 */   static Class clz = null;
/*     */   private static final String DEFAULT_MESSAGE_FACTORY = "org.apache.axis.soap.MessageFactoryImpl";
/*     */   private static final String MESSAGE_FACTORY_PROPERTY = "com.mavens.xml.soap.MessageFactory";
/*     */ 
/*     */   public static MessageFactory newInstance()
/*     */     throws SOAPException
/*     */   {
/*     */     try
/*     */     {
/* 154 */       return ((MessageFactory)FactoryFinder.find("com.mavens.xml.soap.MessageFactory", "org.apache.axis.soap.MessageFactoryImpl"));
/*     */     }
/*     */     catch (Exception exception) {
/* 157 */       throw new SOAPException("Unable to create message factory for SOAP: " + exception.getMessage());
/*     */     }
/*     */   }
/*     */ 
/*     */   public abstract SOAPMessage createMessage()
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract SOAPMessage createMessage(MimeHeaders paramMimeHeaders, InputStream paramInputStream)
/*     */     throws IOException, SOAPException;
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.MessageFactory
 * JD-Core Version:    0.5.3
 */