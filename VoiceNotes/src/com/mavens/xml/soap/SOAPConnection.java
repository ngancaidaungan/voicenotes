package com.mavens.xml.soap;

public abstract class SOAPConnection
{
  public abstract SOAPMessage call(SOAPMessage paramSOAPMessage, Object paramObject)
    throws SOAPException;

  public abstract void close()
    throws SOAPException;
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPConnection
 * JD-Core Version:    0.5.3
 */