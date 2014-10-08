/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
	public Root refineModelElements(final Root allocRoot_p,
			final Map<String, Parameter> refineryParams_p);

}
