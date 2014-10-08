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
package org.polarsys.kitalpha.cadence.core.api;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.cadence.core.Activator;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.cadence.core.internal.CadenceExtensions;

/**
 * This class allows to launch workflow.
 * 
 * @author Guillaume Gebhart
 * 
 */
public final class CadenceLauncher {

  private static Map<String, ParameterError<?>> wrongParams = null;

  public static IStatus cadence(final String workflow_id, final String workflowElement_id, final WorkflowActivityParameter workflowActivityParameters)
      throws Exception {
    return cadence(workflow_id, workflowElement_id, workflowActivityParameters, null);

  }

  public static IStatus cadence(final String workflow_id, final String workflowElement_id, final WorkflowActivityParameter workflowActivityParameters,
      final IProgressMonitor monitor_p) throws Exception {

    MultiStatus result = new MultiStatus(Activator.PLUGIN_ID, 0, "Cadence activities", null);

    final Set<String> activitiesID;
    final int candidateSize;
    final boolean isMultiple = CadenceExtensions.isMultiple(workflow_id, workflowElement_id);
    
    
    if (workflowActivityParameters != null) {
      activitiesID = workflowActivityParameters.getActivitiesID();
      candidateSize = workflowActivityParameters.getActivitiesID().size();
    } else {
      activitiesID = Collections.<String> emptySet();
      candidateSize = 0;
    }

    if (monitor_p != null) {
      IConfigurationElement workflow = CadenceExtensions.getWorkflow(workflow_id); // get worlkflow element
      IConfigurationElement workflowElement = CadenceExtensions.getWorkflowElement(workflow_id, workflowElement_id); // get worlkflow element

      String workflowName = workflow.getAttribute(CadenceExtensions.ATT_NAME);
      String workflowElementName = workflowElement.getAttribute(CadenceExtensions.ATT_NAME);

      monitor_p.beginTask("Cadence " + workflowName + " : " + workflowElementName, candidateSize); //$NON-NLS-1$ //$NON-NLS-2$
    }

    if ((candidateSize <= 1) || ((candidateSize > 1) && isMultiple)) {

      for (String activityID : activitiesID) {
        ActivityParameters activityParameters = workflowActivityParameters.getActivityParameters(activityID);
        IStatus status = cadence(workflow_id, workflowElement_id, activityID, activityParameters, monitor_p);
        if (status == null) {
          Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Activity : "+activityID+" has returned a null status."));
        } else
          result.add(status);
        if (monitor_p != null) {
          monitor_p.worked(1);
        }
      }
    } else {
      throw new Exception("the workflowElement " + workflowElement_id + " is not multiple."); //$NON-NLS-1$ //$NON-NLS-2$
    }

    if (monitor_p != null) {
      monitor_p.subTask(""); //$NON-NLS-1$
    }
    return result;
  }

  public static IStatus cadence(final String workflow_id, final String workflowElement_id, final String activityElement_id,
      final ActivityParameters activityParameters) {

    return cadence(workflow_id, workflowElement_id, activityElement_id, activityParameters, null);
  }

  public static IStatus cadence(final String workflow_id, final String workflowElement_id, final String activityElement_id,
      final ActivityParameters activityParameters, IProgressMonitor monitor_p) {

    IConfigurationElement workflowElement = CadenceExtensions.getWorkflowElement(workflow_id, workflowElement_id); // get worlkflow element
    IConfigurationElement activityElement = CadenceExtensions.getActivityConfigElement(activityElement_id);// get activity candidate

    if (monitor_p != null) {
      String activityName = activityElement.getAttribute(CadenceExtensions.ATT_NAME);
      monitor_p.subTask(activityName);
    }

    IStatus status = cadence(workflowElement, activityElement, activityParameters); // if is good candidate run it

    return status;
  }

  private static IStatus cadence(final IConfigurationElement workflowElement, final IConfigurationElement activityElement,
      final ActivityParameters activityParameters) {

    IActivity activity;
    IStatus status = null;
    try {

      activity = (IActivity) activityElement.createExecutableExtension(CadenceExtensions.ATT_ACTIVITY_CLASS);

      if (activityParameters != null && matchParameters(workflowElement, activityParameters)) { // 
        wrongParams = activity.validateParameters(activityParameters);
        if (wrongParams == null || wrongParams.isEmpty()) {
          status = activity.run(activityParameters);
          // output status
          if ((status != null) && (!status.isOK())) {
            ILog log = Activator.getDefault().getLog();
            log.log(status);
          }
        } else {

          throw new Exception("activity's parameters are not valid. " + CadenceValidator.getParameterErrorsTrace(wrongParams)); //$NON-NLS-1$
        }
      }

    } catch (Exception e) {
      ILog log = Activator.getDefault().getLog();
      StringBuilder message = new StringBuilder();
      message.append("Exception during activity execution (activity : ").append(activityElement.getAttribute(CadenceExtensions.ATT_NAME)); //$NON-NLS-1$
      message.append(", worflow element : ").append(workflowElement.getAttribute(CadenceExtensions.ATT_NAME)); //$NON-NLS-1$
      message.append(")"); //$NON-NLS-1$
      Status builtStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message.toString(), e);
	  log.log(builtStatus);
	  return status;
    }

    return status;
  }

  private static boolean matchParameters(IConfigurationElement workflowElement, ActivityParameters activityParameters) throws Exception {

    if (activityParameters != null) {
      IConfigurationElement[] params = CadenceExtensions.getWorkflowElementParameters(workflowElement);
      if (activityParameters.getParameters().size() < params.length)
        throw new Exception("activity doesn't define parameters enough"); //$NON-NLS-1$
      for (IConfigurationElement p : params) {
        String name = p.getAttribute(CadenceExtensions.ATT_NAME);
        if (!activityParameters.getParametersID().contains(name))
          throw new Exception("The org.polarsys.kitalpha.cadence.core.api.parameter " + name + " doesn't exist."); //$NON-NLS-1$ //$NON-NLS-2$
      }
    }

    return true;
  }

}
