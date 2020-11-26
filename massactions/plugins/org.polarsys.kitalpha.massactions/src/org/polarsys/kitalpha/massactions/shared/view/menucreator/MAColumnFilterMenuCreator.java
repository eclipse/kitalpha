/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.shared.view.menucreator;

import java.util.List;

import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter.IMAColumnFilter;
import org.polarsys.kitalpha.massactions.core.table.IMATable;

/**
 * A column filter menu creator, allowing for the selection and application of a column filter.
 * 
 * @author Sandu Postaru
 *
 */
public class MAColumnFilterMenuCreator implements IMenuCreator {

  protected IMATable table;

  protected Menu filterMenu;
  protected MenuItem selectedFilterItem;

  public MAColumnFilterMenuCreator(IMATable table) {
    this.table = table;
  }

  protected MenuItem createFilterMenuItem(Menu parentMenu, IMAColumnFilter filter, boolean selected) {
    MenuItem filterMenuItem = new MenuItem(parentMenu, SWT.CHECK);
    filterMenuItem.setText(filter.getDisplayName());

    filterMenuItem.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {

        // close the active cell editor to avoid propagating the value
        // to a new column
        table.commitAndCloseActiveCellEditor();
        // clear the selection to avoid propagating it to a new column
        table.clearSelection();

        // new filter selected
        if (selectedFilterItem != filterMenuItem) {
          selectedFilterItem.setSelection(false);
          selectedFilterItem = filterMenuItem;
          table.applyColumnFilter(filter);
        }
        // reselect the old one
        else {
          selectedFilterItem.setSelection(true);
        }

      }
    });

    if (selected) {
      selectedFilterItem = filterMenuItem;
      filterMenuItem.setSelection(selected);
    }

    return filterMenuItem;
  }

  @Override
  public void dispose() {
    if (filterMenu != null) {
      filterMenu.dispose();
    }
  }

  protected void createMenu() {
    List<IMAColumnFilter> columnFilters = table.getColumnFilterList();

    for (int i = 0; i < columnFilters.size(); i++) {
      IMAColumnFilter filter = columnFilters.get(i);
      boolean isSelected = (i == 0);
      createFilterMenuItem(filterMenu, filter, isSelected);
    }
  }

  @Override
  public Menu getMenu(Control parent) {

    // lazy initialization
    if (filterMenu == null) {
      filterMenu = new Menu(parent);
      createMenu();
    }

    return filterMenu;
  }

  @Override
  public Menu getMenu(Menu parent) {
    // lazy initialization
    if (filterMenu == null) {
      filterMenu = new Menu(parent);
      createMenu();
    }

    return filterMenu;
  }

}
