/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.DynamicIcon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.DynamicIconImpl#getImagePathOn <em>Image Path On</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicIconImpl extends IconImpl implements DynamicIcon {

	/**
	 * The default value of the '{@link #getImagePathOn() <em>Image Path On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOn()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePathOn() <em>Image Path On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOn()
	 * @generated
	 * @ordered
	 */
	protected String imagePathOn = IMAGE_PATH_ON_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicIconImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.DYNAMIC_ICON;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getImagePathOn() {

		return imagePathOn;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImagePathOn(String newImagePathOn) {

		String oldImagePathOn = imagePathOn;
		imagePathOn = newImagePathOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON, oldImagePathOn, imagePathOn));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON:
				return getImagePathOn();
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
			case ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON:
				setImagePathOn((String)newValue);
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
			case ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON:
				setImagePathOn(IMAGE_PATH_ON_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON:
				return IMAGE_PATH_ON_EDEFAULT == null ? imagePathOn != null : !IMAGE_PATH_ON_EDEFAULT.equals(imagePathOn);
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
		result.append(" (imagePathOn: ");
		result.append(imagePathOn);
		result.append(')');
		return result.toString();
	}


} //DynamicIconImpl
