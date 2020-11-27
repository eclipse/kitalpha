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


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Possibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#getCompleteRule <em>Complete Rule</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#getIncompleteRule <em>Incomplete Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingPossibilityImpl extends EObjectImpl implements MappingPossibility {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "mapping possibility"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;


  

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final IContext CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected IContext context = CONTEXT_EDEFAULT;


  

	/**
	 * The cached value of the '{@link #getCompleteRule() <em>Complete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteRule()
	 * @generated
	 * @ordered
	 */
	protected IRule<?> completeRule;


  

	/**
	 * The cached value of the '{@link #getIncompleteRule() <em>Incomplete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncompleteRule()
	 * @generated
	 * @ordered
	 */
	protected IRule<?> incompleteRule;


  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingPossibilityImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.MAPPING_POSSIBILITY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getName() {

		return name;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setName(String newName) {

		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_POSSIBILITY__NAME, oldName, name));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IContext getContext() {

		return context;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setContext(IContext newContext) {

		IContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_POSSIBILITY__CONTEXT, oldContext, context));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IRule<?> getCompleteRule() {

		return completeRule;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCompleteRule(IRule<?> newCompleteRule) {

		IRule<?> oldCompleteRule = completeRule;
		completeRule = newCompleteRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_POSSIBILITY__COMPLETE_RULE, oldCompleteRule, completeRule));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public IRule<?> getIncompleteRule() {

		return incompleteRule;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIncompleteRule(IRule<?> newIncompleteRule) {

		IRule<?> oldIncompleteRule = incompleteRule;
		incompleteRule = newIncompleteRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.MAPPING_POSSIBILITY__INCOMPLETE_RULE, oldIncompleteRule, incompleteRule));

	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean checkRules(IDomainHelper domainHelper_p) throws RuleDefinitionException {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean checkCompleteRule(IDomainHelper domainHelper_p) throws RuleDefinitionException {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean checkIncompleteRule(IDomainHelper domainHelper_p) throws RuleDefinitionException {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void applyRule(Object object_p, IContext context_p, boolean complete_p) throws RuleExecutionException {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void updateContext(Object object_p, IContext context_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isApplicableOn(Object object_p) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.MAPPING_POSSIBILITY__NAME:
				return getName();
			case CommonPackage.MAPPING_POSSIBILITY__CONTEXT:
				return getContext();
			case CommonPackage.MAPPING_POSSIBILITY__COMPLETE_RULE:
				return getCompleteRule();
			case CommonPackage.MAPPING_POSSIBILITY__INCOMPLETE_RULE:
				return getIncompleteRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.MAPPING_POSSIBILITY__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.MAPPING_POSSIBILITY__CONTEXT:
				setContext((IContext)newValue);
				return;
			case CommonPackage.MAPPING_POSSIBILITY__COMPLETE_RULE:
				setCompleteRule((IRule<?>)newValue);
				return;
			case CommonPackage.MAPPING_POSSIBILITY__INCOMPLETE_RULE:
				setIncompleteRule((IRule<?>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.MAPPING_POSSIBILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.MAPPING_POSSIBILITY__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case CommonPackage.MAPPING_POSSIBILITY__COMPLETE_RULE:
				setCompleteRule((IRule<?>)null);
				return;
			case CommonPackage.MAPPING_POSSIBILITY__INCOMPLETE_RULE:
				setIncompleteRule((IRule<?>)null);
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.MAPPING_POSSIBILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.MAPPING_POSSIBILITY__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case CommonPackage.MAPPING_POSSIBILITY__COMPLETE_RULE:
				return completeRule != null;
			case CommonPackage.MAPPING_POSSIBILITY__INCOMPLETE_RULE:
				return incompleteRule != null;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", context: "); //$NON-NLS-1$
		result.append(context);
		result.append(", completeRule: "); //$NON-NLS-1$
		result.append(completeRule);
		result.append(", incompleteRule: "); //$NON-NLS-1$
		result.append(incompleteRule);
		result.append(')');
		return result.toString();
	}


} //MappingPossibilityImpl
