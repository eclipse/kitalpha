/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.providers;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;

/**
 * @author Guillaume Gebhart
 */
public class ColumnParametersLabelProvider extends ColumnLabelProvider {

  public String getText(Object element) {

    if (element instanceof GenericParameter) {
      return ((GenericParameter) element).getName();

    }
    return null;
  }

  public String getToolTipText(Object element) {
    String description = null;
//    if (element instanceof Map.Entry) {
//      Map.Entry entry = (Map.Entry) element;

      if (element instanceof GenericParameter) {
        description = ((GenericParameter) element).getDescription();

      } else {
        description = element.toString();
      }
   // }
    return description;
  }

}
