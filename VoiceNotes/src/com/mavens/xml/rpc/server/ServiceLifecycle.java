package com.mavens.xml.rpc.server;

import com.mavens.xml.rpc.ServiceException;

public abstract interface ServiceLifecycle
{
  public abstract void init(Object paramObject)
    throws ServiceException;

  public abstract void destroy();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.server.ServiceLifecycle
 * JD-Core Version:    0.5.3
 */