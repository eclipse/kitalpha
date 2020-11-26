/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.rules.generic;

import org.eclipse.uml2.uml.Element;

import org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule;

/**
 * 
 * Generic Rule
 * 
 * @author Guillaume Gebhart
 * 
 */
public abstract class AbstractGenericRule<T extends Element> extends
		AbstractTransformationRule<T> {

	/**
	 * Constructor
	 */
	public AbstractGenericRule() {
		// Nothing
	}

	/**
	 * Allows to compute precedence premise
	 * 
	 * @param value_p :
	 *            UML Object
	 * @param ref_p :
	 *            reference
	 * @param premises_p :
	 *            Map used
	 */

	
	/**
	 * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule#isApplicableOn(java.lang.Object)
	 */
	public boolean isApplicableOn(T element_p) {
		return element_p instanceof Element;
	}

}
