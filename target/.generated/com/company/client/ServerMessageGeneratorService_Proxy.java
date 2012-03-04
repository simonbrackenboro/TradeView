package com.company.client;

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

public class ServerMessageGeneratorService_Proxy extends RemoteServiceProxy implements com.company.client.ServerMessageGeneratorServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.company.client.ServerMessageGeneratorService";
  private static final String SERIALIZATION_POLICY ="53DA653F0DD3789DBD6CB4E55CD1871F";
  private static final com.company.client.ServerMessageGeneratorService_TypeSerializer SERIALIZER = new com.company.client.ServerMessageGeneratorService_TypeSerializer();
  
  public ServerMessageGeneratorService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "ServerMessageGeneratorService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void start(com.google.gwt.user.client.rpc.AsyncCallback anAsyncCallback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ServerMessageGeneratorService_Proxy", "start");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(anAsyncCallback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      anAsyncCallback.onFailure(ex);
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
