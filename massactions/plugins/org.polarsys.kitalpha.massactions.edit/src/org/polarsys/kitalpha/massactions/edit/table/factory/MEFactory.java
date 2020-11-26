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
package org.polarsys.kitalpha.massactions.edit.table.factory;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.factory.MAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.edit.config.MEConfiguration;
import org.polarsys.kitalpha.massactions.edit.data.accessor.MEColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.edit.table.layer.body.MEBodyLayer;

/**
 * An extension of the default {@link MAFactory} that uses custom implementation for some of its components.
 * 
 * @author Sandu Postaru
 *
 */
public class MEFactory extends MAFactory {

  @Override
  public MEColumnPropertyAccessor createColumnPropertyAccessor(IMABodyLayer bodyLayer) {
    return new MEColumnPropertyAccessor(bodyLayer);
  }

  @Override
  public MEConfiguration createConfiguration(NatTable natTable, IConfigRegistry configRegistry) {
    return new MEConfiguration(natTable, configRegistry);
  }

  @Override
  public MEBodyLayer createBodyLayer(Collection<EObject> data, IMAFactory factory) {
    return new MEBodyLayer(data, factory);
  }

}
