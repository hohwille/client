/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.core;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.core.UiWidgetLink;
import net.sf.mmm.client.ui.base.widget.core.AbstractUiWidgetLink;
import net.sf.mmm.client.ui.base.widget.factory.AbstractUiSingleWidgetFactoryNative;
import net.sf.mmm.client.ui.impl.gwt.widget.core.adapter.UiWidgetAdapterGwtLink;

/**
 * This is the implementation of {@link UiWidgetLink} using GWT.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetLinkGwt extends AbstractUiWidgetLink<UiWidgetAdapterGwtLink> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public UiWidgetLinkGwt(UiContext context, UiWidgetAdapterGwtLink widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected UiWidgetAdapterGwtLink createWidgetAdapter() {

    return new UiWidgetAdapterGwtLink();
  }

  /**
   * This inner class is the {@link AbstractUiSingleWidgetFactoryNative factory} for this widget.
   */
  public static class Factory extends AbstractUiSingleWidgetFactoryNative<UiWidgetLink> {

    /**
     * The constructor.
     */
    public Factory() {

      super(UiWidgetLink.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiWidgetLink create(UiContext context) {

      return new UiWidgetLinkGwt(context, null);
    }

  }

}
