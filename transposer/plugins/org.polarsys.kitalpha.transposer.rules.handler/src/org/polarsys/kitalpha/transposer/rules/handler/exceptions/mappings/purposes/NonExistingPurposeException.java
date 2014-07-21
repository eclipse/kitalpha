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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes;

/**
 * @author Franco Bergomi
 *
 */
public class NonExistingPurposeException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = -5129052539157216773L;
  private String nonExistantPurpose;
  
  /**
   * @param purpose_p
   */
  public NonExistingPurposeException(String purpose_p) {
    nonExistantPurpose = purpose_p;
  }

  /**
   * @see java.lang.Throwable#toString()
   */
  @Override
  public String toString() {
    return "The purpose <"+nonExistantPurpose+"> doesn't exist";  //$NON-NLS-1$//$NON-NLS-2$
  }
}
