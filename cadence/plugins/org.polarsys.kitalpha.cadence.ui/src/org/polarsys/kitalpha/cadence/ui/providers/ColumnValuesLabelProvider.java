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
public class ColumnValuesLabelProvider extends ColumnLabelProvider {

  /**
   * 
   * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
   */
  @Override
  public String getText(Object element) {

    if (element instanceof GenericParameter) {
      GenericParameter<?> parameter = (GenericParameter) element;
      Object value = parameter.getValue();
      return value == null ? "" : value.toString(); //$NON-NLS-1$

    }

    return null;
  }

}
