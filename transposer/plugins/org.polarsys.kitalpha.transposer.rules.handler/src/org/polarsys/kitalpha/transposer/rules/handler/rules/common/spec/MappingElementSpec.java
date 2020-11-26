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

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl;

/**
 * @author Guillaume GEBHART
 * 
 */
public class MappingElementSpec extends MappingElementImpl {

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getDefaultPossibility()
   */
  @Override
  public MappingPossibility getDefaultPossibility() {
    MappingPossibility possibilityToUse = getOwnedDefaultPossibility();
    if (possibilityToUse == null && isReuseSuperDefaultPossibility() && getExtendedMappingElement() != null) {
      possibilityToUse = getExtendedMappingElement().getDefaultPossibility();
    }
    return possibilityToUse;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   */
  @Override
  public EList<MappingPossibility> getAllPossibilities() {
    EList<MappingPossibility> allPossibilities = new BasicEList<MappingPossibility>();
    allPossibilities.addAll(getOwnedPossibilities());
    if (isReuseSuperPossibilities() && getExtendedMappingElement() != null) {
		allPossibilities.addAll(getExtendedMappingElement().getAllPossibilities());
	}
    return allPossibilities;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl#getApplicablePossibility()
   */
  @Override
  public MappingPossibility getApplicablePossibility(Object object_p) {
    for (MappingPossibility mappingPossibility : getOwnedPossibilities()) {
      if (mappingPossibility.isApplicableOn(object_p)) {
		return mappingPossibility;
	}
    }

    if (getDefaultPossibility() != null) {
      if (getDefaultPossibility().isApplicableOn(object_p)) {
		return getDefaultPossibility();
	}
    }

    return null;
  }
}
