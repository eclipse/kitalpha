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
package org.polarsys.kitalpha.massactions.core.selection;

import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.nebula.widgets.nattable.selection.RowSelectionProvider;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.polarsys.kitalpha.massactions.core.helper.CellSelectionHelper;

/**
 * A selection provider selecting cells or rows elements according to the user selection
 */
public class RowCellSelectionProvider<T> extends RowSelectionProvider<T> {

  protected SelectionLayer selectionLayer;

  public RowCellSelectionProvider(SelectionLayer selectionLayer, IRowDataProvider<T> rowDataProvider,
      boolean fullySelectedRowsOnly, boolean handleSameRowSelection) {
    super(selectionLayer, rowDataProvider, fullySelectedRowsOnly, handleSameRowSelection);
    this.selectionLayer = selectionLayer;
  }
  
  @Override
  public ISelection getSelection() {

    // If there is selected rows, we return them.
    int[] rows = selectionLayer.getFullySelectedRowPositions();
    if (rows != null && rows.length > 0) {
      return super.getSelection();
    }

    // otherwise, we return selected cells.
    Collection<Object> cellObjects = CellSelectionHelper.getSelectedCellObjects(selectionLayer);
    if (!cellObjects.isEmpty()) {
      return new StructuredSelection((List) cellObjects);
    }

    return StructuredSelection.EMPTY;
  }


}
