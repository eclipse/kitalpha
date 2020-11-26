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
package org.polarsys.kitalpha.massactions.core.table.layer.row;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.RowHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.data.provider.MAImageRowHeaderDataProvider;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * Default implementation of the {@link IMARowHeaderLayer}.
 *
 * @author Sandu Postaru
 * 
 */
public class MARowHeaderLayer extends AbstractLayerTransform implements IMARowHeaderLayer {

	public static final int DEFAULT_ROW_HEIGHT = 20;
	public static final int DEFAULT_COLUMN_WIDTH = 50;

	protected final IMABodyLayer bodyLayerStack;

	protected IDataProvider rowHeaderDataProvider;
	protected ILayer rowHeaderLayer;

	public MARowHeaderLayer(IMABodyLayer bodyLayerStack) {

		this.bodyLayerStack = bodyLayerStack;

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

		rowHeaderDataProvider = new MAImageRowHeaderDataProvider(bodyLayerStack.getBodyDataProvider());
		DataLayer rowHeaderDataLayer = new DataLayer(rowHeaderDataProvider, DEFAULT_COLUMN_WIDTH, DEFAULT_ROW_HEIGHT);
		rowHeaderLayer = new RowHeaderLayer(rowHeaderDataLayer, bodyLayerStack.getViewportLayer(),
				bodyLayerStack.getSelectionLayer());

		return rowHeaderLayer;
	}

	@Override
	public void dataChanged(Collection<EObject> newData) {
		// nothing to update for this layer
	}

	@Override
	public IDataProvider getRowHeaderDataProvider() {
		return rowHeaderDataProvider;
	}
}
