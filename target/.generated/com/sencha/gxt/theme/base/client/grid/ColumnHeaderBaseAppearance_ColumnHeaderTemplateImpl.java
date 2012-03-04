package com.sencha.gxt.theme.base.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class ColumnHeaderBaseAppearance_ColumnHeaderTemplateImpl implements com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance.ColumnHeaderStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"></div></div>
     * params:
       * com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance_ColumnHeaderStyle_header_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance_ColumnHeaderStyle_headerInner_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance_ColumnHeaderTemplate_render_SafeHtml__ColumnHeaderStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance_ColumnHeaderTemplate_render_SafeHtml__ColumnHeaderStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance_ColumnHeaderStyle_header_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.ColumnHeaderBaseAppearance_ColumnHeaderStyle_headerInner_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
