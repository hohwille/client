/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget.adapter;

import net.sf.mmm.client.ui.api.widget.UiWidget;

/**
 * This is the interface for a {@link UiWidgetAdapter} adapting
 * {@link net.sf.mmm.client.ui.api.widget.UiWidgetComposite}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 * @param <CHILD> is the generic type of the children.
 */
public interface UiWidgetAdapterComposite<CHILD extends UiWidget> extends UiWidgetAdapter {

  // nothing to add...

}
