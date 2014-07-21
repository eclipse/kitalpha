/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
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
