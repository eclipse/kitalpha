/*******************************************************************************
 * Copyright (c) 2015, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.wizard.project.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.tools.internal.operations.SemanticResourceAdditionOperation;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.integration.sirius.listeners.SiriusHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSampleFactory;
import org.polarsys.kitalpha.vp.componentsample.wizard.project.Activator;

/**
 * 
 * @author Faycal Abka
 *
 */
@SuppressWarnings("restriction")
public class NewComponentsampleProject extends Wizard implements INewWizard {
	
	private static final ILog LOGGER = Activator.getDefault().getLog();
	private IWizardPage page;
	
	public NewComponentsampleProject() { 
		super();
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(Activator.ICON));
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
	}

	@Override
	public String getWindowTitle() {
		return "New Component sample Project"; //$NON-NLS-1$
	}
	
	@Override
	public void addPages() {
		page = new NewProjectPage("New Component sample Project"); //$NON-NLS-1$
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		return createProject();
	}

	private boolean createProject() {
		NewProjectPage _page = (NewProjectPage)page;
		final String projectName = _page.getProjectName();
		final String modelName = _page.getModelName();
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IProject csProject = root.getProject(projectName);
		
		if (csProject != null && !csProject.exists()){
			try {
				
				WorkspaceModifyOperation projectCreation = new WorkspaceModifyOperation() {
					
					@Override
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException, InterruptedException {
						
						monitor.beginTask("Project Creation", 1); //$NON-NLS-1$
						csProject.create(monitor);
						csProject.open(monitor);
					}
				};
				getContainer().run(false, false, projectCreation);
				

				WorkspaceModifyOperation createModels = new WorkspaceModifyOperation() {

					@Override
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException, InterruptedException {

						final ResourceSet resourceSet = new ResourceSetImpl();
						final URI fileURI = buildPlatformResourceURI(projectName, modelName, "componentsample"); //$NON-NLS-1$
						final Resource resource = resourceSet.createResource(fileURI);
						final ComponentModel componentModel = ComponentSampleFactory.eINSTANCE.createComponentModel();
						componentModel.setName(modelName);
						resource.getContents().add(componentModel);
						try {
							resource.save(Collections.emptyMap());

							URI representationURI = buildPlatformResourceURI(projectName, modelName, "aird");
							Session session = SessionManager.INSTANCE.getSession(representationURI, new NullProgressMonitor());

							Collection<URI> uris = new HashSet<URI>();
							uris.add(fileURI);

							Collection<Session> sessions = new HashSet<Session>();
							sessions.add(session);

							SemanticResourceAdditionOperation addModelSession = new SemanticResourceAdditionOperation(sessions, uris);

							getContainer().run(false, false, addModelSession);
							
							if (session != null && !session.isOpen()){
								session.save(new NullProgressMonitor());
								session.open(monitor);
							}
							
							referenceComponentSample(session);
							
						} catch (IOException e) {
							LOGGER.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
						}

					}
				};
				getContainer().run(false, false, createModels);
				
			} catch (InvocationTargetException e) {
				return false;
			} catch (InterruptedException e){
				return false;
			}
		}
		return true;
	}
	

	private URI buildPlatformResourceURI(String projectName, String modelName, String extension) {
		StringBuilder tmp = new StringBuilder();
		tmp.append(projectName).append("/").append(modelName).append(".").append(extension);
		return URI.createPlatformResourceURI(tmp.toString(), false);
	}


	private void referenceComponentSample(final Session session){
		if (session != null){
			final String COMPONENT_SAMPLE_ID = "org.polarsys.kitalpha.vp.componentsample";
			final ViewpointManager viewpointManager = SiriusHelper.getViewpointManager(session);
			Command ref = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					try {
						if (!viewpointManager.isReferenced(COMPONENT_SAMPLE_ID)){
							viewpointManager.reference(COMPONENT_SAMPLE_ID);
						}
					} catch (ViewpointActivationException e) {
						log("Can not reference viewpoint", COMPONENT_SAMPLE_ID, e);
					} catch (EvaluationException e) {
						log("Can not evaluate predicate for viewpoint", COMPONENT_SAMPLE_ID, e);
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(ref);
		}
	}
	
	private void log(final String message, final String vpid, Throwable e) {
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message + ": " + vpid , e);
		Activator.getDefault().getLog().log(status);
	}
}
