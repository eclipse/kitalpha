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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.nebula.widgets.nattable.data.ListDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsEventLayer;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.viewport.ViewportLayer;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter.IMAColumnFilter;
import org.polarsys.kitalpha.massactions.core.glazedlists.MAObservableElementList;
import org.polarsys.kitalpha.massactions.core.notification.MAConnector;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.FilterList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.SortedList;
import ca.odell.glazedlists.TransformedList;

/**
 * Default implementation of the {@link IMABodyLayer} component.
 * 
 * @author Sandu Postaru
 * 
 */
public class MABodyLayer extends AbstractLayerTransform implements IMABodyLayer {

  private static final Log log = LogFactory.getLog(MABodyLayer.class);
  
	protected IMAFactory factory;

	protected Collection<EObject> data;

	protected IMAColumnPropertyAccessor columnPropertyAccessor;

	protected List<IMAColumnFilter> columnFilters;

	protected EventList<EObject> eventList;
	protected TransformedList<EObject, EObject> threadSafeList;
	protected MAObservableElementList observableElementList;

	protected SortedList<EObject> sortedList;
	protected FilterList<EObject> filteredList;

	protected IRowDataProvider<EObject> bodyDataProvider;
	protected DataLayer bodyDataLayer;

	protected GlazedListsEventLayer<EObject> glazedListsEventLayer;

	protected ColumnReorderLayer columnReorderLayer;
	protected ColumnHideShowLayer columnHideShowLayer;
	protected SelectionLayer selectionLayer;
	protected ViewportLayer viewportLayer;

	public MABodyLayer(Collection<EObject> data, IMAFactory factory) {
		super();

		this.data = data;
		this.factory = factory;

		ILayer finalLayer = initializeLayer();
		setUnderlyingLayer(finalLayer);
	}

	/**
	 * Recovers and Initializes all the column filters provided via the Column
	 * Filter extension point.
	 */
	protected void initializeColumnFilters() {
		columnFilters = new ArrayList<>();

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = extensionRegistry
				.getConfigurationElementsFor(MACoreActivator.EP_COLUMN_FILTER_ID);

		try {
			for (IConfigurationElement element : config) {
				Object o = element.createExecutableExtension("class");

				if (o instanceof IMAColumnFilter) {
					IMAColumnFilter columnFilter = (IMAColumnFilter) o;
					columnFilter.setBaseColumns(columnPropertyAccessor.getColumnList());

					String displayName = element.getAttribute(MACoreActivator.EP_COLUMN_FILTER_DISPLAY_NAME_ID);
					columnFilter.setDisplayName(displayName);

					columnFilters.add(columnFilter);
				}
			}
		} catch (CoreException e) {
			log.error(e.getMessage());
		}

		// Sort all the filters alphabetically
		Collections.sort(columnFilters, (f1, f2) -> f1.getDisplayName().compareTo(f2.getDisplayName()));
	}

	/**
	 * Initializes all the component stack using the provided
	 * {@link IMAFactory}.
	 * 
	 * @return the top NatTable layer of the stack that can be build upon by
	 *         components that inherit from this one.
	 */
	protected ILayer initializeLayer() {
		this.columnPropertyAccessor = factory.createColumnPropertyAccessor(this);

		initializeColumnFilters();

		this.eventList = GlazedLists.eventList(data);
		this.threadSafeList = GlazedLists.threadSafeList(this.eventList);
		this.observableElementList = new MAObservableElementList(this.threadSafeList, new MAConnector());

		// NOTE: Remember to use the SortedList constructor with 'null' for
		// the Comparator because each column defines their own comparator
		this.sortedList = new SortedList<>(observableElementList, null);
		this.filteredList = new FilterList<>(this.sortedList);

		this.bodyDataProvider = new ListDataProvider<>(this.filteredList, columnPropertyAccessor);
		this.bodyDataLayer = new DataLayer(bodyDataProvider);

		this.glazedListsEventLayer = new GlazedListsEventLayer<>(this.bodyDataLayer, this.filteredList);

		this.columnReorderLayer = new MAColumnReorderLayer(glazedListsEventLayer);
		
		this.columnHideShowLayer = new ColumnHideShowLayer(columnReorderLayer);				
		this.selectionLayer = new MASelectionLayer(this.columnHideShowLayer);
		this.viewportLayer = new ViewportLayer(this.selectionLayer);

		return viewportLayer;
	}

	@Override
	public void applyColumnFilter(IMAColumnFilter columnFilter) {

		columnHideShowLayer.showAllColumns();

		List<Integer> columnPositions = columnPropertyAccessor.getColumnList().stream().filter(columnFilter::shouldHide)
				.map(IMAColumn::getIndex).collect(Collectors.toList());

		if (!columnPositions.isEmpty()) {
			columnHideShowLayer.hideColumnPositions(columnPositions);
		}
	}

	@Override
	public IMAColumnPropertyAccessor getColumnPropertyAccessor() {
		return columnPropertyAccessor;
	}

	@Override
	public void dataChanged(Collection<EObject> newData) {

		this.data = newData;

		// update the existing columns
		columnPropertyAccessor.dataChanged(this.data);

		// the event list is updated by the topmost layer via the
		// notifyListeners method
		// since we must first update the sorted and filtered columns and
		// then fire up the events
	}

	@Override
	public DataLayer getBodyDataLayer() {
		return this.bodyDataLayer;
	}

	@Override
	public SelectionLayer getSelectionLayer() {
		return this.selectionLayer;
	}

	@Override
	public ViewportLayer getViewportLayer() {
		return viewportLayer;
	}

	@Override
	public SortedList<EObject> getSortedList() {
		return sortedList;
	}

	@Override
	public FilterList<EObject> getFilterList() {
		return filteredList;
	}

	@Override
	public IRowDataProvider<EObject> getBodyDataProvider() {
		return bodyDataProvider;
	}

	@Override
	public ColumnReorderLayer getColumnReorderLayer() {
		return columnReorderLayer;
	}
	
	@Override
	public ColumnHideShowLayer getColumnHideShowLayer() {
		return columnHideShowLayer;
	}

	@Override
	public Collection<EObject> getData() {
		return data;
	}

	@Override
	public List<IMAColumnFilter> getColumnFilterList() {
		return columnFilters;
	}

	@Override
	public void notifyListeners() {
	  
		eventList.getReadWriteLock().writeLock().lock();
		try {
			/*
			 * The workaround for the update issue suggested on the mailing list
			 * iterates over the whole list. This causes a lot of list change
			 * events, which also cost processing time. Instead we are
			 * performing a clear()-addAll() which is slightly faster.
			 */

			eventList.clear();
			eventList.addAll(columnPropertyAccessor.getCurrentDataRepresentation());
		} finally {
			eventList.getReadWriteLock().writeLock().unlock();
		}
	}

	@Override
	public void dispose() {
		super.dispose();

		eventList.getReadWriteLock().writeLock().lock();
		try {
			// forces the removal of listeners on the original data
			this.eventList.clear();
		} finally {
			eventList.getReadWriteLock().writeLock().unlock();
		}
	}
}
