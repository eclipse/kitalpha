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
//Generated on Tue Aug 12 15:01:19 CEST 2014 with EGF 1.2.0.v20140721-0706
package org.polarsys.kitalpha.doc.gen.business.ecore.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;

public class EEnumElementContent
		extends
		org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized EEnumElementContent create(String lineSeparator) {
		nl = lineSeparator;
		EEnumElementContent result = new EEnumElementContent();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<p><strong>Package :</strong> ";
	protected final String TEXT_2 = "</p>" + NL + "<h1>";
	protected final String TEXT_3 = "</h1>" + NL + "" + NL
			+ "<p><strong>Default value :</strong> ";
	protected final String TEXT_4 = "</p>";
	protected final String TEXT_5 = NL + "<h2>Literals</h2>";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;

	public EEnumElementContent() {
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

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.eclipse.emf.ecore.EEnum) parameterParameter;

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

		stringBuffer.append(TEXT_7);
		stringBuffer.append(TEXT_8);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

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

	protected org.eclipse.emf.ecore.EObject element = null;

	public void set_element(org.eclipse.emf.ecore.EObject object) {
		this.element = object;
	}

	protected org.eclipse.emf.ecore.EEnum parameter = null;

	public void set_parameter(org.eclipse.emf.ecore.EEnum object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		String outputFolder = ctx.getValue("outputFolder").toString();
		String projectName = ctx.getValue("projectName").toString();
		String text = ((EEnum) element).getName();
		text = EscapeChars.forHTML(text);

		stringBuffer.append(TEXT_1);
		stringBuffer
				.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper
						.getTypeHyperLink(((EEnum) element).getEPackage()));
		stringBuffer.append(TEXT_2);
		stringBuffer.append(text);
		stringBuffer.append(TEXT_3);
		stringBuffer.append(((EEnum) element).getDefaultValue());
		stringBuffer.append(TEXT_4);

		String literalList = org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EEnumContentHelper
				.getLiteralsList((EEnum) element, projectName, outputFolder);
		if (literalList != "") {

			stringBuffer.append(TEXT_5);
			stringBuffer.append(TEXT_6);
			stringBuffer.append(literalList);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content",
				stringBuffer.toString());
	}

	protected void method_setContext(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		element = parameter;
		fileName = fileNameService.getFileName(element);
		title = title = ((EEnum) element).getName();

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext",
				stringBuffer.toString());
	}

	protected void method_setFileNameService(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		fileNameService = org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreFileNameService.INSTANCE;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileNameService",
				stringBuffer.toString());
	}
}
