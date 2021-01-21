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
