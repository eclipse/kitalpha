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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

/**
 * @author Boubekeur Zendagui
 */
public class StylePropertyNameValueCouple {
	
	/** The name of the Style property **/
	private String name;

	/** The value of the Style property **/
	private Object value;

	/**
	 * Default Constructor
	 * @param name The name of the Style property
	 * @param value The value of the Style property
	 */
	public StylePropertyNameValueCouple(String name, Object value) {
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Getter
	 * @return The name of the Style property  
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * @param name The name of the Style property
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Getter
	 * @return The value of the Style property 
	 */
	public Object getValue() {
		return value;
	}


	/**
	 * Setter
	 * @param value The value of the Style property
	 */
	public void setValue(Object value) {
		this.value = value;
	}
}
