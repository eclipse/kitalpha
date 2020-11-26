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
package org.polarsys.kitalpha.massactions.core.table.layer.grid;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.grid.layer.GridLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.IMACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;

/**
 * Default implementation of the {@link IMAGridLayer}.
 *
 * @author Sandu Postaru
 *
 */
public class MAGridLayer extends GridLayer implements IMAComponent, IMAGridLayer {

	public MAGridLayer(IMABodyLayer bodyLayerStack, IMAColumnHeaderLayer columnHeaderLayerStack,
			IMARowHeaderLayer rowHeaderLayerStack, IMACornerLayer cornerLayerStack) {
		super(true);

		setBodyLayer(bodyLayerStack);
		setColumnHeaderLayer(columnHeaderLayerStack);
		setRowHeaderLayer(rowHeaderLayerStack);
		setCornerLayer(cornerLayerStack);
	}

	@Override
	public void dataChanged(Collection<EObject> data) {
		getBodyLayer().dataChanged(data);
		getColumnHeaderLayer().dataChanged(data);
		getRowHeaderLayer().dataChanged(data);
		getCornerLayer().dataChanged(data);
	}

	@Override
	public IMABodyLayer getBodyLayer() {
		return (IMABodyLayer) super.getBodyLayer();
	}

	@Override
	public IMAColumnHeaderLayer getColumnHeaderLayer() {
		return (IMAColumnHeaderLayer) super.getColumnHeaderLayer();
	}

	@Override
	public IMARowHeaderLayer getRowHeaderLayer() {
		return (IMARowHeaderLayer) super.getRowHeaderLayer();
	}

	@Override
	public IMACornerLayer getCornerLayer() {
		return (IMACornerLayer) super.getCornerLayer();
	}
}
