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
package org.polarsys.kitalpha.massactions.visualize.table.layer.groupby;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IColumnAccessor;
import org.eclipse.nebula.widgets.nattable.data.ListDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByDataLayer;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByModel;

import ca.odell.glazedlists.EventList;

/**
 * A custom extension of the {@link GroupByDataLayer}.
 * 
 * @author Sandu Postaru
 *
 */
public class MVGroupByDataLayer extends GroupByDataLayer<EObject> {

  public MVGroupByDataLayer(GroupByModel groupByModel, EventList<EObject> eventList,
      IColumnAccessor<EObject> columnAccessor) {
    super(groupByModel, eventList, columnAccessor);
  }

  @SuppressWarnings("unchecked")
  @Override
  public ListDataProvider<EObject> getDataProvider() {
    return (ListDataProvider<EObject>) super.getDataProvider();
  }

}
