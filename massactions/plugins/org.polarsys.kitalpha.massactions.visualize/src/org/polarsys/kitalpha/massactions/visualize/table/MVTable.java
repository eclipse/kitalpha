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
package org.polarsys.kitalpha.massactions.visualize.table;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.ConfigRegistry;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.massactions.core.table.MATable;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.IMACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;
import org.polarsys.kitalpha.massactions.visualize.table.factory.MVFactory;
import org.polarsys.kitalpha.massactions.visualize.table.layer.body.MVBodyLayer;
import org.polarsys.kitalpha.massactions.visualize.table.layer.groupby.IMVGroupByLayer;

/**
 * An Mass Visualization extension of the default {@link MATable}.
 * 
 * @author Sandu Postaru
 *
 */
public class MVTable extends MATable {

  protected IMVGroupByLayer groupByLayerStack;
  protected MVBodyLayer bodyLayerStack;

  public MVTable(Composite parentView) {
    super(parentView);
  }

  @Override
  public MVFactory createMAFactory() {
    return new MVFactory();
  }

  @Override
  protected void initialize(Collection<EObject> selectionData) {

    initialized = true;

    ConfigRegistry configRegistry = new ConfigRegistry();

    bodyLayerStack = getMAFactory().createBodyLayer(selectionData, getMAFactory());

    IMAColumnHeaderLayer columnHeaderLayerStack = getMAFactory().createColumnHeaderLayer(bodyLayerStack,
        configRegistry);
    IMARowHeaderLayer rowHeaderLayerStack = getMAFactory().createRowHeaderLayer(bodyLayerStack);
    IMACornerLayer cornerLayerStack = getMAFactory().createCornerLayer(columnHeaderLayerStack, rowHeaderLayerStack);

    gridLayerStack = getMAFactory().creatGridLayer(bodyLayerStack, columnHeaderLayerStack, rowHeaderLayerStack,
        cornerLayerStack);

    groupByLayerStack = getMAFactory().createGroupByLayer(gridLayerStack);

    tableBase = new NatTable(parentView, groupByLayerStack, false);

    tableBaseConfig = factory.createConfiguration(tableBase, configRegistry);
    tableBaseConfig.apply();

    // apply the default filter
    currentFilter = getColumnFilterList().get(0);
    applyColumnFilter(currentFilter);
  }

  @Override
  protected void update(Collection<EObject> newData) {
    groupByLayerStack.dataChanged(newData);
    tableBaseConfig.dataChanged(newData);
  }

  @Override
  protected MVFactory getMAFactory() {
    return (MVFactory) super.getMAFactory();
  }

}
