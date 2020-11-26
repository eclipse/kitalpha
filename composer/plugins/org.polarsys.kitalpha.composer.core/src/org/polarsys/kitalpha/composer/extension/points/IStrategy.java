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


package org.polarsys.kitalpha.composer.extension.points;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * This interface specifies the contract for providing allocation strategies for
 * code generation. Classes implementing this interface shall provide a
 * constructor without parameters so that eclipse can instantiate strategies.
 * 
 * @author Franco Bergomi
 
 */
public interface IStrategy extends ParameterizedComposerElement {

	/**
	 * Method that creates an allocation for a whole model.
	 * 
	 * @param modelRoot_p :
	 *            the root of the model
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @return the allocation instantiated by this strategy
	 */
	Root allocateModelElements(EObject modelRoot,
			Map<String, Parameter> strategyParams);

	/**
	 * Method that creates an allocation for given elements of a model.
	 * 
	 * @param modelRoot_p :
	 *            the root of the model
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param modelElementsToGenerate_p :
	 *            the elements that user wants to be generated
	 * @return the allocation instantiated by this strategy
	 */
	Root allocateModelElements(EObject modelRoot,
			Map<String, Parameter> strategyParams,
			List<EObject> modelElementsToGenerate);

}
