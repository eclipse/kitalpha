/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
   * @param workflowid : id of the workflow
   * @param workflowElementid : id of the workflow element
   * @param params : Map of workflow Parameters
   */
  public static void launch(ILaunchConfiguration configuration, String workflowid, String workflowElementid, Map<String, GenericParameter<?>> params) {
    launch(configuration, workflowid, workflowElementid, params, null);
  }

  /**
   * 
   * @param configuration : current launch configuration
   * @param workflowid : id of the workflow
   * @param workflowElementid : id of the workflow element
   * @param params : Map of workflow Parameters
   */
  public static void launch(ILaunchConfiguration configuration, String workflowid, String workflowElementid, Map<String, GenericParameter<?>> params,
      IProgressMonitor monitor) {
    try {
      // Extract activities and optional parameters from launch configuration
      final WorkflowActivityParameter workflowParameters = getActivities(configuration, workflowid, workflowElementid);
      // Add business parameters to the map
      for (String activityID : workflowParameters.getActivitiesID()) { // key == activities_id
        ActivityParameters activityparameters = workflowParameters.getActivityParameters(activityID);
        Set<Entry<String, GenericParameter<?>>> entrySet = params.entrySet();
        for (Entry<String, GenericParameter<?>> entry : entrySet) {
			activityparameters.addParameter(entry.getValue());
		}
      }
      CadenceLauncher.cadence(workflowid, workflowElementid, workflowParameters, monitor);
    } catch (Exception e) {
      ILog log = Activator.getDefault().getLog();
      log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
    }
  }

  /**
   * 
   * @param configuration : current launch configuration
   * @param workflowid : id of the workflow
   * @param workflowElementid : id of the workflow element
   * @param params : Map of workflow Parameters
   * @return the Map of the activities and their parameters for the workflow element specified
   * 
   */
  public static WorkflowActivityParameter getActivities(ILaunchConfiguration configuration, String workflowid, String workflowElementid) {
    final WorkflowActivityParameter res = CadenceHelper.getActivitiesFromLauchConfiguration(configuration, workflowElementid);
    return res;
  }
}
