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


package org.polarsys.kitalpha.transposer.scheduler.api;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;

/**
 * ISheduler objects allow to schedule the rule application thanks to the dependency graph.
 * @author GEBHART Guillaume
 * 
 */
public interface IScheduler {

  /**
   * @return
   */
  public Set<Edge<?>> getBackTracks();

  /**
   * Sets the Graph model
   * @param model_p the model to set
   */
  public void setModel(Graph model_p);

  /**
   * Returns the Graph model.
   * @return the model
   */
  public Graph getModel();

  /**
   * Returns all Vertex not visited during the Graph model scheduling.
   * @return list of vertex not visited
   */
  public Set<Vertex<?>> getNotVisited();

/**
 * Returns the result of the graph model scheduling.
 * @return transposed tasks.
 */
  public List<ITransposerTask<Vertex<?>>> getScheduleResult();

/**
 * Returns all Vertex visited during the Graph model scheduling.
 * @return the list of vertex visited
 */
  public Set<Vertex<?>> getVisited();

  /**
   * Allows to launch the scheduler algorithm.
   * 
   */
  public void schedule(Comparator<Vertex<?>> comparator_p,IProgressMonitor monitor_p);
/**
 * Disposes the IScheduler object.
 */
  public void dispose();
}
