/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.cadence.ui.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;

/**
 * @author Guillaume Gebhart
 */
public class TableContentProvider implements IStructuredContentProvider {

  private IConfigurationElement[] parameters = null;
  private List<String> strings_p = new ArrayList<String>();

  public TableContentProvider(IConfigurationElement[] parameters) {
    super();
    this.parameters = parameters;

    for (IConfigurationElement c : parameters) {
      strings_p.add(CadenceRegistry.getName(c));
    }
  }

  public Object[] getElements(Object inputElement) {

    if (inputElement instanceof ActivityParameters) {
      ActivityParameters map = (ActivityParameters) inputElement;
      ActivityParameters m = new ActivityParameters();

      for (String parameterID : map.getParametersID()) {
        m.addParameter(map.getParameter(parameterID));
      }

      for (String s : strings_p)
        m.removeParameter(s);

      Object[] objs = m.getParameters().toArray();

      return objs;
    }
    return null;
  }

  public void dispose() {
    // TODO Auto-generated method stub

  }

  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    // TODO Auto-generated method stub

  }

}
