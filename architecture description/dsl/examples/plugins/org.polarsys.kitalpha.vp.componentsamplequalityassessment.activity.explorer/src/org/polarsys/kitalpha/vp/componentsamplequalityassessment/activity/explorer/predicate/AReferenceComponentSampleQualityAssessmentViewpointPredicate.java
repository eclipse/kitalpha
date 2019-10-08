/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

// Generated on 26.10.2016 at 11:37:23 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsamplequalityassessment.activity.explorer.predicate;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.polarsys.kitalpha.vp.componentsample.activity.explorer.services.ComponentSampleViewpointServices;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.activity.explorer.Constants;

/**
 * @author Faycal ABKA
 * @generated NOT
 */
public class AReferenceComponentSampleQualityAssessmentViewpointPredicate implements IPredicate {
	/**
	 * Default constructor
	 * @generated NOT
	 */
	public AReferenceComponentSampleQualityAssessmentViewpointPredicate() {
	}

	/**
	 * The predicate implementation
	 * @return True if OK, false otherwise.
	 * @generated NOT
	 */
	@Override
	public boolean isOk() {
		return !ComponentSampleViewpointServices.SERVICE.isReferenced(Constants.ID);
	}
}
