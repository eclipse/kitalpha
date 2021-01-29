/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization#getStrokeSizeComputationExpression <em>Stroke Size Computation Expression</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getDotCustomization()
 * @model
 * @generated
 */

public interface DotCustomization extends SpecificNodeStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Stroke Size Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Size Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Size Computation Expression</em>' containment reference.
	 * @see #setStrokeSizeComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getDotCustomization_StrokeSizeComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getStrokeSizeComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.DotCustomization#getStrokeSizeComputationExpression <em>Stroke Size Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Size Computation Expression</em>' containment reference.
	 * @see #getStrokeSizeComputationExpression()
	 * @generated
	 */

	void setStrokeSizeComputationExpression(CustomizationExpression value);





} // DotCustomization
