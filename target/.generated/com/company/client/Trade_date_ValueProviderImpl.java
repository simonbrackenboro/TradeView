package com.company.client;

public class Trade_date_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.company.client.Trade, java.util.Date> {
  public static final Trade_date_ValueProviderImpl INSTANCE = new Trade_date_ValueProviderImpl();
  public java.util.Date getValue(com.company.client.Trade object) {
    return object.getDate();
  }
  public void setValue(com.company.client.Trade object, java.util.Date value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "date";
  }
}
