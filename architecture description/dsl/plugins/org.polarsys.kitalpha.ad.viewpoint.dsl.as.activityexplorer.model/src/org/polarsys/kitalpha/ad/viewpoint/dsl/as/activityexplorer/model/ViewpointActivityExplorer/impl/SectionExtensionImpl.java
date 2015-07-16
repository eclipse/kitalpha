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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.SectionExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl#getExtendedPageID <em>Extended Page ID</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.SectionExtensionImpl#isFiltering <em>Filtering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionExtensionImpl extends ActivityExplorerItemImpl implements SectionExtension {

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
	 * The default value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected boolean expanded = EXPANDED_EDEFAULT;




	/**
	 * The default value of the '{@link #isFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiltering() <em>Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltering()
	 * @generated
	 * @ordered
	 */
	protected boolean filtering = FILTERING_EDEFAULT;



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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_PAGE_ID, oldExtendedPageID, extendedPageID));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isExpanded() {

		return expanded;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExpanded(boolean newExpanded) {

		boolean oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXPANDED, oldExpanded, expanded));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isFiltering() {

		return filtering;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFiltering(boolean newFiltering) {

		boolean oldFiltering = filtering;
		filtering = newFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.SECTION_EXTENSION__FILTERING, oldFiltering, filtering));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_PAGE_ID:
				return getExtendedPageID();
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXPANDED:
				return isExpanded();
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__FILTERING:
				return isFiltering();
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
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_PAGE_ID:
				setExtendedPageID((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXPANDED:
				setExpanded((Boolean)newValue);
				return;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__FILTERING:
				setFiltering((Boolean)newValue);
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
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_PAGE_ID:
				setExtendedPageID(EXTENDED_PAGE_ID_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__FILTERING:
				setFiltering(FILTERING_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXTENDED_PAGE_ID:
				return EXTENDED_PAGE_ID_EDEFAULT == null ? extendedPageID != null : !EXTENDED_PAGE_ID_EDEFAULT.equals(extendedPageID);
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__EXPANDED:
				return expanded != EXPANDED_EDEFAULT;
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION__FILTERING:
				return filtering != FILTERING_EDEFAULT;
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
		result.append(", expanded: ");
		result.append(expanded);
		result.append(", filtering: ");
		result.append(filtering);
		result.append(')');
		return result.toString();
	}


} //SectionExtensionImpl
