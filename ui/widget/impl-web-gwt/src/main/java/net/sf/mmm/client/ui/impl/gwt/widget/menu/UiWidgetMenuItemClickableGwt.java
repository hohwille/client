/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.menu;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.menu.UiWidgetMenuItemClickable;
import net.sf.mmm.client.ui.base.widget.factory.AbstractUiSingleWidgetFactoryNative;
import net.sf.mmm.client.ui.base.widget.menu.AbstractUiWidgetMenuItemClickable;
import net.sf.mmm.client.ui.impl.gwt.widget.menu.adapter.UiWidgetAdapterGwtMenuItem;

/**
 * This is the implementation of {@link UiWidgetMenuItemClickable} using GWT.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetMenuItemClickableGwt extends AbstractUiWidgetMenuItemClickable<UiWidgetAdapterGwtMenuItem> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public UiWidgetMenuItemClickableGwt(UiContext context, UiWidgetAdapterGwtMenuItem widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected UiWidgetAdapterGwtMenuItem createWidgetAdapter() {

    return new UiWidgetAdapterGwtMenuItem();
  }

  /**
   * This inner class is the {@link AbstractUiSingleWidgetFactoryNative factory} for this widget.
   */
  public static class Factory extends AbstractUiSingleWidgetFactoryNative<UiWidgetMenuItemClickable> {

    /**
     * The constructor.
     */
    public Factory() {

      super(UiWidgetMenuItemClickable.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiWidgetMenuItemClickable create(UiContext context) {

      return new UiWidgetMenuItemClickableGwt(context, null);
    }

  }

}
