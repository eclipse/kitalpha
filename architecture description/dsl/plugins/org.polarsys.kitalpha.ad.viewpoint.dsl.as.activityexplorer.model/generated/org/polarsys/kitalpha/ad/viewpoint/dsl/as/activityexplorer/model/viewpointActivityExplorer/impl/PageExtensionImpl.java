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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.PageExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageExtensionImpl#getExtendedPageID <em>Extended Page ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageExtensionImpl extends AbstractPageImpl implements PageExtension {

	/**
	 * The default value of the '{@link #getExtendedPageID() <em>Extended Page ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedPageID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_PAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedPageID() <em>Extended Page ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedPageID()
	 * @generated
	 * @ordered
	 */
	protected String extendedPageID = EXTENDED_PAGE_ID_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageExtensionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.PAGE_EXTENSION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getExtendedPageID() {

		return extendedPageID;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtendedPageID(String newExtendedPageID) {

		String oldExtendedPageID = extendedPageID;
		extendedPageID = newExtendedPageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE_EXTENSION__EXTENDED_PAGE_ID, oldExtendedPageID, extendedPageID));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.PAGE_EXTENSION__EXTENDED_PAGE_ID:
				return getExtendedPageID();
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
			case ViewpointActivityExplorerPackage.PAGE_EXTENSION__EXTENDED_PAGE_ID:
				setExtendedPageID((String)newValue);
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
			case ViewpointActivityExplorerPackage.PAGE_EXTENSION__EXTENDED_PAGE_ID:
				setExtendedPageID(EXTENDED_PAGE_ID_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.PAGE_EXTENSION__EXTENDED_PAGE_ID:
				return EXTENDED_PAGE_ID_EDEFAULT == null ? extendedPageID != null : !EXTENDED_PAGE_ID_EDEFAULT.equals(extendedPageID);
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
		result.append(" (extendedPageID: ");
		result.append(extendedPageID);
		result.append(')');
		return result.toString();
	}


} //PageExtensionImpl
