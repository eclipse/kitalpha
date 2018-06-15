/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.internal;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternExecutionReporter;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */
public class ActivityExplorerPluginXmlReporter implements PatternExecutionReporter {

	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();

	@Override
	public void executionFinished(String output, PatternContext context) {
		String projectName = (String) context.getValue("activity.explorer.project.name");
		IProject project =ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try {
			updatePluginXml(project, output);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			// Add plugin.xml in the build.properties file
			PDEUtility.updateBuild_BinInclude(project, "plugin.xml", false, Null_Progress_Monitor);
		}
	}

	public void updatePluginXml(final IProject project, final String content) throws InvocationTargetException, InterruptedException{

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
				ByteArrayInputStream outputContent = new ByteArrayInputStream(content.getBytes());
				try {
					IFile file = project.getFile("plugin.xml");
					if (file.exists()) {
						file.setContents(outputContent, true, false, null);
					} else {
						file.create(outputContent, true, null);
					}

				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		};
		operation.run(Null_Progress_Monitor);

		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
	}
}
