/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.share.modelresources.interfaces;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * Classes implement this interface, can hold all the resources
 * @author Faycal Abka
 *
 */
public interface IModelResources {
	
	public Map<URI, IModelResource> getModelResources();
	
	/**
	 * Filter the resources by their state
	 * @param state
	 * @return a new list of filtred resources
	 */
	public List<IModelResource> filterModelResourcesWithState(ModelResourceState state);
	
	/**
	 * 
	 * @return all URI of the resources
	 */
	public List<URI> getAllModelResourceURI();
	
	/**
	 * 
	 * @return all model resources
	 */
	public List<IModelResource> getAllModelResources();
	
	/**
	 * 
	 * @param state
	 * @return all URI of resources with state
	 */
	public List<URI> getModelResourceURIWithState(ModelResourceState state);
	
	/**
	 * 
	 * @return all EObjects
	 */
	public List<EObject> getAllResourcesEObjects();
	
	public void addResource(URI uri, IModelResource modelResource);
	
	//FIXME: throw exception when uri is not found
	public IModelResource getModelResource(URI uri);
	
	
	public List<IModelResource> getAllDeletionCandidates();
}