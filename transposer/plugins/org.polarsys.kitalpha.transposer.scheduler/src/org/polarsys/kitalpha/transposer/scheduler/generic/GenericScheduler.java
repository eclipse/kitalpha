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

package org.polarsys.kitalpha.transposer.scheduler.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.scheduler.api.ITransposerTask;
import org.polarsys.kitalpha.transposer.scheduler.exceptions.CycleException;
import org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractCycleWiseScheduler;
import org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractTopologicalSorter;
import org.polarsys.kitalpha.transposer.scheduler.scheduler.impl.GenericTopologicalSorter;

/**
 * @author Franco Bergomi
 * 
 */
public class GenericScheduler extends AbstractCycleWiseScheduler {

	/**
	 * Elements visited (complementary of notVisited)
	 */
	private Set<Vertex<?>> _visited;

	/**
	 * Elements not visited (complementary of visited)
	 */
	private Set<Vertex<?>> _notVisited;

	/**
	 * Set of back edges causing cycles
	 */
	private Set<Edge<?>> _backTracks;

	/**
	 * Set of tasks that represents the result of the graph ordonnacement
	 */
	private List<ITransposerTask<Vertex<?>>> _scheduleResult;

	/**
	 * Path currently browsed
	 */
	private List<Edge<?>> _browsedPath;

	/**
	 * Set of edges found in the graph
	 */
	private Set<LinkedList<Edge<?>>> _foundCycles;

	private IProgressMonitor _monitor = null;

	private int _monitorSize;

	/**
	 * Default constructor
	 */
	public GenericScheduler() {
		super();
		init();
	}

	/**
	 * Scheduler constructor. Set all needed variables.
	 * 
	 * @param model_p
	 */
	public GenericScheduler(Graph model_p) {
		setModel(model_p);
		init();
	}

	/**
	 * Do a depth-first search starting on each model node given by
	 * {@link GenericScheduler#getAllModelSummits()}. When finish, all elements
	 * in {@link GenericScheduler#_notVisited} are not necessary and does not
	 * need transformation.
	 */
	private void depthFirstVisitGlobal() {
		List<Vertex<?>> summits = getAllModelSummits();

		for (Vertex<?> currentSummit : summits) {
			depthFirstVisitLocalWithCycleSearch(currentSummit);
		}

		identifyBacktracksFromCycles();
	}

	/**
	 * Do a depth-first search with cycle search for a given vertex
	 * 
	 * @param currentVertex
	 *            starting node.
	 */
	private void depthFirstVisitLocalWithCycleSearch(Vertex<?> currentVertex) {

		if (_monitor != null) {
			_monitor.subTask("Visiting vertex " + currentVertex.getName()); //$NON-NLS-1$
			if (_monitorSize != 0)
				_monitor.worked(1 / _monitorSize);
		}

		List<Edge<?>> currentVertexEdges = currentVertex.getOutgoingEdges();
		for (Edge<?> currentEdge : currentVertexEdges) {
			if (!_browsedPath.contains(currentEdge)) {
				Vertex<?> nextVertex = currentEdge.getTarget();

				// if cycle is find
				int index = indexOfVertexInPath(_browsedPath, nextVertex);
				if ((index > -1) || (nextVertex == currentVertex)) {
					LinkedList<Edge<?>> currentCycle = new LinkedList<Edge<?>>();
					if (index > -1)
						for (int i = index; i < _browsedPath.size(); i++) {
							currentCycle.add(_browsedPath.get(i));
						}
					currentCycle.add(currentEdge);

					// the cycle is stored
					if (isNewCycle(currentCycle)) {
						_foundCycles.add(currentCycle);
					}

				} else if (!isVisited(currentVertex)) {
					// else the search continue from current node
					_browsedPath.add(currentEdge);
					depthFirstVisitLocalWithCycleSearch(nextVertex);
				}
			}
		}

		setVisited(currentVertex);
		// and once a node is completely visited (it and its descendants), the
		// search backtrack of 1
		if (_browsedPath.size() > 0)
			_browsedPath.remove(_browsedPath.size() - 1);
	}

	/**
	 * @param currentCycle_p
	 * @return
	 */
	private boolean isNewCycle(LinkedList<Edge<?>> currentCycle_p) {
		for (LinkedList<Edge<?>> alreadyKnownCycle : _foundCycles) {
			// check cycle length && composition
			if (alreadyKnownCycle.size() == currentCycle_p.size()
					&& alreadyKnownCycle.containsAll(currentCycle_p)) {

				// // check the order
				// int gap =
				// alreadyKnownCycle.indexOf(currentCycle_p.getFirst());
				// for (int i = 0; i < currentCycle_p.size(); i++) {
				// if (alreadyKnownCycle.get(i) != currentCycle_p.get(i))
				// return true;
				// }

				return false;
			}
		}
		return true;
	}

	/**
	 * Return all hierarchically main nodes. Namely all "HotSpot" of
	 * {@link Vertex} set.
	 * 
	 * @return
	 */
	private List<Vertex<?>> getAllModelSummits() {
		List<Vertex<?>> summits = new ArrayList<Vertex<?>>();

		for (Vertex<?> vertex : _model.getVertices()) {
			if (vertex.isHotSpot())
				summits.add(vertex);
		}
		return summits;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractCycleWiseScheduler#getBackTracks()
	 */
	@Override
	public Set<Edge<?>> getBackTracks() {
		return _backTracks;
	}

	/**
	 * @return the _foundCycles
	 */
	public Set<LinkedList<Edge<?>>> getFoundCycles() {
		return _foundCycles;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractCycleWiseScheduler#getNotVisited()
	 */
	@Override
	public Set<Vertex<?>> getNotVisited() {
		return _notVisited;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractCycleWiseScheduler#getScheduleResult()
	 */
	@Override
	public List<ITransposerTask<Vertex<?>>> getScheduleResult() {
		return _scheduleResult;
	}

	/**
	 * @return the visited
	 */
	@Override
	public Set<Vertex<?>> getVisited() {
		return _visited;
	}

	/**
	 * Algorithm that decides which edges are backtracks found in cycles. For
	 * each cycle, the algorithm find a backtrack (if none of its edges is not
	 * already in the liste of backtracks). Egdes considered critical can not be
	 * considered backtracks; the algorithm will choose another edge.
	 */
	private void identifyBacktracksFromCycles() {
		// Iterates through all the cycles identified
		for (LinkedList<Edge<?>> currentCycle : _foundCycles) {
			if (currentCycle.size() == 2) {
				for (Edge<?> edge : currentCycle) {
					if (!_backTracks.contains(edge) && !edge.isCritical()) {
						_backTracks.add(edge);
					}
				}
			} else {
				boolean alreadyBacktracked = false;

				// Look if one of the edges are already in the list of
				// backtracks
				// if this is the case, do nothing
				// if not, determines which edges are considered backtrack
				for (Edge<?> edge : currentCycle) {
					if (_backTracks.contains(edge)) {
						alreadyBacktracked = true;
						break;
					}
				}

				// if no edge are in backtracks list
				if (!alreadyBacktracked) {
					boolean done = false;
					Iterator<Edge<?>> iterator = currentCycle.iterator();

					// Take the firt non-critical edge and tag it backtrack
					while (iterator.hasNext() && (!done)) {
						Edge<?> currentEdge = iterator.next();
						if (!currentEdge.isCritical()) {
							_backTracks.add(currentEdge);
							done = true;
						}
					}

					if (!done) {
						System.out
								.println("Unbreakable cycle " + currentCycle.size() + " elements)"); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			}
		}
	}

	/**
	 * Return index of a node in a path
	 * 
	 * @param path
	 *            the path in which we search the node
	 * 
	 * @param vertex
	 *            the desired node
	 * @return an integer index of the vertex in the path (or -1 if it is not in
	 *         the path)
	 */
	private int indexOfVertexInPath(List<Edge<?>> path, Vertex<?> vertex) {
		int i = 0;
		for (Edge<?> edge : path) {
			if ((edge.getSource() == vertex))// || (edge.getTarget() == vertex))
				return i;
			i++;
		}
		return -1;
	}

	/**
	 * initialiseur
	 */
	private void init() {
		_visited = new LinkedHashSet<Vertex<?>>();
		_notVisited = new HashSet<Vertex<?>>();
		_backTracks = new HashSet<Edge<?>>();
		_foundCycles = new HashSet<LinkedList<Edge<?>>>();
		_browsedPath = new ArrayList<Edge<?>>();
		_scheduleResult = new LinkedList<ITransposerTask<Vertex<?>>>();
	}

	public void dispose() {
		_visited = null;
		_notVisited = null;
		_backTracks = null;
		_foundCycles = null;
		_browsedPath = null;
		_scheduleResult = null;
		_monitor = null;
	}

	/**
	 * Indicates whether a node has already been visited by the depth-first
	 * search (if this is not the case, it is notTransposable)
	 * 
	 * @param t
	 *            The current {@link Vertex}
	 * @return true if the vertex has already been visited
	 */
	private boolean isVisited(Vertex<?> t) {
		return _visited.contains(t);
	}

	/**
	 * Remove all elements of the graph on the visited elements list. Add All of
	 * this elements in the not visited elements list.
	 */
	private void markAllAsNotVisited() {
		_notVisited.addAll(_model.getVertices());
		_visited.clear();
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractCycleWiseScheduler#schedule()
	 */
	@Override
	public void schedule(Comparator<Vertex<?>> comparator_p,
			IProgressMonitor monitor_p) {
		init();

		// All elements are marked as not visited
		markAllAsNotVisited();

		if (monitor_p != null) {
			_monitor = monitor_p;
			_monitorSize = _notVisited.size();
			monitor_p.beginTask("Transposer Scheduling", 3); //$NON-NLS-1$
			monitor_p.subTask("Cycle search"); //$NON-NLS-1$
		}

		/*
		 * Run a depth first search for : - identify hierarchically main nodes
		 * (hot spot) - recursively goes down into the model from these nodes -
		 * identify backtracks
		 */
		depthFirstVisitGlobal();

		/*
		 * Now all backtracks are discovered and stored in the backtrack list.
		 * The topological sort with giving him the link it should not consider.
		 * Once elements have an order, backtracks are concatenated. The
		 * CycleWeak version that captures an exception in an unfavorable case
		 * is kept.
		 */

		try {
			setTopologicalSorter(getDefaultSorter());
			getTopologicalSorter().sort(comparator_p, monitor_p);
			_scheduleResult = getTopologicalSorter().getWork(monitor_p);
			getTopologicalSorter().dispose();
		} catch (CycleException e) {
			e.printStackTrace();
		}
	}

	public AbstractTopologicalSorter getDefaultSorter() {
		return new GenericTopologicalSorter(_visited, _backTracks);
	}

	/**
	 * Tag a node as visited
	 * 
	 * @param t
	 *            the current {@link Vertex}
	 */
	private void setVisited(Vertex<?> t) {
		if (!isVisited(t)) {
			_visited.add(t);
			_notVisited.remove(t);
		}
	}

}
