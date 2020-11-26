/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.precondition.exception;

/**
 * 
 * @author Faycal Abka
 *
 */
public class InvalidPreconditionException extends Exception  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4190026023848031103L;

	public InvalidPreconditionException(String msg){
		super(msg);
	}
}
