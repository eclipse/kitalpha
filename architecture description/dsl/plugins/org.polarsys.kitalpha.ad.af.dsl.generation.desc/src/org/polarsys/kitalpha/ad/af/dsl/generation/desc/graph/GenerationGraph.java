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

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph;

import java.util.List;
import java.util.Vector;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationEdge.ViewpointLinkKind;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint.PlatformViewpointHelper;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationGraph {
	
	private Vector<GenerationNode> _owned_GenerationNodes;
	
	private Vector<GenerationEdge> _owned_GenerationEdges;
	
	
	/**
	 * Constructor with parameter
	 * @param architectureFramework a description of an architecture framework.
	 */
	public GenerationGraph(ArchitectureFramework architectureFramework) {
		_owned_GenerationNodes = new Vector<GenerationNode>();
		_owned_GenerationEdges = new Vector<GenerationEdge>();
		if (architectureFramework != null)
		{
			createGraphNodes(architectureFramework);
			createGraphEdges();
		}
	}
	
	@SuppressWarnings("unchecked")
	public GenerationGraph clone(){
		GenerationGraph theClone = new GenerationGraph(null);
		theClone.getOwnedEdges().addAll((Vector<GenerationEdge>)this.getOwnedEdges().clone());
		theClone.getOwnedNodes().addAll((Vector<GenerationNode>)this.getOwnedNodes().clone());
		return theClone;
	}
	
	public void remove(GenerationNode node){
		// Compute Edge that one of it side is linked to the node to remove.
		Vector<GenerationEdge> concernedEdges = new Vector<GenerationEdge>();
		for (GenerationEdge edge : getOwnedEdges()) 
		{
			if (edge.getSourceNode().equals(node))
				if (concernedEdges.contains(edge) == false)
					concernedEdges.add(edge);
		
			if (edge.getTargetNode().equals(node))
				if (concernedEdges.contains(edge) == false)
					concernedEdges.add(edge);
		}
		
		// Remove concerned Edges
		for (GenerationEdge cEdge : concernedEdges) 
			remove(cEdge);
		
		// Remove Node
		getOwnedNodes().remove(node);
	}
	
	public void remove(GenerationEdge edge){
		if (getOwnedEdges().contains(edge))
			getOwnedEdges().remove(edge);
	}
	
	private void createGraphEdges(){
		for (GenerationNode node : _owned_GenerationNodes) 
		{
			List<Viewpoint> parents = node.getViewpoint().getParents();
			if (parents != null && parents.size() > 0)
			{
				for (Viewpoint parent : parents) 
				{
					GenerationNode target_node = getNode(parent);
					if (target_node != null)
					{
						GenerationEdge edge = new GenerationEdge();
						edge.setKind(ViewpointLinkKind.PARENT);
						edge.setSourceNode(node);
						edge.setTargetNode(target_node);
						_owned_GenerationEdges.add(edge);
					}
				}
			}
			
			List<Viewpoint> dependencies = node.getViewpoint().getDependencies();
			if (dependencies != null && dependencies.size() > 0)
			{
				for (Viewpoint dependencie : dependencies) 
				{
					GenerationNode target_node = getNode(dependencie);
					if (target_node != null)
					{
						GenerationEdge edge = new GenerationEdge();
						edge.setKind(ViewpointLinkKind.DEPENDECIES);
						edge.setSourceNode(node);
						edge.setTargetNode(target_node);
						_owned_GenerationEdges.add(edge);
					}
				}
			}
		}
	}
	
	public Vector<GenerationNode> getReferencingNodes(GenerationNode node){
		Vector<GenerationNode> result = new Vector<GenerationNode>();
		for (GenerationEdge edge : getOwnedEdges()) 
			if (edge.getTargetNode().equals(node) && result.contains(edge.getSourceNode()))
				result.add(edge.getSourceNode());
		
		return result;
	}
	
	public Vector<GenerationNode> getLeafs(){
		Vector<GenerationNode> result = new Vector<GenerationNode>();
		for (GenerationNode node : getOwnedNodes()) 
			if (isIsolatedNode(node))
				result.add(node);
		
		Vector<GenerationNode> targetedNodes = new Vector<GenerationNode>();
		for (GenerationEdge edge : getOwnedEdges()) 
		{
			GenerationNode node = edge.getTargetNode();
			if (targetedNodes.contains(node) == false)
				targetedNodes.add(node);
		}
		for (GenerationNode node : targetedNodes) 
		{
			boolean isLeaf = true;
			for (GenerationEdge edge : getOwnedEdges())
			{
				if (edge.getSourceNode().equals(node))
				{
					isLeaf = false;
					break;
				}
			}
			
			if (isLeaf && (result.contains(node) == false))
				result.add(node);
		}
		return result;
	}
	
	public Vector<GenerationNode> getNeighbors(GenerationNode node){
		Vector<GenerationNode> result = new Vector<GenerationNode>();
		for (GenerationEdge edge : _owned_GenerationEdges) 
			if (edge.getSourceNode().equals(node))
				result.add(edge.getTargetNode());
		
		return result;
	}
	
	private void createGraphNodes(ArchitectureFramework architectureFramework){
		Viewpoints vps = architectureFramework.getAf_viewpoints();
		if (vps != null)
		{
			for (Viewpoint viewpoint : vps.getOwned_viewpoints()) 
			{
				includeViewpointToGraph(viewpoint);
				List<Viewpoint> vpParents = viewpoint.getParents();
				if (vpParents != null && vpParents.size() > 0)
					for (Viewpoint vp : vpParents) 
						includeViewpointToGraph(vp);
				
				List<Viewpoint> vpDependecies = viewpoint.getDependencies();
				if (vpDependecies != null && vpDependecies.size() > 0)
					for (Viewpoint vp : vpDependecies) 
						includeViewpointToGraph(vp);
			}
		}
	}
	
	private void includeViewpointToGraph(Viewpoint viewpoint){
		if (PlatformViewpointHelper.isAFViewpointAvailable(viewpoint) == false)
		{
			GenerationNode node = getGenerationNode(viewpoint);
			if (node == null)
			{
				node = new GenerationNode(viewpoint);
				_owned_GenerationNodes.add(node);
			}
		}
	}
	
	public boolean isEmpty() {
		return getOwnedNodes().isEmpty();
	}
	
	public boolean isLastNode(GenerationNode generationNode){
		int nodeIndex = _owned_GenerationNodes.indexOf(generationNode);
		int nodeCount = _owned_GenerationNodes.size();
		return nodeIndex == nodeCount - 1;
	}
	
	private GenerationNode getGenerationNode(Viewpoint viewpoint){
		for (GenerationNode generationNode : _owned_GenerationNodes) 
		{
			if (generationNode.getViewpoint().equals(viewpoint))
				return generationNode;
		}
		
		return null;
	}
	
	public GenerationNode getNode(Viewpoint viewpoint){
		for (GenerationNode generationNode : _owned_GenerationNodes) 
			if (EcoreUtil.equals(viewpoint, generationNode.getViewpoint()))
				return generationNode;
		
		return null;
	}
	
	/**
	 * Check if a node is isolated. Isolated means that this node is never 
	 * referenced by an Edge
	 * @param node
	 * @return True if the node is isolated, False else.
	 */
	public boolean isIsolatedNode(GenerationNode node){
		for (GenerationEdge edge : getOwnedEdges()) 
			if (edge.getSourceNode().equals(node) || edge.getTargetNode().equals(node))
				return false;
		
		return true;
	}
	
	public  Vector<GenerationNode> getOwnedNodes(){
		return _owned_GenerationNodes;
	}
	
	public  Vector<GenerationEdge> getOwnedEdges(){
		return _owned_GenerationEdges;
	}
	
	public void print(){
		System.out.println("Nodes");
		for (GenerationNode node : _owned_GenerationNodes) 
		{
			System.out.print(node.getName());
			
			if (! isLastNode(node))
				System.out.print(", ");
			else
				System.out.println(" ");
		}
		
		System.out.println("Edges");
		for (GenerationEdge edge : _owned_GenerationEdges) 
		{
			System.out.print(edge.getSourceNode().getName());
			switch (edge.getKind()) {
			case DEPENDECIES:
				System.out.print("=>");
				break;

			case PARENT:
				System.out.print("->");
				break;
			}
			System.out.print(edge.getTargetNode().getName());
			System.out.print(" | ");
		}
		System.out.println();
	}
}
