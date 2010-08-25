/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.Properties;
/*     */ 
/*     */ class FactoryFinder
/*     */ {
/*     */   private static Object newInstance(String factoryClassName, ClassLoader classloader)
/*     */     throws SOAPException
/*     */   {
/*     */     try
/*     */     {
/*     */       Class factory;
/*  92 */       if (classloader == null)
/*  93 */         factory = Class.forName(factoryClassName);
/*     */       else {
/*  95 */         factory = classloader.loadClass(factoryClassName);
/*     */       }
/*     */ 
/*  98 */       return factory.newInstance();
/*     */     } catch (ClassNotFoundException classnotfoundexception) {
/* 100 */       throw new SOAPException("Provider " + factoryClassName + " not found", classnotfoundexception);
/*     */     }
/*     */     catch (Exception exception) {
/* 103 */       throw new SOAPException("Provider " + factoryClassName + " could not be instantiated: " + exception, exception);
/*     */     }
/*     */   }
/*     */ 
/*     */   static Object find(String factoryPropertyName, String defaultFactoryClassName)
/*     */     throws SOAPException
/*     */   {
/*     */     ClassLoader classloader;
/*     */     try
/*     */     {
/* 126 */       classloader = Thread.currentThread().getContextClassLoader();
/*     */     } catch (Exception exception) {
/* 128 */       throw new SOAPException(exception.toString(), exception);
/*     */     }
/*     */     try
/*     */     {
/* 132 */       String factoryClassName = System.getProperty(factoryPropertyName);
/*     */ 
/* 134 */       if (factoryClassName != null)
/* 135 */         return newInstance(factoryClassName, classloader);
/*     */     }
/*     */     catch (SecurityException securityexception) {
/*     */     }
/*     */     try {
/* 140 */       String propertiesFileName = System.getProperty("java.home") + File.separator + "lib" + File.separator + "jaxm.properties";
/*     */ 
/* 143 */       File file = new File(propertiesFileName);
/*     */ 
/* 145 */       if (file.exists()) {
/* 146 */         FileInputStream fileInput = new FileInputStream(file);
/* 147 */         Properties properties = new Properties();
/*     */ 
/* 149 */         properties.load(fileInput);
/* 150 */         fileInput.close();
/*     */ 
/* 152 */         String factoryClassName = properties.getProperty(factoryPropertyName);
/*     */ 
/* 155 */         return newInstance(factoryClassName, classloader);
/*     */       }
/*     */     } catch (Exception exception1) {
/*     */     }
/* 159 */     String factoryResource = "META-INF/services/" + factoryPropertyName;
/*     */     try
/*     */     {
/* 162 */       InputStream inputstream = null;
/*     */ 
/* 164 */       if (classloader == null) {
/* 165 */         inputstream = ClassLoader.getSystemResourceAsStream(factoryResource);
/*     */       }
/*     */       else {
/* 168 */         inputstream = classloader.getResourceAsStream(factoryResource);
/*     */       }
/*     */ 
/* 171 */       if (inputstream != null) {
/* 172 */         BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
/*     */ 
/* 175 */         String factoryClassName = bufferedreader.readLine();
/*     */ 
/* 177 */         bufferedreader.close();
/*     */ 
/* 179 */         if ((factoryClassName != null) && (!("".equals(factoryClassName))))
/* 180 */           return newInstance(factoryClassName, classloader);
/*     */       }
/*     */     }
/*     */     catch (Exception exception2) {
/*     */     }
/* 185 */     if (defaultFactoryClassName == null) {
/* 186 */       throw new SOAPException("Provider for " + factoryPropertyName + " cannot be found", null);
/*     */     }
/*     */ 
/* 189 */     return newInstance(defaultFactoryClassName, classloader);
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.FactoryFinder
 * JD-Core Version:    0.5.3
 */