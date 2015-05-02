/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.aria.role;

import net.sf.mmm.client.ui.api.aria.role.RoleLink;

/**
 * This is the implementation of {@link RoleLink}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public final class RoleLinkImpl extends AbstractRoleWithAttributeExpanded implements RoleLink {

  /**
   * The constructor.
   */
  public RoleLinkImpl() {

    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getName() {

    return ARIA_ROLE_LINK;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Class<RoleLink> getRoleInterface() {

    return RoleLink.class;
  }

}
