/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.metamodel.allocation.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.Root#getOwnedFiles <em>Owned Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getRoot()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Root extends EObject {





	/**
	 * Returns the value of the '<em><b>Owned Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Files</em>' containment reference list.
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getRoot_OwnedFiles()
	 * @model containment="true"
	 * @generated
	 */

	EList<File> getOwnedFiles();





} // Root
