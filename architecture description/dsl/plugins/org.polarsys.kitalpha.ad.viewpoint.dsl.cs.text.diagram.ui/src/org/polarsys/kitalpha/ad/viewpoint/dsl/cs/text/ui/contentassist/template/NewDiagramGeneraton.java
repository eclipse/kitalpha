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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.acceleration.DiagramTextAcceleration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;


/**
 * @author Faycal ABKA
 */

public class NewDiagramGeneraton implements IGenerationStrategy {


	private final EObject model;
	private final IQualifiedNameProvider qualifiedNameProvider;



	public NewDiagramGeneraton(final EObject model, final IQualifiedNameProvider qualifiedNameProvider) {
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.model = model;
	}

	@Override
	public TreeAppendable generateDiagram(final Class vpClass) {

		final TreeAppendable appendable = new TreeAppendable(model, IGenerationStrategy.INDENTATION, IGenerationStrategy.LINE_SEPARATOR);
		final DiagramTextAcceleration diagramTextAcceleration = new DiagramTextAcceleration(vpClass, qualifiedNameProvider, appendable);

		final long suffix = DiagramTextAcceleration.getAndIncrementDiagram_suffix();

		appendable.append("Diagram \"diagram_" + suffix + "\" {");
		appendable.increaseIndentation().newLine();
		appendable.append("domain-context: ").append(qualifiedNameProvider.apply(vpClass).toString());
		appendable.newLine();
		appendable.append("Mapping {");
		appendable.increaseIndentation();
		diagramTextAcceleration.generateNodesText();
		diagramTextAcceleration.generateEdgesText();

		appendable.decreaseIndentation().newLine();
		appendable.append("}"); //Mapping
		appendable.newLine();
		appendable.append("Actions {");

		diagramTextAcceleration.generateActionsText();

		appendable.decreaseIndentation().newLine();
		appendable.append("}");

		return appendable;
	}

}
