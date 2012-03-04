package com.company.client;

import de.novanic.eventservice.client.event.Event;
import de.novanic.eventservice.client.event.domain.Domain;
import de.novanic.eventservice.client.event.domain.DomainFactory;

public class ServerGeneratedMessageEvent implements Event
{
    public static final Domain SERVER_MESSAGE_DOMAIN = DomainFactory.getDomain("server_message_domain");

    private Trade myServerGeneratedMessage;

    /**
     * Needed for serialization
     */
    public ServerGeneratedMessageEvent() {}

    public ServerGeneratedMessageEvent(Trade aServerGeneratedMessage) {
        myServerGeneratedMessage = aServerGeneratedMessage;
    }

    public Trade getServerGeneratedMessage() {
        return myServerGeneratedMessage;
    }

    public String toString() {
        StringBuilder theStringBuilder = new StringBuilder(100);
        theStringBuilder.append(ServerGeneratedMessageEvent.class.getName());
        theStringBuilder.append(new char[] {' ', '('});
        theStringBuilder.append(myServerGeneratedMessage);
        theStringBuilder.append(')');
        return theStringBuilder.toString();
    }
}