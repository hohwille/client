/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.attribute;

/**
 * This interface gives read and write access to the {@link #getHelpText() help text} of an object.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract interface AttributeWriteHelpText extends AttributeReadHelpText {

  /**
   * This method sets the {@link #getHelpText() help text} of this object.
   * 
   * @param helpText is the new {@link #getHelpText() help text}.
   */
  void setHelpText(String helpText);

}
