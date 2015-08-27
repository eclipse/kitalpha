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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.RefreshIdsHolder;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManager;
import org.eclipse.sirius.diagram.business.api.query.AbstractNodeMappingQuery;
import org.eclipse.sirius.diagram.business.internal.componentization.mappings.DiagramMappingsManagerRegistryImpl;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.AbstractDNodeCandidate;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.DDiagramSynchronizer;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;

/**
 * Recording command allowing to create a node in a diagram
 * @author Boubekeur Zendagui
 */

@SuppressWarnings("restriction")
public class CreateNodeCommand extends RecordingCommand {

	/** Command properties **/
	private DDiagram _diagram;
	private Session _session;
	private AbstractNodeMapping _mapping;
	private EObject _target;
	
	/** Internal properties **/
	private DDiagramSynchronizer diagramSynchronizer;
	private DiagramMappingsManager diagramMappingsManager;
	private IInterpreter interpreter;
	private ModelAccessor modelAccessor;
	
	/**
	 * Default constructor
	 * @param session used {@link Session} to create representations
	 * @param diagram {@link DDiagram} wherein the node will be created
	 * @param mapping an {@link AbstractNodeMapping} used to create the node
	 * @param target semantic element
	 */
	public CreateNodeCommand(Session session, DDiagram diagram, AbstractNodeMapping mapping, EObject target ) {
		this(session.getTransactionalEditingDomain());
		this._diagram = diagram;
		this._session = session;
		this._mapping = mapping;
		this._target = target;
		/* This properties are set as class properties because they are used in a recursive method #createOneNode().
		 * This allows to control created instance number. */
		this.interpreter = _session.getInterpreter();
		this.diagramSynchronizer = new DDiagramSynchronizer(this.interpreter, _diagram.getDescription(), _session.getModelAccessor());
		this.diagramSynchronizer.setDiagram((DSemanticDiagram)_diagram);
		this.diagramMappingsManager = DiagramMappingsManagerRegistryImpl.INSTANCE.getDiagramMappingsManager(_session, _diagram);
		this.modelAccessor = _session.getModelAccessor();
	}
	
	/**
	 * Hidden constructor
	 * @param domain {@link TransactionalEditingDomain}
	 */
	private CreateNodeCommand(TransactionalEditingDomain domain) {
		super(domain);
	}

	@Override
	protected void doExecute() {
		AbstractNodeMappingQuery abstractNodeMappingQuery = new AbstractNodeMappingQuery(_mapping);
		boolean preCondition = abstractNodeMappingQuery.evaluatePrecondition((DSemanticDiagram)_diagram, _diagram, interpreter, _target);
		if (preCondition)
		{
			createNodeAndItChildrenNodes(_target, _mapping, _diagram);
		}
	}
	
	
	/**
	 * Create node and its sub nodes if there is sub mappings defined in it description 
	 * @param nodeMapping current {@link AbstractNodeMapping} which can be a {@link NodeMapping} or a {@link ContainerMapping}
	 * @param semantic current root semantic element
	 * @param parent a {@link DragAndDropTarget} element wherein the node will be created
	 */
	private void createNodeAndItChildrenNodes(EObject semantic, AbstractNodeMapping nodeMapping, DragAndDropTarget parent){
		// create concerned node
		AbstractDNode parentNode = createOneNode(semantic, nodeMapping, parent);
		
		// create it sub nodes
		EList<AbstractNodeMapping> childrenNodeMapping = new BasicEList<AbstractNodeMapping>();
		for (DiagramElementMapping iDiagramElementMapping : nodeMapping.getAllMappings())
		{
			if (iDiagramElementMapping instanceof AbstractNodeMapping)
				childrenNodeMapping.add((AbstractNodeMapping) iDiagramElementMapping);
		}
		
		for (AbstractNodeMapping childNodeMapping : childrenNodeMapping) 
		{
			Collection<EObject> candidatesSemanticChildren = new ArrayList<EObject>();
			try {
				candidatesSemanticChildren = interpreter.evaluateCollection(semantic, childNodeMapping.getSemanticCandidatesExpression());
			} catch (EvaluationException e) {
				e.printStackTrace();
			}

			for (EObject childSemantic : candidatesSemanticChildren) 
			{
				if (modelAccessor.eInstanceOf(childSemantic, childNodeMapping.getDomainClass()))
					createNodeAndItChildrenNodes(childSemantic, childNodeMapping, (DragAndDropTarget) parentNode);
			}
		}
	}

	/**
	 * Create one node in the current {@link DDiagram}
	 * @param mapping {@link AbstractNodeMapping} describing the node to create
	 * @param target {@link EObject} used to create the node
	 * @param parent a {@link DragAndDropTarget} element wherein the node will be created
	 */
	private AbstractDNode createOneNode(EObject target, AbstractNodeMapping mapping, DragAndDropTarget parent){
		RefreshIdsHolder refreshIdsHolder = new RefreshIdsHolder();
		final AbstractDNodeCandidate abstractDNodeCandidate = new AbstractDNodeCandidate(mapping, target, parent, refreshIdsHolder); 
		return diagramSynchronizer.getElementSynchronizer().createNewNode(diagramMappingsManager, abstractDNodeCandidate, false);
	}

}
