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
package org.polarsys.kitalpha.massactions.edit.ui.menu;

import org.eclipse.nebula.widgets.nattable.edit.command.EditSelectionCommand;
import org.eclipse.nebula.widgets.nattable.ui.menu.IMenuItemProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.MenuItem;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAMenuItemProviders;

public class MEMenuItemProviders extends MAMenuItemProviders {

  private static final String EDIT_SELECTION_MENU_ITEM_TEXT = "Edit selection";

  protected MEMenuItemProviders() {
    // Exists only to defeat instantiation.
  }

  public static IMenuItemProvider createEditSelectionMenuItemProvider() {
    return createEditSelectionColumnMenuItemProvider(EDIT_SELECTION_MENU_ITEM_TEXT);
  }

  public static IMenuItemProvider createEditSelectionColumnMenuItemProvider(final String menuText) {

    return (natTable, popupMenu) -> {

      MenuItem menuItem = new MenuItem(popupMenu, SWT.CASCADE);
      menuItem.setText(menuText);

      menuItem.setImage(MACoreActivator.getDefault().getImageRegistry().get(MACoreActivator.IMAGE_EDIT));

      menuItem.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent e) {
          natTable.doCommand(new EditSelectionCommand(natTable, natTable.getConfigRegistry(), null));
        }
      });
    };
  }
}
