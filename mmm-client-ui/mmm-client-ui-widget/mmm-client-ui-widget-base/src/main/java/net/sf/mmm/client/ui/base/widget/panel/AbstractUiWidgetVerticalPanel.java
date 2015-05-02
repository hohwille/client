/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.panel;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.UiWidgetRegular;
import net.sf.mmm.client.ui.api.widget.panel.UiWidgetVerticalPanel;
import net.sf.mmm.client.ui.base.widget.panel.adapter.UiWidgetAdapterVerticalPanel;

/**
 * This is the abstract base implementation of {@link UiWidgetVerticalPanel}.
 *
 * @param <ADAPTER> is the generic type of {@link #getWidgetAdapter()}.
 *
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class AbstractUiWidgetVerticalPanel<ADAPTER extends UiWidgetAdapterVerticalPanel> extends
    AbstractUiWidgetDynamicPanel<ADAPTER, UiWidgetRegular> implements UiWidgetVerticalPanel {

  /**
   * The constructor.
   *
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public AbstractUiWidgetVerticalPanel(UiContext context, ADAPTER widgetAdapter) {

    super(context, widgetAdapter);
    setPrimaryStyle(STYLE_PRIMARY);
  }

}
