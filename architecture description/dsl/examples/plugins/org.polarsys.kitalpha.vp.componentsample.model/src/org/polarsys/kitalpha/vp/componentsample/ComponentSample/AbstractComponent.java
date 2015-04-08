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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getUse <em>Use</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getAbstractComponent()
 * @model abstract="true"
 * @generated
 */

public interface AbstractComponent extends ComponentElement {

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getAbstractComponent_Use()
	 * @model
	 * @generated
	 */

	EList<AbstractComponent> getUse();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType
	 * @see #setType(ComponentType)
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getAbstractComponent_Type()
	 * @model
	 * @generated
	 */

	ComponentType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent#getType <em>Type</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentType
	 * @see #getType()
	 * @generated
	 */

	void setType(ComponentType value);

} // AbstractComponent
