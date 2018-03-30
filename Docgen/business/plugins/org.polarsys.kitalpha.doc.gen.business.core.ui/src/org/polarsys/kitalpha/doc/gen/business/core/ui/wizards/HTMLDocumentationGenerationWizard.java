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
package org.polarsys.kitalpha.doc.gen.business.core.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeException;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;

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
	private HTMLDocumentationBrandingWizardPage brandingPage;
	private ISelection selection;
	public static final String DEFAULT_LAUNCHER_LABEL = "Default Launcher";

	protected abstract Map<String, URI> getLaunchersURI();
	
	protected List<EObject> selectedModelElements = new ArrayList<EObject>();
	
	private boolean scopedGeneration = false;

	/**
	 * Constructor for HTMLDocumentationGenerationWizard.
	 */
	public HTMLDocumentationGenerationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public HTMLDocumentationGenerationWizard(IStructuredSelection structuredSelection) {
		super();
		setNeedsProgressMonitor(true);
		this.selection = handleSelection(structuredSelection);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new HTMLDocumentationGenerationWizardPage(selection);
		page.setLauncherUris(getLaunchersURI());
		page.setScopedGeneration(scopedGeneration);
		addPage(page);
		
		brandingPage = new HTMLDocumentationBrandingWizardPage();
		addPage(brandingPage);
	}
	
	protected final ISelection handleSelection(ISelection selection_p){
		if (selection_p instanceof TreeSelection)
		{
			TreeSelection treeSelection = (TreeSelection) selection_p;
			final Object firstSelection = treeSelection.getFirstElement();
			if (!(firstSelection instanceof IFile))
			{
				// Initialize the generation scope.
				final Object[] array = treeSelection.toArray();
				for (Object object : array) 
				{
					if (object instanceof EObject)
					{
						this.selectedModelElements.add((EObject)object);
					}
					else
					{
						throw new IllegalArgumentException("Documetation generation bad input :" + object.toString());
					}
				}
				this.scopedGeneration = true;
				// Create a new TreeSelection object containing the aird file.
				TreePath treePath = new TreePath(new Object[]{treeSelection.getPaths()[0].getSegment(0), treeSelection.getPaths()[0].getSegment(1)});
				selection_p = new TreeSelection(treePath);
			}
		}
		return selection_p;
	}
	
	private void initializeScope(ScopeReferencesStrategy referencesStrategy){
		// Clean old scope data.
		GenerationGlobalScope.getInstance().cleanScope();
		
		// Initialize scope strategies
		GenerationGlobalScope.getInstance().setReferencesStrategy(referencesStrategy);
		
		// Initialize scope.
		if (selectedModelElements != null && !selectedModelElements.isEmpty())
		{
			for (EObject eObject : selectedModelElements) 
			{
				try {
					GenerationGlobalScope.getInstance().addToScope(eObject);
				} catch (ScopeException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		brandingPage.askUserForUpdatingBrandingDataPreferences();
		
		/** Collect data from wizard pages **/
		final String modelURI = page.getModelURI();
		final String containerName = page.getContainerName();
		final String selectedLauncher = page.getSelectedLauncher();
		final ScopeReferencesStrategy referencesStrategy = page.getReferencesStrategy();
		
		final String copyright = brandingPage.getCopyright();
		final String logoAlt = brandingPage.getLogoAlt();
		final String logoPath = brandingPage.getLogoPath();
		
		initializeScope(referencesStrategy);
		
		LabelProviderHelper.initImageRegistry();
		
		List<URI> modelURIList = getURIList(modelURI);
		final String projectName = getProjectName(containerName);
		final String outputFolder = getOutputFolder(containerName);
		Activity melodyLauncher = InvokeActivityHelper.getActivity(getLaunchersURI().get(selectedLauncher));
		for (URI uri : modelURIList) 
		{
			URI semanticResourceURI = uri;
			if (uri.lastSegment().endsWith(".aird")) //$NON-NLS-1$
			{
				DiagramSessionHelper.setAirdUri(uri);
				Session session = DiagramSessionHelper.initSession();
				Collection<Resource> resources = session.getSemanticResources();
				
				if (!resources.isEmpty()) 
				{
					/*
					 * FIXME a workaround to skip launching the HTML GenDoc on the AFM models
					 * AFM models are used by Kitalpha Viewpoint Framework and are the first
					 * resource in session semantic resource list.
					 * 
					 * This solution must be replaced by a more generic mechanism for launching
					 * the generation on models.
					 * 
					 * Bug: https://bugs.polarsys.org/show_bug.cgi?id=1338
					 */
					
					Iterator<Resource> iterator = resources.iterator();
					while (iterator.hasNext()){
						Resource next = iterator.next();
						URI uri2 = next.getURI();
						if (uri2.lastSegment().endsWith(".afm")){ //$NON-NLS-1$
							continue;
						}
						//Keeping the aird URI if the semantic resource uri is null (i.e., the semantic
						//model doesn't exist)
						semanticResourceURI = uri2 == null? semanticResourceURI : uri2;
						break;
					}
					
				}
			}
			execute(melodyLauncher, projectName, outputFolder, semanticResourceURI, copyright, logoAlt, logoPath);
		}

		return true;
	}

	private List<URI> getURIList(String modelURI) {
		Set<URI> uriSet = new HashSet<URI>();
		StringTokenizer tokenizer = new StringTokenizer(modelURI);
		while (tokenizer.hasMoreElements()) 
		{
			String nextURI = tokenizer.nextElement().toString();
			uriSet.add(URI.createURI(nextURI));
		}
		return new ArrayList<URI>(uriSet);
	}

	private void execute(Activity melodyLauncher, 
						 final String projectName, 
						 final String outputFolder, 
						 final URI uri,
						 final String copyright,
						 final String logoAlt,
						 final String logoPath) {
		IPath path = new Path(projectName + "/" + outputFolder);
		path = path.append("output");
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
		if(!folder.exists()) 
		{
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				EGFPatternPlugin.getDefault().logError(e);
			}
		}
		
		if (melodyLauncher instanceof FactoryComponent) 
		{
			final FactoryComponent factoryComponent = (FactoryComponent) melodyLauncher;

			/** Setting the values of the mandatory contracts **/
			setContract(factoryComponent, "projectName", projectName, true);
			setContract(factoryComponent, "outputFolder", outputFolder + "/output", true);
			setDomain(factoryComponent, uri);
			
			/** Setting the values of the optional contracts **/
			setContract(factoryComponent, "copyright", copyright, false);
			setContract(factoryComponent, "logo.alt", logoAlt, false);
			setContract(factoryComponent, "logo.path", logoPath, false);
			
			try {
				InvokeActivityHelper.invoke(factoryComponent);
			} catch (Exception e) {
				EGFPatternPlugin.getDefault().logError(e);
			}
		}

	}

	private void setDomain(FactoryComponent factoryComponent, URI uri) {
		Viewpoint viewpoint = factoryComponent.getViewpointContainer().getViewpoint(DomainViewpoint.class);
		if (viewpoint instanceof DomainViewpoint) 
		{
			DomainViewpoint domainViewpoint = (DomainViewpoint) viewpoint;
			Domain domain = domainViewpoint.getDomains().get(0);
			if (domain instanceof EMFDomain) 
			{
				EMFDomain domainURI = (EMFDomain) domain;
				domainURI.setUri(uri);
			}
		}
	}

	private void setContract(FactoryComponent factoryComponent, String contractName, String value, boolean mandatory) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		if (invokedContract != null)
		{
			Type type = invokedContract.getType();
			if (type instanceof TypeString) 
			{
				TypeString typeString = (TypeString) type;
				typeString.setValue(value);
			}
		}
		else
		{
			if (mandatory)
			{
				throw new IllegalArgumentException("Can't find the mandatory contract " + contractName + 
												   " in the factory component " + factoryComponent.getName());
			}
		}
	}

	private String getOutputFolder(String containerName) {
		String projectName = getProjectName(containerName);
		IPath outputFolderPath = new Path(containerName);
		outputFolderPath = outputFolderPath.makeRelativeTo(new Path(projectName));
		return outputFolderPath.toString();
	}

	private String getProjectName(String containerName) {
		IContainer container = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(containerName));
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
