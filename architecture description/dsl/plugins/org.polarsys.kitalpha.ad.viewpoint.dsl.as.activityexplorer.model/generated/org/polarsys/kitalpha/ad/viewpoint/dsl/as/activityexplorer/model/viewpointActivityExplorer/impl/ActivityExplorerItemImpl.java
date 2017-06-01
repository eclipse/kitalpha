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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Explorer Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.ActivityExplorerItemImpl#getActivityExplorerItemID <em>Activity Explorer Item ID</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.ActivityExplorerItemImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.ActivityExplorerItemImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityExplorerItemImpl extends NamedElementImpl implements ActivityExplorerItem {

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExplorerItemImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.ACTIVITY_EXPLORER_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID, oldActivityExplorerItemID, activityExplorerItemID));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX, oldIndex, index));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getLabel() {

		return label;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setLabel(String newLabel) {

		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL, oldLabel, label));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID:
				return getActivityExplorerItemID();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX:
				return getIndex();
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL:
				return getLabel();
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
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID:
				setActivityExplorerItemID((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX:
				setIndex((Integer)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL:
				setLabel((String)newValue);
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
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID:
				setActivityExplorerItemID(ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID:
				return ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT == null ? activityExplorerItemID != null : !ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT.equals(activityExplorerItemID);
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX:
				return index != INDEX_EDEFAULT;
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (activityExplorerItemID: ");
		result.append(activityExplorerItemID);
		result.append(", index: ");
		result.append(index);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}


} //ActivityExplorerItemImpl
