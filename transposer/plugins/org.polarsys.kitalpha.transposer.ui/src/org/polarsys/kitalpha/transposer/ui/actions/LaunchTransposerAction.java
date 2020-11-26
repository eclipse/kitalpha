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

/**
 * 
 */
package org.polarsys.kitalpha.transposer.ui.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.action.Action;

import org.polarsys.kitalpha.transposer.ui.TransposerUiPlugin;

/**
 * @author GEBHART Guillaume
 * 
 */
public class LaunchTransposerAction extends Action {

  private ILaunchConfiguration launchConfiguration;

  public LaunchTransposerAction(ILaunchConfiguration launchConfiguration_p) {
    super(launchConfiguration_p.getName());
    this.launchConfiguration = launchConfiguration_p;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jface.action.Action#run()
   */
  @Override
  public void run() {
    super.run();

    try {
      launchConfiguration.launch(ILaunchManager.RUN_MODE, new NullProgressMonitor());
    } catch (CoreException e) {
      TransposerUiPlugin.getDefault().getLog().log(e.getStatus());
    }
  }
}
