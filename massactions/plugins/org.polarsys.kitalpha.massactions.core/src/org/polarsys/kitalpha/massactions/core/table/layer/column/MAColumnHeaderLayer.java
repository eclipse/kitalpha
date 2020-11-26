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
package org.polarsys.kitalpha.massactions.core.table.layer.column;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.columnChooser.command.DisplayColumnChooserCommandHandler;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsSortModel;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.filterrow.DefaultGlazedListsFilterStrategy;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByModel;
import org.eclipse.nebula.widgets.nattable.filterrow.FilterRowDataProvider;
import org.eclipse.nebula.widgets.nattable.filterrow.FilterRowHeaderComposite;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultColumnHeaderDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.DefaultColumnHeaderDataLayer;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupHeaderLayer;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupModel;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.cell.ColumnLabelAccumulator;
import org.eclipse.nebula.widgets.nattable.layer.cell.ColumnOverrideLabelAccumulator;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.sort.SortDirectionEnum;
import org.eclipse.nebula.widgets.nattable.sort.SortHeaderLayer;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * Default implementation of the {@link IMAColumnHeaderLayer}.
 * 
 * @author Sandu Postaru
 * 
 */
public class MAColumnHeaderLayer extends AbstractLayerTransform implements IMAColumnHeaderLayer {

	private static final String AT_INDEX = "] at index [";

  private static final Log log = LogFactory.getLog(MAColumnHeaderLayer.class);

	protected final IMABodyLayer bodyLayerStack;
	protected final IConfigRegistry configRegistry;

	protected IMAColumnPropertyAccessor columnPropertyAccessor;

	protected IDataProvider columnHeaderDataProvider;

	protected ColumnHeaderLayer columnHeaderLayer;
	protected ColumnGroupModel columnGroupModel;
	protected ColumnGroupHeaderLayer columnGroupHeaderLayer;
	protected DefaultColumnHeaderDataLayer columnHeaderDataLayer;

	protected GlazedListsSortModel<EObject> sortModel;
	protected FilterRowHeaderComposite<EObject> filterRowHeaderLayer;
	protected SortHeaderLayer<EObject> sortHeaderLayer;

	protected GroupByModel groupByModel;

	public MAColumnHeaderLayer(IMABodyLayer bodyLayerStack, IConfigRegistry configRegistry) {
		super();

		this.bodyLayerStack = bodyLayerStack;
		this.configRegistry = configRegistry;

		ILayer finalLayer = initializeLayer();
		setUnderlyingLayer(finalLayer);
	}

	/**
	 * Initializes all the component stack using the provided
	 * {@link IMAFactory}.
	 * 
	 * @return the top NatTable layer of the stack that can be build upon by
	 *         components that inherit from this one.
	 */
	protected ILayer initializeLayer() {
		columnPropertyAccessor = bodyLayerStack.getColumnPropertyAccessor();

		configureBodyLayerLabels();

		String[] columnNames = columnPropertyAccessor.getColumnPropertiesArray();

		columnHeaderDataProvider = new DefaultColumnHeaderDataProvider(columnNames);
		columnHeaderDataLayer = new DefaultColumnHeaderDataLayer(columnHeaderDataProvider);
		columnHeaderLayer = new ColumnHeaderLayer(columnHeaderDataLayer, bodyLayerStack,
				bodyLayerStack.getSelectionLayer());

		columnGroupModel = new ColumnGroupModel();
		columnGroupHeaderLayer = new ColumnGroupHeaderLayer(columnHeaderLayer, bodyLayerStack.getSelectionLayer(),
				columnGroupModel);

		configureColumnHeaderLayerLabels();

		sortModel = new GlazedListsSortModel<>(bodyLayerStack.getSortedList(), columnPropertyAccessor, configRegistry,
				columnHeaderDataLayer);
		sortHeaderLayer = new SortHeaderLayer<>(columnHeaderLayer, sortModel, false);

		DefaultGlazedListsFilterStrategy<EObject> filterStrategy = new DefaultGlazedListsFilterStrategy<>(
				bodyLayerStack.getFilterList(), bodyLayerStack.getColumnPropertyAccessor(), configRegistry);
		filterRowHeaderLayer = new FilterRowHeaderComposite<>(filterStrategy, sortHeaderLayer, columnHeaderDataProvider,
				configRegistry);

		initColumnChooserHandler();

		return filterRowHeaderLayer;
	}

	@Override
	public void dataChanged(Collection<EObject> data) {

		configureBodyLayerLabels();

		String[] columnNames = columnPropertyAccessor.getColumnPropertiesArray();

		this.columnHeaderDataProvider = new DefaultColumnHeaderDataProvider(columnNames);
		columnHeaderDataLayer.setDataProvider(columnHeaderDataProvider);

		configureColumnHeaderLayerLabels();

		updateSortedColumns();
		updateFilteredColumns();
		updateReorderedColumns();
		updateHiddenColumns();

		// the sorted and filtered columns have been updated, add the new data
		// this will fire an event and re-sort the sorted list and re-filter the
		// filtered list
		bodyLayerStack.notifyListeners();
	}

	/**
	 * Configures the accumulator for default column labels allowing to
	 * configure some of the cell attributes (Cell editor, Display converter,
	 * Data validator and the Cell painter) by their column position.
	 */
	protected void configureBodyLayerLabels() {
		ColumnLabelAccumulator columnLabelAccumulator = new ColumnLabelAccumulator(
				bodyLayerStack.getBodyDataProvider());
		bodyLayerStack.getBodyDataLayer().setConfigLabelAccumulator(columnLabelAccumulator);
	}

	/**
	 * Configures the accumulator for custom column labels allowing to configure
	 * some of the cell attributes (Cell comparator) by their column position.
	 */
	protected void configureColumnHeaderLayerLabels() {
		ColumnOverrideLabelAccumulator labelAccumulator = new ColumnOverrideLabelAccumulator(columnHeaderDataLayer);
		columnHeaderDataLayer.setConfigLabelAccumulator(labelAccumulator);

		List<IMAColumn> columnList = columnPropertyAccessor.getColumnList();
		for (int i = 0; i < columnList.size(); i++) {
			IMAColumn column = columnList.get(i);

			labelAccumulator.registerColumnOverrides(i, column.getSortLabel());
		}
	}

	/**
	 * This method updates the sorted columns when an update is performed. Let
	 * <code>x</code> be the previous sorted column. If <code>x</code> is no
	 * longer present in the current configuration, then <code>x</code> is
	 * removed. If <code>x</code> is present at the same index then the column
	 * is kept. If it is present at a new index, the old sorted column is
	 * removed and a new sorting column corresponding to the new index is added.
	 */
	protected void updateSortedColumns() {
		List<String> prevColumnProperties = columnPropertyAccessor.getPrevColumnProperties();
		List<Integer> prevSortedColumns = sortModel.getSortedColumnIndexes();
		List<SortDirectionEnum> prevDirections = prevSortedColumns.stream().map(sortModel::getSortDirection)
				.collect(Collectors.toList());

		for (int i = 0; i < prevSortedColumns.size(); i++) {

			int prevColumnIndex = prevSortedColumns.get(i);
			String prevColumnName = prevColumnProperties.get(prevColumnIndex);
			int currColumnIndex = columnPropertyAccessor.getColumnIndex(prevColumnName);

			if (currColumnIndex != prevColumnIndex) {
				// remove old sort
				sortModel.sort(prevColumnIndex, SortDirectionEnum.NONE, false);

				log.info("Removing sorted column [" + prevColumnName + AT_INDEX + prevColumnIndex + "]");

				// do new sort if column still present
				if (currColumnIndex != -1) {
					SortDirectionEnum prevSortDirection = prevDirections.get(i);
					sortModel.sort(currColumnIndex, prevSortDirection, false);

					log.info("Adding sorted column [" + prevColumnName + AT_INDEX + currColumnIndex + "]");
				}
			}
		}
	}

	/**
	 * This method updates the filtered columns when an update is performed. Let
	 * <code>x</code> be the previous filtered column. If <code>x</code> is no
	 * longer present in the current configuration, then <code>x</code> is
	 * removed. If <code>x</code> is present at the same index then the column
	 * is kept. If it is present at a new index, the old filtered column is
	 * removed and a new filtering column corresponding to the new index is
	 * added.
	 */
	protected void updateFilteredColumns() {

		List<String> prevColumnProperties = columnPropertyAccessor.getPrevColumnProperties();
		FilterRowDataProvider<EObject> filterRowDataProvider = filterRowHeaderLayer.getFilterRowDataLayer()
				.getFilterRowDataProvider();

		// create a shallow copy since the clearAllFilters method modifies this
		// item
		Map<Integer, Object> prevFilteredColumns = new HashMap<>(filterRowDataProvider.getFilterIndexToObjectMap());

		// clear all the existing filters
		filterRowDataProvider.clearAllFilters();

		prevFilteredColumns.forEach((prevColumnIndex, filterPattern) -> {
			String prevColumnName = prevColumnProperties.get(prevColumnIndex);
			int currColumnIndex = columnPropertyAccessor.getColumnIndex(prevColumnName);

			if (currColumnIndex != -1) {
				// this column exists, so re-apply it with the new index
				// NOTE: this data provider has only one row that contains the
				// filter pattern
				filterRowDataProvider.setDataValue(currColumnIndex, 1, filterPattern);

				log.info("Adding filter [" + filterPattern + "] for column [" + prevColumnName + AT_INDEX
						+ currColumnIndex + "]");
			}
		});

	}

	/**
	 * This method updates the reordered columns when an update is performed. If
	 * the column configuration changed than the whole order is reset, else the
	 * order is preserved.
	 */
	protected void updateReorderedColumns() {

		boolean columnChange = columnPropertyAccessor.getColumnProperties().size() < columnPropertyAccessor
				.getPrevColumnProperties().size();
		// if the column configuration changed -> reset
		if (columnChange) {
			List<Integer> defaultIndexOrder = IntStream.range(0, columnPropertyAccessor.getColumnCount()).boxed()
					.collect(Collectors.toList());

			ColumnReorderLayer columnReorderLayer = bodyLayerStack.getColumnReorderLayer();
			columnReorderLayer.getColumnIndexOrder().clear();
			columnReorderLayer.getColumnIndexOrder().addAll(defaultIndexOrder);

			log.info("Reseting reordered columns");
		}
	}

	/**
	 * This method updates the hidden columns when an update is performed. Let
	 * <code>x</code> be the previous hidden column. If <code>x</code> is no
	 * longer present in the current configuration, then <code>x</code> is
	 * removed from the hidden column list. If <code>x</code> is present at the
	 * same index then the column is kept. If it is present at a new index, the
	 * old hidden column column is replaced with the new hidden column index.
	 * 
	 */
	protected void updateHiddenColumns() {
		List<String> prevColumnProperties = columnPropertyAccessor.getPrevColumnProperties();
		ColumnHideShowLayer columnHideShowLayer = bodyLayerStack.getColumnHideShowLayer();

		// a shallow copy since the showAllColumns method modifies this item
		List<Integer> prevHiddenColumnIndexes = new ArrayList<>(columnHideShowLayer.getHiddenColumnIndexes());
		Set<Integer> currToHideColumnIndexes = new HashSet<>();

		for (int i = 0; i < prevHiddenColumnIndexes.size(); i++) {

			int prevHiddenColumnIndex = prevHiddenColumnIndexes.get(i);
			String prevColumnName = prevColumnProperties.get(prevHiddenColumnIndex);
			int currColumnIndex = columnPropertyAccessor.getColumnIndex(prevColumnName);

			// hide if the column exists
			if (currColumnIndex != -1) {
				currToHideColumnIndexes.add(currColumnIndex);
			}
		}

		// update only if changes exist
		if ((currToHideColumnIndexes.size() != prevHiddenColumnIndexes.size()
				|| !currToHideColumnIndexes.containsAll(prevHiddenColumnIndexes))) {

			columnHideShowLayer.showAllColumns();

			// ensure that at least one column is always visible
			if (currToHideColumnIndexes.size() < columnPropertyAccessor.getColumnCount()) {
				// when can correctly compute the position only when all columns
				// are shown
				List<Integer> currToHideColumnPositions = currToHideColumnIndexes.stream()
						.map(columnHideShowLayer::getColumnPositionByIndex).collect(Collectors.toList());
				columnHideShowLayer.hideColumnPositions(currToHideColumnPositions);

				log.info("Hiding [" + currToHideColumnIndexes.size() + "] columns");
			}
		}
	}

	private void initColumnChooserHandler() {
		// contextual menu for each column header
		DisplayColumnChooserCommandHandler columnChooserCommandHandler = new DisplayColumnChooserCommandHandler(
				bodyLayerStack.getSelectionLayer(), bodyLayerStack.getColumnHideShowLayer(), columnHeaderLayer,
				columnHeaderDataLayer, columnGroupHeaderLayer, columnGroupModel);

		bodyLayerStack.getViewportLayer().registerCommandHandler(columnChooserCommandHandler);
	}

	@Override
	public IDataProvider getColumnHeaderDataProvider() {
		return columnHeaderDataProvider;
	}

	@Override
	public SortHeaderLayer<EObject> getSortHeaderLayer() {
		return sortHeaderLayer;
	}

	@Override
	public FilterRowHeaderComposite<EObject> getFilterHeaderLayer() {
		return filterRowHeaderLayer;
	}
}
