/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


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
