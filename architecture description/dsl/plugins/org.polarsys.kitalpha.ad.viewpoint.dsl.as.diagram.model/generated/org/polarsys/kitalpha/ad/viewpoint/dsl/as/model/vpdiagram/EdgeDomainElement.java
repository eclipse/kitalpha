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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_Locator <em>Source Locator</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getThe_Domain <em>The Domain</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_query <em>Source query</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeDomainElement()
 * @model
 * @generated
 */
public interface EdgeDomainElement extends EdgeDomainAssociation {

	/**
	 * Returns the value of the '<em><b>Source Locator</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Locator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Locator</em>' containment reference.
	 * @see #setSource_Locator(AbstractAssociation)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeDomainElement_Source_Locator()
	 * @model containment="true"
	 * @generated
	 */

	AbstractAssociation getSource_Locator();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_Locator <em>Source Locator</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Locator</em>' containment reference.
	 * @see #getSource_Locator()
	 * @generated
	 */

	void setSource_Locator(AbstractAssociation value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' containment reference.
	 * @see #setThe_Domain(AbstractClass)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeDomainElement_The_Domain()
	 * @model containment="true" required="true"
	 * @generated
	 */

	AbstractClass getThe_Domain();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getThe_Domain <em>The Domain</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' containment reference.
	 * @see #getThe_Domain()
	 * @generated
	 */

	void setThe_Domain(AbstractClass value);

	/**
	 * Returns the value of the '<em><b>Source query</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source query</em>' attribute.
	 * @see #setSource_query(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeDomainElement_Source_query()
	 * @model
	 * @generated
	 */

	String getSource_query();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_query <em>Source query</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source query</em>' attribute.
	 * @see #getSource_query()
	 * @generated
	 */

	void setSource_query(String value);

} // EdgeDomainElement
