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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipse Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EllipseCustomizationImpl#getHorizontalDiameterComputationExpression <em>Horizontal Diameter Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.EllipseCustomizationImpl#getVerticalDiameterComputationExpression <em>Vertical Diameter Computation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipseCustomizationImpl extends SpecificNodeStyleCustomizationImpl implements EllipseCustomization {

	/**
	 * The cached value of the '{@link #getHorizontalDiameterComputationExpression() <em>Horizontal Diameter Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDiameterComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression horizontalDiameterComputationExpression;




	/**
	 * The cached value of the '{@link #getVerticalDiameterComputationExpression() <em>Vertical Diameter Computation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDiameterComputationExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression verticalDiameterComputationExpression;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.ELLIPSE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getHorizontalDiameterComputationExpression() {

		return horizontalDiameterComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetHorizontalDiameterComputationExpression(CustomizationExpression newHorizontalDiameterComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldHorizontalDiameterComputationExpression = horizontalDiameterComputationExpression;
		horizontalDiameterComputationExpression = newHorizontalDiameterComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION, oldHorizontalDiameterComputationExpression, newHorizontalDiameterComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHorizontalDiameterComputationExpression(CustomizationExpression newHorizontalDiameterComputationExpression) {

		if (newHorizontalDiameterComputationExpression != horizontalDiameterComputationExpression) {
			NotificationChain msgs = null;
			if (horizontalDiameterComputationExpression != null)
				msgs = ((InternalEObject)horizontalDiameterComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION, null, msgs);
			if (newHorizontalDiameterComputationExpression != null)
				msgs = ((InternalEObject)newHorizontalDiameterComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetHorizontalDiameterComputationExpression(newHorizontalDiameterComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION, newHorizontalDiameterComputationExpression, newHorizontalDiameterComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getVerticalDiameterComputationExpression() {

		return verticalDiameterComputationExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetVerticalDiameterComputationExpression(CustomizationExpression newVerticalDiameterComputationExpression, NotificationChain msgs) {

		CustomizationExpression oldVerticalDiameterComputationExpression = verticalDiameterComputationExpression;
		verticalDiameterComputationExpression = newVerticalDiameterComputationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION, oldVerticalDiameterComputationExpression, newVerticalDiameterComputationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVerticalDiameterComputationExpression(CustomizationExpression newVerticalDiameterComputationExpression) {

		if (newVerticalDiameterComputationExpression != verticalDiameterComputationExpression) {
			NotificationChain msgs = null;
			if (verticalDiameterComputationExpression != null)
				msgs = ((InternalEObject)verticalDiameterComputationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION, null, msgs);
			if (newVerticalDiameterComputationExpression != null)
				msgs = ((InternalEObject)newVerticalDiameterComputationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION, null, msgs);
			msgs = basicSetVerticalDiameterComputationExpression(newVerticalDiameterComputationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION, newVerticalDiameterComputationExpression, newVerticalDiameterComputationExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION:
				return basicSetHorizontalDiameterComputationExpression(null, msgs);
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION:
				return basicSetVerticalDiameterComputationExpression(null, msgs);
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
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION:
				return getHorizontalDiameterComputationExpression();
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION:
				return getVerticalDiameterComputationExpression();
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
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION:
				setHorizontalDiameterComputationExpression((CustomizationExpression)newValue);
				return;
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION:
				setVerticalDiameterComputationExpression((CustomizationExpression)newValue);
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
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION:
				setHorizontalDiameterComputationExpression((CustomizationExpression)null);
				return;
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION:
				setVerticalDiameterComputationExpression((CustomizationExpression)null);
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
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__HORIZONTAL_DIAMETER_COMPUTATION_EXPRESSION:
				return horizontalDiameterComputationExpression != null;
			case VpstylecustomizationPackage.ELLIPSE_CUSTOMIZATION__VERTICAL_DIAMETER_COMPUTATION_EXPRESSION:
				return verticalDiameterComputationExpression != null;
		}
		return super.eIsSet(featureID);
	}



} //EllipseCustomizationImpl
