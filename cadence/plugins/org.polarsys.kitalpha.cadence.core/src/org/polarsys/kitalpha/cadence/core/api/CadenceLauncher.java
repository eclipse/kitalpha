/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

  public static IStatus cadence(final String workflowId, final String workflowElementId, final WorkflowActivityParameter workflowActivityParameters)
      throws Exception {
    return cadence(workflowId, workflowElementId, workflowActivityParameters, null);

  }

  public static IStatus cadence(final String workflowId, final String workflowElementId, final WorkflowActivityParameter workflowActivityParameters,
      final IProgressMonitor monitor) throws Exception {

    MultiStatus result = new MultiStatus(Activator.PLUGIN_ID, 0, "Cadence activities", null);

    final Set<String> activitiesID;
    final int candidateSize;
    final boolean isMultiple = CadenceExtensions.isMultiple(workflowId, workflowElementId);
    
    
    if (workflowActivityParameters != null) {
      activitiesID = workflowActivityParameters.getActivitiesID();
      candidateSize = workflowActivityParameters.getActivitiesID().size();
    } else {
      activitiesID = Collections.<String> emptySet();
      candidateSize = 0;
    }

    if (monitor != null) {
      IConfigurationElement workflow = CadenceExtensions.getWorkflow(workflowId); // get worlkflow element
      IConfigurationElement workflowElement = CadenceExtensions.getWorkflowElement(workflowId, workflowElementId); // get worlkflow element

      String workflowName = workflow.getAttribute(CadenceExtensions.ATT_NAME);
      String workflowElementName = workflowElement.getAttribute(CadenceExtensions.ATT_NAME);

      monitor.beginTask("Cadence " + workflowName + " : " + workflowElementName, candidateSize); //$NON-NLS-1$ //$NON-NLS-2$
    }

    if ((candidateSize <= 1) || ((candidateSize > 1) && isMultiple)) {

      for (String activityID : activitiesID) {
        ActivityParameters activityParameters = workflowActivityParameters.getActivityParameters(activityID);
        IStatus status = cadence(workflowId, workflowElementId, activityID, activityParameters, monitor);
        if (status == null) {
          Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Activity : "+activityID+" has returned a null status."));
        } else {
			result.add(status);
		}
        if (monitor != null) {
          monitor.worked(1);
        }
      }
    } else {
      throw new Exception("the workflowElement " + workflowElementId + " is not multiple."); //$NON-NLS-1$ //$NON-NLS-2$
    }

    if (monitor != null) {
      monitor.subTask(""); //$NON-NLS-1$
    }
    return result;
  }

  public static IStatus cadence(final String workflowId, final String workflowElementId, final String activityElementId,
      final ActivityParameters activityParameters) {

    return cadence(workflowId, workflowElementId, activityElementId, activityParameters, null);
  }

  public static IStatus cadence(final String workflowId, final String workflowElementId, final String activityElementId,
      final ActivityParameters activityParameters, IProgressMonitor monitor) {

    IConfigurationElement workflowElement = CadenceExtensions.getWorkflowElement(workflowId, workflowElementId); // get worlkflow element
    IConfigurationElement activityElement = CadenceExtensions.getActivityConfigElement(activityElementId);// get activity candidate

    if (monitor != null) {
      String activityName = activityElement.getAttribute(CadenceExtensions.ATT_NAME);
      monitor.subTask(activityName);
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
	 {
		throw new Exception("activity doesn't define parameters enough"); //$NON-NLS-1$
	}
      for (IConfigurationElement p : params) {
        String name = p.getAttribute(CadenceExtensions.ATT_NAME);
        if (!activityParameters.getParametersID().contains(name))
		 {
			throw new Exception("The org.polarsys.kitalpha.cadence.core.api.parameter " + name + " doesn't exist."); //$NON-NLS-1$ //$NON-NLS-2$
		}
      }
    }

    return true;
  }

}
