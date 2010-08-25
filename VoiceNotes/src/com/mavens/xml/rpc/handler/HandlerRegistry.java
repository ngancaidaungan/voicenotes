package com.mavens.xml.rpc.handler;

import java.io.Serializable;
import java.util.List;
import com.mavens.xml.namespace.QName;

public abstract interface HandlerRegistry extends Serializable
{
  public abstract List getHandlerChain(QName paramQName);

  public abstract void setHandlerChain(QName paramQName, List paramList);
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.HandlerRegistry
 * JD-Core Version:    0.5.3
 */