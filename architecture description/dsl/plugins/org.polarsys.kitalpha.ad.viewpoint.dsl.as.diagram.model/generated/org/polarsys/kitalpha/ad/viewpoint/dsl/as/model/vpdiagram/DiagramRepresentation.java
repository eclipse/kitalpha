/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_MappingSet <em>The Mapping Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_ActionSet <em>The Action Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_DecoratorSet <em>The Decorator Set</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramRepresentation()
 * @model abstract="true"
 * @generated
 */
public interface DiagramRepresentation extends NamedElement {

	/**
	 * Returns the value of the '<em><b>The Mapping Set</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Mapping Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Mapping Set</em>' containment reference.
	 * @see #setThe_MappingSet(MappingSet)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramRepresentation_The_MappingSet()
	 * @model containment="true"
	 * @generated
	 */

	MappingSet getThe_MappingSet();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_MappingSet <em>The Mapping Set</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Mapping Set</em>' containment reference.
	 * @see #getThe_MappingSet()
	 * @generated
	 */

	void setThe_MappingSet(MappingSet value);

	/**
	 * Returns the value of the '<em><b>The Action Set</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Action Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Action Set</em>' containment reference.
	 * @see #setThe_ActionSet(ActionSet)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramRepresentation_The_ActionSet()
	 * @model containment="true"
	 * @generated
	 */

	ActionSet getThe_ActionSet();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_ActionSet <em>The Action Set</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Action Set</em>' containment reference.
	 * @see #getThe_ActionSet()
	 * @generated
	 */

	void setThe_ActionSet(ActionSet value);

	/**
	 * Returns the value of the '<em><b>The Decorator Set</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Decorator Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Decorator Set</em>' containment reference.
	 * @see #setThe_DecoratorSet(DecoratorSet)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramRepresentation_The_DecoratorSet()
	 * @model containment="true"
	 * @generated
	 */

	DecoratorSet getThe_DecoratorSet();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_DecoratorSet <em>The Decorator Set</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Decorator Set</em>' containment reference.
	 * @see #getThe_DecoratorSet()
	 * @generated
	 */

	void setThe_DecoratorSet(DecoratorSet value);

} // DiagramRepresentation
