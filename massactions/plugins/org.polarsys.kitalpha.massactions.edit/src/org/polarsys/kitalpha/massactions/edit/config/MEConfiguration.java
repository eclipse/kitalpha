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
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.config.MAConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAMenuConfiguration;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.edit.helpers.LayerExtractionHelper;

/**
 * Configures the NatTable instance for Mass Editing operations.
 * 
 * @author Sandu Postaru
 * 
 */
public class MEConfiguration extends MAConfiguration {

	public MEConfiguration(NatTable natTable, IConfigRegistry configRegistry) {
	  super(natTable, configRegistry);
	}

	protected MAMenuConfiguration createMenuConfiguration() {
	  return new MEMenuConfiguration(natTable);
	}
	
  protected IMABodyLayer getBodyLayer() {
    return LayerExtractionHelper.extractBodyLayer(natTable);
  }

}
