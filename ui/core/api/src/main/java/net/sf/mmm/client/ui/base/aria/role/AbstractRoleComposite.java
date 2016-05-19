/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.aria.role;

import net.sf.mmm.client.ui.api.aria.role.RoleComposite;

/**
 * This is the abstract base implementation of {@link RoleComposite}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class AbstractRoleComposite extends AbstractRole implements RoleComposite {

  /** @see #getActiveDescendant() */
  private String activeDescendant;

  /**
   * The constructor.
   */
  public AbstractRoleComposite() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setActiveDescendant(String id) {

    this.activeDescendant = id;
    setAttribute(HTML_ATTRIBUTE_ARIA_ACTIVE_DESCENDANT, id);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getActiveDescendant() {

    return this.activeDescendant;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void updateDelegate() {

    super.updateDelegate();
    if (this.activeDescendant != null) {
      setActiveDescendant(this.activeDescendant);
    }
  }

}
