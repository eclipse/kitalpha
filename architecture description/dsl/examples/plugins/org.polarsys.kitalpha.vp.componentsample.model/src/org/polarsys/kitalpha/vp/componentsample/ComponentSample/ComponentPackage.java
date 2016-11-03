/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
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
 * A representation of the model object '<em><b>Component Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentPackage#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getComponentPackage()
 * @model
 * @generated
 */

public interface ComponentPackage extends org.polarsys.kitalpha.vp.componentsample.ComponentSample.Package {

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getComponentPackage_Components()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractComponent> getComponents();

} // ComponentPackage
