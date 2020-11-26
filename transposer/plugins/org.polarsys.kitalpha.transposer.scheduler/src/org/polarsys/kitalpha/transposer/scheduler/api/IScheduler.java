/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
  Set<Edge<?>> getBackTracks();

  /**
   * Sets the Graph model
   * @param model_p the model to set
   */
  void setModel(Graph model_p);

  /**
   * Returns the Graph model.
   * @return the model
   */
  Graph getModel();

  /**
   * Returns all Vertex not visited during the Graph model scheduling.
   * @return list of vertex not visited
   */
  Set<Vertex<?>> getNotVisited();

/**
 * Returns the result of the graph model scheduling.
 * @return transposed tasks.
 */
  List<ITransposerTask<Vertex<?>>> getScheduleResult();

/**
 * Returns all Vertex visited during the Graph model scheduling.
 * @return the list of vertex visited
 */
  Set<Vertex<?>> getVisited();

  /**
   * Allows to launch the scheduler algorithm.
   * 
   */
  void schedule(Comparator<Vertex<?>> comparator_p,IProgressMonitor monitor_p);
/**
 * Disposes the IScheduler object.
 */
  void dispose();
}
