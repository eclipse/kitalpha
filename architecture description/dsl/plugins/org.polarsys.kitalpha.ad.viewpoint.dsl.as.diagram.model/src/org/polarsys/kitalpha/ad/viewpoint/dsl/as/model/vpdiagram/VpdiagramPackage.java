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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramFactory
 * @model kind="package"
 * @generated
 */
public interface VpdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vpdiagram"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdiagram/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vpdiagram"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VpdiagramPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramRepresentationImpl <em>Diagram Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramRepresentationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramRepresentation()
	 * @generated
	 */
	int DIAGRAM_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_REPRESENTATION__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_REPRESENTATION__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_REPRESENTATION__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>The Mapping Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_REPRESENTATION__THE_MAPPING_SET = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Action Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_REPRESENTATION__THE_ACTION_SET = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_REPRESENTATION_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ID = DIAGRAM_REPRESENTATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = DIAGRAM_REPRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESCRIPTION = DIAGRAM_REPRESENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>The Mapping Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__THE_MAPPING_SET = DIAGRAM_REPRESENTATION__THE_MAPPING_SET;

	/**
	 * The feature id for the '<em><b>The Action Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__THE_ACTION_SET = DIAGRAM_REPRESENTATION__THE_ACTION_SET;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__THE_DOMAIN = DIAGRAM_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = DIAGRAM_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramExtensionImpl <em>Diagram Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramExtensionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramExtension()
	 * @generated
	 */
	int DIAGRAM_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__ID = DIAGRAM_REPRESENTATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__NAME = DIAGRAM_REPRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__DESCRIPTION = DIAGRAM_REPRESENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>The Mapping Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__THE_MAPPING_SET = DIAGRAM_REPRESENTATION__THE_MAPPING_SET;

	/**
	 * The feature id for the '<em><b>The Action Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__THE_ACTION_SET = DIAGRAM_REPRESENTATION__THE_ACTION_SET;

	/**
	 * The feature id for the '<em><b>Extented diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__EXTENTED_DIAGRAM = DIAGRAM_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Customizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS = DIAGRAM_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EXTENSION_FEATURE_COUNT = DIAGRAM_REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionSetImpl <em>Action Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getActionSet()
	 * @generated
	 */
	int ACTION_SET = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Open Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__OPEN_ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Action Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.MappingSetImpl <em>Mapping Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.MappingSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getMappingSet()
	 * @generated
	 */
	int MAPPING_SET = 4;

	/**
	 * The feature id for the '<em><b>Diagram Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SET__DIAGRAM_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOOL_FOR = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PRECONDITION = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramChildrenImpl <em>Diagram Children</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramChildrenImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramChildren()
	 * @generated
	 */
	int DIAGRAM_CHILDREN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CHILDREN__ID = DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CHILDREN__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CHILDREN__DESCRIPTION = DIAGRAM_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Diagram Children</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CHILDREN_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = DIAGRAM_CHILDREN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = DIAGRAM_CHILDREN__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = DIAGRAM_CHILDREN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__THE_DOMAIN = DIAGRAM_CHILDREN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STYLE = DIAGRAM_CHILDREN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IMPORTS = DIAGRAM_CHILDREN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = DIAGRAM_CHILDREN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_CHILDREN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractEdgeImpl <em>Abstract Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractEdgeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractEdge()
	 * @generated
	 */
	int ABSTRACT_EDGE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__ID = DIAGRAM_CHILDREN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__NAME = DIAGRAM_CHILDREN__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__DESCRIPTION = DIAGRAM_CHILDREN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Edescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE__EDESCRIPTION = DIAGRAM_CHILDREN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EDGE_FEATURE_COUNT = DIAGRAM_CHILDREN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = ABSTRACT_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = ABSTRACT_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESCRIPTION = ABSTRACT_EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Edescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDESCRIPTION = ABSTRACT_EDGE__EDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = ABSTRACT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = ABSTRACT_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__THE_DOMAIN = ABSTRACT_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = ABSTRACT_EDGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.CreateImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TOOL_FOR = ACTION__TOOL_FOR;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__LABEL = ACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__PRECONDITION = ACTION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ICON = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DeleteImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TOOL_FOR = ACTION__TOOL_FOR;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__LABEL = ACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PRECONDITION = ACTION__PRECONDITION;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl <em>Open Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getOpenAction()
	 * @generated
	 */
	int OPEN_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION__ID = VpdescPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION__NAME = VpdescPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION__DESCRIPTION = VpdescPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION__LABEL = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION__PRECONDITION = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION__ICON = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Open Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACTION_FEATURE_COUNT = VpdescPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ReconnectEdgeImpl <em>Reconnect Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ReconnectEdgeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getReconnectEdge()
	 * @generated
	 */
	int RECONNECT_EDGE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE__TOOL_FOR = ACTION__TOOL_FOR;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE__LABEL = ACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE__PRECONDITION = ACTION__PRECONDITION;

	/**
	 * The number of structural features of the '<em>Reconnect Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNECT_EDGE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DropImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__TOOL_FOR = ACTION__TOOL_FOR;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__LABEL = ACTION__LABEL;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__PRECONDITION = ACTION__PRECONDITION;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.LabelImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 14;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BOLD = 1;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ITALIC = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = 4;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImportImpl <em>Edge Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImportImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeImport()
	 * @generated
	 */
	int EDGE_IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_IMPORT__ID = ABSTRACT_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_IMPORT__NAME = ABSTRACT_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_IMPORT__DESCRIPTION = ABSTRACT_EDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Edescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_IMPORT__EDESCRIPTION = ABSTRACT_EDGE__EDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_IMPORT__IMPORTS = ABSTRACT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_IMPORT_FEATURE_COUNT = ABSTRACT_EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl <em>Edge Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeDescription()
	 * @generated
	 */
	int EDGE_DESCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DESCRIPTION__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Begin Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DESCRIPTION__BEGIN_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Center label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DESCRIPTION__CENTER_LABEL = 2;

	/**
	 * The feature id for the '<em><b>End label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DESCRIPTION__END_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DESCRIPTION__CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Edge Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDescriptionImpl <em>Abstract Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDescriptionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractDescription()
	 * @generated
	 */
	int ABSTRACT_DESCRIPTION = 30;

	/**
	 * The feature id for the '<em><b>Node Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DESCRIPTION__NODE_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DESCRIPTION__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Abstract Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl <em>Node Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNodeDescription()
	 * @generated
	 */
	int NODE_DESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Node Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTION__NODE_LABEL = ABSTRACT_DESCRIPTION__NODE_LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTION__CONDITION = ABSTRACT_DESCRIPTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTION__STYLE = ABSTRACT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTION__LABEL_POSITION = ABSTRACT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTION__LABEL_ALIGNEMENT = ABSTRACT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DESCRIPTION_FEATURE_COUNT = ABSTRACT_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeStyle()
	 * @generated
	 */
	int EDGE_STYLE = 18;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__LINE_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Begin Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__BEGIN_DECORATOR = 1;

	/**
	 * The feature id for the '<em><b>End Decorator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__END_DECORATOR = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__COLOR = 3;

	/**
	 * The number of structural features of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeStyleImpl <em>Abstract Node Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractNodeStyle()
	 * @generated
	 */
	int ABSTRACT_NODE_STYLE = 21;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE__BORDER_COLOR = 0;

	/**
	 * The number of structural features of the '<em>Abstract Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BasicStyleImpl <em>Basic Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BasicStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getBasicStyle()
	 * @generated
	 */
	int BASIC_STYLE = 19;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_STYLE__BORDER_COLOR = ABSTRACT_NODE_STYLE__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_STYLE__BACKGROUND_COLOR = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_STYLE__FORM = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_STYLE_FEATURE_COUNT = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainAssociationImpl <em>Edge Domain Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainAssociationImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeDomainAssociation()
	 * @generated
	 */
	int EDGE_DOMAIN_ASSOCIATION = 34;

	/**
	 * The feature id for the '<em><b>Target Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR = 0;

	/**
	 * The feature id for the '<em><b>Target query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY = 1;

	/**
	 * The number of structural features of the '<em>Edge Domain Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl <em>Edge Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeDomainElement()
	 * @generated
	 */
	int EDGE_DOMAIN_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Target Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ELEMENT__TARGET_LOCATOR = EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR;

	/**
	 * The feature id for the '<em><b>Target query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ELEMENT__TARGET_QUERY = EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY;

	/**
	 * The feature id for the '<em><b>Source Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR = EDGE_DOMAIN_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ELEMENT__THE_DOMAIN = EDGE_DOMAIN_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ELEMENT__SOURCE_QUERY = EDGE_DOMAIN_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DOMAIN_ELEMENT_FEATURE_COUNT = EDGE_DOMAIN_ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ImageStyleImpl <em>Image Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ImageStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getImageStyle()
	 * @generated
	 */
	int IMAGE_STYLE = 22;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__BORDER_COLOR = ABSTRACT_NODE_STYLE__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE__IMAGE_PATH = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STYLE_FEATURE_COUNT = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramStyleImpl <em>Histogram Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getHistogramStyle()
	 * @generated
	 */
	int HISTOGRAM_STYLE = 23;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_STYLE__BORDER_COLOR = ABSTRACT_NODE_STYLE__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_STYLE__SECTIONS = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Histogram Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_STYLE_FEATURE_COUNT = ABSTRACT_NODE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl <em>Histogram Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getHistogramSection()
	 * @generated
	 */
	int HISTOGRAM_SECTION = 24;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SECTION__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SECTION__MAX_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SECTION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SECTION__BACKGROUND_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Forground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SECTION__FORGROUND_COLOR = 4;

	/**
	 * The number of structural features of the '<em>Histogram Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SECTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = DIAGRAM_CHILDREN__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = DIAGRAM_CHILDREN__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = DIAGRAM_CHILDREN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__THE_DOMAIN = DIAGRAM_CHILDREN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STYLE = DIAGRAM_CHILDREN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMPORTS = DIAGRAM_CHILDREN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = DIAGRAM_CHILDREN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENT_LAYOUT = DIAGRAM_CHILDREN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = DIAGRAM_CHILDREN_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerDescriptionImpl <em>Container Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerDescriptionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getContainerDescription()
	 * @generated
	 */
	int CONTAINER_DESCRIPTION = 26;

	/**
	 * The feature id for the '<em><b>Node Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DESCRIPTION__NODE_LABEL = ABSTRACT_DESCRIPTION__NODE_LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DESCRIPTION__CONDITION = ABSTRACT_DESCRIPTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DESCRIPTION__STYLE = ABSTRACT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DESCRIPTION_FEATURE_COUNT = ABSTRACT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractContainerStyleImpl <em>Abstract Container Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractContainerStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractContainerStyle()
	 * @generated
	 */
	int ABSTRACT_CONTAINER_STYLE = 35;

	/**
	 * The number of structural features of the '<em>Abstract Container Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_STYLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl <em>Flat Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getFlatStyle()
	 * @generated
	 */
	int FLAT_STYLE = 27;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_STYLE__BACKGROUND_COLOR = ABSTRACT_CONTAINER_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_STYLE__FORGROUND_COLOR = ABSTRACT_CONTAINER_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_STYLE__BORDER_COLOR = ABSTRACT_CONTAINER_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_STYLE__BACKGROUND_STYLE = ABSTRACT_CONTAINER_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flat Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_STYLE_FEATURE_COUNT = ABSTRACT_CONTAINER_STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 37;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__THE_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl <em>Bordered Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getBorderedNode()
	 * @generated
	 */
	int BORDERED_NODE = 28;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE__THE_DOMAIN = ABSTRACT_NODE__THE_DOMAIN;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE__ID = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE__NAME = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE__DESCRIPTION = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE__IMPORTS = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE__STYLE = ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bordered Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ConditionImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 32;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl <em>Node Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNodeDomainElement()
	 * @generated
	 */
	int NODE_DOMAIN_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOMAIN_ELEMENT__DOMAIN_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Chlidren list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOMAIN_ELEMENT__CHLIDREN_LIST = 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOMAIN_ELEMENT__QUERY = 2;

	/**
	 * The number of structural features of the '<em>Node Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOMAIN_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerChildrenImpl <em>Container Children</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerChildrenImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getContainerChildren()
	 * @generated
	 */
	int CONTAINER_CHILDREN = 36;

	/**
	 * The feature id for the '<em><b>Owned nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CHILDREN__OWNED_NODES = 0;

	/**
	 * The feature id for the '<em><b>Reused nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CHILDREN__REUSED_NODES = 1;

	/**
	 * The number of structural features of the '<em>Container Children</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CHILDREN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeChildrenImpl <em>Node Children</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeChildrenImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNodeChildren()
	 * @generated
	 */
	int NODE_CHILDREN = 38;

	/**
	 * The feature id for the '<em><b>Owned boderednodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CHILDREN__OWNED_BODEREDNODES = 0;

	/**
	 * The feature id for the '<em><b>Reused boderednodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CHILDREN__REUSED_BODEREDNODES = 1;

	/**
	 * The number of structural features of the '<em>Node Children</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CHILDREN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DomainContainerImpl <em>Domain Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DomainContainerImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDomainContainer()
	 * @generated
	 */
	int DOMAIN_CONTAINER = 39;

	/**
	 * The feature id for the '<em><b>The domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTAINER__THE_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Domain Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl <em>Diagram Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramSet()
	 * @generated
	 */
	int DIAGRAM_SET = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET__ID = VpdescPackage.ASPECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET__NAME = VpdescPackage.ASPECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET__DESCRIPTION = VpdescPackage.ASPECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET__DIAGRAMS = VpdescPackage.ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional External Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP = VpdescPackage.ASPECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional External Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA = VpdescPackage.ASPECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SET_FEATURE_COUNT = VpdescPackage.ASPECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form <em>Node Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNode_Form()
	 * @generated
	 */
	int NODE_FORM = 41;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation <em>Diagram Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Representation</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation
	 * @generated
	 */
	EClass getDiagramRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_MappingSet <em>The Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Mapping Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_MappingSet()
	 * @see #getDiagramRepresentation()
	 * @generated
	 */
	EReference getDiagramRepresentation_The_MappingSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_ActionSet <em>The Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Action Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation#getThe_ActionSet()
	 * @see #getDiagramRepresentation()
	 * @generated
	 */
	EReference getDiagramRepresentation_The_ActionSet();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram#getThe_domain <em>The domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The domain</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram#getThe_domain()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_The_domain();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension <em>Diagram Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Extension</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension
	 * @generated
	 */
	EClass getDiagramExtension();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getExtented_diagram <em>Extented diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extented diagram</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getExtented_diagram()
	 * @see #getDiagramExtension()
	 * @generated
	 */
	EReference getDiagramExtension_Extented_diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getOwnedCustomizations <em>Owned Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Customizations</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension#getOwnedCustomizations()
	 * @see #getDiagramExtension()
	 * @generated
	 */
	EReference getDiagramExtension_OwnedCustomizations();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet <em>Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet
	 * @generated
	 */
	EClass getActionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet#getActions()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet#getOpenActions <em>Open Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Open Actions</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet#getOpenActions()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_OpenActions();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet <em>Mapping Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet
	 * @generated
	 */
	EClass getMappingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet#getDiagram_Elements <em>Diagram Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Elements</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet#getDiagram_Elements()
	 * @see #getMappingSet()
	 * @generated
	 */
	EReference getMappingSet_Diagram_Elements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action#getTool_For <em>Tool For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool For</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action#getTool_For()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Tool_For();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action#getLabel()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Action#getPrecondition()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Precondition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node#getStyle()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Style();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imports</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node#getImports()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge#getThe_domain <em>The domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The domain</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge#getThe_domain()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_The_domain();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramChildren <em>Diagram Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Children</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramChildren
	 * @generated
	 */
	EClass getDiagramChildren();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create#getIcon()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Icon();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction <em>Open Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Action</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction
	 * @generated
	 */
	EClass getOpenAction();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction#getLabel()
	 * @see #getOpenAction()
	 * @generated
	 */
	EAttribute getOpenAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction#getPrecondition()
	 * @see #getOpenAction()
	 * @generated
	 */
	EAttribute getOpenAction_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction#getIcon()
	 * @see #getOpenAction()
	 * @generated
	 */
	EAttribute getOpenAction_Icon();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge <em>Reconnect Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconnect Edge</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge
	 * @generated
	 */
	EClass getReconnectEdge();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#getSize()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#isBold()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#isItalic()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Italic();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#getValue()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport <em>Edge Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Import</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport
	 * @generated
	 */
	EClass getEdgeImport();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imports</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport#getImports()
	 * @see #getEdgeImport()
	 * @generated
	 */
	EReference getEdgeImport_Imports();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription <em>Edge Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription
	 * @generated
	 */
	EClass getEdgeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getStyle()
	 * @see #getEdgeDescription()
	 * @generated
	 */
	EReference getEdgeDescription_Style();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getBegin_Label <em>Begin Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin Label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getBegin_Label()
	 * @see #getEdgeDescription()
	 * @generated
	 */
	EReference getEdgeDescription_Begin_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getCenter_label <em>Center label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getCenter_label()
	 * @see #getEdgeDescription()
	 * @generated
	 */
	EReference getEdgeDescription_Center_label();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getEnd_label <em>End label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getEnd_label()
	 * @see #getEdgeDescription()
	 * @generated
	 */
	EReference getEdgeDescription_End_label();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription#getCondition()
	 * @see #getEdgeDescription()
	 * @generated
	 */
	EReference getEdgeDescription_Condition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription <em>Node Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription
	 * @generated
	 */
	EClass getNodeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getStyle()
	 * @see #getNodeDescription()
	 * @generated
	 */
	EReference getNodeDescription_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_position <em>Label position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label position</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_position()
	 * @see #getNodeDescription()
	 * @generated
	 */
	EAttribute getNodeDescription_Label_position();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_alignement <em>Label alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label alignement</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription#getLabel_alignement()
	 * @see #getNodeDescription()
	 * @generated
	 */
	EAttribute getNodeDescription_Label_alignement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle <em>Edge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle
	 * @generated
	 */
	EClass getEdgeStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getLineStyle()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_LineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getBeginDecorator <em>Begin Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Decorator</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getBeginDecorator()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_BeginDecorator();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getEndDecorator <em>End Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Decorator</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getEndDecorator()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_EndDecorator();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle#getColor()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Color();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle <em>Basic Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle
	 * @generated
	 */
	EClass getBasicStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle#getBackgroundColor()
	 * @see #getBasicStyle()
	 * @generated
	 */
	EAttribute getBasicStyle_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle#getForm()
	 * @see #getBasicStyle()
	 * @generated
	 */
	EAttribute getBasicStyle_Form();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement <em>Edge Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Domain Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement
	 * @generated
	 */
	EClass getEdgeDomainElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_Locator <em>Source Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Locator</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_Locator()
	 * @see #getEdgeDomainElement()
	 * @generated
	 */
	EReference getEdgeDomainElement_Source_Locator();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getThe_Domain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Domain</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getThe_Domain()
	 * @see #getEdgeDomainElement()
	 * @generated
	 */
	EReference getEdgeDomainElement_The_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_query <em>Source query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source query</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement#getSource_query()
	 * @see #getEdgeDomainElement()
	 * @generated
	 */
	EAttribute getEdgeDomainElement_Source_query();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle <em>Abstract Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle
	 * @generated
	 */
	EClass getAbstractNodeStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNodeStyle#getBorderColor()
	 * @see #getAbstractNodeStyle()
	 * @generated
	 */
	EAttribute getAbstractNodeStyle_BorderColor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle <em>Image Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle
	 * @generated
	 */
	EClass getImageStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle#getImagePath()
	 * @see #getImageStyle()
	 * @generated
	 */
	EAttribute getImageStyle_ImagePath();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle <em>Histogram Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle
	 * @generated
	 */
	EClass getHistogramStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle#getSections()
	 * @see #getHistogramStyle()
	 * @generated
	 */
	EReference getHistogramStyle_Sections();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection <em>Histogram Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram Section</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection
	 * @generated
	 */
	EClass getHistogramSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMinValue()
	 * @see #getHistogramSection()
	 * @generated
	 */
	EReference getHistogramSection_MinValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getMaxValue()
	 * @see #getHistogramSection()
	 * @generated
	 */
	EReference getHistogramSection_MaxValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getValue()
	 * @see #getHistogramSection()
	 * @generated
	 */
	EReference getHistogramSection_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getBackgroundColor()
	 * @see #getHistogramSection()
	 * @generated
	 */
	EAttribute getHistogramSection_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getForgroundColor <em>Forground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forground Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection#getForgroundColor()
	 * @see #getHistogramSection()
	 * @generated
	 */
	EAttribute getHistogramSection_ForgroundColor();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getStyle()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Style();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imports</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getImports()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getChildren()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getContentLayout <em>Content Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Layout</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container#getContentLayout()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ContentLayout();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription <em>Container Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription
	 * @generated
	 */
	EClass getContainerDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription#getStyle()
	 * @see #getContainerDescription()
	 * @generated
	 */
	EReference getContainerDescription_Style();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle <em>Flat Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle
	 * @generated
	 */
	EClass getFlatStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundColor()
	 * @see #getFlatStyle()
	 * @generated
	 */
	EAttribute getFlatStyle_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getForgroundColor <em>Forground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forground Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getForgroundColor()
	 * @see #getFlatStyle()
	 * @generated
	 */
	EAttribute getFlatStyle_ForgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBorderColor()
	 * @see #getFlatStyle()
	 * @generated
	 */
	EAttribute getFlatStyle_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundStyle <em>Background Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle#getBackgroundStyle()
	 * @see #getFlatStyle()
	 * @generated
	 */
	EAttribute getFlatStyle_BackgroundStyle();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode <em>Bordered Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bordered Node</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode
	 * @generated
	 */
	EClass getBorderedNode();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imports</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode#getImports()
	 * @see #getBorderedNode()
	 * @generated
	 */
	EReference getBorderedNode_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode#getStyle()
	 * @see #getBorderedNode()
	 * @generated
	 */
	EReference getBorderedNode_Style();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription <em>Abstract Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Description</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription
	 * @generated
	 */
	EClass getAbstractDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getNode_Label <em>Node Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Label</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getNode_Label()
	 * @see #getAbstractDescription()
	 * @generated
	 */
	EReference getAbstractDescription_Node_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription#getCondition()
	 * @see #getAbstractDescription()
	 * @generated
	 */
	EReference getAbstractDescription_Condition();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge <em>Abstract Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Edge</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge
	 * @generated
	 */
	EClass getAbstractEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge#getE_description <em>Edescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edescription</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractEdge#getE_description()
	 * @see #getAbstractEdge()
	 * @generated
	 */
	EReference getAbstractEdge_E_description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement <em>Node Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Domain Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement
	 * @generated
	 */
	EClass getNodeDomainElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement#getDomain_Class <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Class</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement#getDomain_Class()
	 * @see #getNodeDomainElement()
	 * @generated
	 */
	EReference getNodeDomainElement_Domain_Class();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement#getChlidren_list <em>Chlidren list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chlidren list</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement#getChlidren_list()
	 * @see #getNodeDomainElement()
	 * @generated
	 */
	EReference getNodeDomainElement_Chlidren_list();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement#getQuery()
	 * @see #getNodeDomainElement()
	 * @generated
	 */
	EAttribute getNodeDomainElement_Query();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation <em>Edge Domain Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Domain Association</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation
	 * @generated
	 */
	EClass getEdgeDomainAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation#getTarget_Locator <em>Target Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Locator</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation#getTarget_Locator()
	 * @see #getEdgeDomainAssociation()
	 * @generated
	 */
	EReference getEdgeDomainAssociation_Target_Locator();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation#getTarget_query <em>Target query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target query</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation#getTarget_query()
	 * @see #getEdgeDomainAssociation()
	 * @generated
	 */
	EAttribute getEdgeDomainAssociation_Target_query();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractContainerStyle <em>Abstract Container Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Container Style</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractContainerStyle
	 * @generated
	 */
	EClass getAbstractContainerStyle();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren <em>Container Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Children</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren
	 * @generated
	 */
	EClass getContainerChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren#getOwned_nodes <em>Owned nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned nodes</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren#getOwned_nodes()
	 * @see #getContainerChildren()
	 * @generated
	 */
	EReference getContainerChildren_Owned_nodes();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren#getReused_nodes <em>Reused nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reused nodes</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren#getReused_nodes()
	 * @see #getContainerChildren()
	 * @generated
	 */
	EReference getContainerChildren_Reused_nodes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode#getThe_domain <em>The domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The domain</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode#getThe_domain()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_The_domain();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren <em>Node Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Children</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren
	 * @generated
	 */
	EClass getNodeChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren#getOwned_boderednodes <em>Owned boderednodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned boderednodes</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren#getOwned_boderednodes()
	 * @see #getNodeChildren()
	 * @generated
	 */
	EReference getNodeChildren_Owned_boderednodes();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren#getReused_boderednodes <em>Reused boderednodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reused boderednodes</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren#getReused_boderednodes()
	 * @see #getNodeChildren()
	 * @generated
	 */
	EReference getNodeChildren_Reused_boderednodes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer <em>Domain Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Container</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer
	 * @generated
	 */
	EClass getDomainContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer#getThe_domain <em>The domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The domain</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer#getThe_domain()
	 * @see #getDomainContainer()
	 * @generated
	 */
	EReference getDomainContainer_The_domain();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet <em>Diagram Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet
	 * @generated
	 */
	EClass getDiagramSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getDiagrams()
	 * @see #getDiagramSet()
	 * @generated
	 */
	EReference getDiagramSet_Diagrams();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getAdditionalExternalGroup <em>Additional External Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional External Group</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getAdditionalExternalGroup()
	 * @see #getDiagramSet()
	 * @generated
	 */
	EReference getDiagramSet_AdditionalExternalGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getAdditionalExternalData <em>Additional External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional External Data</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet#getAdditionalExternalData()
	 * @see #getDiagramSet()
	 * @generated
	 */
	EReference getDiagramSet_AdditionalExternalData();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form <em>Node Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Form</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form
	 * @generated
	 */
	EEnum getNode_Form();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VpdiagramFactory getVpdiagramFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramRepresentationImpl <em>Diagram Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramRepresentationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramRepresentation()
		 * @generated
		 */
		EClass DIAGRAM_REPRESENTATION = eINSTANCE.getDiagramRepresentation();

		/**
		 * The meta object literal for the '<em><b>The Mapping Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_REPRESENTATION__THE_MAPPING_SET = eINSTANCE.getDiagramRepresentation_The_MappingSet();

		/**
		 * The meta object literal for the '<em><b>The Action Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_REPRESENTATION__THE_ACTION_SET = eINSTANCE.getDiagramRepresentation_The_ActionSet();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>The domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__THE_DOMAIN = eINSTANCE.getDiagram_The_domain();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramExtensionImpl <em>Diagram Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramExtensionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramExtension()
		 * @generated
		 */
		EClass DIAGRAM_EXTENSION = eINSTANCE.getDiagramExtension();

		/**
		 * The meta object literal for the '<em><b>Extented diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EXTENSION__EXTENTED_DIAGRAM = eINSTANCE.getDiagramExtension_Extented_diagram();

		/**
		 * The meta object literal for the '<em><b>Owned Customizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS = eINSTANCE.getDiagramExtension_OwnedCustomizations();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionSetImpl <em>Action Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getActionSet()
		 * @generated
		 */
		EClass ACTION_SET = eINSTANCE.getActionSet();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET__ACTIONS = eINSTANCE.getActionSet_Actions();

		/**
		 * The meta object literal for the '<em><b>Open Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET__OPEN_ACTIONS = eINSTANCE.getActionSet_OpenActions();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.MappingSetImpl <em>Mapping Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.MappingSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getMappingSet()
		 * @generated
		 */
		EClass MAPPING_SET = eINSTANCE.getMappingSet();

		/**
		 * The meta object literal for the '<em><b>Diagram Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_SET__DIAGRAM_ELEMENTS = eINSTANCE.getMappingSet_Diagram_Elements();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ActionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Tool For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TOOL_FOR = eINSTANCE.getAction_Tool_For();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__LABEL = eINSTANCE.getAction_Label();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PRECONDITION = eINSTANCE.getAction_Precondition();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__STYLE = eINSTANCE.getNode_Style();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IMPORTS = eINSTANCE.getNode_Imports();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>The domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__THE_DOMAIN = eINSTANCE.getEdge_The_domain();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramChildrenImpl <em>Diagram Children</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramChildrenImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramChildren()
		 * @generated
		 */
		EClass DIAGRAM_CHILDREN = eINSTANCE.getDiagramChildren();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.CreateImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__ICON = eINSTANCE.getCreate_Icon();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DeleteImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl <em>Open Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.OpenActionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getOpenAction()
		 * @generated
		 */
		EClass OPEN_ACTION = eINSTANCE.getOpenAction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ACTION__LABEL = eINSTANCE.getOpenAction_Label();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ACTION__PRECONDITION = eINSTANCE.getOpenAction_Precondition();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_ACTION__ICON = eINSTANCE.getOpenAction_Icon();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ReconnectEdgeImpl <em>Reconnect Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ReconnectEdgeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getReconnectEdge()
		 * @generated
		 */
		EClass RECONNECT_EDGE = eINSTANCE.getReconnectEdge();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DropImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.LabelImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SIZE = eINSTANCE.getLabel_Size();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BOLD = eINSTANCE.getLabel_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ITALIC = eINSTANCE.getLabel_Italic();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__VALUE = eINSTANCE.getLabel_Value();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImportImpl <em>Edge Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeImportImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeImport()
		 * @generated
		 */
		EClass EDGE_IMPORT = eINSTANCE.getEdgeImport();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_IMPORT__IMPORTS = eINSTANCE.getEdgeImport_Imports();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl <em>Edge Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDescriptionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeDescription()
		 * @generated
		 */
		EClass EDGE_DESCRIPTION = eINSTANCE.getEdgeDescription();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DESCRIPTION__STYLE = eINSTANCE.getEdgeDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Begin Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DESCRIPTION__BEGIN_LABEL = eINSTANCE.getEdgeDescription_Begin_Label();

		/**
		 * The meta object literal for the '<em><b>Center label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DESCRIPTION__CENTER_LABEL = eINSTANCE.getEdgeDescription_Center_label();

		/**
		 * The meta object literal for the '<em><b>End label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DESCRIPTION__END_LABEL = eINSTANCE.getEdgeDescription_End_label();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DESCRIPTION__CONDITION = eINSTANCE.getEdgeDescription_Condition();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl <em>Node Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDescriptionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNodeDescription()
		 * @generated
		 */
		EClass NODE_DESCRIPTION = eINSTANCE.getNodeDescription();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DESCRIPTION__STYLE = eINSTANCE.getNodeDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Label position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DESCRIPTION__LABEL_POSITION = eINSTANCE.getNodeDescription_Label_position();

		/**
		 * The meta object literal for the '<em><b>Label alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DESCRIPTION__LABEL_ALIGNEMENT = eINSTANCE.getNodeDescription_Label_alignement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeStyle()
		 * @generated
		 */
		EClass EDGE_STYLE = eINSTANCE.getEdgeStyle();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__LINE_STYLE = eINSTANCE.getEdgeStyle_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Begin Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__BEGIN_DECORATOR = eINSTANCE.getEdgeStyle_BeginDecorator();

		/**
		 * The meta object literal for the '<em><b>End Decorator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__END_DECORATOR = eINSTANCE.getEdgeStyle_EndDecorator();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__COLOR = eINSTANCE.getEdgeStyle_Color();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BasicStyleImpl <em>Basic Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BasicStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getBasicStyle()
		 * @generated
		 */
		EClass BASIC_STYLE = eINSTANCE.getBasicStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_STYLE__BACKGROUND_COLOR = eINSTANCE.getBasicStyle_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_STYLE__FORM = eINSTANCE.getBasicStyle_Form();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl <em>Edge Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeDomainElement()
		 * @generated
		 */
		EClass EDGE_DOMAIN_ELEMENT = eINSTANCE.getEdgeDomainElement();

		/**
		 * The meta object literal for the '<em><b>Source Locator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DOMAIN_ELEMENT__SOURCE_LOCATOR = eINSTANCE.getEdgeDomainElement_Source_Locator();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DOMAIN_ELEMENT__THE_DOMAIN = eINSTANCE.getEdgeDomainElement_The_Domain();

		/**
		 * The meta object literal for the '<em><b>Source query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_DOMAIN_ELEMENT__SOURCE_QUERY = eINSTANCE.getEdgeDomainElement_Source_query();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeStyleImpl <em>Abstract Node Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractNodeStyle()
		 * @generated
		 */
		EClass ABSTRACT_NODE_STYLE = eINSTANCE.getAbstractNodeStyle();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE_STYLE__BORDER_COLOR = eINSTANCE.getAbstractNodeStyle_BorderColor();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ImageStyleImpl <em>Image Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ImageStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getImageStyle()
		 * @generated
		 */
		EClass IMAGE_STYLE = eINSTANCE.getImageStyle();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_STYLE__IMAGE_PATH = eINSTANCE.getImageStyle_ImagePath();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramStyleImpl <em>Histogram Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getHistogramStyle()
		 * @generated
		 */
		EClass HISTOGRAM_STYLE = eINSTANCE.getHistogramStyle();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM_STYLE__SECTIONS = eINSTANCE.getHistogramStyle_Sections();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl <em>Histogram Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.HistogramSectionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getHistogramSection()
		 * @generated
		 */
		EClass HISTOGRAM_SECTION = eINSTANCE.getHistogramSection();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM_SECTION__MIN_VALUE = eINSTANCE.getHistogramSection_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM_SECTION__MAX_VALUE = eINSTANCE.getHistogramSection_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM_SECTION__VALUE = eINSTANCE.getHistogramSection_Value();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_SECTION__BACKGROUND_COLOR = eINSTANCE.getHistogramSection_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Forground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_SECTION__FORGROUND_COLOR = eINSTANCE.getHistogramSection_ForgroundColor();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__STYLE = eINSTANCE.getContainer_Style();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__IMPORTS = eINSTANCE.getContainer_Imports();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CHILDREN = eINSTANCE.getContainer_Children();

		/**
		 * The meta object literal for the '<em><b>Content Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONTENT_LAYOUT = eINSTANCE.getContainer_ContentLayout();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerDescriptionImpl <em>Container Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerDescriptionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getContainerDescription()
		 * @generated
		 */
		EClass CONTAINER_DESCRIPTION = eINSTANCE.getContainerDescription();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DESCRIPTION__STYLE = eINSTANCE.getContainerDescription_Style();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl <em>Flat Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.FlatStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getFlatStyle()
		 * @generated
		 */
		EClass FLAT_STYLE = eINSTANCE.getFlatStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_STYLE__BACKGROUND_COLOR = eINSTANCE.getFlatStyle_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Forground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_STYLE__FORGROUND_COLOR = eINSTANCE.getFlatStyle_ForgroundColor();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_STYLE__BORDER_COLOR = eINSTANCE.getFlatStyle_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Background Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_STYLE__BACKGROUND_STYLE = eINSTANCE.getFlatStyle_BackgroundStyle();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl <em>Bordered Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.BorderedNodeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getBorderedNode()
		 * @generated
		 */
		EClass BORDERED_NODE = eINSTANCE.getBorderedNode();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDERED_NODE__IMPORTS = eINSTANCE.getBorderedNode_Imports();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDERED_NODE__STYLE = eINSTANCE.getBorderedNode_Style();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDescriptionImpl <em>Abstract Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractDescriptionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractDescription()
		 * @generated
		 */
		EClass ABSTRACT_DESCRIPTION = eINSTANCE.getAbstractDescription();

		/**
		 * The meta object literal for the '<em><b>Node Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DESCRIPTION__NODE_LABEL = eINSTANCE.getAbstractDescription_Node_Label();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DESCRIPTION__CONDITION = eINSTANCE.getAbstractDescription_Condition();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractEdgeImpl <em>Abstract Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractEdgeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractEdge()
		 * @generated
		 */
		EClass ABSTRACT_EDGE = eINSTANCE.getAbstractEdge();

		/**
		 * The meta object literal for the '<em><b>Edescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EDGE__EDESCRIPTION = eINSTANCE.getAbstractEdge_E_description();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ConditionImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl <em>Node Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeDomainElementImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNodeDomainElement()
		 * @generated
		 */
		EClass NODE_DOMAIN_ELEMENT = eINSTANCE.getNodeDomainElement();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DOMAIN_ELEMENT__DOMAIN_CLASS = eINSTANCE.getNodeDomainElement_Domain_Class();

		/**
		 * The meta object literal for the '<em><b>Chlidren list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DOMAIN_ELEMENT__CHLIDREN_LIST = eINSTANCE.getNodeDomainElement_Chlidren_list();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DOMAIN_ELEMENT__QUERY = eINSTANCE.getNodeDomainElement_Query();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainAssociationImpl <em>Edge Domain Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.EdgeDomainAssociationImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getEdgeDomainAssociation()
		 * @generated
		 */
		EClass EDGE_DOMAIN_ASSOCIATION = eINSTANCE.getEdgeDomainAssociation();

		/**
		 * The meta object literal for the '<em><b>Target Locator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_DOMAIN_ASSOCIATION__TARGET_LOCATOR = eINSTANCE.getEdgeDomainAssociation_Target_Locator();

		/**
		 * The meta object literal for the '<em><b>Target query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_DOMAIN_ASSOCIATION__TARGET_QUERY = eINSTANCE.getEdgeDomainAssociation_Target_query();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractContainerStyleImpl <em>Abstract Container Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractContainerStyleImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractContainerStyle()
		 * @generated
		 */
		EClass ABSTRACT_CONTAINER_STYLE = eINSTANCE.getAbstractContainerStyle();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerChildrenImpl <em>Container Children</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.ContainerChildrenImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getContainerChildren()
		 * @generated
		 */
		EClass CONTAINER_CHILDREN = eINSTANCE.getContainerChildren();

		/**
		 * The meta object literal for the '<em><b>Owned nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CHILDREN__OWNED_NODES = eINSTANCE.getContainerChildren_Owned_nodes();

		/**
		 * The meta object literal for the '<em><b>Reused nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CHILDREN__REUSED_NODES = eINSTANCE.getContainerChildren_Reused_nodes();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.AbstractNodeImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>The domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__THE_DOMAIN = eINSTANCE.getAbstractNode_The_domain();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeChildrenImpl <em>Node Children</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.NodeChildrenImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNodeChildren()
		 * @generated
		 */
		EClass NODE_CHILDREN = eINSTANCE.getNodeChildren();

		/**
		 * The meta object literal for the '<em><b>Owned boderednodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CHILDREN__OWNED_BODEREDNODES = eINSTANCE.getNodeChildren_Owned_boderednodes();

		/**
		 * The meta object literal for the '<em><b>Reused boderednodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CHILDREN__REUSED_BODEREDNODES = eINSTANCE.getNodeChildren_Reused_boderednodes();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DomainContainerImpl <em>Domain Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DomainContainerImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDomainContainer()
		 * @generated
		 */
		EClass DOMAIN_CONTAINER = eINSTANCE.getDomainContainer();

		/**
		 * The meta object literal for the '<em><b>The domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONTAINER__THE_DOMAIN = eINSTANCE.getDomainContainer_The_domain();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl <em>Diagram Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.DiagramSetImpl
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getDiagramSet()
		 * @generated
		 */
		EClass DIAGRAM_SET = eINSTANCE.getDiagramSet();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_SET__DIAGRAMS = eINSTANCE.getDiagramSet_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Additional External Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP = eINSTANCE.getDiagramSet_AdditionalExternalGroup();

		/**
		 * The meta object literal for the '<em><b>Additional External Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA = eINSTANCE.getDiagramSet_AdditionalExternalData();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form <em>Node Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node_Form
		 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.VpdiagramPackageImpl#getNode_Form()
		 * @generated
		 */
		EEnum NODE_FORM = eINSTANCE.getNode_Form();

	}

} //VpdiagramPackage
