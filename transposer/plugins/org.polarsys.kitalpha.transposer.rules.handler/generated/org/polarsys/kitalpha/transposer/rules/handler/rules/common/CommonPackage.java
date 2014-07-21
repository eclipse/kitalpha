/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/transposer/rules/common"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extended Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__EXTENDED_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Extenders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__EXTENDERS = 2;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OWNED_PACKAGES = 3;

	/**
	 * The feature id for the '<em><b>Owned Mapping Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OWNED_MAPPING_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Owned Domain Helper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OWNED_DOMAIN_HELPER = 5;

	/**
	 * The feature id for the '<em><b>Domain Helper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DOMAIN_HELPER = 6;

	/**
	 * The feature id for the '<em><b>All Owned Mapping Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ALL_OWNED_MAPPING_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PURPOSE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Complete Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COMPLETE_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ID = 11;

	/**
	 * The feature id for the '<em><b>Owned Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OWNED_CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONTEXT = 13;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PRIVATE = 14;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl <em>Mapping Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMappingPackage()
	 * @generated
	 */
	int MAPPING_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PACKAGE__OWNED_PACKAGES = 0;

	/**
	 * The feature id for the '<em><b>Owned Mapping Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PACKAGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>All Mapping Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PACKAGE__ALL_MAPPING_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Mapping Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl <em>Mapping Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMappingElement()
	 * @generated
	 */
	int MAPPING_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Default Possibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Default Possibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__DEFAULT_POSSIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Owned Possibilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__OWNED_POSSIBILITIES = 2;

	/**
	 * The feature id for the '<em><b>All Possibilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__ALL_POSSIBILITIES = 3;

	/**
	 * The feature id for the '<em><b>Domain Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__DOMAIN_META_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Extended Mapping Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Reuse Super Possibilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES = 6;

	/**
	 * The feature id for the '<em><b>Reuse Super Default Possibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY = 7;

	/**
	 * The feature id for the '<em><b>Extenders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__EXTENDERS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT__NAME = 9;

	/**
	 * The number of structural features of the '<em>Mapping Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ELEMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl <em>Mapping Possibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMappingPossibility()
	 * @generated
	 */
	int MAPPING_POSSIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_POSSIBILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_POSSIBILITY__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Complete Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_POSSIBILITY__COMPLETE_RULE = 2;

	/**
	 * The feature id for the '<em><b>Incomplete Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_POSSIBILITY__INCOMPLETE_RULE = 3;

	/**
	 * The number of structural features of the '<em>Mapping Possibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_POSSIBILITY_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtendedMapping <em>Extended Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Mapping</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtendedMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_ExtendedMapping();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtenders <em>Extenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extenders</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getExtenders()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Extenders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Packages</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedPackages()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_OwnedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedMappingElements <em>Owned Mapping Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Mapping Elements</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedMappingElements()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_OwnedMappingElements();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedDomainHelper <em>Owned Domain Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owned Domain Helper</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedDomainHelper()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_OwnedDomainHelper();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDomainHelper <em>Domain Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Helper</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDomainHelper()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_DomainHelper();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getAllOwnedMappingElements <em>All Owned Mapping Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Owned Mapping Elements</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getAllOwnedMappingElements()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_AllOwnedMappingElements();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purpose</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getPurpose()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getDescription()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getCompleteDescription <em>Complete Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Description</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getCompleteDescription()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_CompleteDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getId()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedContext <em>Owned Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owned Context</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getOwnedContext()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_OwnedContext();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#getContext()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping#isPrivate()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Private();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage <em>Mapping Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Package</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage
	 * @generated
	 */
	EClass getMappingPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Packages</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getOwnedPackages()
	 * @see #getMappingPackage()
	 * @generated
	 */
	EReference getMappingPackage_OwnedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getOwnedMappingElements <em>Owned Mapping Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Mapping Elements</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getOwnedMappingElements()
	 * @see #getMappingPackage()
	 * @generated
	 */
	EReference getMappingPackage_OwnedMappingElements();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getName()
	 * @see #getMappingPackage()
	 * @generated
	 */
	EAttribute getMappingPackage_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getAllMappingElements <em>All Mapping Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Mapping Elements</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage#getAllMappingElements()
	 * @see #getMappingPackage()
	 * @generated
	 */
	EReference getMappingPackage_AllMappingElements();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement <em>Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Element</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement
	 * @generated
	 */
	EClass getMappingElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedDefaultPossibility <em>Owned Default Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Default Possibility</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedDefaultPossibility()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_OwnedDefaultPossibility();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDefaultPossibility <em>Default Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Possibility</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDefaultPossibility()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_DefaultPossibility();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedPossibilities <em>Owned Possibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Possibilities</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getOwnedPossibilities()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_OwnedPossibilities();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getAllPossibilities <em>All Possibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Possibilities</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getAllPossibilities()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_AllPossibilities();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDomainMetaClass <em>Domain Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Meta Class</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getDomainMetaClass()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_DomainMetaClass();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtendedMappingElement <em>Extended Mapping Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Mapping Element</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtendedMappingElement()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_ExtendedMappingElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperPossibilities <em>Reuse Super Possibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reuse Super Possibilities</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperPossibilities()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_ReuseSuperPossibilities();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperDefaultPossibility <em>Reuse Super Default Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reuse Super Default Possibility</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#isReuseSuperDefaultPossibility()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_ReuseSuperDefaultPossibility();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtenders <em>Extenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extenders</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getExtenders()
	 * @see #getMappingElement()
	 * @generated
	 */
	EReference getMappingElement_Extenders();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement#getName()
	 * @see #getMappingElement()
	 * @generated
	 */
	EAttribute getMappingElement_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility <em>Mapping Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Possibility</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility
	 * @generated
	 */
	EClass getMappingPossibility();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getName()
	 * @see #getMappingPossibility()
	 * @generated
	 */
	EAttribute getMappingPossibility_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getContext()
	 * @see #getMappingPossibility()
	 * @generated
	 */
	EAttribute getMappingPossibility_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getCompleteRule <em>Complete Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Rule</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getCompleteRule()
	 * @see #getMappingPossibility()
	 * @generated
	 */
	EAttribute getMappingPossibility_CompleteRule();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getIncompleteRule <em>Incomplete Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incomplete Rule</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getIncompleteRule()
	 * @see #getMappingPossibility()
	 * @generated
	 */
	EAttribute getMappingPossibility_IncompleteRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Extended Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__EXTENDED_MAPPING = eINSTANCE.getMapping_ExtendedMapping();

		/**
		 * The meta object literal for the '<em><b>Extenders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__EXTENDERS = eINSTANCE.getMapping_Extenders();

		/**
		 * The meta object literal for the '<em><b>Owned Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__OWNED_PACKAGES = eINSTANCE.getMapping_OwnedPackages();

		/**
		 * The meta object literal for the '<em><b>Owned Mapping Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__OWNED_MAPPING_ELEMENTS = eINSTANCE.getMapping_OwnedMappingElements();

		/**
		 * The meta object literal for the '<em><b>Owned Domain Helper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__OWNED_DOMAIN_HELPER = eINSTANCE.getMapping_OwnedDomainHelper();

		/**
		 * The meta object literal for the '<em><b>Domain Helper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__DOMAIN_HELPER = eINSTANCE.getMapping_DomainHelper();

		/**
		 * The meta object literal for the '<em><b>All Owned Mapping Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ALL_OWNED_MAPPING_ELEMENTS = eINSTANCE.getMapping_AllOwnedMappingElements();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PURPOSE = eINSTANCE.getMapping_Purpose();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__DESCRIPTION = eINSTANCE.getMapping_Description();

		/**
		 * The meta object literal for the '<em><b>Complete Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__COMPLETE_DESCRIPTION = eINSTANCE.getMapping_CompleteDescription();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__ID = eINSTANCE.getMapping_Id();

		/**
		 * The meta object literal for the '<em><b>Owned Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__OWNED_CONTEXT = eINSTANCE.getMapping_OwnedContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__CONTEXT = eINSTANCE.getMapping_Context();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__PRIVATE = eINSTANCE.getMapping_Private();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl <em>Mapping Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPackageImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMappingPackage()
		 * @generated
		 */
		EClass MAPPING_PACKAGE = eINSTANCE.getMappingPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PACKAGE__OWNED_PACKAGES = eINSTANCE.getMappingPackage_OwnedPackages();

		/**
		 * The meta object literal for the '<em><b>Owned Mapping Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PACKAGE__OWNED_MAPPING_ELEMENTS = eINSTANCE.getMappingPackage_OwnedMappingElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_PACKAGE__NAME = eINSTANCE.getMappingPackage_Name();

		/**
		 * The meta object literal for the '<em><b>All Mapping Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PACKAGE__ALL_MAPPING_ELEMENTS = eINSTANCE.getMappingPackage_AllMappingElements();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl <em>Mapping Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingElementImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMappingElement()
		 * @generated
		 */
		EClass MAPPING_ELEMENT = eINSTANCE.getMappingElement();

		/**
		 * The meta object literal for the '<em><b>Owned Default Possibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__OWNED_DEFAULT_POSSIBILITY = eINSTANCE.getMappingElement_OwnedDefaultPossibility();

		/**
		 * The meta object literal for the '<em><b>Default Possibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__DEFAULT_POSSIBILITY = eINSTANCE.getMappingElement_DefaultPossibility();

		/**
		 * The meta object literal for the '<em><b>Owned Possibilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__OWNED_POSSIBILITIES = eINSTANCE.getMappingElement_OwnedPossibilities();

		/**
		 * The meta object literal for the '<em><b>All Possibilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__ALL_POSSIBILITIES = eINSTANCE.getMappingElement_AllPossibilities();

		/**
		 * The meta object literal for the '<em><b>Domain Meta Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__DOMAIN_META_CLASS = eINSTANCE.getMappingElement_DomainMetaClass();

		/**
		 * The meta object literal for the '<em><b>Extended Mapping Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__EXTENDED_MAPPING_ELEMENT = eINSTANCE.getMappingElement_ExtendedMappingElement();

		/**
		 * The meta object literal for the '<em><b>Reuse Super Possibilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__REUSE_SUPER_POSSIBILITIES = eINSTANCE.getMappingElement_ReuseSuperPossibilities();

		/**
		 * The meta object literal for the '<em><b>Reuse Super Default Possibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__REUSE_SUPER_DEFAULT_POSSIBILITY = eINSTANCE.getMappingElement_ReuseSuperDefaultPossibility();

		/**
		 * The meta object literal for the '<em><b>Extenders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ELEMENT__EXTENDERS = eINSTANCE.getMappingElement_Extenders();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ELEMENT__NAME = eINSTANCE.getMappingElement_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl <em>Mapping Possibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.CommonPackageImpl#getMappingPossibility()
		 * @generated
		 */
		EClass MAPPING_POSSIBILITY = eINSTANCE.getMappingPossibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_POSSIBILITY__NAME = eINSTANCE.getMappingPossibility_Name();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_POSSIBILITY__CONTEXT = eINSTANCE.getMappingPossibility_Context();

		/**
		 * The meta object literal for the '<em><b>Complete Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_POSSIBILITY__COMPLETE_RULE = eINSTANCE.getMappingPossibility_CompleteRule();

		/**
		 * The meta object literal for the '<em><b>Incomplete Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_POSSIBILITY__INCOMPLETE_RULE = eINSTANCE.getMappingPossibility_IncompleteRule();

	}

} //CommonPackage
