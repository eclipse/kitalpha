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

import org.eclipse.sirius.diagram.BackgroundStyle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Container Style Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization#getBackgroundStyle <em>Background Style</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getFlatContainerStyleCustomization()
 * @model
 * @generated
 */

public interface FlatContainerStyleCustomization extends SpecificContainerStyleCustomization {





	/**
	 * Returns the value of the '<em><b>Background Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.diagram.BackgroundStyle}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.BackgroundStyle
	 * @see #setBackgroundStyle(BackgroundStyle)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage#getFlatContainerStyleCustomization_BackgroundStyle()
	 * @model
	 * @generated
	 */

	BackgroundStyle getBackgroundStyle();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.FlatContainerStyleCustomization#getBackgroundStyle <em>Background Style</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Style</em>' attribute.
	 * @see org.eclipse.sirius.diagram.BackgroundStyle
	 * @see #getBackgroundStyle()
	 * @generated
	 */

	void setBackgroundStyle(BackgroundStyle value);





} // FlatContainerStyleCustomization
