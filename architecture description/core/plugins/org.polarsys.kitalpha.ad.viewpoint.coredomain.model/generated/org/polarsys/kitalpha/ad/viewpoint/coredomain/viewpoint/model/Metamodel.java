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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {





	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getMetamodel_Models()
	 * @model
	 * @generated
	 */

	EList<EPackage> getModels();





} // Metamodel
