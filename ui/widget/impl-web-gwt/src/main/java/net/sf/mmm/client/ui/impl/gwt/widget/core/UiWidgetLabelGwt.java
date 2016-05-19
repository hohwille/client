/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.core;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.core.UiWidgetLabel;
import net.sf.mmm.client.ui.base.widget.core.AbstractUiWidgetLabel;
import net.sf.mmm.client.ui.base.widget.factory.AbstractUiSingleWidgetFactoryNative;
import net.sf.mmm.client.ui.impl.gwt.widget.core.adapter.UiWidgetAdapterGwtLabel;

/**
 * This is the implementation of {@link UiWidgetLabel} using GWT.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetLabelGwt extends AbstractUiWidgetLabel<UiWidgetAdapterGwtLabel> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public UiWidgetLabelGwt(UiContext context, UiWidgetAdapterGwtLabel widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected UiWidgetAdapterGwtLabel createWidgetAdapter() {

    return new UiWidgetAdapterGwtLabel();
  }

  /**
   * This inner class is the {@link AbstractUiSingleWidgetFactoryNative factory} for this widget.
   */
  public static class Factory extends AbstractUiSingleWidgetFactoryNative<UiWidgetLabel> {

    /**
     * The constructor.
     */
    public Factory() {

      super(UiWidgetLabel.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiWidgetLabel create(UiContext context) {

      return new UiWidgetLabelGwt(context, null);
    }

  }

}
