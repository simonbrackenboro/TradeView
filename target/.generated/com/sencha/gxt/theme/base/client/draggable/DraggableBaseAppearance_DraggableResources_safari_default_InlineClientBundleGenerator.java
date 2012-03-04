package com.sencha.gxt.theme.base.client.draggable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DraggableBaseAppearance_DraggableResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.draggable.DraggableBaseAppearance.DraggableResources {
  private static DraggableBaseAppearance_DraggableResources_safari_default_InlineClientBundleGenerator _instance0 = new DraggableBaseAppearance_DraggableResources_safari_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.draggable.DraggableBaseAppearance.DraggableStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNWYVP2NN{cursor:" + ("default")  + " !important;}.GNWYVP2ON{border:" + ("1px"+ " " +"dashed"+ " " +"#3b5a82")  + ";background-color:" + ("#c3daf9")  + ";z-index:" + ("20000")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";cursor:" + ("move")  + ";opacity:" + ("0.5")  + ";}")) : ((".GNWYVP2NN{cursor:" + ("default")  + " !important;}.GNWYVP2ON{border:" + ("1px"+ " " +"dashed"+ " " +"#3b5a82")  + ";background-color:" + ("#c3daf9")  + ";z-index:" + ("20000")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";cursor:" + ("move")  + ";opacity:" + ("0.5")  + ";}"));
      }
      public java.lang.String cursor(){
        return "GNWYVP2NN";
      }
      public java.lang.String proxy(){
        return "GNWYVP2ON";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.draggable.DraggableBaseAppearance.DraggableStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.draggable.DraggableBaseAppearance.DraggableStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.draggable.DraggableBaseAppearance.DraggableStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.base.client.draggable.DraggableBaseAppearance.DraggableResources::style()();
    }
    return null;
  }-*/;
}
