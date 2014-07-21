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
public class ModelDir implements IComposerVariable {

	

	public String getName() {
		// TODO Auto-generated method stub
		return "modelDir";
	}

	public String execute(Object obj) {
		String replacement = "";
	
		
		
		if (obj instanceof File) {
			File file = (File) obj;
			
				replacement= file.getParent();
			 
		}
		if (obj instanceof IResource) {
			IResource res = (IResource) obj;
			 replacement= res.getFullPath().toString();
			 
		}
		if (obj instanceof EObject) {
			EObject eObject = (EObject) obj;
			replacement =  eObject.eResource().getURI().toPlatformString(false);
			replacement = replacement.split(eObject.eResource().getURI().lastSegment())[0];
		}
		
		if(obj instanceof Resource){
			Resource res = (Resource)obj;
			replacement = res.getURI().toPlatformString(false);
			replacement = replacement.split(res.getURI().lastSegment())[0];
		}
		
		if(obj instanceof ResourceSet){
			ResourceSet set = (ResourceSet)obj;
			List<Resource> resources = set.getResources();
			if(!resources.isEmpty()){
				Resource first = resources.get(0);
				replacement = first.getURI().toPlatformString(false);
				replacement = replacement.split(first.getURI().lastSegment())[0];
			}else{
				String msg = "Your selection is empty";
				RuntimeException exception = new RuntimeException(msg);
				throw exception;
			}
	}
		return replacement;
	}

}
