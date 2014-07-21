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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types.ResourceFileInformation;

/**
 * @author Boubekeur Zendagui
 */

public interface IViewpointResourceProvider {

	/**
	 * @return The ViewpointProvidersRegistry that hold this Resource Provider
	 */
	public ViewpointResourceProviderRegistry getHandler();
	
	/** 
	 * @return file informations ({@link ResourceFileInformation})
	 */
	public ResourceFileInformation getResourceFileInformations();
	
	/** 
	 * set file informations ({@link ResourceFileInformation})
	 */
	public void setResourceFileInformations(ResourceFileInformation resourceFileInformation) throws ViewpointResourceException;
	
	/** 
	 * @return the EMF ({@link Resource})
	 */
	public Resource getResource() throws ViewpointResourceException;
	
	/**
	 * @return the root element of the resource
	 * @throws ViewpointResourceException if the resource content is empty
	 */
	public EObject getRootElement()	throws ViewpointResourceException;
	
	/**
	 * Refresh the resource.
	 */
	public void refresh();
}
