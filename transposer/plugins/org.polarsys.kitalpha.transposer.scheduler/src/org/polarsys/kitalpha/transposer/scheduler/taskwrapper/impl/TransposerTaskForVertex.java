/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
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
