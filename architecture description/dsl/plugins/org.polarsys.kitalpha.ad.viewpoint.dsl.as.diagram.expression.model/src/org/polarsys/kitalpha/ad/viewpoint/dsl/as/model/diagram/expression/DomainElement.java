/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage#getDomainElement()
 * @model
 * @generated
 */
public interface DomainElement extends ForeignExpressionElement {

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage#getDomainElement_Attribute()
	 * @model required="true"
	 * @generated
	 */

	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement#getAttribute <em>Attribute</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */

	void setAttribute(Attribute value);

} // DomainElement
