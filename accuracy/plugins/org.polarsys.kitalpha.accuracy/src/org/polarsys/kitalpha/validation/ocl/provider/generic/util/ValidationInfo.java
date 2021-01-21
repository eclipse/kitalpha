/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.ocl.provider.generic.util;

import org.eclipse.emf.validation.model.ConstraintSeverity;

public class ValidationInfo {
  private final String theMessage;

  private final ConstraintSeverity theSeverity;

  public ValidationInfo(String message, ConstraintSeverity severity) {
    this.theMessage = message;
    this.theSeverity = severity;
  }

  public String getMessage() {
    return this.theMessage;
  }

  public ConstraintSeverity getSeverity() {
    return this.theSeverity;
  }
}
