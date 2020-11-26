/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
	
	public void setSourceNode(GenerationNode sourceNode) {
		this._sourceNode = sourceNode;
	}
	
	public GenerationNode getTargetNode() {
		return _targetNode;
	}
	
	public void setTargetNode(GenerationNode targetNode) {
		this._targetNode = targetNode;
	}
	
	public GenerationNode getSourceNode() {
		return _sourceNode;
	}
	
	public ViewpointLinkKind getKind() {
		return _kind;
	}
	
	public void setKind(ViewpointLinkKind kind) {
		this._kind = kind;
	}
}
