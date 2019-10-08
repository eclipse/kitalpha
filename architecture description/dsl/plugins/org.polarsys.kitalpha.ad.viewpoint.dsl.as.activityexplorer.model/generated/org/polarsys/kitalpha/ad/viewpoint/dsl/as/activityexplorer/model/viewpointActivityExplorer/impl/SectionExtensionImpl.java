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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.SectionExtensionImpl#getExtendedSectionID <em>Extended Section ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionExtensionImpl extends AbstractSectionImpl implements SectionExtension {

	/**
	 * The default value of the '{@link #getExtendedSectionID() <em>Extended Section ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSectionID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_SECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedSectionID() <em>Extended Section ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSectionID()
	 * @generated
	 * @ordered
	 */
	protected String extendedSectionID = EXTENDED_SECTION_ID_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionExtensionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.SECTION_EXTENSION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getExtendedSectionID() {

		return extendedSectionID;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtendedSectionID(String newExtendedSectionID) {

		String oldExtendedSectionID = extendedSectionID;
		extendedSectionID = newExtendedSectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_SECTION_ID, oldExtendedSectionID, extendedSectionID));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_SECTION_ID:
				return getExtendedSectionID();
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
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_SECTION_ID:
				setExtendedSectionID((String)newValue);
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
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_SECTION_ID:
				setExtendedSectionID(EXTENDED_SECTION_ID_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_SECTION_ID:
				return EXTENDED_SECTION_ID_EDEFAULT == null ? extendedSectionID != null : !EXTENDED_SECTION_ID_EDEFAULT.equals(extendedSectionID);
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
		result.append(" (extendedSectionID: ");
		result.append(extendedSectionID);
		result.append(')');
		return result.toString();
	}


} //SectionExtensionImpl
