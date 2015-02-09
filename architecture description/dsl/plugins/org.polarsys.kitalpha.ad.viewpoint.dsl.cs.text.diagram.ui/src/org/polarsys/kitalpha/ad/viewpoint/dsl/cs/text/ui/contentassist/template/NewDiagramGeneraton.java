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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpdiagramActivator;


/**
 * @author Faycal ABKA
 */

public class NewDiagramGeneraton implements IGenerationStrategy {
	
	
	private EObject model;
	private IQualifiedNameProvider qualifiedNameProvider;
	
	
	
	public NewDiagramGeneraton(EObject model, IQualifiedNameProvider qualifiedNameProvider) {
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.model = model;
	}

	@Override
	public TreeAppendable generateDiagram(Class vpClass) {
		
		TreeAppendable appendable = new TreeAppendable(model, IGenerationStrategy.INDENTATION, IGenerationStrategy.LINE_SEPARATOR);
		DiagramTextAcceleration diagramTextAcceleration = new DiagramTextAcceleration(vpClass, qualifiedNameProvider, appendable);
		
		long suffix = VpdiagramActivator.getAndIncrementDiagram_suffix();
		
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
