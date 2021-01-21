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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;

/**
 * @author Franco Bergomi
 * 
 */
public class MappingPossibilityResolutionException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 2863113967203530898L;
  private MappingResolutionException _mappingResolutionException;
  
  public MappingPossibilityResolutionException(MappingResolutionException mre_p){
    _mappingResolutionException = mre_p;
  }

  public MappingPossibilityResolutionException(){
    //
  }
  
  /**
   * @see java.lang.Throwable#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    if (null != _mappingResolutionException) {
		return super.toString()+_mappingResolutionException.toString();
	}  
    return super.toString();
  }
}
