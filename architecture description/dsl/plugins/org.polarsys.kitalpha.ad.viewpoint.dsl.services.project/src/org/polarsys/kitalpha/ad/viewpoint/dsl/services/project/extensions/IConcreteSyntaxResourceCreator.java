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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.extensions;

/**
 * @author Boubekeur Zendagui
 */

public interface IConcreteSyntaxResourceCreator {
	
	/**
	 * This method allows to create a concrete syntax resource.
	 * 
	 * A concrete syntax resource can be a textual resource, graphical resource, 
	 * ... etc.
	 * 
	 * @param shortName Viewpoint short name
	 * @param targetApplication Application that will host the viewpoint
	 * @param rootProjectName The provided root project name. This name is used 
	 * 		  to name every generated plugin/feature 
	 * @param dslProjectName The name of the project containing the viewpoint 
	 * 		  description (vpDesc model)
	 * @param nsURI The NsUri that will be used to generate the ecore model
	 * @return True if the creation is done with success, else false.
	 */
	public boolean createConcreteSyntaxResource(String shortName, 
												String targetApplication,
												String rootProjectName,
												String dslProjectName,
												String nsURI);

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
	 * @param shortName Viewpoint short name
	 * @param targetApplication Application that will host the viewpoint
	 * @param rootProjectName The provided root project name. This name will be 
	 * 		  used to name every generated plugin/feature 
	 * @param dslProjectName The name of the project containing the viewpoint 
	 * 		  description (vpDesc model)
	 * @param nsURI The NsUri that will be used to generate the ecore model
	 * @return A StringBuffer containing the extension definition
	 */
	public StringBuffer createPluginXmlContribution(String shortName, 
											   		String targetApplication,
											   		String rootProjectName,
											   		String dslProjectName,
											   		String nsURI);
}
