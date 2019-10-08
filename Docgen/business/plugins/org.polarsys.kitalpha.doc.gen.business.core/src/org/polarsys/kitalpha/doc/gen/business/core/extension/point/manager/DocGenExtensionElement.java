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
package org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager;

import java.util.Collection;

import org.eclipse.egf.model.pattern.Pattern;

/**
 * Implementation of the internal structure to handle DocGen contributions
 * @author Faycal Abka
 *
 */
public class DocGenExtensionElement implements IDocGenExtensionElement {
	

	private String			topic;
	private Integer 		priority;
	private Collection<Pattern>	patterns;
	
	public DocGenExtensionElement(String id, Integer priority, Collection<Pattern> patterns) {
		super();
		this.topic = id;
		this.priority = priority;
		this.patterns = patterns;
	}
	
	@Override
	public String getTopic() {
		return this.topic;
	}

	@Override
	public Integer getPriority() {
		return this.priority;
	}

	@Override
	public Collection<Pattern> getPatterns() {
		return this.patterns;
	}

}
