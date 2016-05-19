/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.impl.gwt.widget.field.adapter;

import net.sf.mmm.client.ui.base.widget.field.adapter.UiWidgetAdapterPasswordField;

import com.google.gwt.user.client.ui.PasswordTextBox;

/**
 * This is the implementation of {@link net.sf.mmm.client.ui.base.widget.field.adapter.UiWidgetAdapterField}
 * using GWT based on {@link PasswordTextBox}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public class UiWidgetAdapterGwtPasswordField extends UiWidgetAdapterGwtTextBoxBase<PasswordTextBox, String> implements
    UiWidgetAdapterPasswordField {

  /**
   * The constructor.
   */
  public UiWidgetAdapterGwtPasswordField() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected PasswordTextBox createActiveWidget() {

    return new PasswordTextBox();
  }

}
