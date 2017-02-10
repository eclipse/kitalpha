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

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Customization Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getOwnedCustomizations <em>Owned Customizations</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getPrecondtionExpression <em>Precondtion Expression</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getStyleCustomizationDescriptions()
 * @model
 * @generated
 */

public interface StyleCustomizationDescriptions extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Owned Customizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.AbstractCustomization}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Customizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Customizations</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getStyleCustomizationDescriptions_OwnedCustomizations()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractCustomization> getOwnedCustomizations();







	/**
	 * Returns the value of the '<em><b>Precondtion Expression</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondtion Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondtion Expression</em>' containment reference.
	 * @see #setPrecondtionExpression(CustomizationExpression)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getStyleCustomizationDescriptions_PrecondtionExpression()
	 * @model containment="true"
	 * @generated
	 */

	CustomizationExpression getPrecondtionExpression();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions#getPrecondtionExpression <em>Precondtion Expression</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondtion Expression</em>' containment reference.
	 * @see #getPrecondtionExpression()
	 * @generated
	 */

	void setPrecondtionExpression(CustomizationExpression value);





} // StyleCustomizationDescriptions
