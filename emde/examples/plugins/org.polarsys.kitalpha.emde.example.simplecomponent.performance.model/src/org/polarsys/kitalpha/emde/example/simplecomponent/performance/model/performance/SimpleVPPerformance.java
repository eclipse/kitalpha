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
package org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance;

import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple VP Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getCost <em>Cost</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#getSimpleVPPerformance()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement='http://www.polarsys.org/kitalpha/emde/example/simplecomponent#//AbstractComponent '"
 * @generated
 */
public interface SimpleVPPerformance extends ComponentElement, ElementExtension {

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
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#getSimpleVPPerformance_Complexity()
	 * @model
	 * @generated
	 */

	int getComplexity();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getComplexity <em>Complexity</em>}' attribute.

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
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#getSimpleVPPerformance_Cost()
	 * @model
	 * @generated
	 */

	int getCost();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getCost <em>Cost</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */

	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(VPStatus)
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#getSimpleVPPerformance_Status()
	 * @model containment="true"
	 * @generated
	 */

	VPStatus getStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.SimpleVPPerformance#getStatus <em>Status</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */

	void setStatus(VPStatus value);

} // SimpleVPPerformance
