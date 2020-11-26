/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Possibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getCompleteRule <em>Complete Rule</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getIncompleteRule <em>Incomplete Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPossibility()
 * @model
 * @generated
 */
public interface MappingPossibility extends EObject {





	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"mapping possibility"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPossibility_Name()
	 * @model default="mapping possibility" required="true"
	 * @generated
	 */

	String getName();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getName <em>Name</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */

	void setName(String value);







	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(IContext)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPossibility_Context()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext"
	 * @generated
	 */

	IContext getContext();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getContext <em>Context</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */

	void setContext(IContext value);







	/**
	 * Returns the value of the '<em><b>Complete Rule</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Rule</em>' attribute.
	 * @see #setCompleteRule(IRule)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPossibility_CompleteRule()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule<?>" required="true"
	 * @generated
	 */

	IRule<?> getCompleteRule();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getCompleteRule <em>Complete Rule</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Rule</em>' attribute.
	 * @see #getCompleteRule()
	 * @generated
	 */

	void setCompleteRule(IRule<?> value);







	/**
	 * Returns the value of the '<em><b>Incomplete Rule</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomplete Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomplete Rule</em>' attribute.
	 * @see #setIncompleteRule(IRule)
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage#getMappingPossibility_IncompleteRule()
	 * @model dataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule<?>"
	 * @generated
	 */

	IRule<?> getIncompleteRule();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility#getIncompleteRule <em>Incomplete Rule</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incomplete Rule</em>' attribute.
	 * @see #getIncompleteRule()
	 * @generated
	 */

	void setIncompleteRule(IRule<?> value);






	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.RuleDefinitionException" domainHelper_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper" domainHelper_pRequired="true"
	 * @generated
	 */

	boolean checkRules(IDomainHelper domainHelper_p) throws RuleDefinitionException;





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.RuleDefinitionException" domainHelper_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper" domainHelper_pRequired="true"
	 * @generated
	 */

	boolean checkCompleteRule(IDomainHelper domainHelper_p) throws RuleDefinitionException;





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.RuleDefinitionException" domainHelper_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper" domainHelper_pRequired="true"
	 * @generated
	 */

	boolean checkIncompleteRule(IDomainHelper domainHelper_p) throws RuleDefinitionException;





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.polarsys.kitalpha.transposer.rules.handler.rules.RuleExecutionException" context_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext"
	 * @generated
	 */

	void applyRule(Object object_p, IContext context_p, boolean complete_p) throws RuleExecutionException;





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model context_pDataType="org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext"
	 * @generated
	 */

	void updateContext(Object object_p, IContext context_p);





	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model object_pRequired="true"
	 * @generated
	 */

	boolean isApplicableOn(Object object_p);




} // MappingPossibility
