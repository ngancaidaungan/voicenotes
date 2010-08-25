package com.mavens.xml.rpc.encoding;

import com.mavens.xml.namespace.QName;

public abstract interface TypeMapping
{
  public abstract String[] getSupportedEncodings();

  public abstract void setSupportedEncodings(String[] paramArrayOfString);

  public abstract boolean isRegistered(Class paramClass, QName paramQName);

  public abstract void register(Class paramClass, QName paramQName, SerializerFactory paramSerializerFactory, DeserializerFactory paramDeserializerFactory);

  public abstract SerializerFactory getSerializer(Class paramClass, QName paramQName);

  public abstract DeserializerFactory getDeserializer(Class paramClass, QName paramQName);

  public abstract void removeSerializer(Class paramClass, QName paramQName);

  public abstract void removeDeserializer(Class paramClass, QName paramQName);
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.encoding.TypeMapping
 * JD-Core Version:    0.5.3
 */