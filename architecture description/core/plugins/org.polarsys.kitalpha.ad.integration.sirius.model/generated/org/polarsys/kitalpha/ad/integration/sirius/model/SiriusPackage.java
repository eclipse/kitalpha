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
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.polarsys.kitalpha.ad.integration.sirius.model.SiriusFactory
 * @model kind="package"
 * @generated
 */
public interface SiriusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sirius";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/ad/sirius/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sirius";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiriusPackage eINSTANCE = org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusRepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusRepresentationImpl
	 * @see org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusPackageImpl#getSiriusRepresentation()
	 * @generated
	 */
	int SIRIUS_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Odesign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_REPRESENTATION__ODESIGN = ViewpointPackage.REPRESENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_REPRESENTATION_FEATURE_COUNT = ViewpointPackage.REPRESENTATION_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation
	 * @generated
	 */
	EClass getSiriusRepresentation();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation#getOdesign <em>Odesign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Odesign</em>'.
	 * @see org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation#getOdesign()
	 * @see #getSiriusRepresentation()
	 * @generated
	 */
	EReference getSiriusRepresentation_Odesign();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SiriusFactory getSiriusFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusRepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusRepresentationImpl
		 * @see org.polarsys.kitalpha.ad.integration.sirius.model.impl.SiriusPackageImpl#getSiriusRepresentation()
		 * @generated
		 */
		EClass SIRIUS_REPRESENTATION = eINSTANCE.getSiriusRepresentation();

		/**
		 * The meta object literal for the '<em><b>Odesign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIRIUS_REPRESENTATION__ODESIGN = eINSTANCE.getSiriusRepresentation_Odesign();

	}

} //SiriusPackage
