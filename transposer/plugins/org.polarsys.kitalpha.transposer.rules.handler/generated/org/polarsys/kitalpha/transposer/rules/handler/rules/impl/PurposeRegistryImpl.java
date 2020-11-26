/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.impl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry;
import org.polarsys.kitalpha.transposer.rules.handler.rules.RulesPackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;

import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;

import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl#getRegisteredPurposes <em>Registered Purposes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl#getContributedPurposes <em>Contributed Purposes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PurposeRegistryImpl extends EObjectImpl implements PurposeRegistry {

	/**
	 * The cached value of the '{@link #getRegisteredPurposes() <em>Registered Purposes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimePurpose> registeredPurposes;


  

	/**
	 * The cached value of the '{@link #getContributedPurposes() <em>Contributed Purposes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributedPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContributedPurpose> contributedPurposes;


  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeRegistryImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.PURPOSE_REGISTRY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<RuntimePurpose> getRegisteredPurposes() {

		if (registeredPurposes == null) {
			registeredPurposes = new EObjectContainmentEList<RuntimePurpose>(RuntimePurpose.class, this, RulesPackage.PURPOSE_REGISTRY__REGISTERED_PURPOSES);
		}
		return registeredPurposes;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ContributedPurpose> getContributedPurposes() {

		if (contributedPurposes == null) {
			contributedPurposes = new EObjectContainmentEList<ContributedPurpose>(ContributedPurpose.class, this, RulesPackage.PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES);
		}
		return contributedPurposes;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IStatus validateRegisteredPurposes() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IStatus validateContributedPurposes() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void reset() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void init() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RuntimePurpose getRegisteredPurpose(String purpose_p, String mappingId_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RuntimePurpose registerPurpose(String purpose_p, String mappingId_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ContributedPurpose getContributedPurpose(String purpose_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Mapping getContributedMapping(String purpose_p, String mappingId_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RulesPackage.PURPOSE_REGISTRY__REGISTERED_PURPOSES:
				return ((InternalEList<?>)getRegisteredPurposes()).basicRemove(otherEnd, msgs);
			case RulesPackage.PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES:
				return ((InternalEList<?>)getContributedPurposes()).basicRemove(otherEnd, msgs);
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
			case RulesPackage.PURPOSE_REGISTRY__REGISTERED_PURPOSES:
				return getRegisteredPurposes();
			case RulesPackage.PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES:
				return getContributedPurposes();
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
			case RulesPackage.PURPOSE_REGISTRY__REGISTERED_PURPOSES:
				getRegisteredPurposes().clear();
				getRegisteredPurposes().addAll((Collection<? extends RuntimePurpose>)newValue);
				return;
			case RulesPackage.PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES:
				getContributedPurposes().clear();
				getContributedPurposes().addAll((Collection<? extends ContributedPurpose>)newValue);
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
			case RulesPackage.PURPOSE_REGISTRY__REGISTERED_PURPOSES:
				getRegisteredPurposes().clear();
				return;
			case RulesPackage.PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES:
				getContributedPurposes().clear();
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
			case RulesPackage.PURPOSE_REGISTRY__REGISTERED_PURPOSES:
				return registeredPurposes != null && !registeredPurposes.isEmpty();
			case RulesPackage.PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES:
				return contributedPurposes != null && !contributedPurposes.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //PurposeRegistryImpl
