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
package org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager;

import java.util.Collection;

import org.eclipse.egf.model.pattern.Pattern;

/**
 * Specification of the internal structure to handle DocGen contributions 
 * @author Faycal Abka
 *
 */
public interface IDocGenExtensionElement {
	
	/**
	 * @return the ID of the contribution
	 */
	String getTopic();
	
	/**
	 * @return the priority of the contribution
	 */
	Integer getPriority();
	
	
	/**
	 * @return a Collection of ordered pattern of the contribution. The initial order is kept
	 */
	Collection<Pattern> getPatterns();

}
