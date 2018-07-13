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

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.AbstractUiBindingConfiguration;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAPopupMenuBuilder;

/**
 * A custom body menu configuration.
 * 
 * @author Sandu Postaru
 *
 */
public class MABodyMenuConfiguration extends AbstractUiBindingConfiguration {

  protected final Menu bodyMenu;

  public MABodyMenuConfiguration(NatTable natTable) {
    super();
    this.bodyMenu = createBodyHeaderMenu(natTable).build();
  }

  protected MAPopupMenuBuilder createBodyHeaderMenu(NatTable natTable) {
    return new MAPopupMenuBuilder(natTable);      
  }

  @Override
  public void configureUiBindings(UiBindingRegistry uiBindingRegistry) {
    if (this.bodyMenu != null) {
      uiBindingRegistry.registerMouseDownBinding(
          new MouseEventMatcher(SWT.NONE, GridRegion.BODY, MouseEventMatcher.RIGHT_BUTTON),
          new PopupMenuAction(this.bodyMenu));
    }
  }

}
