/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.handler.action;

import net.sf.mmm.client.ui.api.event.UiEvent;

/**
 * This is the {@link UiHandlerAction} for the action {@link #onNext(UiEvent) next}.
 * 
 * @see UiHandlerActionPrevious
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface UiHandlerActionNext extends UiHandlerAction {

  /**
   * This method is invoked for the action <em>next</em>. This means that something should proceed to the next
   * object (page, dialog, song, movie, etc.).
   * 
   * @param event is the {@link UiEvent} that triggered this action.
   */
  void onNext(UiEvent event);

}
