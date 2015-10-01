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
package org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.impl.ComponentElementImpl;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.CRITICALITY;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.ComponentSampleSafetyPackage;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.DAL_LEVEL;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.STATE;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl#getDal <em>Dal</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.impl.SafetyImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SafetyImpl extends ComponentElementImpl implements Safety {

	/**
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final CRITICALITY CRITICALITY_EDEFAULT = CRITICALITY.CATASTROPHIC;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected CRITICALITY criticality = CRITICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDal() <em>Dal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDal()
	 * @generated
	 * @ordered
	 */
	protected static final DAL_LEVEL DAL_EDEFAULT = DAL_LEVEL.DAL_A;

	/**
	 * The cached value of the '{@link #getDal() <em>Dal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDal()
	 * @generated
	 * @ordered
	 */
	protected DAL_LEVEL dal = DAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final STATE STATE_EDEFAULT = STATE.OPERATIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected STATE state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSampleSafetyPackage.Literals.SAFETY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CRITICALITY getCriticality() {

		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCriticality(CRITICALITY newCriticality) {

		CRITICALITY oldCriticality = criticality;
		criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleSafetyPackage.SAFETY__CRITICALITY, oldCriticality, criticality));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DAL_LEVEL getDal() {

		return dal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDal(DAL_LEVEL newDal) {

		DAL_LEVEL oldDal = dal;
		dal = newDal == null ? DAL_EDEFAULT : newDal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleSafetyPackage.SAFETY__DAL, oldDal, dal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public STATE getState() {

		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setState(STATE newState) {

		STATE oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSampleSafetyPackage.SAFETY__STATE, oldState, state));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentSampleSafetyPackage.SAFETY__CRITICALITY:
			return getCriticality();
		case ComponentSampleSafetyPackage.SAFETY__DAL:
			return getDal();
		case ComponentSampleSafetyPackage.SAFETY__STATE:
			return getState();
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
		case ComponentSampleSafetyPackage.SAFETY__CRITICALITY:
			setCriticality((CRITICALITY) newValue);
			return;
		case ComponentSampleSafetyPackage.SAFETY__DAL:
			setDal((DAL_LEVEL) newValue);
			return;
		case ComponentSampleSafetyPackage.SAFETY__STATE:
			setState((STATE) newValue);
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
		case ComponentSampleSafetyPackage.SAFETY__CRITICALITY:
			setCriticality(CRITICALITY_EDEFAULT);
			return;
		case ComponentSampleSafetyPackage.SAFETY__DAL:
			setDal(DAL_EDEFAULT);
			return;
		case ComponentSampleSafetyPackage.SAFETY__STATE:
			setState(STATE_EDEFAULT);
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
		case ComponentSampleSafetyPackage.SAFETY__CRITICALITY:
			return criticality != CRITICALITY_EDEFAULT;
		case ComponentSampleSafetyPackage.SAFETY__DAL:
			return dal != DAL_EDEFAULT;
		case ComponentSampleSafetyPackage.SAFETY__STATE:
			return state != STATE_EDEFAULT;
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
		result.append(" (criticality: "); //$NON-NLS-1$
		result.append(criticality);
		result.append(", dal: "); //$NON-NLS-1$
		result.append(dal);
		result.append(", state: "); //$NON-NLS-1$
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //SafetyImpl