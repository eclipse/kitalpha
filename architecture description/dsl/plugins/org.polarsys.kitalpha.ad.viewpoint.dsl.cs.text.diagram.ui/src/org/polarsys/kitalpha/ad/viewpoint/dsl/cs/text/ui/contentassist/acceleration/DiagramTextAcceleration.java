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
	
	public final ADataAnalyser getDataAnalyser(){
		return dataAnalyser;
	}
	
	private IQualifiedNameProvider qualifiedNameProvider;
	
	private TreeAppendable appendable;
	
	private final String prefix;
	
	
	public DiagramTextAcceleration(Class rootClass, IQualifiedNameProvider qualifiedNameProvider, TreeAppendable appendable) {
		
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.appendable = appendable;
		this.prefix = null;
		
		dataAnalyser = new ADataAnalyser(rootClass);
		dataAnalyser.Analyse();
	}
	
	public DiagramTextAcceleration(Class rootClass, 
			IQualifiedNameProvider qualifiedNameProvider, 
			TreeAppendable appendable,
			String prefix) {
		
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.appendable = appendable;
		this.prefix = prefix;
		
		dataAnalyser = new ADataAnalyser(rootClass);
		dataAnalyser.Analyse();
	}
	
	public boolean isRootNodesEmpty(){
		return dataAnalyser.getRootNodes().isEmpty();
	}
	
	public void generateNodesText() {
		for (ANode node : dataAnalyser.getRootNodes()) 
		{
			printNode(node);
		}
	}
	
	
	public void generateEdgesText() {
		for (AEdge aEdge : dataAnalyser.getAllEdges()) 
		{
			
			appendable.newLine();
			appendable.append("Edge ").append(aEdge.getName()).append(" {");
			appendable.increaseIndentation().newLine();
			appendable.append("association-context: ").append(qualifiedNameProvider.apply(aEdge.getTargetReference()).toString());
			appendable.newLine();
			appendable.append("source: ").append(getSourceNodesFQN(aEdge));
			appendable.newLine();
			appendable.append("target: ").append(getTargetNodesFQN(aEdge));
			appendable.newLine();
			appendable.append("Representation {");
			appendable.increaseIndentation().newLine();
			appendable.append("Style {");
			appendable.increaseIndentation().newLine();
			appendable.append("end-decorator: InputArrow").newLine();
			appendable.append("color: black");
			appendable.decreaseIndentation().newLine().append("}"); //Style
			appendable.decreaseIndentation().newLine().append("}"); //Repesentation
			appendable.decreaseIndentation().newLine().append("}"); //Edge
		}
	}
	
	public void generateActionsText() {
		generateActionsText(false);
	}
	
	public void generateActionsText(boolean considerRootAsChild) {
		
		for (ANode node : dataAnalyser.getAllNodes()) 
		{
			appendable.increaseIndentation().newLine();
			appendable.append("/*").append(node.getName()).append(" Actions */");
			appendable.newLine();
			
			/*
			 * NB: getAndIncrementDiagram_suffix() is defined in the activator
			 * if regeneration, reimplement it or subclass the activator
			 */
			long suffix = VpdiagramActivator.getAndIncrementDiagram_suffix();
			appendable.append("Create ").append(node.getName().trim()).append("_CT_" + suffix).append("{");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(node.getName()).append(getFQN(node)).append("\" ");
			appendable.append("action-for: ");
			appendFirstPrefix(appendable).append(getFQN(node));
			appendable.decreaseIndentation().newLine();
			appendable.append("}");
			
			
			if (node.getParent() != null || 
					(considerRootAsChild && dataAnalyser.getRootNodes().contains(node))){
				appendable.newLine();
				appendable.append("Drop ").append(node.getName().trim()).append("_DT_" + suffix).append("{");
				appendable.increaseIndentation().newLine();
				appendable.append("action-for: ");
				appendFirstPrefix(appendable).append(getFQN(node));
				appendable.decreaseIndentation().newLine();
				appendable.append("}");
			}
			appendable.decreaseIndentation();
		}
		
		for (AEdge edge : dataAnalyser.getAllEdges()) 
		{
			appendable.increaseIndentation().newLine();
			appendable.append("/*").append(edge.getName()).append(" Actions */ ");
			appendable.newLine();
			appendable.append("Create ").append(edge.getName().trim()).append("_CT {");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(edge.getName()).append("\" action-for: ").append(edge.getName());
			appendable.decreaseIndentation().newLine().append("}");
			appendable.newLine();
			
			appendable.append("Delete ").append(edge.getName().trim()).append("_DT {");
			appendable.increaseIndentation().newLine();
			appendable.append("action-for: ").append(edge.getName());
			appendable.decreaseIndentation().newLine().append("}");
			appendable.newLine();
			
			appendable.append("ReconnectEdge ").append(edge.getName().trim()).append("_RET {");
			appendable.increaseIndentation().newLine();
			appendable.append("action-for: ").append(edge.getName());
			appendable.decreaseIndentation().newLine().append("}");
			appendable.decreaseIndentation();
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
						appendable.append("reuse ").append(getFQN(aNode)).newLine();
					else
						appendable.append(", ").append(getFQN(aNode)).append(" ");
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
		
		appendable.newLine();
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
	}

	
	private void nodeGeneration(ANode node){
		String classFQN = qualifiedNameProvider.apply(node.getVPClass()).toString();
		String associationFQN = qualifiedNameProvider.apply(node.getContainingReference()).toString();
		
		appendable.newLine();
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
	public void generateRepresentation(String label, boolean isNode){
		appendable.append("Representation { ");
		appendable.increaseIndentation().newLine();
		appendable.append("Label {");
		appendable.increaseIndentation().newLine();
		appendable.append("content: ").append(label);
		appendable.newLine();
		appendable.append("police: black");
		
		if (isNode){
			appendable.newLine();
			appendable.append(" alignment: left");
		}
		
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
		
		appendable.append("background: light_blue ");
		if (isNode)
			appendable.append("form: Square");
		else 
			appendable.append("foreground: white"); 
		
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
	
	public final String getFQN(ANode node){
		if (prefix != null)
			return prefix + "." + node.getFQN();
		return node.getFQN();
	}

	
	private String getSourceNodesFQN(AEdge edge){
		if (prefix != null){
			String sources[] = edge.getSourceNodesFQN().split(",");
			return computeFQN(sources);
			
		}
		return edge.getSourceNodesFQN();
	}
	
	private String computeFQN(String refrences[]){
		StringBuilder result = new StringBuilder();

		int size = refrences.length;
		for (String ref : refrences) {
			String tmp = prefix + "Container." + prefix + "." + ref.trim(); //FIXME: underscores are not good practice
			
			result.append(tmp);
			if (ref != refrences[size - 1])
				result.append(", ");
		}
		
		return result.toString();
	}
	
	private String getTargetNodesFQN(AEdge edge){
		if (prefix != null){
			String targets[] = edge.getTargetNodesFQN().split(",");
			return computeFQN(targets);
		}
		return edge.getTargetNodesFQN();
	}
	
	private TreeAppendable appendFirstPrefix(TreeAppendable appendable){
		if (prefix != null && !prefix.isEmpty()){
			appendable.append(prefix).append("Container."); //FIXME: underscores are not good practice
		}
		return appendable;
	}
}
