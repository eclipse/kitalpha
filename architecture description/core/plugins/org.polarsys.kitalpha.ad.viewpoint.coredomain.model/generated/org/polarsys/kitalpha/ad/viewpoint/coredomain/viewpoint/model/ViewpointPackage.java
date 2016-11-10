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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory
 * @model kind="package"
 * @generated
 */
public interface ViewpointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewpoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewpointPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.NameElementImpl <em>Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.NameElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getNameElement()
	 * @generated
	 */
	int NAME_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__VPID = 3;

	/**
	 * The number of structural features of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__DESCRIPTION = NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__ID = NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VPID = NAME_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Rule Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__RULE_SET = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__SERVICE_SET = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PROPERTY_SET = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PARENTS = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__DEPENDENCIES = NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__ABSTRACT = NAME_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__METAMODEL = NAME_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__REPRESENTATION = NAME_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VERSION = NAME_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VPID = NAME_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LIVE = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IMPLEMENTATION = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONTEXT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LANGUAGE = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE = NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ValidationRuleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getValidationRule()
	 * @generated
	 */
	int VALIDATION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__DESCRIPTION = RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ID = RULE__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__VPID = RULE__VPID;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__LIVE = RULE__LIVE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__IMPLEMENTATION = RULE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__LANGUAGE = RULE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__TYPE = RULE__TYPE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__SEVERITY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__MESSAGE = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ElementSetImpl <em>Element Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ElementSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getElementSet()
	 * @generated
	 */
	int ELEMENT_SET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SET__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SET__DESCRIPTION = NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SET__ID = NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SET__VPID = NAME_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SET__TARGET = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SET_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleSetImpl <em>Rule Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRuleSet()
	 * @generated
	 */
	int RULE_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__NAME = ELEMENT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__DESCRIPTION = ELEMENT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__ID = ELEMENT_SET__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__VPID = ELEMENT_SET__VPID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__TARGET = ELEMENT_SET__TARGET;

	/**
	 * The feature id for the '<em><b>Hidden Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__HIDDEN_RULES = ELEMENT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__NEW_RULES = ELEMENT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_FEATURE_COUNT = ELEMENT_SET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VPID = NAME_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Related Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RELATED_RULES = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceSetImpl <em>Service Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getServiceSet()
	 * @generated
	 */
	int SERVICE_SET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__NAME = ELEMENT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__DESCRIPTION = ELEMENT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__ID = ELEMENT_SET__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__VPID = ELEMENT_SET__VPID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__TARGET = ELEMENT_SET__TARGET;

	/**
	 * The feature id for the '<em><b>Hidden Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__HIDDEN_SERVICES = ELEMENT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET__NEW_SERVICES = ELEMENT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET_FEATURE_COUNT = ELEMENT_SET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertyImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VPID = NAME_ELEMENT__VPID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertySetImpl <em>Property Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertySetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getPropertySet()
	 * @generated
	 */
	int PROPERTY_SET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__NAME = ELEMENT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__DESCRIPTION = ELEMENT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__ID = ELEMENT_SET__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__VPID = ELEMENT_SET__VPID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__TARGET = ELEMENT_SET__TARGET;

	/**
	 * The feature id for the '<em><b>Hidden Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__HIDDEN_PROPERTIES = ELEMENT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET__NEW_PROPERTIES = ELEMENT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SET_FEATURE_COUNT = ELEMENT_SET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 9;

	/**
	 * The feature id for the '<em><b>Rule Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__RULE_SETS = 0;

	/**
	 * The feature id for the '<em><b>Service Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__SERVICE_SETS = 1;

	/**
	 * The feature id for the '<em><b>Active Viewpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ACTIVE_VIEWPOINTS = 2;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PROPERTY_SETS = 3;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.MetamodelImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 11;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__MODELS = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 12;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__REPRESENTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationElementImpl <em>Representation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRepresentationElement()
	 * @generated
	 */
	int REPRESENTATION_ELEMENT = 13;

	/**
	 * The number of structural features of the '<em>Representation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Version
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes <em>Severity Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getSeverityTypes()
	 * @generated
	 */
	int SEVERITY_TYPES = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ContextTypes <em>Context Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ContextTypes
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getContextTypes()
	 * @generated
	 */
	int CONTEXT_TYPES = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Types <em>Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Types
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 16;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement
	 * @generated
	 */
	EClass getNameElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getName()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getDescription()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getId()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getVpid <em>Vpid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpid</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement#getVpid()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Vpid();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRuleSet()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_RuleSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getServiceSet <em>Service Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getServiceSet()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_ServiceSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getPropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getPropertySet()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_PropertySet();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getParents()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Parents();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getDependencies()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#isAbstract()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metamodel</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getMetamodel()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Metamodel();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getRepresentation()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Representation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint#getVersion()
	 * @see #getViewpoint()
	 * @generated
	 */
	EAttribute getViewpoint_Version();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getSeverity()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ValidationRule#getMessage()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Message();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#isLive <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#isLive()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Live();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getImplementation()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getContext()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getLanguage()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule#getType()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet
	 * @generated
	 */
	EClass getRuleSet();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet#getHiddenRules <em>Hidden Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden Rules</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet#getHiddenRules()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_HiddenRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet#getNewRules <em>New Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Rules</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet#getNewRules()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_NewRules();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getRelatedRules <em>Related Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Rules</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getRelatedRules()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RelatedRules();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet <em>Service Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet
	 * @generated
	 */
	EClass getServiceSet();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet#getHiddenServices <em>Hidden Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden Services</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet#getHiddenServices()
	 * @see #getServiceSet()
	 * @generated
	 */
	EReference getServiceSet_HiddenServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet#getNewServices <em>New Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Services</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet#getNewServices()
	 * @see #getServiceSet()
	 * @generated
	 */
	EReference getServiceSet_NewServices();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet
	 * @generated
	 */
	EClass getPropertySet();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet#getHiddenProperties <em>Hidden Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden Properties</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet#getHiddenProperties()
	 * @see #getPropertySet()
	 * @generated
	 */
	EReference getPropertySet_HiddenProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet#getNewProperties <em>New Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Properties</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet#getNewProperties()
	 * @see #getPropertySet()
	 * @generated
	 */
	EReference getPropertySet_NewProperties();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getRuleSets <em>Rule Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Sets</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getRuleSets()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_RuleSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getServiceSets <em>Service Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Sets</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getServiceSets()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_ServiceSets();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getActiveViewpoints <em>Active Viewpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Viewpoints</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getActiveViewpoints()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_ActiveViewpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace#getPropertySets()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_PropertySets();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet <em>Element Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet
	 * @generated
	 */
	EClass getElementSet();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet#getTarget()
	 * @see #getElementSet()
	 * @generated
	 */
	EReference getElementSet_Target();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel#getModels()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Models();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation#getRepresentations()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Representations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement <em>Representation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement
	 * @generated
	 */
	EClass getRepresentationElement();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.osgi.framework.Version
	 * @model instanceClass="org.osgi.framework.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes <em>Severity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Types</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes
	 * @generated
	 */
	EEnum getSeverityTypes();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ContextTypes <em>Context Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Types</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ContextTypes
	 * @generated
	 */
	EEnum getContextTypes();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Types
	 * @generated
	 */
	EEnum getTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewpointFactory getViewpointFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.NameElementImpl <em>Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.NameElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getNameElement()
		 * @generated
		 */
		EClass NAME_ELEMENT = eINSTANCE.getNameElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__NAME = eINSTANCE.getNameElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__DESCRIPTION = eINSTANCE.getNameElement_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__ID = eINSTANCE.getNameElement_Id();

		/**
		 * The meta object literal for the '<em><b>Vpid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__VPID = eINSTANCE.getNameElement_Vpid();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Rule Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__RULE_SET = eINSTANCE.getViewpoint_RuleSet();

		/**
		 * The meta object literal for the '<em><b>Service Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__SERVICE_SET = eINSTANCE.getViewpoint_ServiceSet();

		/**
		 * The meta object literal for the '<em><b>Property Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__PROPERTY_SET = eINSTANCE.getViewpoint_PropertySet();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__PARENTS = eINSTANCE.getViewpoint_Parents();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__DEPENDENCIES = eINSTANCE.getViewpoint_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__ABSTRACT = eINSTANCE.getViewpoint_Abstract();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__METAMODEL = eINSTANCE.getViewpoint_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__REPRESENTATION = eINSTANCE.getViewpoint_Representation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT__VERSION = eINSTANCE.getViewpoint_Version();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ValidationRuleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getValidationRule()
		 * @generated
		 */
		EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__SEVERITY = eINSTANCE.getValidationRule_Severity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__MESSAGE = eINSTANCE.getValidationRule_Message();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Live</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__LIVE = eINSTANCE.getRule_Live();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IMPLEMENTATION = eINSTANCE.getRule_Implementation();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONTEXT = eINSTANCE.getRule_Context();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__LANGUAGE = eINSTANCE.getRule_Language();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE = eINSTANCE.getRule_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleSetImpl <em>Rule Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RuleSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRuleSet()
		 * @generated
		 */
		EClass RULE_SET = eINSTANCE.getRuleSet();

		/**
		 * The meta object literal for the '<em><b>Hidden Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__HIDDEN_RULES = eINSTANCE.getRuleSet_HiddenRules();

		/**
		 * The meta object literal for the '<em><b>New Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__NEW_RULES = eINSTANCE.getRuleSet_NewRules();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getService()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceSetImpl <em>Service Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ServiceSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getServiceSet()
		 * @generated
		 */
		EClass SERVICE_SET = eINSTANCE.getServiceSet();

		/**
		 * The meta object literal for the '<em><b>Hidden Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SET__HIDDEN_SERVICES = eINSTANCE.getServiceSet_HiddenServices();

		/**
		 * The meta object literal for the '<em><b>New Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SET__NEW_SERVICES = eINSTANCE.getServiceSet_NewServices();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertyImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertySetImpl <em>Property Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.PropertySetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getPropertySet()
		 * @generated
		 */
		EClass PROPERTY_SET = eINSTANCE.getPropertySet();

		/**
		 * The meta object literal for the '<em><b>Hidden Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SET__HIDDEN_PROPERTIES = eINSTANCE.getPropertySet_HiddenProperties();

		/**
		 * The meta object literal for the '<em><b>New Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SET__NEW_PROPERTIES = eINSTANCE.getPropertySet_NewProperties();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.WorkspaceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Rule Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__RULE_SETS = eINSTANCE.getWorkspace_RuleSets();

		/**
		 * The meta object literal for the '<em><b>Service Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__SERVICE_SETS = eINSTANCE.getWorkspace_ServiceSets();

		/**
		 * The meta object literal for the '<em><b>Active Viewpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__ACTIVE_VIEWPOINTS = eINSTANCE.getWorkspace_ActiveViewpoints();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__PROPERTY_SETS = eINSTANCE.getWorkspace_PropertySets();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ElementSetImpl <em>Element Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ElementSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getElementSet()
		 * @generated
		 */
		EClass ELEMENT_SET = eINSTANCE.getElementSet();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_SET__TARGET = eINSTANCE.getElementSet_Target();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.MetamodelImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__MODELS = eINSTANCE.getMetamodel_Models();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__REPRESENTATIONS = eINSTANCE.getRepresentation_Representations();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationElementImpl <em>Representation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.RepresentationElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getRepresentationElement()
		 * @generated
		 */
		EClass REPRESENTATION_ELEMENT = eINSTANCE.getRepresentationElement();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Version
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes <em>Severity Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.SeverityTypes
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getSeverityTypes()
		 * @generated
		 */
		EEnum SEVERITY_TYPES = eINSTANCE.getSeverityTypes();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ContextTypes <em>Context Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ContextTypes
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getContextTypes()
		 * @generated
		 */
		EEnum CONTEXT_TYPES = eINSTANCE.getContextTypes();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Types <em>Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Types
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointPackageImpl#getTypes()
		 * @generated
		 */
		EEnum TYPES = eINSTANCE.getTypes();

	}

} //ViewpointPackage
