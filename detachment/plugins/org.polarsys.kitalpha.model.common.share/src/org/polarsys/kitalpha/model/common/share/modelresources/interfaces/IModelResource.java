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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.model.common.share.modelresources.exceptions.ModelResourceException;

/**
 * @author Faycal Abka
 * 
 */
public interface IModelResource {
	
	/**
	 * Get resource uri
	 * @return resource URI
	 * @throws ModelResourceException: when the URI cannot be computed
	 */
	public URI getResourceURI() throws ModelResourceException;
	
	
	/**
	 * Get all EObjects instantiated from the resource
	 * @return
	 * @throws ModelResourceException: when the list is empty for the given resource
	 */
	public List<EObject> getModelObjects() throws ModelResourceException;
	
	/**
	 * Add a model to the eObject
	 * @param eObject
	 * @throws ModelResourceException: when the object to add is not the same as getResourceURI
	 */
	public void addModelObject(EObject eObject) throws ModelResourceException;
	
	/**
	 * @return the state of the resource (known or unknown resource)
	 */
	public ModelResourceState getResourceState();
	
	
	/**
	 * Set the resource as candidate to delete
	 * @param isCandidate true if the resource is candidate to delete, otherwise, false
	 */
	public void setAsCandidate(boolean isCandidate);
	
	/**
	 * @return true if the resource is candidate to deletion, by default, it return false
	 */
	public boolean isCandidate();
	
}
