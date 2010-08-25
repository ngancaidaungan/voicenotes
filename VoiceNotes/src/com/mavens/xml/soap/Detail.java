package com.mavens.xml.soap;

import java.util.Iterator;

public abstract interface Detail extends SOAPFaultElement
{
  public abstract DetailEntry addDetailEntry(Name paramName)
    throws SOAPException;

  public abstract Iterator getDetailEntries();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.Detail
 * JD-Core Version:    0.5.3
 */