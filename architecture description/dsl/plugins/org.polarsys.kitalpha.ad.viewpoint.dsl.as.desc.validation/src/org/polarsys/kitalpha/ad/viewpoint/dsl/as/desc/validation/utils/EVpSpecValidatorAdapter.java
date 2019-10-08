/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.utils;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * @author Boubekeur Zendagui
 */

@SuppressWarnings("rawtypes")
public class EVpSpecValidatorAdapter extends EObjectValidator {

	private final IBatchValidator batchValidator;

	public EVpSpecValidatorAdapter() {
		super();
		batchValidator = (IBatchValidator) ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
		batchValidator.setIncludeLiveConstraints(true);
		batchValidator.setReportSuccesses(false);
	}


	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	/*
	 * Bug 2233: This method is called by several jobs which lead to errors because the jobs are not synchronized
	 */
	@Override
	@SuppressWarnings("unchecked")
	public synchronized boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map context) {
		super.validate(eClass, eObject, diagnostics, context);
		IStatus status = Status.OK_STATUS;
		if (diagnostics != null && !hasProcessed(eObject, context)) 
		{
			status = batchValidator.validate( eObject, new NullProgressMonitor());
			processed(eObject, context, status);
			appendDiagnostics(status, diagnostics);
		}

		return status.isOK();
	}

	@SuppressWarnings("unchecked")
	private void processed(EObject eObject, Map context, IStatus status) {

		if (context != null) {
			context.put(eObject, status);
		}
	}

	private boolean hasProcessed(EObject eObject, Map context) {
		boolean result = false;

		if (context != null) 
		{
			while (eObject != null) 
			{
				if (context.containsKey(eObject)) 
				{
					result = true;
					eObject = null;
				} 
				else {
					eObject = eObject.eContainer();
				}
			}
		}

		return result;
	}

	private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
		if (status.isMultiStatus()) 
		{
			IStatus[] children = status.getChildren();
			for (int i = 0; i < children.length; i++) {
				appendDiagnostics(children[i], diagnostics);
			}
		} 
		else 
		{
			if (status instanceof IConstraintStatus) 
			{
				diagnostics.add(new BasicDiagnostic(
						status.getSeverity(),
						status.getPlugin(),
						status.getCode(),
						status.getMessage(),
						((IConstraintStatus) status).getResultLocus().toArray()));
			}
		}
	}
}
