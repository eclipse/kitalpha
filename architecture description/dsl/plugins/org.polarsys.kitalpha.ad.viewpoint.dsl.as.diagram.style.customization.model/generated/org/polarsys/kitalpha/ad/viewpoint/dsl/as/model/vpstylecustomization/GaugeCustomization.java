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

import org.eclipse.sirius.diagram.AlignmentKind;

import org.eclipse.sirius.diagram.description.style.GaugeSectionDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gauge Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getSections <em>Sections</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getGaugeCustomization()
 * @model
 * @generated
 */

public interface GaugeCustomization extends SpecificNodeStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Sections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.style.GaugeSectionDescription}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getGaugeCustomization_Sections()
	 * @model
	 * @generated
	 */

	EList<GaugeSectionDescription> getSections();







	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.AlignmentKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see org.eclipse.sirius.diagram.AlignmentKind
	 * @see #setAlignement(AlignmentKind)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getGaugeCustomization_Alignement()
	 * @model
	 * @generated
	 */

	AlignmentKind getAlignement();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.GaugeCustomization#getAlignement <em>Alignement</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see org.eclipse.sirius.diagram.AlignmentKind
	 * @see #getAlignement()
	 * @generated
	 */

	void setAlignement(AlignmentKind value);





} // GaugeCustomization
