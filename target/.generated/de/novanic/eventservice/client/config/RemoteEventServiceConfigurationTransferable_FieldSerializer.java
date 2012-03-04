package de.novanic.eventservice.client.config;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RemoteEventServiceConfigurationTransferable_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getMyConnectionId(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) {
    return (java.lang.String) ReflectionHelper.getField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myConnectionId");
  }
  
  private static void setMyConnectionId(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance, java.lang.String value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myConnectionId", value);
  }
  
  private static java.lang.String getMyConnectionStrategyClientConnector(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) {
    return (java.lang.String) ReflectionHelper.getField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myConnectionStrategyClientConnector");
  }
  
  private static void setMyConnectionStrategyClientConnector(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance, java.lang.String value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myConnectionStrategyClientConnector", value);
  }
  
  private static java.lang.Integer getMyMaxWaitingTime(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) {
    return (java.lang.Integer) ReflectionHelper.getField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myMaxWaitingTime");
  }
  
  private static void setMyMaxWaitingTime(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myMaxWaitingTime", value);
  }
  
  private static java.lang.Integer getMyMinWaitingTime(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) {
    return (java.lang.Integer) ReflectionHelper.getField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myMinWaitingTime");
  }
  
  private static void setMyMinWaitingTime(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myMinWaitingTime", value);
  }
  
  private static java.lang.Integer getMyReconnectAttemptCount(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) {
    return (java.lang.Integer) ReflectionHelper.getField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myReconnectAttemptCount");
  }
  
  private static void setMyReconnectAttemptCount(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myReconnectAttemptCount", value);
  }
  
  private static java.lang.Integer getMyTimeoutTime(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) {
    return (java.lang.Integer) ReflectionHelper.getField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myTimeoutTime");
  }
  
  private static void setMyTimeoutTime(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable.class, instance, "myTimeoutTime", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) throws SerializationException {
    setMyConnectionId(instance, streamReader.readString());
    setMyConnectionStrategyClientConnector(instance, streamReader.readString());
    setMyMaxWaitingTime(instance, (java.lang.Integer) streamReader.readObject());
    setMyMinWaitingTime(instance, (java.lang.Integer) streamReader.readObject());
    setMyReconnectAttemptCount(instance, (java.lang.Integer) streamReader.readObject());
    setMyTimeoutTime(instance, (java.lang.Integer) streamReader.readObject());
    
  }
  
  public static de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable instance) throws SerializationException {
    streamWriter.writeString(getMyConnectionId(instance));
    streamWriter.writeString(getMyConnectionStrategyClientConnector(instance));
    streamWriter.writeObject(getMyMaxWaitingTime(instance));
    streamWriter.writeObject(getMyMinWaitingTime(instance));
    streamWriter.writeObject(getMyReconnectAttemptCount(instance));
    streamWriter.writeObject(getMyTimeoutTime(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable_FieldSerializer.deserialize(reader, (de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable_FieldSerializer.serialize(writer, (de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable)object);
  }
  
}
