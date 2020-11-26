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
