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


package org.polarsys.kitalpha.transposer.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;

import org.polarsys.kitalpha.cadence.core.api.CadenceLauncher;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.analyzer.api.IAnalyzer;
import org.polarsys.kitalpha.transposer.analyzer.generic.GenericAnalyzer;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.api.ITransposer;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.rules.handler.RuleHandlerPlugin;
import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.business.GenericRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes.NonExistingPurposeException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.scheduler.api.IScheduler;
import org.polarsys.kitalpha.transposer.scheduler.api.ITransposerTask;
import org.polarsys.kitalpha.transposer.scheduler.generic.GenericScheduler;

/**
 * @author Guillaume Gebhart
 * 
 */
public class GenericTransposer implements ITransposer, ITransposerWorkflow {

  protected IRulesHandler _rulesHandler;
  protected IAnalyzer _analyzer;
  protected IScheduler _scheduler;
  protected IContext _context;
  protected ActivityParameters _cadenceParameters = new ActivityParameters();

  /**
   * 
   */
  public GenericTransposer(String purpose_p, String mappingId_p) {
    setUp(purpose_p, mappingId_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#getAnalyzer()
   */
  public IAnalyzer getAnalyzer() {
    return _analyzer;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#getRulesHandler()
   */
  public IRulesHandler getRulesHandler() {
    return _rulesHandler;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#getScheduler()
   */
  public IScheduler getScheduler() {
    return _scheduler;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#transpose(java.util.Collection)
   */
  public void transpose(Collection<Object> selection_p, IProgressMonitor monitor_p) {
	    transpose(selection_p, null,null, monitor_p);
	  }
  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#transpose(java.util.Collection)
   */
  public void transpose(Collection<Object> selection_p, Comparator<Vertex<?>> comparator_p, IProgressMonitor monitor_p) {
	    transpose(selection_p, null,comparator_p, monitor_p);
	  }
  
  
  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#transpose(java.util.Collection)
   */
  public void transpose(Collection<Object> selection_p, TransposerConfiguration configuration_p, Comparator<Vertex<?>> comparator_p,IProgressMonitor monitor_p) {
    try {
      Collection<Object> analysisSources = new ArrayList<Object>();

      checkCancel(monitor_p);

      callPreAnalysisActivities(selection_p, analysisSources, configuration_p, monitor_p);

      checkCancel(monitor_p);

      // Default sources : selection, cleaned by the domain helper.
      if (analysisSources == null || analysisSources.isEmpty()) {
        Collection<Object> sources = _rulesHandler.getDomainHelper().getAnalysisSources(selection_p);
        if (sources != null && !sources.isEmpty())
          analysisSources.addAll(sources);
      }

      // Create graph
      Graph graph = getAnalyzer().analyze(analysisSources, selection_p, monitor_p);

      checkCancel(monitor_p);

      callPreSchedulingActivities(graph, configuration_p, monitor_p);

      checkCancel(monitor_p);

      // Create a sorted list of task from the graph
      getScheduler().setModel(graph);
      getScheduler().schedule(comparator_p, monitor_p);

      List<ITransposerTask<Vertex<?>>> scheduledTasks = getScheduler().getScheduleResult();

      checkCancel(monitor_p);

      callPreExecutionActivities(scheduledTasks, configuration_p, monitor_p);

      checkCancel(monitor_p);

      // Execute computed tasks
      // getRulesHandler().setDefaultContext(defaultContext_p)

      if (monitor_p != null) {
        monitor_p.beginTask("Transposer Tasks Execution", scheduledTasks.size()); //$NON-NLS-1$
      }

      for (ITransposerTask<Vertex<?>> scheduledTask : scheduledTasks) {
        Vertex<?> v = scheduledTask.getTaskContent();
        try {
          getRulesHandler().apply(v.getContent(), scheduledTask.isCompletelyTransposable(), monitor_p);
          checkCancel(monitor_p);
        } catch (RuleExecutionException e) {
          TransposerCorePlugin.getDefault().logError(TransposerCorePlugin.PLUGIN_ID,
                                                     RuleExecutionException.class.getSimpleName() + " on " + e.getMessage(), e.getCause()); //$NON-NLS-1$
        }

        if (monitor_p != null) {
          monitor_p.worked(1);
        }
      }

      checkCancel(monitor_p);

      callPostExecutionActivities(configuration_p, monitor_p);

      checkCancel(monitor_p);
      
      if (monitor_p != null)
        monitor_p.done();

    } catch (OperationCanceledException e) {
      TransposerCorePlugin.getDefault().logInfo(TransposerCorePlugin.PLUGIN_ID, "Transposer execution canceled.", e); //$NON-NLS-1$
    } catch (Exception e) {
      TransposerCorePlugin.getDefault().logError(TransposerCorePlugin.PLUGIN_ID, "Error happens during Transposer execution.", e); //$NON-NLS-1$
    }
  }

  /**
   * @param monitor_p
   */
  private void checkCancel(IProgressMonitor monitor_p) throws OperationCanceledException {
    if (monitor_p.isCanceled())
      throw new OperationCanceledException();

  }

  /**
   * @param selection_p_p
   * @param analysisSources_p
   */
  private void callPreAnalysisActivities(Collection<Object> selection_p, Collection<Object> analysisSources_p, TransposerConfiguration configuration_p,
      IProgressMonitor monitor_p) {
    if (configuration_p == null)
      return;
    
    
    _cadenceParameters.addParameter(new GenericParameter<Collection<Object>>(TRANSPOSER_INITIAL_SELECTION, selection_p,
                                                                            "List of selected elements before Transposer's launch")); //$NON-NLS-1$
    _cadenceParameters.addParameter(new GenericParameter<Collection<Object>>(TRANSPOSER_SELECTION, selection_p,
                                                                             "List of selected elements before Transposer's launch")); //$NON-NLS-1$
    _cadenceParameters.addParameter(new GenericParameter<Collection<Object>>(TRANSPOSER_ANALYSIS_SOURCES, analysisSources_p,
                                                                             "List to store object required to start the analysis")); //$NON-NLS-1$
    _cadenceParameters.addParameter(new GenericParameter<IContext>(TRANSPOSER_CONTEXT, _context, "Context used during rules execution")); //$NON-NLS-1$

    _cadenceParameters.addParameter(new GenericParameter<IDomainHelper>(TRANSPOSER_DOMAIN_HELPER, _rulesHandler.getDomainHelper(),
                                                                        "Domain Helper used by Transposer")); //$NON-NLS-1$

    _cadenceParameters.addParameter(new GenericParameter<IProgressMonitor>(TRANSPOSER_PROGRESS_MONITOR, monitor_p, "Current Progress Monitor")); //$NON-NLS-1$
    
    complementActivitiesParameters(configuration_p.getPreAnalysisActivities());
    IStatus cadenceStatus = null;
    try {
    	 cadenceStatus = CadenceLauncher.cadence(TRANSPOSER_WORKFLOW, PRE_ANALYSIS, configuration_p.getPreAnalysisActivities(), monitor_p);
    	 
    } catch (Exception e) {
    	MultiStatus status = new MultiStatus(RuleHandlerPlugin.PLUGIN_ID, IStatus.ERROR, "Error happens in Transposer during Cadence call for pre-analysis activities execution.", e);//$NON-NLS-1$
    	status.add(cadenceStatus);
    	RuleHandlerPlugin.getDefault().getLog().log(status); 
    }
  }

  /**
   * @param preAnalysisActivities_p
   */
  private void complementActivitiesParameters(WorkflowActivityParameter activities_p) {
    if (activities_p == null)
      return;

    // Add business parameters to the map
    for (String key : activities_p.getActivitiesID()) { // key == activities_id
      if (_cadenceParameters != null && !_cadenceParameters.getParameters().isEmpty()) {
        for (GenericParameter<?> p : _cadenceParameters.getParameters())
          activities_p.addParameter(key, p);
      }
    }

  }

  /**
   * @param selection_p
   * @param analysisSources_p
   * @param graph_p
   * @param configuration_p
   */
  private void callPreSchedulingActivities(Graph graph_p, TransposerConfiguration configuration_p, IProgressMonitor monitor_p) {
    if (configuration_p == null)
      return;
    _cadenceParameters.addParameter(new GenericParameter<Graph>(TRANSPOSER_ANALYSIS_GRAPH, graph_p, "Computed analysis graph")); //$NON-NLS-1$

    complementActivitiesParameters(configuration_p.getPreSchedulingActivities());
    IStatus cadenceStatus = null;
    try {
    	cadenceStatus = CadenceLauncher.cadence(TRANSPOSER_WORKFLOW, PRE_SCHEDULING, configuration_p.getPreSchedulingActivities(), monitor_p);
    } catch (Exception e) {
    	MultiStatus status = new MultiStatus(RuleHandlerPlugin.PLUGIN_ID, IStatus.ERROR, "Error happens in Transposer during Cadence call for pre-scheduling activities execution.", e);//$NON-NLS-1$
    	status.add(cadenceStatus);
      RuleHandlerPlugin.getDefault().getLog().log( status); 
    }

  }

  /**
   * 
   * @param sortedTasks_p
   * @param configuration_p
   */
  private void callPreExecutionActivities(Collection<ITransposerTask<Vertex<?>>> sortedTasks_p, TransposerConfiguration configuration_p,
      IProgressMonitor monitor_p) {
	  
	  
    if (configuration_p == null)
      return;

    _cadenceParameters.addParameter(new GenericParameter<Collection<ITransposerTask<Vertex<?>>>>(TRANSPOSER_SORTED_TASKS, sortedTasks_p,
                                                                                                 "Computed and sorted tasks list")); //$NON-NLS-1$
    _cadenceParameters.addParameter(new GenericParameter<Set<?>>(TRANSPOSER_TRANSPOSABLE_OBJECTS, getElements(sortedTasks_p), "Transposable elements")); //$NON-NLS-1$
   

    complementActivitiesParameters(configuration_p.getPreExecutionActivities());
    IStatus cadenceStatus = null;
    try {
    	cadenceStatus = CadenceLauncher.cadence(TRANSPOSER_WORKFLOW, PRE_EXECUTION, configuration_p.getPreExecutionActivities(), monitor_p);
      
    } catch (Exception e) {
    	MultiStatus status = new MultiStatus(RuleHandlerPlugin.PLUGIN_ID, IStatus.ERROR, "Error happens in Transposer during Cadence call for pre-execution activities execution.", e);//$NON-NLS-1$
    	status.add(cadenceStatus);
      RuleHandlerPlugin.getDefault().getLog().log(status); 
    }
  }

  /**
   * @param selection_p
   * @param analysisSources_p
   * @param graph_p
   * @param configuration_p
   */
  private void callPostExecutionActivities(TransposerConfiguration configuration_p, IProgressMonitor monitor_p) {
    if (configuration_p == null)
      return;

    complementActivitiesParameters(configuration_p.getPostExecutionActivities());
    IStatus cadenceStatus = null;
    try {
    	cadenceStatus = CadenceLauncher.cadence(TRANSPOSER_WORKFLOW, POST_EXECUTION, configuration_p.getPostExecutionActivities(), monitor_p);
    } catch (Exception e) {
    	MultiStatus status = new MultiStatus(RuleHandlerPlugin.PLUGIN_ID, IStatus.ERROR, "Error happens in Transposer during Cadence call for post-execution activities execution.", e);//$NON-NLS-1$
    	status.add(cadenceStatus);
    	RuleHandlerPlugin.getDefault().getLog().log(status); 
    }
  }

  /**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#initAnalyzer()
   */
  public void initAnalyzer() {
    _analyzer = new GenericAnalyzer(_rulesHandler);

  }

  /**
   * @param mappingId_p_p
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#initRulesHandler(java.lang.String)
   */
  public void initRulesHandler(String purpose_p, String mappingId_p) {
    try {
      _rulesHandler = getRulesHandler(purpose_p, mappingId_p);
      
      if (_rulesHandler.getContext() == null)
	        _rulesHandler.setContext(new GenericContext());
      
      initContext();
      
    } catch (NonExistingPurposeException e) {
        TransposerCorePlugin.getDefault().logError(TransposerCorePlugin.PLUGIN_ID, e.getMessage(), e);
      }
  }

  protected IRulesHandler getRulesHandler(String purpose_p, String mappingId_p) throws NonExistingPurposeException {
	  return new GenericRulesHandler(purpose_p, mappingId_p);
  }

  protected void initContext() {
	      _context = _rulesHandler.getContext();
  }

/**
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#initScheduler()
   */
  public void initScheduler() {
    _scheduler = new GenericScheduler();
  }

  /**
   * @param mappingId_p
   * @param configuration_p
   * @see org.polarsys.kitalpha.transposer.api.ITransposer#setUp(java.lang.String)
   */
  protected void setUp(String purpose_p, String mappingId_p) {
    initRulesHandler(purpose_p, mappingId_p);
    initAnalyzer();
    initScheduler();
  }

  public void dispose() {
    if (getAnalyzer() != null)
      getAnalyzer().dispose();

    if (getScheduler() != null)
      getScheduler().dispose();

    if (getRulesHandler() != null)
      getRulesHandler().dispose();

    this._context = null;
    this._analyzer = null;
    this._rulesHandler = null;
    this._scheduler = null;

  }

  private Set<?> getElements(Collection<ITransposerTask<Vertex<?>>> sortedTasks_p) {
    Set<Object> set = new LinkedHashSet<Object>();

    for (ITransposerTask<Vertex<?>> task : sortedTasks_p) {
      set.add(task.getTaskContent().getContent());
    }

    return set;

  }

}
