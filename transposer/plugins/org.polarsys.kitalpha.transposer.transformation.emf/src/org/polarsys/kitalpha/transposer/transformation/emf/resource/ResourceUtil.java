/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.transformation.emf.resource;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.transformation.emf.TransposerEMFPlugin;

/**
 * @author GEBHART Guillaume
 * 
 */
public class ResourceUtil {

  public final static String TRANSPOSER_RESOURCE_SET = "TransposerResourceSet"; //$NON-NLS-1$

  /**
   * Load a model/metamodel file from its path
   * 
   * @param uri_p {@link URI} of the ecore file
   * @param storeInOrderToSave true if the URI corresponding resource could be modified and should be saved
   * @return contents of the file in a list.
   */
  public static List<EObject> loadURI(URI uri_p, ResourceSet resourceSet_p) {
    Resource resource = resourceSet_p.getResource(uri_p, true);
    if (resource.isLoaded()) {
      if (resource.getContents().size() > 0) {
        return (resource.getContents());
      }
    }
    return Collections.<EObject> emptyList();
  }

  /**
   * Load a model/metamodel file from its path
   * 
   * @param uriPath path of the ecore file
   * @return Contents of the file in a list.
   */
  public static List<EObject> loadURI(String uriPath_p, ResourceSet resourceSet_p) {
    URI uri = URI.createURI(uriPath_p);
    return loadURI(uri, resourceSet_p);
  }

  /**
   * Load a model/metamodel file from its path
   * 
   * @param uriPath path of the ecore file
   * @return Contents of the file in a list.
   */
  public static List<EObject> loadPlatformResourceURI(String uriPath_p, ResourceSet resourceSet_p) {
    URI uri = URI.createPlatformResourceURI(uriPath_p, true);
    return loadURI(uri, resourceSet_p);
  }

  /**
   * Load a model/metamodel file from its path
   * 
   * @param uriPath path of the ecore file
   * @return Contents of the file in a list.
   */
  public static List<EObject> loadPlatformPluginURI(String uriPath_p, ResourceSet resourceSet_p) {
    URI uri = URI.createPlatformPluginURI(uriPath_p, true);
    return loadURI(uri, resourceSet_p);
  }

  /**
   * @param traceModelPath_p
   * @param rs_p
   * @return
   */
  public static void saveURI(EObject modelTop, String uriPath_p, ResourceSet resourceSet_p) {
    URI uri = URI.createURI(uriPath_p);
    saveURI(modelTop, uri, resourceSet_p);
  }

  /**
   * @param traceModelPath_p
   * @param rs_p
   * @return
   */
  public static void saveResource(Resource res_p) {
    try {
      res_p.save(null);
    } catch (Exception e) {
      String message = "Error happens when saving " + res_p.getURI().toString(); //$NON-NLS-1$                                                
      TransposerEMFPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, message, e));
    }
  }

  /**
   * @param uri_p
   * @param resourceSet_p
   * @return
   */
  public static void saveURI(EObject modelTop, URI uri_p, ResourceSet resourceSet_p) {
    Resource outputResource = resourceSet_p.createResource(uri_p);
    outputResource.getContents().add(modelTop);

    saveResource(outputResource);
  }

  /**
   * 
   * @param resourceSet_p
   * @param resourcePath_p
   * @param root_p
   */
  public static void createResource(ResourceSet resourceSet_p, String resourcePath_p, EObject root_p, boolean saveOnCreation_p) {
    Resource res = resourceSet_p.createResource(URI.createURI(resourcePath_p));
    if(root_p!=null) {
		res.getContents().add(root_p);
	}
    if (saveOnCreation_p) {
      try {
        res.save(new HashMap());
      } catch (Exception e) {
        TransposerCorePlugin.getDefault().logError(TransposerEMFPlugin.PLUGIN_ID, "Error during save of : " + resourcePath_p, e); //$NON-NLS-1$
      }
    }
  }
}
