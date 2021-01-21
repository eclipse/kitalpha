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
 * A representation of the model object '<em><b>Lozenge Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getWidthComputationExpression <em>Width Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getHeightComputationExpression <em>Height Computation Expression</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLozengeCustomization()
 * @model
 * @generated
 */

public interface LozengeCustomization extends SpecificNodeStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Width Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Computation Expression</em>' containment reference.
	 * @see #setWidthComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLozengeCustomization_WidthComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getWidthComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getWidthComputationExpression <em>Width Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Computation Expression</em>' containment reference.
	 * @see #getWidthComputationExpression()
	 * @generated
	 */

	void setWidthComputationExpression(CustomizationExpression value);




	/**
	 * Returns the value of the '<em><b>Height Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Computation Expression</em>' containment reference.
	 * @see #setHeightComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getLozengeCustomization_HeightComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getHeightComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LozengeCustomization#getHeightComputationExpression <em>Height Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Computation Expression</em>' containment reference.
	 * @see #getHeightComputationExpression()
	 * @generated
	 */

	void setHeightComputationExpression(CustomizationExpression value);





} // LozengeCustomization
