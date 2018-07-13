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
package org.polarsys.kitalpha.massactions.visualize.ui.menu;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.ui.menu.IMenuItemProvider;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAPopupMenuBuilder;

public class MVPopupMenuBuilder extends MAPopupMenuBuilder {

  public static final String SWITCH_PERSPECTIVE_MENU_ITEM_ID = "switchPerspectiveMenuItem"; //$NON-NLS-1$
  public static final String QUERY_CHOOSER_MENU_ITEM_ID = "queryChooserMenuItem"; //$NON-NLS-1$

  public MVPopupMenuBuilder(NatTable parent) {
    super(parent);
  }

  public MVPopupMenuBuilder(NatTable parent, MenuManager menuManager) {
    super(parent, menuManager);
  }

  public MVPopupMenuBuilder withQueryChooserMenuItem() {
    return withMenuItemProvider(QUERY_CHOOSER_MENU_ITEM_ID, MVMenuItemProviders.createQueryColumnMenuItemProvider());
  }

  public MVPopupMenuBuilder withSwitchPerspectiveMenuItem() {
    return withMenuItemProvider(SWITCH_PERSPECTIVE_MENU_ITEM_ID,
        MVMenuItemProviders.createSwitchPerspectiveColumnMenuItemProvider());
  }

  @Override
  public MVPopupMenuBuilder withMenuItemProvider(IMenuItemProvider menuItemProvider) {
    return (MVPopupMenuBuilder) super.withMenuItemProvider(menuItemProvider);
  }

  @Override
  public MVPopupMenuBuilder withMenuItemProvider(String id, IMenuItemProvider menuItemProvider) {
    return (MVPopupMenuBuilder) super.withMenuItemProvider(id, menuItemProvider);
  }

}
