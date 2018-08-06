/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.config;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.AbstractUiBindingConfiguration;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuAction;
import org.eclipse.swt.SWT;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAPopupMenuBuilder;

public class MAMenuConfiguration extends AbstractUiBindingConfiguration {

  protected MAPopupMenuBuilder bodyMenuBuilder;

  protected MAPopupMenuBuilder rowHeaderMenuBuilder;

  protected MAPopupMenuBuilder columnHeaderMenuBuilder;

  protected MAPopupMenuBuilder cornerMenuBuilder;

  protected NatTable table;

  public MAMenuConfiguration(NatTable natTable) {
    table = natTable;
    columnHeaderMenuBuilder = createColumnHeaderMenuBuilder(natTable);
    rowHeaderMenuBuilder = createRowHeaderMenuBuilder(natTable);
    cornerMenuBuilder = createCornerMenuBuilder(natTable);
    bodyMenuBuilder = createBodyMenuBuilder(natTable);
  }
  
  public MenuManager getBodyMenuManager() {
    return bodyMenuBuilder.getMenuManager();
  }

  public MenuManager getRowHeaderMenuManager() {
    return rowHeaderMenuBuilder.getMenuManager();
  }

  public MenuManager getColumnHeaderMenuManager() {
    return columnHeaderMenuBuilder.getMenuManager();
  }

  public MenuManager getCornerMenuManager() {
    return cornerMenuBuilder.getMenuManager();
  }

  protected MAPopupMenuBuilder createColumnHeaderMenuBuilder(NatTable natTable) {
    // default options
    MAPopupMenuBuilder popupMenuBuilder = (MAPopupMenuBuilder) new MAPopupMenuBuilder(natTable)
        .withColumnChooserMenuItem().withHideColumnMenuItem().withShowAllColumnsMenuItem()
        .withAutoResizeSelectedColumnsMenuItem();

    return popupMenuBuilder;
  }

  protected MAPopupMenuBuilder createCornerMenuBuilder(NatTable natTable) {
    return new MAPopupMenuBuilder(natTable);
  }

  protected MAPopupMenuBuilder createBodyMenuBuilder(NatTable natTable) {
    return new MAPopupMenuBuilder(natTable);
  }

  protected MAPopupMenuBuilder createRowHeaderMenuBuilder(NatTable natTable) {
    return new MAPopupMenuBuilder(natTable);
  }

  @Override
  public void configureUiBindings(UiBindingRegistry uiBindingRegistry) {

    if (this.bodyMenuBuilder != null) {
      uiBindingRegistry.registerMouseDownBinding(
          new MouseEventMatcher(SWT.NONE, GridRegion.BODY, MouseEventMatcher.RIGHT_BUTTON),
          new PopupMenuAction(this.bodyMenuBuilder.build()));
    }

    if (this.columnHeaderMenuBuilder != null) {
      uiBindingRegistry.registerMouseDownBinding(
          new MouseEventMatcher(SWT.NONE, GridRegion.COLUMN_HEADER, MouseEventMatcher.RIGHT_BUTTON),
          new PopupMenuAction(this.columnHeaderMenuBuilder.build()));
    }

    if (this.rowHeaderMenuBuilder != null) {
      uiBindingRegistry.registerMouseDownBinding(
          new MouseEventMatcher(SWT.NONE, GridRegion.ROW_HEADER, MouseEventMatcher.RIGHT_BUTTON),
          new PopupMenuAction(this.rowHeaderMenuBuilder.build()));
    }

    if (this.cornerMenuBuilder != null) {
      uiBindingRegistry.registerMouseDownBinding(
          new MouseEventMatcher(SWT.NONE, GridRegion.CORNER, MouseEventMatcher.RIGHT_BUTTON),
          new PopupMenuAction(this.cornerMenuBuilder.build()));
    }
  }

}
