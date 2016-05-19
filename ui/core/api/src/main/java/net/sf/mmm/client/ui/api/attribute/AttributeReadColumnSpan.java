/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.attribute;

/**
 * This interface gives read access to the {@link #getColumnSpan() columnSpan} attribute of an object.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract interface AttributeReadColumnSpan {

  /** The attribute name of {@link #getColumnSpan()}. */
  String ATTRIBUTE_COLSPAN = "colspan";

  /**
   * This method gets the number of columns spanned by this object (cell). This cell expands to that number of
   * cells horizontally so a value greater than <code>1</code> indicates that the next cells to the right are
   * connected.
   * 
   * @return the column span. By default <code>1</code>.
   */
  int getColumnSpan();

}
