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

// ============================================================================
// 
// This file is part of MyCCM (R)
// Copyright (C) THALES 2007-2008. All rights reserved
// 
// ============================================================================

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
