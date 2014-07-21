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


package org.polarsys.kitalpha.ad.services.detachment.io.factory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.services.detachment.io.internal.load.LoadResource;
import org.polarsys.kitalpha.ad.services.detachment.io.internal.save.SaveResource;

/**
 * Factory for the Input/output detachment
 * @author Faycal ABKA
 *
 */
public class IODetachmentFactory {
	
	/**
	 * Returns a new instance of {@link LoadResource}.
	 * @param airdResource to load. It must be not null or empty
	 * @return {@link LoadResource} new instance.
	 */
	public static LoadResource loadResourceNewInstance(IFile airdResource){
		//TODO: throw an IOException if aird resource is null?!
		return new LoadResource(airdResource);
	}
	
	
	/**
	 * Returns a new instance of {@link LoadResource}.
	 * @param airdResource to load. It must be not null or empty
	 * @param monitor
	 * @return {@link LoadResource} new instance
	 */
	public static LoadResource loadResourceNewInstance(IFile airdResource, IProgressMonitor monitor){
		//TODO: throw an IOException if aird resource is null?!
		return new LoadResource(airdResource, monitor);
	}
	
	
	/**
	 * Returns a new instance of {@link SaveResource}
	 * @param resource to save
	 * @return {@link SaveResource}
	 */
	public static SaveResource saveResourceNewInstance(Resource resource){
		return new SaveResource(resource);
	}
	
	
	/**
	 * Returns a new instance of {@link SaveResource}
	 * @param resource to save
	 * @param monitor
	 * @return {@link SaveResource}
	 */
	public static SaveResource saveResourceNewInstance(Resource resource, IProgressMonitor monitor){
		return new SaveResource(resource, monitor);
	}
}
