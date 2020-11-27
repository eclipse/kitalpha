/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.rules.transformation;

import java.util.Collections;
import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SoftwareComponentRule implements IRule<SoftwareComponent> {

	public SoftwareComponentRule() {
		// Do nothing
	}

	@Override
	public String getName() {
		return "Default Output folder transformation rule"; //$NON-NLS-1$
	}

	@Override
	public boolean isApplicableOn(SoftwareComponent softwareCps) {
		return true;
	}

	@Override
	public void apply(SoftwareComponent softwareCps, IContext context_p) throws Exception {
		System.out.println("Transformation of Software component..."); //$NON-NLS-1$
	}

	@Override
	public List getPremises(SoftwareComponent softwareCps) {
		return Collections.emptyList();
	}

}
