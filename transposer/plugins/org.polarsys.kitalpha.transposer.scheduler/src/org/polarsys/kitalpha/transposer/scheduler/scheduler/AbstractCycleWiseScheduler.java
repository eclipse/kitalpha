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
	public abstract Set<Edge<?>> getBackTracks();

	/**
	 * @return the model
	 */
	public Graph getModel() {
		return _model;
	}

	/**
	 * @return the collection of elements not visited
	 */
	public abstract Set<Vertex<?>> getNotVisited();

	public abstract List<ITransposerTask<Vertex<?>>> getScheduleResult();

	/**
	 * @return the topologicalScheduler
	 */
	protected AbstractTopologicalSorter getTopologicalSorter() {
		return _TopologicalSorter;
	}

	public abstract Set<Vertex<?>> getVisited();

	/**
	 * Start sorting on this scheduler : do a depth-first search of the model.
	 * When a backtrack is found, it is stored (backtracks already stored are
	 * ignored).
	 */

	public abstract void schedule(Comparator<Vertex<?>> comparator_p,
			IProgressMonitor monitor_p);

	/**
	 * @param model_p
	 *            the model to set
	 */
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