/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rules"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/transposer/rules"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rules"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl <em>Purpose Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getPurposeRegistry()
	 * @generated
	 */
	int PURPOSE_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Registered Purposes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_REGISTRY__REGISTERED_PURPOSES = 0;

	/**
	 * The feature id for the '<em><b>Contributed Purposes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES = 1;

	/**
	 * The number of structural features of the '<em>Purpose Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_REGISTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 1;

	/**
	 * The meta object id for the '<em>Mapping Possibility Resolution Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getMappingPossibilityResolutionException()
	 * @generated
	 */
	int MAPPING_POSSIBILITY_RESOLUTION_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>Mapping Resolution Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getMappingResolutionException()
	 * @generated
	 */
	int MAPPING_RESOLUTION_EXCEPTION = 3;

	/**
	 * The meta object id for the '<em>Ambiguous Mapping Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getAmbiguousMappingException()
	 * @generated
	 */
	int AMBIGUOUS_MAPPING_EXCEPTION = 4;

	/**
	 * The meta object id for the '<em>Rule Definition Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getRuleDefinitionException()
	 * @generated
	 */
	int RULE_DEFINITION_EXCEPTION = 5;

	/**
	 * The meta object id for the '<em>Rule Execution Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getRuleExecutionException()
	 * @generated
	 */
	int RULE_EXECUTION_EXCEPTION = 6;


	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry <em>Purpose Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose Registry</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry
	 * @generated
	 */
	EClass getPurposeRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry#getRegisteredPurposes <em>Registered Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registered Purposes</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry#getRegisteredPurposes()
	 * @see #getPurposeRegistry()
	 * @generated
	 */
	EReference getPurposeRegistry_RegisteredPurposes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry#getContributedPurposes <em>Contributed Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributed Purposes</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.PurposeRegistry#getContributedPurposes()
	 * @see #getPurposeRegistry()
	 * @generated
	 */
	EReference getPurposeRegistry_ContributedPurposes();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException <em>Mapping Possibility Resolution Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mapping Possibility Resolution Exception</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException"
	 * @generated
	 */
	EDataType getMappingPossibilityResolutionException();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException <em>Mapping Resolution Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mapping Resolution Exception</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException"
	 * @generated
	 */
	EDataType getMappingResolutionException();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException <em>Ambiguous Mapping Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ambiguous Mapping Exception</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException"
	 * @generated
	 */
	EDataType getAmbiguousMappingException();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException <em>Rule Definition Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rule Definition Exception</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException"
	 * @generated
	 */
	EDataType getRuleDefinitionException();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException <em>Rule Execution Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rule Execution Exception</em>'.
	 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException
	 * @model instanceClass="org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException"
	 * @generated
	 */
	EDataType getRuleExecutionException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl <em>Purpose Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getPurposeRegistry()
		 * @generated
		 */
		EClass PURPOSE_REGISTRY = eINSTANCE.getPurposeRegistry();

		/**
		 * The meta object literal for the '<em><b>Registered Purposes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURPOSE_REGISTRY__REGISTERED_PURPOSES = eINSTANCE.getPurposeRegistry_RegisteredPurposes();

		/**
		 * The meta object literal for the '<em><b>Contributed Purposes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURPOSE_REGISTRY__CONTRIBUTED_PURPOSES = eINSTANCE.getPurposeRegistry_ContributedPurposes();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Mapping Possibility Resolution Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getMappingPossibilityResolutionException()
		 * @generated
		 */
		EDataType MAPPING_POSSIBILITY_RESOLUTION_EXCEPTION = eINSTANCE.getMappingPossibilityResolutionException();

		/**
		 * The meta object literal for the '<em>Mapping Resolution Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getMappingResolutionException()
		 * @generated
		 */
		EDataType MAPPING_RESOLUTION_EXCEPTION = eINSTANCE.getMappingResolutionException();

		/**
		 * The meta object literal for the '<em>Ambiguous Mapping Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getAmbiguousMappingException()
		 * @generated
		 */
		EDataType AMBIGUOUS_MAPPING_EXCEPTION = eINSTANCE.getAmbiguousMappingException();

		/**
		 * The meta object literal for the '<em>Rule Definition Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getRuleDefinitionException()
		 * @generated
		 */
		EDataType RULE_DEFINITION_EXCEPTION = eINSTANCE.getRuleDefinitionException();

		/**
		 * The meta object literal for the '<em>Rule Execution Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException
		 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.RulesPackageImpl#getRuleExecutionException()
		 * @generated
		 */
		EDataType RULE_EXECUTION_EXCEPTION = eINSTANCE.getRuleExecutionException();

	}

} //RulesPackage
