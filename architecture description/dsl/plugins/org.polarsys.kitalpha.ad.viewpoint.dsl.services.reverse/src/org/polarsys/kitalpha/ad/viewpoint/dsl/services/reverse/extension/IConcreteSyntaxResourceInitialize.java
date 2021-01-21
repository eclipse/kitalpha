/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension;

import org.eclipse.emf.common.util.URI;

/**
 * @author Boubekeur Zendagui
 */

public interface IConcreteSyntaxResourceInitialize {

	/**
	 * This method allows to initialize a concrete syntax resource.
	 * 
	 * A concrete syntax resource can be a textual resource, graphical resource, 
	 * ... etc.
	 * 
	 * @param vpDescResourceURI The URI {@link URI} of the vpspec EMF resource 
	 * @param vpDslProjectName The VpDsl project containing.
	 * @return True if the initialization is done with success, else False
	 */
	boolean initializeConcreteSyntaxResource(URI vpDescResourceURI, String vpDslProjectName);
	
	/**
	 * This method allows to create extensions to add in plugin.xml. 
	 * 
	 * Each contributor who wishes to add extensions in the Plugin.xml under 
	 * generation have to implements this method and return a StringBuffer 
	 * containing the extensions in XML like format.
	 * 
	 * Note that when this method is fired, the Plugin.xml is updated by 
	 * appending the new extensions at the end. There no merge or check if an
	 * extension was already added in the Plugin.xml
	 *    
	 * @param vpDescResourceURI Viewpoint short name
	 * @param vpDslProjectName The name of the project containing the viewpoint 
	 * 		  description (vpDesc model)
	 * @return A StringBuffer containing the extension definition
	 */
	StringBuffer createPluginXmlContribution(URI vpDescResourceURI, String vpDslProjectName);
	
}
