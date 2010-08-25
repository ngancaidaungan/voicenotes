/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ public abstract class SOAPFactory
/*     */ {
/*     */   private static final String SF_PROPERTY = "com.mavens.xml.soap.SOAPFactory";
/*     */   private static final String DEFAULT_SF = "org.apache.axis.soap.SOAPFactoryImpl";
/*     */ 
/*     */   public abstract SOAPElement createElement(Name paramName)
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract SOAPElement createElement(String paramString)
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract SOAPElement createElement(String paramString1, String paramString2, String paramString3)
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract Detail createDetail()
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract Name createName(String paramString1, String paramString2, String paramString3)
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract Name createName(String paramString)
/*     */     throws SOAPException;
/*     */ 
/*     */   public static SOAPFactory newInstance()
/*     */     throws SOAPException
/*     */   {
/*     */     try
/*     */     {
/* 176 */       return ((SOAPFactory)FactoryFinder.find("com.mavens.xml.soap.SOAPFactory", "org.apache.axis.soap.SOAPFactoryImpl"));
/*     */     } catch (Exception exception) {
/* 178 */       throw new SOAPException("Unable to create SOAP Factory: " + exception.getMessage());
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPFactory
 * JD-Core Version:    0.5.3
 */