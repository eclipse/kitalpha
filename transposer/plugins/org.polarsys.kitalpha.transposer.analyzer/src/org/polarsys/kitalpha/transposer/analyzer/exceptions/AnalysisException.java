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


package org.polarsys.kitalpha.transposer.analyzer.exceptions;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.ComputePremisesException;

/**
 * @author Guillaume Gebhart
 * 
 */
public class AnalysisException extends Exception {

  /**
   * 
   */
  public AnalysisException(ComputePremisesException exception_p) {
    // TODO Auto-generated constructor stub
  }

  /**
   * 
   */
  public AnalysisException(MappingPossibilityResolutionException exception_p) {
    // TODO Auto-generated constructor stub
  }

}
