/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node Style Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getTooltipExpression <em>Tooltip Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getAbstractNodeStyleCustomization()
 * @model abstract="true"
 * @generated
 */

public interface AbstractNodeStyleCustomization extends AbstractCustomization {





	/**
	 * Returns the value of the '<em><b>Tooltip Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip Expression</em>' containment reference.
	 * @see #setTooltipExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getAbstractNodeStyleCustomization_TooltipExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getTooltipExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getTooltipExpression <em>Tooltip Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip Expression</em>' containment reference.
	 * @see #getTooltipExpression()
	 * @generated
	 */

	void setTooltipExpression(CustomizationExpression value);




	/**
	 * Returns the value of the '<em><b>Border Size Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Size Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Size Computation Expression</em>' containment reference.
	 * @see #setBorderSizeComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getAbstractNodeStyleCustomization_BorderSizeComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getBorderSizeComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractNodeStyleCustomization#getBorderSizeComputationExpression <em>Border Size Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Size Computation Expression</em>' containment reference.
	 * @see #getBorderSizeComputationExpression()
	 * @generated
	 */

	void setBorderSizeComputationExpression(CustomizationExpression value);





} // AbstractNodeStyleCustomization
