/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;

public abstract class AbstractViewpointProjectWizard extends Wizard implements INewWizard {

	private static final NullProgressMonitor NULL_PROGRESS_MONITOR = new NullProgressMonitor();

	protected abstract Viewpoint createModel(String vpName, String viewpointShortName) throws CoreException;

	protected abstract String getProjectName();

	protected abstract String getViewpointName();

	protected abstract String getViewpointShortName();

	protected abstract String getViewpointId();

	protected ISelection selection;
	protected final AFProjectHelper projectHelper;

	public AbstractViewpointProjectWizard(AFProjectHelper projectHelper) {
		super();
		this.projectHelper = projectHelper;
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final String projectName = getProjectName();
		final String viewpointName = getViewpointName();
		final String viewpointShortName = getViewpointShortName();
		final String viewpointId = getViewpointId();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					monitor.beginTask("Creating artifacts for extension " + projectName, 4);
					Viewpoint model = createModel(viewpointName, viewpointId);
					String vpURI = '/' + projectName + "/model/" + viewpointShortName + ".vp";
					IProject project = createProject(projectName, viewpointName, viewpointId, monitor, model.getVpid(), vpURI);
					saveModel(model, vpURI);
					monitor.done();
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			AD_Log.getDefault().logError(e);
			return false;
		}
		return true;
	}

	protected void saveModel(Viewpoint vp, String vpURI) throws CoreException {
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(vpURI, false);
		Resource createResource = set.createResource(uri);
		createResource.getContents().add(vp);
		try {
			createResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.getSymbolicName(), e.getMessage(), e));
		}
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	protected IProject createProject(final String projectName, final String viewpointName, final String viewpointId, IProgressMonitor monitor, String vpuuid, String vpURI) throws CoreException, IOException {
		return projectHelper.createProject(projectName, viewpointName, viewpointId, vpuuid, vpURI, monitor);
	}

}