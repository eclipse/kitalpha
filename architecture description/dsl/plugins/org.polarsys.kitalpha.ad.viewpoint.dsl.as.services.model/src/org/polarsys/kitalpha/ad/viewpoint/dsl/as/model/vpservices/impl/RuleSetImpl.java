/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/


package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleSetImpl#getVpRules <em>Vp Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleSetImpl extends AspectImpl implements RuleSet {

	/**
	 * The cached value of the '{@link #getVpRules() <em>Vp Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> vpRules;

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
		return VpservicesPackage.Literals.RULE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Rule> getVpRules() {

		if (vpRules == null) {
			vpRules = new EObjectContainmentEList<Rule>(Rule.class, this, VpservicesPackage.RULE_SET__VP_RULES);
		}
		return vpRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VpservicesPackage.RULE_SET__VP_RULES:
				return ((InternalEList<?>)getVpRules()).basicRemove(otherEnd, msgs);
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
			case VpservicesPackage.RULE_SET__VP_RULES:
				return getVpRules();
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
			case VpservicesPackage.RULE_SET__VP_RULES:
				getVpRules().clear();
				getVpRules().addAll((Collection<? extends Rule>)newValue);
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
			case VpservicesPackage.RULE_SET__VP_RULES:
				getVpRules().clear();
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
			case VpservicesPackage.RULE_SET__VP_RULES:
				return vpRules != null && !vpRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleSetImpl
