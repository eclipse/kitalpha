/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleSetImpl#getHiddenRules <em>Hidden Rules</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleSetImpl#getNewRules <em>New Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleSetImpl extends ElementSetImpl implements RuleSet {

	/**
	 * The cached value of the '{@link #getHiddenRules() <em>Hidden Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> hiddenRules;




	/**
	 * The cached value of the '{@link #getNewRules() <em>New Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> newRules;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleSetImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointPackage.Literals.RULE_SET;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Rule> getHiddenRules() {

		if (hiddenRules == null) {
			hiddenRules = new EObjectResolvingEList<Rule>(Rule.class, this, ViewpointPackage.RULE_SET__HIDDEN_RULES);
		}
		return hiddenRules;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Rule> getNewRules() {

		if (newRules == null) {
			newRules = new EObjectContainmentEList<Rule>(Rule.class, this, ViewpointPackage.RULE_SET__NEW_RULES);
		}
		return newRules;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointPackage.RULE_SET__NEW_RULES:
				return ((InternalEList<?>)getNewRules()).basicRemove(otherEnd, msgs);
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
			case ViewpointPackage.RULE_SET__HIDDEN_RULES:
				return getHiddenRules();
			case ViewpointPackage.RULE_SET__NEW_RULES:
				return getNewRules();
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
			case ViewpointPackage.RULE_SET__HIDDEN_RULES:
				getHiddenRules().clear();
				getHiddenRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case ViewpointPackage.RULE_SET__NEW_RULES:
				getNewRules().clear();
				getNewRules().addAll((Collection<? extends Rule>)newValue);
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
			case ViewpointPackage.RULE_SET__HIDDEN_RULES:
				getHiddenRules().clear();
				return;
			case ViewpointPackage.RULE_SET__NEW_RULES:
				getNewRules().clear();
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
			case ViewpointPackage.RULE_SET__HIDDEN_RULES:
				return hiddenRules != null && !hiddenRules.isEmpty();
			case ViewpointPackage.RULE_SET__NEW_RULES:
				return newRules != null && !newRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //RuleSetImpl
