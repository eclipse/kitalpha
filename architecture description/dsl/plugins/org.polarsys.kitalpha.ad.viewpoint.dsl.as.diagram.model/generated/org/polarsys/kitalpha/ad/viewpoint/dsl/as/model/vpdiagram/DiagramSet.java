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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getAdditionalExternalGroup <em>Additional External Group</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getAdditionalExternalData <em>Additional External Data</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramSet()
 * @model
 * @generated
 */
public interface DiagramSet extends Aspect {

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramSet_Diagrams()
	 * @model containment="true"
	 * @generated
	 */

	EList<DiagramRepresentation> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Additional External Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.viewpoint.description.Group}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional External Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional External Group</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramSet_AdditionalExternalGroup()
	 * @model
	 * @generated
	 */
	EList<Group> getAdditionalExternalGroup();

	/**
	 * Returns the value of the '<em><b>Additional External Data</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional External Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional External Data</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getDiagramSet_AdditionalExternalData()
	 * @model
	 * @generated
	 */
	EList<EPackage> getAdditionalExternalData();

} // DiagramSet
