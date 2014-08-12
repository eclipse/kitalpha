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
package org.polarsys.kitalpha.doc.gen.business.core.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.pattern.EGFPatternPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;


import org.eclipse.sirius.business.api.session.Session;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "mpe". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */

public abstract class HTMLDocumentationGenerationWizard extends Wizard
		implements INewWizard {

	private HTMLDocumentationGenerationWizardPage page;
	private ISelection selection;
	public static final String DEFAULT_LAUNCHER_LABEL = "Default Launcher";

	protected abstract Map<String, URI> getLaunchersURI();

	/**
	 * Constructor for HTMLDocumentationGenerationWizard.
	 */
	public HTMLDocumentationGenerationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public HTMLDocumentationGenerationWizard(
			IStructuredSelection structuredSelection) {
		super();
		setNeedsProgressMonitor(true);
		this.selection = structuredSelection;
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new HTMLDocumentationGenerationWizardPage(selection);
		page.setLauncherUris(getLaunchersURI());
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		LabelProviderHelper.initImageRegistry();
		String containerName = page.getContainerName();
		List<URI> modelURIList = getURIList(page.getModelURI());
		final String projectName = getProjectName(containerName);
		final String outputFolder = getOutputFolder(containerName);
		Activity melodyLauncher = InvokeActivityHelper
				.getActivity(getLaunchersURI().get(page.getSelectedLauncher()));
		for (URI uri : modelURIList) {
			URI semanticResourceURI = uri;
			if (uri.lastSegment().endsWith(".aird")) {
				DiagramSessionHelper.setAirdUri(uri);
				Session session = DiagramSessionHelper.initSession();
				Collection<Resource> resources = session.getSemanticResources();

				if (!resources.isEmpty()) {
					Resource semanticResource = resources.iterator().next();
					semanticResourceURI = semanticResource.getURI();
				}
			}
			execute(melodyLauncher, projectName, outputFolder,
					semanticResourceURI);

		}

		return true;
	}

	private List<URI> getURIList(String modelURI) {
		Set<URI> uriSet = new HashSet<URI>();
		StringTokenizer tokenizer = new StringTokenizer(modelURI);
		while (tokenizer.hasMoreElements()) {
			String nextURI = tokenizer.nextElement().toString();
			uriSet.add(URI.createURI(nextURI));
		}
		return new ArrayList<URI>(uriSet);
	}

	private void execute(Activity melodyLauncher, final String projectName,
			final String outputFolder, final URI uri) {
			IPath path = new Path(projectName + "/" + outputFolder);
			path = path.append("output");
			IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
			if(!folder.exists()) {
				try {
					folder.create(true, true, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		if (melodyLauncher instanceof FactoryComponent) {
			final FactoryComponent factoryComponent = (FactoryComponent) melodyLauncher;

			setContract(factoryComponent, "projectName", projectName);
			setContract(factoryComponent, "outputFolder", outputFolder + "/output");
			setDomain(factoryComponent, uri);
			try {
				InvokeActivityHelper.invoke(factoryComponent);
			} catch (Exception e) {
				EGFPatternPlugin.getDefault().logError(e);
			}
		}

	}

	private void setDomain(FactoryComponent factoryComponent, URI uri) {
		Viewpoint viewpoint = factoryComponent.getViewpointContainer()
				.getViewpoint(DomainViewpoint.class);
		if (viewpoint instanceof DomainViewpoint) {
			DomainViewpoint domainViewpoint = (DomainViewpoint) viewpoint;
			Domain domain = domainViewpoint.getDomains().get(0);
			if (domain instanceof EMFDomain) {
				EMFDomain domainURI = (EMFDomain) domain;
				domainURI.setUri(uri);
			}
		}

	}

	private void setContract(FactoryComponent factoryComponent,
			String contractName, String value) {

		Contract invokedContract = factoryComponent.getContract(contractName);

		Type type = invokedContract.getType();
		if (type instanceof TypeString) {
			TypeString typeString = (TypeString) type;
			typeString.setValue(value);
		}

	}

	private String getOutputFolder(String containerName) {
		String projectName = getProjectName(containerName);
		IPath outputFolderPath = new Path(containerName);
		outputFolderPath = outputFolderPath
				.makeRelativeTo(new Path(projectName));
		return outputFolderPath.toString();
	}

	private String getProjectName(String containerName) {
		IContainer container = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(new Path(containerName));
		return container.getProject().getName();
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
