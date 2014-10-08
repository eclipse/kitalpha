/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
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
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import org.polarsys.kitalpha.composer.api.path.variables.IComposerVariable;

/**
 * @author Guillaume Gebhart
 *
 */
public class ModelDir implements IComposerVariable {

	

	public String getName() {
		return "modelDir"; //$NON-NLS-1$
	}

	public String execute(Object obj) {
		String replacement = ""; //$NON-NLS-1$
	
		
		
		if (obj instanceof File) {
			File file = (File) obj;
			replacement= file.getParent();			 
		}
		
		if (obj instanceof IResource) {
			IResource res = (IResource) obj;
			 replacement= res.getLocation().toString();
			 
		}
		
		if (obj instanceof EObject) {
			EObject eObject = (EObject) obj;
			replacement =   WorkspaceSynchronizer.getFile(eObject.eResource()).getParent().getLocation().toString();

		}
		
		if(obj instanceof Resource){
			Resource res = (Resource)obj;
			replacement = WorkspaceSynchronizer.getFile(res).getParent().getLocation().toString();
		}
		
		if(obj instanceof ResourceSet){
			ResourceSet set = (ResourceSet)obj;
			List<Resource> resources = set.getResources();
			if(!resources.isEmpty()){
				Resource first = resources.get(0);
				replacement = execute(first);
			}else{
				String msg = "Your selection is empty";
				RuntimeException exception = new RuntimeException(msg);
				throw exception;
			}
	}
		return replacement;
	}

}
