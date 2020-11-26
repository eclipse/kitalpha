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

	private final EObject model;
	private final IQualifiedNameProvider qualifiedNameProvider;


	public ExtendedDiagramGeneration(final EObject model, final IQualifiedNameProvider qualifiedNameProvider){
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.model = model;
	}

	@Override
	public TreeAppendable generateDiagram(final Class vpClass) {
		final TreeAppendable appendable = new TreeAppendable(model, IGenerationStrategy.INDENTATION, IGenerationStrategy.LINE_SEPARATOR);

		final DiagramTextAcceleration diagramTextAcceleration =
				new DiagramTextAcceleration(vpClass, qualifiedNameProvider, appendable, vpClass.getName());

		final long suffix = DiagramTextAcceleration.getAndIncrementDiagram_suffix();

		appendable.append("DiagramExtension \"diagramExtension_" + suffix + "\" {");
		appendable.increaseIndentation().newLine();
		appendable.append("extended-diagram: ").append("${extendedDiagram:CrossReference('DiagramExtension.extented_diagram')}").append(" //extended diagram"); //TODO resolver
		appendable.newLine();
		appendable.append("Mapping {");
		appendable.increaseIndentation().newLine();

		createContainer_import(appendable, vpClass, diagramTextAcceleration);
		if (diagramTextAcceleration.isRootNodesEmpty()){
			//Create node
			createNode(appendable, vpClass, diagramTextAcceleration);
		}
		diagramTextAcceleration.generateNodesText();

		appendable.decreaseIndentation().newLine();
		appendable.append("}");
		appendable.newLine();
		appendable.append("}"); //contains
		diagramTextAcceleration.generateEdgesText();
		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Mapping
		appendable.newLine();
		appendable.append("Actions {");
		generateActionRootExtendDiagramNode(appendable, vpClass);
		appendable.decreaseIndentation().newLine();
		diagramTextAcceleration.generateActionsText(true);
		appendable.decreaseIndentation().newLine();
		appendable.append("}");

		return appendable;
	}

	private void createContainer_import(final TreeAppendable appendable, final Class domainContext, final DiagramTextAcceleration acceleration){
		appendable.append("Container ").append(domainContext.getName().trim().concat("Container")).append(" {"); //FIXME: underscore is not goot practice (cf. appendFirstPrefix() in DiagramTextAccelerator
		appendable.increaseIndentation().newLine();
		appendable.append("import: ").append("${importContainer:CrossReference('Container.imports')}").append(" //import a container");
		appendable.newLine();
		appendable.append("Contains {");
		appendable.increaseIndentation().newLine();
	}

	private void createNode(final TreeAppendable appendable, final Class domainContext, final DiagramTextAcceleration acceleration){
		appendable.append("Node ").append(domainContext.getName()).append("{");
		appendable.increaseIndentation().newLine();
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

	@Deprecated
	private void createContainer(final TreeAppendable appendable, final Class domainContext, final DiagramTextAcceleration acceleration){
		appendable.append("Container ").append(domainContext.getName()).append("{");
		appendable.increaseIndentation().newLine();
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


	private void generateActionRootExtendDiagramNode(final TreeAppendable appendable, final Class domainContext){
		final long suffix = DiagramTextAcceleration.getAndIncrementDiagram_suffix();

		final String concernedNodeFQN = domainContext.getName() + "Container." + domainContext.getName();

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
