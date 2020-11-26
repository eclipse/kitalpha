/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules;

import org.polarsys.kitalpha.transposer.rules.handler.business.GenericRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;


/**
 * @author Franco Bergomi
 */
public class ComputePremisesException extends Exception {

  private MappingResolutionException mappingPossibilityResolutionException;
  private Exception _ruleException;
  private Object _incriminatedEObject;
  private String _incriminatedPurpose;
  
  /**
   * @param ruleResolutionException_p
   * @param purpose_p_p 
   * @param object_p_p 
   */
  public ComputePremisesException(MappingResolutionException mappingPossibilityResolutionException_p, Object object_p, String purpose_p) {
    mappingPossibilityResolutionException = mappingPossibilityResolutionException_p;
    _incriminatedEObject=object_p;
    _incriminatedPurpose = purpose_p;
  }

  /**
   * @param exception_p_p
   */
  public ComputePremisesException(Exception exception_p,Object object_p, String purpose_p){
    _ruleException = exception_p;
    _incriminatedEObject=object_p;
    _incriminatedPurpose = purpose_p;
  }


  /**
   * 
   */
  private static final long serialVersionUID = 5007081842434598246L;

  
  /**
   * @see java.lang.Throwable#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    
    sb.append(super.toString());
    
    if (null!=_ruleException){
      sb.append(" Rule could not compute premises for EObject : \n");
      sb.append(_incriminatedEObject);
      sb.append("for purpose <"+_incriminatedPurpose+">  : \n");
      sb.append(_ruleException.toString());
      
      
      StackTraceElement[] trace = _ruleException.getStackTrace();
      for (StackTraceElement stackTraceElement : trace) {
        if (stackTraceElement.getClassName().equals(GenericRulesHandler.class.getName())) {
			return sb.toString();
		}
        sb.append("\nat " + stackTraceElement.toString()); //$NON-NLS-1$
      }
      return sb.toString();
      
    }
    
    if (null!= mappingPossibilityResolutionException){
      sb.append("\nCould not resolve transformation rule for EObject : \n");
      sb.append(_incriminatedEObject);
      sb.append("for purpose <"+_incriminatedPurpose+">  : \n");
      sb.append(mappingPossibilityResolutionException.toString());
    }
    
    // TODO Auto-generated method stub
    return sb.toString();
  }
}
