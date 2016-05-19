/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.window;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.base.widget.window.AbstractUiWidgetMainWindow;
import net.sf.mmm.client.ui.impl.gwt.widget.window.adapter.UiWidgetAdapterGwtMainWindow;

/**
 * This is the implementation of {@link net.sf.mmm.client.ui.api.widget.window.UiWidgetMainWindow} using GWT.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetMainWindowGwt extends AbstractUiWidgetMainWindow<UiWidgetAdapterGwtMainWindow> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   */
  public UiWidgetMainWindowGwt(UiContext context) {

    this(context, null);
  }

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public UiWidgetMainWindowGwt(UiContext context, UiWidgetAdapterGwtMainWindow widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected UiWidgetAdapterGwtMainWindow createWidgetAdapter() {

    return new UiWidgetAdapterGwtMainWindow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isWindowPositionAbsolute() {

    return false;
  }

}
