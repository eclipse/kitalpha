/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.command;

/**
 * @author Faycal ABKA
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.tools.api.command.ChangeLayerActivationCommand;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.model.common.commands.contrib.viewpoint.representation.Activator;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.viewpoints.scrutinizes.UsedAFViewpoints;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceNotFoundException;
import org.polarsys.kitalpha.resourcereuse.helper.ResourceReuse;

public class HandleViewpointRepresentation extends org.polarsys.kitalpha.model.common.commands.action.ModelCommand {

	public HandleViewpointRepresentation() {
	}

	@Override
	public void exec(Resource resource, IProgressMonitor monitor) throws ModelCommandException {
		
		if (resource.getURI().lastSegment() == null || !resource.getURI().lastSegment().endsWith(SiriusUtil.SESSION_RESOURCE_EXTENSION))
			return;
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		
		Session session = SessionManager.INSTANCE.getExistingSession(resource.getURI());
		if (session == null){
			session = SessionManager.INSTANCE.getSession(resource.getURI(), subMonitor);
		}
		
		if (!session.isOpen())
			session.open(subMonitor);

		RegistryElement regElt;
		try {
			regElt = Scrutineer.getRegistryElement(getModelAnalysisID());
			
			if (regElt != null){
				UsedAFViewpoints usedVpFinder = getUsedAFFinder(regElt);
				if (usedVpFinder != null){
					ViewpointTreeContainer analysisResult = usedVpFinder.getAnalysisResult();
					clean(analysisResult, session, monitor);
				}
			}
			
		} catch (ModelScrutinyException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}
	
	private void clean(ViewpointTreeContainer analysisResult, Session session, IProgressMonitor monitor) {
		ResourceSet fakeResourceSet = new ResourceSetImpl();
		Collection<String> viewpointToRemove = analysisResult.getViewpointToRemove();
		cleanViewpontRepresentationFromSession(session, monitor, fakeResourceSet, viewpointToRemove);
	}

	private void cleanViewpontRepresentationFromSession(Session session, IProgressMonitor monitor,
			ResourceSet fakeResourceSet, Collection<String> viewpointToRemove) {
		for (String id : viewpointToRemove) {
			try {
				Representation representation = getViewpointRepresentation(fakeResourceSet, id);
				EList<RepresentationElement> representations = representation.getRepresentations();
				for (RepresentationElement re : representations) {
					if (re instanceof SiriusRepresentation){
						SiriusRepresentation sr = (SiriusRepresentation)re;
						EList<org.eclipse.sirius.viewpoint.description.Viewpoint> ownedViewpoints = getViewpointRepresentationGroups(sr);
						Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> selectedViewpoints = session.getSelectedViewpoints(true);
						Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
						
						for (DRepresentation dRepresentation : allRepresentations) {
							if (dRepresentation instanceof DDiagram){
								DDiagram diagram = (DDiagram)dRepresentation;
								deactivateViewpointAdditionalLayers(session, monitor, ownedViewpoints, diagram);
							}
						}
						deleteViewpointDView(session, ownedViewpoints, selectedViewpoints);
						
						unselectSiriusViewpointFromSession(session, monitor, ownedViewpoints);
					}
				}
			} catch (ResourceNotFoundException e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			}
		}
	}

	private void unselectSiriusViewpointFromSession(Session session, IProgressMonitor monitor,
			EList<org.eclipse.sirius.viewpoint.description.Viewpoint> ownedViewpoints) {
		Set<org.eclipse.sirius.viewpoint.description.Viewpoint> deselectedViewpoints = new HashSet<>(ownedViewpoints);
		ChangeViewpointSelectionCommand  deselectSiriusVp = new ChangeViewpointSelectionCommand(session, new ViewpointSelectionCallback(),  new HashSet<org.eclipse.sirius.viewpoint.description.Viewpoint>(), deselectedViewpoints, monitor);
		TransactionalEditingDomain ed = session.getTransactionalEditingDomain();
		CommandStack commandStack = ed.getCommandStack();
		if (deselectSiriusVp.canExecute()){
			commandStack.execute(deselectSiriusVp);
		}
	}

	private void deleteViewpointDView(Session session,
			EList<org.eclipse.sirius.viewpoint.description.Viewpoint> ownedViewpoints,
			Collection<org.eclipse.sirius.viewpoint.description.Viewpoint> selectedViewpoints) {
		
		Collection<DView> ownedViews = session.getOwnedViews();
		Collection<DView> toDelete = new HashSet<>();
		for (org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint : ownedViewpoints) {
			for (DView dView : ownedViews) {
				if (dView.getViewpoint().getName().equals(viewpoint.getName())){
					toDelete.add(dView);
				}
			}
		}
		for (DView dView : toDelete) {
			Command deleteCommand = RemoveCommand.create(session.getTransactionalEditingDomain(), dView);
			
			if (deleteCommand.canExecute()){
				session.getTransactionalEditingDomain().getCommandStack().execute(deleteCommand);
			}
		}
	}

	private void deactivateViewpointAdditionalLayers(Session session, IProgressMonitor monitor,
			EList<org.eclipse.sirius.viewpoint.description.Viewpoint> ownedViewpoints, DDiagram diagram) {
		EList<Layer> activatedLayers = diagram.getActivatedLayers();
		ArrayList<Command> commands = new ArrayList<>();
		for (Layer layer : activatedLayers) {
			if (layer instanceof AdditionalLayer && !((AdditionalLayer) layer).isActiveByDefault()){
				org.eclipse.sirius.viewpoint.description.Viewpoint viewpoint = (org.eclipse.sirius.viewpoint.description.Viewpoint)layer.eContainer().eContainer();
				for (org.eclipse.sirius.viewpoint.description.Viewpoint _vp : ownedViewpoints) {
					if (_vp.getName().equals(viewpoint.getName())){
						ChangeLayerActivationCommand c = new ChangeLayerActivationCommand(session.getTransactionalEditingDomain(), diagram, layer, monitor);
						commands.add(c);
					}
				}
			}
		}
		for (Command command : commands) {
			if (command.canExecute()){
				session.getTransactionalEditingDomain().getCommandStack().execute(command);
			}
		}
	}

	private EList<org.eclipse.sirius.viewpoint.description.Viewpoint> getViewpointRepresentationGroups(
			SiriusRepresentation sr) {
		Group odesign = sr.getOdesign();
		EList<org.eclipse.sirius.viewpoint.description.Viewpoint> ownedViewpoints = odesign.getOwnedViewpoints();
		return ownedViewpoints;
	}

	private Representation getViewpointRepresentation(ResourceSet fakeResourceSet, String id)
			throws ResourceNotFoundException {
		org.polarsys.kitalpha.resourcereuse.model.Resource resource = ResourceReuse.createHelper().getResource(id);
		String path = resource.getPath();
		URI uri = createPlatformPluginURI(path, true);
		EObject eObject = fakeResourceSet.getEObject(uri, true);
		Viewpoint vp = (Viewpoint)eObject;
		Representation representation = vp.getRepresentation();
		return representation;
	}
	
	public static URI createPlatformPluginURI(String pathName, boolean encode){
		if (pathName == null || pathName.isEmpty()){
			throw new IllegalArgumentException("Could not create URI with null or empty path");
		}
		
		return URI.createURI("platform:/plugin" + pathName);
	}

	@SuppressWarnings("rawtypes")
	private UsedAFViewpoints getUsedAFFinder(RegistryElement regElt) {

		Collection<IScrutinize> finders = regElt.getFinders();

		for (IScrutinize iFinder : finders) {
			if (iFinder instanceof UsedAFViewpoints){
				//There are one finder of viewpoints
				return (UsedAFViewpoints)iFinder;
			}
		}
		return null;
	}
}
