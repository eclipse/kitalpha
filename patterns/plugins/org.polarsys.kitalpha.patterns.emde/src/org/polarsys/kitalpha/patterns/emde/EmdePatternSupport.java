/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
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
   * @param resource a non-null resource
   * @param createIfAbsent whether the instance set should be created if absent
   * @return a pattern instance set extension, non-null if createIfAbsent is true
   */
  @Override
  protected EmdePatternInstanceSet getInstanceSet(
      Resource resource, boolean createIfAbsent) {
    Collection<? super ElementExtension> storageCollection;
    if (resource.getContents().size() == 1 &&
        resource.getContents().get(0) instanceof ExtensibleElement) {
      // Extend root
      storageCollection =
          ((ExtensibleElement)resource.getContents().get(0)).getOwnedExtensions();
    } else {
      // Store set as resource root
      storageCollection = resource.getContents();
    }
    EmdePatternInstanceSet result = null;
    Iterator<? super ElementExtension> it = storageCollection.iterator();
    while (it.hasNext() && result == null) {
      Object current = it.next();
      if (current instanceof EmdePatternInstanceSet)
        result = (EmdePatternInstanceSet)current;
    }
    if (result == null && createIfAbsent) {
      IModelEnvironment env = CorePatternsPlugin.getDefault().getModelEnvironment();
      if(env!=null && env.isModelResource(resource)){
        result = (EmdePatternInstanceSet) env.getOrCreateInstanceSetForModelResource(resource);
      }
      storageCollection.add(result);
    }
    return result;
  }

  /**
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#isApplicableTo(org.eclipse.emf.ecore.EObject)
   */
  @Override
  public boolean isApplicableTo(EObject element) {
    return element instanceof CommonPatternInstance ||
        element instanceof ExtensibleElement;
  }

  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#getModelResource(org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstanceMarker)
   */
  public Resource getModelResource(IPatternInstanceMarker instancesEncoder) {
    EObject root = EcoreUtil.getRootContainer((EObject)instancesEncoder);
    if(root != null)
      return root.eResource();
    return null;
  }

  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#getPatternInstanceEncodingModel(org.eclipse.emf.ecore.EObject)
   */
  public IPatternInstanceMarker getPatternInstanceEncodingModel(
      EObject context) {
    EObject root = EcoreUtil.getRootContainer(context);
    if(root != null)
      return getPatternInstanceEncodingModel(root.eResource());
    return null;
  }

  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.core.api.ext.IPatternSupport#getPatternInstanceEncodingModel(org.eclipse.emf.ecore.resource.Resource)
   */
  public IPatternInstanceMarker getPatternInstanceEncodingModel(
      Resource context) {
    for(EObject obj: context.getContents()){
      if(obj instanceof EmdePatternInstanceSet)
        return (IPatternInstanceMarker) obj;
    }
    return null;
  }

}
