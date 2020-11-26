/**
 * ******************************************************************************
 *  Copyright (c) 2016-2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *   
 *  Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 * *******************************************************************************
 * 
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.metadata.metadata.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osgi.framework.Version;

import org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl#getVpId <em>Vp Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl#isInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointReferenceImpl extends MetadataElementImpl implements ViewpointReference {

	/**
	 * The default value of the '{@link #getVpId() <em>Vp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpId()
	 * @generated
	 * @ordered
	 */
	protected static final String VP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpId() <em>Vp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpId()
	 * @generated
	 * @ordered
	 */
	protected String vpId = VP_ID_EDEFAULT;




	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;




	/**
	 * The default value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInactive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInactive()
	 * @generated
	 * @ordered
	 */
	protected boolean inactive = INACTIVE_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointReferenceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.VIEWPOINT_REFERENCE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getVpId() {

		return vpId;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVpId(String newVpId) {

		String oldVpId = vpId;
		vpId = newVpId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.VIEWPOINT_REFERENCE__VP_ID, oldVpId, vpId));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Version getVersion() {

		return version;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setVersion(Version newVersion) {

		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.VIEWPOINT_REFERENCE__VERSION, oldVersion, version));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isInactive() {

		return inactive;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setInactive(boolean newInactive) {

		boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.VIEWPOINT_REFERENCE__INACTIVE, oldInactive, inactive));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.VIEWPOINT_REFERENCE__VP_ID:
				return getVpId();
			case MetadataPackage.VIEWPOINT_REFERENCE__VERSION:
				return getVersion();
			case MetadataPackage.VIEWPOINT_REFERENCE__INACTIVE:
				return isInactive();
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
			case MetadataPackage.VIEWPOINT_REFERENCE__VP_ID:
				setVpId((String)newValue);
				return;
			case MetadataPackage.VIEWPOINT_REFERENCE__VERSION:
				setVersion((Version)newValue);
				return;
			case MetadataPackage.VIEWPOINT_REFERENCE__INACTIVE:
				setInactive((Boolean)newValue);
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
			case MetadataPackage.VIEWPOINT_REFERENCE__VP_ID:
				setVpId(VP_ID_EDEFAULT);
				return;
			case MetadataPackage.VIEWPOINT_REFERENCE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MetadataPackage.VIEWPOINT_REFERENCE__INACTIVE:
				setInactive(INACTIVE_EDEFAULT);
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
			case MetadataPackage.VIEWPOINT_REFERENCE__VP_ID:
				return VP_ID_EDEFAULT == null ? vpId != null : !VP_ID_EDEFAULT.equals(vpId);
			case MetadataPackage.VIEWPOINT_REFERENCE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MetadataPackage.VIEWPOINT_REFERENCE__INACTIVE:
				return inactive != INACTIVE_EDEFAULT;
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
		result.append(" (vpId: ");
		result.append(vpId);
		result.append(", version: ");
		result.append(version);
		result.append(", inactive: ");
		result.append(inactive);
		result.append(')');
		return result.toString();
	}


} //ViewpointReferenceImpl
