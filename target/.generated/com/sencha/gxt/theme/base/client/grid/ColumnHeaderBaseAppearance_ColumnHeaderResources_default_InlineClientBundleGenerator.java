package com.sencha.gxt.theme.base.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources {
  private static ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator _instance0 = new ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator();
  private void columnHeaderInitializer() {
    columnHeader = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnHeader",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 2, 24, false, false
    );
  }
  private static class columnHeaderInitializer {
    static {
      _instance0.columnHeaderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnHeader;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnHeader() {
    return columnHeaderInitializer.get();
  }
  private void columnHeaderOverInitializer() {
    columnHeaderOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnHeaderOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 2, 22, false, false
    );
  }
  private static class columnHeaderOverInitializer {
    static {
      _instance0.columnHeaderOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnHeaderOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnHeaderOver() {
    return columnHeaderOverInitializer.get();
  }
  private void columnsIconInitializer() {
    columnsIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnsIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 16, 16, false, false
    );
  }
  private static class columnsIconInitializer {
    static {
      _instance0.columnsIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnsIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnsIcon() {
    return columnsIconInitializer.get();
  }
  private void sortAscendingIconInitializer() {
    sortAscendingIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "sortAscendingIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 16, 16, false, false
    );
  }
  private static class sortAscendingIconInitializer {
    static {
      _instance0.sortAscendingIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return sortAscendingIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource sortAscendingIcon() {
    return sortAscendingIconInitializer.get();
  }
  private void sortDescendingIconInitializer() {
    sortDescendingIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "sortDescendingIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 16, 16, false, false
    );
  }
  private static class sortDescendingIconInitializer {
    static {
      _instance0.sortDescendingIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return sortDescendingIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource sortDescendingIcon() {
    return sortDescendingIconInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNWYVP2CEC{background:" + ("repeat-x"+ " " +"0"+ " " +"bottom")  + ";cursor:" + ("default")  + ";zoom:" + ("1")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ((ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getSafeUri().asString() + "\") -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getLeft() + "px -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getTop() + "px  repeat-x")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ("auto")  + ";background-position:") + (("bottom")  + ";}.GNWYVP2BEC .GNWYVP2MDC{line-height:" + ("15px")  + ";vertical-align:" + ("middle")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";-moz-outline:" + ("none")  + ";-moz-user-focus:" + ("normal")  + ";outline:" + ("0"+ " " +"none")  + ";font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";border-right-color:" + ("#eee")  + ";border-left-color:" + ("#d0d0d0") ) + (";}.GNWYVP2ODC{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";float:" + ("right")  + ";cursor:" + ("inherit")  + ";position:" + ("relative")  + ";vertical-align:" + ("middle")  + ";overflow:" + ("hidden")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";padding:" + ("4px"+ " " +"5px"+ " " +"4px"+ " " +"3px")  + ";white-space:") + (("nowrap")  + ";}.GNWYVP2MDC{-moz-user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GNWYVP2NDC{display:" + ("none")  + ";position:" + ("absolute")  + ";width:" + ("14px")  + ";background:" + ("no-repeat"+ " " +"right"+ " " +"center")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("2") ) + (";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";}.GNWYVP2AEC .GNWYVP2NDC,.GNWYVP2PDC .GNWYVP2NDC{display:" + ("block")  + ";}a.GNWYVP2NDC:hover{background-position:" + ("-14px"+ " " +"center")  + ";}td.GNWYVP2AEC,td.GNWYVP2FEC,td.GNWYVP2EEC,td.GNWYVP2PDC{border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";}td.GNWYVP2AEC .GNWYVP2ODC,td.GNWYVP2FEC .GNWYVP2ODC,td.GNWYVP2EEC .GNWYVP2ODC,td.GNWYVP2PDC .GNWYVP2ODC{background:") + (("repeat-x"+ " " +"right"+ " " +"bottom")  + ";}td.GNWYVP2AEC,td.GNWYVP2FEC,td.GNWYVP2EEC,td.GNWYVP2PDC{border-right-color:" + ("#aaccf6")  + ";border-left-color:" + ("#aaccf6")  + ";}td.GNWYVP2AEC .GNWYVP2ODC,td.GNWYVP2FEC .GNWYVP2ODC,td.GNWYVP2EEC .GNWYVP2ODC,td.GNWYVP2PDC .GNWYVP2ODC{height:" + ((ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getSafeUri().asString() + "\") -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getLeft() + "px -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getTop() + "px  repeat-x")  + ";background-color:" + ("#ebf3fd")  + ";background-position:" + ("right"+ " " +"bottom")  + ";}.GNWYVP2GEC{background-repeat:" + ("no-repeat")  + ";display:" + ("none")  + ";height:" + ("4px") ) + (";width:" + ("13px")  + ";margin-right:" + ("3px")  + ";vertical-align:" + ("middle")  + ";}.GNWYVP2EEC .GNWYVP2GEC{display:" + ("inline")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/sort_asc.gif"))  + ";}.GNWYVP2FEC .GNWYVP2GEC{display:" + ("inline")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/sort_desc.gif"))  + ";}.GNWYVP2LDC{background-image:" + ("colMoveTop")  + ";}.GNWYVP2KDC{background-image:" + ("colMoveBottom")  + ";}")) : ((".GNWYVP2CEC{background:" + ("repeat-x"+ " " +"0"+ " " +"bottom")  + ";cursor:" + ("default")  + ";zoom:" + ("1")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ((ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getSafeUri().asString() + "\") -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getLeft() + "px -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeader()).getTop() + "px  repeat-x")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ("auto")  + ";background-position:") + (("bottom")  + ";}.GNWYVP2BEC .GNWYVP2MDC{line-height:" + ("15px")  + ";vertical-align:" + ("middle")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";-moz-outline:" + ("none")  + ";-moz-user-focus:" + ("normal")  + ";outline:" + ("0"+ " " +"none")  + ";font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";border-left-color:" + ("#eee")  + ";border-right-color:" + ("#d0d0d0") ) + (";}.GNWYVP2ODC{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";float:" + ("left")  + ";cursor:" + ("inherit")  + ";position:" + ("relative")  + ";vertical-align:" + ("middle")  + ";overflow:" + ("hidden")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";padding:" + ("4px"+ " " +"3px"+ " " +"4px"+ " " +"5px")  + ";white-space:") + (("nowrap")  + ";}.GNWYVP2MDC{-moz-user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GNWYVP2NDC{display:" + ("none")  + ";position:" + ("absolute")  + ";width:" + ("14px")  + ";background:" + ("no-repeat"+ " " +"left"+ " " +"center")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("2") ) + (";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";}.GNWYVP2AEC .GNWYVP2NDC,.GNWYVP2PDC .GNWYVP2NDC{display:" + ("block")  + ";}a.GNWYVP2NDC:hover{background-position:" + ("-14px"+ " " +"center")  + ";}td.GNWYVP2AEC,td.GNWYVP2FEC,td.GNWYVP2EEC,td.GNWYVP2PDC{border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";}td.GNWYVP2AEC .GNWYVP2ODC,td.GNWYVP2FEC .GNWYVP2ODC,td.GNWYVP2EEC .GNWYVP2ODC,td.GNWYVP2PDC .GNWYVP2ODC{background:") + (("repeat-x"+ " " +"left"+ " " +"bottom")  + ";}td.GNWYVP2AEC,td.GNWYVP2FEC,td.GNWYVP2EEC,td.GNWYVP2PDC{border-left-color:" + ("#aaccf6")  + ";border-right-color:" + ("#aaccf6")  + ";}td.GNWYVP2AEC .GNWYVP2ODC,td.GNWYVP2FEC .GNWYVP2ODC,td.GNWYVP2EEC .GNWYVP2ODC,td.GNWYVP2PDC .GNWYVP2ODC{height:" + ((ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getSafeUri().asString() + "\") -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getLeft() + "px -" + (ColumnHeaderBaseAppearance_ColumnHeaderResources_default_InlineClientBundleGenerator.this.columnHeaderOver()).getTop() + "px  repeat-x")  + ";background-color:" + ("#ebf3fd")  + ";background-position:" + ("left"+ " " +"bottom")  + ";}.GNWYVP2GEC{background-repeat:" + ("no-repeat")  + ";display:" + ("none")  + ";height:" + ("4px") ) + (";width:" + ("13px")  + ";margin-left:" + ("3px")  + ";vertical-align:" + ("middle")  + ";}.GNWYVP2EEC .GNWYVP2GEC{display:" + ("inline")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/sort_asc.gif"))  + ";}.GNWYVP2FEC .GNWYVP2GEC{display:" + ("inline")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/sort_desc.gif"))  + ";}.GNWYVP2LDC{background-image:" + ("colMoveTop")  + ";}.GNWYVP2KDC{background-image:" + ("colMoveBottom")  + ";}"));
      }
      public java.lang.String columnMoveBottom(){
        return "GNWYVP2KDC";
      }
      public java.lang.String columnMoveTop(){
        return "GNWYVP2LDC";
      }
      public java.lang.String head(){
        return "GNWYVP2MDC";
      }
      public java.lang.String headButton(){
        return "GNWYVP2NDC";
      }
      public java.lang.String headInner(){
        return "GNWYVP2ODC";
      }
      public java.lang.String headMenuOpen(){
        return "GNWYVP2PDC";
      }
      public java.lang.String headOver(){
        return "GNWYVP2AEC";
      }
      public java.lang.String headRow(){
        return "GNWYVP2BEC";
      }
      public java.lang.String header(){
        return "GNWYVP2CEC";
      }
      public java.lang.String headerInner(){
        return "GNWYVP2DEC";
      }
      public java.lang.String sortAsc(){
        return "GNWYVP2EEC";
      }
      public java.lang.String sortDesc(){
        return "GNWYVP2FEC";
      }
      public java.lang.String sortIcon(){
        return "GNWYVP2GEC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAYCAYAAADQ+yzZAAAAQElEQVR42q3GuRHAMAgEQPqvjj6EeGQnRKe5iMShg51Z6W6Q/J46L2iS9YA+EnlAE48CyfYETWwHSJY5aKKqoAuT4rgR7P41jwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAWCAYAAADq8U2pAAAAIElEQVR42mN4/fnvfxBmoJBx88Xv/yBMV8aqM9/+gzAAq2ildV6GS2YAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABUUlEQVR42sVTW0sCQRj9flp/QQqTiC4U0YOkKQpqRBFaUAQrblHU0kUKK2MLK9xo2RS2bVuKosCy7aEI+gW9nnYGVrqA0PbQgfMwM5zzHc7MEP07Dqt1ZEtPSG0+IrnhMP+AxFoN8ZU7xKRbRJdvEFm8QnjhEqG5CwRz55xj0hmYljJFG9nymyeGhVMQm+yVA9MaKJmv4zMS6/eoPb//INv/jr7JE5B7YFkWTNNsGPgzrw26BrIsw7ZttMRfuKYnrTgGTmG/ScDErkHX+BGItc1gGAZ0XW+awBW7Bp2jByB2VV4TdIzsg6JL13xRqVSgaVrTBJIkfekgkJRBoXnL8y20xXZAQzmTL1RVhaIoTROIoghBEDgZWqNboGDW8JzAFymAZlZ1DM5W+avqn1LRmz5G90TZabjESwqk9tCe2IU/XnQibztTC5y+4QKY9s+f8QPz2J2WDMzEcwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA6ElEQVR42qVTIRLDIBDMVyojkVhkJDIWiUSeRUaexCKRyNg8od/ZQtpmmjSdNO3OMDDcsbt3QNO8QLsJzTH2c4ivUDaD4yHJflzTBO1GyJ5/I+iKep2F/oGgp3FWd3x3oCnhFMFT/YkDF+uY8RNEUeV0b151UAk6+5Hkm5s62YPoAwIx0hDnORiLHNL3DiL5ZZN1j0FJnL7GilyceHFBTvktqbcEKg4rAXGG0uadiDtd7JtdhccLXYYbNiLB+iPrjZDdfLgVm7zMCazUqnHRET65qCWsA1LCyRbBubkE/1jv/hlDf7+DFW76rKAkoIIsyAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA4klEQVR42qWSLQ/DIBiE+1cmK5FYJBKJRSKRWCQSiUUikbP9W7dCuib97rpLCAR4j4eDrhuVXES0Admn1kelUWJGt6/tfLJungxCwjN6VLxv8FUZSRx5oeTyzCBwMeKrs+Jjg6jdFfqxQQkZgbFFcMnY+yEGSmFoj2hMu4Kbxj9ncFPnBlwlPDbQ/g0mE3wcnj2jMBlCR1C+DVBqC+sbHWwoYGLnub/4hG0DDLlRzc341WeTprTT60IlqOO1CaG8FfeE4jK8XYo0zFdYLChbQLjDtKGrBNWAS78xEcr+/Q8W+gCByZ1DgoJnrwAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource columnHeader;
  private static com.google.gwt.resources.client.ImageResource columnHeaderOver;
  private static com.google.gwt.resources.client.ImageResource columnsIcon;
  private static com.google.gwt.resources.client.ImageResource sortAscendingIcon;
  private static com.google.gwt.resources.client.ImageResource sortDescendingIcon;
  private static com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      columnHeader(), 
      columnHeaderOver(), 
      columnsIcon(), 
      sortAscendingIcon(), 
      sortDescendingIcon(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("columnHeader", columnHeader());
        resourceMap.put("columnHeaderOver", columnHeaderOver());
        resourceMap.put("columnsIcon", columnsIcon());
        resourceMap.put("sortAscendingIcon", sortAscendingIcon());
        resourceMap.put("sortDescendingIcon", sortDescendingIcon());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'columnHeader': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources::columnHeader()();
      case 'columnHeaderOver': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources::columnHeaderOver()();
      case 'columnsIcon': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources::columnsIcon()();
      case 'sortAscendingIcon': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources::sortAscendingIcon()();
      case 'sortDescendingIcon': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources::sortDescendingIcon()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderResources::style()();
    }
    return null;
  }-*/;
}
