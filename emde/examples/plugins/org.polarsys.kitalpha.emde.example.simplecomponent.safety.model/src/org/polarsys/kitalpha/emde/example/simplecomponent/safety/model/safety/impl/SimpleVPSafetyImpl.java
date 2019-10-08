/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple VP Safety</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SimpleVPSafetyImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.impl.SimpleVPSafetyImpl#getCost <em>Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleVPSafetyImpl extends ComponentElementImpl implements SimpleVPSafety {

	/**
	 * The default value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLEXITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected int complexity = COMPLEXITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleVPSafetyImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyPackage.Literals.SIMPLE_VP_SAFETY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public int getComplexity() {

		return complexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setComplexity(int newComplexity) {

		int oldComplexity = complexity;
		complexity = newComplexity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.SIMPLE_VP_SAFETY__COMPLEXITY,
					oldComplexity, complexity));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public int getCost() {

		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setCost(int newCost) {

		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyPackage.SIMPLE_VP_SAFETY__COST, oldCost, cost));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SafetyPackage.SIMPLE_VP_SAFETY__COMPLEXITY:
			return getComplexity();
		case SafetyPackage.SIMPLE_VP_SAFETY__COST:
			return getCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SafetyPackage.SIMPLE_VP_SAFETY__COMPLEXITY:
			setComplexity((Integer) newValue);
			return;
		case SafetyPackage.SIMPLE_VP_SAFETY__COST:
			setCost((Integer) newValue);
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
		case SafetyPackage.SIMPLE_VP_SAFETY__COMPLEXITY:
			setComplexity(COMPLEXITY_EDEFAULT);
			return;
		case SafetyPackage.SIMPLE_VP_SAFETY__COST:
			setCost(COST_EDEFAULT);
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
		case SafetyPackage.SIMPLE_VP_SAFETY__COMPLEXITY:
			return complexity != COMPLEXITY_EDEFAULT;
		case SafetyPackage.SIMPLE_VP_SAFETY__COST:
			return cost != COST_EDEFAULT;
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (complexity: "); //$NON-NLS-1$
		result.append(complexity);
		result.append(", cost: "); //$NON-NLS-1$
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //SimpleVPSafetyImpl