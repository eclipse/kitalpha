/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Guillaume Gebhart
 * this Class return the including path for any model element
 * It use : 
 * 	-current Allocation Model
 * 	- The Allocation libraries
 *  - The Missing path or the strategy path
 */
public class IncludingService {

	
	
	
	
	ISearchAlgorithm algo = null;
	
	public IncludingService(ISearchAlgorithm algo){
		this.algo = algo;
	}
	
	
	
	public String getIncludePath(final Root root, final EObject searched) {
		
		
		// Search in the current Allocation File
		String result = algo.getIncludeFromAllocation(root,searched);
		
		if (result != null) {
			return result;
		}
		
		// Search in the Libraries
			List<Resource> libraries = LibraryRuntimeHelper.INSTANCE.getLibraries();
			Object s = searched.eResource();
			ResourceSet set = null;
			if(s==null){
				set = new ResourceSetImpl();
				URI uri = URI.createURI(".temporyalloc");
				org.eclipse.emf.ecore.resource.Resource r = set.createResource(uri);
				r.getContents().add(root);
				EcoreUtil.resolveAll(r);
			}else{
				set = ((org.eclipse.emf.ecore.resource.Resource)s).getResourceSet();
			}
			for(Resource reuse : libraries){
				org.eclipse.emf.ecore.resource.Resource allocation = loadResource(reuse, set);
				EObject eObj = allocation.getContents().get(0);
				if(eObj instanceof Root){
					Root rootLib =  (Root)eObj;
					result = algo.getIncludeFromAllocation(rootLib,searched);
					if (result != null) {
							return result;
						
					}
				}	
			}
			
		if (result != null) {
			return result;
		}
		
		// Use the missing path
		Object o = LibraryRuntimeHelper.INSTANCE.getMissing();
		if(o instanceof IStrategy){
			IStrategy strategy =  (IStrategy)o;
			Map<String,Parameter> parameters = LibraryRuntimeHelper.INSTANCE.getStrategyParameters();
			List<EObject> list = new ArrayList<EObject>();
			list.add(searched);
			Root partialRoot = strategy.allocateModelElements(EcoreUtil.getRootContainer(searched), parameters, list);
			result = algo.getIncludeFromAllocation(partialRoot, searched);
		}else{
			result = o.toString();
		}
		
		return result;
	}
	
	
	




	private String toPath(String path) {

		boolean defaultPath = false;

		if (path.equals("/")) { // remove "/"
			path = "";
			defaultPath = true;
		}

		if (path.startsWith("/")) { // remove "/" character for the compilation
			// unit
			path = path.substring(1);
		}

		if (!path.endsWith("/") && !defaultPath) { // good path formatting
			path += "/";
		}

		return path;
	}
	
	private org.eclipse.emf.ecore.resource.Resource loadResource(
			Object resource_p, ResourceSet tempory) {
		org.eclipse.emf.ecore.resource.Resource res = null;
		if (resource_p instanceof Resource) {
			Resource resource = (Resource) resource_p;
			final String path = resource.getPath();
			if (path != null) {
				IResource wr = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
				URI uri = null;
				if(wr!= null){
					uri = URI.createPlatformResourceURI(path, false);
				}else{
					uri = URI.createPlatformPluginURI(path, false);
				}
				res = tempory.getResource(uri, true);
				
			}

		}
		return res;
	}
	
}
