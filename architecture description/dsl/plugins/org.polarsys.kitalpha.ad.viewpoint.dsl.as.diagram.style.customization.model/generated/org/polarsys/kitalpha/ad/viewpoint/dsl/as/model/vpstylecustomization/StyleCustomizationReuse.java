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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.viewpoint.description.EStructuralFeatureCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Customization Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse#getReusedCustomization <em>Reused Customization</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse#getAppliedOn <em>Applied On</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getStyleCustomizationReuse()
 * @model
 * @generated
 */

public interface StyleCustomizationReuse extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Reused Customization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.viewpoint.description.EStructuralFeatureCustomization}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reused Customization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reused Customization</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getStyleCustomizationReuse_ReusedCustomization()
	 * @model
	 * @generated
	 */

	EList<EStructuralFeatureCustomization> getReusedCustomization();







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
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getStyleCustomizationReuse_AppliedOn()
	 * @model
	 * @generated
	 */

	EList<EObject> getAppliedOn();





} // StyleCustomizationReuse
