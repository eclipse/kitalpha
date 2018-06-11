/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.transformation.emf.activities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.GenericTransformationContext;
import org.polarsys.kitalpha.transposer.transformation.emf.TransposerEMFPlugin;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;
import org.polarsys.kitalpha.transposer.transformation.emf.util.EcoreIdentifierUtil;
import org.polarsys.kitalpha.transposer.transformation.trace.Trace;
import org.polarsys.kitalpha.transposer.transformation.trace.TraceHelper;

/**
 * @author GEBHART Guillaume
 * 
 */
public class SoftTraceCleaner implements IActivity, ITransposerWorkflow {

  public static final String ID = "org.polarsys.kitalpha.transposer.transformation.emf.trace.clean.soft"; //$NON-NLS-1$

  private TraceHelper _traceHelper = null;
  private Set<?> _transformableElements = null;
  private Collection<EObject> _cleanedElements = new HashSet<EObject>();

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#getParameters()
   */
  @Override
public Collection<DeclaredParameter> getParameters() {
    return null;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#run(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  @Override
public IStatus run(ActivityParameters activityParams_p) {
    IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
    _transformableElements = (Set<?>) activityParams_p.getParameter(TRANSPOSER_TRANSPOSABLE_OBJECTS).getValue();

    
    if (context == null) {
		return new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, "Context in not initialized in the Transposer Workflow");
	}
    
    if (context instanceof GenericTransformationContext) {
		_traceHelper = ((GenericTransformationContext) context).getTraceHelper();
	}

    // find a resource set
    ResourceSet rs = null;
    // Extract resource set from context
    if (null != context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET)) {
      Object set = context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET);
      if (set instanceof ResourceSet) {
        rs = (ResourceSet) set;
//        EcoreUtil.resolveAll(rs);
      }
    }

    if (_traceHelper != null && _transformableElements != null) {
      for (Trace trace : _traceHelper.getTraces()) {

        if (trace.getTarget() instanceof EObject && !_cleanedElements.contains(trace.getTarget())
            && (trace.getSource() == null || !_transformableElements.contains(trace.getSource()))) {
          EObject toRemove = (EObject) trace.getTarget();
          removeCompletely(toRemove);
          _cleanedElements.add(toRemove);
        }
      }
    }

    if (_cleanedElements.size() != 0) {
		logInfoCleanMessage();
	}

    return Status.OK_STATUS;
  }

  /**
   * 
   */
  private void logInfoCleanMessage() {
    StringBuilder message = new StringBuilder();
    message.append(" WARNING \n"); //$NON-NLS-1$
    message.append("--- TraceCleaner cleaned elements ---\n"); //$NON-NLS-1$
    for (EObject obj : _cleanedElements) {
      message.append(" . " + EcoreIdentifierUtil.getIdentifier(obj.eClass()) + " : " + obj + "\n");//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    TransposerCorePlugin.getDefault().logInfo(TransposerEMFPlugin.PLUGIN_ID, message.toString(), null);
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#validateParameters(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  @Override
public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
    return null;
  }

  /**
   * 
   * Remove an object and his content, and all incoming traces to this object.
   * 
   * @param eObject_p
   */
  protected void removeCompletely(EObject eObject_p) {
    EcoreUtil.delete(eObject_p);
  }

}
