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

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration#getRootProjectName <em>Root Project Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getGenerationConfiguration()
 * @model
 * @generated
 */
public interface GenerationConfiguration extends ConfigurationElement {

	/**
	 * Returns the value of the '<em><b>Root Project Name</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Project Name</em>' attribute.
	 * @see #setRootProjectName(String)
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getGenerationConfiguration_RootProjectName()
	 * @model
	 * @generated
	 */

	String getRootProjectName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.GenerationConfiguration#getRootProjectName <em>Root Project Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Project Name</em>' attribute.
	 * @see #getRootProjectName()
	 * @generated
	 */

	void setRootProjectName(String value);

} // GenerationConfiguration
