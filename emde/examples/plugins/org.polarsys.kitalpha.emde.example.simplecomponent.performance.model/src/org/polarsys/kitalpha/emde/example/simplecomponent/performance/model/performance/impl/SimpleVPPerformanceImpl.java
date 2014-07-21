/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple VP Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.SimpleVPPerformanceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleVPPerformanceImpl extends ComponentElementImpl implements SimpleVPPerformance {

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected VPStatus status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleVPPerformanceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformancePackage.Literals.SIMPLE_VP_PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getComplexity() {

		return complexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setComplexity(int newComplexity) {

		int oldComplexity = complexity;
		complexity = newComplexity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.SIMPLE_VP_PERFORMANCE__COMPLEXITY, oldComplexity, complexity));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getCost() {

		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCost(int newCost) {

		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.SIMPLE_VP_PERFORMANCE__COST, oldCost, cost));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public VPStatus getStatus() {

		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetStatus(VPStatus newStatus, NotificationChain msgs) {

		VPStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS, oldStatus, newStatus);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStatus(VPStatus newStatus) {

		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject) status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject) newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS, newStatus, newStatus));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS:
			return basicSetStatus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COMPLEXITY:
			return getComplexity();
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COST:
			return getCost();
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS:
			return getStatus();
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
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COMPLEXITY:
			// begin-extension-code
			if (newValue == null || newValue instanceof Integer) {
				// end-extension-code
				setComplexity((Integer) newValue);
				// begin-extension-code
			}
			// end-extension-code
			return;
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COST:
			// begin-extension-code
			if (newValue == null || newValue instanceof Integer) {
				// end-extension-code
				setCost((Integer) newValue);
				// begin-extension-code
			}
			// end-extension-code
			return;
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS:
			// begin-extension-code
			if (newValue == null || newValue instanceof VPStatus) {
				// end-extension-code
				setStatus((VPStatus) newValue);
				// begin-extension-code
			}
			// end-extension-code
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
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COMPLEXITY:
			setComplexity(COMPLEXITY_EDEFAULT);
			return;
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COST:
			setCost(COST_EDEFAULT);
			return;
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS:
			setStatus((VPStatus) null);
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
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COMPLEXITY:
			return complexity != COMPLEXITY_EDEFAULT;
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__COST:
			return cost != COST_EDEFAULT;
		case PerformancePackage.SIMPLE_VP_PERFORMANCE__STATUS:
			return status != null;
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
		result.append(" (complexity: "); //$NON-NLS-1$
		result.append(complexity);
		result.append(", cost: "); //$NON-NLS-1$
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //SimpleVPPerformanceImpl