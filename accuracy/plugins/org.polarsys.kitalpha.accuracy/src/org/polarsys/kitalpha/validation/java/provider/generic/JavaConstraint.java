/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.java.provider.generic;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ModelConstraint;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;

import org.polarsys.kitalpha.validation.util.LabelUtil;

/**
 * Generic Java Constraint.
 * 
 * @author Yann Mortier
 */
public class JavaConstraint<T extends EObject> extends ModelConstraint {

	/** The descriptor of the constraint. */
	@SuppressWarnings("unused")
	private AbstractConstraintDescriptor descriptor;

	/** The java constraint. */
	private IJavaConstraint<T> constraint;

	/** The type of the Model Element to validate. */
	private Class<T> type;

	/**
	 * Creates the java constraint.
	 * 
	 * @param descriptor
	 *            the descriptor.
	 * @param constraint
	 *            the contraint to execute.
	 * @param type
	 *            the type of object to validate.
	 */
	public JavaConstraint(AbstractConstraintDescriptor descriptor,
			IJavaConstraint<T> constraint, Class<T> type) {
		super(descriptor);
		this.descriptor = descriptor;
		this.constraint = constraint;
		this.type = type;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	public IStatus validate(IValidationContext ctx) {
		EObject target = ctx.getTarget();

		if (type.isInstance(target)) {
			boolean valid = constraint.isValid(type.cast(target));
			if (!valid) {
				String objectLabel = LabelUtil.getEObjectLabel(target);
				Object[] args = { objectLabel };

				//
				// Added since Accuracy 1.2.3
				// User can add additional message arguments.
				if (constraint instanceof IExtendedJavaConstraint) {
					IExtendedJavaConstraint<? extends EObject> castedConstraint = (IExtendedJavaConstraint<?>) constraint;
					Object[] additionalArguments = castedConstraint
							.getAdditionalArguments();
					args = new Object[1 + additionalArguments.length];
					args[0] = objectLabel;
					System.arraycopy(additionalArguments, 0, args, 1,
							additionalArguments.length);
				}

				return ctx.createFailureStatus(args);
			}
		}

		return ctx.createSuccessStatus();
	}
}
