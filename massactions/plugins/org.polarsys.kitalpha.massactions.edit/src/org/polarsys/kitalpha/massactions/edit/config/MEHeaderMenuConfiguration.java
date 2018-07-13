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
package org.polarsys.kitalpha.massactions.edit.config;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.ui.menu.AbstractHeaderMenuConfiguration;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuBuilder;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAPopupMenuBuilder;

/**
 * A custom header menu configuration.
 * 
 * @author Sandu Postaru
 *
 */
public class MEHeaderMenuConfiguration extends AbstractHeaderMenuConfiguration {

  public MEHeaderMenuConfiguration(NatTable natTable) {
    super(natTable);    
  }  

  @Override
  protected PopupMenuBuilder createColumnHeaderMenu(NatTable natTable) {
    return super.createColumnHeaderMenu(natTable)
        .withColumnChooserMenuItem()
        .withHideColumnMenuItem()
        .withShowAllColumnsMenuItem()
        .withAutoResizeSelectedColumnsMenuItem();
  }
  
  @Override
  protected PopupMenuBuilder createRowHeaderMenu(NatTable natTable) {   
    return new MAPopupMenuBuilder(natTable)
        .withRemoveSelectionMenuItem();
  }

}
