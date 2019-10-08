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
package org.polarsys.kitalpha.massactions.core.table;

import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.ConfigRegistry;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.massactions.core.config.IMAConfiguration;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnfilter.IMAColumnFilter;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.IMACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;

/**
 * An abstract implementation of a {@link IMATable}.
 * 
 * @author Sandu Postaru
 *
 */
public abstract class MATable implements IMATable {

  private static final Log log = LogFactory.getLog(MATable.class);

  protected final Composite parentView;

  protected NatTable tableBase;
  protected boolean initialized;

  // NatTable components
  protected IMAGridLayer gridLayerStack;
  protected IMAConfiguration tableBaseConfig;
  protected IMAFactory factory;

  // re-applied when the table contents change
  protected IMAColumnFilter currentFilter;    

  public MATable(Composite parentView) {
    this.parentView = parentView;
    GridLayout gridLayout = new GridLayout();
    gridLayout.marginHeight = 0;
    gridLayout.marginWidth = 0;

    this.parentView.setLayout(gridLayout);

    initialized = false;
  }

  public abstract IMAFactory createMAFactory();

  protected void initialize(Collection<EObject> newData) {

    initialized = true;

    ConfigRegistry configRegistry = new ConfigRegistry();

    IMABodyLayer bodyLayerStack = getMAFactory().createBodyLayer(newData, getMAFactory());
    IMAColumnHeaderLayer columnHeaderLayerStack = getMAFactory().createColumnHeaderLayer(bodyLayerStack,
        configRegistry);
    IMARowHeaderLayer rowHeaderLayerStack = getMAFactory().createRowHeaderLayer(bodyLayerStack);
    IMACornerLayer cornerLayerStack = getMAFactory().createCornerLayer(columnHeaderLayerStack, rowHeaderLayerStack);

    gridLayerStack = getMAFactory().creatGridLayer(bodyLayerStack, columnHeaderLayerStack, rowHeaderLayerStack,
        cornerLayerStack);

    tableBase = new NatTable(parentView, gridLayerStack, false);

    tableBaseConfig = getMAFactory().createConfiguration(tableBase, configRegistry);
    tableBaseConfig.apply();

    // Apply the default filter
    currentFilter = getColumnFilterList().get(0);
    applyColumnFilter(currentFilter);
  }

  protected void update(Collection<EObject> newData) {
    gridLayerStack.dataChanged(newData);
    tableBaseConfig.dataChanged(newData);
  }

  @Override
  public void dataChanged(Collection<EObject> newData) {
    if (newData == null || newData.isEmpty()) {
      log.error("Invalid data list: Null or empty");
    } else {
      if (!initialized) {
        initialize(newData);
      } else {
        update(newData);
      }
    }
  }

  @Override
  public void saveState() {
    log.info("Saving state, does nothing for now");
  }

  @Override
  public boolean setFocus() {
    if (tableBase != null && !tableBase.isDisposed()) {
      return tableBase.setFocus();
    }

    return parentView.setFocus();
  }

  protected IMAFactory getMAFactory() {
    if (this.factory == null) {
      this.factory = createMAFactory();
    }

    return this.factory;
  }

  public IMAConfiguration getTableBaseConfig() {
    return tableBaseConfig;
  }

  @Override
  public boolean isInitialized() {
    return initialized;
  }

  @Override
  public void dispose() {
    if (tableBase != null) {
      // save current configuration
      saveState();

      initialized = false;
      tableBaseConfig.dispose();

      // this automatically invokes dispose on all of the layers
      tableBase.dispose();
    }
  }

  @Override
  public IMAGridLayer getGridLayerStack() {
    return gridLayerStack;
  }

  @Override
  public boolean commitAndCloseActiveCellEditor() {
    return tableBase.commitAndCloseActiveCellEditor();
  }

  @Override
  public void clearSelection() {
    gridLayerStack.getBodyLayer().getSelectionLayer().clear();
  }

  @Override
  public void applyColumnFilter(IMAColumnFilter columnFilter) {
    gridLayerStack.getBodyLayer().applyColumnFilter(columnFilter);
    currentFilter = columnFilter;
  }

  @Override
  public List<IMAColumnFilter> getColumnFilterList() {
    return gridLayerStack.getBodyLayer().getColumnFilterList();
  }

  @Override
  public NatTable getNatTable() {
    return tableBase;
  }

}
