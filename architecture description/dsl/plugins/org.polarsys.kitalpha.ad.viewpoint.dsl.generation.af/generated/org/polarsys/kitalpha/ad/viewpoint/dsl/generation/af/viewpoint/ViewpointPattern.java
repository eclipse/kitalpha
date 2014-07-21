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

//Generated on Fri Jun 27 18:40:21 CEST 2014 with EGF 1.2.0.v20140618-1006
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.viewpoint;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.egf.common.helper.*;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.core.runtime.NullProgressMonitor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project.AfProjectManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint.PlatformViewpointHelper;

public class ViewpointPattern {

	public ViewpointPattern() {
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

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint) parameterParameter;

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
		method_setViewpointDescription(new StringBuffer(), ictx);
		method_setViewpointRelationShips(new StringBuffer(), ictx);
		method_updateRequiredBundles(new StringBuffer(), ictx);
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

	protected void method_setViewpointDescription(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		AfProjectManager.INSTANCE.getViewpoint().setDescription(
				parameter.getDescription());

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(),
				"setViewpointDescription", out.toString());
	}

	protected void method_setViewpointRelationShips(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		ResourceSet resourceSet = parameter.eResource().getResourceSet();
		for (Viewpoint viewpoint : parameter.getParents()) {
			String afViewpointID = VpDslConfigurationHelper
					.getRootProjectName(viewpoint);
			org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint viewpoint_af = PlatformViewpointHelper
					.getAFViewpoint(afViewpointID, resourceSet);

			if (viewpoint_af != null) {
				boolean isAlreadyAdded = false;
				for (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint iVp : AfProjectManager.INSTANCE
						.getViewpoint().getParents()) {
					if (iVp.getName().equals(viewpoint_af.getName())
							&& iVp.getId().equals(viewpoint_af.getId())
							&& iVp.getVpid().equals(viewpoint_af.getVpid())) {
						isAlreadyAdded = true;
						break;
					}
				}
				if (!isAlreadyAdded)
					AfProjectManager.INSTANCE.getViewpoint().getParents()
							.add(viewpoint_af);
			}
		}

		for (Viewpoint viewpoint : parameter.getDependencies()) {
			String afViewpointID = VpDslConfigurationHelper
					.getRootProjectName(viewpoint);
			org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint viewpoint_af = PlatformViewpointHelper
					.getAFViewpoint(afViewpointID, resourceSet);

			if (viewpoint_af != null) {
				boolean isAlreadyAdded = false;
				for (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint iVp : AfProjectManager.INSTANCE
						.getViewpoint().getDependencies()) {
					if (iVp.getName().equals(viewpoint_af.getName())
							&& iVp.getId().equals(viewpoint_af.getId())
							&& iVp.getVpid().equals(viewpoint_af.getVpid())) {
						isAlreadyAdded = true;
						break;
					}
				}
				if (!isAlreadyAdded)
					AfProjectManager.INSTANCE.getViewpoint().getDependencies()
							.add(viewpoint_af);
			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(),
				"setViewpointRelationShips", out.toString());
	}

	protected void method_updateRequiredBundles(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		EList<org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint> allVP = new BasicEList<org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint>();
		if (parameter.getParents().size() > 0)
			allVP.addAll(AfProjectManager.INSTANCE.getViewpoint().getParents());

		if (parameter.getDependencies().size() > 0)
			allVP.addAll(AfProjectManager.INSTANCE.getViewpoint()
					.getDependencies());

		for (org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint viewpoint : allVP) {
			String bundleID = EcoreUtil.getURI(viewpoint).segment(1);
			PDEUtility.updateRequiredBundles(
					AfProjectManager.INSTANCE.getProject(), bundleID,
					new NullProgressMonitor());
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "updateRequiredBundles",
				out.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint parameter;

	public void set_parameter(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint parameter) {
		this.parameter = parameter;
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
