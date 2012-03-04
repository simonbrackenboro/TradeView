package com.company.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ServerGeneratedMessageEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.company.client.Trade getMyServerGeneratedMessage(com.company.client.ServerGeneratedMessageEvent instance) {
    return (com.company.client.Trade) ReflectionHelper.getField(com.company.client.ServerGeneratedMessageEvent.class, instance, "myServerGeneratedMessage");
  }
  
  private static void setMyServerGeneratedMessage(com.company.client.ServerGeneratedMessageEvent instance, com.company.client.Trade value) 
  {
    ReflectionHelper.setField(com.company.client.ServerGeneratedMessageEvent.class, instance, "myServerGeneratedMessage", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.company.client.ServerGeneratedMessageEvent instance) throws SerializationException {
    setMyServerGeneratedMessage(instance, (com.company.client.Trade) streamReader.readObject());
    
  }
  
  public static com.company.client.ServerGeneratedMessageEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.company.client.ServerGeneratedMessageEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.company.client.ServerGeneratedMessageEvent instance) throws SerializationException {
    streamWriter.writeObject(getMyServerGeneratedMessage(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.company.client.ServerGeneratedMessageEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.company.client.ServerGeneratedMessageEvent_FieldSerializer.deserialize(reader, (com.company.client.ServerGeneratedMessageEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.company.client.ServerGeneratedMessageEvent_FieldSerializer.serialize(writer, (com.company.client.ServerGeneratedMessageEvent)object);
  }
  
}
