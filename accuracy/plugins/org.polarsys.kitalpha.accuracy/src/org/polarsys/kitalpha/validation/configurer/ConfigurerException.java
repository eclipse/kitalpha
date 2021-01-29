/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.configurer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.validation.AccuracyPlugin;

/**
 * Exception thrown when the configuration for accuracy is not valid.
 * 
 * @author Yann Mortier
 */
public class ConfigurerException extends Exception {

	/**
	 * Serial version id.
	 */
	private static final long serialVersionUID = -8719887645838488007L;

	public ConfigurerException() {
		super();
	}

	public ConfigurerException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigurerException(String message) {
		super(message);
	}

	public ConfigurerException(Throwable cause) {
		super(cause);
	}

	/**
	 * Returns the status corresponding to this exception.
	 * 
	 * @return the status corresponding to this exception.
	 */
	public IStatus getStatus() {
		return new Status(IStatus.ERROR, AccuracyPlugin.PLUGIN_ID, this
				.getMessage() == null ? getClass().getSimpleName()
				: getMessage(), this);
	}

}
