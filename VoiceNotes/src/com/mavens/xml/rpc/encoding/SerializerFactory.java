package com.mavens.xml.rpc.encoding;

import java.io.Serializable;
import java.util.Iterator;

public abstract interface SerializerFactory extends Serializable
{
  public abstract Serializer getSerializerAs(String paramString);

  public abstract Iterator getSupportedMechanismTypes();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.encoding.SerializerFactory
 * JD-Core Version:    0.5.3
 */