/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Transition;

/**
 * Transition Interface for internal use.
 * This increase the capacity Transition interface to support adding predicates
 * 
 * @author Faycal Abka
 *
 */
public interface InternalTransition extends Transition {
	
	/**
	 * Add predicate ID to this transition
	 * @param p the predicate ID
	 */
	void addPredicate(final String id, final Predicate predicate);
	
	/**
	 * Add a new diagranositc message for the predicate id
	 * @param id of the predicate
	 * @param diagnosticMessage if it is evaluated to false
	 */
	void addDiagnostic(final String id, final String diagnosticMessage);
	

}
