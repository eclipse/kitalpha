/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.table.factory;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.factory.MAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.row.IMARowHeaderLayer;
import org.polarsys.kitalpha.massactions.visualize.config.MVConfiguration;
import org.polarsys.kitalpha.massactions.visualize.data.accessor.MVColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.visualize.table.layer.body.MVBodyLayer;
import org.polarsys.kitalpha.massactions.visualize.table.layer.column.MVColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.visualize.table.layer.groupby.IMVGroupByLayer;
import org.polarsys.kitalpha.massactions.visualize.table.layer.groupby.MVGroupByLayer;
import org.polarsys.kitalpha.massactions.visualize.table.layer.row.MVRowHeaderLayer;

/**
 * An extension of the default {@link MAFactory} that uses custom implementation for some of its components.
 * 
 * @author Sandu Postaru
 *
 */
public class MVFactory extends MAFactory {

  @Override
  public MVColumnPropertyAccessor createColumnPropertyAccessor(IMABodyLayer bodyLayer) {
    return new MVColumnPropertyAccessor(bodyLayer);
  }

  @Override
  public MVConfiguration createConfiguration(NatTable natTable, IConfigRegistry configRegistry) {
    return new MVConfiguration(natTable, configRegistry);
  }

  @Override
  public MVBodyLayer createBodyLayer(Collection<EObject> data, IMAFactory factory) {
    return new MVBodyLayer(data, factory);
  }

  @Override
  public MVColumnHeaderLayer createColumnHeaderLayer(IMABodyLayer bodyLayerStack, IConfigRegistry configRegistry) {
    return new MVColumnHeaderLayer(bodyLayerStack, configRegistry);
  }

  @Override
  public IMARowHeaderLayer createRowHeaderLayer(IMABodyLayer bodyLayerStack) {
    return new MVRowHeaderLayer(bodyLayerStack);
  }
    
  public IMVGroupByLayer createGroupByLayer(IMAGridLayer gridLayerStack) {
    return new MVGroupByLayer(gridLayerStack);
  }

}
