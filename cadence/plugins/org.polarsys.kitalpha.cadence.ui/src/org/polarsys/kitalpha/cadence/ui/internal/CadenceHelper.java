/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.cadence.ui.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.cadence.ui.api.launch.ICadenceLaunchConfigurationConstants;

/**
 * @author Guillaume Gebhart
 * 
 */
public class CadenceHelper {

  private static Map<String, Map<String, String>> parseActivity(String activities) {
    Map<String, Map<String, String>> result = new LinkedHashMap<String, Map<String, String>>();

    if (!activities.equals("")) { //$NON-NLS-1$

      String activity = ""; //$NON-NLS-1$
      String[] paramTab = activities.split(Pattern.quote(";")); //$NON-NLS-1$
      for (String string_p : paramTab) {
        String[] tab = string_p.split(Pattern.quote(":"),2); //$NON-NLS-1$
        Map<String, String> map = new HashMap<String, String>();
        activity = tab[0];
        if (tab.length > 1) {
          for (String k : (tab[1]).split(Pattern.quote(","))) { //$NON-NLS-1$
            String[] t = k.split(Pattern.quote("=")); //$NON-NLS-1$
            String key = t[0]; 
            String value = ""; //$NON-NLS-1$
            if (t.length == 2)
              value = t[1];
            map.put(key, value);
          }
        }

        result.put(activity, map);
      }
    }
    return result;
  }

  public static WorkflowActivityParameter getActivitiesFromLauchConfiguration(ILaunchConfiguration configuration, String workflowElt_id) {

    final WorkflowActivityParameter result = new WorkflowActivityParameter();
    Map<String, String> activityMap;
    try {
      activityMap = configuration.getAttribute(ICadenceLaunchConfigurationConstants.PARAMETERS_ACTIVITIES, new HashMap<String, String>());

      if (!activityMap.isEmpty()) {
        String activities = activityMap.get(workflowElt_id);
        Map<String, Map<String, String>> map = parseActivity(activities);

        for (String activityID : map.keySet()) {
          Map<String, String> params = map.get(activityID);
          ActivityParameters paramsMap = constructMapFromString(params, activityID);
          if (paramsMap != null && paramsMap.getParametersID() != null && !paramsMap.getParametersID().isEmpty()) {
            for (String parameterID : paramsMap.getParametersID()) {
              result.addParameter(activityID, paramsMap.getParameter(parameterID));
            }
          } else {
            result.addActivity(activityID);
          }

        }
      }
    } catch (CoreException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return result;
  }

  public static ActivityParameters constructMapFromString(final Map<String, String> map, String id) {
    ActivityParameters result = null;
    IActivity activity = CadenceRegistry.getIActivityClassFromId(id);
    if (activity != null)
      result = constructMapFromString(map, activity);

    return result;
  }

  public static ActivityParameters constructMapFromString(final Map<String, String> map, final IActivity activity) {

    Collection<DeclaredParameter> params = activity.getParameters();

    ActivityParameters uiParam = new ActivityParameters();

    if (params != null && !params.isEmpty()) {
      for (DeclaredParameter parameter : params) {
        String stringValue = map.get(parameter.getName());
        parameter.setValue(stringValue);
        uiParam.addParameter(parameter);

      }
    }

    return uiParam;
  }

}
