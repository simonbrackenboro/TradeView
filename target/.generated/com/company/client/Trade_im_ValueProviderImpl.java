package com.company.client;

public class Trade_im_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.company.client.Trade, java.lang.Double> {
  public static final Trade_im_ValueProviderImpl INSTANCE = new Trade_im_ValueProviderImpl();
  public java.lang.Double getValue(com.company.client.Trade object) {
    return object.getIm();
  }
  public void setValue(com.company.client.Trade object, java.lang.Double value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "im";
  }
}
