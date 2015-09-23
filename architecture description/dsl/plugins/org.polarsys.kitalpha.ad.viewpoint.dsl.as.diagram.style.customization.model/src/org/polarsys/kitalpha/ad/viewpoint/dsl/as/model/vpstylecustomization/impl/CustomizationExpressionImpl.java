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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.AbstractComputableElement;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customization Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.CustomizationExpressionImpl#getOwnedExpressionElement <em>Owned Expression Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomizationExpressionImpl extends MinimalEObjectImpl.Container implements CustomizationExpression {

	/**
	 * The cached value of the '{@link #getOwnedExpressionElement() <em>Owned Expression Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExpressionElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractComputableElement ownedExpressionElement;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomizationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.CUSTOMIZATION_EXPRESSION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractComputableElement getOwnedExpressionElement() {

		return ownedExpressionElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedExpressionElement(AbstractComputableElement newOwnedExpressionElement, NotificationChain msgs) {

		AbstractComputableElement oldOwnedExpressionElement = ownedExpressionElement;
		ownedExpressionElement = newOwnedExpressionElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT, oldOwnedExpressionElement, newOwnedExpressionElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedExpressionElement(AbstractComputableElement newOwnedExpressionElement) {

		if (newOwnedExpressionElement != ownedExpressionElement) {
			NotificationChain msgs = null;
			if (ownedExpressionElement != null)
				msgs = ((InternalEObject)ownedExpressionElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT, null, msgs);
			if (newOwnedExpressionElement != null)
				msgs = ((InternalEObject)newOwnedExpressionElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT, null, msgs);
			msgs = basicSetOwnedExpressionElement(newOwnedExpressionElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT, newOwnedExpressionElement, newOwnedExpressionElement));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT:
				return basicSetOwnedExpressionElement(null, msgs);
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
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT:
				return getOwnedExpressionElement();
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
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT:
				setOwnedExpressionElement((AbstractComputableElement)newValue);
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
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT:
				setOwnedExpressionElement((AbstractComputableElement)null);
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
			case VpstylecustomizationPackage.CUSTOMIZATION_EXPRESSION__OWNED_EXPRESSION_ELEMENT:
				return ownedExpressionElement != null;
		}
		return super.eIsSet(featureID);
	}



} //CustomizationExpressionImpl
