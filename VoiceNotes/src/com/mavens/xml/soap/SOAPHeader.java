package com.mavens.xml.soap;

import java.util.Iterator;

public abstract interface SOAPHeader extends SOAPElement
{
  public abstract SOAPHeaderElement addHeaderElement(Name paramName)
    throws SOAPException;

  public abstract Iterator examineHeaderElements(String paramString);

  public abstract Iterator extractHeaderElements(String paramString);
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPHeader
 * JD-Core Version:    0.5.3
 */