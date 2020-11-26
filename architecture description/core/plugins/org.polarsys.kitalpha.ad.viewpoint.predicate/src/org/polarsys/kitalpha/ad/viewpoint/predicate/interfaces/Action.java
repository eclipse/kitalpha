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
package org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces;

/**
 * Interface which define the specification of action.
 * An action perform the transition according to the evaluation of
 * predicates.
 * 
 * @author Faycal Abka
 *
 */
@FunctionalInterface
public interface Action {
	
	/**
	 * Implementation of the behavior which perform the transition
	 * 
	 * @param e is the context which contains external data from the client
	 */
	void run(final Context e);
	
}
