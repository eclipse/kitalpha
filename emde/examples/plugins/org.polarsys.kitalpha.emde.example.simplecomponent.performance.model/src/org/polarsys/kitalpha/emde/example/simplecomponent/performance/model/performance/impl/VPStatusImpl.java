/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.impl.ComponentElementImpl;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VP Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.impl.VPStatusImpl#isOverhead <em>Overhead</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VPStatusImpl extends ComponentElementImpl implements VPStatus {

	/**
	 * The default value of the '{@link #isOverhead() <em>Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERHEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverhead() <em>Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverhead()
	 * @generated
	 * @ordered
	 */
	protected boolean overhead = OVERHEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPStatusImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformancePackage.Literals.VP_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isOverhead() {

		return overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOverhead(boolean newOverhead) {

		boolean oldOverhead = overhead;
		overhead = newOverhead;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.VP_STATUS__OVERHEAD, oldOverhead,
					overhead));
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
		case PerformancePackage.VP_STATUS__OVERHEAD:
			return isOverhead();
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
		case PerformancePackage.VP_STATUS__OVERHEAD:
			setOverhead((Boolean) newValue);
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
		case PerformancePackage.VP_STATUS__OVERHEAD:
			setOverhead(OVERHEAD_EDEFAULT);
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
		case PerformancePackage.VP_STATUS__OVERHEAD:
			return overhead != OVERHEAD_EDEFAULT;
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
		result.append(" (overhead: "); //$NON-NLS-1$
		result.append(overhead);
		result.append(')');
		return result.toString();
	}

} //VPStatusImpl