/*     */ package com.mavens.xml.messaging;
/*     */ 
/*     */ public class Endpoint
/*     */ {
/*     */   protected String id;
/*     */ 
/*     */   public Endpoint(String uri)
/*     */   {
/*  95 */     this.id = uri;
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 104 */     return this.id;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.messaging.Endpoint
 * JD-Core Version:    0.5.3
 */