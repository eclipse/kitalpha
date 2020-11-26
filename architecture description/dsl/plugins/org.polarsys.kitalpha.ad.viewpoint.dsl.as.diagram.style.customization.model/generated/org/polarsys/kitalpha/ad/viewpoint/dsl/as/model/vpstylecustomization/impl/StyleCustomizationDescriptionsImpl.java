/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.CustomizationExpression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Customization Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationDescriptionsImpl#getOwnedCustomizations <em>Owned Customizations</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.StyleCustomizationDescriptionsImpl#getPrecondtionExpression <em>Precondtion Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleCustomizationDescriptionsImpl extends NamedElementImpl implements StyleCustomizationDescriptions {

	/**
	 * The cached value of the '{@link #getOwnedCustomizations() <em>Owned Customizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCustomizations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCustomization> ownedCustomizations;




	/**
	 * The cached value of the '{@link #getPrecondtionExpression() <em>Precondtion Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondtionExpression()
	 * @generated
	 * @ordered
	 */
	protected CustomizationExpression precondtionExpression;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleCustomizationDescriptionsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractCustomization> getOwnedCustomizations() {

		if (ownedCustomizations == null) {
			ownedCustomizations = new EObjectContainmentEList<AbstractCustomization>(AbstractCustomization.class, this, VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS);
		}
		return ownedCustomizations;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CustomizationExpression getPrecondtionExpression() {

		return precondtionExpression;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetPrecondtionExpression(CustomizationExpression newPrecondtionExpression, NotificationChain msgs) {

		CustomizationExpression oldPrecondtionExpression = precondtionExpression;
		precondtionExpression = newPrecondtionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION, oldPrecondtionExpression, newPrecondtionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPrecondtionExpression(CustomizationExpression newPrecondtionExpression) {

		if (newPrecondtionExpression != precondtionExpression) {
			NotificationChain msgs = null;
			if (precondtionExpression != null)
				msgs = ((InternalEObject)precondtionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION, null, msgs);
			if (newPrecondtionExpression != null)
				msgs = ((InternalEObject)newPrecondtionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION, null, msgs);
			msgs = basicSetPrecondtionExpression(newPrecondtionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION, newPrecondtionExpression, newPrecondtionExpression));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS:
				return ((InternalEList<?>)getOwnedCustomizations()).basicRemove(otherEnd, msgs);
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION:
				return basicSetPrecondtionExpression(null, msgs);
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS:
				return getOwnedCustomizations();
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION:
				return getPrecondtionExpression();
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS:
				getOwnedCustomizations().clear();
				getOwnedCustomizations().addAll((Collection<? extends AbstractCustomization>)newValue);
				return;
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION:
				setPrecondtionExpression((CustomizationExpression)newValue);
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS:
				getOwnedCustomizations().clear();
				return;
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION:
				setPrecondtionExpression((CustomizationExpression)null);
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
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS:
				return ownedCustomizations != null && !ownedCustomizations.isEmpty();
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION:
				return precondtionExpression != null;
		}
		return super.eIsSet(featureID);
	}



} //StyleCustomizationDescriptionsImpl
