package com.sencha.gxt.theme.base.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GridBaseAppearance_GridResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridResources {
  private static GridBaseAppearance_GridResources_default_InlineClientBundleGenerator _instance0 = new GridBaseAppearance_GridResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle() {
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
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNWYVP2F3{position:" + ("relative")  + ";overflow:" + ("hidden")  + ";outline:" + ("0"+ " " +"none")  + ";}.GNWYVP2A4{overflow:" + ("auto")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";background-color:" + ("white")  + ";}.GNWYVP2MEC{table-layout:" + ("fixed")  + ";border-collapse:" + ("separate")  + ";border-spacing:" + ("0")  + ";}.GNWYVP2OEC{-moz-user-select:") + (("-moz-none")  + ";cursor:" + ("default")  + ";line-height:" + ("13px")  + ";padding:" + ("0"+ " " +"1px")  + ";vertical-align:" + ("top")  + ";}.GNWYVP2DFC{border:" + ("1px"+ " " +"dotted"+ " " +"#545352")  + ";}.GNWYVP2FFC .GNWYVP2HEC{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GNWYVP2PEC .GNWYVP2HEC{background-color:" + ("#fafafa")  + ";}.GNWYVP2EFC .GNWYVP2HEC{background-color:" + ("#efefef") ) + (";border-width:" + ("1px"+ " " +"0")  + ";border-style:" + ("solid")  + ";}.GNWYVP2HEC{background-color:" + ("white")  + ";border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-left:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px"+ " " +"0")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";overflow:" + ("hidden")  + ";}.GNWYVP2JEC{overflow:" + ("hidden")  + ";padding:") + (("4px"+ " " +"5px"+ " " +"3px"+ " " +"3px")  + ";white-space:" + ("nowrap")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";}.GNWYVP2IEC{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GNWYVP2KEC{background:" + ("repeat-x"+ " " +"bottom")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/invalid_line.gif"))  + ";}.GNWYVP2IEC{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GNWYVP2LEC{background-color:" + ("#b8cfee") ) + (" !important;color:" + ("#000")  + ";}.GNWYVP2EFC .GNWYVP2HEC,.GNWYVP2EFC .GNWYVP2GFC{border-color:" + ("#ddd")  + ";}.GNWYVP2B3 .GNWYVP2HEC{padding-left:" + ("0")  + ";border-left:" + ("1px"+ " " +"solid")  + ";}.GNWYVP2D3{padding:" + ("10px")  + ";color:" + ("gray")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GNWYVP2AFC{font:" + ("11px"+ "/"+ " " +"13px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";padding:" + ("4px")  + ";}.GNWYVP2GFC{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-left:") + (("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";overflow:" + ("hidden")  + ";}.GNWYVP2FFC .GNWYVP2HEC,.GNWYVP2FFC .GNWYVP2GFC{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GNWYVP2GFC .GNWYVP2HEC,.GNWYVP2GFC .GNWYVP2JEC{border:" + ("none")  + ";}.GNWYVP2MEC .x-grid-td-numberer,.GNWYVP2MEC .GNWYVP2FFC .x-grid-td-numberer{background:" + ("transparent"+ " " +"repeat-y"+ " " +"left")  + ";}.GNWYVP2MEC .x-grid-td-numberer .GNWYVP2JEC{padding:" + ("3px"+ " " +"0"+ " " +"0"+ " " +"5px")  + " !important;text-align:" + ("center") ) + (";color:" + ("#444")  + ";}.GNWYVP2MEC .x-grid-td-numberer{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-special-col-bg.gif"))  + ";}.GNWYVP2MEC .GNWYVP2FFC .x-grid-td-numberer{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-special-col-sel-bg.gif"))  + ";}.GNWYVP2E3{background:" + ("#f7f7f7"+ " " +"none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";}.GNWYVP2E3 .GNWYVP2HEC{background:" + ("none")  + ";}.x-treegrid .x-treegrid-column .GNWYVP2JEC{padding:") + (("0")  + " !important;}")) : ((".GNWYVP2F3{position:" + ("relative")  + ";overflow:" + ("hidden")  + ";outline:" + ("0"+ " " +"none")  + ";}.GNWYVP2A4{overflow:" + ("auto")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";background-color:" + ("white")  + ";}.GNWYVP2MEC{table-layout:" + ("fixed")  + ";border-collapse:" + ("separate")  + ";border-spacing:" + ("0")  + ";}.GNWYVP2OEC{-moz-user-select:") + (("-moz-none")  + ";cursor:" + ("default")  + ";line-height:" + ("13px")  + ";padding:" + ("0"+ " " +"1px")  + ";vertical-align:" + ("top")  + ";}.GNWYVP2DFC{border:" + ("1px"+ " " +"dotted"+ " " +"#545352")  + ";}.GNWYVP2FFC .GNWYVP2HEC{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GNWYVP2PEC .GNWYVP2HEC{background-color:" + ("#fafafa")  + ";}.GNWYVP2EFC .GNWYVP2HEC{background-color:" + ("#efefef") ) + (";border-width:" + ("1px"+ " " +"0")  + ";border-style:" + ("solid")  + ";}.GNWYVP2HEC{background-color:" + ("white")  + ";border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-right:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px"+ " " +"0")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";overflow:" + ("hidden")  + ";}.GNWYVP2JEC{overflow:" + ("hidden")  + ";padding:") + (("4px"+ " " +"3px"+ " " +"3px"+ " " +"5px")  + ";white-space:" + ("nowrap")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";}.GNWYVP2IEC{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GNWYVP2KEC{background:" + ("repeat-x"+ " " +"bottom")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/invalid_line.gif"))  + ";}.GNWYVP2IEC{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GNWYVP2LEC{background-color:" + ("#b8cfee") ) + (" !important;color:" + ("#000")  + ";}.GNWYVP2EFC .GNWYVP2HEC,.GNWYVP2EFC .GNWYVP2GFC{border-color:" + ("#ddd")  + ";}.GNWYVP2B3 .GNWYVP2HEC{padding-right:" + ("0")  + ";border-right:" + ("1px"+ " " +"solid")  + ";}.GNWYVP2D3{padding:" + ("10px")  + ";color:" + ("gray")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GNWYVP2AFC{font:" + ("11px"+ "/"+ " " +"13px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";padding:" + ("4px")  + ";}.GNWYVP2GFC{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-right:") + (("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";overflow:" + ("hidden")  + ";}.GNWYVP2FFC .GNWYVP2HEC,.GNWYVP2FFC .GNWYVP2GFC{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GNWYVP2GFC .GNWYVP2HEC,.GNWYVP2GFC .GNWYVP2JEC{border:" + ("none")  + ";}.GNWYVP2MEC .x-grid-td-numberer,.GNWYVP2MEC .GNWYVP2FFC .x-grid-td-numberer{background:" + ("transparent"+ " " +"repeat-y"+ " " +"right")  + ";}.GNWYVP2MEC .x-grid-td-numberer .GNWYVP2JEC{padding:" + ("3px"+ " " +"5px"+ " " +"0"+ " " +"0")  + " !important;text-align:" + ("center") ) + (";color:" + ("#444")  + ";}.GNWYVP2MEC .x-grid-td-numberer{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-special-col-bg.gif"))  + ";}.GNWYVP2MEC .GNWYVP2FFC .x-grid-td-numberer{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-special-col-sel-bg.gif"))  + ";}.GNWYVP2E3{background:" + ("#f7f7f7"+ " " +"none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";}.GNWYVP2E3 .GNWYVP2HEC{background:" + ("none")  + ";}.x-treegrid .x-treegrid-column .GNWYVP2JEC{padding:") + (("0")  + " !important;}"));
      }
      public java.lang.String body(){
        return "GNWYVP2L2";
      }
      public java.lang.String cell(){
        return "GNWYVP2HEC";
      }
      public java.lang.String cellDirty(){
        return "GNWYVP2IEC";
      }
      public java.lang.String cellInner(){
        return "GNWYVP2JEC";
      }
      public java.lang.String cellInvalid(){
        return "GNWYVP2KEC";
      }
      public java.lang.String cellSelected(){
        return "GNWYVP2LEC";
      }
      public java.lang.String columnLines(){
        return "GNWYVP2B3";
      }
      public java.lang.String dataTable(){
        return "GNWYVP2MEC";
      }
      public java.lang.String empty(){
        return "GNWYVP2D3";
      }
      public java.lang.String footer(){
        return "GNWYVP2E3";
      }
      public java.lang.String grid(){
        return "GNWYVP2F3";
      }
      public java.lang.String headerRow(){
        return "GNWYVP2NEC";
      }
      public java.lang.String row(){
        return "GNWYVP2OEC";
      }
      public java.lang.String rowAlt(){
        return "GNWYVP2PEC";
      }
      public java.lang.String rowBody(){
        return "GNWYVP2AFC";
      }
      public java.lang.String rowBodyRow(){
        return "GNWYVP2BFC";
      }
      public java.lang.String rowDirty(){
        return "GNWYVP2CFC";
      }
      public java.lang.String rowHighlight(){
        return "GNWYVP2DFC";
      }
      public java.lang.String rowOver(){
        return "GNWYVP2EFC";
      }
      public java.lang.String rowSelected(){
        return "GNWYVP2FFC";
      }
      public java.lang.String rowWrap(){
        return "GNWYVP2GFC";
      }
      public java.lang.String scroller(){
        return "GNWYVP2A4";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridResources::css()();
    }
    return null;
  }-*/;
}
