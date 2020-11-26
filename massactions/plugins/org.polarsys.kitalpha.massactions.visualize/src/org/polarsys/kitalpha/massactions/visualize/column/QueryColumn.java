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
package org.polarsys.kitalpha.massactions.visualize.column;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.polarsys.kitalpha.massactions.core.column.AbstractMAColumn;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.painter.cell.TextAndLabelImagePainter;
import org.polarsys.kitalpha.massactions.visualize.query.IQuery;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class QueryColumn extends AbstractMAColumn {

	protected IQuery query;
	protected List<String> parameterColumnNames;

	public void setParameterColumnPositions(int[] parameterColumnPositions) {
		List<String> columnNames = new ArrayList<>();

		SelectionLayer selectionLayer = bodyLayer.getSelectionLayer();
		IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();

		for (int i = 0; i < parameterColumnPositions.length; i++) {
			int position = parameterColumnPositions[i];
			// convert from the visual position to the actual column index
			int index = selectionLayer.getColumnIndexByPosition(position);
			String columnName = columnPropertyAccessor.getColumnProperty(index);

			columnNames.add(columnName);
		}

		setParameterColumnNames(columnNames);
	}

	public void setParameterColumnNames(List<String> parameterColumnNames) {
		this.parameterColumnNames = parameterColumnNames;
	}

	public void setParameterColumnNames(String... parameterColumnNames) {
		setParameterColumnNames(Arrays.asList(parameterColumnNames));
	}

	@Override
	protected ICellPainter createCellPainter() {
		return new TextAndLabelImagePainter();
	}

	@Override
	public Object getDataValue(EObject rowObject) {

		IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();

		List<Object> parameterValues = new ArrayList<>();

		for (String parameterColumnName : parameterColumnNames) {
			int parameterColumnIndex = columnPropertyAccessor.getColumnIndex(parameterColumnName);

			if (parameterColumnIndex == -1) {
				// column does not exist anymore in the current configuration
				// the query can not be evaluated
				return "undefined";
			}

			Object parameterColumnValue = columnPropertyAccessor.getDataValue(rowObject, parameterColumnIndex);
			parameterValues.add(parameterColumnValue);
		}

		// SHOULD check if query is valid!

		query.setParameterValues(parameterValues);
		query.setTarget(rowObject);

		return query.evaluate();
	}

	public void setQuery(IQuery query) {
		this.query = query;
	}

	@Override
	public void setDataValue(EObject rowObject, Object newValue) {
		// do nothing

	}

	@Override
	public void dataChanged(Collection<EObject> newData) {
		// do nothing
	}

}
