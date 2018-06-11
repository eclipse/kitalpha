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


package org.polarsys.kitalpha.transposer.emf.toolbox.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.emf.toolbox.ToolboxPlugin;
import org.polarsys.kitalpha.transposer.emf.toolbox.api.TransposerUtil;
import org.polarsys.kitalpha.transposer.emf.toolbox.api.dangling.IGenericDanglingConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

/**
 * @author Guillaume Gebhart
 */
public class ModelInitializer implements IActivity, ITransposerWorkflow , IGenericDanglingConstants{

  public static final String ID = "org.polarsys.kitalpha.transposer.emf.toolbox.activities.models.initializer"; //$NON-NLS-1$
  public static final String NSURI = "nsUri"; //$NON-NLS-1$
  public static final String NSURI_DESCRIPTION = "nsUri of the metamodel"; //$NON-NLS-1$
  public static final String ROOT_ELEMENT = "EClass name"; //$NON-NLS-1$
  public static final String DANGLING_ELEMENT_DESCRIPTION = "the name of the EClass that contains all elements created"; //$NON-NLS-1$


  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#run(java.util.Map)
   */
  @Override
@SuppressWarnings({ "unchecked", "cast" })
  public IStatus run(ActivityParameters activityParams_p) {
     
	  
    // extract the parameters from launch configuration.
    Collection selection = (Collection) activityParams_p.getParameter(TRANSPOSER_SELECTION).getValue();
    //Collection analysesSource = (Collection) activityParams_p.getParameter(TRANSPOSER_ANALYSIS_SOURCES).getValue();
  
    final String nsUri = (String) activityParams_p.getParameter(NSURI).getValue();
    
    final String rootS = (String) activityParams_p.getParameter(ROOT_ELEMENT).getValue();
   
    final EObject root = TransposerUtil.createObject(nsUri, rootS);
    final String extension = root.eClass().getEPackage().getName().toLowerCase();
    
    IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();

    String modelPath = ""; //$NON-NLS-1$

    if (selection == null || selection.isEmpty()) { 
      return new Status(IStatus.ERROR, ToolboxPlugin.PLUGIN_ID, "the selection is empty or null");//$NON-NLS-1$
    }

    Object selectedElement = selection.iterator().next();

    final ResourceSet resourceSet = new ResourceSetImpl();

    if (selectedElement instanceof IFile) {

      URI fileURI = URI.createPlatformResourceURI(((IFile) selectedElement).getFullPath().toString(), true);
      Resource resource = (new ResourceSetImpl()).getResource(fileURI, true);

      //si fichier, modification de la selection. 
      // Selection devient la racine du modele.
      if (resource.getContents() != null && !resource.getContents().isEmpty()) {
        EObject project = (EObject) resource.getContents().get(0); // get the root container
        
        selectedElement = project;
        selection.clear();
        selection.add(project);

      }
    }
    if (selectedElement instanceof EObject && ((EObject) selectedElement).eResource() != null) {
      Resource res = ((EObject) selectedElement).eResource();
     String path = res.getURI().toPlatformString(true);
      modelPath = res.getURI().toPlatformString(true).substring(0,path.length() - res.getURI().fileExtension().length())+ extension;
      
    }

    ResourceUtil.createResource(resourceSet, modelPath, null, false);
    resourceSet.getResources().get(0).setTrackingModification(true);
    context.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, resourceSet);

    return Status.OK_STATUS;
  }


  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#getParameters()
   */
  @Override
public Collection<DeclaredParameter> getParameters() {
    Collection<DeclaredParameter> params = new ArrayList<DeclaredParameter>();
    DeclaredParameter param = new DeclaredParameter(NSURI, "", NSURI_DESCRIPTION); //$NON-NLS-1$
    params.add(param);
    param = new DeclaredParameter(ROOT_ELEMENT, "", DANGLING_ELEMENT_DESCRIPTION); //$NON-NLS-1$
    params.add(param);
  
    return params;
  }

  /**
   * @see org.polarsys.kitalpha.cadence.core.api.IActivity#validateParameters(org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters)
   */
  @Override
public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
    Map<String, ParameterError<?>> errors = new HashMap<String, ParameterError<?>>();
    
    boolean isValid = false;
    
    final String nsUri = (String)valuedParameters_p.getParameter(NSURI).getValue();
    isValid = EPackage.Registry.INSTANCE.containsKey(nsUri);
    
    if(!isValid){
      DeclaredParameter p = (DeclaredParameter)valuedParameters_p.getParameter(NSURI);
      errors.put(NSURI, new ParameterError<String>(p, "This uri doesn't exist")); //$NON-NLS-1$
    }
    
    if(isValid){
      EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri);
      final String root = (String)valuedParameters_p.getParameter(ROOT_ELEMENT).getValue();
      if(root!=null){
        EClassifier classifier = ePackage.getEClassifier(root);
        if(classifier==null){
          DeclaredParameter p = (DeclaredParameter)valuedParameters_p.getParameter(ROOT_ELEMENT);
          errors.put(NSURI, new ParameterError<String>(p, "This EClass doesn't exist for this URI")); //$NON-NLS-1$
        }
      }
    }
    return errors;
  }
}
