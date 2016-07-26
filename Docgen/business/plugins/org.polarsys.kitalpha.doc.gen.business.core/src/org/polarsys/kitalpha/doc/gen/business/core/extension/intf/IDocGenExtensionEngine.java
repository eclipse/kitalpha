/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.intf;

import java.util.Collection;
import java.util.Map;

import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternContext;

/**
 * Specification of the engine which allows execution of contributed patterns
 * @author Faycal Abka
 *
 */
public interface IDocGenExtensionEngine {
	
	/**
	 * Execute the pattern specified in {@code patternURI} parameter with {@code ctx} context and
	 * {@code params} parameters
	 * @param patternURI uri of the pattern to execute
	 * @param ctx context of the pattern to execute
	 * @param params parameters of the pattern to execute
	 */
	public void execute(String patternURI, PatternContext ctx, Map<String, Object> params);
	
	/**
	 * Execute the pattern {@code pattern} with {@code ctx} context and
	 * {@code params} parameters
	 * @param pattern to execute
	 * @param ctx ctx context of the pattern to execute
	 * @param params parameters of the pattern to execute
	 */
	public void execute(Pattern pattern, PatternContext ctx, Map<String, Object> params);
	
	/**
	 * Execute all patterns in {@code patterns} with {@code ctx} context and
	 * {@code params} parameters
	 * @param patterns
	 * @param ctx ctx context of the pattern to execute
	 * @param params parameters of the pattern to execute
	 */
	public void execute(Collection<Pattern> patterns, PatternContext ctx, Map<String, Object> params);
	
	/**
	 * Execute all contribued patterns with {@code ctx} context and {@code params} parameters
	 * @param ctx context of the pattern to execute
	 * @param params parameters of the pattern to execute
	 */
	public void execute(PatternContext ctx, Map<String, Object> params);
	
	/**
	 * Apply (i.e. execute) all contributed patterns in the topic with  {@code ctx} context and {@code params} parameters
	 * @param topic
	 * @param ctx context of the pattern to execute
	 * @param params parameters of the pattern to execute
	 */
	public void apply(String topic, PatternContext ctx, Map<String, Object> params);
	
	
	/**
	 * TODO
	 */
	public void execute(String patternURI, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer);
	
	/**
	 * TODO
	 */
	public void execute(Pattern pattern, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer);
	
	/**
	 * TODO
	 */
	public void execute(Collection<Pattern> patterns, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer);
	
	/**
	 * TODO
	 */
	public void execute(PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer);
	
	/**
	 * TODO
	 */
	public void apply(String topic, PatternContext ctx, Map<String, Object> params, StringBuffer stringBuffer);
}
