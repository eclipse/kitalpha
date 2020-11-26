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
