/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.impl;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ForeignExpressionElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Expression Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ForeignExpressionElementImpl extends
		ExpressionElementImpl implements ForeignExpressionElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignExpressionElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.FOREIGN_EXPRESSION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		switch (this.eClass().getClassifierID()) {
		case ExpressionPackage.DOMAIN_ELEMENT:
			DomainElement dElement = (DomainElement) this;
			if (dElement.getAttribute() != null
					&& dElement.getAttribute().getName() != null
					&& dElement.getAttribute().getName().trim().length() > 0) {
				return ((DomainElement) this).getAttribute().getName();
			}
			break;

		case ExpressionPackage.JAVA_ELEMENT:
			JavaElement jElement = (JavaElement) this;
			if (jElement.getMethod() != null
					&& jElement.getMethod().trim().length() > 0) {
				String methodName = jElement.getMethod();
				String twoLastChars = methodName.subSequence(
						methodName.length() - 2, methodName.length())
						.toString();
				if (twoLastChars.equals("()")) {
					methodName = methodName.substring(0,
							methodName.length() - 2);
				}

				methodName += "()";

				return methodName;
			}
			break;
		}

		return super.toString();
	}

} //ForeignExpressionElementImpl
