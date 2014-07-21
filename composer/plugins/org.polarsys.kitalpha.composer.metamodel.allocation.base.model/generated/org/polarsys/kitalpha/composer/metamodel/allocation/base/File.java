/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.metamodel.allocation.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File#getPath <em>Path</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File#getOwnedTypes <em>Owned Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getFile()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface File extends EObject {





	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getFile_Name()
	 * @model required="true"
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);







	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>"/"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getFile_Path()
	 * @model default="/" required="true"
	 * @generated
	 */

	String getPath();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.composer.metamodel.allocation.base.File#getPath <em>Path</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */

	void setPath(String value);







	/**
	 * Returns the value of the '<em><b>Owned Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.composer.metamodel.allocation.base.Type}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Types</em>' containment reference list.
	 * @see org.polarsys.kitalpha.composer.metamodel.allocation.base.BasePackage#getFile_OwnedTypes()
	 * @model containment="true"
	 * @generated
	 */

	EList<Type> getOwnedTypes();





} // File
