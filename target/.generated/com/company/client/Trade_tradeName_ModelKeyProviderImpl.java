package com.company.client;

public class Trade_tradeName_ModelKeyProviderImpl implements com.sencha.gxt.data.shared.ModelKeyProvider<com.company.client.Trade> {
  public static final Trade_tradeName_ModelKeyProviderImpl INSTANCE = new Trade_tradeName_ModelKeyProviderImpl();
  public String getKey(com.company.client.Trade item) {
    return "" + item.getTradeName();
  }
}
