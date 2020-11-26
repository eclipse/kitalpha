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
package org.polarsys.kitalpha.massactions.edit.config;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.polarsys.kitalpha.massactions.core.config.MAMenuConfiguration;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAPopupMenuBuilder;
import org.polarsys.kitalpha.massactions.edit.ui.menu.MEPopupMenuBuilder;

/**
 * A custom body menu configuration.
 * 
 * @author Sandu Postaru
 *
 */
public class MEMenuConfiguration extends MAMenuConfiguration {

  public MEMenuConfiguration(NatTable natTable) {
    super(natTable);
  }

  @Override
  protected MEPopupMenuBuilder createBodyMenuBuilder(NatTable natTable) {
    return new MEPopupMenuBuilder(natTable).withEditSelectionMenuItem();
  }

}
