/**
 * ******************************************************************************
 *  Copyright (c) 2016-2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
	 * The feature id for the '<em><b>Viewpoint References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VIEWPOINT_REFERENCES = METADATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Metadata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ADDITIONAL_METADATA = METADATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = METADATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = METADATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl <em>Viewpoint Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getViewpointReference()
	 * @generated
	 */
	int VIEWPOINT_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_REFERENCE__ID = METADATA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Vp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_REFERENCE__VP_ID = METADATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_REFERENCE__VERSION = METADATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_REFERENCE__INACTIVE = METADATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Viewpoint Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_REFERENCE_FEATURE_COUNT = METADATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Viewpoint Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_REFERENCE_OPERATION_COUNT = METADATA_ELEMENT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getViewpointReferences <em>Viewpoint References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewpoint References</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getViewpointReferences()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ViewpointReferences();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getAdditionalMetadata <em>Additional Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additional Metadata</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.Metadata#getAdditionalMetadata()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_AdditionalMetadata();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference <em>Viewpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint Reference</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference
	 * @generated
	 */
	EClass getViewpointReference();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVpId <em>Vp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vp Id</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVpId()
	 * @see #getViewpointReference()
	 * @generated
	 */
	EAttribute getViewpointReference_VpId();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#getVersion()
	 * @see #getViewpointReference()
	 * @generated
	 */
	EAttribute getViewpointReference_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#isInactive <em>Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive</em>'.
	 * @see org.polarsys.kitalpha.ad.metadata.metadata.ViewpointReference#isInactive()
	 * @see #getViewpointReference()
	 * @generated
	 */
	EAttribute getViewpointReference_Inactive();

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
		 * The meta object literal for the '<em><b>Viewpoint References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__VIEWPOINT_REFERENCES = eINSTANCE.getMetadata_ViewpointReferences();

		/**
		 * The meta object literal for the '<em><b>Additional Metadata</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ADDITIONAL_METADATA = eINSTANCE.getMetadata_AdditionalMetadata();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl <em>Viewpoint Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.ViewpointReferenceImpl
		 * @see org.polarsys.kitalpha.ad.metadata.metadata.impl.MetadataPackageImpl#getViewpointReference()
		 * @generated
		 */
		EClass VIEWPOINT_REFERENCE = eINSTANCE.getViewpointReference();

		/**
		 * The meta object literal for the '<em><b>Vp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_REFERENCE__VP_ID = eINSTANCE.getViewpointReference_VpId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_REFERENCE__VERSION = eINSTANCE.getViewpointReference_Version();

		/**
		 * The meta object literal for the '<em><b>Inactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWPOINT_REFERENCE__INACTIVE = eINSTANCE.getViewpointReference_Inactive();

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
