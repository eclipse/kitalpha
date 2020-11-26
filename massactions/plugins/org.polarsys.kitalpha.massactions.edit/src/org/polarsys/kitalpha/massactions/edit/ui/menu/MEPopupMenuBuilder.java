/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
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

import org.eclipse.jface.action.MenuManager;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.ui.menu.IMenuItemProvider;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAPopupMenuBuilder;

public class MEPopupMenuBuilder extends MAPopupMenuBuilder {

  public MEPopupMenuBuilder(NatTable parent) {
    super(parent);
  }

  public MEPopupMenuBuilder(NatTable parent, MenuManager menuManager) {
    super(parent, menuManager);
  }

  public MEPopupMenuBuilder withEditSelectionMenuItem() {
    return withMenuItemProvider(EDIT_SELECTION_MENU_ITEM_ID, MEMenuItemProviders.createEditSelectionMenuItemProvider());
  }

  @Override
  public MEPopupMenuBuilder withMenuItemProvider(IMenuItemProvider menuItemProvider) {
    return (MEPopupMenuBuilder) super.withMenuItemProvider(menuItemProvider);
  }

  @Override
  public MEPopupMenuBuilder withMenuItemProvider(String id, IMenuItemProvider menuItemProvider) {
    return (MEPopupMenuBuilder) super.withMenuItemProvider(id, menuItemProvider);
  }

}
