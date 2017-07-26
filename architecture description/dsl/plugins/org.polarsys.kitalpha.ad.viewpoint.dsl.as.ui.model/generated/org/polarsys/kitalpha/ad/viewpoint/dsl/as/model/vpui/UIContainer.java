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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer#getUI_fields <em>UI fields</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer#getSubContainers <em>Sub Containers</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUIContainer()
 * @model
 * @generated
 */
public interface UIContainer extends DisplayableElement {

	/**
	 * Returns the value of the '<em><b>UI fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI fields</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUIContainer_UI_fields()
	 * @model containment="true"
	 * @generated
	 */

	EList<UIField> getUI_fields();

	/**
	 * Returns the value of the '<em><b>Sub Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Containers</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getUIContainer_SubContainers()
	 * @model containment="true"
	 * @generated
	 */

	EList<UIContainer> getSubContainers();

} // UIContainer
