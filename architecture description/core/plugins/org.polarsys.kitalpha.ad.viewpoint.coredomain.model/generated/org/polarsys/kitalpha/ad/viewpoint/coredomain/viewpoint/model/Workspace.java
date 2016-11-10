/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getRuleSets <em>Rule Sets</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getServiceSets <em>Service Sets</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getActiveViewpoints <em>Active Viewpoints</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getPropertySets <em>Property Sets</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {





	/**
	 * Returns the value of the '<em><b>Rule Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Sets</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getWorkspace_RuleSets()
	 * @model containment="true"
	 * @generated
	 */

	EList<RuleSet> getRuleSets();







	/**
	 * Returns the value of the '<em><b>Service Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Sets</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getWorkspace_ServiceSets()
	 * @model containment="true"
	 * @generated
	 */

	EList<ServiceSet> getServiceSets();







	/**
	 * Returns the value of the '<em><b>Active Viewpoints</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Viewpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Viewpoints</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getWorkspace_ActiveViewpoints()
	 * @model
	 * @generated
	 */

	EList<Viewpoint> getActiveViewpoints();







	/**
	 * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Sets</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getWorkspace_PropertySets()
	 * @model containment="true"
	 * @generated
	 */

	EList<PropertySet> getPropertySets();






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vpRequired="true"
	 * @generated
	 */

	RuleSet getRuleSet(Viewpoint vp);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vpRequired="true"
	 * @generated
	 */

	ServiceSet getServiceSet(Viewpoint vp);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vpRequired="true"
	 * @generated
	 */

	PropertySet getPropertySet(Viewpoint vp);




} // Workspace
