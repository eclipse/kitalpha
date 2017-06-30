/*******************************************************************************
 * Copyright (c) 2016, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.resourcereuse.emfscheme.api.ModelReuseLoaderFactory;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ResourceSetLoaderServices {

	/**
	 * Method that load resource in the resource set. If selection is included
	 * in a resource set, this method will be called, show SiriusLoaderServices
	 * if the resource is included in a sirius diagram
	 * 
	 * @param selection
	 *            : The current selection
	 * @param modelToLoad
	 *            : Models to load next to the current selection
	 */

	public static void loadResourceForCurrentResourceSet(EObject selection,
			List<URI> modelToLoad) {

		for (URI uri : modelToLoad) {
			loadResourceForCurrentResourceSet(selection, uri);
		}
	}
	
	/**
	 * 
	 * @param selection
	 * @param uri
	 */
	public static Resource loadResourceForCurrentResourceSet(EObject selection, URI uri){
		return ModelReuseLoaderFactory.createModelReuseLoader().load(selection, uri);
	}
}
