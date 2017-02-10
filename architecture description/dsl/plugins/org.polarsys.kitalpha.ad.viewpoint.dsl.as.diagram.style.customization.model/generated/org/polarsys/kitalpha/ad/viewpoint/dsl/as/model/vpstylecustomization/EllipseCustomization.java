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
 * A representation of the model object '<em><b>Ellipse Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getHorizontalDiameterComputationExpression <em>Horizontal Diameter Computation Expression</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getVerticalDiameterComputationExpression <em>Vertical Diameter Computation Expression</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEllipseCustomization()
 * @model
 * @generated
 */

public interface EllipseCustomization extends SpecificNodeStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Horizontal Diameter Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Diameter Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Diameter Computation Expression</em>' containment reference.
	 * @see #setHorizontalDiameterComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEllipseCustomization_HorizontalDiameterComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getHorizontalDiameterComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getHorizontalDiameterComputationExpression <em>Horizontal Diameter Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Diameter Computation Expression</em>' containment reference.
	 * @see #getHorizontalDiameterComputationExpression()
	 * @generated
	 */

	void setHorizontalDiameterComputationExpression(CustomizationExpression value);




	/**
	 * Returns the value of the '<em><b>Vertical Diameter Computation Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Diameter Computation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Diameter Computation Expression</em>' containment reference.
	 * @see #setVerticalDiameterComputationExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getEllipseCustomization_VerticalDiameterComputationExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getVerticalDiameterComputationExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EllipseCustomization#getVerticalDiameterComputationExpression <em>Vertical Diameter Computation Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Diameter Computation Expression</em>' containment reference.
	 * @see #getVerticalDiameterComputationExpression()
	 * @generated
	 */

	void setVerticalDiameterComputationExpression(CustomizationExpression value);





} // EllipseCustomization
