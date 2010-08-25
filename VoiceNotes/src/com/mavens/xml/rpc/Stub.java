package com.mavens.xml.rpc;

import java.util.Iterator;

public abstract interface Stub
{
  public static final String USERNAME_PROPERTY = "com.mavens.xml.rpc.security.auth.username";
  public static final String PASSWORD_PROPERTY = "com.mavens.xml.rpc.security.auth.password";
  public static final String ENDPOINT_ADDRESS_PROPERTY = "com.mavens.xml.rpc.service.endpoint.address";
  public static final String SESSION_MAINTAIN_PROPERTY = "com.mavens.xml.rpc.session.maintain";

  public abstract void _setProperty(String paramString, Object paramObject);

  public abstract Object _getProperty(String paramString);

  public abstract Iterator _getPropertyNames();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.Stub
 * JD-Core Version:    0.5.3
 */