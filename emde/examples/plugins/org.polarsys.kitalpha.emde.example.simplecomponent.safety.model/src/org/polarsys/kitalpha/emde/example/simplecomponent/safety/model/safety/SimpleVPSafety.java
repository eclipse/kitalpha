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
 *******************************************************************************/
package org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety;

import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple VP Safety</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage#getSimpleVPSafety()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement='http://www.polarsys.org/kitalpha/emde/example/simplecomponent#//AbstractComponent '"
 * @generated
 */
public interface SimpleVPSafety extends ComponentElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Complexity</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complexity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complexity</em>' attribute.
	 * @see #setComplexity(int)
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage#getSimpleVPSafety_Complexity()
	 * @model
	 * @generated
	 */

	int getComplexity();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getComplexity <em>Complexity</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complexity</em>' attribute.
	 * @see #getComplexity()
	 * @generated
	 */

	void setComplexity(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SafetyPackage#getSimpleVPSafety_Cost()
	 * @model
	 * @generated
	 */

	int getCost();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.safety.model.safety.SimpleVPSafety#getCost <em>Cost</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */

	void setCost(int value);

} // SimpleVPSafety
