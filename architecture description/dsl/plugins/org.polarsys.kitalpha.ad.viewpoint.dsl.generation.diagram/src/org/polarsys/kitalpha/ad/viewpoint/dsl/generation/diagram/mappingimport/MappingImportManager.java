/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Boubekeur Zendagui
 */

public class MappingImportManager {
	
	private static List<MappingImportAgent> MappingImportAgents;

	public static MappingImportAgent getMappingImportAgentFor(EObject eObject){
		// The fist call of this method 
		if (MappingImportAgents == null)
			MappingImportAgents = new ArrayList<MappingImportAgent>();
		
		// Check if there is a registered Agent for the current element.
		for (MappingImportAgent iMappingImportAgent : MappingImportAgents) 
		{
			if (iMappingImportAgent.isAgentConcerned(eObject))
				return iMappingImportAgent;
		}
		
		// If we are here, that means that there is no Agent for the current element. 
		// So we create a new Agent, register it in the MappingImportAgents list and return it.
		MappingImportAgent agent = new MappingImportAgent(eObject);
		MappingImportAgents.add(agent);
		return agent;
	}
	
	public static void patchAllMappingImport() throws AutoImportException, IOException{
		
		List<Resource> resourcesList = new BasicEList<Resource>();
		
		if (MappingImportAgents == null)
			return;
		
		for (MappingImportAgent iMappingImportAgent : MappingImportAgents) 
			iMappingImportAgent.patchImports(false);
		
		// Collect resources of all Import Agent Layer 
		for (MappingImportAgent iMappingImportAgent : MappingImportAgents) 
		{
			Resource r = iMappingImportAgent.get_Layer().eResource();
			if (! resourcesList.contains(r))
				resourcesList.add(r);
		}
		
		// Save all resources
		for (Resource resource : resourcesList) 
		{
			resource.save(Collections.EMPTY_MAP);
		}
	}
	
	public static List<MappingImportAgent> getMappingImportAgents() {
		return MappingImportAgents;
	}

	public static void clear(){
		if (MappingImportAgents == null)
			return;
		
		for (MappingImportAgent iMappingImportAgent : MappingImportAgents) 
			iMappingImportAgent.clear();
		
		MappingImportAgents.clear();
	}
}
