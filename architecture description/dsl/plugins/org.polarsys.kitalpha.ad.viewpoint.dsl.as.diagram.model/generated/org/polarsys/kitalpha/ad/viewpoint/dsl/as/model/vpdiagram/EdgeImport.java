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

import org.eclipse.sirius.diagram.description.EdgeMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeImport()
 * @model
 * @generated
 */
public interface EdgeImport extends AbstractEdge {

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference.
	 * @see #setImports(EdgeMapping)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getEdgeImport_Imports()
	 * @model required="true"
	 * @generated
	 */

	EdgeMapping getImports();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport#getImports <em>Imports</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' reference.
	 * @see #getImports()
	 * @generated
	 */

	void setImports(EdgeMapping value);

} // EdgeImport
