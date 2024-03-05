/*******************************************************************************
 * Copyright (c) 2018, 2024  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EcorePackage.Literals;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultBigDecimalDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultBigIntegerDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultBooleanDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultByteDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultCharacterDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultDateDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultDoubleDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultFloatDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultIntegerDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultLongDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultShortDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;

/**
 * A display converter helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class DisplayConverterHelper {

  private DisplayConverterHelper() {
    // Exists only to defeat instantiation.
  }

  private static Map<String, IDisplayConverter> displayConverterCache;

  private static void initDisplayConverterCache() {
    displayConverterCache = new HashMap<>();

    displayConverterCache.put(Literals.EBOOLEAN.getName(), new DefaultBooleanDisplayConverter());
    displayConverterCache.put(Literals.EBOOLEAN_OBJECT.getName(), new DefaultBooleanDisplayConverter());
    displayConverterCache.put(Literals.ECHAR.getName(), new DefaultCharacterDisplayConverter());
    displayConverterCache.put(Literals.ECHARACTER_OBJECT.getName(), new DefaultCharacterDisplayConverter());
    displayConverterCache.put(Literals.EDATE.getName(), new DefaultDateDisplayConverter());
    displayConverterCache.put(Literals.ESTRING.getName(), new DefaultDisplayConverter());
    displayConverterCache.put(Literals.EBIG_DECIMAL.getName(), new DefaultBigDecimalDisplayConverter());
    displayConverterCache.put(Literals.EDOUBLE.getName(), new DefaultDoubleDisplayConverter());
    displayConverterCache.put(Literals.EDOUBLE_OBJECT.getName(), new DefaultDoubleDisplayConverter());
    displayConverterCache.put(Literals.EFLOAT.getName(), new DefaultFloatDisplayConverter());
    displayConverterCache.put(Literals.EFLOAT_OBJECT.getName(), new DefaultFloatDisplayConverter());
    displayConverterCache.put(Literals.EBYTE.getName(), new DefaultByteDisplayConverter());
    displayConverterCache.put(Literals.EBYTE_OBJECT.getName(), new DefaultByteDisplayConverter());
    displayConverterCache.put(Literals.EINT.getName(), new DefaultIntegerDisplayConverter());
    displayConverterCache.put(Literals.EINTEGER_OBJECT.getName(), new DefaultIntegerDisplayConverter());
    displayConverterCache.put(Literals.ELONG.getName(), new DefaultLongDisplayConverter());
    displayConverterCache.put(Literals.ELONG_OBJECT.getName(), new DefaultLongDisplayConverter());
    displayConverterCache.put(Literals.EBIG_INTEGER.getName(), new DefaultBigIntegerDisplayConverter());
    displayConverterCache.put(Literals.ESHORT.getName(), new DefaultShortDisplayConverter());
    displayConverterCache.put(Literals.ESHORT_OBJECT.getName(), new DefaultShortDisplayConverter());
  }

  // method sends Null if no display is found
  // meaning that if Null => this cell should not be editable
  public static IDisplayConverter getDisplayConverter(String dataTypeName) {

    if (displayConverterCache == null) {
      initDisplayConverterCache();
    }

    return displayConverterCache.get(dataTypeName);
  }
}
