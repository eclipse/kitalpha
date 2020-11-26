/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.column.primitive;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.polarsys.kitalpha.massactions.core.column.AbstractMAColumn;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.helper.CommonFeaturesHelper;
import org.polarsys.kitalpha.massactions.core.helper.DisplayConverterHelper;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;

/**
 * An abstract representation of a {@link IMAColumn}. It configures the internal table registry and takes care of some
 * internal plumbing.
 * 
 * This column displays and updates the value of an {@link EStructuralFeature} for all the table entries. It does that
 * by maintaining a hash-map having as key the row object's class and as value the associated
 * {@link EStructuralFeature}.
 * 
 * You should therefore extend this class if your column is based on a {@link EStructuralFeature}, if that is not the
 * case you should extend {@link AbstractMAColumn} instead.
 * 
 * @author Sandu Postaru
 * 
 */

public class MAPrimitiveColumn extends AbstractMAColumn {

  /**
   * The common possible features for all row objects, that this column is responsible of displaying and updating
   */
  protected PossibleFeature possibleFeature;

  /**
   * A hash-map having as key the row object's class and as value the associated {@link EStructuralFeature}.
   */
  protected Map<String, EStructuralFeature> featureMap;

  public void setPossibleFeature(PossibleFeature possibleFeature) {
    this.possibleFeature = possibleFeature;
    name = possibleFeature.getFeatureName();
    id = name;
  }

  @Override
  public void dataChanged(Collection<EObject> data) {
    featureMap = CommonFeaturesHelper.getAllClassStructuralFeatures(data, possibleFeature);
  }

  @Override
  protected IDisplayConverter createDisplayConverter() {
    return DisplayConverterHelper.getDisplayConverter(possibleFeature.getFeatureType());
  }

  @Override
  public Object getDataValue(EObject rowObject) {
    EStructuralFeature rowObjectFeature = getStructuralFeature(rowObject);
    return rowObject.eGet(rowObjectFeature);
  }

  @Override
  public void setDataValue(EObject rowObject, Object newValue) {
    EStructuralFeature rowObjectFeature = getStructuralFeature(rowObject);
    rowObject.eSet(rowObjectFeature, newValue);
  }

  protected EStructuralFeature getStructuralFeature(EObject rowObject) {
    String rowObjectEClass = rowObject.eClass().getName();
    return featureMap.get(rowObjectEClass);
  }

  public PossibleFeature getPossibleFeature() {
    return possibleFeature;
  }
}
