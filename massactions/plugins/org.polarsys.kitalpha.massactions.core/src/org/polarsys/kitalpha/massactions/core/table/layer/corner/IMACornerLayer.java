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
package org.polarsys.kitalpha.massactions.core.table.layer.corner;

import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;

/**
 * The corner layer specification that corresponds to the corner area of a {@link IMATable}. It serves as a container
 * for the {@link IMAColumnHeaderLayer} and the {@link IMARowHeaderLayer} and is used as a type by the
 * {@link IMAFactory}.
 *
 * @author Sandu Postaru
 *
 */
public interface IMACornerLayer extends ILayer, IMAComponent {
  /*
   * This interface is empty because it is currently used as a marker type for the Mass Action component factories, by
   * regrouping the methods from the ILayer and IMAComponent interfaces.
   * 
   */

}