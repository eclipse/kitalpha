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

package org.polarsys.kitalpha.transposer.scheduler.scheduler;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.scheduler.api.ITransposerTask;
import org.polarsys.kitalpha.transposer.scheduler.exceptions.CycleException;

/**
 * @author Franco Bergomi
 * 
 */
public abstract class AbstractTopologicalSorter {

  protected Set<Edge<?>> _backtracks;
  protected Set<Vertex<?>> _model;
  protected LinkedHashSet<Vertex<?>> _sortedModel;

  /**
   * 
   */
  public AbstractTopologicalSorter(Set<Vertex<?>> toSort, Set<Edge<?>> backtracks_p) {
    _model = toSort;
    _backtracks = backtracks_p;
  }

  /**
   * @return the backtracks
   */
  public Set<Edge<?>> getBacktracks() {
    return _backtracks;
  }

  /**
   * @return the model
   */
  public Set<Vertex<?>> getModel() {
    return _model;
  }

  /**
   * @return the sortedModel
   */
  public LinkedHashSet<Vertex<?>> getSortedModel() {
    return _sortedModel;
  }

  public abstract List<ITransposerTask<Vertex<?>>> getWork(IProgressMonitor monitor_p);

  public abstract LinkedHashSet<Vertex<?>> sort(Comparator<Vertex<?>> comparator_p,IProgressMonitor monitor_p) throws CycleException;

 
  /**
   * 
   */
  public void dispose() {
    _backtracks.clear();
    _model.clear();
    _sortedModel.clear();

    _backtracks = null;
    _model = null;
    _sortedModel = null;

  }

}