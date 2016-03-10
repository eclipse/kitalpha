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

package org.polarsys.kitalpha.transposer.scheduler.scheduler.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;
import org.polarsys.kitalpha.transposer.analyzer.graph.GraphFactory;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.scheduler.api.ITransposerTask;
import org.polarsys.kitalpha.transposer.scheduler.exceptions.CycleException;
import org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractTopologicalSorter;
import org.polarsys.kitalpha.transposer.scheduler.taskwrapper.impl.TransposerTaskForVertex;

/**
 * Do a topological sort on a set of elements (a model), which we know the links
 * that cause cycles
 * 
 * @author Franco Bergomi
 */
public class GenericTopologicalSorter extends AbstractTopologicalSorter {

	/**
	 * Constructor of backtrackWiseScheduler, that calculates the order of
	 * processing of a set of elements where all types are useful and where we
	 * know all edges that cause cycles.
	 * 
	 * @param toSort
	 *            the set to sort
	 * @param backtracks_p
	 *            the set of cycles
	 */
	public GenericTopologicalSorter(Set<Vertex<?>> toSort,
			Set<Edge<?>> backtracks_p) {
		super(toSort, backtracks_p);
	}

	/**
	 * Determine the independent elements within a set of elements
	 * 
	 * @param monitor_p
	 * @param TypeSet
	 *            the set of elements in which we search independent elements
	 * @return the set of independent elements
	 */
	private Set<Vertex<?>> findIndependantsInTypeSet(Set<Vertex<?>> toSort,
			Comparator<Vertex<?>> comparator_p, IProgressMonitor monitor_p) {
		Set<Vertex<?>> independants = new LinkedHashSet<Vertex<?>>();

		if (comparator_p != null) {
			independants = new TreeSet<Vertex<?>>(comparator_p);
		}
		for (Vertex<?> currentType : toSort) {
			if (isIndependantInTypeSet(currentType, toSort)) {
				independants.add(currentType);
				if (monitor_p != null)
					monitor_p.worked(1 / _model.size());
			}
		}

		if (independants.size() == 0) {
			lookForOtherBacktracks(toSort);
			independants = findIndependantsInTypeSet(toSort, comparator_p,
					monitor_p);
		}
		return independants;
	}

	/**
	 * @param toSort_p
	 */
	private void lookForOtherBacktracks(Set<Vertex<?>> toSort_p) {
		// try to break non detected cycles : list non backtracked (non
		// critical) edges, outputs of vertices to sort.
		List<Edge<?>> nonBacktrackedEdges = new ArrayList<Edge<?>>();
		// if possible, only break edges from vertices with multiples output.
		List<Edge<?>> edgesToBreak = new ArrayList<Edge<?>>();
		for (Vertex<?> v : toSort_p) {
			List<Edge<?>> breakables = new ArrayList<Edge<?>>();
			for (Edge<?> e : v.getOutgoingEdges()) {
				if (toSort_p.contains(e.getTarget()) && !e.isCritical()
						&& !_backtracks.contains(e)) {
					breakables.add(e);
				}
			}

			if (breakables.size() > 1) {
				edgesToBreak.addAll(breakables);
			} else {
				nonBacktrackedEdges.addAll(breakables);
			}
		}

		if (edgesToBreak.isEmpty()) {
			_backtracks.addAll(edgesToBreak);
		} else {
			_backtracks.addAll(nonBacktrackedEdges);
		}
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractTopologicalSorter#getWork()
	 */
	@Override
	public List<ITransposerTask<Vertex<?>>> getWork(IProgressMonitor monitor_p) {
		/*
		 * Reset all vertices that are not fully transposable to the end of
		 * "sorted". Thus the algorithm processing will create (for incomplete
		 * vertices) empty structures and update them by adding all that is
		 * useful.
		 */

		LinkedHashSet<TransposerTaskForVertex> taskBuffer = new LinkedHashSet<TransposerTaskForVertex>();
		List<ITransposerTask<Vertex<?>>> definitiveTasks = new LinkedList<ITransposerTask<Vertex<?>>>();

		LinkedHashSet<Vertex<?>> sorted = getSortedModel();

		if (monitor_p != null) {
			monitor_p.subTask("Compute tasks"); //$NON-NLS-1$
		}

		for (Vertex<?> _currentVertex : sorted) {
			taskBuffer.add(new TransposerTaskForVertex(_currentVertex, false));
		}

		definitiveTasks.addAll(taskBuffer);

		for (TransposerTaskForVertex task : taskBuffer) {
			List<Edge<?>> edges = task.getTaskContent().getOutgoingEdges();

			List<Edge<?>> edgesCopy = new ArrayList<Edge<?>>();
			edgesCopy.addAll(edges);

			edgesCopy.retainAll(_backtracks);
			if (edgesCopy.size() == 0) // aucun backtrack
				task.setCompletelyTransposable(true);
			else
				definitiveTasks.add(new TransposerTaskForVertex(task
						.getTaskContent(), true));

			if (monitor_p != null)
				monitor_p.worked(1 / sorted.size());
		}
		return definitiveTasks;
	}

	/**
	 * Indicates whether a {@link Vertex} is independent from a list of other
	 * {@link Vertex}. If all the elements on which it depends (if any) are out
	 * of this list, we consider that it is independent of the list.
	 * 
	 * @param current
	 *            the {@link Vertex} which we want to know if it is independent
	 * @param TypeSet
	 *            List of {@link Vertex} relative to which we want to know if
	 *            the given {@link Vertex} in parameter is independent
	 * 
	 * @return the answer.
	 */
	private boolean isIndependantInTypeSet(Vertex<?> current,
			Set<Vertex<?>> toSort) {
		boolean independant = true;
		Iterator<Edge<?>> iterator = current.getOutgoingEdges().iterator();

		while (independant && iterator.hasNext()) {
			Edge<?> currentedge = iterator.next();

			if (_backtracks.contains(currentedge))
				independant = true;
			else {
				Vertex<?> currentType = currentedge.getTarget();
				independant = (independant && !toSort.contains(currentType));
			}
		}

		return independant;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.scheduler.scheduler.AbstractTopologicalSorter#sort()
	 */
	@Override
	public LinkedHashSet<Vertex<?>> sort(Comparator<Vertex<?>> comparator_p,
			IProgressMonitor monitor_p) throws CycleException {
		if (monitor_p != null) {
			monitor_p.subTask("Topological sort"); //$NON-NLS-1$ 
		}
		_sortedModel = topologicalSort(new LinkedHashSet<Vertex<?>>(), _model,
				comparator_p, monitor_p);

		return getSortedModel();
	}

	/**
	 * Sort elements (terminal recursive : the first parameter is an
	 * accumulator, it must be initialized with an empty set).
	 * 
	 * @param Sorted
	 *            accumulator (contains the element treated, in the order)
	 * @param toSort
	 *            set of elements not yet treated ensemble d'elements pas encore
	 * 
	 * @return all of the elements treated (at the end of the recursive calls)
	 * @throws CycleException
	 */
	private LinkedHashSet<Vertex<?>> topologicalSort(
			LinkedHashSet<Vertex<?>> sorted, Set<Vertex<?>> toSort,
			Comparator<Vertex<?>> comparator_p, IProgressMonitor monitor_p)
			throws CycleException {
		Set<Vertex<?>> dependants = new LinkedHashSet<Vertex<?>>();
		Set<Vertex<?>> independants;

		if (toSort.size() == 0)
			return sorted;

		independants = findIndependantsInTypeSet(toSort, comparator_p,
				monitor_p);

		if (independants.size() == 0) {
			ResourceSet rs = null;
			String uri = null;
			Map<Vertex<?>, Vertex<?>> gToG2 = new HashMap<Vertex<?>, Vertex<?>>();
			Graph g2 = GraphFactory.eINSTANCE.createGraph();

			for (Vertex<?> v : toSort) {
				Vertex<EObject> v2 = GraphFactory.eINSTANCE
						.<EObject> createVertex();
				g2.addVertex(v2);
				gToG2.put(v, v2);

				if (v.getContent() instanceof EObject) {
					v2.setContent((EObject) v.getContent());

					if ((rs == null || uri == null)
							&& ((EObject) v.getContent()).eResource() != null) {
						rs = ((EObject) v.getContent()).eResource()
								.getResourceSet();
						uri = ((EObject) v.getContent()).eResource().getURI()
								.toPlatformString(false);
					}
				}
			}

			for (Vertex<?> v : toSort) {
				for (Edge<?> e : v.getOutgoingEdges()) {
					if (toSort.contains(e.getTarget())) {
						Edge<?> e2 = GraphFactory.eINSTANCE.createEdge();
						g2.addEdge(e2);
						e2.update(gToG2.get(v), gToG2.get(e.getTarget()),
								e.isCritical());

						if (_backtracks.contains(e))
							e2.setName("backtrack"); //$NON-NLS-1$
					}
				}
			}

			Resource res = rs.createResource(URI.createURI(uri + ".graph")); //$NON-NLS-1$
			res.getContents().add(g2);
			try {
				res.save(Collections.EMPTY_MAP);
			} catch (Exception e) {
				e.printStackTrace();
			}

			throw new CycleException();
		}
		for (Vertex<?> currentToSort : toSort) {
			if (!independants.contains(currentToSort))
				dependants.add(currentToSort);
		}

		sorted.addAll(independants);
		topologicalSort(sorted, dependants, comparator_p, monitor_p);

		return sorted;
	}
}
