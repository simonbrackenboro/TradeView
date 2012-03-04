package com.company.client;

public class StockPropertiesImpl implements com.company.client.StockProperties {
  public com.sencha.gxt.core.client.ValueProvider date() {
    return com.company.client.Trade_date_ValueProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.core.client.ValueProvider im() {
    return com.company.client.Trade_im_ValueProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.data.shared.ModelKeyProvider key() {
    return com.company.client.Trade_tradeName_ModelKeyProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.core.client.ValueProvider tradeName() {
    return com.company.client.Trade_tradeName_ValueProviderImpl.INSTANCE;
  }
}
