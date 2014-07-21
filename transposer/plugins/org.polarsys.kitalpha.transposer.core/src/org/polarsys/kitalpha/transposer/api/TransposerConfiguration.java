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


package org.polarsys.kitalpha.transposer.api;

import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;

/**
 * Defines Cadence activities used for each Transposer Workflow Element.
 * @author Guillaume Gebhart
 * 
 */
public class TransposerConfiguration {

  WorkflowActivityParameter _preAnalysisActivities = null;
  WorkflowActivityParameter _preSchedulingActivities = null;
  WorkflowActivityParameter _preExecutionActivities = null;
  WorkflowActivityParameter _postExecutionActivities = null;
/**
 * Sets a new WorkflowActivityParameter for the PreAnalysis workflow element.
 * @param preAnalysisActivities_p a new WorkFlowActivityParameter
 */
  public void setPreAnalysisActivities(WorkflowActivityParameter preAnalysisActivities_p) {
    this._preAnalysisActivities = preAnalysisActivities_p;
  }
  /**
   * Returns the WorkflowActivityParameter defined for the PreAnalysis workflow element.
   * @return WorkflowActivityParameter
   */
  public WorkflowActivityParameter getPreAnalysisActivities() {
    return this._preAnalysisActivities;
  }
/**
 * Sets a new WorkflowActivityParameter for the PreScheduling workflow element.
 * @param preSchedulingActivities_p a new WorkFlowActivityParameter
 */
  public void setPreSchedulingActivities(WorkflowActivityParameter preSchedulingActivities_p) {
    this._preSchedulingActivities = preSchedulingActivities_p;
  }
  /**
   * Returns the WorkflowActivityParameter defined for the PreScheduling workflow element.
   * @return WorkflowActivityParameter
   */
  public WorkflowActivityParameter getPreSchedulingActivities() {
    return this._preSchedulingActivities;
  }
/**
 * Sets a new WorkflowActivityParameter for the PreExecution workflow element.
 * @param preExecutionActivities_p a new WorkFlowActivityParameter
 */
  public void setPreExecutionActivities(WorkflowActivityParameter preExecutionActivities_p) {
    this._preExecutionActivities = preExecutionActivities_p;
  }
  /**
   * Returns the WorkflowActivityParameter defined for the PreExecution workflow element.
   * @return WorkflowActivityParameter
   */
  public WorkflowActivityParameter getPreExecutionActivities() {
    return this._preExecutionActivities;
  }
/**
 * Sets a new WorkflowActivityParameter for the PostExecution workflow element.
 * @param postExecutionActivities_p a new WorkFlowActivityParameter
 */
  public void setPostExecutionActivities(WorkflowActivityParameter postExecutionActivities_p) {
    this._postExecutionActivities = postExecutionActivities_p;
  }
/**
 * Returns the WorkflowActivityParameter defined for the PostExecution workflow element.
 * @return WorkflowActivityParameter
 */
  public WorkflowActivityParameter getPostExecutionActivities() {
    return this._postExecutionActivities;
  }

}
