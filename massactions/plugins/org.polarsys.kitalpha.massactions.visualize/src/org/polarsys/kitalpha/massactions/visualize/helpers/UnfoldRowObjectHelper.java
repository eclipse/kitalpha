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
package org.polarsys.kitalpha.massactions.visualize.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.visualize.column.QueryColumn;
import org.polarsys.kitalpha.massactions.visualize.helpers.container.UnfoldedRowObject;

import com.google.common.collect.Sets;

/**
 * A unfold row object helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class UnfoldRowObjectHelper {

	private static final Log log = LogFactory.getLog(UnfoldRowObjectHelper.class);

	/**
	 * Flag to indicate that the column contains a null value.
	 */
	public static final Integer NULL_VALUE_INDEX = -1;
	/**
	 * Flag to indicate that the column contains an empty collection.
	 */
	public static final Integer EMPTY_COLLECTION_VALUE_INDEX = -2;

	/**
	 * Flag to indicate that the column does not contain a collection.
	 */
	public static final Integer NOT_A_COLLECTION_VALUE_INDEX = -3;

	/**
	 * Flag to indicate that the column is currently hidden.
	 */
	public static final Integer HIDDEN_COLUMN_VALUE_INDEX = -4;

	/**
	 * Flag that indicates that the column contains a query. This implies that
	 * the value should not be cached, but instead re-evaluated.
	 */
	public static final Integer QUERY_COLUMN_VALUE_INDEX = -5;

	private UnfoldRowObjectHelper() {
		// Exists only to defeat instantiation.
	}

	/**
	 * Extracts for column of a rowObject the indexes corresponding to each of
	 * the values contained in that column. Typically if the column contains one
	 * value then one index will be extracted. If the column contains a
	 * collection of values, then all the indexes from [0, size - 1] will be
	 * extracted.
	 * 
	 * @param rowObject
	 *            the current row object.
	 * @param columns
	 *            the complete list of columns.
	 * @param hiddenColumnIndexes
	 *            the indexes of the currently hidden columns.
	 * @return a list containing for each visible column a set with as many
	 *         indexes as values in the column data.
	 */
	public static List<Set<Integer>> extractRowObjectColumnIndexes(EObject rowObject, List<IMAColumn> columns,
			Set<Integer> hiddenColumnIndexes) {
		List<Set<Integer>> rowObjectColumnIndexes = new ArrayList<>();

		for (IMAColumn column : columns) {
			Set<Integer> columnIndexes = new HashSet<>();

			// hidden column
			if (hiddenColumnIndexes.contains(column.getIndex())) {
				columnIndexes.add(HIDDEN_COLUMN_VALUE_INDEX);
				// query column
			} else if (column instanceof QueryColumn) {
				columnIndexes.add(QUERY_COLUMN_VALUE_INDEX);
			} else {
				// potentially a collection
				Object dataValue = column.getDataValue(rowObject);

				if (dataValue == null) {
					columnIndexes.add(NULL_VALUE_INDEX);
				} else if (dataValue instanceof Collection<?>) {
					Collection<?> dataValues = (Collection<?>) dataValue;

					if (dataValues.isEmpty()) {
						columnIndexes.add(EMPTY_COLLECTION_VALUE_INDEX);
					} else {
						columnIndexes = IntStream.range(0, dataValues.size()).boxed().collect(Collectors.toSet());
					}
				} else {
					columnIndexes.add(NOT_A_COLLECTION_VALUE_INDEX);
				}
			}

			rowObjectColumnIndexes.add(columnIndexes);
		}

		return rowObjectColumnIndexes;

	}

	/**
	 * Creates all the {@link UnfoldedRowObject} objects associated with a row
	 * object, ignoring the values present in the hidden columns.
	 * 
	 * For all the visible columns we obtain their value for this row object, if
	 * the value is a collection we then create as many
	 * {@link UnfoldedRowObject} as values initially present in the column. Each
	 * of the newly created object having one single value instead of a
	 * collection.
	 * 
	 * This basically creates a flat version of the current row object.
	 * 
	 * <strong><font color="#FF0000">Warning:</font></strong> Please note that
	 * this method indirectly computes the cartesian product for the values
	 * contained in the visible columns. Therefore the complexity of this method
	 * is potentially exponential.
	 * 
	 * @param rowObject
	 *            the current row object.
	 * @param columns
	 *            the complete list of columns.
	 * @param hiddenColumnIndexes
	 *            the indexes of the currently hidden columns.
	 * @return all the {@link UnfoldedRowObject} objects associated with this
	 *         row object.
	 * 
	 */
	public static Set<EObject> createUnfoldedObjects(EObject rowObject, List<IMAColumn> columns,
			Set<Integer> hiddenColumnIndexes) {

		List<Set<Integer>> rowObjectColumnIndexes = extractRowObjectColumnIndexes(rowObject, columns,
				hiddenColumnIndexes);

		Set<List<Integer>> columnIndexCartesianProduct = Sets.cartesianProduct(rowObjectColumnIndexes);

		log.info("Cartesian product of size [" + columnIndexCartesianProduct.size() + "] for " + rowObject);

		return columnIndexCartesianProduct.stream().map(indexes -> new UnfoldedRowObject(rowObject, columns, indexes))
				.collect(Collectors.toSet());
	}

	/**
	 * Creates all the {@link UnfoldedRowObject} objects associated with the
	 * current row objects, ignoring the values present in the hidden columns.
	 * 
	 * For all the visible columns we obtain their value for each row object, if
	 * the value is a collection we then create as many
	 * {@link UnfoldedRowObject} as values initially present in the column. Each
	 * of the newly created object having one single value instead of a
	 * collection.
	 * 
	 * This basically creates flat versions for each of the current row object.
	 * 
	 * <strong><font color="#FF0000">Warning:</font></strong> Please note that
	 * this method indirectly computes the cartesian product for the values
	 * contained in the visible columns. Therefore the complexity of this method
	 * is potentially exponential.
	 * 
	 * @param rowObjects
	 *            the current row object.
	 * @param columns
	 *            the complete list of columns.
	 * @param hiddenColumnIndexes
	 *            the indexes of the currently hidden columns.
	 * @return all the {@link UnfoldedRowObject} objects associated with this
	 *         row object.
	 * 
	 */
	public static Collection<EObject> createUnfoldedObjects(Collection<EObject> rowObjects, List<IMAColumn> columns,
			Set<Integer> hiddenColumnIndexes) {

		return rowObjects.stream()
				.flatMap(rowObject -> createUnfoldedObjects(rowObject, columns, hiddenColumnIndexes).stream())
				.collect(Collectors.toList());
	}

}
