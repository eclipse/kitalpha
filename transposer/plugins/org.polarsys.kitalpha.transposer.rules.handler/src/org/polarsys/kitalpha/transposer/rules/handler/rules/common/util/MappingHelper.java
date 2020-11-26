/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.util;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;

/**
 * @author Guillaume GEBHART
 * 
 */
public class MappingHelper {

  public static void resolveAllAvailableMappingElements(Mapping mapping_p, Class<?> domainMetaClass_p, List<MappingElement> accumulator_p) {
    MappingElement mappingElement = mapping_p.getOwnedMappingElement(domainMetaClass_p);

    if (mappingElement != null) {
      ArrayList<MappingElement> alreadyBrowsed = new ArrayList<MappingElement>();
      alreadyBrowsed.addAll(accumulator_p);

      // if domainMetaClass_p is superClass of a known class (eg the domain MetaClass of a MappingElement already present in the accumulator
      // => stop and do nothing here
      for (MappingElement currentMapping : alreadyBrowsed) {
        if (domainMetaClass_p.isAssignableFrom(currentMapping.getDomainMetaClass())) {
          return;
        }
        //if the current domain MetaClass inherits from a known class
        // => remove the corresponding MappingElement and add the current one.
        if (currentMapping.getDomainMetaClass() != null && currentMapping.getDomainMetaClass().isAssignableFrom(domainMetaClass_p)) {
          accumulator_p.remove(currentMapping);
        }
      }

      if (!accumulator_p.contains(mappingElement)) {
        accumulator_p.add(mappingElement);
      }
      return;
    }

    // Not found, check the interfaces
    Class<?>[] superMetaclasses = domainMetaClass_p.getInterfaces();
    for (Class<?> superMetaclass : superMetaclasses) {
      resolveAllAvailableMappingElements(mapping_p, superMetaclass, accumulator_p);
    }
  }
}
