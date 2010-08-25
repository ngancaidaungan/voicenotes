/*     */ package com.mavens.xml.rpc;
/*     */ 
/*     */ public class ServiceException extends Exception
/*     */ {
/*     */   Throwable cause;
/*     */ 
/*     */   public ServiceException()
/*     */   {
/*     */   }
/*     */ 
/*     */   public ServiceException(String message)
/*     */   {
/*  84 */     super(message);
/*     */   }
/*     */ 
/*     */   public ServiceException(String message, Throwable cause)
/*     */   {
/*  99 */     super(message);
/*     */ 
/* 101 */     this.cause = cause;
/*     */   }
/*     */ 
/*     */   public ServiceException(Throwable cause)
/*     */   {
/* 117 */     this.cause = cause;
/*     */   }
/*     */ 
/*     */   public Throwable getLinkedCause()
/*     */   {
/* 127 */     return this.cause;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.ServiceException
 * JD-Core Version:    0.5.3
 */