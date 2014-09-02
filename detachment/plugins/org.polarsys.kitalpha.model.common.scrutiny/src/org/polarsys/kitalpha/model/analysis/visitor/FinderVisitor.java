/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.model.analysis.visitor;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.analysis.interfaces.IFinder;
import org.polarsys.kitalpha.model.analysis.registry.ModelAnalysisRegistry;
import org.polarsys.kitalpha.model.analysis.registry.ModelAnalysisRegistry.RegistryElement;


/**
 * @author Matthieu Helleboid
 */
@SuppressWarnings("rawtypes")
public class FinderVisitor extends EObjectVisitor {
	
	private Map<String, RegistryElement> registry;
	
	public FinderVisitor(){
		this.registry = ModelAnalysisRegistry.INSTANCE.initRegistry();
	}

	@Override
	public void visited(Resource resource) {
		if (registry != null){
			Set<String> findersId = registry.keySet();
			
			for (String id : findersId) {
				Object regElt = registry.get(id);

				RegistryElement registryElement = (RegistryElement)regElt;
				Collection<IFinder> finders = registryElement.getFinders();

				for (IFinder iFinder : finders) {
					iFinder.findIn(resource);
				}
			}
		}
	}

	@Override
	public void visited(EObject eObject) {
		if (registry != null){
			Set<String> findersId = registry.keySet();
			
			for (String id : findersId) {
				Object regElt = registry.get(id);
				
				if (regElt instanceof RegistryElement){
					RegistryElement registryElement = (RegistryElement)regElt;
					Collection<IFinder> finders = registryElement.getFinders();
					
					for (IFinder iFinder : finders) {
						iFinder.findIn(eObject);
					}
				}
			}
		}
	}
}
