/*******************************************************************************
 * Copyright (c) 2015, 2017 Thales Global Services S.A.S.
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

import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Style Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getOwnedSpecificContainerStyleCustomization <em>Owned Specific Container Style Customization</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcWith <em>Arc With</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcHeight <em>Arc Height</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#isRoundedCorner <em>Rounded Corner</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getContainerStyleCustomization()
 * @model
 * @generated
 */

public interface ContainerStyleCustomization extends AbstractNodeStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Applied On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.style.ContainerStyleDescription}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied On</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getContainerStyleCustomization_AppliedOn()
	 * @model
	 * @generated
	 */

	EList<ContainerStyleDescription> getAppliedOn();







	/**
	 * Returns the value of the '<em><b>Owned Specific Container Style Customization</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Specific Container Style Customization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Specific Container Style Customization</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getContainerStyleCustomization_OwnedSpecificContainerStyleCustomization()
	 * @model containment="true"
	 * @generated
	 */

	EList<SpecificContainerStyleCustomization> getOwnedSpecificContainerStyleCustomization();







	/**
	 * Returns the value of the '<em><b>Arc With</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc With</em>' attribute.
	 * @see #setArcWith(int)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getContainerStyleCustomization_ArcWith()
	 * @model
	 * @generated
	 */

	int getArcWith();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcWith <em>Arc With</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc With</em>' attribute.
	 * @see #getArcWith()
	 * @generated
	 */

	void setArcWith(int value);







	/**
	 * Returns the value of the '<em><b>Arc Height</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc Height</em>' attribute.
	 * @see #setArcHeight(int)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getContainerStyleCustomization_ArcHeight()
	 * @model
	 * @generated
	 */

	int getArcHeight();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#getArcHeight <em>Arc Height</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc Height</em>' attribute.
	 * @see #getArcHeight()
	 * @generated
	 */

	void setArcHeight(int value);







	/**
	 * Returns the value of the '<em><b>Rounded Corner</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounded Corner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounded Corner</em>' attribute.
	 * @see #setRoundedCorner(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getContainerStyleCustomization_RoundedCorner()
	 * @model
	 * @generated
	 */

	boolean isRoundedCorner();





	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#isRoundedCorner <em>Rounded Corner</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounded Corner</em>' attribute.
	 * @see #isRoundedCorner()
	 * @generated
	 */

	void setRoundedCorner(boolean value);







	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization#isRoundedCorner <em>Rounded Corner</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounded Corner</em>' attribute.
	 * @see #isRoundedCorner()
	 * @generated NOT
	 */

	void setRoundedCorner(Boolean value);





} // ContainerStyleCustomization
