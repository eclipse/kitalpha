/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions;

/**
 * Exception used when a value is not found in Context
 * 
 * @author Faycal Abka
 *
 */
public class ValueNotFoundException extends Exception {

	private static final long serialVersionUID = -4089237994894651498L;
	
	public ValueNotFoundException(String message) {
		super(message);
	}

}
