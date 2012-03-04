package com.company.client;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.grid.*;
import de.novanic.eventservice.client.event.Event;
import de.novanic.eventservice.client.event.RemoteEventService;
import de.novanic.eventservice.client.event.RemoteEventServiceFactory;
import de.novanic.eventservice.client.event.listener.RemoteEventListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TradeViewModule implements EntryPoint {
    private static final TradeProperties PROPS = GWT.create(TradeProperties.class);
    private final Grid<Trade> grid;

    public TradeViewModule() {
        final NumberFormat number = NumberFormat.getFormat("0.00");

        ColumnConfig<Trade, String> nameCol = new ColumnConfig<Trade, String>(PROPS.tradeName(), 50, "Trade Name");
        ColumnConfig<Trade, Double> imCol = new ColumnConfig<Trade, Double>(PROPS.im(), 75, "IM");
        ColumnConfig<Trade, Date> dateCol = new ColumnConfig<Trade, Date>(PROPS.date(), 75, "Date");
        dateCol.setCell(new DateCell(DateTimeFormat.getFormat("dd/MM/yyyy")));

        List<ColumnConfig<Trade, ?>> l = new ArrayList<ColumnConfig<Trade, ?>>();
        l.add(nameCol);
        l.add(imCol);
        l.add(dateCol);
        ColumnModel<Trade> cm = new ColumnModel<Trade>(l);

        final ListStore<Trade> store = new ListStore<Trade>(PROPS.key());
        //store.addAll(TestData.getStocks());

        grid = new Grid<Trade>(store, cm);
        grid.getView().setAutoExpandColumn(nameCol);
        grid.getView().setStripeRows(true);
        grid.getView().setColumnLines(true);
    }

    public void onModuleLoad() {
        ServerMessageGeneratorServiceAsync theServerMessageGeneratorServiceAsync = GWT.create(ServerMessageGeneratorService.class);
        theServerMessageGeneratorServiceAsync.start(new VoidAsyncCallback());

        RemoteEventService theRemoteEventService = RemoteEventServiceFactory.getInstance().getRemoteEventService();
        theRemoteEventService.addListener(ServerGeneratedMessageEvent.SERVER_MESSAGE_DOMAIN, new RemoteEventListener() {
            public void apply(Event anEvent) {
                if(anEvent instanceof ServerGeneratedMessageEvent) {
                    ServerGeneratedMessageEvent theServerGeneratedMessageEvent = (ServerGeneratedMessageEvent)anEvent;
                    Trade trade = theServerGeneratedMessageEvent.getServerGeneratedMessage();
                    ListStore<Trade> store = grid.getStore();
                    if(store.size() > 9)
                        store.remove(store.size()-1);
                    store.add(0,trade);
                }
            }
        });
        RootPanel.get().add(grid);
    }

    private class VoidAsyncCallback implements AsyncCallback<Void>
    {
        public void onFailure(Throwable aThrowable) {}

        public void onSuccess(Void aResult) {}
    }
}