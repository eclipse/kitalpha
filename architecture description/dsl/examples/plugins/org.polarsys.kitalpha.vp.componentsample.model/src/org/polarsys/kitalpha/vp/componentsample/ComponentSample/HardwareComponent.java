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
 * A representation of the model object '<em><b>Hardware Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent#getAbstractComponent <em>Abstract Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getHardwareComponent()
 * @model annotation="http://org.polarsys.kitalpha/documentation description='Hardware Component'"
 * @generated
 */

public interface HardwareComponent extends AbstractComponent {

	/**
	 * Returns the value of the '<em><b>Abstract Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.vp.componentsample.ComponentSample.AbstractComponent}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Component</em>' containment reference list.
	 * @see org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage#getHardwareComponent_AbstractComponent()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractComponent> getAbstractComponent();

} // HardwareComponent
