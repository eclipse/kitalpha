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
import org.eclipse.sirius.viewpoint.description.SystemColors;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getAbstractNodeStyle()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNodeStyle extends EObject {

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setBorderColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getAbstractNodeStyle_BorderColor()
	 * @model
	 * @generated
	 */

	SystemColors getBorderColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle#getBorderColor <em>Border Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getBorderColor()
	 * @generated
	 */

	void setBorderColor(SystemColors value);

} // AbstractNodeStyle
