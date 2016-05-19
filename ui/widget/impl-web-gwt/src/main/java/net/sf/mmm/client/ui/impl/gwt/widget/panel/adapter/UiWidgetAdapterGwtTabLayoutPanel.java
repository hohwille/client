/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.panel.adapter;

import net.sf.mmm.client.ui.api.widget.core.UiWidgetTab;
import net.sf.mmm.client.ui.base.widget.AbstractUiWidgetNative;
import net.sf.mmm.client.ui.base.widget.panel.adapter.UiWidgetAdapterTabPanel;
import net.sf.mmm.client.ui.impl.gwt.widget.adapter.UiWidgetAdapterGwtDynamicComposite;
import net.sf.mmm.client.ui.impl.gwt.widget.core.UiWidgetTabGwt;
import net.sf.mmm.client.ui.impl.gwt.widget.core.adapter.UiWidgetAdapterGwtTab;

import com.google.gwt.user.client.ui.TabPanel;

/**
 * This is the implementation of
 * {@link net.sf.mmm.client.ui.base.widget.panel.adapter.UiWidgetAdapterDynamicPanel} using GWT based on
 * {@link TabPanel}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetAdapterGwtTabLayoutPanel extends UiWidgetAdapterGwtDynamicComposite<TabPanel, UiWidgetTab>
    implements UiWidgetAdapterTabPanel {

  /**
   * The constructor.
   */
  public UiWidgetAdapterGwtTabLayoutPanel() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected TabPanel createToplevelWidget() {

    TabPanel tabLayoutPanel = new TabPanel(); // new TabLayoutPanel(1.5, Unit.EM);
    // tabLayoutPanel.setWidth("100%");
    return tabLayoutPanel;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void showChild(int index) {

    getToplevelWidget().selectTab(index);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void addChild(UiWidgetTab child, int index) {

    UiWidgetTabGwt tabWidget = (UiWidgetTabGwt) child;
    UiWidgetAdapterGwtTab widgetAdapter = AbstractUiWidgetNative.getWidgetAdapter(tabWidget);
    if (index >= 0) {
      getToplevelWidget().insert(widgetAdapter.getContentPanel(), widgetAdapter.getToplevelWidget(), index);
    } else {
      getToplevelWidget().add(widgetAdapter.getContentPanel(), widgetAdapter.getToplevelWidget());
    }
  }

}
