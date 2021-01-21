/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.builder;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.impl.XtextBuilder;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.NatureID;

/**
 * 
 * @author Faycal Abka
 *
 */
@SuppressWarnings("restriction")
public class VpdslXtextBuilder extends XtextBuilder {

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		IProject project = getProject();
		/*
		 * This tip allows to map editors via builder participant to 
		 * map a resource (file) with periodic extension to the 
		 * right editor.
		 * This issue occurs occasionaly when importing new
		 * project in newly created workspace. 
		 */
		if (project.hasNature((NatureID.VPDSL_PROJECT_NATURE))){
			return viewpointProjectBuild(kind, args, monitor);
		}
		return super.build(kind, args, monitor);
	}

	private IProject[] viewpointProjectBuild(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		fullBuild(monitor, false);
		return getProject().getReferencedProjects();
	}
}
