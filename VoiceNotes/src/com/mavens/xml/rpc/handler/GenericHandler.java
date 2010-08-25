/*     */ package com.mavens.xml.rpc.handler;
/*     */ 
/*     */ import com.mavens.xml.namespace.QName;
/*     */ 
/*     */ public abstract class GenericHandler
/*     */   implements Handler
/*     */ {
/*     */   public boolean handleRequest(MessageContext context)
/*     */   {
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean handleResponse(MessageContext context)
/*     */   {
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean handleFault(MessageContext context)
/*     */   {
/* 127 */     return true;
/*     */   }
/*     */ 
/*     */   public void init(HandlerInfo config)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void destroy()
/*     */   {
/*     */   }
/*     */ 
/*     */   public abstract QName[] getHeaders();
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.GenericHandler
 * JD-Core Version:    0.5.3
 */