/**
 * ******************************************************************************
 *  Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 * *******************************************************************************
 * 
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.metadata.metadata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory
 * @model kind="package"
 * @generated
 */
public interface MetadataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metadata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/metadata/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metadata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetadataPackage eINSTANCE = org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataElementImpl
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getMetadataElement()
	 * @generated
	 */
	int METADATA_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ID = METADATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Viewpoint Usages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VIEWPOINT_USAGES = METADATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = METADATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = METADATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl <em>Viewpoint Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getViewpointUsage()
	 * @generated
	 */
	int VIEWPOINT_USAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_USAGE__ID = METADATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_USAGE__VP_ID = METADATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_USAGE__VERSION = METADATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_USAGE__FILTERED = METADATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Viewpoint Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_USAGE_FEATURE_COUNT = METADATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Viewpoint Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_USAGE_OPERATION_COUNT = METADATA_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Version
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 3;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getViewpointUsages <em>Viewpoint Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewpoint Usages</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getViewpointUsages()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ViewpointUsages();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage <em>Viewpoint Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Usage</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage
	 * @generated
	 */
	EClass getViewpointUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVpId <em>Vp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vp Id</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVpId()
	 * @see #getViewpointUsage()
	 * @generated
	 */
	EAttribute getViewpointUsage_VpId();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#getVersion()
	 * @see #getViewpointUsage()
	 * @generated
	 */
	EAttribute getViewpointUsage_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#isFiltered <em>Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtered</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointUsage#isFiltered()
	 * @see #getViewpointUsage()
	 * @generated
	 */
	EAttribute getViewpointUsage_Filtered();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.metadata.metadata.MetadataElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataElement
	 * @generated
	 */
	EClass getMetadataElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.MetadataElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.MetadataElement#getId()
	 * @see #getMetadataElement()
	 * @generated
	 */
	EAttribute getMetadataElement_Id();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetadataFactory getMetadataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataImpl
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Viewpoint Usages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__VIEWPOINT_USAGES = eINSTANCE.getMetadata_ViewpointUsages();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl <em>Viewpoint Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointUsageImpl
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getViewpointUsage()
		 * @generated
		 */
		EClass VIEWPOINT_USAGE = eINSTANCE.getViewpointUsage();

		/**
		 * The meta object literal for the '<em><b>Vp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_USAGE__VP_ID = eINSTANCE.getViewpointUsage_VpId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_USAGE__VERSION = eINSTANCE.getViewpointUsage_Version();

		/**
		 * The meta object literal for the '<em><b>Filtered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_USAGE__FILTERED = eINSTANCE.getViewpointUsage_Filtered();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataElementImpl
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getMetadataElement()
		 * @generated
		 */
		EClass METADATA_ELEMENT = eINSTANCE.getMetadataElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_ELEMENT__ID = eINSTANCE.getMetadataElement_Id();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Version
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //MetadataPackage
