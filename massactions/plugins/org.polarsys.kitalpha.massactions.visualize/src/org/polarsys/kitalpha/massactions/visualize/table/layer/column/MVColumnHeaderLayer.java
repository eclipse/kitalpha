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
package org.polarsys.kitalpha.massactions.visualize.table.layer.column;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByHeaderLayer;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultColumnHeaderDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.MABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.MAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.visualize.table.layer.body.MVBodyLayer;

/**
 * A extension of the default {@link MAColumnHeaderLayer}.
 * 
 * In a Mass Visualization context the {@link GroupByHeaderLayer} is the topmost
 * layer that needs to perform internal changes before notifying the
 * {@link MABodyLayer}, where as in a Mass Editing context the
 * {@link ColumnHeaderLayer} had this role.
 *
 * We therefore need this extension layer in order to avoid notifying the
 * {@link MABodyLayer} before the {@link GroupByHeaderLayer} performed its
 * internal changes.
 * 
 * @author Sandu Postaru
 *  
 */
public class MVColumnHeaderLayer extends MAColumnHeaderLayer {

	public MVColumnHeaderLayer(IMABodyLayer bodyLayerStack, IConfigRegistry configRegistry) {
		super(bodyLayerStack, configRegistry);
	}

	@Override
	protected ILayer initializeLayer() {
		ILayer finalLayer = super.initializeLayer();

		// connect sortModel to GroupByDataLayer to support sorting by group by
		// (first column)
		MVBodyLayer bodyLayer = (MVBodyLayer) bodyLayerStack;
		bodyLayer.getBodyDataLayer().initializeTreeComparator(sortHeaderLayer.getSortModel(), bodyLayer.getTreeLayer(),
				true);

		return finalLayer;
	}

	@Override
	public void dataChanged(Collection<EObject> data) {

		configureBodyLayerLabels();

		String[] columnNames = columnPropertyAccessor.getColumnPropertiesArray();

		this.columnHeaderDataProvider = new DefaultColumnHeaderDataProvider(columnNames);
		columnHeaderDataLayer.setDataProvider(columnHeaderDataProvider);

		configureColumnHeaderLayerLabels();

		updateSortedColumns();
		updateFilteredColumns();
		updateReorderedColumns();
		updateHiddenColumns();
	}

}
