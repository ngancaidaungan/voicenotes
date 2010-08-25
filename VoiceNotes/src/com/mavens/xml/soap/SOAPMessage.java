/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Iterator;
/*     */ //import com.mavens.activation.DataHandler;
/*     */ 
/*     */ public abstract class SOAPMessage
/*     */ {
/*     */   public abstract String getContentDescription();
/*     */ 
/*     */   public abstract void setContentDescription(String paramString);
/*     */ 
/*     */   public abstract SOAPPart getSOAPPart();
/*     */ 
/*     */   public abstract void removeAllAttachments();
/*     */ 
/*     */   public abstract int countAttachments();
/*     */ 
/*     */   public abstract Iterator getAttachments();
/*     */ 
/*     */   public abstract Iterator getAttachments(MimeHeaders paramMimeHeaders);
/*     */ 
/*     */   public abstract void addAttachmentPart(AttachmentPart paramAttachmentPart);
/*     */ 
/*     */   public abstract AttachmentPart createAttachmentPart();
/*     */ 
			/*
			public AttachmentPart createAttachmentPart(DataHandler datahandler) {
				AttachmentPart attachmentpart = createAttachmentPart();
				attachmentpart.setDataHandler(datahandler);
			}
			*/
/*     */ 
/*     */   public abstract MimeHeaders getMimeHeaders();
/*     */ 
/*     */   public AttachmentPart createAttachmentPart(Object content, String contentType)
/*     */   {
/* 281 */     AttachmentPart attachmentpart = createAttachmentPart();
/*     */ 
/* 283 */     attachmentpart.setContent(content, contentType);
/*     */ 
/* 285 */     return attachmentpart;
/*     */   }
/*     */ 
/*     */   public abstract void saveChanges()
/*     */     throws SOAPException;
/*     */ 
/*     */   public abstract boolean saveRequired();
/*     */ 
/*     */   public abstract void writeTo(OutputStream paramOutputStream)
/*     */     throws SOAPException, IOException;
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPMessage
 * JD-Core Version:    0.5.3
 */