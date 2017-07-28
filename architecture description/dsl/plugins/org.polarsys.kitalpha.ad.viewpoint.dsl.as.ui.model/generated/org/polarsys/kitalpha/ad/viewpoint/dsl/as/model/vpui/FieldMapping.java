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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping#getUI_Field_Mapped_To <em>UI Field Mapped To</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getFieldMapping()
 * @model
 * @generated
 */
public interface FieldMapping extends ViewpointElement {

	/**
	 * Returns the value of the '<em><b>UI Field Mapped To</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI Field Mapped To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI Field Mapped To</em>' reference.
	 * @see #setUI_Field_Mapped_To(AbstractFeature)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getFieldMapping_UI_Field_Mapped_To()
	 * @model required="true"
	 * @generated
	 */

	AbstractFeature getUI_Field_Mapped_To();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping#getUI_Field_Mapped_To <em>UI Field Mapped To</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI Field Mapped To</em>' reference.
	 * @see #getUI_Field_Mapped_To()
	 * @generated
	 */

	void setUI_Field_Mapped_To(AbstractFeature value);

} // FieldMapping
