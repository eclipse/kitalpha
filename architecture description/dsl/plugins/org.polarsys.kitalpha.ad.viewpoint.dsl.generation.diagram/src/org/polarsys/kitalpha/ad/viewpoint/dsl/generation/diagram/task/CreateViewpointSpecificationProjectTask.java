/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.task;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.ui.tools.api.project.ViewpointSpecificationProject;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.util.DescriptionAdapterFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.VSMGenerationUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */

public class CreateViewpointSpecificationProjectTask implements ITaskProduction {

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		if (! VSMGenerationUtil.canExecuteTask(productionContext))
			return;
		
		final String modelName = productionContext.getInputValue("model.name", String.class);
		final String modelName_withextension = modelName+ "."+ ViewpointSpecificationProject.VIEWPOINT_MODEL_EXTENSION;
		final String designProjectName = productionContext.getInputValue("design.project.name", String.class);
		final String rootProjectName = productionContext.getInputValue("root.project.name", String.class);
		final IProgressMonitor fmonitor = monitor;
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(designProjectName);
				WorkspaceModifyOperation projectcreationOperation = new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException,
									InvocationTargetException, InterruptedException {
						if (! project.exists())
							ViewpointSpecificationProject.createNewViewpointSpecificationProject(designProjectName, modelName_withextension);
						else
						{
							IFolder description = project.getFolder("description");
							if (! description.exists())
							{
								description.create(IFolder.DEPTH_INFINITE, true, null);
							}

							IFile odesign_file = description.getFile(modelName_withextension);
							if (odesign_file.exists())
							{
								copyOdesignFile(odesign_file, monitor);
								try {
									clearODesignModelContent(odesign_file, monitor);
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}
					}
				};
				
				try {
					projectcreationOperation.run(fmonitor);
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		updateProjectDependecies(designProjectName, rootProjectName);
	}
	
	private void updateProjectDependecies(String designProjectName, String rootProjectName){
		List<String> requiredBundlesToAdd = new ArrayList<String>();
		requiredBundlesToAdd.add("org.eclipse.emf.ecore");
		requiredBundlesToAdd.add("org.eclipse.sirius.diagram");
		requiredBundlesToAdd.add(rootProjectName+".model");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(designProjectName);
		if (project != null && project.exists())
		{
			PDEUtility.updateRequiredBundles(project, requiredBundlesToAdd, new NullProgressMonitor());
			try {
				project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void clearODesignModelContent(IFile odesign_file, IProgressMonitor monitor) throws IOException{
		
		AdapterFactoryEditingDomain domain = 
		      new AdapterFactoryEditingDomain(new DescriptionAdapterFactory(), new BasicCommandStack());
		
		Resource resource = domain.createResource(odesign_file.getFullPath().toString());
		resource.load(null);
		EList<EObject> content = resource.getContents();
		if (content!= null && content.size() > 0)
		{
			EObject modelRootElement = content.get(0);
			if (modelRootElement instanceof Group)
			{
				final Group group = (Group) modelRootElement;
				// FIXME: To do this in a better way --> 
				// we can remove only generated viewpoint (viewpoint.name = short name)
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(group);
				
				EList<Viewpoint> viewpointList = new BasicEList<Viewpoint>(); 
				viewpointList.addAll(group.getOwnedViewpoints());
				CompoundCommand allRemoves = new CompoundCommand();
				for (EObject eObject : viewpointList) 
				{
					Command  remove = RemoveCommand.create(editingDomain, group, DescriptionPackage.eINSTANCE.getGroup_OwnedViewpoints() , eObject);
					allRemoves.append(remove);
				}
				editingDomain.getCommandStack().execute(allRemoves);
			}
			
			resource.save(Collections.EMPTY_MAP);
			resource.unload();
		}
	}
	
	/**
	 * @param project
	 * @param odesign_file
	 * @param monitor
	 * @throws CoreException
	 */
	private void copyOdesignFile(IFile odesign_file, IProgressMonitor monitor) throws CoreException {
		// Check if description_old folder existence
		IProject project = odesign_file.getProject();
		IFolder oldDescription = project.getFolder("description_old");
		if (! oldDescription.exists())
			oldDescription.create(true, true, monitor);

		// Create the copy file name 
		String fileExt = odesign_file.getFileExtension();
		IPath copyPath = odesign_file.getFullPath();
		copyPath = copyPath.removeFileExtension();
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
		String fileName = copyPath.lastSegment()+dateFormat.format(cal.getTime())+"."+fileExt;

		// Create the odesign file copy
		IFile copyFile = oldDescription.getFile(fileName);
		odesign_file.copy(copyFile.getFullPath(), 2, monitor);
	}
	
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
