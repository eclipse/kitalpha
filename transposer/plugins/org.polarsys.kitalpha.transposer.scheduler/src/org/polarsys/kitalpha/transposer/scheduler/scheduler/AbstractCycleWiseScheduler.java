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

package org.polarsys.kitalpha.transposer.scheduler.scheduler;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.scheduler.api.IScheduler;
import org.polarsys.kitalpha.transposer.scheduler.api.ITransposerTask;

/**
 * @author Franco Bergomi
 * 
 */
public abstract class AbstractCycleWiseScheduler implements IScheduler {

	protected AbstractTopologicalSorter _TopologicalSorter;

	public Graph _model;

	/**
	 * @return the collection of backtracks
	 */
	@Override
	public abstract Set<Edge<?>> getBackTracks();

	/**
	 * @return the model
	 */
	@Override
	public Graph getModel() {
		return _model;
	}

	/**
	 * @return the collection of elements not visited
	 */
	@Override
	public abstract Set<Vertex<?>> getNotVisited();

	@Override
	public abstract List<ITransposerTask<Vertex<?>>> getScheduleResult();

	/**
	 * @return the topologicalScheduler
	 */
	protected AbstractTopologicalSorter getTopologicalSorter() {
		return _TopologicalSorter;
	}

	@Override
	public abstract Set<Vertex<?>> getVisited();

	/**
	 * Start sorting on this scheduler : do a depth-first search of the model.
	 * When a backtrack is found, it is stored (backtracks already stored are
	 * ignored).
	 */

	@Override
	public abstract void schedule(Comparator<Vertex<?>> comparator_p,
			IProgressMonitor monitor_p);

	/**
	 * @param model_p
	 *            the model to set
	 */
	@Override
	public void setModel(Graph model_p) {
		_model = model_p;
	}

	/**
	 * @param topologicalScheduler_p
	 *            the topologicalScheduler to set
	 */
	protected void setTopologicalSorter(
			AbstractTopologicalSorter topologicalScheduler_p) {
		_TopologicalSorter = topologicalScheduler_p;
	}
}