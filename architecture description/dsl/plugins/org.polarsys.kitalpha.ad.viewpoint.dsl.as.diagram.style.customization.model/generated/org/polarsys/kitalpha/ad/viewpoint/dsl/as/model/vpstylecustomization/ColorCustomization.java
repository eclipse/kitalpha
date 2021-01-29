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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.viewpoint.description.SystemColors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColor <em>Color</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getAppliedOn <em>Applied On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColorUseCase <em>Color Use Case</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getColorCustomization()
 * @model
 * @generated
 */

public interface ColorCustomization extends AbstractCustomization {





	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.viewpoint.description.SystemColors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #setColor(SystemColors)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getColorCustomization_Color()
	 * @model
	 * @generated
	 */

	SystemColors getColor();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColor <em>Color</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.eclipse.sirius.viewpoint.description.SystemColors
	 * @see #getColor()
	 * @generated
	 */

	void setColor(SystemColors value);




	/**
	 * Returns the value of the '<em><b>Applied On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied On</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getColorCustomization_AppliedOn()
	 * @model
	 * @generated
	 */

	EList<EObject> getAppliedOn();







	/**
	 * Returns the value of the '<em><b>Color Use Case</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Use Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Use Case</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase
	 * @see #setColorUseCase(ColorUseCase)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getColorCustomization_ColorUseCase()
	 * @model
	 * @generated
	 */

	ColorUseCase getColorUseCase();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization#getColorUseCase <em>Color Use Case</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Use Case</em>' attribute.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase
	 * @see #getColorUseCase()
	 * @generated
	 */

	void setColorUseCase(ColorUseCase value);





} // ColorCustomization
