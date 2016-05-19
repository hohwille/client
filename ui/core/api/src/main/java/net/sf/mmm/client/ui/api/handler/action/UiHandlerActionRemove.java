/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.api.handler.action;

import net.sf.mmm.client.ui.api.event.UiEvent;

/**
 * This is the {@link UiHandlerAction} for the action {@link #onRemove(UiEvent) remove}.
 * 
 * @see UiHandlerActionDelete
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public interface UiHandlerActionRemove extends UiHandlerAction {

  /**
   * This method is invoked for the action <em>remove</em>. This means that something is removed. Unlike
   * {@link UiHandlerActionDelete#onDelete(UiEvent) delete} this operation will NOT (immediately) perform a
   * persistent change. E.g. this action is appropriate for removing entries from a list locally while the
   * user still has the option to {@link UiHandlerActionSave#onSave(UiEvent) save} or
   * {@link UiHandlerActionCancel#onCancel(UiEvent) cancel} his changes.
   * 
   * @param event is the {@link UiEvent} that triggered this action.
   */
  void onRemove(UiEvent event);

}
