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


package org.polarsys.kitalpha.transposer.emf.toolbox.api.dangling;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;



/**
 * @author Guillaume Gebhart
 */
public final class DanglingHelper implements IGenericDanglingConstants {

  private static DanglingHelper __instance = new DanglingHelper();


  private EAnnotation _danglingRepository;
  private EObject _danglingModel;

  private DanglingHelper() {
    // Avoid instantiation
  }

  public static DanglingHelper getInstance() {
    return __instance;
  }

 
  public EAnnotation getDanglingRepository() {
    return _danglingRepository;
  }

  public void dispose() {
   _danglingRepository = null;
  }

  public EObject createDanglingRepository(EObject model_p) {
    this.dispose();
    _danglingModel = model_p;
    
    if (model_p instanceof EModelElement) {
      EModelElement modelElement = (EModelElement) model_p;
      _danglingRepository = modelElement.getEAnnotation(ANNOTATION_DANGLING_REPOSITORY);
      if (null == _danglingRepository){
        _danglingRepository =  EcoreFactory.eINSTANCE.createEAnnotation();
        _danglingRepository.setSource(ANNOTATION_DANGLING_REPOSITORY);
        (modelElement).getEAnnotations().add(_danglingRepository);
        _danglingModel = modelElement;
    }
    
    
    
    
    
  }

    return _danglingRepository == null ? _danglingModel : _danglingRepository;
  }

  /**
   * @return the danglingModel
   */
  public EObject getDanglingModel() {
    return _danglingModel;
  }

  /**
   * @param class_p
   * @return
   */
  public void putInDanglingRepository(EObject eObject_p) {
    _danglingRepository.getContents().add(eObject_p);
  }

  
}
