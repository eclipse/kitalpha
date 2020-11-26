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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.filterrow.FilterRowDataProvider;
import org.eclipse.nebula.widgets.nattable.filterrow.FilterRowHeaderComposite;
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

import static org.junit.Assert.*;

import TestModel.Elf;
import TestModel.Man;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class ColumnFilterTest {

  @Test
  public void testColumnFilter() {

    MEView editionView;
    try {
      editionView = ViewHelper.getActiveMEView();
      MVView visualizationView = ViewHelper.getActiveMVView();

      testColumnFilter(editionView);
      testColumnFilter(visualizationView);

    } catch (PartInitException e) {
      e.printStackTrace();
    }

  }

  /**
   * This method tests the addition of column filters. It ensures that the
   * SAME EXACT filters are preserved when a new element of the same type as
   * the existing ones is added to the view. And that ONLY THE COMMON filters
   * are preserved when a new element of a new type is added.
   * 
   * @param view
   *            the view that is tested.
   */
  private void testColumnFilter(MAView view) {

    Man man = RandomEntityFactory.getInstance().createRandomMan();
    
    List<EObject> data = new ArrayList<>();
    data.add(man);
    view.dataChanged(data);

    // columns to be tested
    List<String> columnNamesToHide = Arrays.asList("name", "age", "married", "salary");

    // initialization
    IMAGridLayer gridLayer = LayerHelper.extractGridLayer(view);
    IMABodyLayer bodyLayer = gridLayer.getBodyLayer();
    IMAColumnHeaderLayer columnHeaderLayer = gridLayer.getColumnHeaderLayer();

    IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();

    FilterRowHeaderComposite<EObject> filterHeaderLayer = columnHeaderLayer.getFilterHeaderLayer();
    FilterRowDataProvider<EObject> filterRowDataProvider = filterHeaderLayer.getFilterRowDataLayer()
        .getFilterRowDataProvider();

    // the internal representation of column filters
    Map<Integer, Object> beforeFilteredIndexToObject = Collections.emptyMap();
    Map<Integer, Object> afterFilteredIndexToObject = Collections.emptyMap();

    // add a filter for each column
    for (String columnName : columnNamesToHide) {
      int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

      // column exists
      if (columnIndex != -1) {

        // test that the column does not contain a filter
        assertFalse(beforeFilteredIndexToObject.containsKey(columnIndex));
        beforeFilteredIndexToObject = new HashMap<>(filterRowDataProvider.getFilterIndexToObjectMap());

        // add filter (same pattern as the column name)
        filterRowDataProvider.setDataValue(columnIndex, 1, columnName);

        // test that the column contains the filter
        afterFilteredIndexToObject = new HashMap<>(filterRowDataProvider.getFilterIndexToObjectMap());

        assertTrue(afterFilteredIndexToObject.containsKey(columnIndex));
        assertEquals(columnName, afterFilteredIndexToObject.get(columnIndex));
      }
    }

    // add another MAN (same type as the existing elements) and check that
    // the SAME columns are filtered
    beforeFilteredIndexToObject = new HashMap<>(filterRowDataProvider.getFilterIndexToObjectMap());
    
    Man anotherMan = RandomEntityFactory.getInstance().createRandomMan();
    data.add(anotherMan);
    view.dataChanged(data);
    afterFilteredIndexToObject = new HashMap<>(filterRowDataProvider.getFilterIndexToObjectMap());

    assertEquals(beforeFilteredIndexToObject, afterFilteredIndexToObject);

    // add an ELF (different type as the existing elements) and check that
    // only the old COMMON filtered columns are filtered
    
    Elf elf = RandomEntityFactory.getInstance().createRandomElf();    
    data.add(elf);
    view.dataChanged(data);

    afterFilteredIndexToObject = new HashMap<>(filterRowDataProvider.getFilterIndexToObjectMap());

    // check that only the old COMMON filtered columns are filtered
    for (String columnName : columnNamesToHide) {
      int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

      // column exists then it should be filtered
      if (columnIndex != -1) {
        assertTrue(afterFilteredIndexToObject.containsKey(columnIndex));
        assertEquals(columnName, afterFilteredIndexToObject.get(columnIndex));
      }
    }

    // reset the view for the next test
    ViewHelper.resetViews(view);

  }
}
