package com.mavens.xml.rpc.handler;

import com.mavens.xml.namespace.QName;

public abstract interface Handler
{
  public abstract boolean handleRequest(MessageContext paramMessageContext);

  public abstract boolean handleResponse(MessageContext paramMessageContext);

  public abstract boolean handleFault(MessageContext paramMessageContext);

  public abstract void init(HandlerInfo paramHandlerInfo);

  public abstract void destroy();

  public abstract QName[] getHeaders();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.Handler
 * JD-Core Version:    0.5.3
 */