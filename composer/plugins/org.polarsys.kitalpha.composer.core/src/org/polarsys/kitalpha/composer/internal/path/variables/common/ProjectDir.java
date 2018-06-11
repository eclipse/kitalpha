/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import java.io.FilenameFilter;
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
public class ProjectDir implements IComposerVariable {

	

	@Override
	public String getName() {
		return "projectDir"; //$NON-NLS-1$
	}

	@Override
	public String execute(Object obj) {
		String replacement = ""; //$NON-NLS-1$
		
		if (obj instanceof File) {
			File file = (File)obj;
			replacement = findProject(file);
			
		}
		
		if (obj instanceof EObject) {
			EObject eObject = (EObject) obj;
			replacement = WorkspaceSynchronizer.getFile(eObject.eResource()).getProject().getLocation().toString();
		}
		
		if(obj instanceof Resource){
			Resource res = (Resource)obj;
			replacement =  WorkspaceSynchronizer.getFile(res).getProject().getLocation().toString();
		
		}
		
		if (obj instanceof IResource) {
			IResource res = (IResource) obj;
			replacement = res.getProject().getLocation().toString();
		}
		
		
		if(obj instanceof ResourceSet){
			ResourceSet set = (ResourceSet)obj;
			List<Resource> resources = set.getResources();
			if(!resources.isEmpty()){
				Resource first = resources.get(0);
				replacement = execute(first);
			}else{
				String msg = "Your selection is empty"; //$NON-NLS-1$
				RuntimeException exception = new RuntimeException(msg);
				throw exception;
			}
			
		}
		return replacement;
	}

	private String findProject(File file) {
		String result = ""; ////$NON-NLS-1$
		if(file.isDirectory()){
			String[] contents = file.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File arg0, String arg1) {
					
					return arg1.equalsIgnoreCase(".project"); //$NON-NLS-1$
				}
			});
			
			if(contents.length > 0 ){
				result = file.getAbsolutePath();
				return result;
			}
			
		}
			result = findProject(file.getParentFile());
		
		return result;
	}

}
