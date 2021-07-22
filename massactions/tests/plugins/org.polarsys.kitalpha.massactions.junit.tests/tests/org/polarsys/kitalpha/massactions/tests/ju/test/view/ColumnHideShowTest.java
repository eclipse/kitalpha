/*******************************************************************************
 * Copyright (c) 2018, 2021  Thales Global Services S.A.S.
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.hideshow.command.ColumnHideCommand;
import org.eclipse.nebula.widgets.nattable.hideshow.command.MultiColumnShowCommand;
import org.eclipse.ui.PartInitException;
import org.junit.Test;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.edit.MEView;
import org.polarsys.kitalpha.massactions.shared.view.MAView;
import org.polarsys.kitalpha.massactions.tests.ju.activator.Activator;
import org.polarsys.kitalpha.massactions.tests.ju.helpers.LayerHelper;
import org.polarsys.kitalpha.massactions.tests.ju.helpers.ViewHelper;
import org.polarsys.kitalpha.massactions.tests.ju.model.factory.RandomEntityFactory;
import org.polarsys.kitalpha.massactions.tests.ju.test.helpers.Constants;
import org.polarsys.kitalpha.massactions.visualize.MVView;

import TestModel.Elf;
import TestModel.Man;

/**
 * 
 * @author Sandu Postaru
 *
 */
public class ColumnHideShowTest {

  @Test
  public void testColumnHideShow() {

    MEView editionView;
    try {
      editionView = ViewHelper.getActiveMEView();
      MVView visualizationView = ViewHelper.getActiveMVView();

      testColumnHideShow(editionView);
      testColumnHideShow(visualizationView);

    } catch (PartInitException e) {
        Activator.getLog().error(e.getMessage(), e);
    }

  }

  /**
   * This method tests the action of hiding columns. It ensures that the SAME EXACT hidden columns are preserved when a
   * new element of the same type as the existing ones is added to the view. And that ONLY THE COMMON hidden columns are
   * preserved when a new element of a new type is added.
   * 
   * @param view
   *          the view that is tested.
   */
  private void testColumnHideShow(MAView view) {

    List<EObject> data = new ArrayList<>();
    Man man = RandomEntityFactory.getInstance().createRandomMan();
    data.add(man);
    view.dataChanged(data);

    // columns to be tested
    List<String> columnNamesToHide = Arrays.asList(Constants.NAME_COLUMN, Constants.AGE_COLUMN, Constants.MARRIED_COLUMN, Constants.SALARY_COLUMN);

    // initialization
    IMAGridLayer gridLayer = LayerHelper.extractGridLayer(view);
    IMABodyLayer bodyLayer = gridLayer.getBodyLayer();
    IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();
    ColumnHideShowLayer columnHideShowLayer = bodyLayer.getColumnHideShowLayer();
    // hide the columns to be tested
    for (String columnName : columnNamesToHide) {
      int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

      // column exists
      if (columnIndex != -1) {
        int columnPosition = columnHideShowLayer.getColumnPositionByIndex(columnIndex);
        
        // column is not hidden
        assertFalse(columnHideShowLayer.isColumnIndexHidden(columnIndex));

        // hide the column
        columnHideShowLayer.doCommand(new ColumnHideCommand(columnHideShowLayer, columnPosition));

        // check that it's hidden
        assertTrue(columnHideShowLayer.isColumnIndexHidden(columnIndex));
      }
    }

    // add another system function and check that the same columns are
    // hidden
    Set<Integer> beforeHiddenColumns = new HashSet<>(columnHideShowLayer.getHiddenColumnIndexes());

    Man anotherMan = RandomEntityFactory.getInstance().createRandomMan();

    data.add(anotherMan);
    view.dataChanged(data);
    Set<Integer> afterHiddenColumns = new HashSet<>(columnHideShowLayer.getHiddenColumnIndexes());

    assertEquals(beforeHiddenColumns, afterHiddenColumns);

    // add a category and check that only the common hidden columns (name
    // and age) are hidden
    Elf elf = RandomEntityFactory.getInstance().createRandomElf();
    data.add(elf);
    view.dataChanged(data);

    // check that all the common columns are hidden
    for (String columnName : columnNamesToHide) {
      int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

      // column exists then it should be hidden
      if (columnIndex != -1) {
        assertTrue(columnHideShowLayer.isColumnIndexHidden(columnIndex));
      }
    }

    // restore the hidden columns and test that they are hidden no more
    for (String columnName : columnNamesToHide) {
      int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

      // column exists test that its hidden and restore it
      if (columnIndex != -1) {
        assertTrue(columnHideShowLayer.isColumnIndexHidden(columnIndex));
        columnHideShowLayer.doCommand(new MultiColumnShowCommand(Arrays.asList(columnIndex)));
        assertFalse(columnHideShowLayer.isColumnIndexHidden(columnIndex));
      }
    }

    // reset the view for the next test
    ViewHelper.resetViews(view);

  }
}
