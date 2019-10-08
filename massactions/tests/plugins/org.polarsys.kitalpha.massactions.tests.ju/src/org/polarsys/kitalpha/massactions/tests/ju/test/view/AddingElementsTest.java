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
package org.polarsys.kitalpha.massactions.tests.ju.test.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.ui.PartInitException;
import org.junit.Test;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
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
public class AddingElementsTest {

  @Test
  public void testAddElements() {

    MEView editionView;
    try {
      editionView = ViewHelper.getActiveMEView();
      MVView visualizationView = ViewHelper.getActiveMVView();

      testAddElements(editionView);
      testAddElements(visualizationView);

    } catch (PartInitException e) {
      e.printStackTrace();
    }

  }

  /**
   * This method tests the addition of elements for a view. It ensures that
   * all of the elements are only present one time, and that for elements of
   * the same type the table configuration does not change.
   * 
   * @param view
   *            the view that is tested.
   */
  private void testAddElements(MAView view) {

    List<EObject> data = new ArrayList<>();

    int initialColumnCount = 0;

    Man man = RandomEntityFactory.getInstance().createRandomMan();
    
    // add a first Man element
    data.add(man);

    // initialization
    view.dataChanged(data);
    IMAGridLayer gridLayer = LayerHelper.extractGridLayer(view);
    IMABodyLayer bodyLayer = gridLayer.getBodyLayer();
    IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();
    IRowDataProvider<EObject> bodyDataProvider = bodyLayer.getBodyDataProvider();

    // test that a column configuration is present
    initialColumnCount = columnPropertyAccessor.getColumnCount();
    assertTrue(initialColumnCount > 0);

    // test that only one element is currently visible
    assertEquals(1, bodyDataProvider.getRowCount());

    // add the same element and test that the table config did not change
    data.add(man);
    view.dataChanged(data);

    assertEquals(initialColumnCount, columnPropertyAccessor.getColumnCount());
    assertEquals(1, bodyDataProvider.getRowCount());

    // add an element of a different type and test that the table config
    // changed
    
    Elf elf = RandomEntityFactory.getInstance().createRandomElf();
    
    data.add(elf);
    view.dataChanged(data);

    assertTrue(columnPropertyAccessor.getColumnCount() < initialColumnCount);
    assertEquals(2, bodyDataProvider.getRowCount());

    // reset the views for future tests
    ViewHelper.resetViews(view);

  }
}
