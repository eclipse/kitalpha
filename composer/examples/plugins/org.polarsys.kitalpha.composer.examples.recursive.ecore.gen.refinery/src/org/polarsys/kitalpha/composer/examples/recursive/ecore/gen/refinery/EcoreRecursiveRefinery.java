/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.recursive.ecore.gen.refinery;

import java.util.Map;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

public class EcoreRecursiveRefinery implements IRefinery {

	public EcoreRecursiveRefinery() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, Parameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public Root refineModelElements(Root allocRoot_p,
			Map<String, Parameter> refineryParams_p) {
		return allocRoot_p;
	}

	public Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}

}
