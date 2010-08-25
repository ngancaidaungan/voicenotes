package com.mavens.xml.soap;

public abstract interface SOAPEnvelope extends SOAPElement
{
  public abstract Name createName(String paramString1, String paramString2, String paramString3)
    throws SOAPException;

  public abstract Name createName(String paramString)
    throws SOAPException;

  public abstract SOAPHeader getHeader()
    throws SOAPException;

  public abstract SOAPBody getBody()
    throws SOAPException;

  public abstract SOAPHeader addHeader()
    throws SOAPException;

  public abstract SOAPBody addBody()
    throws SOAPException;
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPEnvelope
 * JD-Core Version:    0.5.3
 */