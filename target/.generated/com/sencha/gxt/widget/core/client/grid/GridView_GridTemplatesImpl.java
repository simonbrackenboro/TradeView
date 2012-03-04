package com.sencha.gxt.widget.core.client.grid;

public class GridView_GridTemplatesImpl implements com.sencha.gxt.widget.core.client.grid.GridView.GridTemplates {
  
  public com.google.gwt.safehtml.shared.SafeHtml tdRowSpan(int arg0,java.lang.String arg1,com.google.gwt.safecss.shared.SafeStyles arg2,int arg3,com.google.gwt.safehtml.shared.SafeHtml arg4) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<td cellindex=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg0)));
    sb.append("\" class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("\" style=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2.asString()));
    sb.append("\" rowspan=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg3)));
    sb.append("\">");
    sb.append(arg4.asString());
    sb.append("</td>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml table(java.lang.String arg0,com.google.gwt.safecss.shared.SafeStyles arg1,com.google.gwt.safehtml.shared.SafeHtml arg2) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<table cellpadding=\"0\" cellspacing=\"0\" class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("\" style=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1.asString()));
sb.append(";table-layout: fixed\"><tbody>");
sb.append(arg2.asString());
sb.append("</tbody></table>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml tdWrap(int arg0,java.lang.String arg1,java.lang.String arg2,com.google.gwt.safehtml.shared.SafeHtml arg3) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<td colspan=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg0)));
sb.append("\" class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("\"><div class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
sb.append("\">");
sb.append(arg3.asString());
sb.append("</div></td>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml tbody(com.google.gwt.safehtml.shared.SafeHtml arg0) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<table><tbody>");
sb.append(arg0.asString());
sb.append("</tbody></table>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml th(java.lang.String arg0,com.google.gwt.safecss.shared.SafeStyles arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<th class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("\" style=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1.asString()));
sb.append("\"></th>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml td(int arg0,java.lang.String arg1,com.google.gwt.safecss.shared.SafeStyles arg2,java.lang.String arg3,com.google.gwt.safehtml.shared.SafeHtml arg4) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<td cellindex=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg0)));
sb.append("\" class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("\" style=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2.asString()));
sb.append("\"><div class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
sb.append("\">");
sb.append(arg4.asString());
sb.append("</div></td>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml div(java.lang.String arg0,com.google.gwt.safehtml.shared.SafeHtml arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("\">");
sb.append(arg1.asString());
sb.append("</div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml tr(java.lang.String arg0,com.google.gwt.safehtml.shared.SafeHtml arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<tr class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("\">");
sb.append(arg1.asString());
sb.append("</tr>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
