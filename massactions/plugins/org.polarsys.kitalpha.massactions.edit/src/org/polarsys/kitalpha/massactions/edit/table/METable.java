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
package org.polarsys.kitalpha.massactions.edit.table;

import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.massactions.core.table.MATable;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.edit.table.factory.MEFactory;

/**
 * An Mass Edition extension of the default {@link MATable}.
 * 
 * @author Sandu Postaru
 *
 */
public class METable extends MATable {

  public METable(Composite parentView) {
    super(parentView);
  }

  @Override
  public IMAFactory createMAFactory() {
    return new MEFactory();
  }

}
