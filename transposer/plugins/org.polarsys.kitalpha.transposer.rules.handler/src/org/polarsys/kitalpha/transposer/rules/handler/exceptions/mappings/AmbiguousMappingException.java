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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;

/**
 * @author Franco Bergomi
 * 
 */
public class AmbiguousMappingException extends MappingResolutionException {
  /**
   * 
   */
  private static final long serialVersionUID = -7415903441181086206L;

  private List<MappingElement> _ambiguousMappings;
  private Class<?> _incriminatedEClass;

  public AmbiguousMappingException(Class<?> eclass_p, List<MappingElement> ambiguousMappings_p) {
    _ambiguousMappings = new ArrayList<MappingElement>();
    _ambiguousMappings.addAll(ambiguousMappings_p);
    _incriminatedEClass = eclass_p;
  }

  /**
   * @see java.lang.Throwable#toString()
   */
  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("AMBIGUOUS SITUATION for metaclass " + _incriminatedEClass.getName() + "\n"); //$NON-NLS-1$ //$NON-NLS-2$
    for (MappingElement mappingElement : _ambiguousMappings) {
      sb.append(mappingElement.getDomainMetaClass().getName() + "\n"); //$NON-NLS-1$
    }
    return sb.toString();
  }
}
