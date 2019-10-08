/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.uml.to.componentsample.generic;

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
	 * @see com.thalesgroup.mde.transposer.rules.handler.rules.api.IRule#isApplicableOn(java.lang.Object)
	 */
	public boolean isApplicableOn(T element_p) {
		return element_p instanceof Element;
	}

}
