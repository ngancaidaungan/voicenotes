/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ /** @deprecated */
/*     */ public class SOAPElementFactory
/*     */ {
/*     */   private SOAPFactory sf;
/*     */ 
/*     */   private SOAPElementFactory(SOAPFactory soapfactory)
/*     */   {
/*  79 */     this.sf = soapfactory;
/*     */   }
/*     */ 
/*     */   /** @deprecated */
/*     */   public SOAPElement create(Name name)
/*     */     throws SOAPException
/*     */   {
/*  95 */     return this.sf.createElement(name);
/*     */   }
/*     */ 
/*     */   /** @deprecated */
/*     */   public SOAPElement create(String localName)
/*     */     throws SOAPException
/*     */   {
/* 111 */     return this.sf.createElement(localName);
/*     */   }
/*     */ 
/*     */   /** @deprecated */
/*     */   public SOAPElement create(String localName, String prefix, String uri)
/*     */     throws SOAPException
/*     */   {
/* 133 */     return this.sf.createElement(localName, prefix, uri);
/*     */   }
/*     */ 
/*     */   /** @deprecated */
/*     */   public static SOAPElementFactory newInstance()
/*     */     throws SOAPException
/*     */   {
/*     */     try
/*     */     {
/* 148 */       return new SOAPElementFactory(SOAPFactory.newInstance());
/*     */     } catch (Exception exception) {
/* 150 */       throw new SOAPException("Unable to create SOAP Element Factory: " + exception.getMessage());
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPElementFactory
 * JD-Core Version:    0.5.3
 */