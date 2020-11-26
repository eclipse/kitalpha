/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Describes an element of a generation plan profile that has an id and
 * parameters.
 * 
 * @author Yann Mortier
 */
public final class ParameterizedProfileElement {

	/**
	 * The id of the element.
	 */
	private final String id;

	/**
	 * The parameters.
	 */
	private final List<ParameterProfileElement> parameters;

	/**
	 * Creates a new profile element with the given id.
	 * 
	 * @param id
	 *            the identifier of the element.
	 */
	public ParameterizedProfileElement(String id) {
		this.id = id;
		this.parameters = new ArrayList<ParameterProfileElement>();
	}

	/**
	 * Returns the id of this element.
	 * 
	 * @return the id of this element.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Adds the given parameter to this element.
	 * 
	 * @param parameter
	 *            the parameter to add.
	 */
	public void addParameter(ParameterProfileElement parameter) {
		this.parameters.add(parameter);
	}

	/**
	 * Returns the parameters of this element. <strong>WARNING: the returned
	 * list is NOT modifiable</strong>.
	 * 
	 * @return the parameters of this element
	 */
	public List<ParameterProfileElement> getParameters() {
		return Collections.unmodifiableList(parameters);
	}
}
