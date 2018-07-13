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
package org.polarsys.kitalpha.massactions.core.helper;

import java.util.List;
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
}
