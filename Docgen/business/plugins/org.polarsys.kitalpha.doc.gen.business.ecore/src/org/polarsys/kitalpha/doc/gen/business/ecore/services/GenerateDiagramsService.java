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
package org.polarsys.kitalpha.doc.gen.business.ecore.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.util.ObjectAdapter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutService;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.doc.gen.business.ecore.Activator;
import org.polarsys.kitalpha.doc.gen.business.ecore.helpers.AIRDDiagramGeneratorHelper;


import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.business.api.session.resource.AirdResource;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.diagram.ui.business.api.view.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.ui.business.api.view.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.ui.tools.internal.part.OffscreenEditPartFactory;
import org.eclipse.sirius.tools.api.command.SiriusCommand;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;

@SuppressWarnings("restriction")
public class GenerateDiagramsService {

	// Ecore resource
	private Resource resource;
	private IPath path;
	// Transactional editing domain and resource set
//	private TransactionalEditingDomain editing_domain ;
	private TransactionalEditingDomain editing_domain ;/*= EditingDomainService.getInstance().getEditingDomainProvider().getEditingDomain();*/
	private Collection<Viewpoint> viewpoints = null;

	private static final String GENERATED_DIAGRAM = "EcoreToolsExtra_ClassView";
	private static final String VIEWPOINT = "Viewpoint";

	private static final PreferencesHint preferencesHint = new PreferencesHint("org.eclipse.sirius.diagram.diagram");
	
	private static IProgressMonitor _monitor = new NullProgressMonitor();

	public GenerateDiagramsService(Resource resource, IPath path) {
		this.resource = resource;
		this.path = path;
	}
	
	public URI generateAIRD(IProgressMonitor monitor) {
		if (null != monitor && _monitor != monitor)
			_monitor = monitor;
		
		try {
			// Prepare semantic resources
			final Collection<Resource> semantics = new ArrayList<Resource>();
			semantics.add(resource);

			// Get aird resource
			boolean createNewAIRD = false;
			URI airdUri = AIRDDiagramGeneratorHelper.getExistedURI(path);
			if (airdUri == null) 
			{
				airdUri = AIRDDiagramGeneratorHelper.generateURI(path);
				createNewAIRD = true;
			} 

			// Get a session to generate diagrams
			final Session localSession = SessionManager.INSTANCE.getSession(airdUri, _monitor);
			
			editing_domain = localSession.getTransactionalEditingDomain();
			
			boolean sessionWasOpen = localSession.isOpen();
			if (! localSession.isOpen())
			{
				localSession.open(_monitor);
			}
			((DAnalysisSession) localSession).setAnalysisSelector(null);
			
			final CommandStack stack = localSession.getTransactionalEditingDomain().getCommandStack();
			
			final URI airdUri2 = airdUri;
			stack.execute(new RecordingCommand(localSession.getTransactionalEditingDomain()) {
				@Override
				protected void doExecute() {
					List<Resource> toRemove = new ArrayList<Resource>();
					for (Resource resource : localSession.getTransactionalEditingDomain().getResourceSet().getResources()) 
					{
						if (resource instanceof AirdResource && resource.getURI() != airdUri2)
							toRemove.add(resource);
					}
					localSession.getTransactionalEditingDomain().getResourceSet().getResources().removeAll(toRemove);
					for (Resource resource : toRemove) 
					{
						resource.unload();
						resource = null;
					}
					System.gc();
				}
			});
			
			
			// generate diagrams
			AirdGenerationRecordingCommand command = 
				new AirdGenerationRecordingCommand(localSession.getTransactionalEditingDomain(), localSession, createNewAIRD, semantics, _monitor);
			stack.execute(command);
			final Collection<DRepresentation> createdRepresentations = command.getCreatedRepresentation();
			
			// Create an aird fragment and put in it all new generated representation
			URI fragmentUri = getFragmentUri();
			fragmentResource(localSession, fragmentUri , editing_domain, createdRepresentations);
			
			// Layout the generated representations 
			layoutNewRepresentations(createdRepresentations);
			
//			 Save the session
			localSession.save(_monitor);
			if (! sessionWasOpen)
			{
//				unloadSessionResources(localSession);
				localSession.close(_monitor);
			}
			
//			return airdUri;
			return fragmentUri;
		} 
		catch (Exception e) 
		{
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error during aird generation", e));
		}
		return null;
	}
	
	private URI getFragmentUri(){
		EList<EObject> content = resource.getContents();
		String modelName = resource.getURI().trimFileExtension().lastSegment().toLowerCase();
		if (content != null && content.size() > 0)
		{
			EPackage ePackage = (EPackage)content.get(0);
			modelName = ePackage.getName().toLowerCase();
		}
		
		IPath fragmentPath = path; 
		fragmentPath = fragmentPath.append("diagrams");
		URI fUri = AIRDDiagramGeneratorHelper.generateURI(fragmentPath);
		fUri = fUri.trimFileExtension().trimSegments(1);
		return fUri.appendSegment(modelName).appendFileExtension("aird");
	}
	
	private void fragmentResource(Session session, URI fragmentResourceURI, TransactionalEditingDomain domain, Collection<DRepresentation> movableRepresentations){
		ExtractRepresentationSilentCommand command = new ExtractRepresentationSilentCommand(session, fragmentResourceURI, domain, movableRepresentations);
		command.execute();
	}
	
	private void layoutNewRepresentations(final Collection<DRepresentation> createdRepresentations){
		// Layout generated Fragment
		Display.getDefault().syncExec(new Runnable() 
		{
			public void run() {
				for (DRepresentation dRepresentation : createdRepresentations) 
				{
					DSemanticDiagram semanticDiagram = (DSemanticDiagram) dRepresentation;
					layout(semanticDiagram, null);
				}
			}
		});
	}
	
	private Collection<Viewpoint> getViewpoints(Session session) {
		if (viewpoints == null) 
		{
			viewpoints = new ArrayList<Viewpoint>();
			for (Viewpoint v : ViewpointRegistry.getInstance().getViewpoints()) 
			{
				if (v.getName().equals(GENERATED_DIAGRAM)) 
				{
					Viewpoint vp = SiriusResourceHelper.getCorrespondingViewpoint(session, v);
					if (vp != null)
					{
						viewpoints.add(vp);
						break;
					}
				}
			}
		}
		return viewpoints;
	}

	private Collection<DSemanticDiagram> getNewDSemanticDiagrams(Resource airdResource, Collection<URI> newObject) {
		Collection<DSemanticDiagram> result = new UniqueEList<DSemanticDiagram>();

		for (DSemanticDiagram representation : getRepresentation(airdResource)) 
		{
			EObject target = ((DSemanticDiagram) representation).getTarget();
			if (newObject.contains(EcoreUtil.getURI(target))) 
				result.add((DSemanticDiagram) representation);
		}
		return result;

	}

	/**
	 * Provides semantic object list from representations.
	 * 
	 * @param airdResource
	 *            the aird resource containing representations.
	 * @return all representation targets.
	 */
	private Collection<DSemanticDiagram> getRepresentation(Resource airdResource) {
		Collection<DSemanticDiagram> result = new UniqueEList<DSemanticDiagram>();

		EObject airdResourceRoot = airdResource.getContents().get(0);
		if (airdResourceRoot instanceof DAnalysis) 
		{
			DAnalysis analysis = (DAnalysis) airdResourceRoot;
			for (DView view : analysis.getOwnedViews()) 
			{
				for (DRepresentation representation : view.getOwnedRepresentations()) 
				{
					if (representation instanceof DSemanticDecorator) 
						result.add((DSemanticDiagram) representation);
				}
			}
		}

		return result;
	}

	private boolean isSupport(EObject object) {
		return object instanceof EClass;
	}

	/**
	 * Provides GMF diagram corresponding to Sirius representation.
	 * 
	 * @param representation
	 *            the Sirius representation.
	 * @param sessionResource
	 *            the session containing representation.
	 * @return
	 */
	private Diagram getDiagram(DRepresentation representation, Resource sessionResource) {
		for (AnnotationEntry annotationEntry : representation.getOwnedAnnotationEntries()) 
		{
			if (annotationEntry.getSource().equals("GMF_DIAGRAMS")) 
			{
				EObject data = annotationEntry.getData();
				
				if (data instanceof Diagram)
					return (Diagram) data;
			}
		}
		
		// In this case the GMF Diagram is not created yet
		Diagram diagram = ViewService.createDiagram(representation, VIEWPOINT, getPreferencesHint());
		
		for (AnnotationEntry annotationEntry : representation.getOwnedAnnotationEntries()) 
		{
			if (annotationEntry.getSource().equals("GMF_DIAGRAMS")) 
			{
				annotationEntry.setData(diagram);
				return diagram;
			}
		}		
		
		return null;
	}

	private static PreferencesHint getPreferencesHint() {
		return preferencesHint;
	}

	public void layout(final DSemanticDiagram semanticDiagram, final Resource sessionResource){
		Diagram gmfDiag = getDiagram(semanticDiagram, sessionResource);
		layoutGmfDiag(gmfDiag);
	}

	/**
	 * Layout all aird representations.
	 * @param airdUri
	 */
	public void layout(URI airdUri) {
		try {

			Resource ecoreResource = getResourceFromAvailableSiriusSessions(resource.getURI());
			if (ecoreResource == null && resource.isLoaded())
			{
				ecoreResource = resource;
			}
			else 
			{
				if (ecoreResource == null) 
					ecoreResource = editing_domain.getResourceSet().getResource(resource.getURI(), true);
			}
			
			Collection<URI> semanticElements = new ArrayList<URI>();
			TreeIterator<EObject> iterator = ecoreResource.getAllContents();
			while (iterator.hasNext()) 
			{
				EObject current = iterator.next();
				if (isSupport(current)) 
					semanticElements.add(EcoreUtil.getURI(current));
			}
			
			Resource sessionResource = editing_domain.getResourceSet().getResource(airdUri, true);
			
			for (DSemanticDiagram semanticDiagram : getNewDSemanticDiagrams(sessionResource, semanticElements)) 
			{
				Diagram gmfDiag = getDiagram(semanticDiagram, sessionResource);
				layoutGmfDiag(gmfDiag);
			}
			
			Map<Object, Object> options = new HashMap<Object, Object>();

			options.put(XMLResource.OPTION_USE_FILE_BUFFER, 
						Boolean.TRUE);
			
			options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF,
						XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
			
			sessionResource.save(options);
			sessionResource.unload();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Layout given gmf diagram.
	 * 
	 * @param gmfDiag
	 *            the GMF Diagram to layout.
	 */
	private void layoutGmfDiag(Diagram gmfDiag) {
		Shell shell = new Shell(Display.getDefault());
		try {

			DiagramEditPart diagramEP = OffscreenEditPartFactory.getInstance().createDiagramEditPart(gmfDiag, shell, getPreferencesHint());
			
			List<Object> hints = new ArrayList<Object>(2);
			hints.add(LayoutType.DEFAULT);
			hints.add(diagramEP);
			IAdaptable layoutHint = new ObjectAdapter(hints);
			
			final Runnable layoutRun = LayoutService.getInstance().layoutLayoutNodes(
						LayoutService.getInstance().getLayoutNodes(diagramEP, gmfDiag.getChildren()), 
						false,
						layoutHint);
			
			layoutRun.run();
			diagramEP.deactivate();
			editing_domain.getCommandStack().flush();
		}
		finally {
//			shell.dispose();
		}
	}

	class SynchronizeGMFModelCommand extends SiriusCommand {
		private CanonicalSynchronizer canonicalSynchronizer;

		public SynchronizeGMFModelCommand(TransactionalEditingDomain editing_domain,
											CanonicalSynchronizer canonicalSynchronizer) {
			super(editing_domain);
			this.canonicalSynchronizer = canonicalSynchronizer;
			this.canonicalSynchronizer.storeViewsToArrange(true);
		}

		@Override
		protected void doExecute() {
			canonicalSynchronizer.synchronize();
		}
	}

	/**
	 * 
	 * @param sessionUri
	 * @return
	 */
	private Resource getResourceFromAvailableSiriusSessions(URI sessionUri) {
		for (Session currentSession : SessionManager.INSTANCE.getSessions()) 
		{
			for (Resource resource : currentSession.getSemanticResources()) 
			{
				if (resource.getURI().equals(sessionUri)) 
					return resource;
			}
		}
		return null;
	}
	
	/****************************************************************************************/
	
	
	

	/**
	 * A Recording command that manage Aird representation generation
	 */
	private class AirdGenerationRecordingCommand extends RecordingCommand{
		
//		private TransactionalEditingDomain _editindDomain;
		private Session _session;
		private boolean _newAird;
		private Collection<Resource> _semanticResources;
		private Collection<DRepresentation> _createdRepresentations;
		private IProgressMonitor _monitor ;
		
		public AirdGenerationRecordingCommand(TransactionalEditingDomain editindDomain,
											  Session session,
											  boolean newAird,
											  Collection<Resource> semanticResources,
											  IProgressMonitor monitor) {
			super(editindDomain, "Diragms generation");
//			_editindDomain = editindDomain;
			_session = session;
			_newAird = newAird;
			_semanticResources = semanticResources;
			_createdRepresentations = new ArrayList<DRepresentation>();
			_monitor = monitor;
		}
		
		public Collection<DRepresentation> getCreatedRepresentation(){
			return _createdRepresentations;
		}
		
		@Override
		protected void doExecute() {
			for (Resource currentResource : _semanticResources) 
			{
				_session.addSemanticResource(currentResource.getURI(), _monitor);
			}

			getViewpoints(_session);
			ViewpointSelectionCallback callback = new ViewpointSelectionCallback();
			for (Viewpoint viewpoint : viewpoints) 
			{
				if (! _session.getSelectedViewpoints(false).contains(viewpoint))
					callback.selectViewpoint(viewpoint, _session, _monitor);
			}

			// Create aird contents and/or refresh them
			if (_newAird) 
			{
				for (Viewpoint viewpoint : viewpoints) 
				{
					EObject root = getElementFromSessionResource(_session, resource.getURI());
					if (root == null)
						root = resource.getContents().get(0);
					
//					for (EObject currentEObject : root.eContents()) 
					// FIXME: To this in a better way. Loop over root EPackage it EClasses and it 
					//        SubEPackages rather then eAllContents Iterator. 
					final TreeIterator<EObject> eAllContents = root.eAllContents();
					while (eAllContents.hasNext()) 
					{
						EObject currentEObject = eAllContents.next();
						if (currentEObject instanceof EClass) 
						{
							Collection<DRepresentation> newRepresentation = init(currentEObject, viewpoint, _session);
							if (newRepresentation.size() > 0)
							{
								refreshNewDiagram(_session, newRepresentation);
								_createdRepresentations.addAll(newRepresentation);
							}
						}
					}
				}
//				refreshNewDiagram(_session);
			} 
			else 
			{
				Collection<DRepresentation> newRepresentation = refreshExistedDiagram(_session);
				if (newRepresentation.size() > 0)
					_createdRepresentations.addAll(newRepresentation);
			}
		}
		
		/**
		 * 
		 * @param localSession
		 * @param resourceURI
		 * @return Element from localSession resource or null
		 */
		private EObject getElementFromSessionResource(final Session localSession, URI resourceURI) {
			EObject root = null;
			for (Resource currentResource : localSession.getSemanticResources()) 
			{
				if (currentResource.getURI().equals(resourceURI)) 
					root = currentResource.getContents().get(0);
			}
			return root;
		}
		
		/**
		 * Initializing a new representation on given semantic element.
		 * 
		 * @param semanticObject
		 * @param viewpoint
		 * @param session
		 */
		private Collection<DRepresentation> init(EObject semanticObject, Viewpoint viewpoint,Session session) {
			Collection<DRepresentation> result = new ArrayList<DRepresentation>();
			for (RepresentationDescription description : viewpoint.getOwnedRepresentations()) 
			{
				String name = semanticObject.eGet(semanticObject.eClass().getEStructuralFeature("name")).toString() + " " + description.getName();
				DRepresentation nRepresentation = DialectManager.INSTANCE.createRepresentation(name, semanticObject, description, session, new NullProgressMonitor());
				if (null != nRepresentation)
					result.add(nRepresentation);
			}
			return result;
		}
		
		private Collection<DRepresentation> refreshExistedDiagram(final Session session) {
			// Add new diagrams for new semantic objects if needed
			Collection<EObject> newObject = findNewSemanticElements(session);
			Collection<URI> newObjectFragments = new ArrayList<URI>();
			Collection<DRepresentation> result = new ArrayList<DRepresentation>();
			for (Viewpoint viewpoint : getViewpoints(_session)) 
			{
				for (RepresentationDescription representationDescription : viewpoint.getOwnedRepresentations()) 
				{
					for (EObject object : newObject) 
					{
						newObjectFragments.add(EcoreUtil.getURI(object));
						if (object instanceof ENamedElement) 
						{
							String name = ((ENamedElement) object).getName() + " - " + representationDescription.getName();
							try
							{
								DRepresentation representation = DialectManager.INSTANCE.createRepresentation(name, object, representationDescription, session, new NullProgressMonitor());
								if (null != representation)
									result.add(representation);
							}
							catch (Exception e){
								e.printStackTrace();
							}
						}
					}
				}
			}

			Collection<DSemanticDiagram> newSemanticDiagrams = getNewDSemanticDiagrams(session.getSessionResource(), newObjectFragments);
			for (final DSemanticDiagram diagram : newSemanticDiagrams) 
//			for (DRepresentation dRepresentation : result) 
			{
				refreshNewDSemanticDiagram(diagram, session);
			}
			
			return result;
		}
		
		private void refreshNewDiagram(final Session session, Collection<DRepresentation> representations) {
			CompoundCommand compoundCommand = new CompoundCommand();
//			Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);

			RefreshRepresentationsCommand refreshRepresentationsCommand = new RefreshRepresentationsCommand(editing_domain, _monitor, representations);
			compoundCommand.append(refreshRepresentationsCommand);
			editing_domain.getCommandStack().execute(compoundCommand);
			for (DRepresentation currentDRepresentation :  representations) 
			{
			if (currentDRepresentation instanceof DDiagram) 
				refreshNewDSemanticDiagram(currentDRepresentation, session);
			}
		}
		
		@SuppressWarnings("unused")
		private void refreshNewDiagram(final Session session) {
			CompoundCommand compoundCommand = new CompoundCommand();
			Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);

			RefreshRepresentationsCommand refreshRepresentationsCommand = new RefreshRepresentationsCommand(editing_domain, _monitor, representations);
			compoundCommand.append(refreshRepresentationsCommand);
			editing_domain.getCommandStack().execute(compoundCommand);
			for (DRepresentation currentDRepresentation :  representations) 
			{
				if (currentDRepresentation instanceof DDiagram) 
					refreshNewDSemanticDiagram(currentDRepresentation, session);
			}
		}
		
		private Collection<EObject> findNewSemanticElements(Session localSession) {
			List<EObject> oldList = new UniqueEList<EObject>();
			List<EObject> newList = new UniqueEList<EObject>();
			for (DSemanticDiagram diag : getRepresentation(localSession.getSessionResource())) 
			{
				EObject target = diag.getTarget();
				if (isSupport(target)) 
					oldList.add(target);
			}
			EObject root = getElementFromSessionResource(localSession, resource.getURI());
			if (root == null)
				root = resource.getContents().get(0);
			
			Iterator<EObject> i = root.eAllContents();
			while (i.hasNext()) 
			{
				EObject next = i.next();
				if (isSupport(next))
					newList.add(next);
			}

			newList.removeAll(oldList);
			return newList;
		}
		
		/**
		 * Refresh the new created representation.
		 * 
		 * @param representation
		 *            the Sirius representation.
		 * @param session
		 *            the session containing the representation.
		 */
		private void refreshNewDSemanticDiagram(DRepresentation representation, Session session) {
			DialectManager.INSTANCE.refresh(representation, new NullProgressMonitor());
			Diagram gmfDiag = getDiagram(representation, session.getSessionResource());
			if (gmfDiag == null) 
				gmfDiag = ViewService.createDiagram(representation, VIEWPOINT, getPreferencesHint());
			
			CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(gmfDiag);
			Command synchronizeGMFModel = new SynchronizeGMFModelCommand(editing_domain, canonicalSynchronizer);
			editing_domain.getCommandStack().execute(synchronizeGMFModel);
		}
	}
}
