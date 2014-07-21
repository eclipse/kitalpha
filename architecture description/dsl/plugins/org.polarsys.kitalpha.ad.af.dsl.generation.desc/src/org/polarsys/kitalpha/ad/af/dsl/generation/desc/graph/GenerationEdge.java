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

/**
 * @author Boubekeur Zendagui
 */

public class GenerationEdge {
	
	enum ViewpointLinkKind {
		DEPENDECIES, PARENT;
	}
	
	private GenerationNode _sourceNode = null;
	
	private GenerationNode _targetNode = null;
	
	private ViewpointLinkKind _kind = ViewpointLinkKind.DEPENDECIES;
	
	public void setSourceNode(GenerationNode _sourceNode) {
		this._sourceNode = _sourceNode;
	}
	
	public GenerationNode getTargetNode() {
		return _targetNode;
	}
	
	public void setTargetNode(GenerationNode _targetNode) {
		this._targetNode = _targetNode;
	}
	
	public GenerationNode getSourceNode() {
		return _sourceNode;
	}
	
	public ViewpointLinkKind getKind() {
		return _kind;
	}
	
	public void setKind(ViewpointLinkKind _kind) {
		this._kind = _kind;
	}
}
