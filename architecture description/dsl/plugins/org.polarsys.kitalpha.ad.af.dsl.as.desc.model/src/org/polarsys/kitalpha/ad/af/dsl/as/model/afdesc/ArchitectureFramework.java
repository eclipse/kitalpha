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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_aspects <em>Af aspects</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_viewpoints <em>Af viewpoints</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getOwned_configuration <em>Owned configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getArchitectureFramework()
 * @model
 * @generated
 */
public interface ArchitectureFramework extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Af aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Aspect}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Af aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Af aspects</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getArchitectureFramework_Af_aspects()
	 * @model containment="true"
	 * @generated
	 */

	EList<Aspect> getAf_aspects();

	/**
	 * Returns the value of the '<em><b>Af viewpoints</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Af viewpoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Af viewpoints</em>' containment reference.
	 * @see #setAf_viewpoints(Viewpoints)
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getArchitectureFramework_Af_viewpoints()
	 * @model containment="true"
	 * @generated
	 */

	Viewpoints getAf_viewpoints();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getAf_viewpoints <em>Af viewpoints</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Af viewpoints</em>' containment reference.
	 * @see #getAf_viewpoints()
	 * @generated
	 */

	void setAf_viewpoints(Viewpoints value);

	/**
	 * Returns the value of the '<em><b>Owned configuration</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned configuration</em>' containment reference.
	 * @see #setOwned_configuration(Configuration)
	 * @see org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage#getArchitectureFramework_Owned_configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Configuration getOwned_configuration();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework#getOwned_configuration <em>Owned configuration</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned configuration</em>' containment reference.
	 * @see #getOwned_configuration()
	 * @generated
	 */

	void setOwned_configuration(Configuration value);

} // ArchitectureFramework
