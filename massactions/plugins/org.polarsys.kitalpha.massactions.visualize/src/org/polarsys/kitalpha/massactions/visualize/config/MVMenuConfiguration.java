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
package org.polarsys.kitalpha.massactions.visualize.config;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuBuilder;
import org.polarsys.kitalpha.massactions.core.config.MAMenuConfiguration;
import org.polarsys.kitalpha.massactions.visualize.ui.menu.MVPopupMenuBuilder;

/**
 * A custom header menu configuration.
 * 
 * @author Sandu Postaru
 *
 */
public class MVMenuConfiguration extends MAMenuConfiguration {

	public MVMenuConfiguration(NatTable natTable) {
		super(natTable);
	}

	@Override
	protected MVPopupMenuBuilder createColumnHeaderMenuBuilder(NatTable natTable) {

	  // default options
	  PopupMenuBuilder popupMenuBuilder = new MVPopupMenuBuilder(natTable)
				.withColumnChooserMenuItem()
				.withHideColumnMenuItem()
				.withShowAllColumnsMenuItem()
				.withAutoResizeSelectedColumnsMenuItem();
	  
	  // custom options	  
	  return ((MVPopupMenuBuilder) popupMenuBuilder)
	      .withSwitchPerspectiveMenuItem();
	}
	
}
