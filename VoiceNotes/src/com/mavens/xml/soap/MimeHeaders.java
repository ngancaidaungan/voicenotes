/*     */ package com.mavens.xml.soap;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class MimeHeaders
/*     */ {
/*     */   private Vector headers;
/*     */ 
/*     */   public MimeHeaders()
/*     */   {
/* 184 */     this.headers = new Vector();
/*     */   }
/*     */ 
/*     */   public String[] getHeader(String name)
/*     */   {
/* 198 */     Vector vector = new Vector();
/*     */ 
/* 200 */     for (int i = 0; i < this.headers.size(); ++i) {
/* 201 */       MimeHeader mimeheader = (MimeHeader)this.headers.elementAt(i);
/*     */ 
/* 203 */       if ((!(mimeheader.getName().equalsIgnoreCase(name))) || (mimeheader.getValue() == null))
/*     */         continue;
/* 205 */       vector.addElement(mimeheader.getValue());
/*     */     }
/*     */ 
/* 209 */     if (vector.size() == 0) {
/* 210 */       return null;
/*     */     }
/* 212 */     String[] as = new String[vector.size()];
/*     */ 
/* 214 */     vector.copyInto(as);
/*     */ 
/* 216 */     return as;
/*     */   }
/*     */ 
/*     */   public void setHeader(String name, String value)
/*     */   {
/* 239 */     boolean flag = false;
/*     */ 
/* 241 */     if ((name == null) || (name.equals(""))) {
/* 242 */       throw new IllegalArgumentException("Illegal MimeHeader name");
/*     */     }
/*     */ 
/* 246 */     for (int i = 0; i < this.headers.size(); ++i) {
/* 247 */       MimeHeader mimeheader = (MimeHeader)this.headers.elementAt(i);
/*     */ 
/* 249 */       if (mimeheader.getName().equalsIgnoreCase(name)) {
/* 250 */         if (!(flag)) {
/* 251 */           this.headers.setElementAt(new MimeHeader(mimeheader.getName(), value), i);
/*     */ 
/* 254 */           flag = true;
/*     */         } else {
/* 256 */           this.headers.removeElementAt(i--);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 261 */     if (!(flag))
/* 262 */       addHeader(name, value);
/*     */   }
/*     */ 
/*     */   public void addHeader(String name, String value)
/*     */   {
/* 283 */     if ((name == null) || (name.equals(""))) {
/* 284 */       throw new IllegalArgumentException("Illegal MimeHeader name");
/*     */     }
/*     */ 
/* 288 */     int i = this.headers.size();
/*     */ 
/* 290 */     for (int j = i - 1; j >= 0; --j) {
/* 291 */       MimeHeader mimeheader = (MimeHeader)this.headers.elementAt(j);
/*     */ 
/* 293 */       if (mimeheader.getName().equalsIgnoreCase(name)) {
/* 294 */         this.headers.insertElementAt(new MimeHeader(name, value), j + 1);
/*     */ 
/* 296 */         return;
/*     */       }
/*     */     }
/*     */ 
/* 300 */     this.headers.addElement(new MimeHeader(name, value));
/*     */   }
/*     */ 
/*     */   public void removeHeader(String name)
/*     */   {
/* 311 */     for (int i = 0; i < this.headers.size(); ++i) {
/* 312 */       MimeHeader mimeheader = (MimeHeader)this.headers.elementAt(i);
/*     */ 
/* 314 */       if (mimeheader.getName().equalsIgnoreCase(name))
/* 315 */         this.headers.removeElementAt(i--);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void removeAllHeaders()
/*     */   {
/* 325 */     this.headers.removeAllElements();
/*     */   }
/*     */ 
/*     */   public Iterator getAllHeaders()
/*     */   {
/* 336 */     return this.headers.iterator();
/*     */   }
/*     */ 
/*     */   public Iterator getMatchingHeaders(String[] names)
/*     */   {
/* 349 */     return new MatchingIterator(names, true);
/*     */   }
/*     */ 
/*     */   public Iterator getNonMatchingHeaders(String[] names)
/*     */   {
/* 362 */     return new MatchingIterator(names, false);
/*     */   }
/*     */ 
/*     */   class MatchingIterator
/*     */     implements Iterator
/*     */   {
/*     */     private boolean match;
/*     */     private Iterator iterator;
/*     */     private String[] names;
/*     */     private Object nextHeader;
/*     */ 
/*     */     private Object nextMatch()
/*     */     {
/*  85 */       while (this.iterator.hasNext()) {
/*  86 */         MimeHeader mimeheader = (MimeHeader)this.iterator.next();
/*     */ 
/*  88 */         if (this.names == null) {
/*  89 */           return ((this.match) ? null : mimeheader);
/*     */         }
/*     */ 
/*  94 */         for (int i = 0; i < this.names.length; ++i) {
/*  95 */           if (!(mimeheader.getName().equalsIgnoreCase(this.names[i]))) {
/*     */             continue;
/*     */           }
/*     */ 
/*  99 */           if (!(this.match)) break;
/* 100 */           return mimeheader;
/*     */         }
/*     */ 
/* 106 */         label90: if (!(this.match)) {
/* 107 */           return mimeheader;
/*     */         }
/*     */       }
/*     */ 
/* 111 */       return null;
/*     */     }
/*     */ 
/*     */     public boolean hasNext()
/*     */     {
/* 120 */       if (this.nextHeader == null) {
/* 121 */         this.nextHeader = nextMatch();
/*     */       }
/*     */ 
/* 124 */       return (this.nextHeader != null);
/*     */     }
/*     */ 
/*     */     public Object next()
/*     */     {
/* 133 */       if (this.nextHeader != null) {
/* 134 */         Object obj = this.nextHeader;
/*     */ 
/* 136 */         this.nextHeader = null;
/*     */ 
/* 138 */         return obj;
/*     */       }
/*     */ 
/* 141 */       if (hasNext()) {
/* 142 */         return this.nextHeader;
/*     */       }
/* 144 */       return null;
/*     */     }
/*     */ 
/*     */     public void remove()
/*     */     {
/* 150 */       this.iterator.remove();
/*     */     }
/*     */ 
/*     */     MatchingIterator(String[] as, boolean flag)
/*     */     {
/* 172 */       this.match = flag;
/* 173 */       this.names = as;
/* 174 */       this.iterator = MimeHeaders.this.headers.iterator();
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.MimeHeaders
 * JD-Core Version:    0.5.3
 */