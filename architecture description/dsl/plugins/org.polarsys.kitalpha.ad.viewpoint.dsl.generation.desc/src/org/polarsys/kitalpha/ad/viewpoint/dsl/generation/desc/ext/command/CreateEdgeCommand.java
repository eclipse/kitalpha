/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.RefreshIdsHolder;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManager;
import org.eclipse.sirius.diagram.business.api.query.EdgeMappingQuery;
import org.eclipse.sirius.diagram.business.internal.componentization.mappings.DiagramMappingsManagerRegistryImpl;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.DDiagramElementSynchronizer;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.DDiagramSynchronizer;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.DEdgeCandidate;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.MappingBasedDecoration;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.SemanticBasedDecoration;

/**
 * Command that create an Edge in a diagram
 * 
 * @author Boubekeur Zendagui
 */
@SuppressWarnings("restriction")
public class CreateEdgeCommand extends RecordingCommand {

	/** Command properties **/
	private DDiagram _diagram;
	private Session _session;
	private EdgeMapping _mapping;
	private EObject _target;
	private boolean _isElementBasedEdge;
	
	/**
	 * Default constructor
	 * @param session the {@link Session} used to create the Edge
	 * @param diagramthe {@link DDiagram} wherein the Edge will be created
	 * @param mapping the {@link EdgeMapping} describing the edge
	 * @param target {@link EObject} used as target semantic element of the edge
	 * @param isElementBasedEdge if <code> true </code> the edge is an element based edge
	 */
	public CreateEdgeCommand(Session session, DDiagram diagram, EdgeMapping mapping, EObject target, boolean isElementBasedEdge){
		this(session.getTransactionalEditingDomain());
		this._diagram = diagram;
		this._session = session;
		this._mapping = mapping;
		this._target = target;
		this._isElementBasedEdge = isElementBasedEdge;
	}
	
	/**
	 * Hidden constructor
	 * @param domain a {@link TransactionalEditingDomain}
	 */
	private CreateEdgeCommand(TransactionalEditingDomain domain) {
		super(domain);
	}
	
	@Override
	protected void doExecute() {
		final DDiagramSynchronizer diagramSynchronizer = new DDiagramSynchronizer(_session.getInterpreter(), _diagram.getDescription(), _session.getModelAccessor());
		diagramSynchronizer.setDiagram((DSemanticDiagram)_diagram);
		
		/* maps for decorations */
		Map<EdgeMapping, Collection<MappingBasedDecoration>> edgeToMappingBasedDecoration = new HashMap<EdgeMapping, Collection<MappingBasedDecoration>>();
		Map<String, Collection<SemanticBasedDecoration>> edgeToSemanticBasedDecoration = new HashMap<String, Collection<SemanticBasedDecoration>>();

		/* create the mapping to edge targets map */
		DDiagramElementSynchronizer elementSynchronizer = diagramSynchronizer.getElementSynchronizer();
		Map<DiagramElementMapping, Collection<EdgeTarget>> mappingsToEdgeTargets = elementSynchronizer.computeMappingsToEdgeTargets(_session.getSelectedViewpoints(false));
//TODO fix me
//		diagramSynchronizer.computeDecorations(mappingsToEdgeTargets, edgeToSemanticBasedDecoration, edgeToMappingBasedDecoration);
		
		final DiagramMappingsManager diagramMappingsManager = DiagramMappingsManagerRegistryImpl.INSTANCE.getDiagramMappingsManager(_session, _diagram);

		/* create Edge Candidate object*/
		try {
			/* Get all possible source nodes from the diagram */
			List<EdgeTarget> sourceNodes = getSourceNodes();
			/* Get all possible target nodes from the diagram */
			List<EdgeTarget> targetNodes = getTargetNodes();
			/* Try to create edges between sources and targets */
			RefreshIdsHolder refreshIdsHolder = new RefreshIdsHolder();
			for (EdgeTarget sourceEdgeTarget : sourceNodes) 
			{
				for (EdgeTarget targetEdgeTarget : targetNodes) 
				{
					// 
					EdgeMappingQuery edgeMappingQuery = new EdgeMappingQuery(_mapping);
					boolean precondition = edgeMappingQuery.evaluatePrecondition((DSemanticDiagram)_diagram, _diagram, _session.getInterpreter(), _target, (DSemanticDecorator)sourceEdgeTarget, (DSemanticDecorator)targetEdgeTarget);
					if (precondition)
					{
						DEdgeCandidate candidate = new DEdgeCandidate(_mapping,_target, sourceEdgeTarget, targetEdgeTarget, refreshIdsHolder);
						elementSynchronizer.createNewEdge(diagramMappingsManager, candidate, mappingsToEdgeTargets, edgeToMappingBasedDecoration, edgeToSemanticBasedDecoration);
					}
				}
			}
		} catch (EvaluationException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get all source
	 * @return a list of {@link EdgeTarget} element candidate to be source node
	 * @throws EvaluationException
	 */
	public List<EdgeTarget> getSourceNodes() throws EvaluationException{
		List<EdgeTarget> result = new ArrayList<EdgeTarget>();
		Collection<EObject> sematicSources = new ArrayList<EObject>();
		
		IInterpreter interpreter = _session.getInterpreter();
		if (_isElementBasedEdge)
			sematicSources = interpreter.evaluateCollection(_target, _mapping.getSourceFinderExpression());
		else
			sematicSources.add(_target);

		EList<DiagramElementMapping> sourceMapping = _mapping.getSourceMapping();
		for (EObject eObject : sematicSources) 
		{
			List<EdgeTarget> sources = getNodesFromDiagram(sourceMapping, eObject);
			if (! sources.isEmpty())
				result.addAll(sources);
		}

		return result;
	}
	
	public List<EdgeTarget> getTargetNodes() throws EvaluationException{
		List<EdgeTarget> result = new ArrayList<EdgeTarget>();
		IInterpreter interpreter = _session.getInterpreter();
		Collection<EObject> sematicTarget = new ArrayList<EObject>();
		try {
			sematicTarget = interpreter.evaluateCollection(_target, _mapping.getTargetFinderExpression());
		} catch (EvaluationException e) {
			// TODO: handle exception
		}

		EList<DiagramElementMapping> targetMapping = _mapping.getTargetMapping();
		for (EObject eObject : sematicTarget) 
		{
			List<EdgeTarget> targets = getNodesFromDiagram(targetMapping, eObject);
			if (! targets.isEmpty())
				result.addAll(targets);
		}

		return result;
	}

	/**
	 * Get node from diagram
	 * @param mapping a list of {@link DiagramElementMapping} 
	 * @param semantic the semantic element
	 * @return
	 */
	private List<EdgeTarget> getNodesFromDiagram(EList<DiagramElementMapping> mapping, EObject semantic) {
		List<EdgeTarget> result = new ArrayList<EdgeTarget>();
		// Get the diagram node for which semantic element is target
		for (DiagramElementMapping diagramElementMapping : mapping) 
		{
			if (diagramElementMapping instanceof ContainerMapping)
			{
				EList<DDiagramElementContainer> containers = _diagram.getContainersFromMapping((ContainerMapping) diagramElementMapping);
				for (DDiagramElementContainer dDiagramElementContainer : containers) 
				{
					if (dDiagramElementContainer.getTarget().equals(semantic))
						result.add(dDiagramElementContainer);
				}
				
			}
			
			if (diagramElementMapping instanceof NodeMapping)
			{
				EList<DNode> nodes = _diagram.getNodesFromMapping((NodeMapping) diagramElementMapping);
				for (DNode dNode : nodes) 
				{
					if (dNode.getTarget().equals(semantic))
						result.add(dNode);
				}
			}
		}
		return result;
	}

}
