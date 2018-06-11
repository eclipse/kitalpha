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
package org.polarsys.kitalpha.validation.java.provider.generic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;

import org.polarsys.kitalpha.validation.provider.generic.AbstractAccuracyConstraintDescriptor;

/**
 * Descriptor of a Java Constraint.
 * 
 * @author Yann Mortier
 */
public class JavaConstraintDescriptor extends
		AbstractAccuracyConstraintDescriptor {

	/** The description of the constraint. */
	private final String description;

	/** The error message to display when the contraint is violated. */
	private final String errorMessage;

	/** The name of the constraint. */
	private final String name;

	/** The severity of the constraint. */
	private final ConstraintSeverity severity;

	/** The constraint. */
	private JavaConstraint<?> javaConstraint;

	/** The IJavaConstraint. */
	private IJavaConstraint<?> iJavaConstraint;

	private int code;

	/**
	 * Creates a new descriptor of the Java Constraint.
	 * 
	 * @param contributorName
	 *            the name of the plug-in that provides the constraint.
	 * @param requirementId
	 *            the ID of the requirement of the constraint.
	 * @param invariantId
	 *            the ID of the invariant of the constraint.
	 * @param description
	 *            the description of the constraint.
	 * @param errorMessage
	 *            the error message to display when the constraint is violated.
	 * @param name
	 *            the name of the constraint.
	 * @param severity
	 *            the severity of the constraint.
	 * @param iJavaConstraint
	 *            the object that is able to tell if a constraint is checked.
	 * @param code
	 *            the code of the constraint.
	 */
	public JavaConstraintDescriptor(String contributorName,
			String requirementId, String invariantId, String description,
			String errorMessage, String name, ConstraintSeverity severity,
			IJavaConstraint<?> iJavaConstraint, int code) {
		super(contributorName, requirementId, invariantId);
		this.description = description;
		this.errorMessage = errorMessage;
		this.name = name;
		this.severity = severity;
		this.iJavaConstraint = iJavaConstraint;
		this.code = code;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getBody()
	 */
	@Override
	public String getBody() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getDescription()
	 */
	@Override
	public String getDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getEvaluationMode()
	 */
	@Override
	public EvaluationMode getEvaluationMode() {
		return EvaluationMode.BATCH;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getMessagePattern()
	 */
	@Override
	public String getMessagePattern() {
		return this.errorMessage;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getSeverity()
	 */
	@Override
	public ConstraintSeverity getSeverity() {
		return this.severity;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getStatusCode()
	 */
	@Override
	public int getStatusCode() {
		return this.code;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#targetsEvent(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public boolean targetsEvent(Notification arg0) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#targetsTypeOf(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean targetsTypeOf(EObject arg0) {
		return getIJavaConstraint().getTargetType().isInstance(arg0);
	}

	/**
	 * Returns the IJavaConstraint.
	 * 
	 * @return the IJavaConstraint.
	 */
	public IJavaConstraint<?> getIJavaConstraint() {
		return iJavaConstraint;
	}

	/**
	 * Returns the Java Constraint.
	 * 
	 * @return the Java Constraint.
	 */
	@SuppressWarnings("unchecked")
	public JavaConstraint<?> getJavaConstraint() {
		if (javaConstraint == null) {
			javaConstraint = new JavaConstraint(this, getIJavaConstraint(),
					getIJavaConstraint().getTargetType());
		}
		return javaConstraint;
	}

}
