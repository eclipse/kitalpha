/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
// Generated on 27.10.2016 at 04:41:46 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.activity.explorer.predicate;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.polarsys.kitalpha.vp.componentsample.activity.explorer.services.ComponentSampleViewpointServices;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.activity.explorer.Constants;

/**
 * @author Faycal ABKA
 * @generated NOT
 */
public class ACreateComponentSampleSafetyPatternDiagramPredicate implements IPredicate {

	private static final String COMPONENTSAMPLE_SAFETY_ID = "org.polarsys.kitalpha.vp.componentsamplesafety";

	/**
	 * Default constructor
	 * @generated NOT
	 */
	public ACreateComponentSampleSafetyPatternDiagramPredicate() {
	}

	/**
	 * The predicate implementation
	 * @return True if OK, false otherwise.
	 * @generated NOT
	 */
	@Override
	public boolean isOk() {
		return ComponentSampleViewpointServices.SERVICE.isReferenced(COMPONENTSAMPLE_SAFETY_ID)
				&& ComponentSampleViewpointServices.SERVICE.isReferenced(Constants.ID);
	}
}
