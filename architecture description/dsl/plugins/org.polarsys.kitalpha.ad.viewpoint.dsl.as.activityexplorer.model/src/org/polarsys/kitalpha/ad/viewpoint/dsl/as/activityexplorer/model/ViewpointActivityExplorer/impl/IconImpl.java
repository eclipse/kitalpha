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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.IconImpl#getImagePathOff <em>Image Path Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IconImpl extends EObjectImpl implements Icon {

	/**
	 * The default value of the '{@link #getImagePathOff() <em>Image Path Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOff()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePathOff() <em>Image Path Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOff()
	 * @generated
	 * @ordered
	 */
	protected String imagePathOff = IMAGE_PATH_OFF_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.ICON;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getImagePathOff() {

		return imagePathOff;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImagePathOff(String newImagePathOff) {

		String oldImagePathOff = imagePathOff;
		imagePathOff = newImagePathOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF, oldImagePathOff, imagePathOff));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF:
				return getImagePathOff();
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
			case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF:
				setImagePathOff((String)newValue);
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
			case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF:
				setImagePathOff(IMAGE_PATH_OFF_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF:
				return IMAGE_PATH_OFF_EDEFAULT == null ? imagePathOff != null : !IMAGE_PATH_OFF_EDEFAULT.equals(imagePathOff);
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
		result.append(" (imagePathOff: ");
		result.append(imagePathOff);
		result.append(')');
		return result.toString();
	}


} //IconImpl
