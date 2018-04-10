/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * @author Boubekeur Zendagui
 */
public class ADataAnalyser {
	
	private List<ANode> allNodes;
	private List<ANode> rootNodes;
	private List<AEdge> allEdges;
	private Class _contextClass ;
	
	private boolean includeContextClassAsRoot = false;
	
	/**
	 * Default constructor
	 * @param context
	 */
	public ADataAnalyser(Class context) {
		_contextClass = context;
	}
	
	public ADataAnalyser(Class context, boolean includeContextClassAsRoot) {
		this(context);
		this.includeContextClassAsRoot = includeContextClassAsRoot;
	}
	
	/**
	 * @return Context {@link Class}
	 */
	public Class getContextClass(){
		return _contextClass;
	}
	
	/**
	 * @return All created {@link ANode}s by Viewpoint data analysis 
	 */
	public List<ANode> getAllNodes(){
		return allNodes;
	}
	
	/**
	 * @return Created root {@link ANode}s by Viewpoint data analysis 
	 */
	public List<ANode> getRootNodes(){
		return rootNodes;
	}
	
	/**
	 * @return All created {@link AEdge}s by Viewpoint data analysis 
	 */
	public List<AEdge> getAllEdges(){
		return allEdges;
	}
	
	/**
	 * Analyze the context and create a graph composed of {@link ANode}.
	 */
	public void Analyse(){
		allNodes = new ArrayList<ANode>();
		rootNodes = new ArrayList<ANode>();
		allEdges = new ArrayList<AEdge>();
		
		// Begin with root element creation
		if (includeContextClassAsRoot)
		{
			//FIXME workaround to include the context class as root in the analysis.
			//This feature must be buildin in the analyzer
			ExternalClassAssociation eca = VpdescFactory.eINSTANCE.createExternalClassAssociation();
			eca.setName("external emde.ExtensibleElement.ownedExtensions");
			eca.setExternalTarget(EmdePackage.Literals.ELEMENT_EXTENSION);
			createRootNode(_contextClass, eca);
		}
		else
		{
			createRootNodes();
		}
		
		// Create children of root elements
		for (ANode node : rootNodes) 
		{
			createNodeChildren(node);
		}
		
		createEdges();
	}
	
	protected void createEdges(){
		for (ANode iNode : allNodes) 
		{
			Class sourceClass = iNode.getVPClass();
			EList<AbstractAssociation> associations = sourceClass.getVP_Classes_Associations();
			for (AbstractAssociation abstractAssociation : associations) 
			{
				if (abstractAssociation instanceof LocalClassAssociation && 
						abstractAssociation.getType().equals(Association_Types.REFERENCE))
				{
					Class targetClass = ((LocalClassAssociation) abstractAssociation).getLocalTarget();
					if (targetClass.isAbstract())
					{
						EList<Class> localDescendantClasses = ADataAnalyserHelper.getLocalDescendantClasses(targetClass);
						for (Class iClass : localDescendantClasses) 
						{
							createEdge(abstractAssociation, sourceClass, iClass);
						}
					}
					else {
						createEdge(abstractAssociation, sourceClass, targetClass);
					}
				}
			}
		}
	}
	
	/**
	 * @param association 
	 * @param sourceNode
	 * @param targetNodes
	 */
	private AEdge createEdge(AbstractAssociation association, Class sourceClass, Class targetClass) {
		List<ANode> targetNodes = getNodesFor(targetClass);
		List<ANode> sourceNode = getNodesFor(sourceClass);
		if ((sourceNode != null && ! sourceNode.isEmpty()) && (targetNodes != null && ! targetNodes.isEmpty()))
		{
			AEdge edge = getEdgeFor(association, true);
			if (! allEdges.contains(edge)) {
				allEdges.add(edge);
			}
			
			for (ANode aNode : sourceNode) { 
				edge.addSourceNode(aNode);
			}

			for (ANode aNode : targetNodes) { 
				edge.addTargetNode(aNode);
			}

			return edge;
		}
		return null;
	}

	
	/**
	 * Create root nodes
	 */
	protected void createRootNodes(){
		EList<AbstractAssociation> classAssociations = ADataAnalyserHelper.getAllLocalAssociations(_contextClass);
		for (AbstractAssociation abstractAssociation : classAssociations) 
		{
			if (abstractAssociation instanceof LocalClassAssociation)
			{
				LocalClassAssociation localAssociation = (LocalClassAssociation) abstractAssociation;
				if (localAssociation.getType().equals(Association_Types.CONTAINMENT))
				{
					Class targetClass = localAssociation.getLocalTarget();
					if (targetClass.isAbstract())
					{
						EList<Class> localDescendantClasses = ADataAnalyserHelper.getLocalDescendantClasses(targetClass);
						for (Class iClass : localDescendantClasses) 
						{
							createRootNode(iClass, localAssociation);
						}
					}
					else
					{
						createRootNode(targetClass, localAssociation);
					}
				}
			}
		}
	}
	
	/**
	 * Create content of root nodes
	 * @param rootClass the {@link Class} used to create node content
	 * @param parent the parent {@link ANode}
	 */
	protected void createNodeChildren(ANode parent){
		Class rootClass = parent.getVPClass();
		EList<AbstractAssociation> classAssociations = ADataAnalyserHelper.getAllLocalAssociations(rootClass);
		for (AbstractAssociation abstractAssociation : classAssociations) 
		{
			if (abstractAssociation instanceof LocalClassAssociation)
			{
				LocalClassAssociation localAssociation = (LocalClassAssociation) abstractAssociation;
				if (localAssociation.getType().equals(Association_Types.CONTAINMENT))
				{
					Class targetClass = localAssociation.getLocalTarget();
					if (targetClass.isAbstract())
					{
						EList<Class> localDescendantClasses = ADataAnalyserHelper.getLocalDescendantClasses(targetClass);
						for (Class iClass : localDescendantClasses) 
						{
							createChildNode(parent, localAssociation, iClass);
						}
					}
					else {
						createChildNode(parent, localAssociation, targetClass);
					}
				}
			}
		}
	}
	
	/**
	 * Create one root {@link ANode}
	 * @param clazz the domain context of the {@link ANode}
	 * @param containingRef the containing reference
	 */
	private void createRootNode(Class clazz, AbstractAssociation containingRef){
		ANode node = new ANode(clazz, containingRef);
		rootNodes.add(node);
		allNodes.add(node);
	}

	/**
	 * @param parent
	 * @param containingAssociation
	 * @param clazz
	 */
	private void createChildNode(ANode parent, LocalClassAssociation containingAssociation, Class clazz) {
		ANode node = getNodeFor(clazz, containingAssociation);
		if (node != null)
		{
			parent.addReuse(node);
		}
		else
		{
			node = new ANode(clazz, containingAssociation);
			parent.addChildren(node);
			allNodes.add(node);
			if (isContainer(clazz))
			{
				createNodeChildren(node);
			}
		}
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	private ANode getNodeFor(Class clazz, AbstractAssociation containingRef){
		for (ANode iNode : allNodes) 
		{
			if (iNode.getVPClass().equals(clazz) &&
					iNode.getContainingReference().equals(containingRef))
			{
				return iNode;
			}
		}
		return null;
	}
	
	private List<ANode> getNodesFor(Class clazz){
		List<ANode> result = new UniqueEList<ANode>();
		for (ANode iNode : allNodes) 
		{
			if (iNode.getVPClass().equals(clazz))
			{
				result.add(iNode);
			}
		}
		return result;
	}
	
	private AEdge getEdgeFor(AbstractAssociation containingRef, boolean forceEdge){
		for (AEdge iEdge : allEdges) 
		{
			if (iEdge.getTargetReference().equals(containingRef)) {
				return iEdge;
			}
		}
		
		return forceEdge ? new AEdge(containingRef) : null;
	}
	
	/**
	 * Check if a {@link Class} has an association with type {@link Association_Types#CONTAINMENT}
	 * @param clazz the class to check
	 * @return True if the class contains a containment association, False otherwise.
	 */
	private boolean isContainer(Class clazz){
		EList<AbstractAssociation> classAssociations = ADataAnalyserHelper.getAllLocalAssociations(clazz);
		for (AbstractAssociation abstractAssociation : classAssociations) 
		{
			if (abstractAssociation instanceof LocalClassAssociation)
			{
				LocalClassAssociation localAssociation = (LocalClassAssociation) abstractAssociation;
				if (localAssociation.getType().equals(Association_Types.CONTAINMENT)) {
					return true;
				}
			}
		}
		return false;
	}
}
