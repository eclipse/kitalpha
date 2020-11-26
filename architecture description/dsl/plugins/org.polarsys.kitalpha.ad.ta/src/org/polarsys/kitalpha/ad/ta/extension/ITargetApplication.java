/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.ta.extension;

import java.util.List;

import org.eclipse.egf.portfolio.genchain.extension.ExtensionHelper;
import org.eclipse.emf.ecore.EClass;

/**
 * This interface allows contributor to provide Target Application information. 
 * @author Boubekeur Zendagui
 */

public interface ITargetApplication {

	/**
	 * @return Return an instance of a {@link ITargetApplication} 
	 * that host target application informations
	 */
	ITargetApplication getInstance();
	
	/**
	 * @return return a list of {@link EClass} 
	 */
	List<EClass> getBasicSemanticElement();
	
	/**
	 * @return return a list of {@link ExtensionHelper} related to the target application
	 */
	List<ExtensionHelper> getGenerationExtensionHelpers();
}
