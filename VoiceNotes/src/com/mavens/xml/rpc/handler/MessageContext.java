package com.mavens.xml.rpc.handler;

import java.util.Iterator;

public abstract interface MessageContext
{
  public abstract void setProperty(String paramString, Object paramObject);

  public abstract Object getProperty(String paramString);

  public abstract void removeProperty(String paramString);

  public abstract boolean containsProperty(String paramString);

  public abstract Iterator getPropertyNames();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.MessageContext
 * JD-Core Version:    0.5.3
 */