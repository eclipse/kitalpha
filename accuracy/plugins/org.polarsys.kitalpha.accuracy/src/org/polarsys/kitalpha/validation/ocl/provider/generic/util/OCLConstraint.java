/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.validation.ocl.provider.generic.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.ocl.AbstractOCLModelConstraint;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.polarsys.kitalpha.validation.util.LabelUtil;

/**
 * Implementation of the constraint that our provider provides. code taken from
 * org.eclipse.emf.validation.examples.ocl without any modifications
 */
public class OCLConstraint extends
		AbstractOCLModelConstraint<EClassifier, Constraint, EClass, EObject> {
	
	

	private final OCL.Query query;

	public OCLConstraint(OCLConstraintDescriptor desc, OCL ocl) {
		super(desc);

		this.query = ocl.createQuery(desc.getConstraint());
	}

	// override this method to indicate that we are doing new-style OCL
	@Override
	protected EnvironmentFactory<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> createOCLEnvironmentFactory() {
		return query.getOCL().getEnvironment().getFactory();
	}

	@Override
	public Query<EClassifier, EClass, EObject> getConstraintCondition(
			EObject target) {
		return query;
	}

	@SuppressWarnings("nls")
	@Override
	public IStatus validate(IValidationContext ctx) {
		IStatus status = null;
		try {
			status = super.validate(ctx);
			if (!status.isOK()) {
				status = ctx
						.createFailureStatus(new Object[] { LabelUtil.getEObjectLabel(ctx
								.getTarget()) });
			}
		} catch (Exception e) {
			System.out.println("Rule evaluation failed : "
					+ getDescriptor().getName());
			e.printStackTrace();
		}
		return status;
	}
}
