/*******************************************************************************
 * Copyright (c) 2018, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.massactions.tests.ju.test.helpers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Test;
import org.polarsys.kitalpha.massactions.core.helper.CommonFeaturesHelper;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;
import org.polarsys.kitalpha.massactions.tests.ju.model.factory.RandomEntityFactory;

import TestModel.Elf;
import TestModel.Entity;
import TestModel.Man;
import TestModel.Woman;

/**
 * A class that tests the {@link CommonFeaturesHelper} utility class.
 * 
 * @author Sandu Postaru
 *
 */
public class CommonFeaturesTests {

  @Test
  public void commonPossibleFeaturesOneElement() {

    Entity entity = RandomEntityFactory.getInstance().createRandomMan();

    Collection<PossibleFeature> possibleFeatures = CommonFeaturesHelper
        .getCommonPossibleFeatures(Arrays.asList(entity));

    List<EStructuralFeature> entityStructuralFeatures = entity.eClass().getEAllStructuralFeatures().stream()
        .filter(EStructuralFeature::isChangeable).collect(Collectors.toList());

    assertEquals(entityStructuralFeatures.size(), possibleFeatures.size());

    // check that every possible feature is a valid structural feature
    possibleFeatures.forEach(pf -> {
      Predicate<EStructuralFeature> predicate = sf -> sf.getName().equals(pf.getFeatureName())
          && sf.getEType().getName().equals(pf.getFeatureType());

      assertTrue(entityStructuralFeatures.stream().anyMatch(predicate));
    });
  }

  @Test
  public void commonPossibleFeaturesTwoElementsSameSuperType() {

    Entity man = RandomEntityFactory.getInstance().createRandomMan();
    Entity woman = RandomEntityFactory.getInstance().createRandomWoman();

    Collection<PossibleFeature> possibleFeatures = CommonFeaturesHelper
        .getCommonPossibleFeatures(Arrays.asList(man, woman));

    List<EStructuralFeature> entityStructuralFeatures = man.eClass().getEAllStructuralFeatures().stream()
        .filter(EStructuralFeature::isChangeable).collect(Collectors.toList());

    assertEquals(entityStructuralFeatures.size(), possibleFeatures.size());

    // check that every possible feature is a valid structural feature
    possibleFeatures.forEach(pf -> {
      Predicate<EStructuralFeature> predicate = sf -> sf.getName().equals(pf.getFeatureName())
          && sf.getEType().getName().equals(pf.getFeatureType());

      assertTrue(entityStructuralFeatures.stream().anyMatch(predicate));
    });
  }

  @Test
  public void commonPossibleFeaturesTwoElementsDifferentType() {

    Entity man = RandomEntityFactory.getInstance().createRandomMan();
    Entity elf = RandomEntityFactory.getInstance().createRandomElf();

    Collection<PossibleFeature> possibleFeatures = CommonFeaturesHelper
        .getCommonPossibleFeatures(Arrays.asList(man, elf));

    List<EStructuralFeature> entityStructuralFeatures = man.eClass().getEAllStructuralFeatures().stream()
        .filter(EStructuralFeature::isChangeable).collect(Collectors.toList());

    assertNotEquals(entityStructuralFeatures.size(), possibleFeatures.size());
    assertEquals(3, possibleFeatures.size());

    List<String> expectedPossibleFeatureNames = Arrays.asList("name", "age", "sex");
    possibleFeatures.stream().forEach(pf -> assertTrue(expectedPossibleFeatureNames.contains(pf.getFeatureName())));
  }

  @Test
  public void commonFeaturesMap() {
    Woman woman = RandomEntityFactory.getInstance().createRandomWoman();
    Man man = RandomEntityFactory.getInstance().createRandomMan();
    Elf elf = RandomEntityFactory.getInstance().createRandomElf();

    List<EObject> data = Arrays.asList(woman, man, elf);

    // data to compare against
    Collection<PossibleFeature> commonPossibleFeatures = CommonFeaturesHelper.getCommonPossibleFeatures(data);

    Map<String, List<EStructuralFeature>> allCommonFeaturesMap = CommonFeaturesHelper.getAllCommonFeaturesMap(data);

    // tree different classes
    assertEquals(3, allCommonFeaturesMap.keySet().size());

    // all should have the same size => the number of features in common
    allCommonFeaturesMap.values().stream()
        .forEach(features -> assertEquals(commonPossibleFeatures.size(), features.size()));

    // sample structural features
    String sampleClass = allCommonFeaturesMap.keySet().iterator().next();
    List<EStructuralFeature> sampleFeatures = allCommonFeaturesMap.get(sampleClass);

    // all should have the same structural feature at the same index
    for (List<EStructuralFeature> structuralFeatures : allCommonFeaturesMap.values()) {

      for (int i = 0; i < sampleFeatures.size(); i++) {
        assertEquals(sampleFeatures.get(i).getName(), structuralFeatures.get(i).getName());
        assertEquals(sampleFeatures.get(i).getEType().getName(), structuralFeatures.get(i).getEType().getName());
      }
    }
  }

  @Test
  public void sameStructuralFeatureForEachClass() {
    Woman woman = RandomEntityFactory.getInstance().createRandomWoman();
    Man man = RandomEntityFactory.getInstance().createRandomMan();
    Elf elf = RandomEntityFactory.getInstance().createRandomElf();

    List<EObject> data = Arrays.asList(woman, man, elf);

    Collection<PossibleFeature> sampleCommonPossibleFeatures = CommonFeaturesHelper.getCommonPossibleFeatures(data);

    // check that they all have the same name and class as the possible
    // feature
    sampleCommonPossibleFeatures.forEach(possibleFeature -> {
      Map<String, EStructuralFeature> allClassStructuralFeatures = CommonFeaturesHelper
          .getAllClassStructuralFeatures(data, possibleFeature);

      for (EStructuralFeature structuralFeature : allClassStructuralFeatures.values()) {
        assertEquals(possibleFeature.getFeatureName(), structuralFeature.getName());
        assertEquals(possibleFeature.getFeatureType(), structuralFeature.getEType().getName());
      }

    });
  }

}
