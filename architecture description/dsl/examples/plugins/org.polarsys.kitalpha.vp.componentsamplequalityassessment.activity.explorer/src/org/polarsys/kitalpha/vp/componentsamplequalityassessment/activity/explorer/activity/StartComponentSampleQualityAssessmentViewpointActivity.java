/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.vp.componentsamplequalityassessment.activity.explorer.activity;

import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.activity.AbstractComponentsampleHyperLink;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class StartComponentSampleQualityAssessmentViewpointActivity extends AbstractComponentsampleHyperLink {


	@Override
	public void linkActivated(HyperlinkEvent e) {
		_linkActivated(e, IComponentSampleConstants.COMPONENTSAMPLE_QUALITY_ASSESSMENT);
	}
}