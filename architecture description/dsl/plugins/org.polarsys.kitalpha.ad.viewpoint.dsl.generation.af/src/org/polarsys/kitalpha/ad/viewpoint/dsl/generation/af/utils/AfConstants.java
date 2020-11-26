/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
