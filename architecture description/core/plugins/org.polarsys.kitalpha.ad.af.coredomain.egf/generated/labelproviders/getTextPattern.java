/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
//Generated on Mon Dec 09 14:14:40 CET 2013 with EGF 1.1.0.v20131204-1629
package labelproviders;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class getTextPattern extends org.eclipse.egf.emf.pattern.edit.call.ItemProvider.ItemProvidergetTextoverride {
	protected static String nl;

	public static synchronized getTextPattern create(String lineSeparator) {
		nl = lineSeparator;
		getTextPattern result = new getTextPattern();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL + "\t\tif (object instanceof NameElement) {" + NL + "\t\t\tNameElement elt = (NameElement) object;" + NL + "\t\t\tString label = elt.getName();" + NL + "\t\t\tif (label == null)" + NL + "\t\t\t\tlabel = \"\";" + NL + "\t\t\tString id = elt.getId();" + NL + "\t\t\tif (id == null)" + NL + "\t\t\t\tid = \"no ID\";" + NL + "\t\t\tlabel = elt.eClass().getName() + \" [\" + id + \"] \" + label;" + NL + "\t\t\treturn label;" + NL + "\t\t}" + NL + "\t\treturn ((EObject) object).eClass().getName();" + NL;
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public getTextPattern() {
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

		List<Object> genClassList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genPackageList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genModelList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> _ListList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object genClassParameter : genClassList) {
			for (Object genPackageParameter : genPackageList) {
				for (Object genModelParameter : genModelList) {
					for (Object _ListParameter : _ListList) {

						this.genClass = (org.eclipse.emf.codegen.ecore.genmodel.GenClass) genClassParameter;
						this.genPackage = (org.eclipse.emf.codegen.ecore.genmodel.GenPackage) genPackageParameter;
						this.genModel = (org.eclipse.emf.codegen.ecore.genmodel.GenModel) genModelParameter;
						this._List = (java.lang.String) _ListParameter;

						if (preCondition(ctx)) {
							ctx.setNode(new Node.Container(currentNode, getClass()));
							orchestration(ctx);
						}

					}
				}
			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_3);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("genClass", this.genClass);
			parameterValues.put("genPackage", this.genPackage);
			parameterValues.put("genModel", this.genModel);
			parameterValues.put("_List", this._List);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("genClass", this.genClass);
		parameters.put("genPackage", this.genPackage);
		parameters.put("genModel", this.genModel);
		parameters.put("_List", this._List);
		return parameters;
	}

	protected void method_doGenerate(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		genModel.getImportedName("org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement");
		genModel.getImportedName("org.eclipse.emf.ecore.EObject");

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doGenerate", stringBuffer.toString());
	}
}