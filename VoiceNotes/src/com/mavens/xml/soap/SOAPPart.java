/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import com.mavens.xml.transform.Source;
/*     */ 
/*     */ public abstract class SOAPPart
/*     */ {
/*     */   public abstract SOAPEnvelope getEnvelope()
/*     */     throws SOAPException;
/*     */ 
/*     */   public String getContentId()
/*     */   {
/* 122 */     String[] as = getMimeHeader("Content-Id");
/*     */ 
/* 124 */     if (as != null) {
/* 125 */       return as[0];
/*     */     }
/* 127 */     return null;
/*     */   }
/*     */ 
/*     */   public String getContentLocation()
/*     */   {
/* 140 */     String[] as = getMimeHeader("Content-Location");
/*     */ 
/* 142 */     if (as != null) {
/* 143 */       return as[0];
/*     */     }
/* 145 */     return null;
/*     */   }
/*     */ 
/*     */   public void setContentId(String contentId)
/*     */   {
/* 159 */     setMimeHeader("Content-Id", contentId);
/*     */   }
/*     */ 
/*     */   public void setContentLocation(String contentLocation)
/*     */   {
/* 173 */     setMimeHeader("Content-Location", contentLocation);
/*     */   }
/*     */ 
/*     */   public abstract void removeMimeHeader(String paramString);
/*     */ 
/*     */   public abstract void removeAllMimeHeaders();
/*     */ 
/*     */   public abstract String[] getMimeHeader(String paramString);
/*     */ 
/*     */   public abstract void setMimeHeader(String paramString1, String paramString2);
/*     */ 
/*     */   public abstract void addMimeHeader(String paramString1, String paramString2);
/*     */ 
/*     */   public abstract Iterator getAllMimeHeaders();
/*     */ 
/*     */   public abstract Iterator getMatchingMimeHeaders(String[] paramArrayOfString);
/*     */ 
/*     */   public abstract Iterator getNonMatchingMimeHeaders(String[] paramArrayOfString);
/*     */ 
/*     */   public abstract void setContent(Source paramSource)
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract Source getContent()
/*     */     throws SOAPException;
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPPart
 * JD-Core Version:    0.5.3
 */