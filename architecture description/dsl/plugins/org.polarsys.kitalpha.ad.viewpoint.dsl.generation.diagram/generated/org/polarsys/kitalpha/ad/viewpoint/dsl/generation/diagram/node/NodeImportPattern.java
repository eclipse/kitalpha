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

//Generated on Tue Jul 15 11:15:10 CEST 2014 with EGF 1.2.0.v20140710-0659
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.node;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;

import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;

public class NodeImportPattern
		extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.node.NodePattern {

	public NodeImportPattern() {
		//Here is the constructor
		// add initialisation of the pattern variables (declaration has been already done).
	}

	public void generate(Object argument) throws Exception {
		InternalPatternContext ctx = (InternalPatternContext) argument;
		IQuery.ParameterDescription paramDesc = null;
		Map<String, String> queryCtx = null;
		Node.Container currentNode = ctx.getNode();
		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration((PatternContext) argument);

			}
		}
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		Node.Container currentNode = ictx.getNode();
		super.orchestration(new SuperOrchestrationContext(ictx));
		method_inheritLabelSpecification(new StringBuffer(), ictx);
		method_inheritMappingReuse(new StringBuffer(), ictx);
		method_inheritSemanticData(new StringBuffer(), ictx);
		{
			final Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("original_m", this.mapping);
			parameters.put("imported_m", this.inm);
			ExecutionContext ctx_local = new ExecutionContext(ictx);
			CallHelper
					.executeWithParameterInjection(
							"platform:/plugin/org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram/egf/VpdslSiriusDiagramGenerator.fcore#_MLHN4ISnEeKlgrb0i1zvPQ",
							ctx_local, parameters);
		}
		ictx.setNode(currentNode);
		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	protected void method_createDoremiElement(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		mapping = parameter.getImports();

		genDefaultSemanticCandidatesExpression = false;

		inm = DescriptionFactory.eINSTANCE.createNodeMappingImport();
		inm.setName(parameter.getName() + "_Imported_NM");
		inm.setLabel(parameter.getName());
		inm.setImportedMapping(mapping);

		dNodeMapping = inm;

		//MappingAutoImportManager.INSTANCE.registerUserMappingImport(parameter.getImports(), inm);

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "createDoremiElement",
				out.toString());
	}

	protected void method_inheritLabelSpecification(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		// Inherits label if not defined
		boolean inheritsLabel = true;
		if (parameter.getStyle() != null && parameter.getStyle().size() > 0) {
			for (NodeDescription iNodeDescription : parameter.getStyle()) {
				if (iNodeDescription.getCondition() == null) {
					if (iNodeDescription.getNode_Label() != null) {
						inheritsLabel = false;
						break;
					}
				}
			}
		}

		if (inheritsLabel) {
			NodeStyleDescription style = inm.getStyle();
			if (style != null) {
				style.setLabelAlignment(mapping.getStyle().getLabelAlignment());
				style.setLabelColor(mapping.getStyle().getLabelColor());
				style.setLabelExpression(mapping.getStyle()
						.getLabelExpression());
				style.setLabelFormat(mapping.getStyle().getLabelFormat());
				style.setLabelPosition(mapping.getStyle().getLabelPosition());
				style.setLabelSize(mapping.getStyle().getLabelSize());
			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(),
				"inheritLabelSpecification", out.toString());
	}

	protected void method_inheritMappingReuse(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		// NodeMapping mapping = parameter.getImports();

		// Inherits reused bordered nodes
		if (mapping.getAllBorderedNodeMappings() != null
				&& mapping.getAllBorderedNodeMappings().size() > 0)
			inm.getReusedBorderedNodeMappings().addAll(
					mapping.getAllBorderedNodeMappings());

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "inheritMappingReuse",
				out.toString());
	}

	protected void method_inheritSemanticData(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		//NodeMapping mapping = parameter.getImports();

		boolean inheritSemanticCandidatesExpression = false;

		if (inm.getSemanticCandidatesExpression() == null) {
			inheritSemanticCandidatesExpression = true;
		} else {
			if (inm.getSemanticCandidatesExpression().trim().length() == 0) {
				inheritSemanticCandidatesExpression = true;
			}
		}

		if (inheritSemanticCandidatesExpression) {
			inm.setSemanticCandidatesExpression(mapping
					.getSemanticCandidatesExpression());
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "inheritSemanticData",
				out.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return super.preCondition(ctx) && parameter.getImports() != null;
	}

	protected org.eclipse.sirius.diagram.description.NodeMappingImport inm;

	public void set_inm(
			org.eclipse.sirius.diagram.description.NodeMappingImport inm) {
		this.inm = inm;
	}

	protected org.eclipse.sirius.diagram.description.NodeMapping mapping;

	public void set_mapping(
			org.eclipse.sirius.diagram.description.NodeMapping mapping) {
		this.mapping = mapping;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
