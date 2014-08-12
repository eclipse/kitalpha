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
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.node;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.conf.DiagramGenerationConfigurationHelper;

public class ContainerImportPattern
		extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.node.ContainerPattern {

	public ContainerImportPattern() {
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
		method_inheritLabelSpecification(new StringBuffer(), ictx);
		method_inheritMappingReuse(new StringBuffer(), ictx);
		method_inheritSemanticData(new StringBuffer(), ictx);
		{
			final Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("original_m", this.mapping);
			parameters.put("imported_m", this.icm);
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
		genDefaultSemanticCandidatesExpression = false;

		icm = DescriptionFactory.eINSTANCE.createContainerMappingImport();

		mapping = parameter.getImports();

		icm.setName(parameter.getName() + "_Imported_CM");
		icm.setLabel(parameter.getName());
		icm.setChildrenPresentation(parameter.getContentLayout());
		icm.setImportedMapping(mapping);

		dContainerMapping = icm;

		//MappingAutoImportManager.INSTANCE.registerUserMappingImport(mapping, icm);

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "createDoremiElement",
				out.toString());
	}

	protected void method_inheritLabelSpecification(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		// Inherits label if not defined
		boolean inheritsLabel = true;
		if (parameter.getStyle() != null && parameter.getStyle().size() > 0) {
			for (ContainerDescription iNodeDescription : parameter.getStyle()) {
				if (iNodeDescription.getCondition() == null) {
					if (iNodeDescription.getNode_Label() != null) {
						inheritsLabel = false;
						break;
					}
				}
			}
		}

		if (inheritsLabel) {
			ContainerStyleDescription style = icm.getStyle();
			if (style != null) {
				style.setLabelAlignment(mapping.getStyle().getLabelAlignment());
				style.setLabelColor(mapping.getStyle().getLabelColor());
				style.setLabelExpression(mapping.getStyle()
						.getLabelExpression());
				style.setLabelFormat(mapping.getStyle().getLabelFormat());
				style.setLabelSize(mapping.getStyle().getLabelSize());
			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(),
				"inheritLabelSpecification", out.toString());
	}

	protected void method_inheritMappingReuse(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		// ContainerMapping mapping = parameter.getImports();

		// reusing the reused mappings
		if (mapping.getAllContainerMappings() != null
				&& mapping.getAllContainerMappings().size() > 0)
			icm.getReusedContainerMappings().addAll(
					mapping.getAllContainerMappings());

		if (icm.getAllContainerMappings().contains(mapping)) {
			icm.getReusedContainerMappings().remove(mapping);
			icm.getReusedContainerMappings().add(icm);
		}

		if (mapping.getAllNodeMappings() != null
				&& mapping.getAllNodeMappings().size() > 0)
			icm.getReusedNodeMappings().addAll(mapping.getAllNodeMappings());

		if (mapping.getAllBorderedNodeMappings() != null
				&& mapping.getAllBorderedNodeMappings().size() > 0)
			icm.getReusedBorderedNodeMappings().addAll(
					mapping.getAllBorderedNodeMappings());

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "inheritMappingReuse",
				out.toString());
	}

	protected void method_inheritSemanticData(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		//ContainerMapping mapping = parameter.getImports();

		boolean inheritSemanticCandidatesExpression = false;

		if (icm.getSemanticCandidatesExpression() == null) {
			inheritSemanticCandidatesExpression = true;
		} else {
			if (icm.getSemanticCandidatesExpression().trim().length() == 0) {
				inheritSemanticCandidatesExpression = true;
			}
		}

		if (inheritSemanticCandidatesExpression) {
			icm.setSemanticCandidatesExpression(mapping
					.getSemanticCandidatesExpression());
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "inheritSemanticData",
				out.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return DiagramGenerationConfigurationHelper.generateVSM(parameter)
				&& parameter.getImports() != null;
	}

	protected org.eclipse.sirius.diagram.description.ContainerMappingImport icm;

	public void set_icm(
			org.eclipse.sirius.diagram.description.ContainerMappingImport icm) {
		this.icm = icm;
	}

	protected org.eclipse.sirius.diagram.description.ContainerMapping mapping;

	public void set_mapping(
			org.eclipse.sirius.diagram.description.ContainerMapping mapping) {
		this.mapping = mapping;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
