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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConfigurationElementImpl extends ViewpointElementImpl
		implements ConfigurationElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpconfPackage.Literals.CONFIGURATION_ELEMENT;
	}

} //ConfigurationElementImpl
