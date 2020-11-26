/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.ui.internal.configuration;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import org.polarsys.kitalpha.cadence.ui.api.CadenceTab;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.ui.internal.tabs.TransposerMainTab;

/**
 * 
 * @author GEBHART Guillaume
 *
 */
public class TransposerTabGroup extends AbstractLaunchConfigurationTabGroup {

  @Override
public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
    ILaunchConfigurationTab[] tabs;

    tabs = new ILaunchConfigurationTab[] { new TransposerMainTab(), new CadenceTab(ITransposerWorkflow.TRANSPOSER_WORKFLOW), new CommonTab()};
    this.setTabs(tabs);
  }

}
