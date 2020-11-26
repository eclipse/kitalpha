/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.scheduler.taskwrapper.impl;

import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.scheduler.taskwrapper.AbstractTransposerTask;

/**
 * @author Franco Bergomi
 *
 */
public class TransposerTaskForVertex extends AbstractTransposerTask<Vertex<?>> {

  public TransposerTaskForVertex(Vertex<?> vertex_p, boolean isCompletelyTransposable_p){
    super(vertex_p, isCompletelyTransposable_p);
  }
}
