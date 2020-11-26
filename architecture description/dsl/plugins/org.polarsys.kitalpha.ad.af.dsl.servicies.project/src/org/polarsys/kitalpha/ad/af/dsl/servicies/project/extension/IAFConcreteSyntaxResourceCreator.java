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

package org.polarsys.kitalpha.ad.af.dsl.servicies.project.extension;

import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public interface IAFConcreteSyntaxResourceCreator {

	/*
	 * This method allows to create a resource. 
	 */
	boolean createConcreteSyntaxResource(String shortName, 
												String rootProjectName,
												String dslProjectName,
												List<Viewpoint> selectedViewpoint);

	/*
	 * This method allows to create an extension to add in plugin.xml. 
	 */
	StringBuffer createPluginXmlContribution(String shortName, 
											   		String rootProjectName,
											   		String dslProjectName);
}
