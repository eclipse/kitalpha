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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards.NewDSLVpProjectWizard;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.ecore.ConflictingNameResloveStrategy;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.ecore.ReverseFromEcoreEngine;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension.CantInitializeConcreteSyntaxResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension.ConcreteSyntaxResourceInitializeManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.utils.ReverseUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.pages.ReverseFirstPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.pages.ReverseSecondPage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.exceptions.CantContributeToPluginXml;

/**
 * @author Boubekeur Zendagui
 */

public class ReverseDSLVPProjectWizard extends NewDSLVpProjectWizard {
	
	private EPackage ePackage;
	/** **/
	protected boolean flattenEPackages; 
	/** **/
	protected ConflictingNameResloveStrategy conflictingNameResloveStrategy;
	/** **/
	protected boolean addSeparator;
	
	public ReverseDSLVPProjectWizard(IStructuredSelection selection) {
		super();
		this.selection = selection;
		image = AbstractUIPlugin.imageDescriptorFromPlugin("org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse", "icons/reverse_wiz.png"); //$NON-NLS-1$
		setEPackage();
		setVpShortName(ePackage.getName());
		super.setDefaultPageImageDescriptor(image);
		this.setNeedsProgressMonitor(true);
		super.setWindowTitle(Messages.Reverse_Wizard_WindowTitle);
	}
	
	private void setEPackage(){
		URI uri = ReverseUtil.getDomainURI((IStructuredSelection) this.selection);
		ResourceSet rs = new TargetPlatformResourceSet();
		Resource r = rs.getResource(uri, true);
		EList<EObject> ecoreContent = r.getContents();
		if (ecoreContent != null && ecoreContent.size() > 0)
		{
			ePackage = (EPackage) ecoreContent.get(0);
			vpNsURI = ePackage.getNsURI();
			super.setGenerateNsUri(false);
		}
	}
	
	public EPackage getEPackage(){
		return this.ePackage;
	}
	
	@Override
	protected void addFirstPage() {
		page = new ReverseFirstPage();
		page.setTitle(Messages.Reverse_Wizard_FirstPage_Title);
		page.setDescription(Messages.Reverse_Wizard_FirstPage_Description);
		addPage(page);
	}

	@Override
	protected void addSecondPage() {
		sPage = new ReverseSecondPage();
		sPage.setTitle(Messages.Reverse_Wizard_SecondPage_Title);
		sPage.setDescription(Messages.Reverse_Wizard_SecondPage_Description);
		addPage(sPage);
	}
	
	@Override
	public boolean performFinish() {
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {
				
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					try {
						// Create the VP Spec model resource
						IProject project = createVpDslProject(monitor);
						Viewpoint vp = createVpsSpecModel(project, monitor);
						doReverse(vp, monitor);
						StringBuffer vpdslModelReuseExtension = createVpDslModelReuseExtension();
						appendPluginExtension(vpdslModelReuseExtension);
						
						// Creation of the concrete syntax resources
						boolean csRresourceCreated = initializeConcretSyntaxResources(vp, monitor);
						if (! csRresourceCreated)
							openVpDescDefaultEditor(vp);
						
						StringBuffer pluginXmlcontributions = createAllPluginXmlContributions(vp, monitor);
						appendPluginExtension(pluginXmlcontributions);
						
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
	
	protected boolean initializeConcretSyntaxResources(Viewpoint vp, IProgressMonitor monitor) {
		boolean result = false;
		if (selectedConcreteSyntaxCreators != null && 
				selectedConcreteSyntaxCreators.size() != 0)
		{
			monitor.beginTask(Messages.Reverse_Wizard_ConcretSyntax_Task, selectedConcreteSyntaxCreators.size());
			Set<String> set = selectedConcreteSyntaxCreators.keySet();
			URI uri = vp.eResource().getURI(); 
			for (String id : set) 
			{
				try {
					String message = Messages.bind(Messages.Reverse_Wizard_ConcretSyntax_SubTask, id);
					monitor.subTask(message); //$NON-NLS-1$
					boolean csCreated = ConcreteSyntaxResourceInitializeManager.initializeAdditionalResource(id,
																					uri,
																					vpShortName, 
																					vpTargetApplication, 
																					vpRootProjectName, 
																					vpDescriptionProjectName,
																					vpNsURI);
					monitor.worked(1);
					if (csCreated)
						result = csCreated;
				} catch (CantInitializeConcreteSyntaxResource e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	protected StringBuffer createAllPluginXmlContributions(Viewpoint vp, IProgressMonitor monitor) {
		StringBuffer result = null;
		if (selectedConcreteSyntaxCreators != null && 
				selectedConcreteSyntaxCreators.size() != 0)
		{
			result = new StringBuffer();
			monitor.beginTask(Messages.Reverse_Wizard_PluginXmlContribution_Task, selectedConcreteSyntaxCreators.size());
			Set<String> set = selectedConcreteSyntaxCreators.keySet();
			URI uri = vp.eResource().getURI(); 
			for (String id : set) 
			{
				try {
					String message = Messages.bind(Messages.Reverse_Wizard_PluginXmlContribution_SubTask, id);
					monitor.subTask(message); //$NON-NLS-1$
					StringBuffer content = ConcreteSyntaxResourceInitializeManager.createPluginXmlContribution(id,
																					uri,
																					vpDescriptionProjectName);
					if (content != null)
					{
						result.append(content);
						result.append("\n");
					}
					monitor.worked(1);
				} catch (CantContributeToPluginXml e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}

	protected void doReverse(final Viewpoint vp, IProgressMonitor monitor) 
				   throws InvocationTargetException, InterruptedException {
		ReverseFromEcoreEngine reverseEngine = new ReverseFromEcoreEngine();
		try {
			reverseEngine.setFlattenEPackages(this.flattenEPackages);
			reverseEngine.setAddSeperator(this.addSeparator);
			reverseEngine.setNameConflictResolveStrategy(this.conflictingNameResloveStrategy);
			reverseEngine.reverse(ePackage, vp, monitor);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			monitor.done();
		}
	}
	
	public boolean isFlattenEPackages() {
		return flattenEPackages;
	}

	public void setFlattenEPackages(boolean flattenEPackages) {
		this.flattenEPackages = flattenEPackages;
	}

	public ConflictingNameResloveStrategy getConflictingNameResloveStrategy() {
		return conflictingNameResloveStrategy;
	}

	public void setConflictingNameResloveStrategy(ConflictingNameResloveStrategy conflictingNameResloveStrategy) {
		this.conflictingNameResloveStrategy = conflictingNameResloveStrategy;
	}

	public boolean isAddSeparator() {
		return addSeparator;
	}

	public void setAddSeparator(boolean addSeparator) {
		this.addSeparator = addSeparator;
	}

}

