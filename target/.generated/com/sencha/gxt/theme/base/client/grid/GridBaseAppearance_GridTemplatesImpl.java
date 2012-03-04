package com.sencha.gxt.theme.base.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class GridBaseAppearance_GridTemplatesImpl implements com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridTemplates {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"><div class="{2}"><table class="{3}" cellpadding="0" cellspacing="0" style="table-layout: fixed;"><tbody></tbody></table></div></div></div>
     * params:
       * com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_grid_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_scroller_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_body_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_dataTable_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridTemplates_render_SafeHtml__GridStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridTemplates_render_SafeHtml__GridStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_grid_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_scroller_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_body_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.grid.GridBaseAppearance_GridStyle_dataTable_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
