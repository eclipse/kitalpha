/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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

  @Override
public String getText(Object element) {

    if (element instanceof GenericParameter) {
      return ((GenericParameter) element).getName();

    }
    return null;
  }

  @Override
public String getToolTipText(Object element) {
    String description = null;

      if (element instanceof GenericParameter) {
        description = ((GenericParameter) element).getDescription();

      } else {
        description = element.toString();
      }
    return description;
  }

}
