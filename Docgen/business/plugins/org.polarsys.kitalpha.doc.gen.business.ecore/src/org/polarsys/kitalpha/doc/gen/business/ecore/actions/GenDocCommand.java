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
package org.polarsys.kitalpha.doc.gen.business.ecore.actions;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.egf.model.pattern.TypePatternSubstitution;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.pattern.EGFPatternPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.ecore.services.GenerateDiagramsService;

public class GenDocCommand {
	private Activity launcher;
	private String folderPath;
	private Resource resource;
	private IPath path;
	
	private TypePatternSubstitution patternSubstitutions;
	
	private URI airdUri;
	private GenerateDiagramsService generateDiagramService;
	
	private final IProgressMonitor progressMonitor ;
	
	private String copyright;
	private String logoPath;
	private String logoAlt;
	
	private static final String PROJECT_CONTRACT_NAME = "projectName";
	private static final String OUTPUT_FOLDER_CONTRACT_NAME = "outputFolder";
	
	public static final String COPYRIGHT_CONTRACT_NAME = "copyright";
	public static final String LOGO_PATH_CONTRACT_NAME = "logo.path";
	public static final String LOGO_ALT_CONTRACT_NAME = "logo.alt";

	public GenDocCommand(Activity launcher, final String folderPath, final Resource resource, TypePatternSubstitution substitutions, IProgressMonitor monitor) {
		this.launcher = launcher;
		this.folderPath = folderPath;
		this.resource = resource;
		this.patternSubstitutions = substitutions;
		this.progressMonitor = monitor;
	}

	/**
	 * Copyright setter
	 * @param copyright the copyright value
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 * Logo path setter
	 * @param logoPath the Logo path value
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	/**
	 * Logo alternative text setter
	 * @param logoAlt the Logo alternative text value
	 */
	public void setLogoAlt(String logoAlt) {
		this.logoAlt = logoAlt;
	}

	public void execute(IProgressMonitor progressMonitor) {
		createProject();
		cleanFiles();
		if (DocgenDiagramPreferencesHelper.getExportDiagram())
		{
			generateDiagrams(progressMonitor);
			DiagramSessionHelper.setAirdUri(airdUri);
		}
		generateDocumentation(progressMonitor);
	}

	private void createProject() {
		path = new Path(folderPath);
		path = path.append("output");
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
		if (!folder.exists()) 
		{
			try 
			{
				folder.create(true, true, null);
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}
	}

	private void generateDocumentation(IProgressMonitor progressMonitor) {
		Session session = DiagramSessionHelper.initSession();
		if (launcher instanceof FactoryComponent) 
		{
			final FactoryComponent factoryComponent = (FactoryComponent) launcher;
			setContract(factoryComponent, PROJECT_CONTRACT_NAME, getProjectName(folderPath), true);
			setContract(factoryComponent, OUTPUT_FOLDER_CONTRACT_NAME, getOutputFolder(folderPath) + "/output", true);
			
			setContract(factoryComponent, COPYRIGHT_CONTRACT_NAME, copyright, false);
			setContract(factoryComponent, LOGO_ALT_CONTRACT_NAME, logoAlt, false);
			setContract(factoryComponent, LOGO_PATH_CONTRACT_NAME, logoPath, false);
			
			setDomain(factoryComponent, resource.getURI());
			if (null != patternSubstitutions) {
				setPatternsubstitutionContract(factoryComponent, "pattern.substitutions", patternSubstitutions);
			}
			try 
			{
				InvokeActivityHelper.invoke(factoryComponent, progressMonitor);
			} 
			catch (Exception e) 
			{
				EGFPatternPlugin.getDefault().logError(e);
			}
		}
		
		if (session != null && session.isOpen())
		{
			session.save(progressMonitor);
			session.close(progressMonitor);
		}
		
		OperationHistoryFactory.getOperationHistory().dispose(IOperationHistory.GLOBAL_UNDO_CONTEXT, true, true, true);
	}
	
	private void cleanFiles() {
		if (resource.getContents() == null || (resource.getContents() != null && resource.getContents().isEmpty())) {
			return;
		}
		
		String modelName = DocGenHtmlUtil.getModelName(resource.getContents().get(0));
		IPath modelPath = path.append(modelName);
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(modelPath);
		try 
		{
			if (folder != null && folder.exists()) 
			{
				IResource[] members = folder.members();
				for (IResource res : members) 
				{
					res.delete(true, progressMonitor);
				}
			}
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
	}

	public void layoutRepresentations() {
		if (airdUri != null) 
		{
			Display.getDefault().syncExec(new Runnable() 
			{
				@Override
				public void run() {
					generateDiagramService.layout(airdUri);
				}
			});

		}
	}

	private void generateDiagrams(IProgressMonitor progressMonitor) {
		generateDiagramService = new GenerateDiagramsService(resource, path);
		airdUri = generateDiagramService.generateAIRD(progressMonitor);
		generateDiagramService.dispose();
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
	
	private void setPatternsubstitutionContract(FactoryComponent factoryComponent,
			String contractName, TypePatternSubstitution value){
		
		if (value == null || value.getSubstitutions().isEmpty()) {
			return;
		}
		
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypePatternSubstitution) 
		{
			TypePatternSubstitution typePatternSubstitution = (TypePatternSubstitution) type;
			typePatternSubstitution.getSubstitutions().addAll(value.getSubstitutions());
		}
	}

	/**
	 * This contract value setter will checks if
	 * <ul>
	 * 	<li> The contract exists: If it doesn't exists then raise an exception. </li>
	 * 	<li> The value is not null: If the <code>value == null</code> and if <code>mandatory == true</code> then raise an exception. </li>
	 * </ul> 
	 * @param factoryComponent The {@link Activity} to run
	 * @param contractName the name of the contract
	 * @param value the value to set to the contract
	 * @param mandatory <code>True</code> means that the contract is defined as mandatory.
	 */
	private void setContract(FactoryComponent factoryComponent, String contractName, String value, boolean mandatory) {
		if (contractName != null && ! contractName.isEmpty())
		{
			Contract invokedContract = factoryComponent.getContract(contractName);
			if (invokedContract == null) {
				throw new IllegalStateException("[GenDocCommand] The contract " +contractName+ " doesn't exists");
			}
		}
		
		if (mandatory)
		{
			if (value != null) {
				setContract(factoryComponent, contractName, value);
			} else {
				throw new IllegalStateException("[GenDocCommand] The contract " + contractName + " is mandatory but the value is null");
			}
		}
		else
		{
			setContract(factoryComponent, contractName, value);
		}
	}
	
	private void setContract(FactoryComponent factoryComponent, String contractName, String value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeString) 
		{
			TypeString typeString = (TypeString) type;
			typeString.setValue(value);
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
}
