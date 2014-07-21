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

package org.polarsys.kitalpha.ad.services.detachment.core.services.visitor;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.UnknownReferencesRegistry;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;


/**
 * @author Matthieu Helleboid
 */
@SuppressWarnings("rawtypes")
public class FinderVisitor extends EObjectVisitor {
	
	private Collection<Object> registry;
	private IFeedback messages;
	
	public FinderVisitor(IFeedback messages){
		this.messages = messages;
		UnknownReferencesRegistry ur_registry =  UnknownReferencesRegistry.getInstance();
		ur_registry.initRegistry();
		this.registry = ur_registry.getUnknownReferencesRegistry();
	}

	@Override
	public void visited(Resource resource) {
		Iterator<Object> it = registry.iterator();
		while (it.hasNext()){
			IUnknownReferencesService finder = (IUnknownReferencesService)it.next();
			finder.findIn(resource, messages);
		}
	}

	@Override
	public void visited(EObject eObject) {
		Iterator<Object> it = registry.iterator();

		while (it.hasNext()){
			IUnknownReferencesService finder = (IUnknownReferencesService)it.next();
			finder.findIn(eObject, messages);
		}
	}

	public IFeedback getMessages() {
		return messages;
	}
	
}
