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


package org.polarsys.kitalpha.transposer.api;


/**
 * @author Guillaume Gebhart
 *
 */
public interface ITransposerWorkflow {

  /**
   * Declared Cadence Workflow Id
   */ 
  public final String TRANSPOSER_WORKFLOW = "org.polarsys.kitalpha.transposer.workflow"; //$NON-NLS-1$
  
  /**
   * Declared Cadence Workflow Element Ids
   */ 
  public final String PRE_ANALYSIS = "org.polarsys.kitalpha.transposer.before.analysis"; //$NON-NLS-1$
  public final String PRE_SCHEDULING = "org.polarsys.kitalpha.transposer.before.scheduling"; //$NON-NLS-1$
  public final String PRE_EXECUTION = "org.polarsys.kitalpha.transposer.before.rule.execution"; //$NON-NLS-1$
  public final String POST_EXECUTION = "org.polarsys.kitalpha.transposer.after.rule.execution"; //$NON-NLS-1$
  
  /**
   * Declared Cadence Workflow Element parameters
   */ 
  // pre analysis
  public final String TRANSPOSER_SELECTION = "TransposerSelection"; //$NON-NLS-1$
  public final String TRANSPOSER_INITIAL_SELECTION = "TransposerInitialSelection"; //$NON-NLS-1$
  public final String TRANSPOSER_ANALYSIS_SOURCES = "TransposerAnalysisSources"; //$NON-NLS-1$
  public final String TRANSPOSER_CONTEXT = "TransposerContext"; //$NON-NLS-1$
  public final String TRANSPOSER_PROGRESS_MONITOR = "TransposerProgressMonitor"; //$NON-NLS-1$
  public final String TRANSPOSER_DOMAIN_HELPER = "TransposerDomainHelper"; //$NON-NLS-1$
  // pre scheduling
  public final String TRANSPOSER_ANALYSIS_GRAPH = "TransposerAnalysisGraph"; //$NON-NLS-1$
  // pre execution
  public final String TRANSPOSER_SORTED_TASKS = "TransposerSortedTasks"; //$NON-NLS-1$
  public final String TRANSPOSER_TRANSPOSABLE_OBJECTS = "TransposerTransposableObjects"; //$NON-NLS-1$
  // post execution
  
}
