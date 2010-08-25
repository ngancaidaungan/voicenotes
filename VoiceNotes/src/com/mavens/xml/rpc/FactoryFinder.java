/*     */ package com.mavens.xml.rpc;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Properties;
/*     */ 
/*     */ class FactoryFinder
/*     */ {
/*     */   private static final boolean debug = false;
/*     */ 
/*     */   private static void debugPrintln(String msg)
/*     */   {
/*     */   }
/*     */ 
/*     */   private static ClassLoader findClassLoader()
/*     */     throws FactoryFinder.ConfigurationError
/*     */   {
/*  94 */     Method m = null;
/*     */     try
/*     */     {
/*  97 */       m = Thread.class.getMethod("getContextClassLoader", null);
/*     */     }
/*     */     catch (NoSuchMethodException e) {
/* 100 */       debugPrintln("assuming JDK 1.1");
/* 101 */       return FactoryFinder.class.getClassLoader();
/*     */     }
/*     */     try
/*     */     {
/* 105 */       return ((ClassLoader)m.invoke(Thread.currentThread(), null));
/*     */     }
/*     */     catch (IllegalAccessException e) {
/* 108 */       throw new FactoryFinder.ConfigurationError("Unexpected IllegalAccessException", e);
/*     */     }
/*     */     catch (InvocationTargetException e)
/*     */     {
/* 112 */       throw new FactoryFinder.ConfigurationError("Unexpected InvocationTargetException", e);
/*     */     }
/*     */   }
/*     */ 
/*     */   private static Object newInstance(String className, ClassLoader classLoader) throws FactoryFinder.ConfigurationError
/*     */   {
/*     */     try
/*     */     {
/* 125 */       if (classLoader != null);
/*     */       try
/*     */       {
/* 127 */         return classLoader.loadClass(className).newInstance();
/*     */       }
/*     */       catch (ClassNotFoundException x)
/*     */       {
/* 132 */         return Class.forName(className).newInstance(); }
/*     */     } catch (ClassNotFoundException x) {
/* 134 */       throw new FactoryFinder.ConfigurationError("Provider " + className + " not found", x);
/*     */     }
/*     */     catch (Exception x) {
/* 137 */       throw new FactoryFinder.ConfigurationError("Provider " + className + " could not be instantiated: " + x, x);
/*     */     }
/*     */   }
/*     */ 
/*     */   static Object find(String factoryId, String fallbackClassName)
/*     */     throws FactoryFinder.ConfigurationError
/*     */   {
/* 160 */     debugPrintln("debug is on");
/*     */ 
/* 162 */     ClassLoader classLoader = findClassLoader();
/*     */     try
/*     */     {
/* 166 */       String systemProp = System.getProperty(factoryId);
/*     */ 
/* 168 */       if (systemProp != null) {
/* 169 */         debugPrintln("found system property " + systemProp);
/* 170 */         return newInstance(systemProp, classLoader);
/*     */       }
/*     */     }
/*     */     catch (SecurityException se)
/*     */     {
/*     */     }
/*     */     try {
/* 177 */       String javah = System.getProperty("java.home");
/* 178 */       String configFile = javah + File.separator + "lib" + File.separator + "jaxrpc.properties";
/*     */ 
/* 180 */       File f = new File(configFile);
/* 181 */       if (f.exists()) {
/* 182 */         Properties props = new Properties();
/* 183 */         props.load(new FileInputStream(f));
/* 184 */         String factoryClassName = props.getProperty(factoryId);
/* 185 */         debugPrintln("found java.home property " + factoryClassName);
/* 186 */         return newInstance(factoryClassName, classLoader);
/*     */       }
/*     */     }
/*     */     catch (Exception ex)
/*     */     {
/*     */     }
/* 192 */     String serviceId = "META-INF/services/" + factoryId;
/*     */     try
/*     */     {
/* 195 */       InputStream is = null;
/* 196 */       if (classLoader == null)
/* 197 */         is = ClassLoader.getSystemResourceAsStream(serviceId);
/*     */       else {
/* 199 */         is = classLoader.getResourceAsStream(serviceId);
/*     */       }
/*     */ 
/* 202 */       if (is != null)
/*     */       {
/* 203 */         debugPrintln("found " + serviceId);
/*     */         BufferedReader rd;
/*     */         try
/*     */         {
/* 223 */           rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
/*     */         } catch (UnsupportedEncodingException e) {
/* 225 */           rd = new BufferedReader(new InputStreamReader(is));
/*     */         }
/*     */ 
/* 228 */         String factoryClassName = rd.readLine();
/* 229 */         rd.close();
/*     */ 
/* 231 */         if ((factoryClassName != null) && (!("".equals(factoryClassName))))
/*     */         {
/* 233 */           debugPrintln("loaded from services: " + factoryClassName);
/* 234 */           return newInstance(factoryClassName, classLoader);
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception ex)
/*     */     {
/*     */     }
/* 241 */     if (fallbackClassName == null) {
/* 242 */       throw new FactoryFinder.ConfigurationError("Provider for " + factoryId + " cannot be found", null);
/*     */     }
/*     */ 
/* 246 */     debugPrintln("loaded from fallback value: " + fallbackClassName);
/* 247 */     return newInstance(fallbackClassName, classLoader);
/*     */   }
/*     */ 
/*     */   static class ConfigurationError extends Error
/*     */   {
/*     */     private Exception exception;
/*     */ 
/*     */     ConfigurationError(String msg, Exception x)
/*     */     {
/* 258 */       super(msg);
/* 259 */       this.exception = x;
/*     */     }
/*     */ 
/*     */     Exception getException() {
/* 263 */       return this.exception;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.FactoryFinder
 * JD-Core Version:    0.5.3
 */