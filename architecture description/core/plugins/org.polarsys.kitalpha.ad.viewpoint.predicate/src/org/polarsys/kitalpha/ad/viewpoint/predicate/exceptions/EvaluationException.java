/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions;

/**
 * Exception used for wrapping error occurred in the evaluation of predicates or execution of actions
 *  
 * @author Faycal Abka
 *
 */
public class EvaluationException extends Exception {

	private static final long serialVersionUID = 5731501748509815101L;
	
	public EvaluationException(String message, Throwable cause) {
		super(message, cause);
	}

}
