package com.mavens.xml.rpc;

import java.net.URL;
//import java.rmi.Remote;
import java.util.Iterator;
import com.mavens.xml.namespace.QName;
import com.mavens.xml.rpc.encoding.TypeMappingRegistry;
import com.mavens.xml.rpc.handler.HandlerRegistry;

public abstract interface Service
{
	/*
  public abstract Remote getPort(QName paramQName, Class paramClass)
    throws ServiceException;

  public abstract Remote getPort(Class paramClass)
    throws ServiceException;
*/
  public abstract Call[] getCalls(QName paramQName)
    throws ServiceException;

  public abstract Call createCall(QName paramQName)
    throws ServiceException;

  public abstract Call createCall(QName paramQName1, QName paramQName2)
    throws ServiceException;

  public abstract Call createCall(QName paramQName, String paramString)
    throws ServiceException;

  public abstract Call createCall()
    throws ServiceException;

  public abstract QName getServiceName();

  public abstract Iterator getPorts()
    throws ServiceException;

  public abstract URL getWSDLDocumentLocation();

  public abstract TypeMappingRegistry getTypeMappingRegistry();

  public abstract HandlerRegistry getHandlerRegistry();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.Service
 * JD-Core Version:    0.5.3
 */