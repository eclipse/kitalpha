/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.ui.menu;

import java.util.List;
import java.util.Optional;

import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.event.ColumnInsertEvent;
import org.eclipse.nebula.widgets.nattable.ui.menu.IMenuItemProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.MenuItem;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider.IMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.core.ui.menu.MAMenuItemProviders;
import org.polarsys.kitalpha.massactions.visualize.helpers.LayerExtractionHelper;
import org.polarsys.kitalpha.massactions.visualize.query.IQuery;
import org.polarsys.kitalpha.massactions.visualize.query.QueryRegistry;
import org.polarsys.kitalpha.massactions.visualize.table.layer.groupby.IMVGroupByLayer;
import org.polarsys.kitalpha.massactions.visualize.column.QueryColumn;
import org.polarsys.kitalpha.massactions.visualize.data.accessor.MVColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.visualize.extensions.columnprovider.QueryColumnProvider;

public class MVMenuItemProviders extends MAMenuItemProviders {

  private static final String SWITCH_PERSPECTIVE_COLUMN_MENU_ITEM_TEXT = "Switch perspective";
  private static final String CREATE_QUERY_COLUMN_MENU_ITEM_TEXT = "Select a column query";

  protected MVMenuItemProviders() {
    // Exists only to defeat instantiation.
  }

  public static IMenuItemProvider createQueryColumnMenuItemProvider() {
    return createQueryColumnMenuItemProvider(CREATE_QUERY_COLUMN_MENU_ITEM_TEXT);
  }

  public static IMenuItemProvider createQueryColumnMenuItemProvider(final String menuText) {

    return (natTable, popupMenu) -> {
      MenuItem menuItem = new MenuItem(popupMenu, SWT.PUSH);

      menuItem.setText(menuText);
      menuItem.setEnabled(true);

      menuItem.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent event) {

          // display new Dialog to choose query

          IMVGroupByLayer groupByLayer = LayerExtractionHelper.extractGroupByLayer(natTable);
          IMABodyLayer bodyLayer = groupByLayer.getGridLayer().getBodyLayer();
          IMAColumnPropertyAccessor columnPropertyAccessor = bodyLayer.getColumnPropertyAccessor();
          List<IMAColumnProvider> columnProviders = columnPropertyAccessor.getColumnProviders();

          Optional<QueryColumnProvider> queryColumnProvider = columnProviders.stream()
              .filter(p -> p instanceof QueryColumnProvider).map(p -> (QueryColumnProvider) p).findFirst();

          queryColumnProvider.ifPresent(p -> { // find all the selected column visual positions
            int[] selectedColumnPositions = bodyLayer.getSelectionLayer().getSelectedColumnPositions();

            IQuery query = QueryRegistry.getInstance().getQuery("XXX");

            QueryColumn queryColumn = new QueryColumn();
            queryColumn.setBodyLayer(bodyLayer);
            queryColumn.setQuery(query);
            queryColumn.setParameterColumnPositions(selectedColumnPositions);
            p.addColumn(queryColumn);

            // force the creation of the new column
            groupByLayer.dataChanged(columnPropertyAccessor.getCurrentDataRepresentation());
            DataLayer bodyDataLayer = groupByLayer.getGridLayer().getBodyLayer().getBodyDataLayer();

            // the column will be inserted at the end of the existing columns // this is specified by the contract of
            // the QueryColumnProvider
            int newColumnPosition = bodyLayer.getColumnHideShowLayer().getColumnCount();

            // inform the ui about the new column
            bodyDataLayer.fireLayerEvent(new ColumnInsertEvent(bodyDataLayer, newColumnPosition));

          });

        }
      });
    };
  }

  public static IMenuItemProvider createSwitchPerspectiveColumnMenuItemProvider() {
    return createSwitchPerspectiveColumnMenuItemProvider(SWITCH_PERSPECTIVE_COLUMN_MENU_ITEM_TEXT);
  }

  public static IMenuItemProvider createSwitchPerspectiveColumnMenuItemProvider(final String menuText) {
    return (natTable, popupMenu) -> {
      MenuItem menuItem = new MenuItem(popupMenu, SWT.PUSH);

      menuItem.setText(menuText);
      menuItem.setEnabled(true);
      menuItem.setImage(MACoreActivator.getDefault().getImageRegistry().get(MACoreActivator.IMAGE_SWITCH_PERSPECTIVE));

      menuItem.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(SelectionEvent event) {

          MVColumnPropertyAccessor columnPropertyAccessor = (MVColumnPropertyAccessor) LayerExtractionHelper
              .extractBodyLayer(natTable).getColumnPropertyAccessor();

          columnPropertyAccessor.switchPerspective();
        }
      });
    };
  }

}
