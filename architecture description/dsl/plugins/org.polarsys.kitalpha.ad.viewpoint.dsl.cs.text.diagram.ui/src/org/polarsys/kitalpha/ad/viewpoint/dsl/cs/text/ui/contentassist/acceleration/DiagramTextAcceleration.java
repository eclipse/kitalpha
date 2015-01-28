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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.acceleration;

import java.util.List;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration.ADataAnalyser;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration.ADataAnalyserHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration.AEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration.ANode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpdiagramActivator;


/**
 * @author Boubekeur Zendagui
 *         Faycal Abka
 */

public class DiagramTextAcceleration {

	private ADataAnalyser dataAnalyser;
	
	private IQualifiedNameProvider qualifiedNameProvider;
	
	private TreeAppendable appendable;
	
	private boolean firstGeneration_container = true;
	private boolean firstGeneration_node = true;
	
	public DiagramTextAcceleration(Class rootClass, IQualifiedNameProvider qualifiedNameProvider, TreeAppendable appendable) {
		
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.appendable = appendable;
		
		dataAnalyser = new ADataAnalyser(rootClass);
		dataAnalyser.Analyse();
	}
	
	public void generateNodesText() {
		for (ANode node : dataAnalyser.getRootNodes()) 
		{
			printNode(node);
		}
	}
	
	
	//FIXME: indent when generation will be enabled
	public void generateEdgesText() {
		for (AEdge aEdge : dataAnalyser.getAllEdges()) 
		{
			
			appendable.newLine();
			appendable.append("Edge ").append(aEdge.getName()).append(" {");
			appendable.newLine();
			appendable.append("association-context: ").append(qualifiedNameProvider.apply(aEdge.getTargetReference()).toString());
			appendable.newLine();
			appendable.append("source: ").append(aEdge.getSourceNodesFQN());
			appendable.newLine();
			appendable.append("target: ").append(aEdge.getTargetNodesFQN());
			appendable.newLine();
			appendable.append("Representation {");
			appendable.newLine();
			appendable.append("Style {").newLine();
			appendable.append("end-decorator: InputArrow color: black");
			appendable.newLine().append("}");
			appendable.newLine().append("}");
			appendable.newLine().append("}");
		}
	}
	
	public void generateActionsText() {
		
		for (ANode node : dataAnalyser.getAllNodes()) 
		{
			appendable.increaseIndentation().newLine();
			appendable.append("/*").append(node.getName()).append(" Actions */");
			appendable.newLine();
			
			long suffix = VpdiagramActivator.getAndIncrementDiagram_suffix();
			appendable.append("Create ").append(node.getName().trim()).append("_CT_" + suffix).append("{");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(node.getName()).append(node.getFQN()).append("\" ");
			appendable.append("action-for: ").append(node.getFQN());
			appendable.decreaseIndentation().newLine();
			appendable.append("}");
			
			
			if (node.getParent() != null){
				appendable.newLine();
				appendable.append("Drop ").append(node.getName().trim()).append("_DT_" + suffix).append("{");
				appendable.increaseIndentation().newLine();
				appendable.append("action-for: ").append(node.getFQN());
				appendable.decreaseIndentation().newLine();
				appendable.append("}");
			}
			appendable.decreaseIndentation();
			
		}
		
		for (AEdge edge : dataAnalyser.getAllEdges()) 
		{
			appendable.newLine().append("/*").append(edge.getName()).append(" Actions */ ");
			appendable.newLine();
			appendable.append("Create ").append(edge.getName().trim()).append("_CT {");
			appendable.newLine();
			appendable.append("label: \"").append(edge.getName()).append("\" action-for: ").append(edge.getName());
			appendable.newLine().append("}");
			
			appendable.append("Delete ").append(edge.getName().trim()).append("_DT {");
			appendable.newLine();
			appendable.append("\" action-for: ").append(edge.getName());
			appendable.newLine().append("}");
			
			appendable.append("ReconnectEdge ").append(edge.getName().trim()).append("_RET {");
			appendable.newLine();
			appendable.append("\" action-for: ").append(edge.getName());
			appendable.newLine().append("}");
		}
		appendable.newLine();
		appendable.append("}");
	}
	
	private void printNode(ANode node){
		if (! node.isContainer())
		{ 
			// Node generation
			nodeGeneration(node);
		}
		else
		{
			// Container Generation
			beginContainerGeneration(node);
			// Generate Reuse section
			List<ANode> reuse = node.getReuse();
			
			if (! reuse.isEmpty())
			{
				
				for (ANode aNode : reuse) 
				{
					int index = reuse.indexOf(aNode);
					if (index == 0)
						appendable.append(" reuse ").append(aNode.getFQN());
					else
						appendable.append(", ").append(aNode.getFQN());
				}
			}
			
			// Generate children nodes
			List<ANode> children = node.getChildren();
			for (ANode aNode : children) 
			{
				printNode(aNode);
			}
			endContainerGeneration();
		}
	}
	
	private void beginContainerGeneration(ANode node){
		
		String classFQN = qualifiedNameProvider.apply(node.getVPClass()).toString();
		String associationFQN = qualifiedNameProvider.apply(node.getContainingReference()).toString();
		
//		if (firstGeneration_container){
//			appendable.increaseIndentation().newLine();
//			firstGeneration_container = false;
//		} else {
//			appendable.newLine();
//		}
		
		appendable.append("Container ").append(node.getVPClass().getName()).append("{");
		appendable.increaseIndentation().newLine();
		appendable.append("domain-context: ").append(classFQN).append(" provided-by association ")
			.append(associationFQN);
		appendable.newLine();
		
		generateRepresentation(getLabel(node), false);
		appendable.newLine();
		appendable.append("Contains { ");
		appendable.increaseIndentation().newLine();
	}
	
	private void endContainerGeneration(){
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.newLine();
	}

	
	private void nodeGeneration(ANode node){
		String classFQN = qualifiedNameProvider.apply(node.getVPClass()).toString();
		String associationFQN = qualifiedNameProvider.apply(node.getContainingReference()).toString();
		
//		if (firstGeneration_node){
//			appendable.increaseIndentation().newLine();
//			firstGeneration_node = false;
//		} else {
//			appendable.newLine();
//		}
		appendable.append("Node ").append(node.getVPClass().getName()).append("{");
		appendable.increaseIndentation().newLine(); 
		appendable.append("domain-context: ").append(classFQN);
		appendable.newLine();
		appendable.append("provided-by association ")
				  .append(associationFQN);
		appendable.newLine();
		
		generateRepresentation(getLabel(node), true);
		
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Node
	}
	
	
	/**
	 * 
	 * @param label
	 * @param isNode true is not otherwise is container
	 */
	private void generateRepresentation(String label, boolean isNode){
		appendable.append("Representation { ");
		appendable.increaseIndentation().newLine();
		appendable.append("Label {");
		appendable.increaseIndentation().newLine();
		appendable.append("content: ").append(label);
		appendable.newLine();
		appendable.append("police: black");
		appendable.newLine();
		
		if (isNode)
			appendable.append("alignment: left");
		
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.newLine();
		appendable.append("Style {");
		appendable.increaseIndentation().newLine();
		
		if (isNode){
			appendable.append("BasicStyle {");
			appendable.increaseIndentation().newLine();
			appendable.append("border-color: black ");
		} else {
			appendable.append("FlatStyle {");
			appendable.increaseIndentation().newLine();
		}
		
		appendable.append("background: light_green ");
		if (isNode)
			appendable.append("form: Square");
		
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //basic style
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Style
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Reprensentation
	}
	
	private String getLabel(ANode node){
		if (ADataAnalyserHelper.hasNameAttribute(node.getVPClass()))
			return "\"feature:name\"";
		else
			return "\"" + node.getName() + "\"";
	}

}
