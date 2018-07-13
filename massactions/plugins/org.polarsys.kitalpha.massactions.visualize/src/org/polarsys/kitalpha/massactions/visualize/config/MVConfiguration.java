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
package org.polarsys.kitalpha.massactions.visualize.config;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByHeaderMenuConfiguration;
import org.eclipse.nebula.widgets.nattable.sort.config.SingleClickSortConfiguration;
import org.polarsys.kitalpha.massactions.core.config.IMAConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAColumnConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAExportConfiguration;
import org.polarsys.kitalpha.massactions.visualize.table.layer.groupby.IMVGroupByLayer;

/**
 * Configures the NatTable instance for Mass Visualization operations.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVConfiguration implements IMAConfiguration {

	protected final NatTable natTable;
	protected final IMVGroupByLayer groupByLayer;
	protected MAColumnConfiguration editorConfiguration;
	protected IConfigRegistry configRegistry;

	public MVConfiguration(NatTable natTable, IConfigRegistry configRegistry) {
		this.natTable = natTable;
		this.configRegistry = configRegistry;
		this.groupByLayer = (IMVGroupByLayer) natTable.getLayer();

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

		addHeaderMenuConfiguration();
		addGroupByHeaderMenuConfiguration();
	}

	protected void addHeaderMenuConfiguration() {
		natTable.addConfiguration(new MVHeaderMenuConfiguration(natTable));
	}

	protected void addGroupByHeaderMenuConfiguration() {
		natTable.addConfiguration(new GroupByHeaderMenuConfiguration(natTable, groupByLayer.getGroupByHeaderLayer()));
	}

	protected void addThemeConfiguration() {
		this.natTable.addConfiguration(new MVThemeConfiguration());
	}

	protected void addColumnConfiguration() {
		editorConfiguration = new MAColumnConfiguration(groupByLayer.getGridLayer().getBodyLayer());
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
