package com.google.gwt.i18n.shared.impl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DateRecord_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAmbiguousYear(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "ambiguousYear");
  }
  
  private static void setAmbiguousYear(com.google.gwt.i18n.shared.impl.DateRecord instance, boolean value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "ambiguousYear", value);
  }
  
  private static int getAmpm(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "ampm");
  }
  
  private static void setAmpm(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "ampm", value);
  }
  
  private static int getDayOfMonth(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "dayOfMonth");
  }
  
  private static void setDayOfMonth(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "dayOfMonth", value);
  }
  
  private static int getDayOfWeek(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "dayOfWeek");
  }
  
  private static void setDayOfWeek(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "dayOfWeek", value);
  }
  
  private static int getEra(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "era");
  }
  
  private static void setEra(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "era", value);
  }
  
  private static int getHours(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "hours");
  }
  
  private static void setHours(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "hours", value);
  }
  
  private static int getMilliseconds(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "milliseconds");
  }
  
  private static void setMilliseconds(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "milliseconds", value);
  }
  
  private static int getMinutes(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "minutes");
  }
  
  private static void setMinutes(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "minutes", value);
  }
  
  private static int getMonth(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "month");
  }
  
  private static void setMonth(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "month", value);
  }
  
  private static int getSeconds(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "seconds");
  }
  
  private static void setSeconds(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "seconds", value);
  }
  
  private static int getTzOffset(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "tzOffset");
  }
  
  private static void setTzOffset(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "tzOffset", value);
  }
  
  private static int getYear(com.google.gwt.i18n.shared.impl.DateRecord instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "year");
  }
  
  private static void setYear(com.google.gwt.i18n.shared.impl.DateRecord instance, int value) 
  {
    ReflectionHelper.setField(com.google.gwt.i18n.shared.impl.DateRecord.class, instance, "year", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.i18n.shared.impl.DateRecord instance) throws SerializationException {
    setAmbiguousYear(instance, streamReader.readBoolean());
    setAmpm(instance, streamReader.readInt());
    setDayOfMonth(instance, streamReader.readInt());
    setDayOfWeek(instance, streamReader.readInt());
    setEra(instance, streamReader.readInt());
    setHours(instance, streamReader.readInt());
    setMilliseconds(instance, streamReader.readInt());
    setMinutes(instance, streamReader.readInt());
    setMonth(instance, streamReader.readInt());
    setSeconds(instance, streamReader.readInt());
    setTzOffset(instance, streamReader.readInt());
    setYear(instance, streamReader.readInt());
    
    com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.google.gwt.i18n.shared.impl.DateRecord instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.google.gwt.i18n.shared.impl.DateRecord();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.i18n.shared.impl.DateRecord instance) throws SerializationException {
    streamWriter.writeBoolean(getAmbiguousYear(instance));
    streamWriter.writeInt(getAmpm(instance));
    streamWriter.writeInt(getDayOfMonth(instance));
    streamWriter.writeInt(getDayOfWeek(instance));
    streamWriter.writeInt(getEra(instance));
    streamWriter.writeInt(getHours(instance));
    streamWriter.writeInt(getMilliseconds(instance));
    streamWriter.writeInt(getMinutes(instance));
    streamWriter.writeInt(getMonth(instance));
    streamWriter.writeInt(getSeconds(instance));
    streamWriter.writeInt(getTzOffset(instance));
    streamWriter.writeInt(getYear(instance));
    
    com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer.deserialize(reader, (com.google.gwt.i18n.shared.impl.DateRecord)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer.serialize(writer, (com.google.gwt.i18n.shared.impl.DateRecord)object);
  }
  
}
