package com.sencha.gxt.core.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CommonStyles_Bundle_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.resources.CommonStyles.Bundle {
  private static CommonStyles_Bundle_safari_default_InlineClientBundleGenerator _instance0 = new CommonStyles_Bundle_safari_default_InlineClientBundleGenerator();
  private void shimInitializer() {
    shim = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "shim",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
    );
  }
  private static class shimInitializer {
    static {
      _instance0.shimInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return shim;
    }
  }
  public com.google.gwt.resources.client.ImageResource shim() {
    return shimInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.sencha.gxt.core.client.resources.CommonStyles.Styles() {
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
        return "styles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNWYVP2HK{position:" + ("absolute")  + " !important;right:" + ("0")  + ";top:" + ("0")  + ";}.GNWYVP2AK{display:" + ("none")  + " !important;}.GNWYVP2BK{position:" + ("absolute")  + " !important;right:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GNWYVP2CK{visibility:" + ("hidden")  + " !important;}.GNWYVP2KK,.GNWYVP2KK *,.GNWYVP2LK{-moz-user-select:" + ("none")  + ";-khtml-user-select:") + (("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GNWYVP2IK{zoom:" + ("1")  + ";background-color:" + ("transparent")  + ";-moz-outline:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GNWYVP2PJ{float:" + ("left") ) + (";}.GNWYVP2MJ{cursor:" + ("w-resize")  + ";cursor:" + ("col-resize")  + ";}.GNWYVP2NJ{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GNWYVP2EK{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GNWYVP2GK{white-space:" + ("nowrap")  + ";}.GNWYVP2JK{height:" + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}.GNWYVP2OJ *{color:" + ("gray")  + " !important;}.GNWYVP2OJ{cursor:" + ("default")  + ";opacity:" + ("0.6") ) + (";}")) : ((".GNWYVP2HK{position:" + ("absolute")  + " !important;left:" + ("0")  + ";top:" + ("0")  + ";}.GNWYVP2AK{display:" + ("none")  + " !important;}.GNWYVP2BK{position:" + ("absolute")  + " !important;left:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GNWYVP2CK{visibility:" + ("hidden")  + " !important;}.GNWYVP2KK,.GNWYVP2KK *,.GNWYVP2LK{-moz-user-select:" + ("none")  + ";-khtml-user-select:") + (("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GNWYVP2IK{zoom:" + ("1")  + ";background-color:" + ("transparent")  + ";-moz-outline:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GNWYVP2PJ{float:" + ("right") ) + (";}.GNWYVP2MJ{cursor:" + ("e-resize")  + ";cursor:" + ("col-resize")  + ";}.GNWYVP2NJ{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GNWYVP2EK{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GNWYVP2GK{white-space:" + ("nowrap")  + ";}.GNWYVP2JK{height:" + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}.GNWYVP2OJ *{color:" + ("gray")  + " !important;}.GNWYVP2OJ{cursor:" + ("default")  + ";opacity:" + ("0.6") ) + (";}"));
      }
      public java.lang.String clear(){
        return "x-clear";
      }
      public java.lang.String columnResize(){
        return "GNWYVP2MJ";
      }
      public java.lang.String columnRowResize(){
        return "GNWYVP2NJ";
      }
      public java.lang.String disabled(){
        return "GNWYVP2OJ";
      }
      public java.lang.String floatRight(){
        return "GNWYVP2PJ";
      }
      public java.lang.String hideDisplay(){
        return "GNWYVP2AK";
      }
      public java.lang.String hideOffsets(){
        return "GNWYVP2BK";
      }
      public java.lang.String hideVisibility(){
        return "GNWYVP2CK";
      }
      public java.lang.String ignore(){
        return "GNWYVP2DK";
      }
      public java.lang.String inlineBlock(){
        return "GNWYVP2EK";
      }
      public java.lang.String nodrag(){
        return "GNWYVP2FK";
      }
      public java.lang.String nowrap(){
        return "GNWYVP2GK";
      }
      public java.lang.String positionable(){
        return "GNWYVP2HK";
      }
      public java.lang.String repaint(){
        return "GNWYVP2IK";
      }
      public java.lang.String shim(){
        return "GNWYVP2JK";
      }
      public java.lang.String unselectable(){
        return "GNWYVP2KK";
      }
      public java.lang.String unselectableSingle(){
        return "GNWYVP2LK";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.sencha.gxt.core.client.resources.CommonStyles.Styles get() {
      return styles;
    }
  }
  public com.sencha.gxt.core.client.resources.CommonStyles.Styles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQABAID/AMDAwAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==";
  private static com.google.gwt.resources.client.ImageResource shim;
  private static com.sencha.gxt.core.client.resources.CommonStyles.Styles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      shim(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("shim", shim());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'shim': return this.@com.sencha.gxt.core.client.resources.CommonStyles.Bundle::shim()();
      case 'styles': return this.@com.sencha.gxt.core.client.resources.CommonStyles.Bundle::styles()();
    }
    return null;
  }-*/;
}
