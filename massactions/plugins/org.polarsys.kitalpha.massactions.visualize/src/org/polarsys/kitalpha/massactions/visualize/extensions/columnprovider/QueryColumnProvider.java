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
package org.polarsys.kitalpha.massactions.visualize.extensions.columnprovider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensions.columnprovider.AbstractMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;
import org.polarsys.kitalpha.massactions.visualize.column.QueryColumn;

/**
 * Experimental
 * 
 * @author Sandu Postaru
 *
 */
public class QueryColumnProvider extends AbstractMAColumnProvider {

  protected Collection<IMAColumn> columns;

  public QueryColumnProvider() {
    columns = new ArrayList<>();
  }

  @Override
  public Collection<IMAColumn> getColumnValues(Collection<PossibleFeature> commonPossibleFeatures,
      Collection<EObject> data) {

    return columns;
  }

  public void addColumn(QueryColumn column) {
    column.setBodyLayer(bodyLayer);
    column.setName("XXXX");
    column.setEditable(false);

    columns.add(column);
  }
}
