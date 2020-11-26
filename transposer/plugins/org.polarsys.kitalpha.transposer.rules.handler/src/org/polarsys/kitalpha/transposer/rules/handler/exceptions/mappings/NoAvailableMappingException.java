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

/**
 * @author Franco Bergomi
 *
 */
public class NoAvailableMappingException extends MappingResolutionException{

  /**
   * 
   */
  private static final long serialVersionUID = -4889197927316122458L;
  private Class<?> _incriminatedClass;
  
  /**
   * @param eobjectClass_p
   */
  public NoAvailableMappingException(Class<?> eobjectClass_p) {
    _incriminatedClass = eobjectClass_p;
  }

  /**
   * @see java.lang.Throwable#toString()
   */
  @Override
  public String toString() {
    return "No Mapping has been defined for MetaClass "+_incriminatedClass.getName(); //$NON-NLS-1$
  }
}
