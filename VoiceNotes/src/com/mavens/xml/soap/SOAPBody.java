package com.mavens.xml.soap;

public abstract interface SOAPBody extends SOAPElement
{
  public abstract SOAPFault addFault()
    throws SOAPException;

  public abstract boolean hasFault();

  public abstract SOAPFault getFault();

  public abstract SOAPBodyElement addBodyElement(Name paramName)
    throws SOAPException;
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPBody
 * JD-Core Version:    0.5.3
 */