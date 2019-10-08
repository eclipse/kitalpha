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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

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
 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ToolsFactory
 * @model kind="package"
 * @generated
 */
public interface ToolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/tools/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolsPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.impl.ToolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement <em>Viewpoint Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.impl.ToolsPackageImpl#getViewpointElement()
	 * @generated
	 */
	int VIEWPOINT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT__NAME = ViewpointPackage.NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT__DESCRIPTION = ViewpointPackage.NAME_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT__ID = ViewpointPackage.NAME_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vpid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT__VPID = ViewpointPackage.NAME_ELEMENT__VPID;

	/**
	 * The number of structural features of the '<em>Viewpoint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT_FEATURE_COUNT = ViewpointPackage.NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet <em>Viewpoint Element Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.impl.ToolsPackageImpl#getViewpointElementSet()
	 * @generated
	 */
	int VIEWPOINT_ELEMENT_SET = 1;

	/**
	 * The number of structural features of the '<em>Viewpoint Element Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_ELEMENT_SET_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement <em>Viewpoint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Element</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement
	 * @generated
	 */
	EClass getViewpointElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet <em>Viewpoint Element Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Element Set</em>'.
	 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet
	 * @generated
	 */
	EClass getViewpointElementSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolsFactory getToolsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement <em>Viewpoint Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.impl.ToolsPackageImpl#getViewpointElement()
		 * @generated
		 */
		EClass VIEWPOINT_ELEMENT = eINSTANCE.getViewpointElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet <em>Viewpoint Element Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet
		 * @see org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.impl.ToolsPackageImpl#getViewpointElementSet()
		 * @generated
		 */
		EClass VIEWPOINT_ELEMENT_SET = eINSTANCE.getViewpointElementSet();

	}

} //ToolsPackage
