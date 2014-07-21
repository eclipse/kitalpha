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


package org.polarsys.kitalpha.composer.extension.points;

import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * @author Yann Mortier
 * 
 */
public interface IGeneratorWithProgress extends IGenerator {

	/**
	 * Method that launch a code generation from an allocation model.
	 * 
	 * @param allocRoot_p
	 *            the root element of an allocation model
	 * @param target_f
	 *            the target folder of the code generation
	 * @param progressMonitor
	 *            to notify the progression of the generation.
	 */
	public void generateCode(final Root allocRoot_p,
			final Map<String, Parameter> generatorParams_p,
			final IPath target_f, IProgressMonitor progressMonitor);

}
