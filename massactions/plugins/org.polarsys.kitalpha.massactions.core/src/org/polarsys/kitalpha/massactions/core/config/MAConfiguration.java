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
package org.polarsys.kitalpha.massactions.core.config;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.sort.config.DefaultSortConfiguration;
import org.eclipse.nebula.widgets.nattable.sort.config.SingleClickSortConfiguration;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;

public abstract class MAConfiguration implements IMAConfiguration {

  protected final NatTable natTable;

  protected MAColumnConfiguration editorConfiguration;

  protected MAMenuConfiguration menuConfiguration;

  protected DefaultSortConfiguration sortConfiguration;

  protected MAExportConfiguration exportConfiguration;
  
  protected MAThemeConfiguration themeExtension;

  public MAConfiguration(NatTable natTable, IConfigRegistry configRegistry) {
    this.natTable = natTable;

    // important since the previous layer use the registry
    // we must ensure we use the same one
    this.natTable.setConfigRegistry(configRegistry);

    addConfigurations();
  }

  protected void addConfigurations() {
    themeExtension = createThemeConfiguration();
    if (themeExtension != null) {
      natTable.addConfiguration(themeExtension);
    }

    editorConfiguration = createColumnConfiguration();
    if (editorConfiguration != null) {
      natTable.addConfiguration(editorConfiguration);
    }

    sortConfiguration = createSortConfiguration();
    if (sortConfiguration != null) {
      natTable.addConfiguration(sortConfiguration);
    }

    exportConfiguration = createExportConfiguration();
    if (exportConfiguration != null) {
      natTable.addConfiguration(exportConfiguration);
    }

    menuConfiguration = createMenuConfiguration();
    if (menuConfiguration != null) {
      natTable.addConfiguration(menuConfiguration);
    }
  }

  protected MAExportConfiguration createExportConfiguration() {
    return new MAExportConfiguration();
  }

  protected DefaultSortConfiguration createSortConfiguration() {
    return new SingleClickSortConfiguration();
  }

  protected MAColumnConfiguration createColumnConfiguration() {
    return new MAColumnConfiguration(getBodyLayer());
  }

  protected MAThemeConfiguration createThemeConfiguration() {
    return new MAThemeConfiguration();
  }

  protected MAMenuConfiguration createMenuConfiguration() {
    return new MAMenuConfiguration(natTable);
  }

  public MAMenuConfiguration getMenuConfiguration() {
    return menuConfiguration;
  }

  public MAColumnConfiguration getEditorConfiguration() {
    return editorConfiguration;
  }

  public DefaultSortConfiguration getSortConfiguration() {
    return sortConfiguration;
  }

  public MAExportConfiguration getExportConfiguration() {
    return exportConfiguration;
  }

  public MAThemeConfiguration getThemeExtension() {
    return themeExtension;
  }

  protected abstract IMABodyLayer getBodyLayer();

  @Override
  public void apply() {
    natTable.configure();
    fillDefaults();
  }

  protected void fillDefaults() {
    GridDataFactory.fillDefaults().grab(true, true).applyTo(natTable);
  }

  @Override
  public void dataChanged(Collection<EObject> data) {
    if (editorConfiguration != null) {
      editorConfiguration.dataChanged(data);
    }
    natTable.configure();
    natTable.refresh();
  }

  @Override
  public void dispose() {
    if (editorConfiguration != null) {
      editorConfiguration.dispose();
    }
  }

}
