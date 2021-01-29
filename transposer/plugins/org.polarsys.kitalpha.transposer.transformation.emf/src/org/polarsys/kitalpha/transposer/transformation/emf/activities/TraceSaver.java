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


package org.polarsys.kitalpha.transposer.transformation.emf.activities;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.GenericTransformationContext;
import org.polarsys.kitalpha.transposer.transformation.emf.TransposerEMFPlugin;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;
import org.polarsys.kitalpha.transposer.transformation.emf.traces.Trace;
import org.polarsys.kitalpha.transposer.transformation.emf.traces.TraceRepository;
import org.polarsys.kitalpha.transposer.transformation.emf.traces.TracesFactory;
import org.polarsys.kitalpha.transposer.transformation.trace.TraceHelper;

/**
 * @author GEBHART Guillaume
 * 
 */
public class TraceSaver implements IActivity, ITransposerWorkflow {

  public static final String ID = "org.polarsys.kitalpha.transposer.transformation.emf.trace.save"; //$NON-NLS-1$

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
    TraceRepository tracesRepo = null;

    if (context == null) {
		return new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, "Context in not initialized in the Transposer Workflow");
	}
    
    if (context.exists(TraceLoader.TRANSPOSER_TRACE_REPOSITORY)) {
      tracesRepo = (TraceRepository) context.get(TraceLoader.TRANSPOSER_TRACE_REPOSITORY);
      tracesRepo.getTraces().clear();
    }

    if (context instanceof GenericTransformationContext) {
      handleTraces(tracesRepo, (GenericTransformationContext) context);
    }

    if (tracesRepo != null) {
		saveTraceModel(tracesRepo, context);
	}

    return Status.OK_STATUS;
  }

  /**
   * @param rep_p
   * @param context_p
   */
  private void handleTraces(TraceRepository rep_p, GenericTransformationContext context_p) {
    TraceHelper helper = context_p.getTraceHelper();

    if (helper != null) {
      for (org.polarsys.kitalpha.transposer.transformation.trace.Trace agnosticTrace : helper.getTraces()) {
        Trace emfTrace = TracesFactory.eINSTANCE.createTrace();
        if (isHandled(agnosticTrace.getSource())) {
			emfTrace.setSource((EObject) agnosticTrace.getSource());
		}
        if (isHandled(agnosticTrace.getTarget())) {
			emfTrace.setTarget((EObject) agnosticTrace.getTarget());
		}
        emfTrace.setRole(agnosticTrace.getRole());

        if (emfTrace.getSource() != null && emfTrace.getTarget() != null && emfTrace.getRole() != null) {
			rep_p.getTraces().add(emfTrace);
		}
      }
    }
  }

  /**
   * @param source_p
   * @return
   */
  private boolean isHandled(Object object_p) {
    return (object_p != null && object_p instanceof EObject && ((EObject) object_p).eResource() != null);
  }

  /**
   * @param context_p
   * @param traceModelPath_p
   * @return
   */
  private void saveTraceModel(TraceRepository rep_p, IContext context_p) {
    ResourceSet rs = null;

    // Extract resource set from context
    if (null != context_p.get(ResourceUtil.TRANSPOSER_RESOURCE_SET)) {
      Object set = context_p.get(ResourceUtil.TRANSPOSER_RESOURCE_SET);
      if (set instanceof ResourceSet) {
		rs = (ResourceSet) set;
	}
    } else {
      rs = new ResourceSetImpl();
      context_p.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, rs);
    }

    if (rep_p.eResource() != null && rep_p.eResource().getResourceSet() != null && rep_p.eResource().isLoaded() && rep_p.eResource().isModified()) {
      ResourceUtil.saveResource(rep_p.eResource());
    }
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#validateParameters(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  @Override
public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
    return null;
  }

}
