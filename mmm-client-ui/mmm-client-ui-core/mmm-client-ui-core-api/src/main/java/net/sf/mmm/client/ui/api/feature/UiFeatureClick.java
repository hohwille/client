/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.feature;

import net.sf.mmm.client.ui.api.handler.event.UiHandlerEventClick;

/**
 * This is the interface for the {@link UiFeature features} of a clickable object. It can be {@link #click()
 * clicked} and allows to {@link #addClickHandler(UiHandlerEventClick) add} and
 * {@link #removeClickHandler(UiHandlerEventClick) remove} instances of {@link UiHandlerEventClick}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface UiFeatureClick extends UiFeature {

  /**
   * This method adds the given {@link UiHandlerEventClick} to this object.
   * 
   * @param handler is the {@link UiHandlerEventClick} to add.
   */
  void addClickHandler(UiHandlerEventClick handler);

  /**
   * This method removes the given {@link UiHandlerEventClick} from this object.
   * 
   * @param handler is the {@link UiHandlerEventClick} to remove.
   * @return <code>true</code> if the <code>handler</code> has been removed successfully, <code>false</code>
   *         if it was NOT {@link #addClickHandler(UiHandlerEventClick) registered} and nothing has changed.
   */
  boolean removeClickHandler(UiHandlerEventClick handler);

  /**
   * This method programmatically
   * {@link UiHandlerEventClick#onClick(net.sf.mmm.client.ui.api.event.UiEventClick) notifies} all
   * {@link #addClickHandler(UiHandlerEventClick) registered} {@link UiHandlerEventClick listeners}.
   */
  void click();

}
