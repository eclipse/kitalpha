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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;

/**
 * @author Franco Bergomi
 * 
 */
public class RuleResolutionException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 2863113967203530898L;
  private MappingResolutionException _mappingResolutionException;
  
  public RuleResolutionException(MappingResolutionException mre_p){
    _mappingResolutionException = mre_p;
  }

  public RuleResolutionException(){
    //
  }
  
  /**
   * @see java.lang.Throwable#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    if (null != _mappingResolutionException)  
      return super.toString()+"\n"+_mappingResolutionException;  
    return super.toString();
  }
}
