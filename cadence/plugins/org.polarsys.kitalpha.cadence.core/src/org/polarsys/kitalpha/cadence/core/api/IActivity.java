/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.core.api;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;

import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;

/**
 * This interface specifies the contract for providing activity.
 * Classes implementing this interface shall provide a
 * constructor without parameters so that eclipse can instantiate strategies.
 * 
 * @author Franco Bergomi
 */
public interface IActivity {

	/**
	 * Method that creates an allocation for a whole model.
	 * 
	 * @param modelRoot_p :
	 *            the root of the model
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @return the allocation instantiated by this strategy
	 */
	IStatus run(ActivityParameters activityParams);

	/**
	 * 
	 * @return
	 */
	Collection<DeclaredParameter> getParameters();

	/**
	 * Method that allows to validate the values of the strategy parameters.
	 * 
	 * @param valuedParameters :
	 *            the new values of the parameters
	 * @return the parameters that aren't valid
	 */
	Map<String, ParameterError<?>> validateParameters(
			ActivityParameters valuedParameters);
}
