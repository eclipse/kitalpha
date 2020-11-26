/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types.ResourceFileInformation;

/**
 * @author Boubekeur Zendagui
 */

public abstract class AbstractCoreResourceProvider implements IViewpointResourceProvider {

	private ViewpointResourceProviderRegistry handler_; 
	private ResourceFileInformation coreResourceInformation_;
	private Resource resource_;

	/**
	 * @throws ViewpointResourceException 
	 * @see IViewpointResourceProvider documentation
	 */
	public Resource getResource() throws ViewpointResourceException {
		if (resource_ != null && ! resource_.isLoaded())
		{
			try {
				resource_.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				ViewpointResourceException exception = 
					new ViewpointResourceException(this.getResourceFileInformations(), 
							ViewpointResourceException.ON_LOADING);
				
				exception.setStackTrace(e.getStackTrace());
				throw exception;
			}
		}
		else
		{
			try {
				loadResourceFromFile();
			} catch (Exception e) {
				ViewpointResourceException exception = 
					new ViewpointResourceException(this.getResourceFileInformations(), 
							ViewpointResourceException.ON_LOADING);
				
				exception.setStackTrace(e.getStackTrace());
				throw exception;
			}
		}
		
		return resource_;
	}

	/**
	 * @see IViewpointResourceProvider
	 */
	public ResourceFileInformation getResourceFileInformations() {
		return coreResourceInformation_;
	}
	
	/**
	 * @throws ViewpointResourceException 
	 * @see IViewpointResourceProvider documentation
	 */
	public void setResourceFileInformations(ResourceFileInformation resourceFileInformation) 
					throws ViewpointResourceException {
		if (coreResourceInformation_ == null ||
				coreResourceInformation_ != resourceFileInformation)
		{
			coreResourceInformation_ = resourceFileInformation;
			
			try {
				loadResourceFromFile();
			} catch (Exception e) {
				ViewpointResourceException exception = 
					new ViewpointResourceException(this.getResourceFileInformations(), 
							ViewpointResourceException.ON_LOADING);
				
				exception.setStackTrace(e.getStackTrace());
				throw exception;
			}
		}
	}

	/**
	 * @see IViewpointResourceProvider documentation
	 */
	public EObject getRootElement() throws ViewpointResourceException {
		if (resource_ == null)
			throw new ViewpointResourceException(this.getResourceFileInformations(), 
					ViewpointResourceException.IS_NULL);
		
		EList<EObject> content = resource_.getContents();
		if (content.size() == 0)
			throw new ViewpointResourceException(this.getResourceFileInformations(), 
					ViewpointResourceException.IS_EMPTY);
		
		return content.get(0);
	}
	
	public ViewpointResourceProviderRegistry getHandler() {
		return handler_;
	}
	
	public void setHandler(ViewpointResourceProviderRegistry handler) {
		handler_ = handler;
	}
	
	/**
	 * Load EMF Resource by using the file informations provided in 
	 * coreResourceInformation_ property
	 */
	protected void loadResourceFromFile(){
		URI uri = coreResourceInformation_.getPlatformResourceURI();
		TargetPlatformResourceSet resourceSet = new TargetPlatformResourceSet();
		resource_ = resourceSet.getResource(uri, true);
	}
	
	/**
	 * Refresh the resource. this method unload the EMF resource and reload it 
	 * after.
	 */
	public void refresh() {
		resource_.unload();
		try {
			resource_.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
