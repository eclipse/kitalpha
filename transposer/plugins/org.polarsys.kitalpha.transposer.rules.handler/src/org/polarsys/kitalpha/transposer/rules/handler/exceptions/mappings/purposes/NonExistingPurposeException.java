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
