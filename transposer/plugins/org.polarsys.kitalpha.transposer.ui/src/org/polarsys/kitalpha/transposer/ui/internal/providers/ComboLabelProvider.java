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


package org.polarsys.kitalpha.transposer.ui.internal.providers;

import org.eclipse.jface.viewers.LabelProvider;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;

/**
 * 
 * @author Guillaume Gebhart
 *
 */
public class ComboLabelProvider extends LabelProvider {

  @Override
public String getText(Object element) {
    if (element instanceof IPurpose) {
      return ((IPurpose) element).getName();
    }
    return null;
  }

}
