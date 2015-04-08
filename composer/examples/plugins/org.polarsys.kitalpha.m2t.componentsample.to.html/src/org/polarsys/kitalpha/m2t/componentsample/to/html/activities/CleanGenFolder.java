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
package org.polarsys.kitalpha.m2t.componentsample.to.html.activities;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.m2t.componentsample.to.html.Activator;

/**
 * 
 * @author Faycal Abka
 *
 */
public class CleanGenFolder implements IActivity {

	public CleanGenFolder() {
	}

	private void cleanFolder(final IPath target_f, final IProgressMonitor monitor) {
		final IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(target_f);
		try {
			folder.accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource.isAccessible() && 
							!folder.getFullPath().toString().equals(resource.getFullPath().toString()))
						resource.delete(true, monitor);
					return true;
				}
			});
			folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public IStatus run(ActivityParameters activityParams_p) {
		String path = (String) activityParams_p.getParameter("Path").getValue();
		IPath targetPath = new Path(path);
		
		cleanFolder(targetPath, new NullProgressMonitor());
		
		IStatus ok = new Status(IStatus.OK, Activator.PLUGIN_ID, "Folder Is Cleaned");
		
		return ok;
	}

	@Override
	public Collection<DeclaredParameter> getParameters(){
		Collection<DeclaredParameter> parameter = new HashSet<DeclaredParameter>();
		parameter.add(new DeclaredParameter("Path", "/", "Path to gen folder"));
		return parameter;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters_p) {
		
		Object object = valuedParameters_p.getParameter("Path").getValue();
		
		if (object != null && object instanceof String){
			String p = (String)object;
			if (p.isEmpty()){
				ParameterError<?> error = new ParameterError(valuedParameters_p.getParameter("Path"), "The Path must be not null or empty");
				Map<String, ParameterError<?>> reasons = new HashMap<String, ParameterError<?>>();
				reasons.put("Path", error);
				return reasons;
			}
		}
		return Collections.emptyMap();
	}

}
