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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.ta.extension.TargetApplicationExtensionManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GenerationConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.TargetApplication;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.preference.helper.VPRootProjectNamePreferencesHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.exceptions.CantConcreteSyntaxResourceCreator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.extensions.ConcreteSyntaxResourceCreationManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.utils.ProjectsManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.utils.VPDescModelManager;

/**
 * @author Boubekeur Zendagui
 */

public class NewDSLVpProjectWizard extends Wizard implements INewWizard {

	private final StringBuffer PLUGIN_XML_HEADER = 
							new StringBuffer().append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
											  .append("<?eclipse version=\"3.4\"?>\n")
										 	  .append("<plugin>\n");
	private final StringBuffer PLUGIN_XML_FOOTER = new StringBuffer().append("</plugin>\n");
	
	/** Target application root project name **/
	protected String taRootProjectName;
	/** Target application nsuri **/
	protected String taRootNsURI;
	
	/** Selected target application name**/
	protected String vpTargetApplication;
	/** Provided viewpoint short name**/
	protected String vpShortName;
	/** Viewpoint root project name **/
	protected String vpRootProjectName;
	/** Viewpoint description project name **/
	protected String vpDescriptionProjectName;
	/** Viewpoint nsuri **/
	protected String vpNsURI;

	/** Indicate if the NsUri is to be generated or not **/
	private boolean generateNsURI = true;
	
	protected Map<String, String> selectedConcreteSyntaxCreators;
	
	protected NewDSLVpProjectPage page;
	protected NewDSLVpProjectSecondPage sPage;
	protected ISelection selection;
	
	protected IProgressMonitor monitor;
	
	protected ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin("org.polarsys.kitalpha.ad.viewpoint.dsl.services.project", //$NON-NLS-1$
										"icons/project_new_wizard.png"); //$NON-NLS-1$
	
	public NewDSLVpProjectWizard() {
		super();
		this.setWindowTitle(Messages.Wizard_New);
		super.setDefaultPageImageDescriptor(image);
		super.setNeedsProgressMonitor(true);
	}
	
	protected void setGenerateNsUri(boolean generate){
		this.generateNsURI = generate;
	}
	
	public void setVpTargetApplication(String vpTargetApplication) {
		checkStringArgument(vpTargetApplication, "Target application name");
		this.vpTargetApplication = vpTargetApplication;
		// Initialize Target Application data
		if (! VPRootProjectNamePreferencesHelper.useTargetApplicationValue())
			taRootProjectName = VPRootProjectNamePreferencesHelper.getCustomizedValue();
		else
			taRootProjectName = TargetApplicationExtensionManager.getRootProjectName(this.vpTargetApplication).toLowerCase();
		
		taRootNsURI = TargetApplicationExtensionManager.getRootNsUri(this.vpTargetApplication).toLowerCase();
		// Initialize Viewpoint data
		updateViewpointData();
	}
	
	private void updateViewpointData(){
		if (null != vpTargetApplication && vpTargetApplication.trim().length() > 0)
		{
			if (null != vpShortName && vpShortName.trim().length() > 0)
			{
				setVpRootProjectName(taRootProjectName+"."+vpShortName);
				setVpDescriptionProjectName(getVpRootProjectName()+".vpdsl");
				
				// Initialize the Viewpoint NsURI
				if (generateNsURI)
				{
					final String nsUri = (taRootNsURI.endsWith("/") ? taRootNsURI + vpShortName : taRootNsURI + "/"+ vpShortName);
					setVpNsURI(nsUri);
				}
					
			}
		}
	}
	
	public String getVpTargetApplication() {
		return vpTargetApplication;
	}
	
	public String getVpShortName() {
		return vpShortName;
	}
	
	public void setVpShortName(String vpShortName) {
		checkStringArgument(vpShortName, "Viewpoint short name");
		this.vpShortName = vpShortName;
		updateViewpointData();
	}
	
	public String getVpRootProjectName() {
		return vpRootProjectName;
	}

	public void setVpRootProjectName(String vpRootProjectName) {
		checkStringArgument(vpRootProjectName, "Viewpoint root project name");
		this.vpRootProjectName = vpRootProjectName.toLowerCase();
	}

	public void setVpDescriptionProjectName(String vpDescriptionProjectName) {
		checkStringArgument(vpDescriptionProjectName, "Viewpoint description project name");
		this.vpDescriptionProjectName = vpDescriptionProjectName.toLowerCase();
	}
	
	public String getVpDescriptionProjectName() {
		return vpDescriptionProjectName;
	}

	public String getTaNsURI() {
		return taRootNsURI;
	}

	public void setTaNsURI(String nsURI) {
		checkStringArgument(nsURI, "Target application root nsuri");
		this.taRootNsURI = nsURI;
	}
	
	public String getVpNsURI() {
		return vpNsURI;
	}

	public void setVpNsURI(String nsURI) {
		checkStringArgument(nsURI, "Viewpoint nsuri");
		this.vpNsURI = nsURI;
	}
	
	public Map<String, String> getSelectedConcreteSyntaxCreators() {
		return selectedConcreteSyntaxCreators;
	}

	public void setSelectedConcreteSyntaxCreators(
			Map<String, String> selectedConcreteSyntaxCreators) {
		this.selectedConcreteSyntaxCreators = selectedConcreteSyntaxCreators;
	}
	
	private void checkStringArgument(String arg, String argName){
		if (null == arg)
			throw new IllegalArgumentException("Argument : " + argName + " can't be null");
		
		if (arg.trim().length() == 0)
			throw new IllegalArgumentException("Argument : " + argName + " must have a value");
	}
	
	protected void addFirstPage(){
		page = new NewDSLVpProjectPage(selection);
		page.setTitle(Messages.Wizard_Page_First_Title);
		page.setDescription(Messages.Wizard_Page_First_Description);
		addPage(page);
	}
	
	protected void addSecondPage(){
		sPage = new NewDSLVpProjectSecondPage(selection);
		sPage.setTitle(Messages.Wizard_Page_Second_Title);
		sPage.setDescription(Messages.Wizard_Page_Second_Description);
		addPage(sPage);
	}
	
	
	public void addPages() {
		super.addPages();
		addFirstPage();
		addSecondPage();
	}
	
	public boolean performFinish() {
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						// Create vpDsl project 
						IProject project = createVpDslProject(monitor);
						// create vpDesc resource
						Viewpoint vp = createVpsSpecModel(project, monitor);
						// Create Model reuse extension
						StringBuffer vpdslModelReuseExtension = createVpDslModelReuseExtension();
						appendPluginExtension(vpdslModelReuseExtension);
						
						// Creation of the concrete syntax resources
						boolean csRresourceCreated = createConcretSyntaxResources(monitor);
						if (! csRresourceCreated)
						{
							openVpDescDefaultEditor(vp);
						}
						
						StringBuffer contributorsExtensions = createConcretSyntaxExtensions(monitor);
						if (contributorsExtensions != null && contributorsExtensions.length() > 0)
						{
							appendPluginExtension(contributorsExtensions);
						}
						monitor.done();
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		return true;
	}
	
	protected IProject createVpDslProject(IProgressMonitor monitor) throws CoreException, IOException{
		monitor.beginTask(Messages.Wizard_VpDslProject_Creation_Task_Name, 1);
		IProject prj = ProjectsManager.createProject(vpDescriptionProjectName, vpShortName, monitor);
		monitor.worked(1);
		return prj;
	}
	
	protected Viewpoint createVpsSpecModel(IProject project, IProgressMonitor monitor) throws CoreException, IOException{
		monitor.beginTask(Messages.Wizard_VpSpecModel_CreationTask_Name, 1);
		// VpDesc model creation.
		EObject vpConf = createConfigurationExtension();
		Viewpoint vp = VPDescModelManager.createVpsSpecModel(project, page.getVpShortName(), true, null, vpConf);
		monitor.worked(1);
		return vp;
	}
	
	/**
	 * @return
	 */
	private EObject createConfigurationExtension() {
		Configuration vpConf = VpconfFactory.eINSTANCE.createConfiguration();

		TargetApplication targetApp = VpconfFactory.eINSTANCE.createTargetApplication();
		targetApp.setType(vpTargetApplication);

		GenerationConfiguration genCof = VpconfFactory.eINSTANCE.createGenerationConfiguration();
		genCof.setProjectName(vpRootProjectName);
		
		String nsuri = (generateNsURI 
						? taRootNsURI + vpShortName 
						: (vpNsURI != null && vpNsURI.trim().length() > 0 
								? vpNsURI
								: taRootNsURI + vpShortName));
		
		if (generateNsURI || (vpNsURI == null || (vpNsURI != null && vpNsURI.trim().length() == 0 )))
			vpNsURI = nsuri;
		
		genCof.setNsuri(nsuri);
		vpConf.getVpConfigurationElements().add(targetApp);
		vpConf.getVpConfigurationElements().add(genCof);
		vpConf.setName(vpShortName+".conf");
		
		return vpConf;
	}
	
	protected boolean createConcretSyntaxResources(IProgressMonitor monitor){
		boolean result = false;
		if (selectedConcreteSyntaxCreators != null && 
				selectedConcreteSyntaxCreators.size() != 0)
		{
			monitor.beginTask(Messages.Wizard_ConcreteSyntax_Creation_SubTask, selectedConcreteSyntaxCreators.size());
			Set<String> set = selectedConcreteSyntaxCreators.keySet();
			for (String id : set) 
			{
				try {
					monitor.subTask("creation of " + id + " resource"); //$NON-NLS-1$ //$NON-NLS-2$
					boolean csCreated = ConcreteSyntaxResourceCreationManager.createAdditionalResource(id, 
																					vpShortName, 
																					vpTargetApplication, 
																					vpRootProjectName, 
																					vpDescriptionProjectName,
																					vpNsURI);
					monitor.worked(1);
					if (csCreated)
						result = csCreated;
				} catch (CantConcreteSyntaxResourceCreator e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	protected void appendPluginExtension(StringBuffer extension) throws CoreException{
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(vpDescriptionProjectName);
		final IFile pluginXml = project.getFile("plugin.xml");
		
		if (pluginXml.exists() == false)
		{
			createPluginXml(extension, monitor);
		}
		
		Scanner scanner = new Scanner(pluginXml.getContents());
		StringBuffer newPluginXml = new StringBuffer();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			if (line.equals("</plugin>") == true ||
					line.contains("</plugin>") == true)
			{
				break;
			}
			else
			{
				newPluginXml.append(line + "\n");
			}
		}
		
		scanner.close();
		newPluginXml.append("\n");
		newPluginXml.append(extension);
		newPluginXml.append("\n");
		newPluginXml.append(PLUGIN_XML_FOOTER);
		final ByteArrayInputStream fileInputStream = new ByteArrayInputStream(newPluginXml.toString().getBytes());
		
		try {
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException,
				InvocationTargetException, InterruptedException {
					if (pluginXml.exists())
						pluginXml.setContents(fileInputStream, true, false, null);
					else
						pluginXml.create(fileInputStream, true, null);

					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}
			}.run(monitor);
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	protected void createPluginXml(StringBuffer extensions, IProgressMonitor monitor){
		StringBuffer pluginXmlContent = new StringBuffer();
		pluginXmlContent.append(PLUGIN_XML_HEADER);
		pluginXmlContent.append("\n");
		pluginXmlContent.append(extensions);
		pluginXmlContent.append("\n");
		pluginXmlContent.append(PLUGIN_XML_FOOTER);
		
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(vpDescriptionProjectName);
		final ByteArrayInputStream fileInputStream = new ByteArrayInputStream(pluginXmlContent.toString().getBytes());

		try {
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException,
				InvocationTargetException, InterruptedException {
					IFile pluginXml = project.getFile("plugin.xml");
					if (pluginXml.exists())
						pluginXml.setContents(fileInputStream, true, false, null);
					else
						pluginXml.create(fileInputStream, true, null);

					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}
			}.run(monitor);
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	protected StringBuffer createVpDslModelReuseExtension(){
		String modelPath = "/"+vpDescriptionProjectName + "/model/" + vpShortName + ".vpdesc";
		StringBuffer content = new StringBuffer();
		content.append("	<extension\n");
		content.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		content.append("	  <resource\n");
		content.append("	        domain=\"vpdsl\"\n");
		content.append("	        id=\"").append(vpDescriptionProjectName).append(".description").append("\"\n");
		content.append("	        tags=\"vpdesc\"\n");
		content.append("	        name=\"").append(vpShortName.toLowerCase()).append("\"\n");
		content.append("	        path=\"").append(modelPath).append("\"/>\n");
		content.append("	</extension>\n");
		return content;
	}
	
	protected StringBuffer createConcretSyntaxExtensions(IProgressMonitor monitor){
		StringBuffer result = null;
		if (selectedConcreteSyntaxCreators != null && 
				selectedConcreteSyntaxCreators.size() != 0)
		{
			result = new StringBuffer();
			monitor.beginTask(Messages.Wizard_ConcreteSyntax_Creation_SubTask, selectedConcreteSyntaxCreators.size());
			Set<String> set = selectedConcreteSyntaxCreators.keySet();
			for (String id : set) 
			{
				try {
					monitor.subTask("creation of " + id + " contribution"); //$NON-NLS-1$ //$NON-NLS-2$
					StringBuffer content = ConcreteSyntaxResourceCreationManager
									   			.createAdditionalPluginXmlContribution(id, 
									     								   vpShortName, 
																		   vpTargetApplication, 
																		   vpRootProjectName, 
																		   vpDescriptionProjectName,
																		   vpNsURI);
					
					if (content != null)
					{
						result.append(content);
						result.append("\n");
					}
					monitor.worked(1);
				} catch (CantConcreteSyntaxResourceCreator e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	/**
	 * This method open the generated VpDesc model in the EMF editor
	 * @param vp : the root element of the generated VPDesc model 
	 */
	protected void openVpDescDefaultEditor(Viewpoint vp) {
		IWorkbench workbench = PlatformUI.getWorkbench();	
		IWorkspaceRoot workspaceRoot= ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(new Path(vp.eResource().getURI().toPlatformString(true)));
		if (file !=null) {
			try {		
				IDE.openEditor(workbench.getActiveWorkbenchWindow().getActivePage(), file);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
