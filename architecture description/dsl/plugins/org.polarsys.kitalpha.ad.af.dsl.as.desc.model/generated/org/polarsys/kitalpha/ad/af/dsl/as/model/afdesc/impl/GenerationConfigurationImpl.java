/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.impl.GenerationConfigurationImpl#getRootProjectName <em>Root Project Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationConfigurationImpl extends ConfigurationElementImpl
		implements GenerationConfiguration {

	/**
	 * The default value of the '{@link #getRootProjectName() <em>Root Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootProjectName() <em>Root Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootProjectName()
	 * @generated
	 * @ordered
	 */
	protected String rootProjectName = ROOT_PROJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfdescPackage.Literals.GENERATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getRootProjectName() {

		return rootProjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setRootProjectName(String newRootProjectName) {

		String oldRootProjectName = rootProjectName;
		rootProjectName = newRootProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfdescPackage.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME, oldRootProjectName, rootProjectName));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfdescPackage.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME:
				return getRootProjectName();
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
			case AfdescPackage.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME:
				setRootProjectName((String)newValue);
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
			case AfdescPackage.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME:
				setRootProjectName(ROOT_PROJECT_NAME_EDEFAULT);
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
			case AfdescPackage.GENERATION_CONFIGURATION__ROOT_PROJECT_NAME:
				return ROOT_PROJECT_NAME_EDEFAULT == null ? rootProjectName != null : !ROOT_PROJECT_NAME_EDEFAULT.equals(rootProjectName);
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
		result.append(" (rootProjectName: ");
		result.append(rootProjectName);
		result.append(')');
		return result.toString();
	}

} //GenerationConfigurationImpl
