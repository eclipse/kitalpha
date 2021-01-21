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
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.model.common.share.modelresources.exceptions.ModelResourceException;
import org.polarsys.kitalpha.model.common.share.modelresources.helpers.DetachmentHelper;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.ModelResourceState;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ModelResource implements IModelResource {
	
	private URI resourceURI = null;
	private final Collection<EObject> modelObjects = new HashSet<EObject>();
	private final ModelResourceState state;
	private boolean isDeletionCandidate;
	
	
	public static IModelResource newResource(URI uri, ModelResourceState state){
		return new ModelResource(uri, state);
	}
	
	private ModelResource(URI uri, ModelResourceState state){
		this.resourceURI = uri;
		this.state = state;
		this.isDeletionCandidate = false;
	}

	@Override
	public URI getResourceURI() throws ModelResourceException {
		if (resourceURI == null) {
			throw new ModelResourceException("The resource has no URI");
		}
		return resourceURI;
	}

	@Override
	public List<EObject> getModelObjects() throws ModelResourceException {
		if (modelObjects == null) {
			throw new ModelResourceException("The list is empty for the resource or null");
		}
		return new ArrayList<EObject>(modelObjects);
	}

	@Override
	public void addModelObject(EObject eObject) throws ModelResourceException{
		
		String eObjectURI = EcoreUtil.getURI(eObject).trimFragment().toString();
		String resourceUri = getResourceURI().toString();
		
		if (eObjectURI.startsWith("http://") || eObjectURI.isEmpty()){
			URI platformResourceURIFromEObject = DetachmentHelper.getPlatformResourceURIFromEObject(eObject);
			if (platformResourceURIFromEObject == null)
				throw new ModelResourceException("Cannot resolve "+eObjectURI);
			eObjectURI = platformResourceURIFromEObject.toString();
		}
		
		if (!resourceUri.equals(eObjectURI)){
			throw new ModelResourceException("The EObject [" + eObject + "] cannot be added to the resource due to the wrong URI");
		}
		
		modelObjects.add(eObject);
	}

	@Override
	public ModelResourceState getResourceState() {
		return state;
	}

	@Override
	public void setAsCandidate(boolean isCandidate) {
		this.isDeletionCandidate = isCandidate;
	}

	@Override
	public boolean isCandidate() {
		return this.isDeletionCandidate;
	}
}
