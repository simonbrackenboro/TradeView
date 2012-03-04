package de.novanic.eventservice.client.event.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class EventService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.company.client.ServerGeneratedMessageEvent/2891248808", "com.company.client.ServerGeneratedMessageEvent_FieldSerializer");
    result.put("com.company.client.Trade/1476164624", "com.company.client.Trade_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable/85603059", "de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable_FieldSerializer");
    result.put("de.novanic.eventservice.client.event.DefaultDomainEvent/3924906731", "de.novanic.eventservice.client.event.DefaultDomainEvent_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.DefaultDomainEvent;/4107875583", "de.novanic.eventservice.client.event.DefaultDomainEvent_Array_Rank_1_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.DomainEvent;/2573218216", "de.novanic.eventservice.client.event.DomainEvent_Array_Rank_1_FieldSerializer");
    result.put("de.novanic.eventservice.client.event.domain.DefaultDomain/240262385", "de.novanic.eventservice.client.event.domain.DefaultDomain_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.filter.AppendableEventFilter;/3140808580", "de.novanic.eventservice.client.event.filter.AppendableEventFilter_Array_Rank_1_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.filter.CascadingEventFilter;/4218008474", "de.novanic.eventservice.client.event.filter.CascadingEventFilter_Array_Rank_1_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.filter.CompositeEventFilter;/3667622880", "de.novanic.eventservice.client.event.filter.CompositeEventFilter_Array_Rank_1_FieldSerializer");
    result.put("de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter/2036315829", "de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter;/2853401946", "de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_Array_Rank_1_FieldSerializer");
    result.put("de.novanic.eventservice.client.event.filter.DefaultEventFilter/3359357329", "de.novanic.eventservice.client.event.filter.DefaultEventFilter_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.filter.DefaultEventFilter;/2136978271", "de.novanic.eventservice.client.event.filter.DefaultEventFilter_Array_Rank_1_FieldSerializer");
    result.put("[Lde.novanic.eventservice.client.event.filter.EventFilter;/836210305", "de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer");
    result.put("de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent/2862324233", "de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer");
    result.put("de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope/4054018674", "de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener_Scope_FieldSerializer");
    result.put("java.lang.Boolean/476441737", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.sql.Date/730999118", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("java.sql.Time/1816797103", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("java.sql.Timestamp/3040052672", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$EmptySet/3523698179", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptySet_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.Date/3385151746", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("java.util.HashSet/3273092938", "com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer");
    result.put("java.util.LinkedHashSet/1826081506", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.TreeMap/1493889780", "com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer");
    result.put("java.util.TreeSet/4043497002", "com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.company.client.ServerGeneratedMessageEvent", "com.company.client.ServerGeneratedMessageEvent/2891248808");
    result.put("com.company.client.Trade", "com.company.client.Trade/1476164624");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable", "de.novanic.eventservice.client.config.RemoteEventServiceConfigurationTransferable/85603059");
    result.put("de.novanic.eventservice.client.event.DefaultDomainEvent", "de.novanic.eventservice.client.event.DefaultDomainEvent/3924906731");
    result.put("[Lde.novanic.eventservice.client.event.DefaultDomainEvent;", "[Lde.novanic.eventservice.client.event.DefaultDomainEvent;/4107875583");
    result.put("[Lde.novanic.eventservice.client.event.DomainEvent;", "[Lde.novanic.eventservice.client.event.DomainEvent;/2573218216");
    result.put("de.novanic.eventservice.client.event.domain.DefaultDomain", "de.novanic.eventservice.client.event.domain.DefaultDomain/240262385");
    result.put("[Lde.novanic.eventservice.client.event.filter.AppendableEventFilter;", "[Lde.novanic.eventservice.client.event.filter.AppendableEventFilter;/3140808580");
    result.put("[Lde.novanic.eventservice.client.event.filter.CascadingEventFilter;", "[Lde.novanic.eventservice.client.event.filter.CascadingEventFilter;/4218008474");
    result.put("[Lde.novanic.eventservice.client.event.filter.CompositeEventFilter;", "[Lde.novanic.eventservice.client.event.filter.CompositeEventFilter;/3667622880");
    result.put("de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter", "de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter/2036315829");
    result.put("[Lde.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter;", "[Lde.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter;/2853401946");
    result.put("de.novanic.eventservice.client.event.filter.DefaultEventFilter", "de.novanic.eventservice.client.event.filter.DefaultEventFilter/3359357329");
    result.put("[Lde.novanic.eventservice.client.event.filter.DefaultEventFilter;", "[Lde.novanic.eventservice.client.event.filter.DefaultEventFilter;/2136978271");
    result.put("[Lde.novanic.eventservice.client.event.filter.EventFilter;", "[Lde.novanic.eventservice.client.event.filter.EventFilter;/836210305");
    result.put("de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent", "de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent/2862324233");
    result.put("de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope", "de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope/4054018674");
    result.put("java.lang.Boolean", "java.lang.Boolean/476441737");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.sql.Date", "java.sql.Date/730999118");
    result.put("java.sql.Time", "java.sql.Time/1816797103");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/3040052672");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptySet/3523698179");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.Date", "java.util.Date/3385151746");
    result.put("java.util.HashSet", "java.util.HashSet/3273092938");
    result.put("java.util.LinkedHashSet", "java.util.LinkedHashSet/1826081506");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.TreeMap", "java.util.TreeMap/1493889780");
    result.put("java.util.TreeSet", "java.util.TreeSet/4043497002");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    return result;
  }
  
  public EventService_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
