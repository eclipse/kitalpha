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
package org.polarsys.kitalpha.massactions.core.config;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * A global column configuration that delegates most of the work to each
 * individual column and ensures the validity of the next configuration when
 * data changes.
 *
 * @author Sandu Postaru
 * 
 */
public class MAColumnConfiguration extends AbstractRegistryConfiguration implements IMAComponent {

	private IMABodyLayer bodyLayer;
	private List<IMAColumn> currentColumnList;
	private List<IMAColumn> newColumnList;

	public MAColumnConfiguration(IMABodyLayer bodyLayer) {
		this.bodyLayer = bodyLayer;
		this.currentColumnList = getCurrentColumnList();
		this.newColumnList = null;
	}

	@Override
	public void configureRegistry(IConfigRegistry configRegistry) {

		if (newColumnList != null) {
			destroyRegistry(configRegistry);

			currentColumnList = newColumnList;
			newColumnList = null;
		}

		currentColumnList.forEach(column -> column.configureRegistry(configRegistry));
	}

	public void destroyRegistry(IConfigRegistry configRegistry) {
		currentColumnList.forEach(column -> column.destroyRegistry(configRegistry));
	}

	private List<IMAColumn> getCurrentColumnList() {
		return bodyLayer.getColumnPropertyAccessor().getColumnList();
	}

	@Override
	public void dataChanged(Collection<EObject> data) {
		newColumnList = getCurrentColumnList();
	}

	@Override
	public void dispose() {
		// Let the good guy GC do the work.
	}
}
