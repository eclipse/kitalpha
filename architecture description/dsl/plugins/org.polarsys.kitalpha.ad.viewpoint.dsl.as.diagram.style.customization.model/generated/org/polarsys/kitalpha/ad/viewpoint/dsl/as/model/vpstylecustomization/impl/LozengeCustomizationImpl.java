/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lozenge Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LozengeCustomizationImpl#getWidthComputationExpression <em>Width Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.LozengeCustomizationImpl#getHeightComputationExpression <em>Height Computation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LozengeCustomizationImpl extends SpecificNodeStyleCustomizationImpl implements LozengeCustomization {

	/**
	 * The cached value of the '{@link #getWidthComputationExpression() <em>Width Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression widthComputationExpression;




	/**
	 * The cached value of the '{@link #getHeightComputationExpression() <em>Height Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression heightComputationExpression;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LozengeCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.LOZENGE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getWidthComputationExpression() {

		return widthComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetWidthComputationExpression(CustomizationExpression newWidthComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldWidthComputationExpression = widthComputationExpression;
		widthComputationExpression = newWidthComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION, oldWidthComputationExpression, newWidthComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setWidthComputationExpression(CustomizationExpression newWidthComputationExpression) {

		if (newWidthComputationExpression != widthComputationExpression) {
			NotificationChain msgs = null;
			if (widthComputationExpression != null)
				msgs = ((InternalEObject)widthComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION, null, msgs);
			if (newWidthComputationExpression != null)
				msgs = ((InternalEObject)newWidthComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetWidthComputationExpression(newWidthComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION, newWidthComputationExpression, newWidthComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getHeightComputationExpression() {

		return heightComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetHeightComputationExpression(CustomizationExpression newHeightComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldHeightComputationExpression = heightComputationExpression;
		heightComputationExpression = newHeightComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION, oldHeightComputationExpression, newHeightComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHeightComputationExpression(CustomizationExpression newHeightComputationExpression) {

		if (newHeightComputationExpression != heightComputationExpression) {
			NotificationChain msgs = null;
			if (heightComputationExpression != null)
				msgs = ((InternalEObject)heightComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION, null, msgs);
			if (newHeightComputationExpression != null)
				msgs = ((InternalEObject)newHeightComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetHeightComputationExpression(newHeightComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION, newHeightComputationExpression, newHeightComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION:
				return basicSetWidthComputationExpression(null, msgs);
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION:
				return basicSetHeightComputationExpression(null, msgs);
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
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION:
				return getWidthComputationExpression();
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION:
				return getHeightComputationExpression();
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
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION:
				setWidthComputationExpression((CustomizationExpression)newValue);
				return;
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION:
				setHeightComputationExpression((CustomizationExpression)newValue);
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
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION:
				setWidthComputationExpression((CustomizationExpression)null);
				return;
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION:
				setHeightComputationExpression((CustomizationExpression)null);
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
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__WIDTH_COMPUTATION_EXPRESSION:
				return widthComputationExpression != null;
			case VpstylecustomizationPackage.LOZENGE_CUSTOMIZATION__HEIGHT_COMPUTATION_EXPRESSION:
				return heightComputationExpression != null;
		}
		return super.eIsSet(featureID);
	}



} //LozengeCustomizationImpl
