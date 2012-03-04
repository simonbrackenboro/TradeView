package com.company.server;

import com.company.client.ServerGeneratedMessageEvent;
import com.company.client.ServerMessageGeneratorService;
import com.company.client.Trade;
import de.novanic.eventservice.client.event.Event;
import de.novanic.eventservice.service.RemoteEventServiceServlet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class ServerMessageGeneratorServiceImpl extends RemoteEventServiceServlet implements ServerMessageGeneratorService
{
    private static Timer myEventGeneratorTimer;

    public synchronized void start() {
        if(myEventGeneratorTimer == null) {
            myEventGeneratorTimer = new Timer();
            myEventGeneratorTimer.schedule(new ServerMessageGeneratorTimerTask(), 0, 500);
        }
    }

    private class ServerMessageGeneratorTimerTask extends TimerTask
    {
        int i=0;
        
        public void run() {
            UUID uuid = UUID.randomUUID();
            Trade trade = new Trade("Trade " + String.valueOf(++i), Math.random() * 100);
            Event theEvent = new ServerGeneratedMessageEvent(trade);
            //add the event, so clients can receive it
            addEvent(ServerGeneratedMessageEvent.SERVER_MESSAGE_DOMAIN, theEvent);
        }
    }

    private static String getCurrentTimeFormatted() {
        SimpleDateFormat theDateFormat = new SimpleDateFormat("HH:mm:ss");
        return theDateFormat.format(Calendar.getInstance().getTime());
    }
}