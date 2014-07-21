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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VP Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus#isOverhead <em>Overhead</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#getVPStatus()
 * @model
 * @generated
 */
public interface VPStatus extends ComponentElement {

	/**
	 * Returns the value of the '<em><b>Overhead</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead</em>' attribute.
	 * @see #setOverhead(boolean)
	 * @see org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.PerformancePackage#getVPStatus_Overhead()
	 * @model
	 * @generated
	 */

	boolean isOverhead();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.emde.example.simplecomponent.performance.model.performance.VPStatus#isOverhead <em>Overhead</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead</em>' attribute.
	 * @see #isOverhead()
	 * @generated
	 */

	void setOverhead(boolean value);

} // VPStatus
