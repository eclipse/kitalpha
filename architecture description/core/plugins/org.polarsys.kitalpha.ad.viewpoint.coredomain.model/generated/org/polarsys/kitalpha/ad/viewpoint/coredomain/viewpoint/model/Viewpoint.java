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
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getServiceSet <em>Service Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getPropertySet <em>Property Set</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getParents <em>Parents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends NameElement {





	/**
	 * Returns the value of the '<em><b>Rule Set</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set</em>' containment reference.
	 * @see #setRuleSet(RuleSet)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_RuleSet()
	 * @model containment="true"
	 * @generated
	 */

	RuleSet getRuleSet();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRuleSet <em>Rule Set</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set</em>' containment reference.
	 * @see #getRuleSet()
	 * @generated
	 */

	void setRuleSet(RuleSet value);







	/**
	 * Returns the value of the '<em><b>Service Set</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Set</em>' containment reference.
	 * @see #setServiceSet(ServiceSet)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_ServiceSet()
	 * @model containment="true"
	 * @generated
	 */

	ServiceSet getServiceSet();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getServiceSet <em>Service Set</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Set</em>' containment reference.
	 * @see #getServiceSet()
	 * @generated
	 */

	void setServiceSet(ServiceSet value);







	/**
	 * Returns the value of the '<em><b>Property Set</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Set</em>' containment reference.
	 * @see #setPropertySet(PropertySet)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_PropertySet()
	 * @model containment="true"
	 * @generated
	 */

	PropertySet getPropertySet();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getPropertySet <em>Property Set</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Set</em>' containment reference.
	 * @see #getPropertySet()
	 * @generated
	 */

	void setPropertySet(PropertySet value);







	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_Parents()
	 * @model
	 * @generated
	 */

	EList<Viewpoint> getParents();







	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_Dependencies()
	 * @model
	 * @generated
	 */

	EList<Viewpoint> getDependencies();







	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_Abstract()
	 * @model
	 * @generated
	 */

	boolean isAbstract();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#isAbstract <em>Abstract</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */

	void setAbstract(boolean value);







	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' containment reference.
	 * @see #setMetamodel(Metamodel)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_Metamodel()
	 * @model containment="true"
	 * @generated
	 */

	Metamodel getMetamodel();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getMetamodel <em>Metamodel</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' containment reference.
	 * @see #getMetamodel()
	 * @generated
	 */

	void setMetamodel(Metamodel value);







	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(Representation)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_Representation()
	 * @model containment="true"
	 * @generated
	 */

	Representation getRepresentation();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRepresentation <em>Representation</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */

	void setRepresentation(Representation value);






	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage#getViewpoint_Version()
	 * @model dataType="org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Version"
	 * @generated
	 */

	Version getVersion();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getVersion <em>Version</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */

	void setVersion(Version value);




	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */

	Property getProperty(String id);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */

	EList<Property> getProperties();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */

	Service getService(String id);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */

	EList<Service> getServices();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */

	Rule getRule(String id);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */

	EList<Rule> getRules();





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */

	Property getPropertyByName(String name);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */

	EList<Viewpoint> getAllParents();




} // Viewpoint
