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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesFactory
 * @model kind="package"
 * @generated
 */
public interface VpservicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpservices"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpservices/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpservices"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpservicesPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleSetImpl <em>Rule Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getRuleSet()
	 * @generated
	 */
	int RULE_SET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vp Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__VP_RULES = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceSetImpl <em>Service Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getServiceSet()
	 * @generated
	 */
	int SERVICE_SET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vp Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__VP_SERVICES = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.AbstractServicesElementImpl <em>Abstract Services Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.AbstractServicesElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getAbstractServicesElement()
	 * @generated
	 */
	int ABSTRACT_SERVICES_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICES_ELEMENT__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICES_ELEMENT__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICES_ELEMENT__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICES_ELEMENT__VPID = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Services Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = ABSTRACT_SERVICES_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = ABSTRACT_SERVICES_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = ABSTRACT_SERVICES_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VPID = ABSTRACT_SERVICES_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CLASS = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = ABSTRACT_SERVICES_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = ABSTRACT_SERVICES_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = ABSTRACT_SERVICES_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VPID = ABSTRACT_SERVICES_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Related Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RELATED_RULES = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertySetImpl <em>Property Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertySetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getPropertySet()
	 * @generated
	 */
	int PROPERTY_SET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vp Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__VP_PROPERTIES = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertyImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = ABSTRACT_SERVICES_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ABSTRACT_SERVICES_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = ABSTRACT_SERVICES_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VPID = ABSTRACT_SERVICES_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ABSTRACT_SERVICES_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types <em>Rules Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getRules_Types()
	 * @generated
	 */
	int RULES_TYPES = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet
	 * @generated
	 */
	EClass getRuleSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet#getVpRules <em>Vp Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vp Rules</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet#getVpRules()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_VpRules();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet <em>Service Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet
	 * @generated
	 */
	EClass getServiceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet#getVpServices <em>Vp Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vp Services</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet#getVpServices()
	 * @see #getServiceSet()
	 * @generated
	 */
	EReference getServiceSet_VpServices();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement <em>Abstract Services Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Services Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement
	 * @generated
	 */
	EClass getAbstractServicesElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement#getVpid <em>Vpid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpid</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.AbstractServicesElement#getVpid()
	 * @see #getAbstractServicesElement()
	 * @generated
	 */
	EAttribute getAbstractServicesElement_Vpid();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getType()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule#getClass_()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service#getRelatedRules <em>Related Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Rules</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Service#getRelatedRules()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RelatedRules();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet
	 * @generated
	 */
	EClass getPropertySet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet#getVpProperties <em>Vp Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vp Properties</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertySet#getVpProperties()
	 * @see #getPropertySet()
	 * @generated
	 */
	EReference getPropertySet_VpProperties();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types <em>Rules Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rules Types</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types
	 * @generated
	 */
	EEnum getRules_Types();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpservicesFactory getVpservicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleSetImpl <em>Rule Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getRuleSet()
		 * @generated
		 */
		EClass RULE_SET = eINSTANCE.getRuleSet();

		/**
		 * The meta object literal for the '<em><b>Vp Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__VP_RULES = eINSTANCE.getRuleSet_VpRules();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceSetImpl <em>Service Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getServiceSet()
		 * @generated
		 */
		EClass SERVICE_SET = eINSTANCE.getServiceSet();

		/**
		 * The meta object literal for the '<em><b>Vp Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SET__VP_SERVICES = eINSTANCE.getServiceSet_VpServices();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.AbstractServicesElementImpl <em>Abstract Services Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.AbstractServicesElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getAbstractServicesElement()
		 * @generated
		 */
		EClass ABSTRACT_SERVICES_ELEMENT = eINSTANCE.getAbstractServicesElement();

		/**
		 * The meta object literal for the '<em><b>Vpid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SERVICES_ELEMENT__VPID = eINSTANCE.getAbstractServicesElement_Vpid();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.RuleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE = eINSTANCE.getRule_Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CLASS = eINSTANCE.getRule_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.ServiceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Related Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__RELATED_RULES = eINSTANCE.getService_RelatedRules();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertySetImpl <em>Property Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertySetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getPropertySet()
		 * @generated
		 */
		EClass PROPERTY_SET = eINSTANCE.getPropertySet();

		/**
		 * The meta object literal for the '<em><b>Vp Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SET__VP_PROPERTIES = eINSTANCE.getPropertySet_VpProperties();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.PropertyImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types <em>Rules Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rules_Types
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getRules_Types()
		 * @generated
		 */
		EEnum RULES_TYPES = eINSTANCE.getRules_Types();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.PropertyType
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.impl.VpservicesPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

	}

} //VpservicesPackage
