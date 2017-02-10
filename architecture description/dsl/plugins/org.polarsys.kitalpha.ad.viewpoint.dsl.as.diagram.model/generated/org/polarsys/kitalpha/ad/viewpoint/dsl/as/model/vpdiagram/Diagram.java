/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram#getThe_domain <em>The domain</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends DiagramRepresentation {

	/**
	 * Returns the value of the '<em><b>The domain</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The domain</em>' containment reference.
	 * @see #setThe_domain(DomainContainer)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagram_The_domain()
	 * @model containment="true" required="true"
	 * @generated
	 */

	DomainContainer getThe_domain();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram#getThe_domain <em>The domain</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The domain</em>' containment reference.
	 * @see #getThe_domain()
	 * @generated
	 */

	void setThe_domain(DomainContainer value);

} // Diagram
