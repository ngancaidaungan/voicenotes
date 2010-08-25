/*     */ package com.mavens.xml.transform.stream;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
/*     */ import com.mavens.xml.transform.Source;
/*     */ 
/*     */ public class StreamSource
/*     */   implements Source
/*     */ {
/*     */   public static final String FEATURE = "http://com.mavens.xml.transform.stream.StreamSource/feature";
/*     */   private String publicId;
/*     */   private String systemId;
/*     */   private InputStream inputStream;
/*     */   private Reader reader;
/*     */ 
/*     */   public StreamSource()
/*     */   {
/*     */   }
/*     */ 
/*     */   public StreamSource(InputStream inputStream)
/*     */   {
/*  96 */     setInputStream(inputStream);
/*     */   }
/*     */ 
/*     */   public StreamSource(InputStream inputStream, String systemId)
/*     */   {
/* 113 */     setInputStream(inputStream);
/* 114 */     setSystemId(systemId);
/*     */   }
/*     */ 
/*     */   public StreamSource(Reader reader)
/*     */   {
/* 128 */     setReader(reader);
/*     */   }
/*     */ 
/*     */   public StreamSource(Reader reader, String systemId)
/*     */   {
/* 143 */     setReader(reader);
/* 144 */     setSystemId(systemId);
/*     */   }
/*     */ 
/*     */   public StreamSource(String systemId)
/*     */   {
/* 153 */     this.systemId = systemId;
/*     */   }
/*     */ 
/*     */   public StreamSource(File f)
/*     */   {
/* 162 */     setSystemId(f);
/*     */   }
/*     */ 
/*     */   public void setInputStream(InputStream inputStream)
/*     */   {
/* 178 */     this.inputStream = inputStream;
/*     */   }
/*     */ 
/*     */   public InputStream getInputStream()
/*     */   {
/* 188 */     return this.inputStream;
/*     */   }
/*     */ 
/*     */   public void setReader(Reader reader)
/*     */   {
/* 202 */     this.reader = reader;
/*     */   }
/*     */ 
/*     */   public Reader getReader()
/*     */   {
/* 212 */     return this.reader;
/*     */   }
/*     */ 
/*     */   public void setPublicId(String publicId)
/*     */   {
/* 225 */     this.publicId = publicId;
/*     */   }
/*     */ 
/*     */   public String getPublicId()
/*     */   {
/* 235 */     return this.publicId;
/*     */   }
/*     */ 
/*     */   public void setSystemId(String systemId)
/*     */   {
/* 251 */     this.systemId = systemId;
/*     */   }
/*     */ 
/*     */   public String getSystemId()
/*     */   {
/* 261 */     return this.systemId;
/*     */   }
/*     */ 
/*     */   public void setSystemId(File f)
/*     */   {
/* 270 */     String fpath = f.getAbsolutePath();
/* 271 */     if (File.separatorChar != '/') {
/* 272 */       fpath = fpath.replace(File.separatorChar, '/');
/*     */     }
/* 274 */     if (fpath.startsWith("/")) {
/* 275 */       this.systemId = "file://" + fpath;
/*     */     }
/*     */     else
/* 278 */       this.systemId = "file:///" + fpath;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.transform.stream.StreamSource
 * JD-Core Version:    0.5.3
 */