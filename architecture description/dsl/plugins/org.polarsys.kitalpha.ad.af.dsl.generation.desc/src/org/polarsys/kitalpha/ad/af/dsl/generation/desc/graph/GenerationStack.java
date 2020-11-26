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

import java.util.Stack;
import java.util.Vector;

import org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal.fifo.GenerationFifoList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationStack {

	private Stack<GenerationNode> _stack = new Stack<GenerationNode>();
	private Stack<Viewpoint> _vpStack = new Stack<Viewpoint>();
	
	/**
	 * Compute the generation stack
	 * @param graph
	 */
	public void compute(GenerationGraph graph){
		GenerationGraphCycle cycleDetect = new GenerationGraphCycle(graph);
		cycleDetect.analyse();
		if (cycleDetect.exist())
		{
			return;
		}
		_stack.clear();
		_vpStack.clear();
		
		GenerationGraph cgraph = graph.clone();
		computeStack(cgraph);
		reorderStack();
	}
	
	public void reorderStack(){
		GenerationFifoList fifoList = new GenerationFifoList();
		GenerationNode node = _stack.pop();
		while (node != null) 
		{
			fifoList.enfiler(node);
			node = (_stack.isEmpty() ? null : _stack.pop());
		}
		
		while (!fifoList.isEmpty()) 
		{
			GenerationNode node2 = fifoList.defiler();
			_stack.push(node2);
			_vpStack.push(node2.getViewpoint());
		}
	}
	
	@SuppressWarnings("unchecked")
	public void print(){
		
		Stack<GenerationNode> sClone = (Stack<GenerationNode>)_stack.clone();
		System.out.println("Generation Stack - Begin");
		while (!sClone.isEmpty())
		{
			String name = sClone.pop().getName();
			System.out.println(" " + name);
		}
		System.out.println("Generation Stack - End");
	}
	
	/**
	 * @return generation stack 
	 */
	@SuppressWarnings("unchecked")
	public Stack<GenerationNode> getGenerationNodeStack(){
		return (Stack<GenerationNode>)_stack.clone();
	}
	
	/**
	 * @return generation stack 
	 */
	@SuppressWarnings("unchecked")
	public Stack<Viewpoint> getViewpointStack(){
		return (Stack<Viewpoint>) _vpStack.clone();
	}
	
	public GenerationNode getNextNode(){
		return !_stack.isEmpty()? _stack.pop() : null;
	}
	
	/**
	 * This method add nodes to the generation stack. The idea is :
	 * 1- Compute the leaf nodes list
	 * 1- Add each leaf node in the stack 
	 * 2- remove all leaf nodes from the graph
	 * 
	 * Repeat steps 1, 2 and 3 until the graph will be empty 
	 * @param graph
	 */
	private void computeStack(GenerationGraph graph){
		if (!graph.isEmpty())
		{
			Vector<GenerationNode> leafs = graph.getLeafs();
			for (GenerationNode node : leafs) {
				if (!_stack.contains(node))
				{
					_stack.push(node);
				}
			}
			for (GenerationNode node : leafs)
			{
				graph.remove(node);
			}

			computeStack(graph);
		}
	}
	
}
