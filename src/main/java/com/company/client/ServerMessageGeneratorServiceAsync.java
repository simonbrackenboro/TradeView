package com.company.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ServerMessageGeneratorServiceAsync
{
    void start(AsyncCallback<Void> anAsyncCallback);
}