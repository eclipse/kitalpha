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
package org.polarsys.kitalpha.massactions.core.table.factory;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.config.IMAConfiguration;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.IMACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;

/**
 * The factory for building implementations of {@link IMAComponent} used by the
 * different {@link IMATable}. Using a factory will allow developers to change
 * the stack of components that are used for their own {@link IMATable}
 * extensions with a minimal impact on the actual code, by providing a new
 * factory that constructs their own customized components.
 * 
 * @author Sandu Postaru
 *
 */
public interface IMAFactory {

	IMAColumnPropertyAccessor createColumnPropertyAccessor(IMABodyLayer bodyLayer);

	IMABodyLayer createBodyLayer(Collection<EObject> data, IMAFactory factory);

	IMAColumnHeaderLayer createColumnHeaderLayer(IMABodyLayer bodyLayerStack, IConfigRegistry configRegistry);

	IMARowHeaderLayer createRowHeaderLayer(IMABodyLayer bodyLayerStack);

	IMACornerLayer createCornerLayer(IMAColumnHeaderLayer columnHeaderLayerStack,
			IMARowHeaderLayer rowHeaderLayerStack);

	IMAGridLayer creatGridLayer(IMABodyLayer bodyLayerStack, IMAColumnHeaderLayer columnHeaderLayerStack,
			IMARowHeaderLayer rowHeaderLayerStack, IMACornerLayer cornerLayerStack);

	IMAConfiguration createConfiguration(NatTable natTable, IConfigRegistry configRegistry);
}