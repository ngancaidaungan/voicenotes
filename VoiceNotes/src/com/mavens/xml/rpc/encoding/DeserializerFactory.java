package com.mavens.xml.rpc.encoding;

import java.io.Serializable;
import java.util.Iterator;

public abstract interface DeserializerFactory extends Serializable
{
  public abstract Deserializer getDeserializerAs(String paramString);

  public abstract Iterator getSupportedMechanismTypes();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.encoding.DeserializerFactory
 * JD-Core Version:    0.5.3
 */