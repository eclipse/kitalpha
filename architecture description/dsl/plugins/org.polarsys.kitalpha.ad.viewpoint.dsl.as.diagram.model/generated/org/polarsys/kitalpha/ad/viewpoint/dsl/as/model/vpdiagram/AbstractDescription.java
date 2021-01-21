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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getNode_Label <em>Node Label</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getAbstractDescription()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDescription extends EObject {

	/**
	 * Returns the value of the '<em><b>Node Label</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Label</em>' containment reference.
	 * @see #setNode_Label(Label)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getAbstractDescription_Node_Label()
	 * @model containment="true"
	 * @generated
	 */

	Label getNode_Label();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getNode_Label <em>Node Label</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Label</em>' containment reference.
	 * @see #getNode_Label()
	 * @generated
	 */

	void setNode_Label(Label value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getAbstractDescription_Condition()
	 * @model containment="true"
	 * @generated
	 */

	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getCondition <em>Condition</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */

	void setCondition(Condition value);

} // AbstractDescription
