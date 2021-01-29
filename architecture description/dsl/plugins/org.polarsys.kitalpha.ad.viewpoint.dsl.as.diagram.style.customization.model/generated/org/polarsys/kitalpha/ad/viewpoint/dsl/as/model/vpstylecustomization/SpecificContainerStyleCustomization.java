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

import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Container Style Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.SpecificContainerStyleCustomization#getAppliedOn <em>Applied On</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getSpecificContainerStyleCustomization()
 * @model abstract="true"
 * @generated
 */

public interface SpecificContainerStyleCustomization extends EObject {





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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getSpecificContainerStyleCustomization_AppliedOn()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */

	EList<ContainerStyleDescription> getAppliedOn();





} // SpecificContainerStyleCustomization
