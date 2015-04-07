/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationPackage;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.impl.IntegrationImpl#getUsedViewpoints <em>Used Viewpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegrationImpl extends EObjectImpl implements Integration {

	/**
	 * The cached value of the '{@link #getUsedViewpoints() <em>Used Viewpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedViewpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<UsedViewpoint> usedViewpoints;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrationPackage.Literals.INTEGRATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<UsedViewpoint> getUsedViewpoints() {

		if (usedViewpoints == null) {
			usedViewpoints = new EObjectContainmentEList<UsedViewpoint>(UsedViewpoint.class, this, IntegrationPackage.INTEGRATION__USED_VIEWPOINTS);
		}
		return usedViewpoints;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrationPackage.INTEGRATION__USED_VIEWPOINTS:
				return ((InternalEList<?>)getUsedViewpoints()).basicRemove(otherEnd, msgs);
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
			case IntegrationPackage.INTEGRATION__USED_VIEWPOINTS:
				return getUsedViewpoints();
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
			case IntegrationPackage.INTEGRATION__USED_VIEWPOINTS:
				getUsedViewpoints().clear();
				getUsedViewpoints().addAll((Collection<? extends UsedViewpoint>)newValue);
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
			case IntegrationPackage.INTEGRATION__USED_VIEWPOINTS:
				getUsedViewpoints().clear();
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
			case IntegrationPackage.INTEGRATION__USED_VIEWPOINTS:
				return usedViewpoints != null && !usedViewpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //IntegrationImpl
