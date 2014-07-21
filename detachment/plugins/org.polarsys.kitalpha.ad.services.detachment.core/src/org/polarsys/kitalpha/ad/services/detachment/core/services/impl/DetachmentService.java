/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.ad.services.detachment.core.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.ad.services.detachment.core.Messages;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.DetachmentExtensionRegistry;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.UnknownReferencesRegistry;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.AbstractDetachmentWizard;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IDetachmentInterpreter;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IDetachmentWizardData;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IUnknownReferencesService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.IDetachmentService;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.Feedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.services.visitor.FinderVisitor;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.builder.ViewpointTreeBuilder;
import org.polarsys.kitalpha.ad.services.detachment.io.factory.ResourceIOHelper;

/**
 * Implementation of Detachment service.
 * @author Faycal Abka
 *
 */
public class DetachmentService implements IDetachmentService {

	private Resource resource;
	private Session  airdSession;
	private IProject project;
	private ViewpointTreeContainer container;
	
	private static IDetachmentService detachment = null;
	
	private DetachmentExtensionRegistry extensionRegistry;
	
	public static IDetachmentService getInstance(IFile airdResource){
		if (detachment == null){
			detachment = new DetachmentService(airdResource);
		}
		return detachment;
	}
	
	private DetachmentService(IFile airdResource){
		this.resource = ResourceIOHelper.getResource(airdResource);
		URI uri = URI.createPlatformResourceURI(airdResource.getFullPath().toPortableString(), true);
		this.airdSession = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
		this.project = airdResource.getProject();
		this.extensionRegistry = DetachmentExtensionRegistry.getInstance();
		this.container = null;
		
	}
	
	public DetachmentService(Resource resource){
		this.resource = resource;
	}
	
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * @see IDetachmentService#getUndefinedReferences() documentation
	 */
	@Override
	public IFeedback getUndefinedReferences() {
		
		IFeedback messages = new Feedback();
		FinderVisitor visitor = new FinderVisitor(messages);
		
		visitor.accept(resource);
		
		return messages;
	}

	/**
	 * @see IDetachmentService#getUsedViewpoints() documentation
	 */
	@Override
	public ViewpointTreeContainer getUsedViewpoints() {
		ViewpointTreeBuilder vpTreeBuilder = new ViewpointTreeBuilder(airdSession);
		this.container = vpTreeBuilder.getViewpointTreeContainer();
		return container;
	}

	/**
	 * @throws CoreException 
	 * @throws IOException 
	 * @see IDetachmentService#performDetachment() documentation
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void performDetachment(boolean removeUnknownReferences, IProgressMonitor monitor) throws IOException, CoreException {
		
		ECrossReferenceAdapter crossReferenceAdapter = installCrossReferencer(resource);
		UnknownReferencesRegistry registry;
		
		//Detach unknown references
		if (removeUnknownReferences){
			registry = UnknownReferencesRegistry.getInstance();
			//registry.initRegistry();
			Collection<Object> unknownReferenceRegitry = registry.getUnknownReferencesRegistry();
			for (Object object : unknownReferenceRegitry) {
				((IUnknownReferencesService)object).clean(crossReferenceAdapter);
			}
			//Clear the unknown registry
			registry.dispose();
		}
		
		
		//Process the extension
		Map<String, AbstractDetachmentWizard> wizards = extensionRegistry.getDetachmentWizardsExtension();
		Map<String, IDetachmentInterpreter> interpreters = extensionRegistry.getDetachmentInterpreters();
		
		
		for (String wizard_id : wizards.keySet()) {
			final AbstractDetachmentWizard current_wizard = wizards.get(wizard_id);
			IDetachmentInterpreter current_interpreter = interpreters.get(wizard_id);
			
			final WizardDataHelper data = new WizardDataHelper();
			
			//To avoid invalid data access exception
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					data.data = current_wizard.getDetachmentWizardData();					
				}
			});
			
			
			if (data.data != null)
				current_interpreter.process(data.data, resource.getResourceSet());
		}
		
		
		//Viewpoints detachment
		Collection<String>	 urisToRemove   = container.getUriToRemove();
		removeViewpointsFrom(resource, urisToRemove, crossReferenceAdapter);
		
		container.dispose();
		urisToRemove.clear();
		
		
		//Save the result
		ResourceIOHelper.save(resource, project);
		refreshRepresentations(monitor);
		disposeDetachmentService();

	}
	
	
	
	protected ECrossReferenceAdapter installCrossReferencer(Resource resource) {
		ECrossReferenceAdapter crossReferenceAdapter = new ECrossReferenceAdapter();
		EList<Resource> resources = resource.getResourceSet().getResources();
		for (Resource resource2 : resources) {
			resource2.eAdapters().add(crossReferenceAdapter);
		}
		return crossReferenceAdapter;
	}
	
	
	/**
	 * Remove all objects that are declared in packages which their NSURI are in urisToRemove 
	 * @param aird_Resource resource where are the semantic and representation models
	 * @param urisToRemove contains uris to be removed
	 */
	private void removeViewpointsFrom(Resource aird_Resource, Collection<String> urisToRemove, ECrossReferenceAdapter crossReferenceAdapter){
		
		Collection<Resource> allResources = aird_Resource.getResourceSet().getResources();
		
		for (Resource resource : allResources) 
		{
			
			//TODO Skip aird resource
			TreeIterator<EObject> it = resource.getAllContents();
			
			Collection<EObject> eObjectToRemove = new HashSet<EObject>();
			
			while (it.hasNext())
			{
				EObject eObject = it.next();
				String current_uri = eObject.eClass().getEPackage().getNsURI();
				
				if (urisToRemove.contains(current_uri))
				{
					eObjectToRemove.add(eObject);
				}
			}
			
//			Collection<String> viewpointNsUri = container.getAllViewpointsNSuri();
			if (eObjectToRemove != null && !eObjectToRemove.isEmpty())
			{
				for (EObject eObject2 : eObjectToRemove) 
				{
//					Collection<Setting> inverseReferences = crossReferenceAdapter.getInverseReferences(eObject2);
//					
//					for (Setting iReference : inverseReferences) {
//						EObject inverseEObject = iReference.getEObject();
//						
//						if (viewpointNsUri.contains(inverseEObject.eClass().getEPackage().getNsURI())){
//							EcoreUtil.delete(inverseEObject);
//						}
//					}
					EcoreUtil.delete(eObject2, false);
				}
			}
		}
	}
	

	private void refreshRepresentations(IProgressMonitor monitor)
			throws CoreException {
		Session session = SessionManager.INSTANCE.getSession(resource.getURI(), monitor);
		session.open(monitor);
		monitor.beginTask(Messages.REFRESH_REMPRESENTATIONS, IProgressMonitor.UNKNOWN);

		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		
		Command cmd = new RefreshRepresentationsCommand(domain, monitor, allRepresentations);
		
		if (cmd.canExecute())
			domain.getCommandStack().execute(cmd);

		monitor.subTask(Messages.SAVE_SIRIUS_SESSION);
		session.save(monitor);
		monitor.subTask(Messages.CLOSING_SIRIUS_SESSION);
		session.close(monitor);
	}
	
	
	public void disposeDetachmentService(){
		if (airdSession.isOpen())
			airdSession.close(new NullProgressMonitor());
		resource.unload();
		container.dispose();
		detachment = null;
	}

	@Override
	public Collection<AbstractDetachmentWizard> getWizardPages() {
		
		ArrayList<AbstractDetachmentWizard> wizardPages = new ArrayList<AbstractDetachmentWizard>();
		
		extensionRegistry.initRegistry();
		wizardPages.addAll(extensionRegistry.getDetachmentWizardsExtension().values());
		
		Collections.sort(wizardPages, new Comparator<AbstractDetachmentWizard>() {

			@Override
			public int compare(AbstractDetachmentWizard wizard0,
					AbstractDetachmentWizard wizard1) {
				
				if (wizard0.getWizardPageNumber() < wizard1.getWizardPageNumber()) return -1;
				if (wizard0.getWizardPageNumber() > wizard1.getWizardPageNumber()) return 1;
				return 0;
			}
		});
		
		return wizardPages;
	}
	
	
	/*
	 * Class that help to retrieve inputed data in the contributed wizards
	 */
	private class WizardDataHelper {
		public IDetachmentWizardData data;
	}
	

}
 