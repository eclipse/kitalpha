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


package org.polarsys.kitalpha.transposer.analyzer.graph.spec;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.analyzer.graph.impl.EdgeImpl;

/**
 * Specialization of DEdgeImpl.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.EdgeSpec#update(Vertex, Vertex)}</li>
 * <li>{@link org.polarsys.kitalpha.transposer.analyzer.graph.spec.EdgeSpec#update(Vertex, Vertex, boolean)}</li>
 * </ul>
 * </p>
 */
public class EdgeSpec<ContentClass> extends EdgeImpl<ContentClass> {

  /**
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.EdgeImpl#update(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex,
   *      org.polarsys.kitalpha.transposer.analyzer.graph.Vertex)
   */
  @Override
  public void update(Vertex<?> sourceVertex, Vertex<?> targetVertex) {
    setSource(sourceVertex);
    setTarget(targetVertex);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.EdgeImpl#update(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex,
   *      org.polarsys.kitalpha.transposer.analyzer.graph.Vertex, boolean)
   */
  @Override
  public void update(Vertex<?> sourceVertex, Vertex<?> targetVertex, boolean isCriticalEdge) {
    update(sourceVertex, targetVertex);
    setCritical(isCriticalEdge);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.EdgeImpl#update(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex,
   *      org.polarsys.kitalpha.transposer.analyzer.graph.Vertex, java.lang.String, boolean)
   */
  @Override
  public void update(Vertex<?> sourceVertex, Vertex<?> targetVertex, String edgeName, boolean isCriticalEdge) {
    update(sourceVertex, targetVertex, isCriticalEdge);
    setName(edgeName);
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.analyzer.graph.impl.EdgeImpl#update(org.polarsys.kitalpha.transposer.analyzer.graph.Vertex, org.polarsys.kitalpha.transposer.analyzer.graph.Vertex, java.lang.Object, java.lang.String, boolean)
   */
  @Override
  public void update(Vertex<?> sourceVertex, Vertex<?> targetVertex, ContentClass edgeContent, String edgeName, boolean isCriticalEdge) {
    update(sourceVertex, targetVertex, edgeName, isCriticalEdge);
    if (edgeContent instanceof EObject)
      setContent(edgeContent);
  }
} // EdgeSpec
