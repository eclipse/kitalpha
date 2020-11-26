/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.extension.points;

import java.util.Map;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;

public interface ParameterizedComposerElement {

	/**
	 * Returns the parameters of this generator.
	 * <p>
	 * The key of the map should be the name of the parameter.
	 * </p>
	 * 
	 * @return the parameters of this generator.
	 */
	Map<String, Parameter> getParameters();

	/**
	 * Method that allows to validate the values of the generator parameters.
	 * 
	 * @param valuedParameters_p
	 *            the new values of the parameters
	 * @return the parameters that aren't valid
	 */
	Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters);

}