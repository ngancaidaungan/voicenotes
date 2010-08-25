/*    */ package com.mavens.xml.soap;
/*    */ 
/*    */ public abstract class SOAPConnectionFactory
/*    */ {
/*    */   private static final String DEFAULT_SOAP_CONNECTION_FACTORY = "org.apache.axis.soap.SOAPConnectionFactoryImpl";
/*    */   private static final String SF_PROPERTY = "com.mavens.xml.soap.SOAPConnectionFactory";
/*    */ 
/*    */   public static SOAPConnectionFactory newInstance()
/*    */     throws SOAPException, UnsupportedOperationException
/*    */   {
/*    */     try
/*    */     {
/* 76 */       return ((SOAPConnectionFactory)FactoryFinder.find("com.mavens.xml.soap.SOAPConnectionFactory", "org.apache.axis.soap.SOAPConnectionFactoryImpl"));
/*    */     }
/*    */     catch (Exception exception) {
/* 79 */       throw new SOAPException("Unable to create SOAP connection factory: " + exception.getMessage());
/*    */     }
/*    */   }
/*    */ 
/*    */   public abstract SOAPConnection createConnection()
/*    */     throws SOAPException;
/*    */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPConnectionFactory
 * JD-Core Version:    0.5.3
 */