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
package org.polarsys.kitalpha.massactions.core.table.layer.corner;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultCornerDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.CornerLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;

/**
 * Default implementation of the {@link IMACornerLayer}.
 *
 * @author Sandu Postaru
 *
 */
public class MACornerLayer extends AbstractLayerTransform implements IMACornerLayer {

	protected final IMAColumnHeaderLayer columnHeaderLayerStack;
	protected final IMARowHeaderLayer rowHeaderLayerStack;

	protected DataLayer cornerDataLayer;
	protected IDataProvider cornerDataProvider;

	protected ILayer cornerLayer;

	public MACornerLayer(IMAColumnHeaderLayer columnHeaderLayerStack, IMARowHeaderLayer rowHeaderLayerStack) {

		this.columnHeaderLayerStack = columnHeaderLayerStack;
		this.rowHeaderLayerStack = rowHeaderLayerStack;

		ILayer finalLayer = initializeLayer();
		setUnderlyingLayer(finalLayer);
	}

	/**
	 * Initializes all the component stack using the provided
	 * {@link IMAFactory}.
	 * 
	 * @return the top NatTable layer of the stack that can be build upon by
	 *         components that inherit from this one.
	 */
	protected ILayer initializeLayer() {
		cornerDataProvider = new DefaultCornerDataProvider(columnHeaderLayerStack.getColumnHeaderDataProvider(),
				rowHeaderLayerStack.getRowHeaderDataProvider());
		cornerDataLayer = new DataLayer(cornerDataProvider);
		cornerLayer = new CornerLayer(cornerDataLayer, rowHeaderLayerStack, columnHeaderLayerStack);

		return cornerLayer;
	}

	@Override
	public void dataChanged(Collection<EObject> data) {

		// the column header changed so we must update
		cornerDataProvider = new DefaultCornerDataProvider(columnHeaderLayerStack.getColumnHeaderDataProvider(),
				rowHeaderLayerStack.getRowHeaderDataProvider());
		cornerDataLayer.setDataProvider(cornerDataProvider);
	}
}
