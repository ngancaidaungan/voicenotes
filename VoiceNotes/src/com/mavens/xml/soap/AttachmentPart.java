/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ //import com.mavens.activation.DataHandler;
/*     */ 
/*     */ public abstract class AttachmentPart
/*     */ {
/*     */   public abstract int getSize()
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract void clearContent();
/*     */ 
/*     */   public abstract Object getContent()
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract void setContent(Object paramObject, String paramString);
/*     */ 
			/*
			public abstract DataHandler getDataHandler()
				throws SOAPException;
			public abstract void setDataHandler(DataHandler paramDataHandler);
			*/
/*     */ 
/*     */   public String getContentId()
/*     */   {
/* 274 */     String[] as = getMimeHeader("Content-Id");
/*     */ 
/* 276 */     if (as != null) {
/* 277 */       return as[0];
/*     */     }
/* 279 */     return null;
/*     */   }
/*     */ 
/*     */   public String getContentLocation()
/*     */   {
/* 292 */     String[] as = getMimeHeader("Content-Location");
/*     */ 
/* 294 */     if (as != null) {
/* 295 */       return as[0];
/*     */     }
/* 297 */     return null;
/*     */   }
/*     */ 
/*     */   public String getContentType()
/*     */   {
/* 309 */     String[] as = getMimeHeader("Content-Type");
/*     */ 
/* 311 */     if (as != null) {
/* 312 */       return as[0];
/*     */     }
/* 314 */     return null;
/*     */   }
/*     */ 
/*     */   public void setContentId(String contentId)
/*     */   {
/* 329 */     setMimeHeader("Content-Id", contentId);
/*     */   }
/*     */ 
/*     */   public void setContentLocation(String contentLocation)
/*     */   {
/* 342 */     setMimeHeader("Content-Location", contentLocation);
/*     */   }
/*     */ 
/*     */   public void setContentType(String contentType)
/*     */   {
/* 354 */     setMimeHeader("Content-Type", contentType);
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
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.AttachmentPart
 * JD-Core Version:    0.5.3
 */