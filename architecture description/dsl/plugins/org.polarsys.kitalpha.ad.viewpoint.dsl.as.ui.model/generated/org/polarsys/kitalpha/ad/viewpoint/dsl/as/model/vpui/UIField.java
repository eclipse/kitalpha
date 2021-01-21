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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUIField()
 * @model
 * @generated
 */
public interface UIField extends DisplayableElement {

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(FieldMapping)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUIField_Mapping()
	 * @model containment="true" required="true"
	 * @generated
	 */

	FieldMapping getMapping();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getMapping <em>Mapping</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */

	void setMapping(FieldMapping value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type
	 * @see #setType(UI_Field_Type)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUIField_Type()
	 * @model
	 * @generated
	 */

	UI_Field_Type getType();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField#getType <em>Type</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type
	 * @see #getType()
	 * @generated
	 */

	void setType(UI_Field_Type value);

} // UIField
