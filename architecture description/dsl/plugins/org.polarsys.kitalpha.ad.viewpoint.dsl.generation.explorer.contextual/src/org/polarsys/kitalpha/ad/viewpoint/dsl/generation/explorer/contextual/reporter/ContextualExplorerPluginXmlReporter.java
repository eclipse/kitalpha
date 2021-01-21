/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.reporter;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.util.ClassUtils;

/**
 * @author Boubekeur Zendagui
 */
public class ContextualExplorerPluginXmlReporter implements
		PatternExecutionReporter {
	
	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();

	public void executionFinished(String output, PatternContext context) {
		String projectName = ClassUtils.INSTANCE.getProjectName();
		IProject project =ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try {
			updatePluginXml(project, output);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void updatePluginXml(final IProject project, final String content) 
	throws InvocationTargetException, InterruptedException{

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
				ByteArrayInputStream outputContent = new ByteArrayInputStream(content.getBytes());
				try {
					IFile file = project.getFile("plugin.xml");
					if (file.exists())
						file.setContents(outputContent, true, false, null);
					else
						file.create(outputContent, true, null);

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
	
	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
		// TODO Auto-generated method stub
	}
}
