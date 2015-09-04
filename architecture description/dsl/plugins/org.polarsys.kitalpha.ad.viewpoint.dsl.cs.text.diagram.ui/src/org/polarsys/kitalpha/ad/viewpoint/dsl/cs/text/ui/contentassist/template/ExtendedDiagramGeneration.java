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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.acceleration.DiagramTextAcceleration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;

/**
 * @author Faycal ABKA
 */
public class ExtendedDiagramGeneration implements IGenerationStrategy {

	private EObject model;
	private IQualifiedNameProvider qualifiedNameProvider;
	
	
	public ExtendedDiagramGeneration(EObject model, IQualifiedNameProvider qualifiedNameProvider){
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.model = model;
	}
	
	@Override
	public TreeAppendable generateDiagram(Class vpClass) {
		TreeAppendable appendable = new TreeAppendable(model, IGenerationStrategy.INDENTATION, IGenerationStrategy.LINE_SEPARATOR);
		
		DiagramTextAcceleration diagramTextAcceleration = 
				new DiagramTextAcceleration(vpClass, qualifiedNameProvider, appendable, vpClass.getName());
		
		long suffix = DiagramTextAcceleration.getAndIncrementDiagram_suffix();
		
		appendable.append("DiagramExtension \"diagramExtension_" + suffix + "\" {");
		appendable.increaseIndentation().newLine();
		appendable.append("extended-diagram: ").append("${extendedDiagram:CrossReference('DiagramExtension.extented_diagram')}").append(" //extended diagram"); //TODO resolver
		appendable.newLine();
		appendable.append("Mapping {");
		appendable.increaseIndentation().newLine();
		
		createContainer_import(appendable, vpClass, diagramTextAcceleration);
		if (diagramTextAcceleration.isRootNodesEmpty()){
			//Create node
			//createNode_import(appendable, vpClass, diagramTextAcceleration);
			createNode(appendable, vpClass, diagramTextAcceleration);
		} else {
			createContainer(appendable, vpClass, diagramTextAcceleration);
		}
		diagramTextAcceleration.generateNodesText();
		
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //contains
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //contains
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //container or node
		diagramTextAcceleration.generateEdgesText();
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Mapping
		appendable.newLine();
		appendable.append("Actions {");
		
		generateActionRootExtendDiagramNode(appendable, vpClass);
		diagramTextAcceleration.generateActionsText(true);
		
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		
		return appendable;
	}
	
	private void createContainer_import(TreeAppendable appendable, Class domainContext, DiagramTextAcceleration acceleration){
		appendable.append("Container ").append(domainContext.getName().trim().concat("Container")).append(" {"); //FIXME: underscore is not goot practice (cf. appendFirstPrefix() in DiagramTextAccelerator
		appendable.increaseIndentation().newLine();
		appendable.append("import: ").append("${importContainer:CrossReference('Container.imports')}").append(" //import a container");
		appendable.newLine();
		appendable.append("Contains {");
		appendable.increaseIndentation().newLine();
	}
	
	private void createNode(TreeAppendable appendable, Class domainContext, DiagramTextAcceleration acceleration){
		appendable.append("Node ").append(domainContext.getName()).append("{");
		appendable.increaseIndentation().newLine();
//		appendable.append("import: ").append("${importNode:CrossReference('Node.imports')}").append(" //import a node");
		appendable.newLine();
		appendable.append("domain-context: ").append(qualifiedNameProvider.apply(domainContext).toString());
		appendable.newLine();
		//TODO provided by association with variable resolver?
		appendable.append("provided-by association external emde.ExtensibleElement.ownedExtensions");
		appendable.newLine();
		acceleration.generateRepresentation(acceleration.getLabel(domainContext), true);
		appendable.newLine();
		appendable.append("Contains {");
		appendable.increaseIndentation().newLine();
		
		
	}
	
	private void createContainer(TreeAppendable appendable, Class domainContext, DiagramTextAcceleration acceleration){
		appendable.append("Container ").append(domainContext.getName()).append("{");
		appendable.increaseIndentation().newLine();
//		appendable.append("import: ").append("${importContainer:CrossReference('Container.imports')}").append(" //import a container");
		appendable.newLine();
		appendable.append("domain-context: ").append(qualifiedNameProvider.apply(domainContext).toString());
		appendable.newLine();
		//TODO provided by association with variable resolver?
		appendable.append("provided-by association external ").append("emde.ExtensibleElement.ownedExtensions");
		appendable.newLine();
		acceleration.generateRepresentation(acceleration.getLabel(domainContext), false);
		appendable.newLine();
		appendable.append("Contains {");
		appendable.increaseIndentation().newLine();
	}
	
	 
	private void generateActionRootExtendDiagramNode(TreeAppendable appendable, Class domainContext){
		long suffix = DiagramTextAcceleration.getAndIncrementDiagram_suffix();
		
		String concernedNodeFQN = domainContext.getName() + "Container." + domainContext.getName();
		
		appendable.increaseIndentation().newLine();
		appendable.append("/* ").append(domainContext.getName().trim().concat("Container")).append(" Actions*/").newLine();
		appendable.append("Create ").append(domainContext.getName().trim()).append("_CT_" + suffix).append("{");
		appendable.increaseIndentation().newLine();
		appendable.append("label: \"").append(domainContext.getName()).append("\" ");
		appendable.append("action-for: ").append(concernedNodeFQN);
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.newLine();
		
		appendable.append("Drop ").append(domainContext.getName().trim()).append("_DR_" + suffix).append("{");
		appendable.increaseIndentation().newLine();
		appendable.append("action-for: ").append(concernedNodeFQN);
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.newLine();
		
		appendable.append("Delete ").append(domainContext.getName().trim()).append("_DL_" + suffix).append("{");
		appendable.increaseIndentation().newLine();
		appendable.append("action-for: ").append(domainContext.getName()).append("Container.".trim()).append(domainContext.getName().trim());
		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.decreaseIndentation();
	}
}
