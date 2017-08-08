/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.scrutiny.visitor;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;


/**
 * @author Matthieu Helleboid
 */
@SuppressWarnings("rawtypes")
public class ScrutinizeVisitor extends EObjectVisitor {
	
	private final ModelScrutinyRegistry registry;
	
	public ScrutinizeVisitor(){
		this.registry = new ModelScrutinyRegistry();
	}

	@Override
	public void visited(Resource resource) {
		if (registry != null){
			Set<String> findersId = registry.getRegistry().keySet();
			
			for (String id : findersId) {
				Object regElt = registry.getRegistry().get(id);

				RegistryElement registryElement = (RegistryElement)regElt;
				Collection<IScrutinize> finders = registryElement.getFinders();

				for (IScrutinize iFinder : finders) {
					/*
					 * FIXME: This is not good check, because we limited the detach
					 * only on the instances. Find a better way to check this.
					 * 
					 * This is done, because the detachment find some unknown references
					 * in capella ide caused by malformed odesigns
					 */
					//if (!resource.getURI().isPlatformPlugin())
						iFinder.findIn(resource);
				}
			}
		}
	}

	@Override
	public void visited(EObject eObject) {
		
		for (String id : registry.getRegistry().keySet()) {
			Object regElt = registry.getRegistry().get(id);
			
			if (regElt instanceof RegistryElement){
				RegistryElement registryElement = (RegistryElement)regElt;
				Collection<IScrutinize> finders = registryElement.getFinders();
				
				/*
				 * FIXME: cf. Fixme in visited(Resource) method above
				 */
				for (IScrutinize iFinder : finders) {
					//if (eObject.eResource() != null && !eObject.eResource().getURI().isPlatformPlugin())
						iFinder.findIn(eObject);
				}
			}
		}
	}

	public ModelScrutinyRegistry getRegistry() {
		return registry;
	}
	
	
}
