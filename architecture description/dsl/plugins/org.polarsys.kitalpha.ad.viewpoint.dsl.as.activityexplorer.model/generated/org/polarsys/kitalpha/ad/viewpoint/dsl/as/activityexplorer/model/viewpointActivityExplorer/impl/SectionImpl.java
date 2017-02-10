/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.SectionImpl#getOwnedActivities <em>Owned Activities</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.SectionImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.SectionImpl#isFiltering <em>Filtering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ActivityExplorerItemImpl implements Section {

	/**
	 * The cached value of the '{@link #getOwnedActivities() <em>Owned Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> ownedActivities;




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
	protected SectionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.SECTION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Activity> getOwnedActivities() {

		if (ownedActivities == null) {
			ownedActivities = new EObjectContainmentEList<Activity>(Activity.class, this, ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES);
		}
		return ownedActivities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.SECTION__EXPANDED, oldExpanded, expanded));

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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.SECTION__FILTERING, oldFiltering, filtering));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES:
				return ((InternalEList<?>)getOwnedActivities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES:
				return getOwnedActivities();
			case ViewpointActivityExplorerPackage.SECTION__EXPANDED:
				return isExpanded();
			case ViewpointActivityExplorerPackage.SECTION__FILTERING:
				return isFiltering();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES:
				getOwnedActivities().clear();
				getOwnedActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case ViewpointActivityExplorerPackage.SECTION__EXPANDED:
				setExpanded((Boolean)newValue);
				return;
			case ViewpointActivityExplorerPackage.SECTION__FILTERING:
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
			case ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES:
				getOwnedActivities().clear();
				return;
			case ViewpointActivityExplorerPackage.SECTION__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.SECTION__FILTERING:
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
			case ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES:
				return ownedActivities != null && !ownedActivities.isEmpty();
			case ViewpointActivityExplorerPackage.SECTION__EXPANDED:
				return expanded != EXPANDED_EDEFAULT;
			case ViewpointActivityExplorerPackage.SECTION__FILTERING:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractSection.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES: return ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES;
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
		if (baseClass == AbstractSection.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES: return ViewpointActivityExplorerPackage.SECTION__OWNED_ACTIVITIES;
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
		result.append(" (expanded: ");
		result.append(expanded);
		result.append(", filtering: ");
		result.append(filtering);
		result.append(')');
		return result.toString();
	}


} //SectionImpl
