/*     */ package com.mavens.xml.transform.sax;
/*     */ 
/*     */ import com.mavens.xml.transform.Source;
/*     */ import com.mavens.xml.transform.stream.StreamSource;
/*     */ import org.xml.sax.InputSource;
/*     */ import org.xml.sax.XMLReader;
/*     */ 
/*     */ public class SAXSource
/*     */   implements Source
/*     */ {
/*     */   public static final String FEATURE = "http://com.mavens.xml.transform.sax.SAXSource/feature";
/*     */   private XMLReader reader;
/*     */   private InputSource inputSource;
/*     */ 
/*     */   public SAXSource()
/*     */   {
/*     */   }
/*     */ 
/*     */   public SAXSource(XMLReader reader, InputSource inputSource)
/*     */   {
/*  96 */     this.reader = reader;
/*  97 */     this.inputSource = inputSource;
/*     */   }
/*     */ 
/*     */   public SAXSource(InputSource inputSource)
/*     */   {
/* 113 */     this.inputSource = inputSource;
/*     */   }
/*     */ 
/*     */   public void setXMLReader(XMLReader reader)
/*     */   {
/* 122 */     this.reader = reader;
/*     */   }
/*     */ 
/*     */   public XMLReader getXMLReader()
/*     */   {
/* 131 */     return this.reader;
/*     */   }
/*     */ 
/*     */   public void setInputSource(InputSource inputSource)
/*     */   {
/* 140 */     this.inputSource = inputSource;
/*     */   }
/*     */ 
/*     */   public InputSource getInputSource()
/*     */   {
/* 149 */     return this.inputSource;
/*     */   }
/*     */ 
/*     */   public void setSystemId(String systemId)
/*     */   {
/* 168 */     if (null == this.inputSource)
/* 169 */       this.inputSource = new InputSource(systemId);
/*     */     else
/* 171 */       this.inputSource.setSystemId(systemId);
/*     */   }
/*     */ 
/*     */   public String getSystemId()
/*     */   {
/* 183 */     return ((null != this.inputSource) ? this.inputSource.getSystemId() : null);
/*     */   }
/*     */ 
/*     */   public static InputSource sourceToInputSource(Source source)
/*     */   {
/* 204 */     if (source instanceof SAXSource)
/* 205 */       return ((SAXSource)source).getInputSource();
/* 206 */     if (source instanceof StreamSource) {
/* 207 */       StreamSource ss = (StreamSource)source;
/* 208 */       InputSource isource = new InputSource(ss.getSystemId());
/*     */ 
/* 210 */       isource.setByteStream(ss.getInputStream());
/* 211 */       isource.setCharacterStream(ss.getReader());
/* 212 */       isource.setPublicId(ss.getPublicId());
/*     */ 
/* 214 */       return isource;
/*     */     }
/* 216 */     return null;
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.transform.sax.SAXSource
 * JD-Core Version:    0.5.3
 */