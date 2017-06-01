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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass#getUI_For_LocalClass <em>UI For Local Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getLocalClass()
 * @model
 * @generated
 */
public interface LocalClass extends DataSource {

	/**
	 * Returns the value of the '<em><b>UI For Local Class</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI For Local Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI For Local Class</em>' reference.
	 * @see #setUI_For_LocalClass(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getLocalClass_UI_For_LocalClass()
	 * @model required="true"
	 * @generated
	 */

	org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class getUI_For_LocalClass();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass#getUI_For_LocalClass <em>UI For Local Class</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI For Local Class</em>' reference.
	 * @see #getUI_For_LocalClass()
	 * @generated
	 */

	void setUI_For_LocalClass(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class value);

} // LocalClass
