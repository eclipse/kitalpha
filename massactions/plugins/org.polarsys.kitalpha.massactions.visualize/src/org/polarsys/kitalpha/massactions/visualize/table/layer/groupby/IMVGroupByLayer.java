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
package org.polarsys.kitalpha.massactions.visualize.table.layer.groupby;

import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;

/**
 * The group by specification that corresponds to the group by area of a
 * {@link IMATable}, containing the {@link IMAGridLayer}.
 *
 * @author Sandu Postaru
 *
 */
public interface IMVGroupByLayer extends ILayer, IMAComponent {

	IMAGridLayer getGridLayer();

	GroupByHeaderLayer getGroupByHeaderLayer();
}
