/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.api.library;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.composer.Activator;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * @author Guillaume Gebhart
 *Helper for ModelReuse
 */
public class LibraryReuseHelper {

	public static LibraryReuseHelper INSTANCE = new LibraryReuseHelper();
	public String DOMAIN = "Allocation";
	private ResourceHelper helper;
	private LibraryReuseHelper(){
		helper = ResourceReuse.createHelper();
	}
	
	public Resource[] getLibraries(){

		SearchCriteria criteria = new SearchCriteria();
		criteria.setDomain(DOMAIN);
		return helper.getResources(criteria);
		
	}
	
	public Resource[] getLibraries(List<String> tags_p){
		
		
		SearchCriteria criteria = new SearchCriteria();
		criteria.setDomain(DOMAIN);
		if(tags_p != null) {
			criteria.getTags().addAll(tags_p);
		}
		return helper.getResources(criteria);
		
	}

	public List<Resource> getResourcesFromIds(List<String> list_p) {
		List <Resource> resources = new ArrayList<Resource>();
		if(list_p != null){
		for(String id : list_p){
			try {
				Resource res = helper.getResource(id);
				resources.add(res);
			} catch (ResourceNotFoundException e) {
				
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
			}
		}
		}
		return resources;
		
	}
	
}
