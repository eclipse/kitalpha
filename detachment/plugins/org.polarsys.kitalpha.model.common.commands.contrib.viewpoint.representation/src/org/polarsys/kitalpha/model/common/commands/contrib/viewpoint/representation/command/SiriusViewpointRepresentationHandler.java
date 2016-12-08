/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.command;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.ViewpointQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.ViewpointSelector;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.business.api.helper.concern.ConcernService;
import org.eclipse.sirius.diagram.business.api.query.DEdgeQuery;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.diagram.tools.api.command.ChangeLayerActivationCommand;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.Activator;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceHelper;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class SiriusViewpointRepresentationHandler {
	
	private final Session session;
	private final IProgressMonitor monitor;
	private final ViewpointSelector viewpointSelector;
	private final Collection<String> viewpointsToRemove;
	
	private final ResourceSet resourceSet;
	private final ResourceHelper resourceReuseHelper = ResourceReuse.createHelper();
	
	private final CompoundCommand cleanCommand;
	
	private Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> usedSiriusViewpoints = null;
	
  	/**
	 * Create a new Sirius Viewpoint Representation handler
	 * 
	 * @param session must be not null
	 * @param viewpointToRemove ids of viewpoints to remove
	 * @param monitor
	 */
	public SiriusViewpointRepresentationHandler(Session session, Collection<String> viewpointToRemove, IProgressMonitor monitor){
		assert session != null;
		this.session = session;
		this.viewpointSelector = new ViewpointSelector(session);
		this.viewpointsToRemove = viewpointToRemove;
		this.monitor = monitor;
		this.resourceSet = new ResourceSetImpl();
		this.cleanCommand = new CompoundCommand("Cleaning Session form Viewpoint Data..."); //$NON-NLS-1$
	}
	
	/**
	 * Execute Cleaning Command
	 */
	public void clean(){
		init();
		
		if (cleanCommand.canExecute()){
			session.getTransactionalEditingDomain().getCommandStack().execute(cleanCommand);
		}
		
		dispose();
	}
	
	/**
	 * initialization of compound command
	 */
	private void init(){
		handleRepresentations();
		unselectSiriusViewpoints();
		deleteDViews();
	}
	
	/**
	 * Append commands to delete all DView from the architecture Descriptioin viewpoints
	 */
	private void deleteDViews(){
		if (usedSiriusViewpoints == null)
			return ;
		Collection<DView> ownedViews = session.getOwnedViews();
		for (org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint : usedSiriusViewpoints) {
			for (final DView dView : ownedViews) {
				if (haveSameSiriusURI(dView.getViewpoint(), viewpoint)){
					Command removeDView = new RecordingCommand(session.getTransactionalEditingDomain(), "Remove DViews") {
						@Override
						protected void doExecute() {
							Command removeCommand = RemoveCommand.create(session.getTransactionalEditingDomain(), dView);
							if (removeCommand.canExecute()){
								session.getTransactionalEditingDomain().getCommandStack().execute(removeCommand);
							}
						}
					};
					cleanCommand.append(removeDView);
				}
			}
		}
	}
	
	/**
	 * Unselect all viewpoints from Architecture Description viewpoint from the session
	 */
	private void unselectSiriusViewpoints(){
		
		Command unselectCommand = new RecordingCommand(session.getTransactionalEditingDomain(), "Unselect Viewpoints") { //$NON-NLS-1$
			
			@Override
			protected void doExecute() {
				
				for (org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint : getAllSiriusViewpointsFromADViewpoints()) {
					viewpointSelector.deselectViewpoint(viewpoint, monitor);
				}
			}
		};
		
		cleanCommand.append(unselectCommand);
	}
	
	
	/**
	 * Handle all representations in the session
	 */
	private void handleRepresentations(){
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation rep : allRepresentations) {
			if (rep instanceof DDiagram){
				if (!deleteDiagram((DDiagram)rep)){
					//If the diagram is not deleted, we must handle layers and filters
					deactivateAdditionalLayers((DDiagram)rep);
					deactivateDiagramFilters((DDiagram)rep);
					deleteEdges((DDiagram) rep);
				}
			}
		}
	}
	/**
	 * Append a command to delete Diagram
	 * @param diagram
	 * @return true if the diagram will be deleted, false otherwise
	 */
	private boolean deleteDiagram(final DDiagram diagram){
		boolean result = false;
		RepresentationDescription diagramDescription = DialectManager.INSTANCE.getDescription(diagram);
		org.eclipse.sirius.viewpoint.description.Viewpoint vp = getContainingSiriusViewpoint(diagramDescription);
		
		if (isInViewpoints(getAllSiriusViewpointsFromADViewpoints(), vp)){
			Collection<DRepresentationDescriptor> allRepresentationDescriptors = DialectManager.INSTANCE.getAllRepresentationDescriptors(session);
			for (DRepresentationDescriptor repDesc : allRepresentationDescriptors) {
				if (repDesc.getDescription().equals(diagramDescription)){
					deleteRepresentations(repDesc);
					result = true;
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Append a Deactivate Commands to deactivate Layers of diagram which are in Viewpoint to remove
	 * @param diagram
	 */
	private void deactivateAdditionalLayers(final DDiagram diagram){
		EList<Layer> layers = diagram.getActivatedLayers();
		for (Layer layer : layers) {
			org.eclipse.sirius.viewpoint.description.Viewpoint vp = getContainingSiriusViewpoint(layer);

			if (!isInViewpoints(getAllSiriusViewpointsFromADViewpoints(), vp)){
				continue;
			}
			if (layer instanceof AdditionalLayer){
				if (!((AdditionalLayer)layer).isActiveByDefault()){
					//If the layer is not active ny defautl, we deactivate it
					ChangeLayerActivationCommand changeLayerCommand = new ChangeLayerActivationCommand(
							session.getTransactionalEditingDomain(), diagram, layer, monitor);
					cleanCommand.append(changeLayerCommand);
				} else {
					//If is defautl Layer of diagram, we delete the representation
					deleteRepresentations(diagram);
				}
			}
		}
	}
	
	/**
	 * Append a deactivate Command to deactivate all filter of diagram from Viewpoint to remove
	 * @param diagram
	 */
	private void deactivateDiagramFilters(final DDiagram diagram){
		EList<FilterDescription> activatedFilters = diagram.getActivatedFilters();
		for (final FilterDescription filter : activatedFilters) {
			org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint = getContainingSiriusViewpoint(filter);
			if (!isInViewpoints(getAllSiriusViewpointsFromADViewpoints(), viewpoint)){
				continue;
			}
			Command removeFilter = new RecordingCommand(session.getTransactionalEditingDomain(), "Deactivate Filters") { //$NON-NLS-1$ 
				
				@Override
				protected void doExecute() {
					diagram.getActivatedFilters().remove(filter);
					ConcernService.resetCurrentConcern(diagram);
				}
			};
			cleanCommand.append(removeFilter);
		}
	}
	
	/**
	 * Append a command to cleanCommabd for removing the DRepresentationDescriptor
	 * @param descriptor
	 */
	private void deleteRepresentations(final DRepresentationDescriptor descriptor){
		
		Command deleteRep = new RecordingCommand(session.getTransactionalEditingDomain(), "Delete Representation") { //$NON-NLS-1$
			
			@Override
			protected void doExecute() {
				DialectManager.INSTANCE.deleteRepresentation(descriptor, session);
			}
		};
		
		cleanCommand.append(deleteRep);
	}
	
	/**
	 * Append a command to cleanCommabd for removing the representation of diagram
	 * @param diagram
	 */
	private void deleteRepresentations(final DDiagram diagram){
		final Collection<DRepresentationDescriptor> descriptors = DialectManager.INSTANCE.getRepresentationDescriptors(diagram, session);
		
		Command deleteRep = new RecordingCommand(session.getTransactionalEditingDomain(), "Delete Representations") { //$NON-NLS-1$
			
			@Override
			protected void doExecute() {
				for (DRepresentationDescriptor descriptor : descriptors) {
					DialectManager.INSTANCE.deleteRepresentation(descriptor, session);
				}
			}
		};
		
		cleanCommand.append(deleteRep);
	}
	
	
	/**
	 * Delete Edge from Mappings which defined in architecture viewpoint
	 * @param diagram
	 */
	private void deleteEdges(DDiagram diagram){
		EList<DEdge> edges = diagram.getEdges();
		for (final DEdge dEdge : edges) {
			DEdgeQuery edgeQuery = new DEdgeQuery(dEdge);
			Option<? extends RepresentationElementMapping> mapping = edgeQuery.getMapping();
			if (mapping.some()){
				org.eclipse.sirius.viewpoint.description.Viewpoint vp = getContainingSiriusViewpoint(mapping.get());
				if (isInViewpoints(getAllSiriusViewpointsFromADViewpoints(), vp)){
					Command deleteEdges = new RecordingCommand(session.getTransactionalEditingDomain()) {
						
						@Override
						protected void doExecute() {
							Command c = RemoveCommand.create(session.getTransactionalEditingDomain(), dEdge);
							if (c.canExecute()){
								session.getTransactionalEditingDomain().getCommandStack().execute(c);
							}
						}
					};
					cleanCommand.append(deleteEdges);
				}
			}
		}
	}
	
	/**
	 * @return all Sirius Viewpoints from all Architecture Description viewpoints
	 */
	private Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> getAllSiriusViewpointsFromADViewpoints(){
		if (usedSiriusViewpoints != null){
			return usedSiriusViewpoints;
		}
		
		usedSiriusViewpoints = new HashSet<>();
		
		Collection<Viewpoint> vps = getArchitectureDescriptionViewpoints();
		for (Viewpoint viewpoint : vps) {
			usedSiriusViewpoints.addAll(getSiriusViewpointsFromADViewpoint(viewpoint));
		}
		
		return usedSiriusViewpoints;
	}
	
	/**
	 * Get all Sirius Viewpoints from Architecture Description viewpoint
	 * @param viewpoint
	 * @return All Sirius viewpoint of Architecture Description or empty list
	 */
	private Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> getSiriusViewpointsFromADViewpoint(Viewpoint viewpoint){
		Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> result = new HashSet<>();
		
		Representation representation = viewpoint.getRepresentation();
		EList<RepresentationElement> representations = representation.getRepresentations();
		
		for (RepresentationElement representationElement : representations) {
			if (representationElement instanceof SiriusRepresentation){
				Group odesign = ((SiriusRepresentation)representationElement).getOdesign();
				result.addAll(odesign.getOwnedViewpoints());
			}
		}
		
		return result;
	}
	
	/**
	 * @return viewpoint objects in viewpointToRemove
	 */
	private Collection<Viewpoint> getArchitectureDescriptionViewpoints(){
		Collection<Viewpoint> result = new HashSet<>();
		
		for (final String id : viewpointsToRemove) {
			try {
				Viewpoint vp;
				vp = getArchitectureFrameworkViewpoint(id);
				result.add(vp);
			} catch (IllegaleResourceReuseResult | ResourceNotFoundException e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		}

		return result;
	}
	
	/**
	 * Return Sirius viewpoint of eObject
	 * @param eObject
	 * @return returns Sirius Viewpoints which contains eObject, null if the eObject is not contained in Sirius Viewpoint
	 */
	private org.eclipse.sirius.viewpoint.description.Viewpoint getContainingSiriusViewpoint(EObject eObject){
		if (eObject == null){
			return null;
		}
		if (eObject.equals(EcoreUtil.getRootContainer(eObject))){
			return null;
		}
		if (eObject instanceof org.eclipse.sirius.viewpoint.description.Viewpoint){
			return (org.eclipse.sirius.viewpoint.description.Viewpoint)eObject;
		}
		
		return getContainingSiriusViewpoint(eObject.eContainer());
	}
	
	/**
	 * Search if the the {@linkplain subject} is in the {@linkplain viewpoints} 
	 * @param viewpoints list of viewpoints
	 * @param subject compared to all other viewpoints in {@linkplain viewpoints}
	 * @return true if subject is in the viewpoints, false otherwise
	 */
	private boolean isInViewpoints(
			Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> viewpoints, 
			org.eclipse.sirius.viewpoint.description.Viewpoint subject){
		if (subject != null){
			for (org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint : viewpoints) {
				if (haveSameSiriusURI(viewpoint, subject)){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Check if the viewpoints given as args have the same uri
	 * @param vp1
	 * @param vp2
	 * @return true if vp1 and vp2 have the same {@link URI}, false otherwise
	 */
	private boolean haveSameSiriusURI(org.eclipse.sirius.viewpoint.description.Viewpoint vp1, org.eclipse.sirius.viewpoint.description.Viewpoint vp2){
		ViewpointQuery viewpointQuery = new ViewpointQuery(vp1);
		return viewpointQuery.hasSameSiriusURI(vp2);
	}
	
	
	/**
	 * Load and return a Viewpoint found by id with resource reuse
	 * @param id of the viewpoint
	 * @return loaded viewpoint or throws {@link IllegaleResourceReuseResult}
	 * @throws ResourceNotFoundException
	 * @throws IllegaleResourceReuseResult if the loaded object is not Viewpoint
	 */
	private Viewpoint getArchitectureFrameworkViewpoint(final String id) 
			throws ResourceNotFoundException, IllegaleResourceReuseResult{
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = resourceReuseHelper.getResource(id);
		String path = resource.getPath();
		URI uri = createPlatformPluginURI(path, true);
		EObject viewpoint = resourceSet.getEObject(uri, true);
		if (viewpoint instanceof Viewpoint){
			return (Viewpoint)viewpoint;
		}
		throw new IllegaleResourceReuseResult("Resource referenced by " + id + " is not architecture Description Viewpoint"); //$NON-NLS-1$
	}
	
	
	private void dispose(){
		EList<Resource> resources = resourceSet.getResources();
		
		for (Resource resource : resources) {
			if (resource.isLoaded()){
				resource.unload();
			}
		}
		cleanCommand.dispose();
		if (usedSiriusViewpoints != null)
			usedSiriusViewpoints.clear();
	}
	
	/**
	 * create uri from path
	 * @param path
	 * @param encode
	 * @return URI object
	 */
	private URI createPlatformPluginURI(final String path, final boolean encode){
		if (path == null || path.isEmpty()){
			throw new IllegalArgumentException("Could not create URI with null or empty path"); //$NON-NLS-1$
		}
		return URI.createURI("platform:/plugin" + path); //$NON-NLS-1$
	}

}