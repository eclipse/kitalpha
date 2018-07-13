/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
