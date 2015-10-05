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
package org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance;

import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage#getPerformance()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/kitalpha/ComponentSample/1.0.0#//AbstractComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/org.polarsys.kitalpha.vp.componentsample/models/ComponentSample.ecore#//AbstractComponent'"
 * @generated
 */

public interface Performance extends ComponentElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PerformanceStatus)
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage#getPerformance_Status()
	 * @model containment="true"
	 * @generated
	 */

	PerformanceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getStatus <em>Status</em>}' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */

	void setStatus(PerformanceStatus value);

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
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage#getPerformance_Complexity()
	 * @model
	 * @generated
	 */

	int getComplexity();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getComplexity <em>Complexity</em>}' attribute.
	
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
	 * @see org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.ComponentSamplePerformancePackage#getPerformance_Cost()
	 * @model
	 * @generated
	 */

	int getCost();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance#getCost <em>Cost</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */

	void setCost(int value);

} // Performance
