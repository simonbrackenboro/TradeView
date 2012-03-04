package com.company.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Trade_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.Date getDate(com.company.client.Trade instance) {
    return (java.util.Date) ReflectionHelper.getField(com.company.client.Trade.class, instance, "date");
  }
  
  private static void setDate(com.company.client.Trade instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.company.client.Trade.class, instance, "date", value);
  }
  
  private static double getIm(com.company.client.Trade instance) {
    return (java.lang.Double) ReflectionHelper.getField(com.company.client.Trade.class, instance, "im");
  }
  
  private static void setIm(com.company.client.Trade instance, double value) 
  {
    ReflectionHelper.setField(com.company.client.Trade.class, instance, "im", value);
  }
  
  private static java.lang.String getTradeName(com.company.client.Trade instance) {
    return (java.lang.String) ReflectionHelper.getField(com.company.client.Trade.class, instance, "tradeName");
  }
  
  private static void setTradeName(com.company.client.Trade instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.company.client.Trade.class, instance, "tradeName", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.company.client.Trade instance) throws SerializationException {
    setDate(instance, (java.util.Date) streamReader.readObject());
    setIm(instance, streamReader.readDouble());
    setTradeName(instance, streamReader.readString());
    
  }
  
  public static com.company.client.Trade instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.company.client.Trade();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.company.client.Trade instance) throws SerializationException {
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeDouble(getIm(instance));
    streamWriter.writeString(getTradeName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.company.client.Trade_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.company.client.Trade_FieldSerializer.deserialize(reader, (com.company.client.Trade)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.company.client.Trade_FieldSerializer.serialize(writer, (com.company.client.Trade)object);
  }
  
}
