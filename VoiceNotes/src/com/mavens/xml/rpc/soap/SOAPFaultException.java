/*     */ package com.mavens.xml.rpc.soap;
/*     */ 
/*     */ import com.mavens.xml.namespace.QName;
/*     */ import com.mavens.xml.soap.Detail;
/*     */ 
/*     */ public class SOAPFaultException extends RuntimeException
/*     */ {
/*     */   private QName faultcode;
/*     */   private String faultstring;
/*     */   private String faultactor;
/*     */   private Detail detail;
/*     */ 
/*     */   public SOAPFaultException(QName faultcode, String faultstring, String faultactor, Detail detail)
/*     */   {
/*  93 */     super(faultstring);
/*     */ 
/*  95 */     this.faultcode = faultcode;
/*  96 */     this.faultstring = faultstring;
/*  97 */     this.faultactor = faultactor;
/*  98 */     this.detail = detail;
/*     */   }
/*     */ 
/*     */   public QName getFaultCode()
/*     */   {
/* 108 */     return this.faultcode;
/*     */   }
/*     */ 
/*     */   public String getFaultString()
/*     */   {
/* 117 */     return this.faultstring;
/*     */   }
/*     */ 
/*     */   public String getFaultActor()
/*     */   {
/* 126 */     return this.faultactor;
/*     */   }
/*     */ 
/*     */   public Detail getDetail()
/*     */   {
/* 135 */     return this.detail;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.soap.SOAPFaultException
 * JD-Core Version:    0.5.3
 */