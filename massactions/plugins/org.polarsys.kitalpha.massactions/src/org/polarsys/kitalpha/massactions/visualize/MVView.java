/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.massactions.activator.MAActivator;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.shared.view.MAView;
import org.polarsys.kitalpha.massactions.visualize.table.MVTable;

/**
 * A Mass Visualization view extension of the default {@link MAView}.
 * 
 * @author Sandu Postaru
 *
 */
public class MVView extends MAView {  

  @Override
  public IMATable createTable(Composite parent) {
    return new MVTable(parent);
  }

  @Override
  protected ImageDescriptor getNewViewIconDescriptor() {
    return MAActivator.getDefault().getImageRegistry().getDescriptor(MAActivator.IMAGE_MV_NEW_VIEW);
  }
}
