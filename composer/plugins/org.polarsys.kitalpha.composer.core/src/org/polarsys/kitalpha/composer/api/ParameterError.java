/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api;

/**
 * This class allows to give a reason, when a parameter value is not correct.
 * 
 * @author Guillaume Gebhart
 
 */
public final class ParameterError {

	private String reason = "?";
	private Parameter parameter = null;

	/**
	 * Creates a new error.
	 * 
	 * @param reason
	 *            the reason of the error.
	 * @param parameter
	 *            the invalid parameter.
	 */
	public ParameterError(Parameter parameter, String reason) {
		this.reason = reason;
		this.parameter = parameter;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason
	 *            the reason to set
	 */
	public void setReason(final String reason) {
		this.reason = reason;
	}

	/**
	 * @return the parameter
	 */
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * @param parameter
	 *            the parameter to set
	 */
	public void setParameter(final Parameter parameter) {
		this.parameter = parameter;
	}

}
