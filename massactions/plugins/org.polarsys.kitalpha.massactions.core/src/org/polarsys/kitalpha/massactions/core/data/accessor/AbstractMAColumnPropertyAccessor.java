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
package org.polarsys.kitalpha.massactions.core.data.accessor;

import java.util.List;
import java.util.Map;

import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider.IMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * Abstract implementation of the {@link IMAColumnPropertyAccessor} contract.
 * 
 * Provides some generic utility methods for accessing the underlying data.
 * 
 * @author Sandu Postaru
 * 
 */
public abstract class AbstractMAColumnPropertyAccessor implements IMAColumnPropertyAccessor {

	/**
	 * List of current feature names used as column header values.
	 */
	protected List<String> columnProperties;

	/**
	 * List of previous feature names that were used as column header values
	 * before the last data changed call.
	 */
	protected List<String> prevColumnProperties;

	/**
	 * Internal index cache used in order to fast retrieve a column index for a
	 * column name.
	 */
	protected Map<String, Integer> columnPropertiesIndex;

	protected List<IMAColumn> columnList;
	protected List<IMAColumnProvider> columnProviders;

	protected IMABodyLayer bodyLayer;

	public AbstractMAColumnPropertyAccessor(IMABodyLayer bodyLayer) {
		this.bodyLayer = bodyLayer;
	}

	@Override
	public void beforeEditSelectionCommand() {

	}

	@Override
	public void afterEditSelectionCommand() {
	}

	@Override
	public void cleanResources() {
	}

	@Override
	public int getColumnCount() {
		return this.columnProperties.size();
	}

	@Override
	public String getColumnProperty(int columnIndex) {
		return this.columnProperties.get(columnIndex);
	}

	/**
	 * Important! the convention is to return -1 if the column does not exist
	 * anymore.
	 */
	@Override
	public int getColumnIndex(String propertyName) {
		Integer index = columnPropertiesIndex.get(propertyName);
		return index != null ? index : -1;
	}

	@Override
	public List<String> getColumnProperties() {
		return columnProperties;
	}

	@Override
	public List<String> getPrevColumnProperties() {
		// for coherency reasons we ensure that we always get a non empty list
		if (prevColumnProperties.isEmpty()) {
			return columnProperties;
		}
    return prevColumnProperties;
	}

	@Override
	public String[] getColumnPropertiesArray() {
		return columnProperties.stream().toArray(String[]::new);
	}

	@Override
	public List<IMAColumn> getColumnList() {
		return columnList;
	}

	@Override
	public List<IMAColumnProvider> getColumnProviders() {
		return columnProviders;
	}

	@Override
	public void dispose() {
		// Let the good guy GC do the work.
	}

}
