/*******************************************************************************
 * Copyright (c) 2016, 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.scrutiny.analyzer;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.visitor.ScrutinizeVisitor;

/**
 * @author Faycal Abka
 */
public class Scrutineer {

  private static Logger LOGGER = Logger.getLogger(Scrutineer.class);

  /**
   * Perform a Scrutiny on given resources. All resources shall be defined in the same resourceSet
   */
  public static ModelScrutinyRegistry startScrutiny(Collection<Resource> resources) {
    ScrutinizeVisitor visitor = new ScrutinizeVisitor();
    for (Resource resource : resources) {
      visitor.accept(resource);
    }
    return visitor.getRegistry();
  }

  /**
   * Please use startScrutiny(resources) instead of calling many startScrutiny(resource) for performance issues
   */
  public static ModelScrutinyRegistry startScrutiny(Resource resource) {
    ScrutinizeVisitor visitor = new ScrutinizeVisitor();
    visitor.accept(resource);
    return visitor.getRegistry();
  }


}
