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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl#getImagePathOff <em>Image Path Off</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl#getActivityExplorerItemID <em>Activity Explorer Item ID</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityExtensionImpl#getExtendedSectionID <em>Extended Section ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityExtensionImpl extends PredicateElementImpl implements ActivityExtension {

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
	 * The default value of the '{@link #getActivityExplorerItemID() <em>Activity Explorer Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityExplorerItemID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityExplorerItemID() <em>Activity Explorer Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityExplorerItemID()
	 * @generated
	 * @ordered
	 */
	protected String activityExplorerItemID = ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT;




	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;




	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;




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
	protected ActivityExtensionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.ACTIVITY_EXTENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF, oldImagePathOff, imagePathOff));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getActivityExplorerItemID() {

		return activityExplorerItemID;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setActivityExplorerItemID(String newActivityExplorerItemID) {

		String oldActivityExplorerItemID = activityExplorerItemID;
		activityExplorerItemID = newActivityExplorerItemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID, oldActivityExplorerItemID, activityExplorerItemID));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getIndex() {

		return index;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIndex(int newIndex) {

		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX, oldIndex, index));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getName() {

		return name;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setName(String newName) {

		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME, oldName, name));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__EXTENDED_SECTION_ID, oldExtendedSectionID, extendedSectionID));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF:
				return getImagePathOff();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID:
				return getActivityExplorerItemID();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX:
				return getIndex();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME:
				return getName();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__EXTENDED_SECTION_ID:
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
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF:
				setImagePathOff((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID:
				setActivityExplorerItemID((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX:
				setIndex((Integer)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME:
				setName((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__EXTENDED_SECTION_ID:
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
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF:
				setImagePathOff(IMAGE_PATH_OFF_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID:
				setActivityExplorerItemID(ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__EXTENDED_SECTION_ID:
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
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF:
				return IMAGE_PATH_OFF_EDEFAULT == null ? imagePathOff != null : !IMAGE_PATH_OFF_EDEFAULT.equals(imagePathOff);
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID:
				return ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT == null ? activityExplorerItemID != null : !ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT.equals(activityExplorerItemID);
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX:
				return index != INDEX_EDEFAULT;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__EXTENDED_SECTION_ID:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Icon.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF: return ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF;
				default: return -1;
			}
		}
		if (baseClass == ActivityExplorerItem.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID: return ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID;
				case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX: return ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX;
				case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME: return ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Icon.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF: return ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__IMAGE_PATH_OFF;
				default: return -1;
			}
		}
		if (baseClass == ActivityExplorerItem.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID: return ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__ACTIVITY_EXPLORER_ITEM_ID;
				case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX: return ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__INDEX;
				case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__NAME: return ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", activityExplorerItemID: ");
		result.append(activityExplorerItemID);
		result.append(", index: ");
		result.append(index);
		result.append(", name: ");
		result.append(name);
		result.append(", extendedSectionID: ");
		result.append(extendedSectionID);
		result.append(')');
		return result.toString();
	}


} //ActivityExtensionImpl
