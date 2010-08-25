/*     */ package com.mavens.xml.rpc;
/*     */ 
/*     */ public class JAXRPCException extends RuntimeException
/*     */ {
/*     */   Throwable cause;
/*     */ 
/*     */   public JAXRPCException()
/*     */   {
/*     */   }
/*     */ 
/*     */   public JAXRPCException(String message)
/*     */   {
/*  83 */     super(message);
/*     */   }
/*     */ 
/*     */   public JAXRPCException(String message, Throwable cause)
/*     */   {
/*  97 */     super(message);
/*     */ 
/*  99 */     this.cause = cause;
/*     */   }
/*     */ 
/*     */   public JAXRPCException(Throwable cause)
/*     */   {
/* 115 */     this.cause = cause;
/*     */   }
/*     */ 
/*     */   public Throwable getLinkedCause()
/*     */   {
/* 125 */     return this.cause;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.JAXRPCException
 * JD-Core Version:    0.5.3
 */