/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.core;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.aria.role.Role;
import net.sf.mmm.client.ui.api.aria.role.RoleHeading;
import net.sf.mmm.client.ui.api.widget.core.UiWidgetSection;
import net.sf.mmm.client.ui.base.widget.AbstractUiWidgetWithLabel;
import net.sf.mmm.client.ui.base.widget.core.adapter.UiWidgetAdapterSection;

/**
 * This is the abstract base implementation of {@link UiWidgetSection}.
 * 
 * @param <ADAPTER> is the generic type of {@link #getWidgetAdapter()}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class AbstractUiWidgetSection<ADAPTER extends UiWidgetAdapterSection> extends
    AbstractUiWidgetWithLabel<ADAPTER> implements UiWidgetSection {

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public AbstractUiWidgetSection(UiContext context, ADAPTER widgetAdapter) {

    super(context, widgetAdapter);
    setPrimaryStyle(STYLE_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public RoleHeading getAriaRole() {

    return (RoleHeading) super.getAriaRole();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Class<? extends Role> getAriaRoleFixedType() {

    return RoleHeading.class;
  }

}
