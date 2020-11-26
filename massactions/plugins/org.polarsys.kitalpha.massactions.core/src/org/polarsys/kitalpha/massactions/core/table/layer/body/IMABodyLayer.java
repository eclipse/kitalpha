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
package org.polarsys.kitalpha.massactions.core.table.layer.body;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter.IMAColumnFilter;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;

import ca.odell.glazedlists.FilterList;
import ca.odell.glazedlists.SortedList;

/**
 * The body layer specification that corresponds to the body area of a
 * {@link IMATable} containing and managing the table data. This layer is the
 * first one to be created, meaning that he is the bottom layer and that all the
 * other layers are build on top of him.
 * 
 * This layer is also the first one to receive NatTable events that he then
 * transports up the layer stack, giving every layer and every listener the
 * ability to react on possible structural or visual state changes that are the
 * result of the command processing. Events are never consumed and will always
 * be transported to the top of the layer stack.
 * 
 * @author Sandu Postaru
 * 
 */
public interface IMABodyLayer extends ILayer, IMAComponent {

	/**
	 * Applies a column filter to the current column configuration.
	 * 
	 * @param columnFilter
	 *            the filter to be applied.
	 */
	void applyColumnFilter(IMAColumnFilter columnFilter);

	/**
	 * This method notifies all the listeners that the underlying data has
	 * changed. The {@link IMAComponent#dataChanged(Collection)} does not do
	 * this notification automatically. The reason is that the body layer is the
	 * bottom layer, meaning that he is the first layer to be updated, and by
	 * doing so he modifies the data present in the table which triggers the
	 * table repaint.
	 * 
	 * But often the other layers need to change their internal structure before
	 * the actual data is changed and the repaint is performed. For example the
	 * {@link IMAColumnHeaderLayer} must change the columns on which filters are
	 * applied, since the old configuration might contain columns that don't
	 * exist anymore. He must perform this change before this layer changes the
	 * actual data and the repaint is triggered. So the top layer will usually
	 * call this method, after all the in-between layers have finished
	 * configuring themselves.
	 * 
	 */
	void notifyListeners();

	// getters
	List<IMAColumnFilter> getColumnFilterList();

	IMAColumnPropertyAccessor getColumnPropertyAccessor();

	DataLayer getBodyDataLayer();

	SelectionLayer getSelectionLayer();

	ViewportLayer getViewportLayer();
	
	ColumnReorderLayer getColumnReorderLayer();

	SortedList<EObject> getSortedList();

	FilterList<EObject> getFilterList();

	IRowDataProvider<EObject> getBodyDataProvider();

	ColumnHideShowLayer getColumnHideShowLayer();	

	Collection<EObject> getData();
}