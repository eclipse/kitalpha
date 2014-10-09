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


package org.polarsys.kitalpha.transposer.transformation.emf.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
public class TraceLoader implements IActivity, ITransposerWorkflow {

  public static final String ID = "org.polarsys.kitalpha.transposer.transformation.emf.trace.load"; //$NON-NLS-1$

  public static final String TRANSPOSER_TRACE_MODEL = "TraceModelPath"; //$NON-NLS-1$
  public static final String TRANSPOSER_TRACE_REPOSITORY = "TraceModelRepository"; //$NON-NLS-1$

  private DeclaredParameter _traceModelPath = new DeclaredParameter(TRANSPOSER_TRACE_MODEL, "", "Path of the trace model to load"); //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#getParameters()
   */
  public Collection<DeclaredParameter> getParameters() {
    Collection<DeclaredParameter> declaredParameter = new ArrayList<DeclaredParameter>();
    declaredParameter.add(_traceModelPath);
    return declaredParameter;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#run(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  public IStatus run(ActivityParameters activityParams_p) {
    String traceModelPath = null;
    TraceRepository tracesRepo = null;
    IStatus status = Status.OK_STATUS;
    
    IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
    Object tracePath = activityParams_p.getParameter(TRANSPOSER_TRACE_MODEL).getValue();
    
    if (context == null)
    	return new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, "Context in not initialized in the Transposer Workflow");
    
    if(tracePath == null || tracePath.equals(""))
    	return new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, "Trace Model Path is not defined, please check the parameter of this activity");
    
    
    
    if (tracePath instanceof String)
      traceModelPath = (String) tracePath;

    // an other activity could put another trace path
    if (context.exists(TRANSPOSER_TRACE_MODEL)) {
      String path = (String) context.get(TRANSPOSER_TRACE_MODEL);
      traceModelPath = "".equals(path) ? traceModelPath : path; //$NON-NLS-1$
    }

    // find a resource set
    ResourceSet rs = null;
    // Extract resource set from context
    if (null != context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET)) {
      Object set = context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET);
      if (set instanceof ResourceSet)
        rs = (ResourceSet) set;
    } else {
      rs = new ResourceSetImpl();
      context.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, rs);
    }

    EcoreUtil.resolveAll(rs);

    if (isExistingTracePath(traceModelPath) && rs != null && context instanceof GenericTransformationContext) {
      Collection<EObject> traces = loadTraceModel(rs, traceModelPath);
      if (traces != null && !traces.isEmpty()) {
        EObject tr = traces.iterator().next();
        if (tr instanceof TraceRepository) {
          tracesRepo = (TraceRepository) tr;
        }
      }
    } else {
      Resource res = rs.createResource(URI.createURI(traceModelPath));
      tracesRepo = TracesFactory.eINSTANCE.createTraceRepository();
      res.getContents().add(tracesRepo);
    }

    if (tracesRepo != null) {
      initializeContext((GenericTransformationContext) context, tracesRepo);
      context.put(TRANSPOSER_TRACE_REPOSITORY, tracesRepo);

      Resource res = tracesRepo.eResource();
      res.setTrackingModification(true);
    }
    return status;
  }

  /**
   * @param context_p
   * @param tr_p
   */
  private void initializeContext(GenericTransformationContext context_p, TraceRepository tr_p) {
    TraceHelper helper = context_p.getTraceHelper();

    if (helper != null) {
      for (Trace trace : tr_p.getTraces()) {
        EObject source = null;
        EObject target = null;

        if (!trace.getSource().eIsProxy())
          source = trace.getSource();

        if (!trace.getTarget().eIsProxy())
          target = trace.getTarget();

        helper.addTraceWithRole(source, target, trace.getRole());
      }
    }

  }

  /**
   * @param context_p
   * @param traceModelPath_p
   * @return
   */
  private Collection<EObject> loadTraceModel(ResourceSet rs_p, String traceModelPath_p) {
    return ResourceUtil.loadURI(traceModelPath_p, rs_p);
  }

  /**
   * @param traceModelPath_p
   * @return
   */
  private boolean isExistingTracePath(String traceModelPath_p) {
    // Check that the file exists
    if (traceModelPath_p != null) {
      IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(traceModelPath_p));
      return file.exists();
    }
    return false;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#validateParameters(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
    // TODO Auto-generated method stub
    return null;
  }

}
