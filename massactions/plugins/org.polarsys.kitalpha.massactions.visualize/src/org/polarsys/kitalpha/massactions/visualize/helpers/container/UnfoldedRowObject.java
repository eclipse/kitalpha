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
package org.polarsys.kitalpha.massactions.visualize.helpers.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.visualize.helpers.UnfoldRowObjectHelper;

/**
 * A partial representation of an already existing raw row object. Typically for all the visible columns we obtain their
 * value for this row object, if the value is a collection we then create as many unfolded objects as values initially
 * present in the column. Each of them has one single value for this column instead of a collection of values.
 * 
 * @author Sandu Postaru
 * 
 */
public class UnfoldedRowObject extends EObjectImpl {

  protected EObject source;
  protected List<IMAColumn> columns;

  /**
   * This list contains at each position <b>i</b> the <b>index value</b> for the column situated at the same position
   * <b>i</b>. If the value contained for this column at position <b>i</b> is a collection, than this unfolded object
   * will only display a single value, situated at the <b>index value</b> contained in this List.
   * 
   * Note that this <b>index value</b> can also be negative, and is therefore used as a flag, marking the type of the
   * value.
   * 
   * Check the static fields of the {@link UnfoldRowObjectHelper} for a detailed information.
   */
  protected List<Integer> valueIndexes;

  public UnfoldedRowObject(EObject source, List<IMAColumn> columns, List<Integer> valueIndexes) {
    super();
    this.source = source;
    this.columns = columns;
    this.valueIndexes = valueIndexes;
  }

  @SuppressWarnings("unchecked")
  public Object getDataValue(int columnIndex) {

    Integer valueIndex = valueIndexes.get(columnIndex);
    if (valueIndex == UnfoldRowObjectHelper.QUERY_COLUMN_VALUE_INDEX) {
      // query -> re-execute for the new value
      return columns.get(columnIndex).getDataValue(this);
    }

    Object sourceDataValue = columns.get(columnIndex).getDataValue(source);

    if (valueIndex == UnfoldRowObjectHelper.NULL_VALUE_INDEX
        || valueIndex == UnfoldRowObjectHelper.EMPTY_COLLECTION_VALUE_INDEX
        || valueIndex == UnfoldRowObjectHelper.NOT_A_COLLECTION_VALUE_INDEX
        || valueIndex == UnfoldRowObjectHelper.HIDDEN_COLUMN_VALUE_INDEX) {
      return sourceDataValue;
    }

    // not a query and not empty -> used the cached value at the
    // specified index
    Collection<Object> sourceDataValues = (Collection<Object>) sourceDataValue;
    return new ArrayList<Object>(sourceDataValues).get(valueIndex);
  }

  public EObject getSource() {
    return source;
  }

}
