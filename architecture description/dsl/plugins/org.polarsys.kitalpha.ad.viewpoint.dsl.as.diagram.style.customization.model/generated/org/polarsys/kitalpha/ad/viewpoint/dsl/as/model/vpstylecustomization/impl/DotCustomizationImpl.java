/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dot Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.DotCustomizationImpl#getStrokeSizeComputationExpression <em>Stroke Size Computation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DotCustomizationImpl extends SpecificNodeStyleCustomizationImpl implements DotCustomization {

	/**
	 * The cached value of the '{@link #getStrokeSizeComputationExpression() <em>Stroke Size Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeSizeComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression strokeSizeComputationExpression;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DotCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.DOT_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getStrokeSizeComputationExpression() {

		return strokeSizeComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetStrokeSizeComputationExpression(CustomizationExpression newStrokeSizeComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldStrokeSizeComputationExpression = strokeSizeComputationExpression;
		strokeSizeComputationExpression = newStrokeSizeComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION, oldStrokeSizeComputationExpression, newStrokeSizeComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setStrokeSizeComputationExpression(CustomizationExpression newStrokeSizeComputationExpression) {

		if (newStrokeSizeComputationExpression != strokeSizeComputationExpression) {
			NotificationChain msgs = null;
			if (strokeSizeComputationExpression != null)
				msgs = ((InternalEObject)strokeSizeComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION, null, msgs);
			if (newStrokeSizeComputationExpression != null)
				msgs = ((InternalEObject)newStrokeSizeComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetStrokeSizeComputationExpression(newStrokeSizeComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION, newStrokeSizeComputationExpression, newStrokeSizeComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION:
				return basicSetStrokeSizeComputationExpression(null, msgs);
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
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION:
				return getStrokeSizeComputationExpression();
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
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION:
				setStrokeSizeComputationExpression((CustomizationExpression)newValue);
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
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION:
				setStrokeSizeComputationExpression((CustomizationExpression)null);
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
			case VpstylecustomizationPackage.DOT_CUSTOMIZATION__STROKE_SIZE_COMPUTATION_EXPRESSION:
				return strokeSizeComputationExpression != null;
		}
		return super.eIsSet(featureID);
	}



} //DotCustomizationImpl
