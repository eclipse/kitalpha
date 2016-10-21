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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;

/**
 * @author Boubekeur Zendagui
 */
public class ANode {
	private Class _domainContext = null;
	private ANode _parent = null;
	private AbstractAssociation _providingAssociation;
	private List<ANode> children = new ArrayList<ANode>();
	private List<ANode> reused = new ArrayList<ANode>();
	
	/**
	 * Default Constructor
	 * @param clazz the domain element of the node
	 * @param containingRef the containing reference
	 */
	public ANode(Class clazz, AbstractAssociation containingRef) {
		this._domainContext = clazz;
		this._providingAssociation = containingRef;
	}
	
	/**
	 * @return the name of the {@link ANode}
	 */
	public String getName(){
		return _domainContext.getName();
	}
	
	/**
	 * @return The parent {@link ANode}
	 */
	public ANode getParent(){
		return this._parent;
	}
	
	/**
	 * Parent {@link ANode} setter
	 * @param parent the parent {@link ANode}
	 */
	public void setParent(ANode parent){
		this._parent = parent;
	}
	
	/**
	 * @return The fully qualified name.
	 */
	public String getFQN(){
		String name = _domainContext.getName();
		
		ANode node = this;
		while (node.getParent() != null)
		{
			ANode parent = node.getParent();
			name = parent.getName() + "." + name;
			node = parent;
		}
		
		return name;
	}
	
	/**
	 * Add a new entry in children list
	 * @param node the new children
	 */
	public void addChildren(ANode node){
		if (! children.contains(node))
		{
			children.add(node);
			node.setParent(this);
		}
	}
	
	/**
	 * Add a collection of {@link ANode} in children list
	 * @param node the new children
	 */
	public void addAllChildren(List<ANode> node){
		for (ANode aNode : node) 
		{
			addChildren(aNode);
		}
	}
	
	/**
	 * @return the {@link List} of reused {@link ANode}s by the current {@link ANode}
	 */
	public List<ANode> getReuse(){
		return reused;
	}
	
	/**
	 * @return the {@link List} of children {@link ANode}s of the current {@link ANode}
	 */
	public List<ANode> getChildren(){
		return children;
	}
	
	/**
	 * Add a new entry in reused list
	 * @param node the new node 
	 */
	public void addReuse(ANode node){
		if (! reused.contains(node))
			reused.add(node);
	}
	
	/**
	 * Add a new entry in reused list
	 * @param node the new node 
	 */
	public void addAllReuse(List<ANode> node){
		for (ANode aNode : node) 
		{
			addReuse(aNode);
		}
	}
	
	/**
	 * @return The associated {@link Class}
	 */
	public Class getVPClass(){
		return _domainContext;
	}
	
	/**
	 * @return The associated {@link AbstractAssociation}
	 */
	public AbstractAssociation getContainingReference(){
		return _providingAssociation;
	}
	
	/**
	 * Check whether the node is a container or not. A Node is a container if it children 
	 * or reused lists are not empty
	 * @return True if the node contains children
	 */
	public boolean isContainer(){
		if (!children.isEmpty() || ! reused.isEmpty())
			return true;
		
		return false;
	}
	
	/**
	 * Return associated {@link Class} Fully qualified Name
	 * @return {@link Class} FQN
	 */
	public String getClassFQN(){
		return ADataAnalyserHelper.getFQN(_domainContext);
	}
	
	/**
	 * Return associated {@link AbstractAssociation} Fully qualified Name
	 * @return {@link AbstractAssociation} FQN
	 */
	public String getContainingReferenceFQN(){
		return ADataAnalyserHelper.getFQN(_providingAssociation);
	}
}