package com.company.client;

public class Trade_tradeName_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.company.client.Trade, java.lang.String> {
  public static final Trade_tradeName_ValueProviderImpl INSTANCE = new Trade_tradeName_ValueProviderImpl();
  public java.lang.String getValue(com.company.client.Trade object) {
    return object.getTradeName();
  }
  public void setValue(com.company.client.Trade object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "tradeName";
  }
}
