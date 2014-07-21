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

//Generated on Wed Jul 09 15:21:13 CEST 2014 with EGF 1.2.0.v20140702-0648
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.clazz.content;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

import org.eclipse.emf.common.util.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreResourceManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.PlatformEClassesManager;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;

public class ClassSuperClass
		extends
		org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.abstracts.ClassAbstractPattern {

	public ClassSuperClass() {
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

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) parameterParameter;

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
		method_linkToSuperClass(new StringBuffer(), ictx);
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

	protected void method_linkToSuperClass(final StringBuffer out,
			final PatternContext ctx) throws Exception {
		EList<AbstractSuperClass> superClasses = parameter.getInheritences();

		EList<EClass> superEClasses = new BasicEList<EClass>();

		for (AbstractSuperClass abstractSuperClass : superClasses) {
			if (abstractSuperClass instanceof ExternalSuperClass)
				superEClasses.add(((ExternalSuperClass) abstractSuperClass)
						.getSuperClass());

			if (abstractSuperClass instanceof LocalSuperClass) {
				Class clazz = ((LocalSuperClass) abstractSuperClass)
						.getSuperClass();
				String className = clazz.getName();
				EClass eClass = (EClass) ECoreResourceManager.INSTANCE
						.getEPackage().getEClassifier(className);
				superEClasses.add(eClass);
			}
		}

		for (EClass eClass : superEClasses) {
			EClass clazz = PlatformEClassesManager.INSTANCE
					.getEClassesWithPlatformURI(eClass);
			curEClass.getESuperTypes().add(clazz);
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "linkToSuperClass",
				out.toString());
	}

	public Map<String, Object> getParameters() {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

}
