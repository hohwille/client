/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.window;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.event.UiEvent;
import net.sf.mmm.client.ui.api.handler.action.UiHandlerActionClose;
import net.sf.mmm.client.ui.api.widget.core.UiWidgetButton;
import net.sf.mmm.client.ui.api.widget.panel.UiWidgetButtonPanel;
import net.sf.mmm.client.ui.api.widget.window.UiWidgetPopup;
import net.sf.mmm.client.ui.base.widget.window.adapter.UiWidgetAdapterPopup;

/**
 * This is the abstract base implementation of {@link UiWidgetPopup}.
 * 
 * @param <ADAPTER> is the generic type of {@link #getWidgetAdapter()}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class AbstractUiWidgetPopup<ADAPTER extends UiWidgetAdapterPopup> extends
    AbstractUiWidgetAbstractDialogWindow<ADAPTER> implements UiWidgetPopup {

  /** @see #getButtonPanel() */
  private UiWidgetButtonPanel buttonPanel;

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public AbstractUiWidgetPopup(UiContext context, ADAPTER widgetAdapter) {

    super(context, widgetAdapter);
    addStyle(STYLE_POPUP);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UiWidgetButtonPanel getButtonPanel() {

    if (this.buttonPanel == null) {
      this.buttonPanel = createButtonPanel();
      setParent(this.buttonPanel, this);
    }
    return this.buttonPanel;
  }

  /**
   * @return the {@link UiWidgetButton button panel} instance located at the bottom of the popup.
   */
  protected abstract UiWidgetButtonPanel createButtonPanel();

  /**
   * {@inheritDoc}
   */
  @Override
  public UiWidgetButton createAndAddCloseButton() {

    UiHandlerActionClose closeHandler = new UiHandlerActionClose() {

      @Override
      public void onClose(UiEvent event) {

        setVisible(false, event.isProgrammatic());
      }
    };
    UiWidgetButton closeButton = getContext().getWidgetFactory().createButton(closeHandler);
    getButtonPanel().addChild(closeButton);
    return closeButton;
  }
}
