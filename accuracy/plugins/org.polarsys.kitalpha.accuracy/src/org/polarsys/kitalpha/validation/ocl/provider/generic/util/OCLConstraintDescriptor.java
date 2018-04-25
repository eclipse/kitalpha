/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.ocl.provider.generic.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.ocl.ecore.Constraint;

import org.polarsys.kitalpha.validation.provider.generic.AbstractAccuracyConstraintDescriptor;

/**
 * Implementation of a constraint descriptor for our provider.
 */
public class OCLConstraintDescriptor extends
		AbstractAccuracyConstraintDescriptor {
	private final int code;
	private final Constraint constraint;
	private final String errorMessage;
	private final String name;
	private final ConstraintSeverity severity;

	/**
	 * Depricated constructor, use 
	 * OCLConstraintDescriptor(String requirementId, String invariantId, String namespace, 
	 * 							Constraint constraint, int code, ValidationInfo validationInfo).
	 * 
	 * The constraintFileName is not used
	 * 
	 * @param requirementId
	 * @param invariantId
	 * @param namespace
	 * @param constraint
	 * @param constraintFileName
	 * @param code
	 * @param validationInfo
	 */
	@Deprecated
	public OCLConstraintDescriptor(String requirementId, String invariantId,
			String namespace, Constraint constraint,
			String constraintFileName, int code, ValidationInfo validationInfo) {
		super(namespace, requirementId, invariantId);
		this.constraint = constraint;

		String nameTemp = constraint.getName();
		if (nameTemp == null) {
			nameTemp = Long.toHexString(System.identityHashCode(constraint));
		}
		this.name = nameTemp;
		this.code = code;
		this.errorMessage = validationInfo.getMessage();
		this.severity = validationInfo.getSeverity();
	}
	
	public OCLConstraintDescriptor(String requirementId, String invariantId,
			String namespace, Constraint constraint, int code, ValidationInfo validationInfo) {
		this(namespace, requirementId, invariantId, constraint, null, code, validationInfo);
	}

	public String getBody() {
		return constraint.getSpecification().getBodyExpression().toString();
	}

	final Constraint getConstraint() {
		return constraint;
	}

	public String getDescription() {
		/*
		 * return the body message
		 */
		return getMessagePattern();
	}

	public EvaluationMode<?> getEvaluationMode() {
		return EvaluationMode.BATCH;
	}

	public String getMessagePattern() {
		return this.errorMessage;
	}

	public String getName() {
		return name;
	}

	public ConstraintSeverity getSeverity() {
		return severity;
	}

	public int getStatusCode() {
		return code;
	}

	public boolean targetsEvent(Notification notification) {
		return false;
	}

	public boolean targetsTypeOf(EObject eObject) {
		return constraint.getSpecification().getContextVariable().getType()
				.isInstance(eObject);
	}

}
