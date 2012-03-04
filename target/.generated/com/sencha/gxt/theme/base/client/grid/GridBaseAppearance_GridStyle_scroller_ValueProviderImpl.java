package com.sencha.gxt.theme.base.client.grid;

public class GridBaseAppearance_GridStyle_scroller_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle, java.lang.String> {
  public static final GridBaseAppearance_GridStyle_scroller_ValueProviderImpl INSTANCE = new GridBaseAppearance_GridStyle_scroller_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle object) {
    return object.scroller();
  }
  public void setValue(com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "scroller";
  }
}
