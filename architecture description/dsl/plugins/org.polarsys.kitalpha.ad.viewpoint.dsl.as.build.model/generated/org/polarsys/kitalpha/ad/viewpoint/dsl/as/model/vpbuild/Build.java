/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getTarget_platform <em>Target platform</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getMapped_repositories <em>Mapped repositories</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getHudsonDeployment <em>Hudson Deployment</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getBuild()
 * @model
 * @generated
 */
public interface Build extends Aspect {

	/**
	 * Returns the value of the '<em><b>Target platform</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target platform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target platform</em>' attribute.
	 * @see #setTarget_platform(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getBuild_Target_platform()
	 * @model
	 * @generated
	 */

	String getTarget_platform();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getTarget_platform <em>Target platform</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target platform</em>' attribute.
	 * @see #getTarget_platform()
	 * @generated
	 */

	void setTarget_platform(String value);

	/**
	 * Returns the value of the '<em><b>Mapped repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Repository}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped repositories</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getBuild_Mapped_repositories()
	 * @model containment="true"
	 * @generated
	 */

	EList<Repository> getMapped_repositories();

	/**
	 * Returns the value of the '<em><b>Hudson Deployment</b></em>' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hudson Deployment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hudson Deployment</em>' containment reference.
	 * @see #setHudsonDeployment(HudsonDeployment)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getBuild_HudsonDeployment()
	 * @model containment="true"
	 * @generated
	 */

	HudsonDeployment getHudsonDeployment();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build#getHudsonDeployment <em>Hudson Deployment</em>}' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hudson Deployment</em>' containment reference.
	 * @see #getHudsonDeployment()
	 * @generated
	 */

	void setHudsonDeployment(HudsonDeployment value);

} // Build
