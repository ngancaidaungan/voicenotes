package com.mavens.xml.soap;

public abstract interface SOAPFault extends SOAPBodyElement
{
  public abstract void setFaultCode(String paramString)
    throws SOAPException;

  public abstract String getFaultCode();

  public abstract void setFaultActor(String paramString)
    throws SOAPException;

  public abstract String getFaultActor();

  public abstract void setFaultString(String paramString)
    throws SOAPException;

  public abstract String getFaultString();

  public abstract Detail getDetail();

  public abstract Detail addDetail()
    throws SOAPException;
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPFault
 * JD-Core Version:    0.5.3
 */