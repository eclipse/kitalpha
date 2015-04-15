//Generated with EGF 1.2.0.v20140805-0858
package org.polarsys.kitalpha.emde.egf.model;

import org.polarsys.kitalpha.emde.egf.utils.EmdePreconditionHelper;
import org.eclipse.egf.emf.pattern.base.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.*;
import org.eclipse.emf.codegen.ecore.genmodel.generator.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class PluginXML extends org.eclipse.egf.emf.pattern.model.PluginXML {
	protected static String nl;

	public static synchronized PluginXML create(String lineSeparator) {
		nl = lineSeparator;
		PluginXML result = new PluginXML();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<?eclipse version=\"3.0\"?>" + NL;
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL + "<plugin>";
	protected final String TEXT_5 = NL + "<plugin" + NL + "      name=\"%pluginName\"" + NL + "      id=\"";
	protected final String TEXT_6 = "\"" + NL + "      version=\"1.0.0.qualifier\"";
	protected final String TEXT_7 = NL + "      provider-name=\"%providerName\"" + NL + "      class=\"";
	protected final String TEXT_8 = "$Implementation\">";
	protected final String TEXT_9 = NL + "      provider-name=\"%providerName\">";
	protected final String TEXT_10 = NL + NL + "   <requires>";
	protected final String TEXT_11 = NL + "      <import plugin=\"";
	protected final String TEXT_12 = "\"";
	protected final String TEXT_13 = " export=\"true\"";
	protected final String TEXT_14 = "/>";
	protected final String TEXT_15 = NL + "   </requires>" + NL + "" + NL + "   <runtime>";
	protected final String TEXT_16 = NL + "      <library name=\"";
	protected final String TEXT_17 = ".jar\">";
	protected final String TEXT_18 = NL + "      <library name=\".\">";
	protected final String TEXT_19 = NL + "         <export name=\"*\"/>" + NL + "      </library>" + NL + "   </runtime>";
	protected final String TEXT_20 = NL + NL + "   <extension point=\"org.eclipse.emf.ecore.generated_package\">" + NL + "      <package" + NL + "            uri=\"";
	protected final String TEXT_21 = "\"";
	protected final String TEXT_22 = NL + "            class=\"";
	protected final String TEXT_23 = "\"" + NL + "            genModel=\"";
	protected final String TEXT_24 = "\"/>";
	protected final String TEXT_25 = NL + "            class=\"";
	protected final String TEXT_26 = "\"/>";
	protected final String TEXT_27 = NL + "   </extension>";
	protected final String TEXT_28 = NL + NL + "   <extension point=\"org.eclipse.emf.ecore.content_parser\">" + NL + "      <parser" + NL + "            contentTypeIdentifier=\"";
	protected final String TEXT_29 = "\"" + NL + "            class=\"";
	protected final String TEXT_30 = "\"/>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.core.contenttype.contentTypes\">" + NL + "      <content-type" + NL + "            base-type=\"";
	protected final String TEXT_31 = "\"" + NL + "            file-extensions=\"";
	protected final String TEXT_32 = "\"" + NL + "            id=\"";
	protected final String TEXT_33 = "\"" + NL + "            name=\"%_UI_";
	protected final String TEXT_34 = "_content_type\"" + NL + "            priority=\"normal\">" + NL + "         <describer class=\"org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl$Describer\">";
	protected final String TEXT_35 = NL + "            <parameter name=\"namespace\" value=\"";
	protected final String TEXT_36 = "\"/>";
	protected final String TEXT_37 = NL + "            <parameter name=\"kind\" value=\"xmi\"/>";
	protected final String TEXT_38 = NL + "         </describer>" + NL + "      </content-type>" + NL + "   </extension>";
	protected final String TEXT_39 = NL + NL + "   <extension point=\"org.eclipse.emf.ecore.extension_parser\">" + NL + "      <parser" + NL + "            type=\"";
	protected final String TEXT_40 = "\"" + NL + "            class=\"";
	protected final String TEXT_41 = "\"/>" + NL + "   </extension>";
	protected final String TEXT_42 = NL + NL + "</plugin>";
	protected final String TEXT_43 = NL;
	protected final String TEXT_44 = NL;
	protected final String TEXT_45 = NL;

	public PluginXML() {
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

			this.parameter = (org.eclipse.emf.codegen.ecore.genmodel.GenModel) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_44);
		stringBuffer.append(TEXT_45);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		method_call_PluginXMLExtensionHook(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_doGenerate(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		/**
		 * <copyright>
		 *
		 * Copyright (c) 2002-2005 IBM Corporation and others.
		 * All rights reserved.   This program and the accompanying materials
		 * are made available under the terms of the Eclipse Public License v1.0
		 * which accompanies this distribution, and is available at
		 * http://www.eclipse.org/legal/epl-v10.html
		 * 
		 * Contributors: 
		 *   IBM - Initial API and implementation
		 *
		 * </copyright>
		 */

		GenModel genModel = (GenModel) argument; /* Trick to import java.util.* without warnings */
		Iterator.class.getName();
		stringBuffer.append(TEXT_1);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#LogicalName=org.eclipse.egf.emf.pattern.base.HeaderXml" args="parameter:argument"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("argument", parameter);
			CallHelper.executeWithParameterInjection("platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#__h1VkCwtEd-jc5T-XaRJlg", new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_3);
		if (genModel.isBundleManifest()) {
			stringBuffer.append(TEXT_4);
		} else {
			stringBuffer.append(TEXT_5);
			stringBuffer.append(genModel.getModelPluginID());
			stringBuffer.append(TEXT_6);
			if (genModel.hasModelPluginClass()) {
				stringBuffer.append(TEXT_7);
				stringBuffer.append(genModel.getQualifiedModelPluginClassName());
				stringBuffer.append(TEXT_8);
			} else {
				stringBuffer.append(TEXT_9);
			}
			stringBuffer.append(TEXT_10);
			for (String pluginID : genModel.getModelRequiredPlugins()) {
				stringBuffer.append(TEXT_11);
				stringBuffer.append(pluginID);
				stringBuffer.append(TEXT_12);
				if (!pluginID.startsWith("org.eclipse.core.runtime")) {
					stringBuffer.append(TEXT_13);
				}
				stringBuffer.append(TEXT_14);
			}
			stringBuffer.append(TEXT_15);
			if (genModel.isRuntimeJar()) {
				stringBuffer.append(TEXT_16);
				stringBuffer.append(genModel.getModelPluginID());
				stringBuffer.append(TEXT_17);
			} else {
				stringBuffer.append(TEXT_18);
			}
			stringBuffer.append(TEXT_19);
		}
		for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
			stringBuffer.append(TEXT_20);
			stringBuffer.append(genPackage.getNSURI());
			stringBuffer.append(TEXT_21);
			if (genModel.hasLocalGenModel()) {
				stringBuffer.append(TEXT_22);
				stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
				stringBuffer.append(TEXT_23);
				stringBuffer.append(genModel.getRelativeGenModelLocation());
				stringBuffer.append(TEXT_24);
			} else {
				stringBuffer.append(TEXT_25);
				stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
				stringBuffer.append(TEXT_26);
			}
			stringBuffer.append(TEXT_27);
			if (genPackage.isContentType()) {
				stringBuffer.append(TEXT_28);
				stringBuffer.append(genPackage.getContentTypeIdentifier());
				stringBuffer.append(TEXT_29);
				stringBuffer.append(genPackage.getQualifiedEffectiveResourceFactoryClassName());
				stringBuffer.append(TEXT_30);
				stringBuffer.append(genPackage.isXMIResource() ? "org.eclipse.emf.ecore.xmi" : "org.eclipse.core.runtime.xml");
				stringBuffer.append(TEXT_31);
				stringBuffer.append(genPackage.getFileExtensions());
				stringBuffer.append(TEXT_32);
				stringBuffer.append(genPackage.getContentTypeIdentifier());
				stringBuffer.append(TEXT_33);
				stringBuffer.append(genPackage.getPrefix());
				stringBuffer.append(TEXT_34);
				if (genPackage.hasTargetNamespace()) {
					stringBuffer.append(TEXT_35);
					stringBuffer.append(genPackage.getNSURI());
					stringBuffer.append(TEXT_36);
				}
				if (genPackage.isXMIResource()) {
					stringBuffer.append(TEXT_37);
				}
				stringBuffer.append(TEXT_38);
			} else if (genPackage.getResource() != GenResourceKind.NONE_LITERAL) {
				stringBuffer.append(TEXT_39);
				stringBuffer.append(genPackage.getFileExtension());
				stringBuffer.append(TEXT_40);
				stringBuffer.append(genPackage.getQualifiedResourceFactoryClassName());
				stringBuffer.append(TEXT_41);
			}
		}
		stringBuffer.append(TEXT_42);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doGenerate", stringBuffer.toString());
	}

	protected void method_setReporterVariables(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		GenModel genModel = parameter;
		targetPathName = genModel.getModelProjectDirectory() + "/plugin.xml";
		overwrite = true;
		encoding = "UTF-8";

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setReporterVariables", stringBuffer.toString());
	}

	protected void method_call_PluginXMLExtensionHook(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.emde.egf/egf/eMDE_EMF_Extension.fcore#LogicalName=org.polarsys.kitalpha.emde.egf.model.ModelPluginXMLExtensionHook" args="parameter:genModel,targetPathName:targetPathName"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("genModel", parameter);
			callParameters.put("targetPathName", targetPathName);
			CallHelper.executeWithParameterInjection("platform:/plugin/org.polarsys.kitalpha.emde.egf/egf/eMDE_EMF_Extension.fcore#_rV5NMC-mEeCJ8qG0PlPcqA", new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_43);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "call_PluginXMLExtensionHook", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return EmdePreconditionHelper.hasEmdeFeatures(parameter);
	}
}