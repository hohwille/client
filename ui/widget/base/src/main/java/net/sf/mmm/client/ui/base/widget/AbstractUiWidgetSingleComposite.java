/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.client.ui.base.widget;

import net.sf.mmm.client.ui.api.UiContext;
import net.sf.mmm.client.ui.api.widget.UiWidget;
import net.sf.mmm.client.ui.api.widget.UiWidgetSingleComposite;
import net.sf.mmm.client.ui.base.widget.adapter.UiWidgetAdapterSingleComposite;

/**
 * This is the abstract base implementation of {@link UiWidgetSingleComposite}.
 * 
 * @param <ADAPTER> is the generic type of {@link #getWidgetAdapter()}.
 * @param <CHILD> is the generic type of the {@link #getChild(int) children}.
 * 
 * @author Joerg Hohwiller (hohwille at users.sourceforge.net)
 * @since 1.0.0
 */
public abstract class AbstractUiWidgetSingleComposite<ADAPTER extends UiWidgetAdapterSingleComposite<CHILD>, CHILD extends UiWidget>
    extends AbstractUiWidgetComposite<ADAPTER, CHILD> implements UiWidgetSingleComposite<CHILD> {

  /** @see #getChild() */
  private CHILD child;

  /**
   * The constructor.
   * 
   * @param context is the {@link #getContext() context}.
   * @param widgetAdapter is the {@link #getWidgetAdapter() widget adapter}. Typically <code>null</code> for
   *        lazy initialization.
   */
  public AbstractUiWidgetSingleComposite(UiContext context, ADAPTER widgetAdapter) {

    super(context, widgetAdapter);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void initializeWidgetAdapter(ADAPTER adapter) {

    super.initializeWidgetAdapter(adapter);
    if (this.child != null) {
      adapter.setChild(this.child);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final int getChildIndex(UiWidget childWidget) {

    if ((childWidget == this.child) && (childWidget != null)) {
      return 0;
    }
    return -1;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final CHILD getChild(int index) {

    if (index == 0) {
      if (this.child != null) {
        return this.child;
      }
    }
    throw new IndexOutOfBoundsException(Integer.toString(index));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final CHILD getChild() {

    return this.child;
  }

  /**
   * @see net.sf.mmm.client.ui.api.widget.UiWidgetSingleMutableComposite#setChild(UiWidget)
   * 
   * @param child is the new {@link #getChild() child}.
   */
  protected void setChild(CHILD child) {

    if (this.child != null) {
      removeFromParent(this.child);
      onChildRemoved(this.child);
    }
    if (hasWidgetAdapter()) {
      getWidgetAdapter().setChild(child);
    }
    doSetChild(this.child, child);
    this.child = child;
    if (child != null) {
      setParent(child, this);
      onChildSet(child);
    }
  }

  /**
   * @param oldChild is the child that has just been removed.
   */
  protected void onChildRemoved(CHILD oldChild) {

    // nothing by default...
  }

  /**
   * @param newChild is the child that has just been set.
   */
  protected void onChildSet(CHILD newChild) {

    // nothing by default...
  }

  /**
   * This method is called from {@link #setChild(UiWidget)}. It can be overridden to implement custom logic
   * (e.g. attaching the child to {@link #getWidgetAdapter()}).
   * 
   * @param oldChild is the old {@link #getChild() child} that is replaced or <code>null</code> if no child
   *        was set.
   * @param newChild is the new {@link #getChild() child}.
   */
  protected void doSetChild(CHILD oldChild, CHILD newChild) {

    // nothing to do by default...
    // remove this method???
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getChildCount() {

    if (this.child == null) {
      return 0;
    } else {
      return 1;
    }
  }

}
