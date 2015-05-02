/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.aria.role;

import net.sf.mmm.client.ui.api.aria.attribute.AttributeWriteAriaActiveDescendant;
import net.sf.mmm.client.ui.api.aria.attribute.AttributeWriteAriaAutocomplete;
import net.sf.mmm.client.ui.api.aria.attribute.AttributeWriteAriaMultiLine;
import net.sf.mmm.client.ui.api.aria.attribute.AttributeWriteAriaReadOnly;
import net.sf.mmm.client.ui.api.aria.attribute.AttributeWriteAriaRequired;

/**
 * This interface represents the <a href="http://www.w3.org/TR/wai-aria/roles#textbox">textbox</a> role.
 * 
 * @see #ARIA_ROLE_TEXTBOX
 * @see #WAI_ARIA
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface RoleTextbox extends RoleInput, AttributeWriteAriaActiveDescendant, AttributeWriteAriaAutocomplete,
    AttributeWriteAriaMultiLine, AttributeWriteAriaReadOnly, AttributeWriteAriaRequired {

  // nothing to add...

}
