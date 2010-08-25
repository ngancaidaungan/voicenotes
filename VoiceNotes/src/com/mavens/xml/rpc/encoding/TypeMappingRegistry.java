package com.mavens.xml.rpc.encoding;

import java.io.Serializable;

public abstract interface TypeMappingRegistry extends Serializable
{
  public abstract TypeMapping register(String paramString, TypeMapping paramTypeMapping);

  public abstract void registerDefault(TypeMapping paramTypeMapping);

  public abstract TypeMapping getDefaultTypeMapping();

  public abstract String[] getRegisteredEncodingStyleURIs();

  public abstract TypeMapping getTypeMapping(String paramString);

  public abstract TypeMapping createTypeMapping();

  public abstract TypeMapping unregisterTypeMapping(String paramString);

  public abstract boolean removeTypeMapping(TypeMapping paramTypeMapping);

  public abstract void clear();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.encoding.TypeMappingRegistry
 * JD-Core Version:    0.5.3
 */