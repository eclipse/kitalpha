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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Super Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getLocalSuperClass()
 * @model
 * @generated
 */
public interface LocalSuperClass extends AbstractSuperClass {

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage#getLocalSuperClass_SuperClass()
	 * @model required="true"
	 * @generated
	 */

	org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class getSuperClass();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass#getSuperClass <em>Super Class</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */

	void setSuperClass(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class value);

} // LocalSuperClass
