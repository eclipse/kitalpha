/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.analyzer.graph.spec;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.transposer.analyzer.graph.Edge;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl;

/**
 * {@link org.polarsys.kitalpha.transposer.graph.impl.VertexImpl} specialization.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#addAdjacent(Vertex, Object)}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#addAdjacent(Vertex, Object, boolean)}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#addNamedAdjacent(Vertex, Object, String)}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#addNamedAdjacent(Vertex, Object, String, boolean)}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#getAdjacents()}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#hasForAdjacent(Vertex)}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.VertexSpec#getOutgoingEdgeTo(Vertex)}</li>
 * </ul>
 * </p>
 */
public class VertexSpec<ContentClass> extends VertexImpl<ContentClass> {
  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getAdjacents()
   */
  @Override
  public EList<Vertex<?>> getAdjacents() {
    EList<Vertex<?>> result = new BasicEList<Vertex<?>>();
    result.addAll(getIncomingAdjacents());
    result.addAll(getOutgoingAdjacents());
    return result;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getIncomingAdjacents()
   */
  @Override
  public EList<Vertex<?>> getIncomingAdjacents() {
    EList<Vertex<?>> result = new BasicEList<Vertex<?>>();
    for (Edge<?> edge : getIncomingEdges()) {
      result.add(edge.getSource());
    }
    return result;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getOutgoingAdjacents()
   */
  @Override
  public EList<Vertex<?>> getOutgoingAdjacents() {
    EList<Vertex<?>> result = new BasicEList<Vertex<?>>();
    for (Edge<?> edge : getOutgoingEdges()) {
      result.add(edge.getTarget());
    }
    return result;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getEdgeTo(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public Edge<?> getEdgeTo(Vertex<?> neighbour_p) {
    if (hasForIncomingAdjacent(neighbour_p)) {
		return getIncomingEdgeFrom(neighbour_p);
	} else if (hasForOutgoingAdjacent(neighbour_p)) {
		return getOutgoingEdgeTo(neighbour_p);
	}
    return null;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getOutgoingEdgeTo(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public Edge<?> getOutgoingEdgeTo(Vertex<?> neighbour_p) {
    for (Edge<?> edge : getOutgoingEdges()) {
      if (edge.getTarget() == neighbour_p) {
		return edge;
	}
    }
    return null;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#getIncomingEdgeFrom(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public Edge<?> getIncomingEdgeFrom(Vertex<?> neighbour_p) {
    for (Edge<?> edge : getIncomingEdges()) {
      if (edge.getSource() == neighbour_p) {
		return edge;
	}
    }
    return null;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#hasForAdjacent(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public boolean hasForAdjacent(Vertex<?> vertex) {
    return getAdjacents().contains(vertex);
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#hasForIncomingAdjacent(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public boolean hasForIncomingAdjacent(Vertex<?> vertex_p) {
    return getIncomingAdjacents().contains(vertex_p);
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.VertexImpl#hasForOutgoingAdjacent(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public boolean hasForOutgoingAdjacent(Vertex<?> vertex_p) {
    return getOutgoingAdjacents().contains(vertex_p);
  }

} // VertexSpec
