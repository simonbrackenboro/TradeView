package com.sencha.gxt.theme.base.client.grid;

public class GridBaseAppearance_GridTemplates_render_SafeHtml__GridStyle_style___SafeHtmlTemplatesImpl implements com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridTemplates_render_SafeHtml__GridStyle_style___SafeHtmlTemplates {
  
  public com.google.gwt.safehtml.shared.SafeHtml render0(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("\"><div class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("\"><div class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("\"><table class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("\" cellpadding=\"0\" cellspacing=\"0\" style=\"table-layout: fixed;\"><tbody></tbody></table></div></div></div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
