/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.share.modelresources.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.model.common.share.modelresources.exceptions.ModelResourceException;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.ModelResourceState;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ModelResources implements IModelResources {
	
	private final Logger LOGGER = Logger.getLogger(ModelResource.class);
	
	private final Map<URI, IModelResource> modelResources = new HashMap<URI, IModelResource>();
	
	private List<EObject> allModelEObjects = null;

	
	
	@Override
	public Map<URI, IModelResource> getModelResources() {
		return modelResources;
	}

	@Override
	public List<IModelResource> filterModelResourcesWithState(
			ModelResourceState state) {
		Collection<IModelResource> allModelResources = getModelResources().values();
		List<IModelResource> result = new ArrayList<IModelResource>();

		for (IModelResource iModelResource : allModelResources) {
			ModelResourceState r_state = iModelResource.getResourceState();

			if (r_state.equals(state)){
				result.add(iModelResource);
			}
		}

		return result;
	}

	@Override
	public List<URI> getAllModelResourceURI() {
		return new ArrayList<URI>(getModelResources().keySet());
	}

	@Override
	public List<IModelResource> getAllModelResources() {
		return new ArrayList<IModelResource>(getModelResources().values());
	}

	@Override
	public List<URI> getModelResourceURIWithState(ModelResourceState state) {
		Collection<IModelResource> allModelResources = getModelResources().values();
		List<URI> result = new ArrayList<URI>();
		
		for (IModelResource iModelResource : allModelResources) {
			ModelResourceState r_state = iModelResource.getResourceState();
			
			if (r_state.equals(state)){
				try {
					result.add(iModelResource.getResourceURI());
				} catch (ModelResourceException e) {
					LOGGER.warn(e.getMessage());
				}
			}
		}
		
		return result;
	}

	@Override
	public List<EObject> getAllResourcesEObjects() {
		
		if (allModelEObjects == null){
			allModelEObjects = new ArrayList<EObject>();
			Collection<IModelResource> allModelResources = getModelResources().values();

			for (IModelResource iModelResource : allModelResources) {
				try {
					allModelEObjects.addAll(iModelResource.getModelObjects());
				} catch (ModelResourceException e) {
					LOGGER.warn(e.getMessage());
				}
			}
			return allModelEObjects;
		}
		
		return allModelEObjects;
	}

	@Override
	public void addResource(URI uri, IModelResource modelResource) {
		getModelResources().put(uri, modelResource);
	}

	@Override
	public IModelResource getModelResource(URI uri) {
		return getModelResources().get(uri);
	}

	@Override
	public List<IModelResource> getAllDeletionCandidates() {
		
		Collection<IModelResource> allResources = getAllModelResources();
		List<IModelResource> candidates = new ArrayList<IModelResource>();
		
		for (IModelResource iModelResource : allResources) {
			if (iModelResource.isCandidate()){
				candidates.add(iModelResource);
			}
		}
		
		return candidates;
	}
}
