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

import org.eclipse.sirius.diagram.BackgroundStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getForgroundColor <em>Forground Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundStyle <em>Background Style</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getFlatStyle()
 * @model
 * @generated
 */
public interface FlatStyle extends AbstractContainerStyle {

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setBackgroundColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getFlatStyle_BackgroundColor()
	 * @model
	 * @generated
	 */

	SystemColors getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundColor <em>Background Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getBackgroundColor()
	 * @generated
	 */

	void setBackgroundColor(SystemColors value);

	/**
	 * Returns the value of the '<em><b>Forground Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forground Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forground Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setForgroundColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getFlatStyle_ForgroundColor()
	 * @model
	 * @generated
	 */

	SystemColors getForgroundColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getForgroundColor <em>Forground Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forground Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getForgroundColor()
	 * @generated
	 */

	void setForgroundColor(SystemColors value);

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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getFlatStyle_BorderColor()
	 * @model
	 * @generated
	 */

	SystemColors getBorderColor();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBorderColor <em>Border Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getBorderColor()
	 * @generated
	 */

	void setBorderColor(SystemColors value);

	/**
	 * Returns the value of the '<em><b>Background Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.BackgroundStyle}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.BackgroundStyle
	 * @see #setBackgroundStyle(BackgroundStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage#getFlatStyle_BackgroundStyle()
	 * @model
	 * @generated
	 */

	BackgroundStyle getBackgroundStyle();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundStyle <em>Background Style</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.BackgroundStyle
	 * @see #getBackgroundStyle()
	 * @generated
	 */

	void setBackgroundStyle(BackgroundStyle value);

} // FlatStyle
