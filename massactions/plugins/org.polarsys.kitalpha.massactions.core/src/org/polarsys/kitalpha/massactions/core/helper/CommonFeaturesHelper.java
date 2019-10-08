/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A common features helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class CommonFeaturesHelper {

  private CommonFeaturesHelper() {
    // Exists only to defeat instantiation.
  }

  /**
   * Returns a set of {@link EClass} values extracted from the objects list.
   * 
   * @param objects
   *          the list of objects.
   * @return a collection of {@link EClass} values (containing no duplicates).
   */
  private static Set<EClass> getContainedEClasses(Collection<EObject> objects) {
    return objects.stream().map(EObject::eClass).collect(Collectors.toSet());
  }

  /**
   * Returns a set of {@link PossibleFeature} values for all the {@link EStructuralFeature} elements of the given class.
   * 
   * @param eClass
   *          the class used for the extraction.
   * @return a set of {@link PossibleFeature} values for all the {@link EStructuralFeature} elements of the given class.
   */
  private static Set<PossibleFeature> getAllChangeablePossibleFeatures(EClass eClass) {

    return eClass.getEAllStructuralFeatures().stream().filter(EStructuralFeature::isChangeable)
        .map(PossibleFeature::new).collect(Collectors.toCollection(LinkedHashSet::new));
  }

  /**
   * Returns a set of all the common {@link PossibleFeature} values for the given {@link EClass} elements.
   * 
   * @param eClasses
   *          the {@link EClass} elements.
   * @return a set of all the common {@link PossibleFeature} values for the given {@link EClass} elements.
   */
  private static Set<PossibleFeature> getAllCommonPossibleFeatures(List<EClass> eClasses) {

    if (eClasses.isEmpty()) {
      return Collections.emptySet();
    }

    final EClass initialClass = eClasses.get(0);
    final Set<PossibleFeature> possibleFeatures = getAllChangeablePossibleFeatures(initialClass);

    if (eClasses.size() == 1) {
      return possibleFeatures;
    }

    for (int i = 1; i < eClasses.size(); i++) {

      final EClass nextClass = eClasses.get(i);
      final List<PossibleFeature> nextPossibleFeatures = new ArrayList<>(getAllChangeablePossibleFeatures(nextClass));

      possibleFeatures.retainAll(nextPossibleFeatures);
    }

    return possibleFeatures;
  }

  /**
   * Returns a set of all the common {@link PossibleFeature} values for the given {@link EObject} elements.
   * 
   * @param data
   *          the {@link EObject} elements.
   * @return a set of all the common {@link PossibleFeature} values for the given {@link EObject} elements.
   */
  public static Collection<PossibleFeature> getCommonPossibleFeatures(Collection<EObject> data) {
    List<EClass> containedEClasses = new ArrayList<>(getContainedEClasses(data));

    return getAllCommonPossibleFeatures(containedEClasses);
  }

  /**
   * Returns a map linking the name of a {@link EStructuralFeature} to the actual {@link EStructuralFeature} value, for
   * a specific {@link EClass}.
   * 
   * @param eClass
   *          the {@link EClass} element.
   * @return a map linking the name of a {@link EStructuralFeature} to the actual {@link EStructuralFeature} value, for
   *         a specific {@link EClass}.
   */
  private static Map<String, EStructuralFeature> mapNamesToStructuralFeatures(EClass eClass) {

    return eClass.getEAllStructuralFeatures().stream().collect(Collectors.toMap(EStructuralFeature::getName, f -> f));
  }

  /**
   * For a list of {@link EObject} elements, returns a map linking the various {@link EClass} names of these objects,
   * with their list of common {@link EStructuralFeature} features. The list of features is ordered in the same fashion
   * for all the entries, meaning that at index <code>i</code> the same property is contained for all the map elements.
   * 
   * @param objects
   *          the list of {@link EObject} elements.
   * @return a map linking the various {@link EClass} names of these objects, with their list of common
   *         {@link EStructuralFeature} features.
   */
  public static Map<String, List<EStructuralFeature>> getAllCommonFeaturesMap(List<EObject> objects) {

    if (objects.isEmpty()) {
      return null;
    }

    final List<EClass> containedEClasses = new ArrayList<>(getContainedEClasses(objects));

    final Map<String, List<EStructuralFeature>> commonFeaturesMap = new HashMap<>();

    // Optimization if all the objects are instances of the same class
    if (containedEClasses.size() == 1) {
      final EClass singleEClass = containedEClasses.get(0);
      final List<EStructuralFeature> structuralFeatures = singleEClass.getEAllStructuralFeatures().stream()
          .filter(EStructuralFeature::isChangeable).collect(Collectors.toList());

      commonFeaturesMap.put(singleEClass.getName(), structuralFeatures);

      return commonFeaturesMap;
    }

    List<PossibleFeature> possibleFeatures = new ArrayList<>(getAllCommonPossibleFeatures(containedEClasses));

    // for each possible feature, identify it in the containedEclasses
    for (EClass eClass : containedEClasses) {

      final String eClassName = eClass.getName();
      final Map<String, EStructuralFeature> featureNameMap = mapNamesToStructuralFeatures(eClass);

      final List<EStructuralFeature> commonFeatures = new ArrayList<>();

      for (PossibleFeature possibleFeature : possibleFeatures) {
        final String possibleFeatureName = possibleFeature.getFeatureName();
        final EStructuralFeature actualFeature = featureNameMap.get(possibleFeatureName);

        commonFeatures.add(actualFeature);
      }

      commonFeaturesMap.put(eClassName, commonFeatures);
    }

    return commonFeaturesMap;
  }

  /**
   * For a collection of {@link EObject} and one {@link PossibleFeature} we extract as a set the contained
   * {@link EClass}, and we return a map containing for each class name the associated {@link EStructuralFeature},
   * derived from the {@link PossibleFeature} parameter.
   * 
   * @param data
   *          the collection of {@link EObject} elements.
   * @param feature
   *          the sample feature.
   * @return a map containing for each class name the associated {@link EStructuralFeature}, derived from the
   *         {@link PossibleFeature} parameter.
   */
  public static Map<String, EStructuralFeature> getAllClassStructuralFeatures(Collection<EObject> data,
      PossibleFeature feature) {

    Set<EClass> eClasses = getContainedEClasses(data);
    Map<String, EStructuralFeature> featuresMap = new HashMap<>();

    for (EClass eClass : eClasses) {
      String className = eClass.getName();
      EStructuralFeature structuralFeature = mapNamesToStructuralFeatures(eClass).get(feature.getFeatureName());

      featuresMap.put(className, structuralFeature);
    }

    return featuresMap;
  }

}
