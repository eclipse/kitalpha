/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.scope;

/**
 * @author Boubekeur Zendagui
 */
public class ScopeException extends Exception {

	private static final long serialVersionUID = 2063263089008503231L;

	/**
	 * Constructor with message
	 * @param message the exception message
	 */
	public ScopeException(String message) {
		super(message);
	}
	
	/**
	 * Constructor with cause
	 * @param cause a {@link Throwable}
	 */
	public ScopeException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor with message and cause
	 * @param message the exception message
	 * @param cause a {@link Throwable}
	 */
	public ScopeException(String message, Throwable cause) {
		super(message, cause);
	}

}
