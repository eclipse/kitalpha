/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.ComponentSample;

import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getComponentElement()
 * @model abstract="true"
 * @generated
 */

public interface ComponentElement extends ExtensibleElement {

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
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getComponentElement_Name()
	 * @model
	 * @generated
	 */

	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getComponentElement_Description()
	 * @model
	 * @generated
	 */

	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement#getDescription <em>Description</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */

	void setDescription(String value);

} // ComponentElement
