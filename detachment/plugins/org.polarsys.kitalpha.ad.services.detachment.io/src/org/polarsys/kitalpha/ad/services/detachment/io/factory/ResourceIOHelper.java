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

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.services.detachment.io.internal.save.SaveResource;

/**
 * @author Faycal Abka
 */

//TODO the remained internal methods
public class ResourceIOHelper {
	
	/**
	 * Load the resource of the aird file with recording the unknown feature.
	 * If the resource was already loaded it return it.
	 * 
	 * @return Resource of the aird file
	 */
	public static Resource getResource(IFile airdResource){
		return IODetachmentFactory.loadResourceNewInstance(airdResource).getResource();
	}
	
	public static void save(Resource resource, IProject project) throws IOException, CoreException{
		(new SaveResource(resource)).save(project);
	}
}
