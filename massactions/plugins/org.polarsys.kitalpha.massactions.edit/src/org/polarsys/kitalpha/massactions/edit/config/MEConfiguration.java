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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.sort.config.SingleClickSortConfiguration;
import org.polarsys.kitalpha.massactions.core.config.IMAConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAColumnConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAExportConfiguration;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;

/**
 * Configures the NatTable instance for Mass Editing operations.
 * 
 * @author Sandu Postaru
 * 
 */
public class MEConfiguration implements IMAConfiguration {

	protected final NatTable natTable;
	protected final IMAGridLayer gridLayer;
	protected MAColumnConfiguration editorConfiguration;

	public MEConfiguration(NatTable natTable, IConfigRegistry configRegistry) {
		this.natTable = natTable;
		this.gridLayer = (IMAGridLayer) natTable.getLayer();

		// important since the previous layer use the registry
		// we must ensure we use the same one
		this.natTable.setConfigRegistry(configRegistry);		

		addConfigurations();
	}

	protected void addConfigurations() {
		addThemeConfiguration();

		addColumnConfiguration();

		addSortConfiguration();
		
		addExportConfiguration();

		addBodyMenuConfiguration();
		addHeaderMenuConfiguration();
	}

	protected void addHeaderMenuConfiguration() {
		natTable.addConfiguration(new MEHeaderMenuConfiguration(natTable));
	}

	protected void addBodyMenuConfiguration() {
		natTable.addConfiguration(new MEBodyMenuConfiguration(natTable));
	}

	protected void addThemeConfiguration() {
		this.natTable.addConfiguration(new METhemeConfiguration());
	}

	protected void addColumnConfiguration() {
		editorConfiguration = new MAColumnConfiguration(gridLayer.getBodyLayer());
		natTable.addConfiguration(editorConfiguration);
	}

	protected void addSortConfiguration() {
		natTable.addConfiguration(new SingleClickSortConfiguration());
	}
	
  protected void addExportConfiguration() {
    natTable.addConfiguration(new MAExportConfiguration());
  }

	@Override
	public void apply() {
		natTable.configure();
		fillDefaults();
	}

	protected void fillDefaults() {
		GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);
	}

	@Override
	public void dataChanged(Collection<EObject> data) {
		editorConfiguration.dataChanged(data);

		natTable.configure();
		natTable.refresh();
	}

	@Override
	public void dispose() {
		editorConfiguration.dispose();
	}

}
