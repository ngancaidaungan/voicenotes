package com.mavens.xml.rpc.handler;

import java.util.List;
import java.util.Map;

public abstract interface HandlerChain extends List
{
  public abstract boolean handleRequest(MessageContext paramMessageContext);

  public abstract boolean handleResponse(MessageContext paramMessageContext);

  public abstract boolean handleFault(MessageContext paramMessageContext);

  public abstract void init(Map paramMap);

  public abstract void destroy();

  public abstract void setRoles(String[] paramArrayOfString);

  public abstract String[] getRoles();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.HandlerChain
 * JD-Core Version:    0.5.3
 */