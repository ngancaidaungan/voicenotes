package com.mavens.xml.soap;

public abstract interface Node
{
  public abstract String getValue();

  public abstract void setParentElement(SOAPElement paramSOAPElement)
    throws SOAPException;

  public abstract SOAPElement getParentElement();

  public abstract void detachNode();

  public abstract void recycleNode();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.Node
 * JD-Core Version:    0.5.3
 */