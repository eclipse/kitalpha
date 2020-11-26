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


package org.polarsys.kitalpha.transposer.emf.toolbox.activities;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.emf.toolbox.ToolboxPlugin;
import org.polarsys.kitalpha.transposer.emf.toolbox.api.dangling.IGenericDanglingConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

/**
 * @author Guillaume Gebhart
 */
public class ModelSaver implements IActivity, ITransposerWorkflow, IGenericDanglingConstants {

  public static final String ID = "org.polarsys.kitalpha.transposer.emf.toolbox.activities.models.saver"; //$NON-NLS-1$

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#run(java.util.Map)
   */
  @Override
public IStatus run(ActivityParameters activityParams_p) {
	IStatus status = Status.OK_STATUS;
	  
    IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
    ResourceSet resourceSet = (ResourceSet) context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET);
    if(resourceSet != null){
    EList<Resource> resources = resourceSet.getResources();
    if(resources != null  && !resources.isEmpty()){
    	Resource res = resources.get(0); // a recoder
    	ResourceUtil.saveResource(res);
    }
    dispose(context);
    }else{
    	status = new Status(IStatus.ERROR,ToolboxPlugin.PLUGIN_ID,"no ResourceSet specified");  
    }
    return status;
  }

  /**
   * @param context_p
   */
  private void dispose(IContext context_p) {
    context_p.reset();

  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#validateParameters(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  @Override
public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
    return null;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#getParameters()
   */
  @Override
public Collection<DeclaredParameter> getParameters() {
    return null;
  }

  public void saveModel(Resource res) {
    try {
      res.save(Collections.EMPTY_MAP);
    } catch (IOException exception_p) {
      ToolboxPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, ToolboxPlugin.PLUGIN_ID, "Impossible to save the transformation result"));
    }
  }
}
