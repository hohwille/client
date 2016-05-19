/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.aria.attribute;

/**
 * This interface gives read and write access to the {@link #isRequired() required} attribute of an object.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract interface AttributeWriteAriaRequired extends AttributeReadAriaRequired {

  /**
   * This method sets the {@link #isRequired() required} property of this object.
   * 
   * @param required is the new value of {@link #isRequired()}.
   */
  void setRequired(boolean required);

}
