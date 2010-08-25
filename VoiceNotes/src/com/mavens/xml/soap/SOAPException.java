/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ public class SOAPException extends Exception
/*     */ {
/*     */   private Throwable cause;
/*     */ 
/*     */   public SOAPException()
/*     */   {
/*  80 */     this.cause = null;
/*     */   }
/*     */ 
/*     */   public SOAPException(String reason)
/*     */   {
/*  92 */     super(reason);
/*     */ 
/*  94 */     this.cause = null;
/*     */   }
/*     */ 
/*     */   public SOAPException(String reason, Throwable cause)
/*     */   {
/* 110 */     super(reason);
/*     */ 
/* 112 */     initCause(cause);
/*     */   }
/*     */ 
/*     */   public SOAPException(Throwable cause)
/*     */   {
/* 125 */     super(cause.toString());
/*     */ 
/* 127 */     initCause(cause);
/*     */   }
/*     */ 
/*     */   public String getMessage()
/*     */   {
/* 146 */     String s = super.getMessage();
/*     */ 
/* 148 */     if ((s == null) && (this.cause != null)) {
/* 149 */       return this.cause.getMessage();
/*     */     }
/* 151 */     return s;
/*     */   }
/*     */ 
/*     */   public Throwable getCause()
/*     */   {
/* 163 */     return this.cause;
/*     */   }
/*     */ 
/*     */   public synchronized Throwable initCause(Throwable cause)
/*     */   {
/* 202 */     if (this.cause != null) {
/* 203 */       throw new IllegalStateException("Can't override cause");
/*     */     }
/*     */ 
/* 206 */     if (cause == this) {
/* 207 */       throw new IllegalArgumentException("Self-causation not permitted");
/*     */     }
/* 209 */     this.cause = cause;
/*     */ 
/* 211 */     return this;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPException
 * JD-Core Version:    0.5.3
 */