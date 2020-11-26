/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.spec;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl;

/**
 * @author Guillaume GEBHART
 *
 */
public class MappingPackageSpec extends MappingPackageImpl {

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl#getAllMappingElements()
   */
  @Override
  public EList<MappingElement> getAllMappingElements() {
    EList<MappingElement> allMappingElements = new BasicEList<MappingElement>();

    allMappingElements.addAll(getOwnedMappingElements());

    for (MappingPackage mappingPackage : getOwnedPackages()) {
      allMappingElements.addAll(mappingPackage.getAllMappingElements());
    }

    return allMappingElements;
  }
}
