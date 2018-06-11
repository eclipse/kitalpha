/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.share.resource.loading;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.model.common.share.Messages;

/**
 * Utility for loading platform resources
 * 
 * @author Matthieu Helleboid
 * @author Faycal Abka
 *
 */
public class LoadResource {
	
	/**
	 * The aird resource to load
	 */
	private IFile airdResource;
	
	/**
	 * The progress monitor when loading
	 */
	private IProgressMonitor monitor;
	
	
	/**
	 * The instance of the resource
	 */
	Resource resource;
	
	
	public LoadResource(IFile airdResource){
		this.airdResource = airdResource;
		this.monitor = null;
		this.resource = null;
	}
	
	
	public LoadResource(IFile airdResource, IProgressMonitor monitor){
		this.airdResource = airdResource;
		this.monitor = monitor;
		this.resource = null;
	}

	public IFile getAirdResource() {
		return airdResource;
	}

	public IProgressMonitor getMonitor() {
		return monitor;
	}

	public void setMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}
	
	
	
	/**
	 * Load the resource of the aird file with recording the unknown feature.
	 * If the resource was already loaded it return it.
	 * 
	 * @return Resource of the aird file
	 */
	public Resource getResource(){
		
		//if the resource is loaded, return it
		if (resource != null && resource.isLoaded()) {
			return resource;
		}
		
		URI resourceURI = URI.createPlatformResourceURI(getAirdResource()
				.getFullPath().toString(), false);
		this.resource = getResourceSet(getMonitor()).getResource(resourceURI, true);
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(this.resource.getResourceSet());
		
		return this.resource;
	}
	
	
	private ResourceSetImpl getResourceSet(final IProgressMonitor monitor) {
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl() {
			@Override
			protected void demandLoadHelper(Resource resource) {
				if (monitor != null)
				 {
					monitor.subTask(Messages.LOADING_RESOURCE + " " + resource.getURI()); //$NON-NLS-1$
				}
				super.demandLoadHelper(resource);
			}
		};
		
		ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
		resourceSetImpl.eAdapters().add(adapter);
		
		resourceSetImpl.getLoadOptions().put(
				XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		
		return resourceSetImpl;
	}
}
