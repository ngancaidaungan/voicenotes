/*     */ package com.mavens.xml.transform.dom;
/*     */ 
/*     */ import com.mavens.xml.transform.Source;
/*     */ import org.w3c.dom.Node;
/*     */ 
/*     */ public class DOMSource
/*     */   implements Source
/*     */ {
/*     */   public static final String FEATURE = "http://com.mavens.xml.transform.dom.DOMSource/feature";
/*     */   private Node node;
/*     */   String baseID;
/*     */ 
/*     */   public DOMSource()
/*     */   {
/*     */   }
/*     */ 
/*     */   public DOMSource(Node n)
/*     */   {
/*  94 */     setNode(n);
/*     */   }
/*     */ 
/*     */   public DOMSource(Node node, String systemID)
/*     */   {
/* 105 */     setNode(node);
/* 106 */     setSystemId(systemID);
/*     */   }
/*     */ 
/*     */   public void setNode(Node node)
/*     */   {
/* 115 */     this.node = node;
/*     */   }
/*     */ 
/*     */   public Node getNode()
/*     */   {
/* 124 */     return this.node;
/*     */   }
/*     */ 
/*     */   public void setSystemId(String baseID)
/*     */   {
/* 134 */     this.baseID = baseID;
/*     */   }
/*     */ 
/*     */   public String getSystemId()
/*     */   {
/* 144 */     return this.baseID;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.transform.dom.DOMSource
 * JD-Core Version:    0.5.3
 */