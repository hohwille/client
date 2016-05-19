/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.field.adapter;

import net.sf.mmm.util.lang.api.attribute.AttributeWriteMaximumValue;
import net.sf.mmm.util.lang.api.attribute.AttributeWriteMinimumValue;

/**
 * This is the interface for a {@link net.sf.mmm.client.ui.base.widget.adapter.UiWidgetAdapter} adapting
 * {@link net.sf.mmm.client.ui.api.widget.field.UiWidgetRangeField}.
 * 
 * @param <VALUE> is the generic type of the {@link #getValue() value}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface UiWidgetAdapterRangeField<VALUE> extends UiWidgetAdapterField<VALUE, VALUE>,
    AttributeWriteMinimumValue<VALUE>, AttributeWriteMaximumValue<VALUE> {

  // nothing to add

}
