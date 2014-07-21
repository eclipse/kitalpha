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
