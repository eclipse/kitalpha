/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.diagnostic;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.validation.model.IConstraintStatus;

/**
 * Include all features of the {@link BasicDiagnostic} but allow to have precise
 * information about the constraintStatus<br>
 * <br>
 * Because {@link BasicDiagnostic} offers set possibilities around its variable,
 * we do not wrap it directly around ConstraintStatus
 */
public class DiagnosticWithConstraintStatus extends BasicDiagnostic {
	final private IConstraintStatus constraintStatus;

	public DiagnosticWithConstraintStatus(IConstraintStatus status) {
		super(status.getSeverity(), status.getPlugin(), status.getCode(), status.getMessage(),
				status.getResultLocus().toArray());
		this.constraintStatus = status;
	}

	public IConstraintStatus getConstraintStatus() {
		return constraintStatus;
	}
}
