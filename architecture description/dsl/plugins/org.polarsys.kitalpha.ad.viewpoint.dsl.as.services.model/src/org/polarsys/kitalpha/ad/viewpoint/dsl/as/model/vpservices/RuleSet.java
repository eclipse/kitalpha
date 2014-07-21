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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices;

import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.RuleSet#getVpRules <em>Vp Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends Aspect {

	/**
	 * Returns the value of the '<em><b>Vp Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vp Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vp Rules</em>' containment reference list.
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.VpservicesPackage#getRuleSet_VpRules()
	 * @model containment="true"
	 * @generated
	 */

	EList<Rule> getVpRules();

} // RuleSet
