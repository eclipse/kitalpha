/**
 * Copyright (c) 2009, 2018 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */

package org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.internal.EMFModelValidationDebugOptions;
import org.eclipse.emf.validation.internal.util.TextUtils;
import org.eclipse.emf.validation.internal.util.Trace;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IConstraintDescriptor;

/**
 * @author Thomas Guiu
 * 
 */
public class ValidationContext implements IValidationContext {

	private EObject target;
	private IModelConstraint currentConstraint = null;

	private final Set<EObject> resultLocus = new java.util.HashSet<EObject>();

	private final Map<IModelConstraint, Object> constraintData = new java.util.HashMap<IModelConstraint, Object>();

	@Override
	public void addResult(EObject eObject) {
		assert eObject != null;

		resultLocus.add(eObject);
	}

	@Override
	public void addResults(Collection<? extends EObject> eObjects) {
		assert eObjects != null;
		// explicitly iterate instead of calling resultLocus.addAll() in order
		// to assert the types of the elements by casting
		for (EObject next : eObjects) {
			addResult(next);
		}
	}

	@Override
	public IStatus createFailureStatus(Object... messageArgs) {
		String message = TextUtils.formatMessage(getDescriptor().getMessagePattern(), (messageArgs == null) ? new Object[0] : messageArgs);

		if (Trace.shouldTrace(EMFModelValidationDebugOptions.CONSTRAINTS_EVALUATION)) {
			Trace.trace(EMFModelValidationDebugOptions.CONSTRAINTS_EVALUATION, "Constraint " + getCurrentConstraintId() + " failed: " + message); //$NON-NLS-1$//$NON-NLS-2$
		}

		return new ConstraintStatus(getConstraint(), getTarget(), message, getResultLocus());
	}

	@Override
	public IStatus createSuccessStatus() {
		if (Trace.shouldTrace(EMFModelValidationDebugOptions.CONSTRAINTS_EVALUATION)) {
			Trace.trace(EMFModelValidationDebugOptions.CONSTRAINTS_EVALUATION, "Constraint " + getCurrentConstraintId() + " passed."); //$NON-NLS-1$//$NON-NLS-2$
		}

		return Status.OK_STATUS;
	}

	@Override
	public void disableCurrentConstraint(Throwable exception) {
		getDescriptor().setError(exception);

	}

	@Override
	public List<Notification> getAllEvents() {
		return Collections.emptyList();
	}

	@Override
	public Object getCurrentConstraintData() {
		return constraintData.get(getConstraint());
	}

	@Override
	public String getCurrentConstraintId() {
		return getConstraint().getDescriptor().getId();
	}

	@Override
	public EMFEventType getEventType() {
		return EMFEventType.NULL;
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

	@Override
	public Object getFeatureNewValue() {
		return null;
	}

	@Override
	public Set<EObject> getResultLocus() {
		return java.util.Collections.unmodifiableSet(resultLocus);
	}

	@Override
	public EObject getTarget() {
		return target;
	}

	@Override
	public Object putCurrentConstraintData(Object newData) {
		return constraintData.put(getConstraint(), newData);
	}

	@Override
	public void skipCurrentConstraintFor(EObject eObject) {
		//nothing to do
	}

	@Override
	public void skipCurrentConstraintForAll(Collection<?> eObjects) {
		//nothing to do
	}

	public void setTarget(EObject target) {
		this.target = target;
		resultLocus.clear();
	}

	public void setConstraint(IModelConstraint constraint) {
		currentConstraint = constraint;
	}

	public IModelConstraint getConstraint() {
		return currentConstraint;
	}

	public IConstraintDescriptor getDescriptor() {
		return getConstraint().getDescriptor();
	}

}
