package com.sencha.gxt.theme.base.client.tips;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class TipBaseAppearance_TipDefaultTemplateImpl implements com.sencha.gxt.theme.base.client.tips.TipBaseAppearance.TipDefaultTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.tips.TipBaseAppearance.TipStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div><div><span class="{1}"></span></div><div><span class="{2}"></span></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipStyle_tools_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipStyle_heading_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipStyle_text_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipDefaultTemplate_render_SafeHtml__TipStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipDefaultTemplate_render_SafeHtml__TipStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipStyle_tools_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipStyle_heading_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipBaseAppearance_TipStyle_text_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
