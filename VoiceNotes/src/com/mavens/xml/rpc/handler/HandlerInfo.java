/*     */ package com.mavens.xml.rpc.handler;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import com.mavens.xml.namespace.QName;
/*     */ 
/*     */ public class HandlerInfo
/*     */   implements Serializable
/*     */ {
/*     */   private Class handlerClass;
/*     */   private Map config;
/*     */   private QName[] headers;
/*     */ 
/*     */   public HandlerInfo()
/*     */   {
/*  75 */     this.handlerClass = null;
/*  76 */     this.config = new HashMap();
/*     */   }
/*     */ 
/*     */   public HandlerInfo(Class handlerClass, Map config, QName[] headers)
/*     */   {
/*  90 */     this.handlerClass = handlerClass;
/*  91 */     this.config = config;
/*  92 */     this.headers = headers;
/*     */   }
/*     */ 
/*     */   public void setHandlerClass(Class handlerClass)
/*     */   {
/* 100 */     this.handlerClass = handlerClass;
/*     */   }
/*     */ 
/*     */   public Class getHandlerClass()
/*     */   {
/* 109 */     return this.handlerClass;
/*     */   }
/*     */ 
/*     */   public void setHandlerConfig(Map config)
/*     */   {
/* 117 */     this.config = config;
/*     */   }
/*     */ 
/*     */   public Map getHandlerConfig()
/*     */   {
/* 126 */     return this.config;
/*     */   }
/*     */ 
/*     */   public void setHeaders(QName[] headers)
/*     */   {
/* 136 */     this.headers = headers;
/*     */   }
/*     */ 
/*     */   public QName[] getHeaders()
/*     */   {
/* 146 */     return this.headers;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.HandlerInfo
 * JD-Core Version:    0.5.3
 */