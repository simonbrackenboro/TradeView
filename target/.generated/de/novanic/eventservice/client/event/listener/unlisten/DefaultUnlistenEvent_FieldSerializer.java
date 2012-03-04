package de.novanic.eventservice.client.event.listener.unlisten;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DefaultUnlistenEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getIsLocal(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "isLocal");
  }
  
  private static void setIsLocal(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, boolean value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "isLocal", value);
  }
  
  private static boolean getIsTimeout(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "isTimeout");
  }
  
  private static void setIsTimeout(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, boolean value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "isTimeout", value);
  }
  
  private static java.util.Set getMyDomains(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) {
    return (java.util.Set) ReflectionHelper.getField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "myDomains");
  }
  
  private static void setMyDomains(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, java.util.Set value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "myDomains", value);
  }
  
  private static java.lang.String getMyUserId(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) {
    return (java.lang.String) ReflectionHelper.getField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "myUserId");
  }
  
  private static void setMyUserId(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, java.lang.String value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent.class, instance, "myUserId", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) throws SerializationException {
    setIsLocal(instance, streamReader.readBoolean());
    setIsTimeout(instance, streamReader.readBoolean());
    setMyDomains(instance, (java.util.Set) streamReader.readObject());
    setMyUserId(instance, streamReader.readString());
    
  }
  
  public static de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) throws SerializationException {
    streamWriter.writeBoolean(getIsLocal(instance));
    streamWriter.writeBoolean(getIsTimeout(instance));
    streamWriter.writeObject(getMyDomains(instance));
    streamWriter.writeString(getMyUserId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer.deserialize(reader, (de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer.serialize(writer, (de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent)object);
  }
  
}
