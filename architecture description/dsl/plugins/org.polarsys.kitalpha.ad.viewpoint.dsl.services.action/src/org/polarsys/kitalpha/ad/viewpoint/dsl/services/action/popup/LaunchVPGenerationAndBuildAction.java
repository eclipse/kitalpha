/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.popup;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.InvokeActivityHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint.ViewpointGenerationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.manager.GeneratorLuncherManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class LaunchVPGenerationAndBuildAction extends BaseSelectionListenerAction 
		implements IObjectActionDelegate {

	private static final String GENERATE_AND_BUILD_VP_ACTION = 
							"org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.GenerateAndBuild"; //$NON-NLS-1$
	private static final String GENERATE_WITH_SELECTION_VP_ACTION = 
							"org.polarsys.kitalpha.ad.viewpoint.dsl.services.action.GenerateWithSelection"; //$NON-NLS-1$
	
	private IStructuredSelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public LaunchVPGenerationAndBuildAction() {
		super(Messages.Action_Launch);
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	private boolean fireBuild(String actionID){
		return actionID.equals(GENERATE_AND_BUILD_VP_ACTION);
	}
	
	private boolean fireSelection(String actionID){
		return actionID.equals(GENERATE_WITH_SELECTION_VP_ACTION);
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		URI modelURI = ActionsUtils.getDomainURI(this.selection);
		
		String projectName = ActionsUtils.getRootProjectName(modelURI);
		Activity vpGeneratorLauncher = InvokeActivityHelper.getActivity(
				GeneratorLuncherManager.INSTANCE.getLuncherURI("Default")); //$NON-NLS-1$
		new ViewpointGenerationHelper().execute(vpGeneratorLauncher, 
											projectName, 
											modelURI, 
											fireBuild(action.getId()), 
											fireSelection(action.getId()), 
											new NullProgressMonitor());
	}
}
