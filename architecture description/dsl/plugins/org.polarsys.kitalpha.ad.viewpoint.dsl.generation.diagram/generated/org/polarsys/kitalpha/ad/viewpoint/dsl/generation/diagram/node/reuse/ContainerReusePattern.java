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

//Generated on Tue Jul 15 11:15:19 CEST 2014 with EGF 1.2.0.v20140710-0659
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.node.reuse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.egf.model.pattern.Node;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.execution.InternalPatternContext;
import org.eclipse.egf.pattern.execution.OutputManager;
import org.eclipse.egf.pattern.execution.SuperOrchestrationContext;
import org.eclipse.egf.pattern.query.IQuery;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.conf.DiagramGenerationConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.GenerationUtil;

public class ContainerReusePattern
		extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.common.AbstractDiagramPattern {

	public ContainerReusePattern() {
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

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container) parameterParameter;

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
		method_doReuse(new StringBuffer(), ictx);
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

	protected void method_doReuse(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		ContainerMapping currentContainerNode = (ContainerMapping) GenerationUtil
				.getDoremiElement(parameter);
		final EList<AbstractNode> reused_nodes = parameter.getChildren()
				.getReused_nodes();
		for (AbstractNode abstractNode : reused_nodes) {
			if (abstractNode instanceof Container) {
				ContainerMapping currentContainer = (ContainerMapping) GenerationUtil
						.getDoremiElement(abstractNode);
				currentContainerNode.getReusedContainerMappings().add(
						currentContainer);
				continue;
			}

			if (abstractNode instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node) {
				NodeMapping currentNode = (NodeMapping) GenerationUtil
						.getDoremiElement(abstractNode);
				currentContainerNode.getReusedNodeMappings().add(currentNode);
				continue;
			}

			if (abstractNode instanceof BorderedNode) {
				NodeMapping currentBNode = (NodeMapping) GenerationUtil
						.getDoremiElement(abstractNode);
				currentContainerNode.getReusedBorderedNodeMappings().add(
						currentBNode);
				continue;
			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doReuse", out.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return DiagramGenerationConfigurationHelper.generateVSM(parameter)
				&& parameter.getChildren() != null
				&& parameter.getChildren().getReused_nodes() != null
				&& !parameter.getChildren().getReused_nodes().isEmpty();
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container parameter;

	public void set_parameter(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container parameter) {
		this.parameter = parameter;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
