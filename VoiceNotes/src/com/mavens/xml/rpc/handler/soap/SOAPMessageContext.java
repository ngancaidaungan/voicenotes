package com.mavens.xml.rpc.handler.soap;

import com.mavens.xml.rpc.handler.MessageContext;
import com.mavens.xml.soap.SOAPMessage;

public abstract interface SOAPMessageContext extends MessageContext
{
  public abstract SOAPMessage getMessage();

  public abstract void setMessage(SOAPMessage paramSOAPMessage);

  public abstract String[] getRoles();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.handler.soap.SOAPMessageContext
 * JD-Core Version:    0.5.3
 */