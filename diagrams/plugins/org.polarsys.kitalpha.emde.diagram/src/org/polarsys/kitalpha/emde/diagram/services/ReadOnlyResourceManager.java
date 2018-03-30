/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;

// An helper class to manage read only resource.
public class ReadOnlyResourceManager {

	private static final TransactionalEditingDomain editingDomain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
	private static Map<Resource, Boolean> resourceToReadOnlyMap = ((AdapterFactoryEditingDomain) editingDomain).getResourceToReadOnlyMap();
	private static Map<EditPart, Collection<Resource>> resourceRegistry = new HashMap<EditPart, Collection<Resource>>();
	public static Map<EditPart, EditPartListener> listenerRegistry = new HashMap<EditPart, EditPartListener>();

	public static void handler(final DiagramEditPart editPart, final Resource currentResource, final Resource addedResource) {

		Resource resourceInMap = findResource(resourceToReadOnlyMap, addedResource);
		URI currentURI = currentResource.getURI();
		URI addedURI = resourceInMap.getURI();
		
		if (!currentURI.isPlatformPlugin()
			&& !currentURI.path().toString().equals(addedURI.path().toString())
			&& listenerRegistry.get(editPart) != null) 
		{
			resourceToReadOnlyMap.put(resourceInMap, true);
			Collection<Resource> collection = resourceRegistry.get(editPart);
			if (collection == null) 
			{
				collection = new UniqueEList<Resource>();
			}
			
			collection.add(resourceInMap);
			resourceRegistry.put(editPart, collection);
		}

		if (listenerRegistry.get(editPart) == null) 
		{
			EditPartListener editPartListener = new EditPartListener.Stub() {
				@Override
				public void partDeactivated(EditPart editpart) {
					Collection<Resource> collection = resourceRegistry.get(editpart);
					if (collection != null && collection.size() > 0) 
					{
						for (Resource resource : collection) 
						{
							resourceToReadOnlyMap.remove(resource);
						}
					}
				}
			};
			editPart.addEditPartListener(editPartListener);
			listenerRegistry.put(editPart, editPartListener);
		}

	}

	private static Resource findResource(Map<Resource, Boolean> map, Resource resource) {
		String path = resource.getURI().path().toString();
		for (Resource r : map.keySet()) 
		{
			if (r.getURI().path().toString().equals(path)) 
			{
				return r;
			}
		}
		return resource;
	}
}
