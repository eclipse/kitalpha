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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage#getExternalClass()
 * @model
 * @generated
 */
public interface ExternalClass extends AbstractClass {

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(EClass)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage#getExternalClass_Class()
	 * @model required="true"
	 * @generated
	 */

	EClass getClass_();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass#getClass_ <em>Class</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */

	void setClass(EClass value);

} // ExternalClass
