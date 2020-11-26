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


package org.polarsys.kitalpha.transposer.transformation.emf.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.transformation.emf.TransposerEMFPlugin;

/**
 * @author GEBHART Guillaume
 * 
 */
public class EmfDomainHelper implements IDomainHelper {

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#getAllDomainMetaclasses()
   */
  @Override
public Collection<Class<?>> getAllDomainMetaclasses() {
    Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
    Set<EClass> allEClasses = getAllEClasses();

    for (EClass eClass : allEClasses) {
      Class<?> instanceClass = eClass.getInstanceClass();
      if (instanceClass != null) {
		classes.add(instanceClass);
	}
    }
    return classes;
  }

  /**
   * @return
   */
  protected Set<EClass> getAllEClasses() {
    Set<EClass> allEClasses = new LinkedHashSet<EClass>();
    for (EPackage ePackage : getEPackages()) {
      addEClasses(ePackage, allEClasses);
    }
    return allEClasses;
  }

  /**
   * @param package_p
   * @param accumulator
   * @return
   */
  private void addEClasses(EPackage package_p, Set<EClass> accumulator_p) {

    for (EClassifier eClassifier : package_p.getEClassifiers()) {
      if (eClassifier instanceof EClass) {
		accumulator_p.add((EClass) eClassifier);
	}
    }

    for (EPackage eSubPackage : package_p.getESubpackages()) {
		addEClasses(eSubPackage, accumulator_p);
	}
  }

  /**
   * @return
   */
  protected Set<EPackage> getEPackages() {
    Set<EPackage> eAllPackages = new LinkedHashSet<EPackage>();
    eAllPackages.add(EcorePackage.eINSTANCE);
    return eAllPackages;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#getAnalysisSources(java.util.Collection)
   */
  @Override
public Collection<Object> getAnalysisSources(Collection<?> selection_p) {
    Collection<Object> eObjectsToAnalyse = new ArrayList<Object>();

    for (Object obj : selection_p) {
      if (obj instanceof EObject) {
        eObjectsToAnalyse.add(obj);
      }
    }
    return eObjectsToAnalyse;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#getDomainMetaclass(java.lang.String)
   */
  @Override
public Class<?> getDomainMetaclass(String name_p) {
    try {
      return Class.forName(name_p);
    } catch (ClassNotFoundException e) {
      TransposerEMFPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, "No Domain Class called : " + name_p, e)); //$NON-NLS-1$
    }
    return null;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#getDomainMetaclass(java.lang.Object)
   */
  @Override
public Class<?> getDomainMetaclass(Object object_p) {
    if (object_p instanceof EObject) {
		return ((EObject) object_p).eClass().getInstanceClass();
	}
    return null;
  }

  @Override
public String getName(Object modelElement_p) {
    if (modelElement_p instanceof ENamedElement) {
		return ((ENamedElement) modelElement_p).getName();
	}

    return ""; //$NON-NLS-1$
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#isDomainFor(java.lang.Object)
   */
  @Override
public boolean isDomainFor(Object object_p) {
    return object_p instanceof EObject;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#isHotSpot(java.lang.Object)
   */
  @Override
public boolean isHotSpot(Object object_p) {
    return object_p instanceof EClass;
  }
}
