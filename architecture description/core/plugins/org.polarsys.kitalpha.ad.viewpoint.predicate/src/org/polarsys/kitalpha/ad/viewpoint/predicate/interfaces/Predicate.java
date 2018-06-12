/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces;

/**
 * Interface which specify the service to implement boolean expression.
 * A predicate is evaluated before before execute the transition by the Action
 * 
 * @author Faycal Abka
 *
 */
@FunctionalInterface
public interface Predicate {

	/**
	 * Implementation of the boolean expression which which act as guard to
	 * perform the transition
	 * 
	 * @param e is the context which contains external data from the client
	 * @return true if expression is evaluated to true, otherwise false
	 */
	boolean apply(final Context e);
	
}
