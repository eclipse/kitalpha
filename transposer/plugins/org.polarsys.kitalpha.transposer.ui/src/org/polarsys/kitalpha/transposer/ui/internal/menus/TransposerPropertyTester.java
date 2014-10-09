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

/**
 * 
 */
package org.polarsys.kitalpha.transposer.ui.internal.menus;

import org.eclipse.core.expressions.PropertyTester;

/**
 * @author Guillaume Gebhart
 *
 */
public class TransposerPropertyTester extends PropertyTester {

	/**
	 * 
	 */
	public TransposerPropertyTester() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		return TransposerContributionItem.haveLauchConfiguration();
	}

}
