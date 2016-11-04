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
// Generated on 28.10.2016 at 02:45:08 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsamplesafety.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.vp.componentsample.activity.explorer.services.ComponentSampleViewpointServices;
import org.polarsys.kitalpha.vp.componentsamplesafety.activity.explorer.Constants;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class DeactivateComponentSampleSafetyViewpointActivity extends AbstractHyperlinkAdapter {
		
	/**
	 * Default constructor
	 */
	public DeactivateComponentSampleSafetyViewpointActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	 * Constructor with parameters
	 * @param root the root model element ({@link EObject})
	 * @param session the associated {@link Session} with the activity explorer
	 */
	public DeactivateComponentSampleSafetyViewpointActivity(EObject root) {
		super(root);
	}

	/*
	* (non-Javadoc)
	* @see org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter#linkPressed(org.eclipse.ui.forms.events.HyperlinkEvent, org.eclipse.emf.ecore.EObject, org.eclipse.sirius.business.api.session.Session)
	*/
	@Override
	protected void linkPressed(HyperlinkEvent event, EObject project_p, Session session) {
		ComponentSampleViewpointServices.SERVICE.stopUse(Constants.ID);
	}
}
