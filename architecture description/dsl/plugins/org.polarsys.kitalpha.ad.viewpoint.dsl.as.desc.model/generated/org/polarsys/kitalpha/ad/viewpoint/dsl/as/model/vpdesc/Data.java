/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getVP_Classes <em>VP Classes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getVP_Enumerations <em>VP Enumerations</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getAdditionalExternalData <em>Additional External Data</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getData()
 * @model
 * @generated
 */
public interface Data extends AnnotatableElement {

	/**
	 * Returns the value of the '<em><b>VP Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VP Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VP Classes</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getData_VP_Classes()
	 * @model containment="true"
	 * @generated
	 */

	EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class> getVP_Classes();

	/**
	 * Returns the value of the '<em><b>Additional External Data</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional External Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional External Data</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getData_AdditionalExternalData()
	 * @model
	 * @generated
	 */

	EList<EPackage> getAdditionalExternalData();

	/**
	 * Returns the value of the '<em><b>VP Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VP Enumerations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VP Enumerations</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getData_VP_Enumerations()
	 * @model containment="true"
	 * @generated
	 */

	EList<Enumeration> getVP_Enumerations();

} // Data
