/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.imp;

import java.util.Collection;
import java.util.Map;

import org.eclipse.egf.model.pattern.Node;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.execution.CallHelper;
import org.eclipse.egf.pattern.execution.ExecutionContext;
import org.eclipse.egf.pattern.execution.InternalPatternContext;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.doc.gen.business.core.extension.intf.DocGenExtensionFactory;
import org.polarsys.kitalpha.doc.gen.business.core.extension.intf.IDocGenExtension;
import org.polarsys.kitalpha.doc.gen.business.core.extension.intf.IDocGenExtensionEngine;

/**
 * Implementation of the engine which allows execution of contributed patterns
 * @author Faycal Abka
 *
 */
public final class DocGenExtensionEngine implements IDocGenExtensionEngine {

	@Override
	public void execute(String patternURI, PatternContext ctx, Map<String, Object> params) {
		CallHelper.executeWithParameterInjection(patternURI, new ExecutionContext((InternalPatternContext) ctx), params);
	}

	@Override
	public void execute(Pattern pattern, PatternContext ctx, Map<String, Object> params) {
		execute(EcoreUtil.getURI(pattern).toString(), ctx, params);
	}

	@Override
	public void execute(Collection<Pattern> patterns, PatternContext ctx, Map<String, Object> params) {
		for (Pattern pattern : patterns) {
			execute(pattern, ctx, params);
		}
	}

	@Override
	public void execute(PatternContext ctx, Map<String, Object> params) {
		IDocGenExtension manager = DocGenExtensionFactory.getDocGenExtensionManager();
		Collection<Pattern> patterns = manager.getAllPatterns();
		execute(patterns, ctx, params);
	}

	@Override
	public void apply(String topic, PatternContext ctx, Map<String, Object> params) {
		IDocGenExtension manager = DocGenExtensionFactory.getDocGenExtensionManager();
		Collection<Pattern> patterns = manager.getPatternsWithTopic(topic);
		execute(patterns, ctx, params);
	}

	@Override
	public void execute(String patternURI, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer) {
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
		stringBuffer.setLength(0);
		CallHelper.executeWithParameterInjection(patternURI, new ExecutionContext((InternalPatternContext) ctx), params);
		stringBuffer.setLength(0);
	}

	@Override
	public void execute(Pattern pattern, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer) {
		execute(EcoreUtil.getURI(pattern).toString(), ctx, params, stringBuffer);
	}

	@Override
	public void execute(Collection<Pattern> patterns, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer) {
		for (Pattern pattern : patterns) {
			execute(pattern, ctx, params, stringBuffer);
		}
	}

	@Override
	public void execute(PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer) {
		IDocGenExtension manager = DocGenExtensionFactory.getDocGenExtensionManager();
		Collection<Pattern> patterns = manager.getAllPatterns();
		execute(patterns, ctx, params, stringBuffer);
	}

	@Override
	public void apply(String topic, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer) {
		IDocGenExtension manager = DocGenExtensionFactory.getDocGenExtensionManager();
		Collection<Pattern> patterns = manager.getPatternsWithTopic(topic);
		execute(patterns, ctx, params, stringBuffer);
	}

}
