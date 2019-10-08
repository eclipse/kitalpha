/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
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

/**
 * Specification of an utility which allows to access to contributed patterns.
 * 
 * <pre>The structures returned by this service should be never be modified by the client.
 *If the structures are modified, it will effects the registry</pre>
 *
 * @author Faycal Abka
 *
 */
public interface IDocGenExtension {
	
	/**
	 * @return a Collection of all contributed patterns
	 */
	Collection<Pattern> getAllPatterns();
	
	/**
	 * @return a map of all patterns classified by periority
	 */
	Map<Integer, Collection<Pattern>> getAllPatternsWithPriorities();
	
	/**
	 * @return a map of all patterns with classified by their contribution topic
	 */
	Map<String, Collection<Pattern>> getAllPatternsWithTopics();
	
	/**
	 * @param priority
	 * @return a Collection of all patterns with {@code priority} or {@literal null}
	 */
	Collection<Pattern> getPatternsWithPriority(Integer priority);
	
	/**
	 * @param topic
	 * @return a Collection of all patterns with {@code topic} or {@literal null}
	 */
	Collection<Pattern> getPatternsWithTopic(String topic);

}
