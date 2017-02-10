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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SquareCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SquareCustomizationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.impl.SquareCustomizationImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareCustomizationImpl extends SpecificNodeStyleCustomizationImpl implements SquareCustomization {

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;




	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareCustomizationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpstylecustomizationPackage.Literals.SQUARE_CUSTOMIZATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getWidth() {

		return width;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setWidth(int newWidth) {

		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__WIDTH, oldWidth, width));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getHeight() {

		return height;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHeight(int newHeight) {

		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__HEIGHT, oldHeight, height));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__WIDTH:
				return getWidth();
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__HEIGHT:
				return getHeight();
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
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__WIDTH:
				setWidth((Integer)newValue);
				return;
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__HEIGHT:
				setHeight((Integer)newValue);
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
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__WIDTH:
				return width != WIDTH_EDEFAULT;
			case VpstylecustomizationPackage.SQUARE_CUSTOMIZATION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}


} //SquareCustomizationImpl
