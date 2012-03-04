package de.novanic.eventservice.client.event.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class EventService_Proxy extends RemoteServiceProxy implements de.novanic.eventservice.client.event.service.EventServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "de.novanic.eventservice.client.event.service.EventService";
  private static final String SERIALIZATION_POLICY ="1CAE4258D9A30A01E4926A862BB16B06";
  private static final de.novanic.eventservice.client.event.service.EventService_TypeSerializer SERIALIZER = new de.novanic.eventservice.client.event.service.EventService_TypeSerializer();
  
  public EventService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "gwteventservice", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void addEvent(de.novanic.eventservice.client.event.domain.Domain aDomain, de.novanic.eventservice.client.event.Event anEvent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "addEvent");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeString("de.novanic.eventservice.client.event.Event");
      streamWriter.writeObject(aDomain);
      streamWriter.writeObject(anEvent);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void addEventUserSpecific(de.novanic.eventservice.client.event.Event anEvent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "addEventUserSpecific");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("de.novanic.eventservice.client.event.Event");
      streamWriter.writeObject(anEvent);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void deregisterEventFilter(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "deregisterEventFilter");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getActiveListenDomains(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "getActiveListenDomains");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getEventFilter(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "getEventFilter");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void initEventService(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "initEventService");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void isUserRegistered(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "isUserRegistered");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      helper.finish(async, ResponseReader.BOOLEAN);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void listen(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "listen");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "register");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(de.novanic.eventservice.client.event.domain.Domain aDomain, de.novanic.eventservice.client.event.filter.EventFilter anEventFilter, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "register");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeString("de.novanic.eventservice.client.event.filter.EventFilter");
      streamWriter.writeObject(aDomain);
      streamWriter.writeObject(anEventFilter);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(java.util.Set aDomains, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "register");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(aDomains);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(java.util.Set aDomains, de.novanic.eventservice.client.event.filter.EventFilter anEventFilter, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "register");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeString("de.novanic.eventservice.client.event.filter.EventFilter");
      streamWriter.writeObject(aDomains);
      streamWriter.writeObject(anEventFilter);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void registerEventFilter(de.novanic.eventservice.client.event.domain.Domain aDomain, de.novanic.eventservice.client.event.filter.EventFilter anEventFilter, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "registerEventFilter");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeString("de.novanic.eventservice.client.event.filter.EventFilter");
      streamWriter.writeObject(aDomain);
      streamWriter.writeObject(anEventFilter);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void registerUnlistenEvent(de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener.Scope anUnlistenScope, de.novanic.eventservice.client.event.listener.unlisten.UnlistenEvent anUnlistenEvent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "registerUnlistenEvent");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope/4054018674");
      streamWriter.writeString("de.novanic.eventservice.client.event.listener.unlisten.UnlistenEvent");
      streamWriter.writeObject(anUnlistenScope);
      streamWriter.writeObject(anUnlistenEvent);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unlisten(com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "unlisten");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unlisten(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "unlisten");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unlisten(java.util.Set aDomains, com.google.gwt.user.client.rpc.AsyncCallback async) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("EventService_Proxy", "unlisten");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(aDomains);
      helper.finish(async, ResponseReader.VOID);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
