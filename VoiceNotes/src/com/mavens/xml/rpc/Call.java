package com.mavens.xml.rpc;

//import java.rmi.RemoteException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.mavens.xml.namespace.QName;

public abstract interface Call
{
  public static final String USERNAME_PROPERTY = "com.mavens.xml.rpc.security.auth.username";
  public static final String PASSWORD_PROPERTY = "com.mavens.xml.rpc.security.auth.password";
  public static final String OPERATION_STYLE_PROPERTY = "com.mavens.xml.rpc.soap.operation.style";
  public static final String SOAPACTION_USE_PROPERTY = "com.mavens.xml.rpc.soap.http.soapaction.use";
  public static final String SOAPACTION_URI_PROPERTY = "com.mavens.xml.rpc.soap.http.soapaction.uri";
  public static final String ENCODINGSTYLE_URI_PROPERTY = "com.mavens.xml.rpc.encodingstyle.namespace.uri";
  public static final String SESSION_MAINTAIN_PROPERTY = "com.mavens.xml.rpc.session.maintain";

  public abstract boolean isParameterAndReturnSpecRequired(QName paramQName);

  public abstract void addParameter(String paramString, QName paramQName, ParameterMode paramParameterMode);

  public abstract void addParameter(String paramString, QName paramQName, Class paramClass, ParameterMode paramParameterMode);

  public abstract QName getParameterTypeByName(String paramString);

  public abstract void setReturnType(QName paramQName);

  public abstract void setReturnType(QName paramQName, Class paramClass);

  public abstract QName getReturnType();

  public abstract void removeAllParameters();

  public abstract QName getOperationName();

  public abstract void setOperationName(QName paramQName);

  public abstract QName getPortTypeName();

  public abstract void setPortTypeName(QName paramQName);

  public abstract void setTargetEndpointAddress(String paramString);

  public abstract String getTargetEndpointAddress();

  public abstract void setProperty(String paramString, Object paramObject);

  public abstract Object getProperty(String paramString);

  public abstract void removeProperty(String paramString);

  public abstract Iterator getPropertyNames();

  public abstract Object invoke(Object[] paramArrayOfObject)
    throws Exception;

  public abstract Object invoke(QName paramQName, Object[] paramArrayOfObject)
    throws Exception;

  public abstract void invokeOneWay(Object[] paramArrayOfObject);

  public abstract Map getOutputParams();

  public abstract List getOutputValues();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.Call
 * JD-Core Version:    0.5.3
 */