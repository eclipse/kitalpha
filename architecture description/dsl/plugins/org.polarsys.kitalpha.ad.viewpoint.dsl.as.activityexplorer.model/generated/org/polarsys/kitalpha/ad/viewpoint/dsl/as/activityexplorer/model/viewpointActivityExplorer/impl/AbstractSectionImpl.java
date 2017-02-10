/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.AbstractSectionImpl#getOwnedActivities <em>Owned Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSectionImpl extends EObjectImpl implements AbstractSection {

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSectionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.ABSTRACT_SECTION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Activity> getOwnedActivities() {

		if (ownedActivities == null) {
			ownedActivities = new EObjectContainmentEList<Activity>(Activity.class, this, ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES);
		}
		return ownedActivities;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES:
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
			case ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES:
				return getOwnedActivities();
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
			case ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES:
				getOwnedActivities().clear();
				getOwnedActivities().addAll((Collection<? extends Activity>)newValue);
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
			case ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES:
				getOwnedActivities().clear();
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
			case ViewpointActivityExplorerPackage.ABSTRACT_SECTION__OWNED_ACTIVITIES:
				return ownedActivities != null && !ownedActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //AbstractSectionImpl
