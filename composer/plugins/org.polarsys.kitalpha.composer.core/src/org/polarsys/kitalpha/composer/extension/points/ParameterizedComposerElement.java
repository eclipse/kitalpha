/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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