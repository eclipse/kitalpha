/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory
 * @model kind="package"
 * @generated
 */
public interface VpdescPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpdesc"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdesc/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpdesc"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpdescPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointElementImpl <em>Viewpoint Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpointElement()
	 * @generated
	 */
	int VIEWPOINT_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Viewpoint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = VIEWPOINT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = VIEWPOINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = VIEWPOINT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = VIEWPOINT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ShortNamedElementImpl <em>Short Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ShortNamedElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getShortNamedElement()
	 * @generated
	 */
	int SHORT_NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_ELEMENT__SHORT_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Short Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__ID = SHORT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME = SHORT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__DESCRIPTION = SHORT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__SHORT_NAME = SHORT_NAMED_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>VP Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VP_DATA = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VP Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VP_ASPECTS = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__DEPENDENCIES = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__PARENTS = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Viewpoint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__USE_VIEWPOINT = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Viewpoint Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VIEWPOINT_RESOURCES = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = SHORT_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotatableElementImpl <em>Annotatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotatableElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAnnotatableElement()
	 * @generated
	 */
	int ANNOTATABLE_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATABLE_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATABLE_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getData()
	 * @generated
	 */
	int DATA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = ANNOTATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ANNOTATABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = ANNOTATABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OWNED_ANNOTATIONS = ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>VP Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VP_CLASSES = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VP Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VP_ENUMERATIONS = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional External Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ADDITIONAL_EXTERNAL_DATA = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointClassifierImpl <em>Viewpoint Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointClassifierImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpointClassifier()
	 * @generated
	 */
	int VIEWPOINT_CLASSIFIER = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_CLASSIFIER__ID = ANNOTATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_CLASSIFIER__NAME = ANNOTATABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_CLASSIFIER__DESCRIPTION = ANNOTATABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_CLASSIFIER__OWNED_ANNOTATIONS = ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Viewpoint Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_CLASSIFIER_FEATURE_COUNT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = VIEWPOINT_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = VIEWPOINT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DESCRIPTION = VIEWPOINT_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ANNOTATIONS = VIEWPOINT_CLASSIFIER__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>VP Classes Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VP_CLASSES_ASSOCIATIONS = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VP Class Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VP_CLASS_ATTRIBUTES = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ICON = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inheritences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITENCES = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VP Class Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VP_CLASS_OPERATIONS = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractFeature()
	 * @generated
	 */
	int ABSTRACT_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__ID = ANNOTATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__NAME = ANNOTATABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__DESCRIPTION = ANNOTATABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__OWNED_ANNOTATIONS = ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__CARDINALITY = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__CHANGEABLE = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__DERIVED = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__ORDERED = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__TRANSIENT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__UNIQUE = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__UNSETTABLE = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__VOLATILE = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Abstract Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_FEATURE_COUNT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAssociationImpl <em>Abstract Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractAssociation()
	 * @generated
	 */
	int ABSTRACT_ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__ID = ABSTRACT_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__NAME = ABSTRACT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__DESCRIPTION = ABSTRACT_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__OWNED_ANNOTATIONS = ABSTRACT_FEATURE__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__CARDINALITY = ABSTRACT_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__CHANGEABLE = ABSTRACT_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__DERIVED = ABSTRACT_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__ORDERED = ABSTRACT_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__TRANSIENT = ABSTRACT_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__UNIQUE = ABSTRACT_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__UNSETTABLE = ABSTRACT_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__VOLATILE = ABSTRACT_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION__TYPE = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSOCIATION_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = ABSTRACT_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ABSTRACT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = ABSTRACT_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNED_ANNOTATIONS = ABSTRACT_FEATURE__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CARDINALITY = ABSTRACT_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHANGEABLE = ABSTRACT_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DERIVED = ABSTRACT_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ORDERED = ABSTRACT_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TRANSIENT = ABSTRACT_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNIQUE = ABSTRACT_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNSETTABLE = ABSTRACT_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VOLATILE = ABSTRACT_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ID = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNED_VALUES = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNED_TYPE = ABSTRACT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalClassAssociationImpl <em>Local Class Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalClassAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalClassAssociation()
	 * @generated
	 */
	int LOCAL_CLASS_ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__ID = ABSTRACT_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__NAME = ABSTRACT_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__DESCRIPTION = ABSTRACT_ASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__OWNED_ANNOTATIONS = ABSTRACT_ASSOCIATION__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__CARDINALITY = ABSTRACT_ASSOCIATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__CHANGEABLE = ABSTRACT_ASSOCIATION__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__DERIVED = ABSTRACT_ASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__ORDERED = ABSTRACT_ASSOCIATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__TRANSIENT = ABSTRACT_ASSOCIATION__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__UNIQUE = ABSTRACT_ASSOCIATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__UNSETTABLE = ABSTRACT_ASSOCIATION__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__VOLATILE = ABSTRACT_ASSOCIATION__VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__TYPE = ABSTRACT_ASSOCIATION__TYPE;

	/**
	 * The feature id for the '<em><b>Local Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION__OPPOSITE = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Class Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CLASS_ASSOCIATION_FEATURE_COUNT = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalClassAssociationImpl <em>External Class Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalClassAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalClassAssociation()
	 * @generated
	 */
	int EXTERNAL_CLASS_ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__ID = ABSTRACT_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__NAME = ABSTRACT_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__DESCRIPTION = ABSTRACT_ASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__OWNED_ANNOTATIONS = ABSTRACT_ASSOCIATION__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__CARDINALITY = ABSTRACT_ASSOCIATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__CHANGEABLE = ABSTRACT_ASSOCIATION__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__DERIVED = ABSTRACT_ASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__ORDERED = ABSTRACT_ASSOCIATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__TRANSIENT = ABSTRACT_ASSOCIATION__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__UNIQUE = ABSTRACT_ASSOCIATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__UNSETTABLE = ABSTRACT_ASSOCIATION__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__VOLATILE = ABSTRACT_ASSOCIATION__VOLATILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__TYPE = ABSTRACT_ASSOCIATION__TYPE;

	/**
	 * The feature id for the '<em><b>External Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Class Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CLASS_ASSOCIATION_FEATURE_COUNT = ABSTRACT_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ValueImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = ANNOTATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = ANNOTATABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DESCRIPTION = ANNOTATABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OWNED_ANNOTATIONS = ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__LITERAL = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractSuperClassImpl <em>Abstract Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractSuperClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractSuperClass()
	 * @generated
	 */
	int ABSTRACT_SUPER_CLASS = 13;

	/**
	 * The number of structural features of the '<em>Abstract Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUPER_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalSuperClassImpl <em>Local Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalSuperClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalSuperClass()
	 * @generated
	 */
	int LOCAL_SUPER_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SUPER_CLASS__SUPER_CLASS = ABSTRACT_SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SUPER_CLASS_FEATURE_COUNT = ABSTRACT_SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalSuperClassImpl <em>External Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalSuperClassImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalSuperClass()
	 * @generated
	 */
	int EXTERNAL_SUPER_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SUPER_CLASS__SUPER_CLASS = ABSTRACT_SUPER_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SUPER_CLASS_FEATURE_COUNT = ABSTRACT_SUPER_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.OperationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = ANNOTATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ANNOTATABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = ANNOTATABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_ANNOTATIONS = ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_TYPE = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ParameterImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = ANNOTATABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ANNOTATABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = ANNOTATABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_ANNOTATIONS = ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ANNOTATABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractTypeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__CARDINALITY = 0;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalTypeImpl <em>External Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalTypeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalType()
	 * @generated
	 */
	int EXTERNAL_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__CARDINALITY = ABSTRACT_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE__TYPE = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalTypeImpl <em>Local Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalTypeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalType()
	 * @generated
	 */
	int LOCAL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__CARDINALITY = ABSTRACT_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE__TYPE = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Owned details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNED_DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DetailImpl <em>Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DetailImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getDetail()
	 * @generated
	 */
	int DETAIL = 22;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EnumerationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ID = VIEWPOINT_CLASSIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = VIEWPOINT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = VIEWPOINT_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_ANNOTATIONS = VIEWPOINT_CLASSIFIER__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_VALUES = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = VIEWPOINT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAttributeTypeImpl <em>Abstract Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAttributeTypeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractAttributeType()
	 * @generated
	 */
	int ABSTRACT_ATTRIBUTE_TYPE = 26;

	/**
	 * The number of structural features of the '<em>Abstract Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalAttributeTypeImpl <em>Local Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalAttributeTypeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalAttributeType()
	 * @generated
	 */
	int LOCAL_ATTRIBUTE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ATTRIBUTE_TYPE__TYPE = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalAttributeTypeImpl <em>External Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalAttributeTypeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalAttributeType()
	 * @generated
	 */
	int EXTERNAL_ATTRIBUTE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ATTRIBUTE_TYPE__TYPE = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointResourcesImpl <em>Viewpoint Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointResourcesImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpointResources()
	 * @generated
	 */
	int VIEWPOINT_RESOURCES = 29;

	/**
	 * The feature id for the '<em><b>Use Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_RESOURCES__USE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Viewpoint Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractResourceImpl <em>Abstract Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractResourceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractResource()
	 * @generated
	 */
	int ABSTRACT_RESOURCE = 30;

	/**
	 * The number of structural features of the '<em>Abstract Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EMFResourceImpl <em>EMF Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EMFResourceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getEMFResource()
	 * @generated
	 */
	int EMF_RESOURCE = 31;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_RESOURCE__URI = ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_RESOURCE_FEATURE_COUNT = ABSTRACT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.FileSystemResourceImpl <em>File System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.FileSystemResourceImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getFileSystemResource()
	 * @generated
	 */
	int FILE_SYSTEM_RESOURCE = 32;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_RESOURCE__PATH = ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_RESOURCE__WORKSPACE = ABSTRACT_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_RESOURCE_FEATURE_COUNT = ABSTRACT_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types <em>Association Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAssociation_Types()
	 * @generated
	 */
	int ASSOCIATION_TYPES = 33;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities <em>Cardinalities</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getCardinalities()
	 * @generated
	 */
	int CARDINALITIES = 34;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getVP_Data <em>VP Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VP Data</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getVP_Data()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_VP_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getVP_Aspects <em>VP Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VP Aspects</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getVP_Aspects()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_VP_Aspects();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getDependencies()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Dependencies();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getParents()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Parents();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getUseViewpoint <em>Use Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Viewpoint</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getUseViewpoint()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_UseViewpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getViewpointResources <em>Viewpoint Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Viewpoint Resources</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint#getViewpointResources()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_ViewpointResources();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getVP_Classes <em>VP Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VP Classes</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getVP_Classes()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_VP_Classes();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getAdditionalExternalData <em>Additional External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional External Data</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getAdditionalExternalData()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_AdditionalExternalData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getVP_Enumerations <em>VP Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VP Enumerations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data#getVP_Enumerations()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_VP_Enumerations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getVP_Classes_Associations <em>VP Classes Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VP Classes Associations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getVP_Classes_Associations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_VP_Classes_Associations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getVP_Class_Attributes <em>VP Class Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VP Class Attributes</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getVP_Class_Attributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_VP_Class_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getExtends()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getIcon()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getInheritences <em>Inheritences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inheritences</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getInheritences()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Inheritences();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getVP_Class_Operations <em>VP Class Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VP Class Operations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class#getVP_Class_Operations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_VP_Class_Operations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation <em>Abstract Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation
	 * @generated
	 */
	EClass getAbstractAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation#getType()
	 * @see #getAbstractAssociation()
	 * @generated
	 */
	EAttribute getAbstractAssociation_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute#isIsId <em>Is Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Id</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute#isIsId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute#getOwned_values <em>Owned values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned values</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute#getOwned_values()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owned_values();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute#getOwned_type <em>Owned type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute#getOwned_type()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owned_type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement <em>Short Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Named Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement
	 * @generated
	 */
	EClass getShortNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ShortNamedElement#getShortName()
	 * @see #getShortNamedElement()
	 * @generated
	 */
	EAttribute getShortNamedElement_ShortName();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation <em>Local Class Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Class Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation
	 * @generated
	 */
	EClass getLocalClassAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation#getLocalTarget <em>Local Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Target</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation#getLocalTarget()
	 * @see #getLocalClassAssociation()
	 * @generated
	 */
	EReference getLocalClassAssociation_LocalTarget();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation#getOpposite()
	 * @see #getLocalClassAssociation()
	 * @generated
	 */
	EReference getLocalClassAssociation_Opposite();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation <em>External Class Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Class Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation
	 * @generated
	 */
	EClass getExternalClassAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation#getExternalTarget <em>External Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Target</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation#getExternalTarget()
	 * @see #getExternalClassAssociation()
	 * @generated
	 */
	EReference getExternalClassAssociation_ExternalTarget();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement <em>Viewpoint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement
	 * @generated
	 */
	EClass getViewpointElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement#getId()
	 * @see #getViewpointElement()
	 * @generated
	 */
	EAttribute getViewpointElement_Id();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature
	 * @generated
	 */
	EClass getAbstractFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#getCardinality()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isChangeable()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isDerived()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Derived();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isOrdered()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isTransient()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnique()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnsettable <em>Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isUnsettable()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Unsettable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature#isVolatile()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EAttribute getAbstractFeature_Volatile();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value#getLiteral()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Literal();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass <em>Abstract Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Super Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass
	 * @generated
	 */
	EClass getAbstractSuperClass();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass <em>Local Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Super Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass
	 * @generated
	 */
	EClass getLocalSuperClass();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass#getSuperClass()
	 * @see #getLocalSuperClass()
	 * @generated
	 */
	EReference getLocalSuperClass_SuperClass();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass <em>External Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Super Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass
	 * @generated
	 */
	EClass getExternalSuperClass();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass#getSuperClass()
	 * @see #getExternalSuperClass()
	 * @generated
	 */
	EReference getExternalSuperClass_SuperClass();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation#getOperation_type <em>Operation type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation#getOperation_type()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operation_type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter#getParameter_type <em>Parameter type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter#getParameter_type()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Parameter_type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractType#getCardinality()
	 * @see #getAbstractType()
	 * @generated
	 */
	EAttribute getAbstractType_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType <em>External Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType
	 * @generated
	 */
	EClass getExternalType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType#getType()
	 * @see #getExternalType()
	 * @generated
	 */
	EReference getExternalType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType
	 * @generated
	 */
	EClass getLocalType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType#getType()
	 * @see #getLocalType()
	 * @generated
	 */
	EReference getLocalType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation#getSource()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation#getOwned_details <em>Owned details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned details</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation#getOwned_details()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Owned_details();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail
	 * @generated
	 */
	EClass getDetail();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail#getKey()
	 * @see #getDetail()
	 * @generated
	 */
	EAttribute getDetail_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail#getValue()
	 * @see #getDetail()
	 * @generated
	 */
	EAttribute getDetail_Value();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement <em>Annotatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotatable Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement
	 * @generated
	 */
	EClass getAnnotatableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement#getOwned_annotations <em>Owned annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned annotations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement#getOwned_annotations()
	 * @see #getAnnotatableElement()
	 * @generated
	 */
	EReference getAnnotatableElement_Owned_annotations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier <em>Viewpoint Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Classifier</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier
	 * @generated
	 */
	EClass getViewpointClassifier();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration#getOwnedValues <em>Owned Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Values</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration#getOwnedValues()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_OwnedValues();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType <em>Abstract Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Attribute Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType
	 * @generated
	 */
	EClass getAbstractAttributeType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType <em>Local Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Attribute Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType
	 * @generated
	 */
	EClass getLocalAttributeType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType#getType()
	 * @see #getLocalAttributeType()
	 * @generated
	 */
	EReference getLocalAttributeType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType <em>External Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Attribute Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType
	 * @generated
	 */
	EClass getExternalAttributeType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType#getType()
	 * @see #getExternalAttributeType()
	 * @generated
	 */
	EReference getExternalAttributeType_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources <em>Viewpoint Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Resources</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources
	 * @generated
	 */
	EClass getViewpointResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources#getUseResource <em>Use Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Resource</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointResources#getUseResource()
	 * @see #getViewpointResources()
	 * @generated
	 */
	EReference getViewpointResources_UseResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource <em>Abstract Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Resource</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource
	 * @generated
	 */
	EClass getAbstractResource();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource <em>EMF Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Resource</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource
	 * @generated
	 */
	EClass getEMFResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource#getUri()
	 * @see #getEMFResource()
	 * @generated
	 */
	EAttribute getEMFResource_Uri();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource <em>File System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Resource</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource
	 * @generated
	 */
	EClass getFileSystemResource();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#getPath()
	 * @see #getFileSystemResource()
	 * @generated
	 */
	EAttribute getFileSystemResource_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#isWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workspace</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource#isWorkspace()
	 * @see #getFileSystemResource()
	 * @generated
	 */
	EAttribute getFileSystemResource_Workspace();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types <em>Association Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Types</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types
	 * @generated
	 */
	EEnum getAssociation_Types();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities <em>Cardinalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinalities</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities
	 * @generated
	 */
	EEnum getCardinalities();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpdescFactory getVpdescFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>VP Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__VP_DATA = eINSTANCE.getViewpoint_VP_Data();

		/**
		 * The meta object literal for the '<em><b>VP Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__VP_ASPECTS = eINSTANCE.getViewpoint_VP_Aspects();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__DEPENDENCIES = eINSTANCE.getViewpoint_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__PARENTS = eINSTANCE.getViewpoint_Parents();

		/**
		 * The meta object literal for the '<em><b>Use Viewpoint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__USE_VIEWPOINT = eINSTANCE.getViewpoint_UseViewpoint();

		/**
		 * The meta object literal for the '<em><b>Viewpoint Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__VIEWPOINT_RESOURCES = eINSTANCE.getViewpoint_ViewpointResources();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DataImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>VP Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__VP_CLASSES = eINSTANCE.getData_VP_Classes();

		/**
		 * The meta object literal for the '<em><b>Additional External Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ADDITIONAL_EXTERNAL_DATA = eINSTANCE.getData_AdditionalExternalData();

		/**
		 * The meta object literal for the '<em><b>VP Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__VP_ENUMERATIONS = eINSTANCE.getData_VP_Enumerations();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AspectImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>VP Classes Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__VP_CLASSES_ASSOCIATIONS = eINSTANCE.getClass_VP_Classes_Associations();

		/**
		 * The meta object literal for the '<em><b>VP Class Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__VP_CLASS_ATTRIBUTES = eINSTANCE.getClass_VP_Class_Attributes();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ICON = eINSTANCE.getClass_Icon();

		/**
		 * The meta object literal for the '<em><b>Inheritences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INHERITENCES = eINSTANCE.getClass_Inheritences();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>VP Class Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__VP_CLASS_OPERATIONS = eINSTANCE.getClass_VP_Class_Operations();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAssociationImpl <em>Abstract Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractAssociation()
		 * @generated
		 */
		EClass ABSTRACT_ASSOCIATION = eINSTANCE.getAbstractAssociation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ASSOCIATION__TYPE = eINSTANCE.getAbstractAssociation_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AttributeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ID = eINSTANCE.getAttribute_IsId();

		/**
		 * The meta object literal for the '<em><b>Owned values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNED_VALUES = eINSTANCE.getAttribute_Owned_values();

		/**
		 * The meta object literal for the '<em><b>Owned type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNED_TYPE = eINSTANCE.getAttribute_Owned_type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.NamedElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ShortNamedElementImpl <em>Short Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ShortNamedElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getShortNamedElement()
		 * @generated
		 */
		EClass SHORT_NAMED_ELEMENT = eINSTANCE.getShortNamedElement();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_NAMED_ELEMENT__SHORT_NAME = eINSTANCE.getShortNamedElement_ShortName();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalClassAssociationImpl <em>Local Class Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalClassAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalClassAssociation()
		 * @generated
		 */
		EClass LOCAL_CLASS_ASSOCIATION = eINSTANCE.getLocalClassAssociation();

		/**
		 * The meta object literal for the '<em><b>Local Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLASS_ASSOCIATION__LOCAL_TARGET = eINSTANCE.getLocalClassAssociation_LocalTarget();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CLASS_ASSOCIATION__OPPOSITE = eINSTANCE.getLocalClassAssociation_Opposite();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalClassAssociationImpl <em>External Class Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalClassAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalClassAssociation()
		 * @generated
		 */
		EClass EXTERNAL_CLASS_ASSOCIATION = eINSTANCE.getExternalClassAssociation();

		/**
		 * The meta object literal for the '<em><b>External Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CLASS_ASSOCIATION__EXTERNAL_TARGET = eINSTANCE.getExternalClassAssociation_ExternalTarget();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointElementImpl <em>Viewpoint Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpointElement()
		 * @generated
		 */
		EClass VIEWPOINT_ELEMENT = eINSTANCE.getViewpointElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_ELEMENT__ID = eINSTANCE.getViewpointElement_Id();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractFeatureImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractFeature()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE = eINSTANCE.getAbstractFeature();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__CARDINALITY = eINSTANCE.getAbstractFeature_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__CHANGEABLE = eINSTANCE.getAbstractFeature_Changeable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__DERIVED = eINSTANCE.getAbstractFeature_Derived();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__ORDERED = eINSTANCE.getAbstractFeature_Ordered();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__TRANSIENT = eINSTANCE.getAbstractFeature_Transient();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__UNIQUE = eINSTANCE.getAbstractFeature_Unique();

		/**
		 * The meta object literal for the '<em><b>Unsettable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__UNSETTABLE = eINSTANCE.getAbstractFeature_Unsettable();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE__VOLATILE = eINSTANCE.getAbstractFeature_Volatile();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ValueImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__LITERAL = eINSTANCE.getValue_Literal();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractSuperClassImpl <em>Abstract Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractSuperClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractSuperClass()
		 * @generated
		 */
		EClass ABSTRACT_SUPER_CLASS = eINSTANCE.getAbstractSuperClass();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalSuperClassImpl <em>Local Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalSuperClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalSuperClass()
		 * @generated
		 */
		EClass LOCAL_SUPER_CLASS = eINSTANCE.getLocalSuperClass();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_SUPER_CLASS__SUPER_CLASS = eINSTANCE.getLocalSuperClass_SuperClass();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalSuperClassImpl <em>External Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalSuperClassImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalSuperClass()
		 * @generated
		 */
		EClass EXTERNAL_SUPER_CLASS = eINSTANCE.getExternalSuperClass();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_SUPER_CLASS__SUPER_CLASS = eINSTANCE.getExternalSuperClass_SuperClass();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.OperationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Operation type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATION_TYPE = eINSTANCE.getOperation_Operation_type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ParameterImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_Parameter_type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractTypeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TYPE__CARDINALITY = eINSTANCE.getAbstractType_Cardinality();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalTypeImpl <em>External Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalTypeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalType()
		 * @generated
		 */
		EClass EXTERNAL_TYPE = eINSTANCE.getExternalType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TYPE__TYPE = eINSTANCE.getExternalType_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalTypeImpl <em>Local Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalTypeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalType()
		 * @generated
		 */
		EClass LOCAL_TYPE = eINSTANCE.getLocalType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_TYPE__TYPE = eINSTANCE.getLocalType_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__SOURCE = eINSTANCE.getAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Owned details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__OWNED_DETAILS = eINSTANCE.getAnnotation_Owned_details();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DetailImpl <em>Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.DetailImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getDetail()
		 * @generated
		 */
		EClass DETAIL = eINSTANCE.getDetail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL__KEY = eINSTANCE.getDetail_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL__VALUE = eINSTANCE.getDetail_Value();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotatableElementImpl <em>Annotatable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AnnotatableElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAnnotatableElement()
		 * @generated
		 */
		EClass ANNOTATABLE_ELEMENT = eINSTANCE.getAnnotatableElement();

		/**
		 * The meta object literal for the '<em><b>Owned annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATABLE_ELEMENT__OWNED_ANNOTATIONS = eINSTANCE.getAnnotatableElement_Owned_annotations();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointClassifierImpl <em>Viewpoint Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointClassifierImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpointClassifier()
		 * @generated
		 */
		EClass VIEWPOINT_CLASSIFIER = eINSTANCE.getViewpointClassifier();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EnumerationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Owned Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__OWNED_VALUES = eINSTANCE.getEnumeration_OwnedValues();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAttributeTypeImpl <em>Abstract Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractAttributeTypeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractAttributeType()
		 * @generated
		 */
		EClass ABSTRACT_ATTRIBUTE_TYPE = eINSTANCE.getAbstractAttributeType();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalAttributeTypeImpl <em>Local Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.LocalAttributeTypeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getLocalAttributeType()
		 * @generated
		 */
		EClass LOCAL_ATTRIBUTE_TYPE = eINSTANCE.getLocalAttributeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_ATTRIBUTE_TYPE__TYPE = eINSTANCE.getLocalAttributeType_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalAttributeTypeImpl <em>External Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ExternalAttributeTypeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getExternalAttributeType()
		 * @generated
		 */
		EClass EXTERNAL_ATTRIBUTE_TYPE = eINSTANCE.getExternalAttributeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ATTRIBUTE_TYPE__TYPE = eINSTANCE.getExternalAttributeType_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointResourcesImpl <em>Viewpoint Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.ViewpointResourcesImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getViewpointResources()
		 * @generated
		 */
		EClass VIEWPOINT_RESOURCES = eINSTANCE.getViewpointResources();

		/**
		 * The meta object literal for the '<em><b>Use Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT_RESOURCES__USE_RESOURCE = eINSTANCE.getViewpointResources_UseResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractResourceImpl <em>Abstract Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.AbstractResourceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAbstractResource()
		 * @generated
		 */
		EClass ABSTRACT_RESOURCE = eINSTANCE.getAbstractResource();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EMFResourceImpl <em>EMF Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.EMFResourceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getEMFResource()
		 * @generated
		 */
		EClass EMF_RESOURCE = eINSTANCE.getEMFResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_RESOURCE__URI = eINSTANCE.getEMFResource_Uri();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.FileSystemResourceImpl <em>File System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.FileSystemResourceImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getFileSystemResource()
		 * @generated
		 */
		EClass FILE_SYSTEM_RESOURCE = eINSTANCE.getFileSystemResource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM_RESOURCE__PATH = eINSTANCE.getFileSystemResource_Path();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM_RESOURCE__WORKSPACE = eINSTANCE.getFileSystemResource_Workspace();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types <em>Association Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getAssociation_Types()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPES = eINSTANCE.getAssociation_Types();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities <em>Cardinalities</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.impl.VpdescPackageImpl#getCardinalities()
		 * @generated
		 */
		EEnum CARDINALITIES = eINSTANCE.getCardinalities();

	}

} //VpdescPackage
