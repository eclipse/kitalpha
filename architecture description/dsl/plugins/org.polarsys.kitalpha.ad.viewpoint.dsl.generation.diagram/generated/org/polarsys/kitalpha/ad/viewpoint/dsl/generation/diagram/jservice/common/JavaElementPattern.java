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

//Generated on Tue Jul 15 11:05:01 CEST 2014 with EGF 1.2.0.v20140710-0659
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.jservice.common;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.egf.common.helper.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaMethodData.JavaMethodReturnType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice.JavaServiceData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.GenerationUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util.JavaElementHelper;

public class JavaElementPattern
		extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.common.AbstractDiagramPattern {

	public JavaElementPattern() {
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

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement) parameterParameter;

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
		method_RegisterJavaMethod(new StringBuffer(), ictx);
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

	protected void method_RegisterJavaMethod(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		String package_name = (String) ctx.getValue("design.project.name")
				+ ".service";

		String class_kind = JavaElementHelper
				.getJavaElementContainerKind(parameter);
		if (class_kind != null && class_kind.trim().length() > 0) {
			package_name = package_name + "." + class_kind;
		}

		//String package_name = (String) ctx.getValue("design.project.name")+".service.nodes";
		String class_name = JavaElementHelper
				.getJavaElementContainerName(parameter);
		String service_name = package_name + "." + class_name + "_Service";

		JavaServiceData javaServiceData = GenerationUtil
				.getJavaServiceData(service_name);

		if (javaServiceData != null) {

			javaServiceData.setContext(JavaElementHelper
					.getJavaElementContainer(parameter));

			String method_name = parameter.getMethod();
			String twoLastChars = method_name.substring(
					method_name.length() - 2, method_name.length());
			if (twoLastChars.equals("()")) {
				method_name = method_name
						.substring(0, method_name.length() - 2);
			}

			/*** Compute the JavaMethod return type
			 * JavaMethod return type depends on the context wherein the JavaElement is created
			 * If in a condition      --> return type = JavaMethodReturnType.Boolean
			 * if in Label Expression --> return type = JavaMethodReturnType.String
			 * if in an Histogram     --> return type = JavaMethodReturnType.Integer
			 */
			JavaMethodReturnType returnType = JavaMethodReturnType.Unknown;
			EObject eObject = parameter.eContainer();

			switch (eObject.eClass().getClassifierID()) {
			case VpdiagramPackage.HISTOGRAM_SECTION:
				returnType = JavaMethodReturnType.Integer;
				break;

			case VpdiagramPackage.CONDITION:
				returnType = JavaMethodReturnType.Boolean;
				break;

			case ExpressionPackage.EXPRESSION:
				if (eObject.eContainer().eClass().getClassifierID() == VpdiagramPackage.LABEL)
					returnType = JavaMethodReturnType.String;
				break;
			}

			if (returnType != JavaMethodReturnType.Unknown) {

				/*** Creation of the JavaMethod **/
				JavaMethodData javaMethodData = new JavaMethodData(method_name,
						returnType);

				/*** Adding Parameters to the JavaMethod
				 * JavaMethod parameters depend on the context wherein the JavaElement is created
				 * If in a condition      --> - eObject   : EObject 				  (the current semantic object)
				 * 							  - view      : EObject 				  (the current view)
				 * 							  - container : EObject 				  (the semantic container of the current object)
				 * if in Label Expression --> - eObject   : EObject 				  (the current semantic object)
				 * 							  - diagram   : Viewpoint.DDiagram 		  (the current DSemanticdiagram)
				 * 							  - view      : Viewpoint.DDiagramElement (the current View for witch the label is calculated)
				 * if in an Histogram     --> - eObject   : EObject 				  (the current semantic object)
				 */

				javaMethodData.addMethodParameter("eObject", "EObject",
						"the current semantic object");

				switch (eObject.eClass().getClassifierID()) {
				case VpdiagramPackage.CONDITION:
					javaMethodData.addMethodParameter("view", "EObject",
							"the current view");
					javaMethodData.addMethodParameter("container", "EObject",
							"the semantic container of the current object");
					break;

				case ExpressionPackage.EXPRESSION:
					if (eObject.eContainer().eClass().getClassifierID() == VpdiagramPackage.LABEL) {
						javaMethodData.addMethodParameter("diagram",
								"DDiagram", "the current DSemanticdiagram");
						javaMethodData
								.addMethodParameter("view", "DDiagramElement",
										"the current View for witch the label is calculated");
					}
					break;
				}
				javaServiceData.addMethod(javaMethodData);
			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "RegisterJavaMethod",
				out.toString());
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement parameter;

	public void set_parameter(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement parameter) {
		this.parameter = parameter;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
