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

package org.polarsys.kitalpha.vp.componentsample.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.activity.AbstractComponentsampleHyperLink;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class StopComponentSampleViewpointActivity extends AbstractComponentsampleHyperLink {

	/**
	* Default constructor
	*/
	public StopComponentSampleViewpointActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	* Constructor with parameters
	* @param root the root model element ({@link EObject})
	* @param session the associated {@link Session} with the activity explorer
	*/
	public StopComponentSampleViewpointActivity(EObject root, Session session) {
		super(root);
	}

	/**
	 * Constructor with parameters
	 * @param root the root model element ({@link EObject})
	 * @param session the associated {@link Session} with the activity explorer
	 */
	public StopComponentSampleViewpointActivity(EObject root) {
		super(root);
	}

	/**
	 * @generated NOT
	 */

	@Override
	protected void linkPressed(HyperlinkEvent event, EObject project_p, Session session) {
		super.linkPressed(event, project_p, session);
	}

	@Override
	public void linkActivated(HyperlinkEvent e) {
		_linkActivated(e, IComponentSampleConstants.COMPONENTSAMPLE);
	}
}