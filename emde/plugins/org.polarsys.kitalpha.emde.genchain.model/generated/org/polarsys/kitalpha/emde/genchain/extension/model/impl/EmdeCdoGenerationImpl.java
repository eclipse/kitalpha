/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.genchain.extension.model.impl;

import org.eclipse.egf.portfolio.genchain.cdo.cdoExtension.impl.CdoGenerationImpl;
import org.eclipse.egf.portfolio.genchain.generationChain.impl.EmfGenerationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.emde.genchain.extension.model.EmdeCdoGeneration;
import org.polarsys.kitalpha.emde.genchain.extension.model.ExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emde Cdo Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EmdeCdoGenerationImpl extends CdoGenerationImpl implements EmdeCdoGeneration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmdeCdoGenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.EMDE_CDO_GENERATION;
	}

} //EmdeCdoGenerationImpl
