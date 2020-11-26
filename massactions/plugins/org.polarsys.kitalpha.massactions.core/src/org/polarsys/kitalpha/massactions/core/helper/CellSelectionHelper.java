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
package org.polarsys.kitalpha.massactions.core.helper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.nebula.widgets.nattable.edit.command.EditUtils;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * A cell selection helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class CellSelectionHelper {

  private CellSelectionHelper() {
    // Exists only to defeat instantiation.
  }

  /**
   * Returns the corresponding row objects for the current cell selection.
   * 
   * @param bodyLayer
   *          the body layer.
   * @return the corresponding row objects for the current cell selection
   */
  public static List<EObject> getSelectedRowObjects(IMABodyLayer bodyLayer) {

    SelectionLayer selectionLayer = bodyLayer.getSelectionLayer();
    Set<Integer> selectedCellsRowIndexes = EditUtils.getSelectedCellsForEditing(selectionLayer).stream()
        .map(ILayerCell::getRowIndex).collect(Collectors.toSet());

    IRowDataProvider<EObject> bodyDataProvider = bodyLayer.getBodyDataProvider();
    return selectedCellsRowIndexes.stream().map(bodyDataProvider::getRowObject).collect(Collectors.toList());

  }

  /**
   * Returns the corresponding cell's value objects for the current cell selection.
   * 
   * @param selectionLayer
   *          the selection layer.
   * @return the corresponding cell's value objects for the current cell selection
   */
  public static List<Object> getSelectedCellObjects(SelectionLayer selectionLayer) {
    Collection<Object> objects = new LinkedHashSet<>();
    Collection<ILayerCell> cells = selectionLayer.getSelectedCells();
    for (ILayerCell cell : cells) {
      Object value = cell.getDataValue();
      if (value instanceof Collection) {
        objects.addAll((Collection) value);
      } else {
        objects.add(value);
      }
    }
    // a selection must be created from a list, and must not have a null in it.
    return objects.stream().filter(Objects::nonNull).collect(Collectors.toList());
  }
}
