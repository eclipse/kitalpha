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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.utils;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.IContractProvider;

/**
 * @author Boubekeur Zendagui
 */

public class AfConstants implements IContractProvider{
	
	/***
	 * Contracts
	 */
	public static final String CONTRACT_FEATURE_NAME = "af.feature.id"; //$NON-NLS-1$
	public static final String CONTRACT_PROJECT_NAME = "viewpoint.project.name"; //$NON-NLS-1$
	public static final String CONTRACT_ID = "vpID"; //$NON-NLS-1$
	public static final String CONTRACT_PROJECT_LIST = "project.list"; //$NON-NLS-1$
}
