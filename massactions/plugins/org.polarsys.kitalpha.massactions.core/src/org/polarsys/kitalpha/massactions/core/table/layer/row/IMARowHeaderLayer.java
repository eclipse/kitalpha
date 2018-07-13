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
package org.polarsys.kitalpha.massactions.core.table.layer.row;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;

/**
 * The row header layer specification that corresponds to the row header area of
 * a {@link IMATable}, containing and managing the icon for the current rows.
 *
 * @author Sandu Postaru
 *
 */
public interface IMARowHeaderLayer extends ILayer, IMAComponent {

	IDataProvider getRowHeaderDataProvider();

}