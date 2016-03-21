/**
 * ******************************************************************************
 *  Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataPackage;
import org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl#getVpId <em>Vp Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl#isFiltered <em>Filtered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointUsageImpl extends MinimalEObjectImpl.Container implements ViewpointUsage {

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
	 * The default value of the '{@link #isFiltered() <em>Filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiltered() <em>Filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltered()
	 * @generated
	 * @ordered
	 */
	protected boolean filtered = FILTERED_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointUsageImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.VIEWPOINT_USAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.VIEWPOINT_USAGE__VP_ID, oldVpId, vpId));

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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.VIEWPOINT_USAGE__VERSION, oldVersion, version));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isFiltered() {

		return filtered;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFiltered(boolean newFiltered) {

		boolean oldFiltered = filtered;
		filtered = newFiltered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.VIEWPOINT_USAGE__FILTERED, oldFiltered, filtered));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetadataPackage.VIEWPOINT_USAGE__VP_ID:
				return getVpId();
			case MetadataPackage.VIEWPOINT_USAGE__VERSION:
				return getVersion();
			case MetadataPackage.VIEWPOINT_USAGE__FILTERED:
				return isFiltered();
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
			case MetadataPackage.VIEWPOINT_USAGE__VP_ID:
				setVpId((String)newValue);
				return;
			case MetadataPackage.VIEWPOINT_USAGE__VERSION:
				setVersion((Version)newValue);
				return;
			case MetadataPackage.VIEWPOINT_USAGE__FILTERED:
				setFiltered((Boolean)newValue);
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
			case MetadataPackage.VIEWPOINT_USAGE__VP_ID:
				setVpId(VP_ID_EDEFAULT);
				return;
			case MetadataPackage.VIEWPOINT_USAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MetadataPackage.VIEWPOINT_USAGE__FILTERED:
				setFiltered(FILTERED_EDEFAULT);
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
			case MetadataPackage.VIEWPOINT_USAGE__VP_ID:
				return VP_ID_EDEFAULT == null ? vpId != null : !VP_ID_EDEFAULT.equals(vpId);
			case MetadataPackage.VIEWPOINT_USAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MetadataPackage.VIEWPOINT_USAGE__FILTERED:
				return filtered != FILTERED_EDEFAULT;
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
		result.append(", filtered: ");
		result.append(filtered);
		result.append(')');
		return result.toString();
	}


} //ViewpointUsageImpl
