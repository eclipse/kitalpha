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
package org.polarsys.kitalpha.massactions.core.table.factory;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.body.MABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.column.MAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.IMACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.corner.MACornerLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.MAGridLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.MARowHeaderLayer;

/**
 * The default implementation for a {@link IMAFactory}. You can override the provided methods to change the stack of
 * components that are used for your own {@link IMATable} extensions with a minimal impact on the actual code, by
 * providing a new factory that constructs your own customized components.
 * 
 * @author Sandu Postaru
 * 
 */
public abstract class MAFactory implements IMAFactory {

  @Override
  public IMABodyLayer createBodyLayer(Collection<EObject> data, IMAFactory factory) {
    return new MABodyLayer(data, factory);
  }

  @Override
  public IMAColumnHeaderLayer createColumnHeaderLayer(IMABodyLayer bodyLayerStack, IConfigRegistry configRegistry) {
    return new MAColumnHeaderLayer(bodyLayerStack, configRegistry);
  }

  @Override
  public IMARowHeaderLayer createRowHeaderLayer(IMABodyLayer bodyLayerStack) {
    return new MARowHeaderLayer(bodyLayerStack);
  }

  @Override
  public IMACornerLayer createCornerLayer(IMAColumnHeaderLayer columnHeaderLayerStack,
      IMARowHeaderLayer rowHeaderLayerStack) {
    return new MACornerLayer(columnHeaderLayerStack, rowHeaderLayerStack);
  }

  @Override
  public IMAGridLayer creatGridLayer(IMABodyLayer bodyLayerStack, IMAColumnHeaderLayer columnHeaderLayerStack,
      IMARowHeaderLayer rowHeaderLayerStack, IMACornerLayer cornerLayerStack) {
    return new MAGridLayer(bodyLayerStack, columnHeaderLayerStack, rowHeaderLayerStack, cornerLayerStack);
  }
}
