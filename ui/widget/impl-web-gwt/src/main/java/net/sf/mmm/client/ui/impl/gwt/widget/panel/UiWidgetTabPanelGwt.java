/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.panel;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.panel.UiWidgetTabPanel;
import net.sf.mmm.client.ui.base.widget.factory.AbstractUiSingleWidgetFactoryNative;
import net.sf.mmm.client.ui.base.widget.panel.AbstractUiWidgetTabPanel;
import net.sf.mmm.client.ui.impl.gwt.widget.panel.adapter.UiWidgetAdapterGwtTabLayoutPanel;

/**
 * This is the implementation of {@link UiWidgetTabPanel} using GWT based on
 * {@link UiWidgetAdapterGwtTabLayoutPanel}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetTabPanelGwt extends AbstractUiWidgetTabPanel<UiWidgetAdapterGwtTabLayoutPanel> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public UiWidgetTabPanelGwt(UiContext context, UiWidgetAdapterGwtTabLayoutPanel widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected UiWidgetAdapterGwtTabLayoutPanel createWidgetAdapter() {

    return new UiWidgetAdapterGwtTabLayoutPanel();
  }

  /**
   * This inner class is the {@link AbstractUiSingleWidgetFactoryNative factory} for this widget.
   */
  public static class Factory extends AbstractUiSingleWidgetFactoryNative<UiWidgetTabPanel> {

    /**
     * The constructor.
     */
    public Factory() {

      super(UiWidgetTabPanel.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiWidgetTabPanel create(UiContext context) {

      return new UiWidgetTabPanelGwt(context, null);
    }

  }

}
