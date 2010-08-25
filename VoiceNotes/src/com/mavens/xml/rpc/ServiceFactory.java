/*     */ package com.mavens.xml.rpc;
/*     */ 
/*     */ import java.net.URL;
/*     */ import com.mavens.xml.namespace.QName;
/*     */ 
/*     */ public abstract class ServiceFactory
/*     */ {
/*     */   public static final String SERVICEFACTORY_PROPERTY = "com.mavens.xml.rpc.ServiceFactory";
/*     */ 
/*     */   public static ServiceFactory newInstance()
/*     */     throws ServiceException
/*     */   {
/*     */     try
/*     */     {
/* 102 */       return ((ServiceFactory)FactoryFinder.find("com.mavens.xml.rpc.ServiceFactory", "org.apache.axis.client.ServiceFactory"));
/*     */     }
/*     */     catch (FactoryFinder.ConfigurationError e)
/*     */     {
/* 108 */       throw new ServiceException(e.getException());
/*     */     }
/*     */   }
/*     */ 
/*     */   public abstract Service createService(URL paramURL, QName paramQName)
/*     */     throws ServiceException;
/*     */ 
/*     */   public abstract Service createService(QName paramQName)
/*     */     throws ServiceException;
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.ServiceFactory
 * JD-Core Version:    0.5.3
 */