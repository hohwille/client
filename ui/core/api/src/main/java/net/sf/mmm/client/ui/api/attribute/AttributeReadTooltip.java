/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.attribute;

/**
 * This interface gives read access to the {@link #getTooltip() tooltip} of an object.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract interface AttributeReadTooltip {

  /**
   * This method gets the tooltip of this object. It is a brief description that explains this object. If the
   * user remains on the object (e.g. with the mouse pointer) this tooltip is displayed as hover.
   * 
   * @return the text of this object.
   */
  String getTooltip();

}
