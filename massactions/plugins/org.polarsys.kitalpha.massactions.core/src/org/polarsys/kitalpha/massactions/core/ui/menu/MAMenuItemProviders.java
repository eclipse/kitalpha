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
package org.polarsys.kitalpha.massactions.core.ui.menu;

import org.eclipse.nebula.widgets.nattable.ui.menu.IMenuItemProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.MenuItem;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;

/**
 * Helper class that provides several {@link IMenuItemProvider} for menu items that can be used within a popup menu in
 * the NatTable to execute NatTable specific actions.
 * 
 * @author Sandu Postaru
 */
public class MAMenuItemProviders {

  private static final String REMOVE_ELEMENT_MENU_ITEM_TEXT = "Remove selection and reset";

  protected MAMenuItemProviders() {
    // Exists only to defeat instantiation.
  }

  public static IMenuItemProvider createRemoveSelectionMenuItemProvider() {
    return createRemoveSelectionMenuItemProvider(REMOVE_ELEMENT_MENU_ITEM_TEXT);
  }

  public static IMenuItemProvider createRemoveSelectionMenuItemProvider(final String menuText) {
    return (natTable, popupMenu) -> {
      MenuItem menuItem = new MenuItem(popupMenu, SWT.PUSH);

      menuItem.setText(menuText);
      menuItem.setEnabled(true);

      menuItem.setImage(MACoreActivator.getDefault().getImageRegistry().get(MACoreActivator.IMAGE_REMOVE));

      menuItem.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent event) {
          // to be implemented, check CellSelectionHelper
        }
      });
    };
  }

}
