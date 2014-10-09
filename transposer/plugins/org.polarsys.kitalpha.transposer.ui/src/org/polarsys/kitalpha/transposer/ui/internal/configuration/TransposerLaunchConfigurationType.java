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


package org.polarsys.kitalpha.transposer.ui.internal.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import org.polarsys.kitalpha.cadence.ui.api.CadenceUiRegistry;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.ui.TransposerUiPlugin;
import org.polarsys.kitalpha.transposer.ui.launch.TransposerUiLauncher;

/**
 * 
 * @author GEBHART Guillaume
 *
 */
public class TransposerLaunchConfigurationType implements ILaunchConfigurationDelegate, ITransposerWorkflow {

  protected ISelection _selection = null;

  public void launch(ILaunchConfiguration configuration_p, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {

    try {

      final String purpose = configuration_p.getAttribute(ITransposerLaunchConfigurationConstants.PURPOSE_NAME, ""); //$NON-NLS-1$
      final String mappingId = configuration_p.getAttribute(ITransposerLaunchConfigurationConstants.MAPPING_ID, ""); //$NON-NLS-1$

      // get selections
      Display.getDefault().syncExec(new Runnable() {

        public void run() {
          _selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
        }

      });

      // extract activities from launch configuration
      final TransposerConfiguration configuration = new TransposerConfiguration();
      configuration.setPreAnalysisActivities(CadenceUiRegistry.getActivities(configuration_p, TRANSPOSER_WORKFLOW, PRE_ANALYSIS));
      configuration.setPreSchedulingActivities(CadenceUiRegistry.getActivities(configuration_p, TRANSPOSER_WORKFLOW, PRE_SCHEDULING));
      configuration.setPreExecutionActivities(CadenceUiRegistry.getActivities(configuration_p, TRANSPOSER_WORKFLOW, PRE_EXECUTION));
      configuration.setPostExecutionActivities(CadenceUiRegistry.getActivities(configuration_p, TRANSPOSER_WORKFLOW, POST_EXECUTION));

      if (_selection instanceof IStructuredSelection) {
        final IStructuredSelection iss = (IStructuredSelection) _selection;
        List<?> listSelection = iss.toList();
        if (!listSelection.isEmpty()) {
          for(Object obj :listSelection){
        	  if(obj instanceof IResource){
        		  TransposerUiLauncher.launchInJob(obj, purpose, mappingId, configuration);
        	  }else{
        		  TransposerUiLauncher.launchInJob(new ArrayList<Object>(listSelection), purpose, mappingId, configuration);
        		  break;
        	  }
          }
        	 
        }
      }
    } catch (Exception e) {
      ILog log = TransposerUiPlugin.getDefault().getLog();
      log.log(new Status(Status.ERROR, TransposerUiPlugin.PLUGIN_ID, e.getMessage()));

    }
  }
}
