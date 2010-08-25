/*    */ package com.mavens.xml.soap;
/*    */ 
/*    */ public class MimeHeader
/*    */ {
/*    */   private String name;
/*    */   private String value;
/*    */ 
/*    */   public MimeHeader(String name, String value)
/*    */   {
/* 74 */     this.name = name;
/* 75 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public String getName()
/*    */   {
/* 84 */     return this.name;
/*    */   }
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 93 */     return this.value;
/*    */   }
/*    */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.MimeHeader
 * JD-Core Version:    0.5.3
 */