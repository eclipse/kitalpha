/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceSetImpl#getHiddenServices <em>Hidden Services</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceSetImpl#getNewServices <em>New Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSetImpl extends ElementSetImpl implements ServiceSet {

	/**
	 * The cached value of the '{@link #getHiddenServices() <em>Hidden Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> hiddenServices;




	/**
	 * The cached value of the '{@link #getNewServices() <em>New Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> newServices;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSetImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointPackage.Literals.SERVICE_SET;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Service> getHiddenServices() {

		if (hiddenServices == null) {
			hiddenServices = new EObjectResolvingEList<Service>(Service.class, this, ViewpointPackage.SERVICE_SET__HIDDEN_SERVICES);
		}
		return hiddenServices;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Service> getNewServices() {

		if (newServices == null) {
			newServices = new EObjectContainmentEList<Service>(Service.class, this, ViewpointPackage.SERVICE_SET__NEW_SERVICES);
		}
		return newServices;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointPackage.SERVICE_SET__NEW_SERVICES:
				return ((InternalEList<?>)getNewServices()).basicRemove(otherEnd, msgs);
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
			case ViewpointPackage.SERVICE_SET__HIDDEN_SERVICES:
				return getHiddenServices();
			case ViewpointPackage.SERVICE_SET__NEW_SERVICES:
				return getNewServices();
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
			case ViewpointPackage.SERVICE_SET__HIDDEN_SERVICES:
				getHiddenServices().clear();
				getHiddenServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ViewpointPackage.SERVICE_SET__NEW_SERVICES:
				getNewServices().clear();
				getNewServices().addAll((Collection<? extends Service>)newValue);
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
			case ViewpointPackage.SERVICE_SET__HIDDEN_SERVICES:
				getHiddenServices().clear();
				return;
			case ViewpointPackage.SERVICE_SET__NEW_SERVICES:
				getNewServices().clear();
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
			case ViewpointPackage.SERVICE_SET__HIDDEN_SERVICES:
				return hiddenServices != null && !hiddenServices.isEmpty();
			case ViewpointPackage.SERVICE_SET__NEW_SERVICES:
				return newServices != null && !newServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //ServiceSetImpl
