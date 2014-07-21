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

//Generated on Tue Jul 15 11:21:52 CEST 2014 with EGF 1.2.0.v20140710-0659
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.jservice.diagrams;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.GenerationUtil;

public class GenJavaServiceForEdgeImportPattern
		extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.jservice.common.GenJavaServiceCommonPattern {
	protected static String nl;

	public static synchronized GenJavaServiceForEdgeImportPattern create(
			String lineSeparator) {
		nl = lineSeparator;
		GenJavaServiceForEdgeImportPattern result = new GenJavaServiceForEdgeImportPattern();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;

	public GenJavaServiceForEdgeImportPattern() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> edge_importList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object edge_importParameter : edge_importList) {

			this.edge_import = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport) edge_importParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_1);
		stringBuffer.append(TEXT_2);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("edge_import", this.edge_import);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport edge_import = null;

	public void set_edge_import(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport object) {
		this.edge_import = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("edge_import", this.edge_import);
		return parameters;
	}

	protected void method_setParameters(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		super.parameter = edge_import;
		super.method_setParameters(stringBuffer, ctx);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setParameters",
				stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return super.preCondition(ctx)
				&& GenerationUtil.getJavaServiceDataFor(edge_import) != null;
	}
}
