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
package org.polarsys.kitalpha.massactions.core.data.provider;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;

/**
 * A data provider that delegates all of its actions to the underlying data
 * provider for the current layer.
 * 
 * We avoid using the underlying data provider directly, because when data
 * changes a new underlying data provider might be created. In order to avoid
 * updating the old reference with the new one for all the existing layers that
 * were using it, we use this delegate approach instead.
 * 
 * @author Sandu Postaru
 * 
 */
public class ColumnHeaderDelegateDataProvider implements IDataProvider {

	protected IMAColumnHeaderLayer columnHeaderLayer;

	public ColumnHeaderDelegateDataProvider(IMAColumnHeaderLayer columnHeaderLayer) {
		this.columnHeaderLayer = columnHeaderLayer;
	}

	@Override
	public Object getDataValue(int columnIndex, int rowIndex) {
		return columnHeaderLayer.getColumnHeaderDataProvider().getDataValue(columnIndex, rowIndex);
	}

	@Override
	public void setDataValue(int columnIndex, int rowIndex, Object newValue) {
		// do nothing
	}

	@Override
	public int getColumnCount() {
		return columnHeaderLayer.getColumnHeaderDataProvider().getColumnCount();
	}

	@Override
	public int getRowCount() {
		return columnHeaderLayer.getColumnHeaderDataProvider().getRowCount();
	}

}
