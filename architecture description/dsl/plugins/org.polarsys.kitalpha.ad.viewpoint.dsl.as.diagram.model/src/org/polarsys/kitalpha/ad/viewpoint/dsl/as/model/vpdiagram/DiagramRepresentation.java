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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_MappingSet <em>The Mapping Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_ActionSet <em>The Action Set</em>}</li>
 * </ul>
 * </p>
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

} // DiagramRepresentation
