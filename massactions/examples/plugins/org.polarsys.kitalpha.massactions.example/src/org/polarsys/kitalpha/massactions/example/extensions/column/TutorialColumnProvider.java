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
package org.polarsys.kitalpha.massactions.example.extensions.column;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensions.columnprovider.AbstractMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;
import org.polarsys.kitalpha.massactions.example.column.CountColumn;
import org.polarsys.kitalpha.massactions.example.column.TextColumn;

/**
 * An example column provider that adds two new columns. Please note that we follow the documentation, and we avoid
 * creating the columns on each call.
 * 
 * @author Sandu Postaru
 * 
 */
public class TutorialColumnProvider extends AbstractMAColumnProvider {

  private List<IMAColumn> columns;

  public TutorialColumnProvider() {
    columns = new ArrayList<>();
  }

  @Override
  public List<IMAColumn> getColumnValues(Collection<PossibleFeature> commonPossibleFeatures, Collection<EObject> data) {

    if (columns.isEmpty()) {
      CountColumn countColumn = new CountColumn();
      // always set the body layer
      // or else you will get a NPE
      countColumn.setBodyLayer(bodyLayer);
      // always set the column name
      countColumn.setName("Count");
      columns.add(countColumn);

      TextColumn textColumn = new TextColumn();
      // always set the body layer
      // or else you will get a NPE
      textColumn.setBodyLayer(bodyLayer);
      // always set the column name
      textColumn.setName("Text");
      columns.add(textColumn);
    }

    return columns;
  }

}
