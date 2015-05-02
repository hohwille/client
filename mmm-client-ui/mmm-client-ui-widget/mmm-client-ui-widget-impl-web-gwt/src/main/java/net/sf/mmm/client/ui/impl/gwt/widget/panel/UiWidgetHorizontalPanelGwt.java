/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.panel;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.panel.UiWidgetHorizontalPanel;
import net.sf.mmm.client.ui.base.widget.factory.AbstractUiSingleWidgetFactoryNative;
import net.sf.mmm.client.ui.base.widget.panel.AbstractUiWidgetHorizontalPanel;
import net.sf.mmm.client.ui.impl.gwt.widget.panel.adapter.UiWidgetAdapterGwtHorizontalPanel;

/**
 * This is the implementation of {@link UiWidgetHorizontalPanel} using GWT.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetHorizontalPanelGwt extends AbstractUiWidgetHorizontalPanel<UiWidgetAdapterGwtHorizontalPanel> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public UiWidgetHorizontalPanelGwt(UiContext context, UiWidgetAdapterGwtHorizontalPanel widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected UiWidgetAdapterGwtHorizontalPanel createWidgetAdapter() {

    return new UiWidgetAdapterGwtHorizontalPanel();
  }

  /**
   * This inner class is the {@link AbstractUiSingleWidgetFactoryNative factory} for this widget.
   */
  public static class Factory extends AbstractUiSingleWidgetFactoryNative<UiWidgetHorizontalPanel> {

    /**
     * The constructor.
     */
    public Factory() {

      super(UiWidgetHorizontalPanel.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiWidgetHorizontalPanel create(UiContext context) {

      return new UiWidgetHorizontalPanelGwt(context, null);
    }
  }

}
