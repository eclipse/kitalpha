/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Icon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getImagePathOff <em>Image Path Off</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getActivityExplorerItemID <em>Activity Explorer Item ID</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.impl.ActivityImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends PredicateElementImpl implements Activity {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected ActivityImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF, oldImagePathOff, imagePathOff));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {

		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {

		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__ID, oldId, id));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__NAME, oldName, name));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {

		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {

		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION, oldDescription, description));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID, oldActivityExplorerItemID, activityExplorerItemID));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__INDEX, oldIndex, index));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.ACTIVITY__LABEL, oldLabel, label));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF:
				return getImagePathOff();
			case ViewpointActivityExplorerPackage.ACTIVITY__ID:
				return getId();
			case ViewpointActivityExplorerPackage.ACTIVITY__NAME:
				return getName();
			case ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION:
				return getDescription();
			case ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID:
				return getActivityExplorerItemID();
			case ViewpointActivityExplorerPackage.ACTIVITY__INDEX:
				return getIndex();
			case ViewpointActivityExplorerPackage.ACTIVITY__LABEL:
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
			case ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF:
				setImagePathOff((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__ID:
				setId((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID:
				setActivityExplorerItemID((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__INDEX:
				setIndex((Integer)newValue);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__LABEL:
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
			case ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF:
				setImagePathOff(IMAGE_PATH_OFF_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__ID:
				setId(ID_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID:
				setActivityExplorerItemID(ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.ACTIVITY__LABEL:
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
			case ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF:
				return IMAGE_PATH_OFF_EDEFAULT == null ? imagePathOff != null : !IMAGE_PATH_OFF_EDEFAULT.equals(imagePathOff);
			case ViewpointActivityExplorerPackage.ACTIVITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ViewpointActivityExplorerPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID:
				return ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT == null ? activityExplorerItemID != null : !ACTIVITY_EXPLORER_ITEM_ID_EDEFAULT.equals(activityExplorerItemID);
			case ViewpointActivityExplorerPackage.ACTIVITY__INDEX:
				return index != INDEX_EDEFAULT;
			case ViewpointActivityExplorerPackage.ACTIVITY__LABEL:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Icon.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF: return ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF;
				default: return -1;
			}
		}
		if (baseClass == ViewpointElement.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY__ID: return VpdescPackage.VIEWPOINT_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY__NAME: return VpdescPackage.NAMED_ELEMENT__NAME;
				case ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION: return VpdescPackage.NAMED_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ActivityExplorerItem.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID: return ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID;
				case ViewpointActivityExplorerPackage.ACTIVITY__INDEX: return ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX;
				case ViewpointActivityExplorerPackage.ACTIVITY__LABEL: return ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL;
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
				case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF: return ViewpointActivityExplorerPackage.ACTIVITY__IMAGE_PATH_OFF;
				default: return -1;
			}
		}
		if (baseClass == ViewpointElement.class) {
			switch (baseFeatureID) {
				case VpdescPackage.VIEWPOINT_ELEMENT__ID: return ViewpointActivityExplorerPackage.ACTIVITY__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case VpdescPackage.NAMED_ELEMENT__NAME: return ViewpointActivityExplorerPackage.ACTIVITY__NAME;
				case VpdescPackage.NAMED_ELEMENT__DESCRIPTION: return ViewpointActivityExplorerPackage.ACTIVITY__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ActivityExplorerItem.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__ACTIVITY_EXPLORER_ITEM_ID: return ViewpointActivityExplorerPackage.ACTIVITY__ACTIVITY_EXPLORER_ITEM_ID;
				case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__INDEX: return ViewpointActivityExplorerPackage.ACTIVITY__INDEX;
				case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM__LABEL: return ViewpointActivityExplorerPackage.ACTIVITY__LABEL;
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
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", activityExplorerItemID: ");
		result.append(activityExplorerItemID);
		result.append(", index: ");
		result.append(index);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
