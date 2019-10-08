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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.diagram.BackgroundStyle;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flat Container Style Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.FlatContainerStyleCustomizationImpl#getBackgroundStyle <em>Background Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlatContainerStyleCustomizationImpl extends SpecificContainerStyleCustomizationImpl implements FlatContainerStyleCustomization {

	/**
	 * The default value of the '{@link #getBackgroundStyle() <em>Background Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundStyle()
	 * @generated NOT
	 * @ordered
	 */
	protected static final BackgroundStyle BACKGROUND_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundStyle() <em>Background Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundStyle()
	 * @generated
	 * @ordered
	 */
	protected BackgroundStyle backgroundStyle = BACKGROUND_STYLE_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatContainerStyleCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.FLAT_CONTAINER_STYLE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BackgroundStyle getBackgroundStyle() {

		return backgroundStyle;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBackgroundStyle(BackgroundStyle newBackgroundStyle) {

		BackgroundStyle oldBackgroundStyle = backgroundStyle;
		backgroundStyle = newBackgroundStyle == null ? BACKGROUND_STYLE_EDEFAULT : newBackgroundStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE, oldBackgroundStyle, backgroundStyle));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE:
				return getBackgroundStyle();
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
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE:
				setBackgroundStyle((BackgroundStyle)newValue);
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
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE:
				setBackgroundStyle(BACKGROUND_STYLE_EDEFAULT);
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
			case VpstylecustomizationPackage.FLAT_CONTAINER_STYLE_CUSTOMIZATION__BACKGROUND_STYLE:
				return backgroundStyle != BACKGROUND_STYLE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (backgroundStyle: ");
		result.append(backgroundStyle);
		result.append(')');
		return result.toString();
	}


} //FlatContainerStyleCustomizationImpl
