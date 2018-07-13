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
package org.polarsys.kitalpha.massactions.core.table.layer.column;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.filterrow.FilterRowHeaderComposite;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.sort.SortHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;

/**
 * The column header layer specification that corresponds to the column header
 * area of a {@link IMATable}}, containing and managing (hiding, showing) the
 * columns.
 *
 * @author Sandu Postaru
 *
 */
public interface IMAColumnHeaderLayer extends ILayer, IMAComponent {

	IDataProvider getColumnHeaderDataProvider();

	SortHeaderLayer<EObject> getSortHeaderLayer();

	FilterRowHeaderComposite<EObject> getFilterHeaderLayer();
}