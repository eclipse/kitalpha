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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.ExtensionGeneratrionConfigurationImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocGenConfigurationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.DocumentationGenerationConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.doc.model.docGenConfiguration.impl.DocumentationGenerationConfigurationImpl#isEcoreToHtml <em>Ecore To Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationGenerationConfigurationImpl extends ExtensionGeneratrionConfigurationImpl implements DocumentationGenerationConfiguration {

	/**
	 * The default value of the '{@link #isEcoreToHtml() <em>Ecore To Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEcoreToHtml()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ECORE_TO_HTML_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEcoreToHtml() <em>Ecore To Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEcoreToHtml()
	 * @generated
	 * @ordered
	 */
	protected boolean ecoreToHtml = ECORE_TO_HTML_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationGenerationConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocGenConfigurationPackage.Literals.DOCUMENTATION_GENERATION_CONFIGURATION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isEcoreToHtml() {

		return ecoreToHtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setEcoreToHtml(boolean newEcoreToHtml) {

		boolean oldEcoreToHtml = ecoreToHtml;
		ecoreToHtml = newEcoreToHtml;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML, oldEcoreToHtml, ecoreToHtml));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML:
				return isEcoreToHtml();
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
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML:
				setEcoreToHtml((Boolean)newValue);
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
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML:
				setEcoreToHtml(ECORE_TO_HTML_EDEFAULT);
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
			case DocGenConfigurationPackage.DOCUMENTATION_GENERATION_CONFIGURATION__ECORE_TO_HTML:
				return ecoreToHtml != ECORE_TO_HTML_EDEFAULT;
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ecoreToHtml: ");
		result.append(ecoreToHtml);
		result.append(')');
		return result.toString();
	}


} //DocumentationGenerationConfigurationImpl
