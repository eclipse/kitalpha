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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displayable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getDisplayableElement()
 * @model abstract="true"
 * @generated
 */
public interface DisplayableElement extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.VpuiPackage#getDisplayableElement_Label()
	 * @model
	 * @generated
	 */

	String getLabel();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DisplayableElement#getLabel <em>Label</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */

	void setLabel(String value);

} // DisplayableElement
