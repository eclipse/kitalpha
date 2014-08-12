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
//Generated on Tue Aug 12 15:01:20 CEST 2014 with EGF 1.2.0.v20140721-0706
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.egf.portfolio.genchain.tools.FcoreBuilderConstants;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.egf.model.fprod.ProductionPlan;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.types.TypesFactory;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.model.types.Type;
import org.eclipse.emf.common.util.URI;

import org.eclipse.egf.portfolio.genchain.tools.utils.ActivityInvocationHelper;
import org.polarsys.kitalpha.doc.gen.business.core.branding.DocumentationBrandingData;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding;

public class DocgenExtension {

	public DocgenExtension() {
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

			this.parameter = (org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration) parameterParameter;

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
		method_initializeBrandingData(new StringBuffer(), ictx);
		method_body(new StringBuffer(), ictx);
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

	protected void method_initializeBrandingData(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		DocumentationBrandingData.getInstance().removeAllData();

		KitalphaDocumentationGenerationBranding brandingData = parameter
				.getBrandingData();
		if (brandingData != null) {
			final String copyright = brandingData.getCopyright();
			if (copyright != null && copyright.isEmpty() == false)
				DocumentationBrandingData.getInstance().addData("copyright",
						copyright);

			final String logoPath = brandingData.getLogoPath();
			if (logoPath != null && logoPath.isEmpty() == false)
				DocumentationBrandingData.getInstance().addData("logoPath",
						logoPath);

			final String logoAlt = brandingData.getLogoAlt();
			if (logoAlt != null && logoAlt.isEmpty() == false)
				DocumentationBrandingData.getInstance().addData("logoAlt",
						logoPath);

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "initializeBrandingData",
				out.toString());
	}

	protected void method_body(final StringBuffer out, final PatternContext ctx)
			throws Exception {
		@SuppressWarnings("unchecked")
		Map<GenerationElement, FactoryComponent> fcs = (Map<GenerationElement, FactoryComponent>) ctx
				.getValue(FcoreBuilderConstants.CURRENT_FCORE);

		FactoryComponent fc = fcs.get((GenerationElement) (parameter
				.eContainer()));

		URI DOC_GEN_ACTIVITY_MODEL_URI = URI
				.createPlatformPluginURI(
						"/org.polarsys.kitalpha.doc.gen.business.ecore/egf/EcoreDocGenLauncher.fcore#",
						false);
		String DOC_GEN_ACTIVITY_ID = "_B9nwIR4UEeSYicwoCfn9sQ";

		/*String name = parameter.getName();*/
		String pluginName = parameter.getPluginName();
		String outputDirectoryPath = parameter.getOutputDirectoryPath();
		String ecorePath = parameter.getModelPath();

		Resource eResource = fc.eResource();
		ResourceSet resourceSet = eResource.getResourceSet();

		ProductionPlan pp = (ProductionPlan) fc.getOrchestration();

		Activity activity = (Activity) resourceSet.getResource(
				DOC_GEN_ACTIVITY_MODEL_URI, true).getEObject(
				DOC_GEN_ACTIVITY_ID);

		Map<String, Type> contract2type = new HashMap<String, Type>();

		// Set ecoreFilePath contract value
		TypeString typeString = TypesFactory.eINSTANCE.createTypeString();
		typeString.setValue(ecorePath);
		contract2type.put("ecoreFilePath", typeString);

		// Set outputDirectoryPath contract value
		typeString = TypesFactory.eINSTANCE.createTypeString();
		typeString.setValue(pluginName + "/" + outputDirectoryPath);
		contract2type.put("outputDirectoryPath", typeString);

		ActivityInvocationHelper.addInvocation(pp, activity, contract2type);

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", out.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}

	protected org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration parameter;

	public void set_parameter(
			org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration parameter) {
		this.parameter = parameter;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
