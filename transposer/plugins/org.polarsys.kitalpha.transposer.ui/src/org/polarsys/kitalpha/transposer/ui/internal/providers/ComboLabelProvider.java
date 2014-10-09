/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

  public String getText(Object element) {
    if (element instanceof IPurpose) {
      return ((IPurpose) element).getName();
    }
    return null;
  }

}
