/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget;

import net.sf.mmm.client.ui.api.common.UiMode;
import net.sf.mmm.client.ui.api.widget.UiWidget;
import net.sf.mmm.client.ui.base.UiModeChanger;
import net.sf.mmm.client.ui.base.widget.adapter.UiWidgetAdapter;

/**
 * This is the abstract base implementation of {@link UiModeChanger}. It delegates to
 * {@link UiWidgetAdapter#setMode(boolean)} if the {@link UiWidgetAdapter} has
 * {@link AbstractUiWidgetNative#hasWidgetAdapter() already been created}. Otherwise it does nothing.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class AbstractUiModeChanger implements UiModeChanger {

  /**
   * The constructor.
   */
  public AbstractUiModeChanger() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void changeMode(UiWidget widget, UiMode newMode) {

    AbstractUiWidgetNative<?, ?> nativeWidget = (AbstractUiWidgetNative<?, ?>) widget;
    if (nativeWidget.hasWidgetAdapter()) {
      UiWidgetAdapter widgetAdapter = nativeWidget.getWidgetAdapter();
      changeMode(nativeWidget, newMode, widgetAdapter);
    }
  }

  /**
   * This method is called from {@link #changeMode(UiWidget, UiMode)} if the {@link UiWidgetAdapter} has
   * {@link AbstractUiWidgetNative#hasWidgetAdapter() already been created}.
   * 
   * @param widget is the {@link net.sf.mmm.client.ui.api.widget.UiWidget} where to change the {@link UiMode}
   *        to <code>newMode</code>.
   * @param newMode is the new {@link UiMode}.
   * @param widgetAdapter is the {@link UiWidgetAdapter} of the <code>widget</code>.
   */
  protected void changeMode(AbstractUiWidgetNative<?, ?> widget, UiMode newMode, UiWidgetAdapter widgetAdapter) {

    widgetAdapter.setMode(newMode.isEditable());
  }

}
