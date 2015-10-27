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

package org.polarsys.kitalpha.vp.componentsampleperformance.activity.explorer.activity;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.activity.AbstractComponentsampleHyperLink;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants.IComponentSampleConstants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class StartComponentSamplePerformanceViewpointActivity extends AbstractComponentsampleHyperLink {

	/**
	* Default constructor
	*/
	public StartComponentSamplePerformanceViewpointActivity() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	 * Constructor with parameters
	 * @param root the root model element ({@link EObject})
	 * @param session the associated {@link Session} with the activity explorer
	 */
	public StartComponentSamplePerformanceViewpointActivity(EObject root) {
		super(root);
	}

	@Override
	protected void linkPressed(HyperlinkEvent event, EObject project_p, Session session) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openInformation(shell, "Activity Explorer - StartComponentSamplePerformanceViewpoint",
				"Default implementation for StartComponentSamplePerformanceViewpoint.\n org.polarsys.kitalpha.vp.componentsampleperformance.activity.explorer.activity.StartComponentSamplePerformanceViewpointActivity.java");
	}

	@Override
	public void linkActivated(HyperlinkEvent e) {
		_linkActivated(e, IComponentSampleConstants.COMPONENTSAMPLE_PERFORMANCE);
	}
}