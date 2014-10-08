/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api;

import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;

import org.polarsys.kitalpha.cadence.core.api.CadenceLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.cadence.ui.Activator;
import org.polarsys.kitalpha.cadence.ui.internal.CadenceHelper;

/**
 * Allows to launch a Cadence execution from the UI or to get the Map of activities.
 * @author Guillaume Gebhart 
 */
public class CadenceUiRegistry {

  /**
   * 
   * @param configuration : current launch configuration
   * @param workflow_id : id of the workflow
   * @param workflowElement_id : id of the workflow element
   * @param params : Map of workflow Parameters
   */
  public static void launch(ILaunchConfiguration configuration, String workflow_id, String workflowElement_id, Map<String, GenericParameter<?>> params) {
    launch(configuration, workflow_id, workflowElement_id, params, null);
  }

  /**
   * 
   * @param configuration : current launch configuration
   * @param workflow_id : id of the workflow
   * @param workflowElement_id : id of the workflow element
   * @param params : Map of workflow Parameters
   */
  public static void launch(ILaunchConfiguration configuration, String workflow_id, String workflowElement_id, Map<String, GenericParameter<?>> params,
      IProgressMonitor monitor_p) {
    try {
      // Extract activities and optional parameters from launch configuration
      final WorkflowActivityParameter workflowParameters = getActivities(configuration, workflow_id, workflowElement_id);
      // Add business parameters to the map
      for (String activityID : workflowParameters.getActivitiesID()) { // key == activities_id
        ActivityParameters activityparameters = workflowParameters.getActivityParameters(activityID);
        for (String parameterID : params.keySet()) {
          activityparameters.addParameter(params.get(parameterID));
        }
      }
      CadenceLauncher.cadence(workflow_id, workflowElement_id, workflowParameters, monitor_p);
    } catch (Exception e) {
      ILog log = Activator.getDefault().getLog();
      log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
    }
  }

  /**
   * 
   * @param configuration : current launch configuration
   * @param workflow_id : id of the workflow
   * @param workflowElement_id : id of the workflow element
   * @param params : Map of workflow Parameters
   * @return the Map of the activities and their parameters for the workflow element specified
   * 
   */
  public static WorkflowActivityParameter getActivities(ILaunchConfiguration configuration, String workflow_id, String workflowElement_id) {
    final WorkflowActivityParameter res = CadenceHelper.getActivitiesFromLauchConfiguration(configuration, workflowElement_id);
    return res;
  }
}
