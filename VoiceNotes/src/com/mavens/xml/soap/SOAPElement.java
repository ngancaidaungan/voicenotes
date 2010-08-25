package com.mavens.xml.soap;

import java.util.Iterator;

public abstract interface SOAPElement extends Node
{
  public abstract SOAPElement addChildElement(Name paramName)
    throws SOAPException;

  public abstract SOAPElement addChildElement(String paramString)
    throws SOAPException;

  public abstract SOAPElement addChildElement(String paramString1, String paramString2)
    throws SOAPException;

  public abstract SOAPElement addChildElement(String paramString1, String paramString2, String paramString3)
    throws SOAPException;

  public abstract SOAPElement addChildElement(SOAPElement paramSOAPElement)
    throws SOAPException;

  public abstract SOAPElement addTextNode(String paramString)
    throws SOAPException;

  public abstract SOAPElement addAttribute(Name paramName, String paramString)
    throws SOAPException;

  public abstract SOAPElement addNamespaceDeclaration(String paramString1, String paramString2)
    throws SOAPException;

  public abstract String getAttributeValue(Name paramName);

  public abstract Iterator getAllAttributes();

  public abstract String getNamespaceURI(String paramString);

  public abstract Iterator getNamespacePrefixes();

  public abstract Name getElementName();

  public abstract boolean removeAttribute(Name paramName);

  public abstract boolean removeNamespaceDeclaration(String paramString);

  public abstract Iterator getChildElements();

  public abstract Iterator getChildElements(Name paramName);

  public abstract void setEncodingStyle(String paramString)
    throws SOAPException;

  public abstract String getEncodingStyle();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.soap.SOAPElement
 * JD-Core Version:    0.5.3
 */