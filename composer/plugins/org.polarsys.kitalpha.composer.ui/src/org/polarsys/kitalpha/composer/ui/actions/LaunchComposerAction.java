/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import org.polarsys.kitalpha.composer.ui.Activator;

/**
 * Action that launch the given composer launch configuration.
 * 
 
 */
public class LaunchComposerAction extends Action {

	/** The launch configuration to run. */
	private ILaunchConfiguration launchConfiguration;

	/**
	 * Creates the action.
	 * 
	 * @param launchConfiguration
	 *            the configuration to run.
	 */
	public LaunchComposerAction(ILaunchConfiguration launchConfiguration) {
		super(launchConfiguration.getName());
		this.launchConfiguration = launchConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		super.run();
		runInUI();
	}

	private void runInUI() {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		ProgressMonitorDialog pmd = new ProgressMonitorDialog(shell);

		try {
			// fork, not cancelable.
			pmd.run(true, false, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					try {
						launchConfiguration.launch(ILaunchManager.RUN_MODE,
								monitor);
					} catch (CoreException e) {
						Activator.getDefault().getLog().log(e.getStatus());
						throw new InvocationTargetException(e);
					}
				}
			});
		} catch (InvocationTargetException e) {
			Activator.getDefault().error("Error while generating code",
					e.getTargetException());
		} catch (InterruptedException e) {
			// operation canceled.
		}
	}
}
