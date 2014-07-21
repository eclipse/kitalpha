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

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal.fifo;

import java.util.LinkedList;

import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationNode;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationFifoList {
	
	private LinkedList<GenerationNode> _list = new LinkedList<GenerationNode>();

	public void enfiler(GenerationNode node){
		_list.addLast(node);
	}
	
	public GenerationNode defiler(){
		GenerationNode result = _list.getFirst(); 
		_list.removeFirst();
		return result;
	}
	
	public boolean isEmpty(){
		return _list.isEmpty();
	}
}
