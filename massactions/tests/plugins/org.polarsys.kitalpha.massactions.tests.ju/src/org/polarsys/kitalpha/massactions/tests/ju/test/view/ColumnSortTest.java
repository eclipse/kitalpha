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
package org.polarsys.kitalpha.massactions.tests.ju.test.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.sort.ISortModel;
import org.eclipse.nebula.widgets.nattable.sort.SortDirectionEnum;
import org.eclipse.nebula.widgets.nattable.sort.SortHeaderLayer;
import org.eclipse.nebula.widgets.nattable.sort.command.SortColumnCommand;
import org.eclipse.ui.PartInitException;
import org.junit.Test;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.edit.MEView;
import org.polarsys.kitalpha.massactions.shared.view.MAView;
import org.polarsys.kitalpha.massactions.tests.ju.helpers.LayerHelper;
import org.polarsys.kitalpha.massactions.tests.ju.helpers.ViewHelper;
import org.polarsys.kitalpha.massactions.tests.ju.model.factory.RandomEntityFactory;
import org.polarsys.kitalpha.massactions.visualize.MVView;

import TestModel.Elf;
import TestModel.Man;

/**
 * 
 * @author Sandu Postaru
 *
 */
public class ColumnSortTest {

  @Test
  public void testColumnSort() {

    MEView editionView;
    try {
      editionView = ViewHelper.getActiveMEView();
      MVView visualizationView = ViewHelper.getActiveMVView();

      testColumnSort(editionView);
      testColumnSort(visualizationView);

    } catch (PartInitException e) {
      e.printStackTrace();
    }

  }

  /**
   * This method tests the action of sorting columns. It ensures that the SAME EXACT sorted columns are preserved when a
   * new element of the same type as the existing ones is added to the view. And that ONLY THE COMMON sorted columns are
   * preserved when a new element of a new type is added.
   * 
   * @param view
   *          the view that is tested.
   */
  private void testColumnSort(MAView view) {

    List<EObject> data = new ArrayList<>();
    Man man = RandomEntityFactory.getInstance().createRandomMan();

    data.add(man);
    view.dataChanged(data);

    // columns to be tested
    List<String> columnNamesToSort = Arrays.asList("name", "age", "married", "salary");

    // initialization
    IMAGridLayer gridLayer = LayerHelper.extractGridLayer(view);
    IMABodyLayer bodyLayer = gridLayer.getBodyLayer();
    IMAColumnHeaderLayer columnHeaderLayer = gridLayer.getColumnHeaderLayer();

    IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();

    ColumnHideShowLayer columnHideShowLayer = bodyLayer.getColumnHideShowLayer();
    SortHeaderLayer<EObject> sortHeaderLayer = columnHeaderLayer.getSortHeaderLayer();
    ISortModel sortModel = sortHeaderLayer.getSortModel();

    // the internal representation of sorted columns and their direction
    // (ASC, DESC, NONE)
    Collection<Integer> beforeSortedColumns = Collections.emptySet();
    Collection<SortDirectionEnum> beforeSortDirectionEnums = Collections.emptySet();

    Collection<Integer> afterSortedColumns = Collections.emptySet();
    Collection<SortDirectionEnum> afterSortDirectionEnums = Collections.emptySet();

    // sort each column one by one
    for (String columnName : columnNamesToSort) {
      int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

      // column exists
      if (columnIndex != -1) {
        int columnPosition = columnHideShowLayer.getColumnPositionByIndex(columnIndex);

        // column is not sorted
        assertFalse(sortModel.isColumnIndexSorted(columnIndex));

        // sort
        sortHeaderLayer.doCommand(new SortColumnCommand(sortHeaderLayer, columnPosition));

        // check that it's sorted
        assertTrue(sortModel.isColumnIndexSorted(columnIndex));
      }
    }

    // add another man and check that the same columns are
    // sorted in the same direction
    beforeSortedColumns = new HashSet<>(sortModel.getSortedColumnIndexes());
    beforeSortDirectionEnums = beforeSortedColumns.stream().map(sortModel::getSortDirection)
        .collect(Collectors.toList());

    Man anotherMan = RandomEntityFactory.getInstance().createRandomMan();

    data.add(anotherMan);
    view.dataChanged(data);
    afterSortedColumns = new HashSet<>(sortModel.getSortedColumnIndexes());
    afterSortDirectionEnums = afterSortedColumns.stream().map(sortModel::getSortDirection).collect(Collectors.toList());

    assertFalse(beforeSortedColumns.isEmpty());
    assertFalse(afterSortedColumns.isEmpty());
    assertEquals(beforeSortedColumns, afterSortedColumns);

    assertFalse(beforeSortDirectionEnums.isEmpty());
    assertFalse(afterSortDirectionEnums.isEmpty());
    assertEquals(beforeSortDirectionEnums, afterSortDirectionEnums);

    // sort the common column name, for both System functions and Categories
    int columnIndex = columnPropertyAccessor.getColumnIndex("name");
    int columnPosition = columnHideShowLayer.getColumnPositionByIndex(columnIndex);

    sortHeaderLayer.doCommand(new SortColumnCommand(sortHeaderLayer, columnPosition));

    assertTrue(sortModel.isColumnIndexSorted(columnIndex));

    // add a elf and check that only the common column (name) is
    // sorted

    Elf elf = RandomEntityFactory.getInstance().createRandomElf();

    data.add(elf);
    view.dataChanged(data);

    // the column indexes changed
    columnIndex = columnPropertyAccessor.getColumnIndex("name");
    columnPosition = columnHideShowLayer.getColumnPositionByIndex(columnIndex);

    // check that name is sorted
    assertTrue(sortModel.isColumnIndexSorted(columnIndex));
    // check that ONLY name is sorted
    assertEquals(1, sortModel.getSortedColumnIndexes().size());

    // reset the view
    ViewHelper.resetViews(view);
    assertTrue(data.remove(elf));
    view.dataChanged(data);

    // re-initialization
    // get new references since the view has been reset
    gridLayer = LayerHelper.extractGridLayer(view);
    bodyLayer = gridLayer.getBodyLayer();
    columnHeaderLayer = gridLayer.getColumnHeaderLayer();
    columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();

    columnHideShowLayer = bodyLayer.getColumnHideShowLayer();
    sortHeaderLayer = columnHeaderLayer.getSortHeaderLayer();
    sortModel = sortHeaderLayer.getSortModel();

    // sort the common column "unique"
    columnIndex = columnPropertyAccessor.getColumnIndex("salary");
    columnPosition = columnHideShowLayer.getColumnPositionByIndex(columnIndex);

    sortHeaderLayer.doCommand(new SortColumnCommand(sortHeaderLayer, columnPosition));

    // check that the column is sorted before adding a new element
    assertTrue(sortModel.isColumnIndexSorted(columnIndex));
    assertEquals(1, sortModel.getSortedColumnIndexes().size());

    // add a new ELF
    data.add(elf);
    view.dataChanged(data);

    // check that no columns are sorted, since none of them ("unique") are
    // common for bot CAT and SF
    assertEquals(-1, columnPropertyAccessor.getColumnIndex("salary"));
    assertTrue(sortModel.getSortedColumnIndexes().isEmpty());

    // reset the view for the next test
    ViewHelper.resetViews(view);

  }
}
