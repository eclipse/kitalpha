/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.ComponentSampleSafetyPatternPackage;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SAFETY_PATTERN;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyModeImpl#getInvolvedComponents <em>Involved Components</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.impl.SafetyModeImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyModeImpl extends SafetyImpl implements SafetyMode {

	/**
	 * The cached value of the '{@link #getInvolvedComponents() <em>Involved Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Safety> involvedComponents;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final SAFETY_PATTERN PATTERN_EDEFAULT = SAFETY_PATTERN.INTEGRITY;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected SAFETY_PATTERN pattern = PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyModeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleSafetyPatternPackage.Literals.SAFETY_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Safety> getInvolvedComponents() {

		if (involvedComponents == null) {
			involvedComponents = new EObjectResolvingEList<Safety>(Safety.class, this,
					ComponentSampleSafetyPatternPackage.SAFETY_MODE__INVOLVED_COMPONENTS);
		}
		return involvedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SAFETY_PATTERN getPattern() {

		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPattern(SAFETY_PATTERN newPattern) {

		SAFETY_PATTERN oldPattern = pattern;
		pattern = newPattern == null ? PATTERN_EDEFAULT : newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentSampleSafetyPatternPackage.SAFETY_MODE__PATTERN, oldPattern, pattern));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__INVOLVED_COMPONENTS:
			return getInvolvedComponents();
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__PATTERN:
			return getPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__INVOLVED_COMPONENTS:
			getInvolvedComponents().clear();
			getInvolvedComponents().addAll((Collection<? extends Safety>) newValue);
			return;
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__PATTERN:
			setPattern((SAFETY_PATTERN) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__INVOLVED_COMPONENTS:
			getInvolvedComponents().clear();
			return;
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__PATTERN:
			setPattern(PATTERN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__INVOLVED_COMPONENTS:
			return involvedComponents != null && !involvedComponents.isEmpty();
		case ComponentSampleSafetyPatternPackage.SAFETY_MODE__PATTERN:
			return pattern != PATTERN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pattern: "); //$NON-NLS-1$
		result.append(pattern);
		result.append(')');
		return result.toString();
	}

} //SafetyModeImpl