/*******************************************************************************
 * Copyright (c) 2018, 2019  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.data.compare;

import java.util.Comparator;

import org.polarsys.kitalpha.massactions.core.data.convert.MADisplayConverter;

/**
 * A comparator implementation based on the display values instead of the canonical value.
 * 
 * This comparator can be used for sorting and grouping purposes.
 * 
 * Developers can extends this class in order to implement their own behavior.
 * 
 * @author Sandu Postaru
 * 
 */
public class MADisplayComparator implements Comparator<Object> {

  protected MADisplayConverter displayConverter;

  public MADisplayComparator(MADisplayConverter displayConverter) {
    this.displayConverter = displayConverter;
  }

  public int compare(Object o1, Object o2) {

    if (o1 == null && o2 == null) {
      return 0;
    }
    if (o1 == null) {
      return -1;
    }
    if (o2 == null) {
      return 1;
    }

    String o1DisplayValue = displayConverter.canonicalToDisplayValue(o1);
    String o2DisplayValue = displayConverter.canonicalToDisplayValue(o2);

    // compare the display value
    int stringCompareValue = o1DisplayValue.compareTo(o2DisplayValue);

    // even if the two objects have the same display value but are actually
    // different in nature, we want to reflect this difference in the
    // compare result, because we want them to be grouped as two different
    // categories
    if (stringCompareValue == 0) {

      int hashCompareValue = Integer.compare(o1.hashCode(), o2.hashCode());

      if (hashCompareValue == 0) {
        return o1.equals(o2) ? 0 : 1;
      }

      return hashCompareValue;
    }

    return stringCompareValue;
  }
}
