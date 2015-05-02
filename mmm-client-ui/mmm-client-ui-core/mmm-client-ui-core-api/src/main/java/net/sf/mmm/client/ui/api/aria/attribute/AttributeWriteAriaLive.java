/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.aria.attribute;

import net.sf.mmm.client.ui.api.aria.datatype.AriaLiveLevel;

/**
 * This interface gives read and write access to the {@link #getLive() live} attribute of an object.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract interface AttributeWriteAriaLive extends AttributeReadAriaLive {

  /**
   * This method sets the {@link #getLive() live} attribute of this object.
   * 
   * @param live is the new value of {@link #getLive()}. May be <code>null</code> to unset.
   */
  void setLive(AriaLiveLevel live);

}
