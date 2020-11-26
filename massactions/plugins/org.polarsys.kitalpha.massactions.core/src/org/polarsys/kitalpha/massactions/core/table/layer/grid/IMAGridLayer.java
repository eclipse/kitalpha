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
package org.polarsys.kitalpha.massactions.core.table.layer.grid;

import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.IMACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;

/**
 * The grid layer specification that corresponds to the grid area of a
 * {@link IMATable}, containing the {@link IMABodyLayer},
 * {@link IMAColumnHeaderLayer}, {@link IMARowHeaderLayer} and the
 * {@link IMACornerLayer}.
 * 
 * It simply delegates most of the functions to its child layers.
 *
 * @author Sandu Postaru
 *
 */
public interface IMAGridLayer extends ILayer, IMAComponent {

	IMABodyLayer getBodyLayer();

	IMAColumnHeaderLayer getColumnHeaderLayer();

	IMARowHeaderLayer getRowHeaderLayer();

	IMACornerLayer getCornerLayer();

}