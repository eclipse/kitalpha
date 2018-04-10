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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;

/**
 * @author Boubekeur Zendagui
 */
public class AEdge {
	protected AbstractAssociation _targetRef;
	protected List<ANode> _sourceNodes = new ArrayList<ANode>();
	protected List<ANode> _targetNodes = new ArrayList<ANode>();
	
	/**
	 * Default constructor
	 * @param reference target finder association 
	 */
	public AEdge(AbstractAssociation reference) {
		this._targetRef = reference;
	}
	
	/**
	 * Add an {@link ANode} in the edge source nodes list if it was not added yet
	 * @param node the {@link ANode} to add in source nodes list
	 * @return True is the {@link ANode} is added to list, False otherwise
	 */
	public boolean addSourceNode(ANode node){
		if (isNodeAvailableIn(node, this._sourceNodes)) {
			return false;
		}
		_sourceNodes.add(node);
		return true;
	}
	
	/**
	 * Add an {@link ANode} in the edge target nodes list if it was not added yet
	 * @param node the {@link ANode} to add in target nodes list
	 * @return True is the {@link ANode} is added to list, False otherwise
	 */
	public boolean addTargetNode(ANode node){
		if (isNodeAvailableIn(node, this._targetNodes)) {
			return false;
		}
		_targetNodes.add(node);
		return true;
	}
	
	/**
	 * Target reference getter
	 * @return
	 */
	public AbstractAssociation getTargetReference(){
		return _targetRef;
	}
	
	/**
	 * Return associated {@link AbstractAssociation} Fully qualified Name
	 * @return {@link AbstractAssociation} FQN
	 */
	public String getTargetReferenceFQN(){
		return ADataAnalyserHelper.getFQN(_targetRef);
	}
	
	/**
	 * Source nodes getter
	 * @return Edge source {@link ANode}s
	 */
	public List<ANode> getSourceNodes(){
		return _sourceNodes;
	}

	public String getSourceNodesFQN(){
		return getNodesFQN(_sourceNodes);
	}
	
	public String getTargetNodesFQN(){
		return getNodesFQN(_targetNodes);
	}
	
	private String getNodesFQN(List<ANode> nodes){
		String result = "";
		if (! nodes.isEmpty())
		{
			ANode aNode = nodes.get(0);
			result += aNode.getFQN();
		}
		
		if (nodes.size() > 1)
		{
			for (int i = 1; i < nodes.size(); i++) 
			{
				ANode aNode = nodes.get(i);
				result += ", " + aNode.getFQN();
			}
		}
		
		return result;
	}
	
	/**
	 * Target nodes getter
	 * @return Edge target {@link ANode}s
	 */
	public List<ANode> getTargetNodes(){
		return _targetNodes;
	}
	
	/**
	 * Compute the name of the Edge
	 * @return Edge name
	 */
	public String getName(){
		String edgeName = _targetRef.getName();
		EObject eContainer = _targetRef.eContainer();
		if (eContainer instanceof Class)
		{
			String name = ((Class) eContainer).getName();
			edgeName = name + "_" + edgeName;
		}
		return edgeName.trim();
	}
	
	/**
	 * Check in a {@link ANode} is available in source or target nodes lists
	 * @param node {@link ANode} to check
	 * @param nodeList {@link EdgeNodes} wherein check
	 * @return True if the {@link ANode} is available in the corresponding list, False otherwise
	 */
	private boolean isNodeAvailableIn(ANode node, List<ANode> nodes){
		final Class vpClass = node.getVPClass();
		final AbstractAssociation reference = node.getContainingReference();
		
		if (nodes != null)
		{
			for (ANode iNode : nodes) 
			{
				if (iNode.getVPClass().getName().equals(vpClass.getName()) &&
						iNode.getContainingReference().getName().equals(reference.getName()))
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
