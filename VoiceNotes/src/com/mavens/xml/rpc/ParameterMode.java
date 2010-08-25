/*    */ package com.mavens.xml.rpc;
/*    */ 
/*    */ public class ParameterMode
/*    */ {
/*    */   private final String mode;
/* 70 */   public static final ParameterMode IN = new ParameterMode("IN");
/*    */ 
/* 73 */   public static final ParameterMode INOUT = new ParameterMode("INOUT");
/*    */ 
/* 76 */   public static final ParameterMode OUT = new ParameterMode("OUT");
/*    */ 
/*    */   private ParameterMode(String mode)
/*    */   {
/* 84 */     this.mode = mode;
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return this.mode;
/*    */   }
/*    */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.ParameterMode
 * JD-Core Version:    0.5.3
 */