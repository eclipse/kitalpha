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


package org.polarsys.kitalpha.composer.api.profiles;

/**
 * Describes a parameter of an element of a generation plan.
 * 
 * @author Yann Mortier
 */
public final class ParameterProfileElement {

	/**
	 * The name of the parameter.
	 */
	private final String name;

	/**
	 * The value of the parameter.
	 */
	private final String value;

	/**
	 * Creates a new parameter with the given name and value.
	 * 
	 * @param name
	 *            the name.
	 * @param value
	 *            the value.
	 */
	public ParameterProfileElement(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Returns the name of this parameter.
	 * 
	 * @return the name of this parameter.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the value of this parameter.
	 * 
	 * @return the value of this parameter.
	 */
	public String getValue() {
		return value;
	}

}
