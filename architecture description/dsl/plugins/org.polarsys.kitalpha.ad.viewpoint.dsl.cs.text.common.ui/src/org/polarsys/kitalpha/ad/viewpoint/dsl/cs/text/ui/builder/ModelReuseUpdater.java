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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.builder;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.PluginUtil;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class ModelReuseUpdater implements IXtextBuilderParticipant {
	
	public ModelReuseUpdater() {}

	/**
	 * remove model reuse extension of deleted resources
	 */
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		List<Delta> deltas = context.getDeltas();
		final IProject builtProject = context.getBuiltProject();
		final int numberOfDeltas = deltas.size();
		for (int i = 0 ; i < numberOfDeltas ; i++) {
			DefaultResourceDescriptionDelta dd = (DefaultResourceDescriptionDelta) deltas.get(i);
			if (dd.getOld()!=null && dd.getNew()==null && ResourceHelper.hasPeriodicFileExtension(dd.getUri())) {
				handleDeletion(builtProject, dd);
			}
		}
	}

	private void handleDeletion(IProject project, IResourceDescription.Delta delta) {
		URI uri = delta.getUri();
		if (uri.isPlatformResource()) {
			Path path = new Path(uri.toPlatformString(true));
			
			if(!getWorkspaceRoot().getFile(path).exists()) {
				PluginUtil.removeModelReuseExtension(project.getName(), uri);
			}
		}	
	}

	private IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}
