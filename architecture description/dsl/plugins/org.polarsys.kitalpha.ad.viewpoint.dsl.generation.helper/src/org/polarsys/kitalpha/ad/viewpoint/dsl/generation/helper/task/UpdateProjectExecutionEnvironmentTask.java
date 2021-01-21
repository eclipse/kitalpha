/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.task;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ClasspathComputer;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.osgi.framework.Constants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.operation.BundleModelModification;

/**
 * @author Boubekeur Zendagui
 */

@SuppressWarnings("restriction")
public class UpdateProjectExecutionEnvironmentTask extends AbstractProjectUpdateTask{

	/** Lock object used to handle multiple invocation of version update on different projects **/
	private static final Object bundleLock = new Object();
	
	/** Contracts related to version changing **/
	protected static final String PORJECT_EE_CONTRACT = "project.ee";
	
	@Override
	public void updateProject(IProject project, ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String ee = productionContext.getInputValue(PORJECT_EE_CONTRACT, String.class);
		ee = preparateEE(ee);
		Assert.isNotNull(ee, "Execution Environment contract should have a value"); //$NON-NLS-1$
		updatePluginVersion(project, ee, monitor);
	}
	
	/**
	 * Update the Required Execution environment of a plug-in project
	 * @param project the {@link IProject} of the plug-in project
	 * @param ee the new value of execution environments
	 * @param monitor an {@link IProgressMonitor}
	 * @throws InvocationException 
	 */
	private void updatePluginVersion(IProject project, String ee, IProgressMonitor monitor) throws InvocationException{
		synchronized (bundleLock) 
		{
			IFile manifest = project.getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR);
			if (manifest == null || ! manifest.exists())
			{
				throw new IllegalArgumentException("The Manifest file doesn't exists");
			}
			else
			{
				@SuppressWarnings("deprecation")
				BundleModelModification operation = new BundleModelModification(manifest, Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, ee);
				PDEModelUtility.modifyModel(operation, monitor);
				try {
					project.refreshLocal(IProject.DEPTH_INFINITE, monitor);
					updateClasspathSettings(project, monitor);
				} catch (CoreException e) {
					throw new InvocationException(e);
				}
			}
		}
	}
	
	/**
	 * Update the ClassPath settings for a given project and build it.
	 * @param project an {@link IProject}
	 * @param monitor a {@link IProgressMonitor}
	 * @throws CoreException thrown if any problem occurs 
	 */
	private void updateClasspathSettings(IProject project, IProgressMonitor monitor){
		IPluginModelBase model = PluginRegistry.findModel(project);
		if (model != null) 
		{
			try {
				ClasspathComputer.setClasspath(project, model);
				if (ResourcesPlugin.getWorkspace().isAutoBuilding()) 
				{
					project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
				}
			} catch (CoreException e) {
			}
		}
	}
	
	/**
	 * Translating the Execution Environment (EE) string in a valid form.
	 * @param ee the EE or a list of EE separated by a comma.
	 * @return the translated EE string
	 */
	private String preparateEE(String ee){
		StringBuffer buffer = new StringBuffer();
		if (ee.contains(","))
		{
			final String[] eeTable = ee.split(",");
			for (int i = 0; i < eeTable.length; i++) 
			{
				String id = eeTable[i].trim();
				if (buffer.length() > 0) 
				{
					buffer.append(","); //$NON-NLS-1$
					buffer.append(System.getProperty("line.separator"));
					buffer.append(" "); //$NON-NLS-1$
				}
				buffer.append(id);
			}
		}
		else
		{
			buffer.append(ee);
		}
		return buffer.toString();
	}
}
