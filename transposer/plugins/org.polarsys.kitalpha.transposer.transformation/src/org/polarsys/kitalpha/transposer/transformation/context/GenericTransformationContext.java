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


package org.polarsys.kitalpha.transposer.transformation.context;

import java.util.List;

import org.polarsys.kitalpha.transposer.generic.GenericContext;
import org.polarsys.kitalpha.transposer.transformation.trace.Trace;
import org.polarsys.kitalpha.transposer.transformation.trace.TraceHelper;

/**
 * @author GEBHART Guillaume
 * 
 */
public class GenericTransformationContext extends GenericContext {

  /**
   * Collection<EObject> or EObject : the cleaner will iterate on all contents of these elements.
   */
  public final static String TRANSPOSER_CLEANER_ENTRY_POINT = "transposer.transformation.emf.entrypoint"; //$NON-NLS-1$

  // Default TraceHelper
  private TraceHelper _traceHelper = new TraceHelper();

  public void setTraceHelper(TraceHelper traceHelper_p) {
    this._traceHelper = traceHelper_p;
  }

  public TraceHelper getTraceHelper() {
    return this._traceHelper;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContextImpl#put(java.lang.Object, java.lang.Object)
   */
  @Override
  public void put(Object object_p, Object value_p) {
    if (object_p instanceof TransformationKey) {
      TransformationKey key = (TransformationKey) object_p;
      getTraceHelper().addTraceWithRole(key.getSourceObject(), value_p, key.getRole());
    } else {
      super.put(object_p, value_p);
    }
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContextImpl#get(java.lang.Object)
   */
  @Override
  public Object get(Object object_p) {
    if (object_p instanceof TransformationKey) {
      TransformationKey key = (TransformationKey) object_p;
      Trace trace = getTraceHelper().getOutgoingTraceWithRole(key.getSourceObject(), key.getRole());
      if (trace != null)
        return trace.getTarget();
      return null;
    }
    return super.get(object_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContextImpl#exists(java.lang.Object)
   */
  @Override
  public boolean exists(Object object_p) {
    if (object_p instanceof TransformationKey) {
      TransformationKey key = (TransformationKey) object_p;
      List<Trace> traces = getTraceHelper().getOutgoingTracesWithRole(key.getSourceObject(), key.getRole());
      return traces != null && !traces.isEmpty();
    }
    return super.exists(object_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContext#reset()
   */
  @Override
  public void reset() {
    super.reset();

    if (this.getTraceHelper() != null) {
      this.getTraceHelper().reset();
    }
  }
}
