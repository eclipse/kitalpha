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

/**
 * 
 */
package org.polarsys.kitalpha.composer.internal.path.variables.common;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.polarsys.kitalpha.composer.api.path.variables.IComposerVariable;

/**
 * @author Guillaume Gebhart
 *
 */
public class ProjectDir implements IComposerVariable {

	

	public String getName() {
		// TODO Auto-generated method stub
		return "projectDir";
	}

	public String execute(Object obj) {
		String replacement = "";
		
		if (obj instanceof File) {
			
			try{
			throw new IOException("The $projectDir variable is not supported for Java I/O");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (obj instanceof IResource) {
			IResource res = (IResource) obj;
			replacement = res.getProject().getFullPath().toString();
		}
		if (obj instanceof EObject) {
			EObject eObject = (EObject) obj;
			replacement = "/" + eObject.eResource().getURI().segment(1);
		}
		
		if(obj instanceof Resource){
			Resource res = (Resource)obj;
			replacement = "/" + res.getURI().segment(1);
		}
		
		if(obj instanceof ResourceSet){
			ResourceSet set = (ResourceSet)obj;
			List<Resource> resources = set.getResources();
			if(!resources.isEmpty()){
				Resource first = resources.get(0);
				replacement = "/" + first.getURI().segment(1);
			}else{
				String msg = "Your selection is empty";
				RuntimeException exception = new RuntimeException(msg);
				throw exception;
			}
			
		}
		return replacement;
	}

}
