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
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.reorder.command.ColumnReorderEndCommand;
import org.eclipse.nebula.widgets.nattable.reorder.command.ColumnReorderStartCommand;
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
import org.polarsys.kitalpha.massactions.visualize.MVView;

import TestModel.Elf;
import TestModel.Man;

/**
 * 
 * @author Sandu Postaru
 *
 */
public class ColumnReorderTest {

    @Test
    public void testColumnReorder() {

        MEView editionView;
        try {
            editionView = ViewHelper.getActiveMEView();
            MVView visualizationView = ViewHelper.getActiveMVView();

            testColumnReorder(editionView);
            testColumnReorder(visualizationView);

        } catch (PartInitException e) {
            Activator.getLog().error(e.getMessage(), e);
        }

    }

    /**
     * This method tests the action of reordering columns. It ensures that the SAME EXACT reordered columns are
     * preserved when a new element of the same type as the existing ones is added to the view. And that the reordered
     * columns are reset a new element of a new type is added.
     * 
     * @param view
     *            the view that is tested.
     */
    private void testColumnReorder(MAView view) {

        List<EObject> data = new ArrayList<>();
        Man man = RandomEntityFactory.getInstance().createRandomMan();
        data.add(man);
        view.dataChanged(data);

        // columns to be tested
        List<String> columnNamesToReorder = Arrays.asList("name", "age", "married", "salary");

        // initialization
        IMAGridLayer gridLayer = LayerHelper.extractGridLayer(view);
        IMABodyLayer bodyLayer = gridLayer.getBodyLayer();
        IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();
        ColumnHideShowLayer columnHideShowLayer = bodyLayer.getColumnHideShowLayer();
        ColumnReorderLayer columnReorderLayer = bodyLayer.getColumnReorderLayer();

        // the internal representation of reordered columns
        List<Integer> beforeIndexOrder;
        List<Integer> afterIndexOrder;

        List<Integer> expectedIndexOrder = IntStream.range(0, columnPropertyAccessor.getColumnCount()).boxed().collect(Collectors.toList());
        beforeIndexOrder = new ArrayList<>(columnReorderLayer.getColumnIndexOrder());
        assertEquals(expectedIndexOrder, beforeIndexOrder);

        for (String columnName : columnNamesToReorder) {
            int columnIndex = columnPropertyAccessor.getColumnIndex(columnName);

            // column exists
            if (columnIndex != -1) {
                int columnPosition = columnHideShowLayer.getColumnPositionByIndex(columnIndex);
                // reorder at start
                int newColumnPosition = 0;
                // reorder the column
                columnReorderLayer.doCommand(new ColumnReorderStartCommand(columnReorderLayer, columnPosition));
                // always at the end
                columnReorderLayer.doCommand(new ColumnReorderEndCommand(columnReorderLayer, newColumnPosition));
            }
        }

        afterIndexOrder = new ArrayList<>(columnReorderLayer.getColumnIndexOrder());
        assertFalse(afterIndexOrder.isEmpty());

        // check that the reorder has been performed
        assertNotSame(afterIndexOrder, beforeIndexOrder);

        Man anotherMan = RandomEntityFactory.getInstance().createRandomMan();

        // add a MAN and check that we have the same order
        beforeIndexOrder = new ArrayList<>(columnReorderLayer.getColumnIndexOrder());
        data.add(anotherMan);
        view.dataChanged(data);
        afterIndexOrder = new ArrayList<>(columnReorderLayer.getColumnIndexOrder());

        assertEquals(beforeIndexOrder, afterIndexOrder);

        // save current reordered elements order
        beforeIndexOrder = new ArrayList<>(afterIndexOrder);

        // add a ELF and check that the order has been kept
        Elf elf = RandomEntityFactory.getInstance().createRandomElf();
        data.add(elf);
        view.dataChanged(data);

        final List<Integer> finalAfterIndexOrder = new ArrayList<>(columnReorderLayer.getColumnIndexOrder());

        // we expect the new indexOrder to be a subset of the old indexOrder with the elements in the same order
        List<Integer> collected = beforeIndexOrder.stream().filter(finalAfterIndexOrder::contains).collect(Collectors.toList());
        assertEquals(collected, finalAfterIndexOrder);

        ViewHelper.resetViews(view);

    }
}
