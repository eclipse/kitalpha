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
package org.polarsys.kitalpha.massactions.visualize.table.layer.body;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsEventLayer;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByModel;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.tree.TreeLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.polarsys.kitalpha.massactions.core.glazedlists.MAObservableElementList;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.MABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.MAColumnReorderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.MASelectionLayer;
import org.polarsys.kitalpha.massactions.visualize.data.accessor.MVColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.visualize.notification.MVConnector;
import org.polarsys.kitalpha.massactions.visualize.table.layer.groupby.MVGroupByDataLayer;
import org.polarsys.kitalpha.massactions.visualize.unfold.MVPerspectiveManager;

import ca.odell.glazedlists.FilterList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.SortedList;
import ca.odell.glazedlists.TreeList;

/**
 * An extension of the default {@link MABodyLayer} that adds support for groupBy
 * operations.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVBodyLayer extends MABodyLayer {

	protected TreeLayer treeLayer;
	protected GroupByModel groupByModel;

	public MVBodyLayer(Collection<EObject> data, IMAFactory factory) {
		super(data, factory);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected ILayer initializeLayer() {

		this.groupByModel = new GroupByModel();

		this.columnPropertyAccessor = factory.createColumnPropertyAccessor(this);

		initializeColumnFilters();

		this.eventList = GlazedLists.eventList(data);
		this.threadSafeList = GlazedLists.threadSafeList(this.eventList);

		MVPerspectiveManager perspectiveManager = getColumnPropertyAccessor().getPerspectiveManager();
		this.observableElementList = new MAObservableElementList(this.threadSafeList,
				new MVConnector(perspectiveManager));

		// NOTE: Remember to use the SortedList constructor with 'null' for
		// the Comparator because each column defines their own
		this.sortedList = new SortedList<>(this.observableElementList, null);
		this.filteredList = new FilterList<>(this.sortedList);

		this.bodyDataLayer = new MVGroupByDataLayer(this.groupByModel, this.filteredList, this.columnPropertyAccessor);
		this.bodyDataProvider = getBodyDataLayer().getDataProvider();

		// NOTE: We use the tree list here and not the filtered list in order to
		// correctly trigger the repaint event when the data changes and a
		// group-by is active
		TreeList treeList = getBodyDataLayer().getTreeList();
		this.glazedListsEventLayer = new GlazedListsEventLayer<>(this.bodyDataLayer, treeList);

		this.columnReorderLayer = new MAColumnReorderLayer(glazedListsEventLayer);				
		this.columnHideShowLayer = new ColumnHideShowLayer(this.columnReorderLayer);				
		this.selectionLayer = new MASelectionLayer(this.columnHideShowLayer);
		this.treeLayer = new TreeLayer(this.selectionLayer, getBodyDataLayer().getTreeRowModel());

		this.viewportLayer = new ViewportLayer(this.treeLayer);

		return viewportLayer;
	}

	public TreeLayer getTreeLayer() {
		return treeLayer;
	}

	public GroupByModel getGroupByModel() {
		return groupByModel;
	}

	@Override
	public MVGroupByDataLayer getBodyDataLayer() {
		return (MVGroupByDataLayer) super.getBodyDataLayer();
	}

	@Override
	public MVColumnPropertyAccessor getColumnPropertyAccessor() {
		return (MVColumnPropertyAccessor) super.getColumnPropertyAccessor();
	}

}
