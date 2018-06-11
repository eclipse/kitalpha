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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
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
public class TraceCleaner implements IActivity, ITransposerWorkflow {

  public static final String ID = "org.polarsys.kitalpha.transposer.transformation.emf.trace.clean"; //$NON-NLS-1$

  /**
   * Key used to store a set of ECLass which needs cleaning in the created/updated model
   */
  public final static String TRANSFORMATION_FIRST_METACLASSES = "transposer.transformation.first.metaclasses"; //$NON-NLS-1$

  private TraceHelper _traceHelper = null;
  private Set<?> _transformableElements = null;
  private Set<EClass> _firstMetaClasses = Collections.<EClass> emptySet();
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

    if (context.exists(TRANSFORMATION_FIRST_METACLASSES)) {
      _firstMetaClasses = (Set<EClass>) context.get(TRANSFORMATION_FIRST_METACLASSES);
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

    Object entryPoint = null;
    if (context.exists(GenericTransformationContext.TRANSPOSER_CLEANER_ENTRY_POINT) && _transformableElements != null) {
      entryPoint = context.get(GenericTransformationContext.TRANSPOSER_CLEANER_ENTRY_POINT);
    }
    
    if (_traceHelper != null && _transformableElements != null) {
      if (entryPoint instanceof Collection) {
        for (Object obj : (Collection) entryPoint) {
          if (obj instanceof EObject) {
            if (rs == null) {
				//              EcoreUtil.resolveAll((EObject) obj);
				clean((EObject) obj);
			}
          }
        }
      } else if (entryPoint instanceof EObject) {
        if (rs == null) {
			//          EcoreUtil.resolveAll((EObject) entryPoint);
			clean((EObject) entryPoint);
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
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * @param obj_p
   * @param transformableElements_p
   */
  private void clean(EObject obj_p) {

    List<EObject> listContents = new ArrayList<EObject>(obj_p.eContents());
    for (EObject obj : listContents) {

      // clean traces on each child object
      cleanTraces(obj);

      // if current EObject has to be removed, remove it
      if (hasToBeRemoved(obj)) {
        removeCompletely(obj);
      }
      // else check in its children
      else {
        clean(obj);
      }
    }
  }

  /**
   * 
   * Clean incoming traces : traces with no source or traces from non-transformable elements
   * 
   * @param eObject_p
   * @param transformableObjects_p
   * @param traceHelper
   */
  @SuppressWarnings("nls")
  private void cleanTraces(EObject eObject_p) {

    List<Trace> incomingTraces = _traceHelper.getIncomingTraces(eObject_p);

    // clean traces:
    // remove all traces (non aux) coming from non transformable elements
    for (Trace trace : incomingTraces) {
      Object traceSource = trace.getSource();
      if (traceSource == null || (traceSource instanceof EObject && ((EObject) traceSource).eResource() == null)) {
        _traceHelper.removeTrace(trace);
      } else if (!_transformableElements.contains(traceSource)) {
        _traceHelper.removeTrace(trace);
      }
    }
  }

  /**
   * 
   * True if the object is orphan (so must be removed)
   * 
   * @param eObject_p
   * @param transformableObjects_p
   * @return
   */
  private boolean hasToBeRemoved(EObject eObject_p) {
    if (!_firstMetaClasses.contains(eObject_p.eClass())) {
		return false;
	}

    if (isOrphan(eObject_p)) {
      return true;
    }
    return false;
  }

  /**
   * @param object_p
   * @return
   */
  private boolean isOrphan(EObject object_p) {
    return _traceHelper.getIncomingTraces(object_p).isEmpty();
  }

  /**
   * 
   * Remove an object and his content, and all incoming traces to this object.
   * 
   * @param eObject_p
   */
  private void removeCompletely(EObject eObject_p) {    
    _cleanedElements.add(eObject_p);
    _traceHelper.removeAllIncomingTraces(eObject_p);
    EcoreUtil.delete(eObject_p);
  }

}
