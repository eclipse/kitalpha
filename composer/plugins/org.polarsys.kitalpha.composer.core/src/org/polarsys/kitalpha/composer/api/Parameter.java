/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api;

/**
 * This class allows to define a strategy's parameter or a refinery's parameter
 * or a generator parameter.
 * 
 
 * @author Guillaume Gebhart
 */
public class Parameter {

	private String name;
	private String value;
	private String description;


	/**
	 * Creates a new Parameter.
	 * 
	 * @param name
	 *            the name of the paremeter, it must be an unique identifier.
	 * @param value
	 *            the value of the parameter (filled by the user.
	 * @param description
	 *            describes the parameter
	 */
	public Parameter(String name, String value, String description) {
		this.name = name;
		this.value = value;
		this.description = description;
	}

	/**
	 * Returns the value filled by the user.
	 * 
	 * @return the value filled by the user.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Returns the description of the parameter.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of the parameter.
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the name of the parameter.
	 * 
	 * @param name
	 *            the name of the parameter.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of the parameter.
	 * 
	 * @return the name of the parameter.
	 */
	public String getName() {
		return name;
	}

}
