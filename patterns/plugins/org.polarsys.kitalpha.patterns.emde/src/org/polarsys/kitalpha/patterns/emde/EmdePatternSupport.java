/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.patterns.emde;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.diffmerge.patterns.core.CorePatternsPlugin;
import org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstanceMarker;
import org.eclipse.emf.diffmerge.patterns.core.api.ext.IModelEnvironment;
import org.eclipse.emf.diffmerge.patterns.support.contributions.DefaultPatternSupport;
import org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstance;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;
import org.polarsys.kitalpha.patterns.emde.gen.emdepatternsupport.EmdePatternInstanceSet;

/**
 * This class defines a pattern support which is based on the extension mechanism
 * provided by eMDE.
 */
public class EmdePatternSupport extends DefaultPatternSupport {


  /**
   * Return the instance set in which instances would be stored in the given resource,
   * creating it if required and needed
   * @param resource_p a non-null resource
   * @param createIfAbsent_p whether the instance set should be created if absent
   * @return a pattern instance set extension, non-null if createIfAbsent is true
   */
  @Override
  protected EmdePatternInstanceSet getInstanceSet(
      Resource resource_p, boolean createIfAbsent_p) {
    Collection<? super ElementExtension> storageCollection;
    if (resource_p.getContents().size() == 1 &&
        resource_p.getContents().get(0) instanceof ExtensibleElement) {
      // Extend root
      storageCollection =
          ((ExtensibleElement)resource_p.getContents().get(0)).getOwnedExtensions();
    } else {
      // Store set as resource root
      storageCollection = resource_p.getContents();
    }
    EmdePatternInstanceSet result = null;
    Iterator<? super ElementExtension> it = storageCollection.iterator();
    while (it.hasNext() && result == null) {
      Object current = it.next();
      if (current instanceof EmdePatternInstanceSet)
        result = (EmdePatternInstanceSet)current;
    }
    if (result == null && createIfAbsent_p) {
      IModelEnvironment env = CorePatternsPlugin.getDefault().getModelEnvironment();
      if(env!=null && env.isModelResource(resource_p)){
        result = (EmdePatternInstanceSet) env.getOrCreateInstanceSetForModelResource(resource_p);
      }
      storageCollection.add(result);
    }
    return result;
  }

  /**
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#isApplicableTo(org.eclipse.emf.ecore.EObject)
   */
  @Override
  public boolean isApplicableTo(EObject element_p) {
    return element_p instanceof CommonPatternInstance ||
        element_p instanceof ExtensibleElement;
  }

  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#getModelResource(org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstanceMarker)
   */
  public Resource getModelResource(IPatternInstanceMarker instancesEncoder_p) {
    EObject root = EcoreUtil.getRootContainer((EObject)instancesEncoder_p);
    if(root != null)
      return root.eResource();
    return null;
  }

  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#getPatternInstanceEncodingModel(org.eclipse.emf.ecore.EObject)
   */
  public IPatternInstanceMarker getPatternInstanceEncodingModel(
      EObject context_p) {
    EObject root = EcoreUtil.getRootContainer(context_p);
    if(root != null)
      return getPatternInstanceEncodingModel(root.eResource());
    return null;
  }

  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#getPatternInstanceEncodingModel(org.eclipse.emf.ecore.resource.Resource)
   */
  public IPatternInstanceMarker getPatternInstanceEncodingModel(
      Resource context_p) {
    for(EObject obj: context_p.getContents()){
      if(obj instanceof EmdePatternInstanceSet)
        return (IPatternInstanceMarker) obj;
    }
    return null;
  }

}
