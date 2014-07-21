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


package org.polarsys.kitalpha.transposer.rules.handler.rules.impl;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;

import org.polarsys.kitalpha.transposer.rules.handler.rules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/transposer/rules"); //$NON-NLS-1$ 
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RulesPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case RulesPackage.MAPPING_POSSIBILITY_RESOLUTION_EXCEPTION:
				return createMappingPossibilityResolutionExceptionFromString(eDataType, initialValue);
			case RulesPackage.MAPPING_RESOLUTION_EXCEPTION:
				return createMappingResolutionExceptionFromString(eDataType, initialValue);
			case RulesPackage.AMBIGUOUS_MAPPING_EXCEPTION:
				return createAmbiguousMappingExceptionFromString(eDataType, initialValue);
			case RulesPackage.RULE_DEFINITION_EXCEPTION:
				return createRuleDefinitionExceptionFromString(eDataType, initialValue);
			case RulesPackage.RULE_EXECUTION_EXCEPTION:
				return createRuleExecutionExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RulesPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case RulesPackage.MAPPING_POSSIBILITY_RESOLUTION_EXCEPTION:
				return convertMappingPossibilityResolutionExceptionToString(eDataType, instanceValue);
			case RulesPackage.MAPPING_RESOLUTION_EXCEPTION:
				return convertMappingResolutionExceptionToString(eDataType, instanceValue);
			case RulesPackage.AMBIGUOUS_MAPPING_EXCEPTION:
				return convertAmbiguousMappingExceptionToString(eDataType, instanceValue);
			case RulesPackage.RULE_DEFINITION_EXCEPTION:
				return convertRuleDefinitionExceptionToString(eDataType, instanceValue);
			case RulesPackage.RULE_EXECUTION_EXCEPTION:
				return convertRuleExecutionExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPossibilityResolutionException createMappingPossibilityResolutionExceptionFromString(EDataType eDataType, String initialValue) {
		return (MappingPossibilityResolutionException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingPossibilityResolutionExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingResolutionException createMappingResolutionExceptionFromString(EDataType eDataType, String initialValue) {
		return (MappingResolutionException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingResolutionExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbiguousMappingException createAmbiguousMappingExceptionFromString(EDataType eDataType, String initialValue) {
		return (AmbiguousMappingException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmbiguousMappingExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDefinitionException createRuleDefinitionExceptionFromString(EDataType eDataType, String initialValue) {
		return (RuleDefinitionException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleDefinitionExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleExecutionException createRuleExecutionExceptionFromString(EDataType eDataType, String initialValue) {
		return (RuleExecutionException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleExecutionExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
