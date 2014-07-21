/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.rules;

//import org.eclipse.jface.viewers.ICheckStateProvider;

import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.GenericHandlerContentProvider;

//  NOTE this class has no use in eclipse 3.3 since there is no class ICheckStateProvider
/**
 * @author Thomas Guiu
 * 
 */
public class RuleContentProvider extends GenericHandlerContentProvider {

	public static final RuleContentProvider INSTANCE = new RuleContentProvider();

	private RuleContentProvider() {
		super();
	}

}
