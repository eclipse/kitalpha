package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.acceleration.DiagramTextAcceleration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpdiagramActivator;

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
