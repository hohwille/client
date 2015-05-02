/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.widget.field;

import net.sf.mmm.client.ui.api.attribute.AttributeWriteMaximumTextLength;

/**
 * This is the interface for a {@link UiWidgetField field widget} that allows to enter textual input.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 * @param <VALUE> is the generic type of the {@link #getValue() value}. Typically {@link String} from here.
 */
public interface UiWidgetTextualInputField<VALUE> extends UiWidgetField<VALUE>, AttributeWriteMaximumTextLength {

  // nothing to add

}
