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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Children</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren#getOwned_boderednodes <em>Owned boderednodes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren#getReused_boderednodes <em>Reused boderednodes</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeChildren()
 * @model
 * @generated
 */
public interface NodeChildren extends EObject {

	/**
	 * Returns the value of the '<em><b>Owned boderednodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned boderednodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned boderednodes</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeChildren_Owned_boderednodes()
	 * @model containment="true"
	 * @generated
	 */

	EList<BorderedNode> getOwned_boderednodes();

	/**
	 * Returns the value of the '<em><b>Reused boderednodes</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused boderednodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused boderednodes</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getNodeChildren_Reused_boderednodes()
	 * @model
	 * @generated
	 */

	EList<BorderedNode> getReused_boderednodes();

} // NodeChildren
