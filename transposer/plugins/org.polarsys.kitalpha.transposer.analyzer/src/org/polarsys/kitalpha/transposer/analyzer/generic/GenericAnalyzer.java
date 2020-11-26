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


package org.polarsys.kitalpha.transposer.analyzer.generic;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.analyzer.api.IAnalyzer;
import org.polarsys.kitalpha.transposer.analyzer.exceptions.AnalysisException;
import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;
import org.polarsys.kitalpha.transposer.analyzer.graph.GraphFactory;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.business.premises.PrecedencePremise;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.ComputePremisesException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

/**
 * @author Guillaume Gebhart
 * 
 * 
 */
public class GenericAnalyzer implements IAnalyzer {

  protected Graph _modelGraph;
  protected IRulesHandler _rulesHandler;

  /**
   * Map that links a ModelElem to the corresponding Vertex in the dependendy Graph
   */
  private Map<Object, Vertex<?>> _graphHashMap;

  /**
   * Constructor for the Analyzer
   * @param object_p
   */
  public GenericAnalyzer(IRulesHandler rulesHandler_p) {
    _modelGraph = GraphFactory.eINSTANCE.createGraph();
    _rulesHandler = rulesHandler_p;
    _graphHashMap = new HashMap<Object, Vertex<?>>();
  }

  /**
   * Method to get the computed graph
   * @return the computed graph
   */
  public Graph getModelGraph() {
    return this._modelGraph;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.analyzer.api.IAnalyzer#analyse(java.util.Collection)
   */
  @Override
public Graph analyze(Collection<?> analysisSource_p, Collection<?> selection_p, IProgressMonitor monitor_p) throws AnalysisException {

    if (monitor_p != null)
	 {
		monitor_p.beginTask("Transposer Analysis", analysisSource_p.size()); //$NON-NLS-1$
	}

    for (Object source : analysisSource_p) {
      try {
        if (_rulesHandler.getApplicablePossibility(source) != null) {
          createVertexForType(source, monitor_p);
          createSubGraphForType(source, monitor_p);
          if (monitor_p != null) {
			monitor_p.worked(1);
		}
        }
      } catch (ComputePremisesException e) {
        throw new AnalysisException(e);
      } catch (MappingPossibilityResolutionException e) {
        throw new AnalysisException(e);
      }
    }

    // TODO handle three modes : full, impac, local
    // TODO handle selection to clean the graph

    // //Clean all single vertex.
    // for (Vertex<?> vertex : new ArrayList<Vertex<?>>(_modelGraph.getVertices())) {
    // if (vertex.getAdjacents().size() == 0)
    // _modelGraph.getVertices().remove(vertex);
    // }

    if (monitor_p != null)
	 {
		monitor_p.subTask(""); //$NON-NLS-1$
	}

    return _modelGraph;

  }

  /**
   * Method that creates a {@link Graph} {@link Vertex} for a given model Element If the {@link Vertex} already exists, nothing is created.
   * 
   * @param currentType_p the given ModelElement
   */
  private <T> void createVertexForType(T currentType_p, IProgressMonitor monitor_p) {
    if (graphHasAlreadyVertex(currentType_p)) {
		return;
	}

    if (monitor_p != null) {
      monitor_p.subTask("Creating vertex for " + currentType_p.getClass().getSimpleName()); //$NON-NLS-1$
      monitor_p.worked(1);
    }

    String name = _rulesHandler.getDomainHelper().getName(currentType_p);
    if (name == null || "".equals(name)) {
		name = currentType_p.getClass().getName();
	}

    boolean isHotSpot = _rulesHandler.getDomainHelper().isHotSpot(currentType_p);

    Vertex<T> newVertex = GraphFactory.eINSTANCE.<T> createVertex();
    newVertex.setContent(currentType_p);
    newVertex.setName(name);
    newVertex.setHotSpot(isHotSpot);

    _graphHashMap.put(currentType_p, newVertex);
    _modelGraph.addVertex(newVertex);
  }

  private <T> boolean graphHasAlreadyVertex(T currentType_p) {
    return _graphHashMap.containsKey(currentType_p);
  }

  /**
   * Method that creates recursively the whole Dependency Graph starting from the {@link currentType_p}
   * 
   * @param currentType_p the modelElement whose dependencies have to be created in the graph.
   */
  private <T> void createSubGraphForType(T currentType_p, IProgressMonitor monitor_p) throws ComputePremisesException {

    Vertex<?> currentVertex = _graphHashMap.get(currentType_p);
    List<IPremise> needed = null;

    needed = _rulesHandler.getPremises(currentType_p);

    if (needed == null) {
		return;
	}

    if (monitor_p != null) {
      monitor_p.subTask("Creating subgraph for " + currentType_p.getClass().getSimpleName()); //$NON-NLS-1$
    }
    
    for (IPremise premise : needed) {
      if (premise instanceof PrecedencePremise) {

        PrecedencePremise<?> precedentePremise;

        try {
          precedentePremise = (PrecedencePremise<?>) premise;
        } catch (ClassCastException exception_p) {
          // LogHelper.instance().log("problem With premises computation :" + currentType_p + "\n" + exception_p, _rulesHandler.getPurpose());
          // TODO handle exception
          throw exception_p;
        }

        boolean isCriticalDependency = false;
        boolean createdVertex = false;

        Object dependingObject = precedentePremise.getFirstElement();
        String dependingObjectDescription = precedentePremise.getSecondElement();
        Vertex<?> dependingVertex = _graphHashMap.get(dependingObject);

        if (null == dependingVertex) {
          createVertexForType(dependingObject, monitor_p);
          dependingVertex = _graphHashMap.get(dependingObject);
          createdVertex = true;
        }

        // the current Edge is critical when it the premise is critical (eg: a containment one)
        isCriticalDependency = precedentePremise.isCritical();

        // we look
        // -if there is already an edge for the current dependency !
        // -if the current edge is critical (eg: containment case)
        Edge<?> edge = currentVertex.getOutgoingEdgeTo(dependingVertex);
        if ((edge != null) && (!edge.isCritical()) && (isCriticalDependency)) {
			edge.setCritical(true);
		} else if (edge == null) {
          _modelGraph.addAdjacent(currentVertex, dependingVertex, dependingObjectDescription, isCriticalDependency);
        }

        if (createdVertex) {
			createSubGraphForType(dependingObject, monitor_p);
		}
      }
    }
  }

  @Override
public void dispose() {
    this._graphHashMap.clear();
    this._graphHashMap = null;
    this._modelGraph = null;
    this._rulesHandler = null;
  }
}
