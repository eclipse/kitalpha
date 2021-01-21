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
	
	Map<URI, IModelResource> getModelResources();
	
	/**
	 * Filter the resources by their state
	 * @param state
	 * @return a new list of filtred resources
	 */
	List<IModelResource> filterModelResourcesWithState(ModelResourceState state);
	
	/**
	 * 
	 * @return all URI of the resources
	 */
	List<URI> getAllModelResourceURI();
	
	/**
	 * 
	 * @return all model resources
	 */
	List<IModelResource> getAllModelResources();
	
	/**
	 * 
	 * @param state
	 * @return all URI of resources with state
	 */
	List<URI> getModelResourceURIWithState(ModelResourceState state);
	
	/**
	 * 
	 * @return all EObjects
	 */
	List<EObject> getAllResourcesEObjects();
	
	void addResource(URI uri, IModelResource modelResource);
	
	//FIXME: throw exception when uri is not found
	IModelResource getModelResource(URI uri);
	
	
	List<IModelResource> getAllDeletionCandidates();
}