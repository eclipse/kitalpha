/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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


/**
 * @author Boubekeur Zendagui
 *         Faycal Abka
 */

public class DiagramTextAcceleration {

	private final ADataAnalyser dataAnalyser;

	public final ADataAnalyser getDataAnalyser(){
		return dataAnalyser;
	}

	private final IQualifiedNameProvider qualifiedNameProvider;

	private final TreeAppendable appendable;

	private final String prefix;

	private static long diagram_suffix = 0;


	public DiagramTextAcceleration(final Class rootClass, final IQualifiedNameProvider qualifiedNameProvider, final TreeAppendable appendable) {

		this.qualifiedNameProvider = qualifiedNameProvider;
		this.appendable = appendable;
		this.prefix = null;

		dataAnalyser = new ADataAnalyser(rootClass, false);
		dataAnalyser.Analyse();

		//Reset diagram suffix at each instantiation
		DiagramTextAcceleration.diagram_suffix = 0;
	}

	public DiagramTextAcceleration(final Class rootClass,
			final IQualifiedNameProvider qualifiedNameProvider,
			final TreeAppendable appendable,
			final String prefix) {

		this.qualifiedNameProvider = qualifiedNameProvider;
		this.appendable = appendable;
		this.prefix = prefix;

		dataAnalyser = new ADataAnalyser(rootClass, true);
		dataAnalyser.Analyse();
	}

	public boolean isRootNodesEmpty(){
		return dataAnalyser.getRootNodes().isEmpty();
	}

	public void generateNodesText() {
		for (final ANode node : dataAnalyser.getRootNodes())
		{
			printNode(node);
		}
	}


	public void generateEdgesText() {
		for (final AEdge aEdge : dataAnalyser.getAllEdges())
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

	public void generateActionsText(final boolean considerRootAsChild) {

		for (final ANode node : dataAnalyser.getAllNodes())
		{
			appendable.increaseIndentation().newLine().newLine();
			appendable.append("/*").append(node.getVPClass().getName()).append(" Actions */");
			appendable.newLine();

			/*
			 * NB: getAndIncrementDiagram_suffix() is defined in the activator
			 * if regeneration, reimplement it or subclass the activator
			 */
			final long suffix = getAndIncrementDiagram_suffix();
			appendable.append("Create ").append(node.getName().trim()).append("_CT_" + suffix).append("{");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(node.getVPClass().getName()).append("\" ");
			appendable.append("action-for: ");
			appendFirstPrefix(appendable).append(getFQN(node));
			appendable.decreaseIndentation().newLine();
			appendable.append("}");


			if ((node.getParent() != null) || (considerRootAsChild && dataAnalyser.getRootNodes().contains(node)))
			{
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

		for (final AEdge edge : dataAnalyser.getAllEdges())
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

	private void printNode(final ANode node){
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
			final List<ANode> reuse = node.getReuse();

			if (! reuse.isEmpty())
			{

				for (final ANode aNode : reuse)
				{
					final int index = reuse.indexOf(aNode);
					if (index == 0) {
						appendable.append("reuse ").append(getFQN(aNode)).newLine();
					} else {
						appendable.append(", ").append(getFQN(aNode)).append(" ");
					}
				}
			}

			// Generate children nodes
			final List<ANode> children = node.getChildren();
			for (final ANode aNode : children)
			{
				printNode(aNode);
			}
			endContainerGeneration();
		}
	}

	private void beginContainerGeneration(final ANode node){

		final String classFQN = qualifiedNameProvider.apply(node.getVPClass()).toString();
		final String associationFQN = qualifiedNameProvider.apply(node.getContainingReference()).toString();

		appendable.newLine();
		appendable.append("Container ").append(node.getVPClass().getName()).append("{");
		appendable.increaseIndentation().newLine();
		appendable.append("domain-context: ").append(classFQN).append(" provided-by association ").append(associationFQN);
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


	private void nodeGeneration(final ANode node){
		final String classFQN = qualifiedNameProvider.apply(node.getVPClass()).toString();
		final String associationFQN = qualifiedNameProvider.apply(node.getContainingReference()).toString();

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
	public void generateRepresentation(final String label, final boolean isNode){
		appendable.append("Representation { ");
		appendable.increaseIndentation().newLine();
		appendable.append("Label {");
		appendable.increaseIndentation().newLine();
		appendable.append("content: ").append(label);
		appendable.append(" police: black");

		if (isNode)
		{
			appendable.append(" position: node");
			appendable.append(" alignment: left");
		}

		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.newLine();
		appendable.append("Style {");
		appendable.increaseIndentation().newLine();

		if (isNode){
			appendable.append("BasicStyle {");
			appendable.increaseIndentation()/*.newLine()*/;
			appendable.append("border-color: black ");
		} else {
			appendable.append("FlatStyle {");
			appendable.increaseIndentation()/*.newLine()*/;
		}

		appendable.append("background: light_blue ");
		if (isNode) {
			appendable.append("form: Square");
		} else {
			appendable.append("foreground: white");
		}

		appendable.decreaseIndentation()/*.newLine()*/;
		appendable.append("}"); //basic style
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Style
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Reprensentation
	}

	public String getLabel(final ANode node){
		if (ADataAnalyserHelper.hasNameAttribute(node.getVPClass())) {
			return "\"feature:name\"";
		} else {
			return "\"" + node.getVPClass().getName() + "\"";
		}
	}

	public String getLabel(final Class clazz){
		if (ADataAnalyserHelper.hasNameAttribute(clazz)) {
			return "\"feature:name\"";
		} else {
			return "\"" + clazz.getName() + "\"";
		}
	}

	public final String getFQN(final ANode node){
		return node.getFQN();
	}


	private String getSourceNodesFQN(final AEdge edge){
		if (prefix != null){
			final String sources[] = edge.getSourceNodesFQN().split(",");
			return computeFQN(sources);

		}
		return edge.getSourceNodesFQN();
	}

	private String computeFQN(final String refrences[]){
		final StringBuilder result = new StringBuilder();

		final int size = refrences.length;
		for (final String ref : refrences) {
			final String tmp = prefix + "Container." + ref.trim(); //FIXME: underscores are not good practice

			result.append(tmp);
			if (!ref.equals(refrences[size - 1])) {
				result.append(", ");
			}
		}

		return result.toString();
	}

	private String getTargetNodesFQN(final AEdge edge){
		if (prefix != null){
			final String targets[] = edge.getTargetNodesFQN().split(",");
			return computeFQN(targets);
		}
		return edge.getTargetNodesFQN();
	}

	private TreeAppendable appendFirstPrefix(final TreeAppendable appendable){
		if ((prefix != null) && !prefix.isEmpty()){
			appendable.append(prefix).append("Container."); //FIXME: underscores are not good practice
		}
		return appendable;
	}


	public static long getAndIncrementDiagram_suffix()
	{
		return ++diagram_suffix;
	}
}
