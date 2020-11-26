/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
					iFinder.findIn(resource);
				}
			}
		}
	}

	@Override
	public void visited(EObject eObject) {

		for (String id : registry.getRegistry().keySet()) {
			RegistryElement registryElement = registry.getRegistry().get(id);

			Collection<IScrutinize> finders = registryElement.getFinders();

			/*
			 * FIXME: cf. Fixme in visited(Resource) method above
			 */
			for (IScrutinize iFinder : finders) {
				iFinder.findIn(eObject);
			}
		}
	}

	public ModelScrutinyRegistry getRegistry() {
		return registry;
	}
	
	
}
