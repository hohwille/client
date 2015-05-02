/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.custom.panel;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.panel.UiWidgetGridPanel;
import net.sf.mmm.client.ui.api.widget.panel.UiWidgetGridRow;
import net.sf.mmm.client.ui.base.widget.custom.UiWidgetCustomComposite;

/**
 * This is the abstract base class for a {@link UiWidgetCustomComposite custom composite widget} that adapts a
 * {@link UiWidgetGridPanel}. It is typically used for building a reusable form to edit business objects.
 * 
 * @param <VALUE> is the generic type of the {@link #getValue() value}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class UiWidgetCustomGridPanel<VALUE> extends
    UiWidgetCustomComposite<VALUE, UiWidgetGridRow, UiWidgetGridPanel> {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param valueClass is the {@link #getValueClass() value class}.
   */
  public UiWidgetCustomGridPanel(UiContext context, Class<VALUE> valueClass) {

    super(context, context.getWidgetFactory().create(UiWidgetGridPanel.class), valueClass);
  }

}
