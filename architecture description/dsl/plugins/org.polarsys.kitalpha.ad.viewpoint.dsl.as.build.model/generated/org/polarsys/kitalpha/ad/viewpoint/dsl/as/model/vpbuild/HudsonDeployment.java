/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hudson Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAntName <em>Ant Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAssignedNode <em>Assigned Node</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getBuild_id <em>Build id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getJdkName <em>Jdk Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployJobName <em>User Deploy Job Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUsers <em>Users</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployServerUrl <em>User Deploy Server Url</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getGenerationLocation <em>Generation Location</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment()
 * @model
 * @generated
 */

public interface HudsonDeployment extends EObject {

	/**
	 * Returns the value of the '<em><b>Ant Name</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ant Name</em>' attribute.
	 * @see #setAntName(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_AntName()
	 * @model
	 * @generated
	 */

	String getAntName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAntName <em>Ant Name</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ant Name</em>' attribute.
	 * @see #getAntName()
	 * @generated
	 */

	void setAntName(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Node</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Node</em>' attribute.
	 * @see #setAssignedNode(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_AssignedNode()
	 * @model
	 * @generated
	 */

	String getAssignedNode();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getAssignedNode <em>Assigned Node</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Node</em>' attribute.
	 * @see #getAssignedNode()
	 * @generated
	 */

	void setAssignedNode(String value);

	/**
	 * Returns the value of the '<em><b>Build id</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build id</em>' attribute.
	 * @see #setBuild_id(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_Build_id()
	 * @model
	 * @generated
	 */

	String getBuild_id();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getBuild_id <em>Build id</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build id</em>' attribute.
	 * @see #getBuild_id()
	 * @generated
	 */

	void setBuild_id(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_Enabled()
	 * @model
	 * @generated
	 */

	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#isEnabled <em>Enabled</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */

	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Jdk Name</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdk Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdk Name</em>' attribute.
	 * @see #setJdkName(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_JdkName()
	 * @model
	 * @generated
	 */

	String getJdkName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getJdkName <em>Jdk Name</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdk Name</em>' attribute.
	 * @see #getJdkName()
	 * @generated
	 */

	void setJdkName(String value);

	/**
	 * Returns the value of the '<em><b>User Deploy Job Name</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Deploy Job Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Deploy Job Name</em>' attribute.
	 * @see #setUserDeployJobName(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_UserDeployJobName()
	 * @model
	 * @generated
	 */

	String getUserDeployJobName();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployJobName <em>User Deploy Job Name</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Deploy Job Name</em>' attribute.
	 * @see #getUserDeployJobName()
	 * @generated
	 */

	void setUserDeployJobName(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_Users()
	 * @model containment="true"
	 * @generated
	 */

	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>User Deploy Server Url</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Deploy Server Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Deploy Server Url</em>' attribute.
	 * @see #setUserDeployServerUrl(String)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_UserDeployServerUrl()
	 * @model
	 * @generated
	 */

	String getUserDeployServerUrl();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getUserDeployServerUrl <em>User Deploy Server Url</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Deploy Server Url</em>' attribute.
	 * @see #getUserDeployServerUrl()
	 * @generated
	 */

	void setUserDeployServerUrl(String value);

	/**
	 * Returns the value of the '<em><b>Generation Location</b></em>' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Location</em>' containment reference.
	 * @see #setGenerationLocation(GenerationLocation)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_GenerationLocation()
	 * @model containment="true"
	 * @generated
	 */

	GenerationLocation getGenerationLocation();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment#getGenerationLocation <em>Generation Location</em>}' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Location</em>' containment reference.
	 * @see #getGenerationLocation()
	 * @generated
	 */

	void setGenerationLocation(GenerationLocation value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage#getHudsonDeployment_Triggers()
	 * @model containment="true"
	 * @generated
	 */

	EList<Trigger> getTriggers();

} // HudsonDeployment
