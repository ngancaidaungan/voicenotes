package com.mavens.xml.soap;

public abstract interface SOAPHeaderElement extends SOAPElement
{
  public abstract void setActor(String paramString);

  public abstract String getActor();

  public abstract void setMustUnderstand(boolean paramBoolean);

  public abstract boolean getMustUnderstand();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPHeaderElement
 * JD-Core Version:    0.5.3
 */