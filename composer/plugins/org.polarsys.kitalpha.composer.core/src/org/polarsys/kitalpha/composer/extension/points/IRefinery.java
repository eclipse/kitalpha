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

import java.util.Map;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * This interface specifies the contract for providing allocation refineries for
 * code generation.
 * 
 * @author Guillaume Gebhart
 */
public interface IRefinery extends ParameterizedComposerElement {

	/**
	 * Method that fill in an allocation model with particular languages
	 * concepts.
	 * 
	 * @param allocRoot_p :
	 *            the root of the allocation model
	 * @param refineryParams_p :
	 *            the parameters of the refinery
	 * @return the allocation model filled in completely.
	 */
	Root refineModelElements(final Root allocRoot,
			final Map<String, Parameter> refineryParams);

}
