package com.mavens.xml.rpc.server;

import java.security.Principal;
import com.mavens.servlet.ServletContext;
import com.mavens.servlet.http.HttpSession;
import com.mavens.xml.rpc.handler.MessageContext;

public abstract interface ServletEndpointContext
{
  public abstract MessageContext getMessageContext();

  public abstract Principal getUserPrincipal();

  public abstract HttpSession getHttpSession();

  public abstract ServletContext getServletContext();
}

/* Location:           /Users/josephferraro/Downloads/sforcedataloader.jar
 * Qualified Name:     com.mavens.xml.rpc.server.ServletEndpointContext
 * JD-Core Version:    0.5.3
 */