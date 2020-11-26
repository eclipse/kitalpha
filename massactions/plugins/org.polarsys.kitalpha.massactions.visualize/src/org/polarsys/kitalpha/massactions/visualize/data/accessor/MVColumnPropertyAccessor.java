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
package org.polarsys.kitalpha.massactions.visualize.data.accessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.data.accessor.AbstractMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider.IMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.extensions.columnprovider.MABasicColumnProvider;
import org.polarsys.kitalpha.massactions.core.helper.CommonFeaturesHelper;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.visualize.extensions.columnprovider.QueryColumnProvider;
import org.polarsys.kitalpha.massactions.visualize.helpers.container.UnfoldedRowObject;
import org.polarsys.kitalpha.massactions.visualize.unfold.MVPerspectiveManager;

/**
 * The column property accessor for the Mass Visualization component, supporting different perspectives on the existing
 * data through the use of the {@link MVPerspectiveManager}.
 * 
 * Note: this column property accessor does not support the edition of the column data.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVColumnPropertyAccessor extends AbstractMAColumnPropertyAccessor {

  private Log log = LogFactory.getLog(MVColumnPropertyAccessor.class);

  protected MVPerspectiveManager perspectiveManager;

  public MVColumnPropertyAccessor(IMABodyLayer bodyLayer) {
    super(bodyLayer);
    perspectiveManager = new MVPerspectiveManager(bodyLayer);

    columnProperties = Collections.emptyList();
    prevColumnProperties = Collections.emptyList();

    initializeColumnProviders();

    // initialize the columns
    dataChanged(bodyLayer.getData());
  }

  private void initializeColumnProviders() {

    Deque<IMAColumnProvider> localColumnProviders = new LinkedList<>();

    IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
    IConfigurationElement[] config = extensionRegistry
        .getConfigurationElementsFor(MACoreActivator.EP_COLUMN_PROVIDER_ID);

    // if exists, it will be added at the beggining of the list
    // ensuring that his columns will be the first to be displayed
    IMAColumnProvider basicColumnProvider = null;

    // if exists, it will be added at the end of the list
    // ensuring that his columns will be the last to be displayed
    IMAColumnProvider queryColumnProvider = null;

    try {
      for (IConfigurationElement element : config) {
        Object o = element.createExecutableExtension("class");

        if (o instanceof IMAColumnProvider) {
          String kind = element.getAttribute(MACoreActivator.EP_COLUMN_PROVDER_KIND_ID);

          if (MACoreActivator.EP_COLUMN_PROVIDER_KIND_VISUALIZATION_VALUE.equals(kind)) {

            IMAColumnProvider columnProvider = (IMAColumnProvider) o;
            columnProvider.setBodyLayer(bodyLayer);

            if (o instanceof MABasicColumnProvider) {
              basicColumnProvider = columnProvider;
            } else if (o instanceof QueryColumnProvider) {
              queryColumnProvider = columnProvider;
            } else {
              // add directly
              localColumnProviders.add(columnProvider);
            }
          }
        }
      }

      // add them to the right order
      if (basicColumnProvider != null) {
        localColumnProviders.addFirst(basicColumnProvider);
      }
      if (queryColumnProvider != null) {
        localColumnProviders.addLast(queryColumnProvider);
      }

    } catch (CoreException e) {
      log.error(e.getMessage());
    }

    columnProviders = new ArrayList<>(localColumnProviders);
  }

  @Override
  public void dataChanged(Collection<EObject> data) {

    Collection<PossibleFeature> possibleFeatures = CommonFeaturesHelper.getCommonPossibleFeatures(data);

    int columnIndex = 0;
    columnList = new ArrayList<>();
    prevColumnProperties = columnProperties;
    columnProperties = new ArrayList<>();
    columnPropertiesIndex = new HashMap<>();

    for (IMAColumnProvider columnProvider : columnProviders) {
      Collection<IMAColumn> extensionColumns = columnProvider.getColumnValues(possibleFeatures, data);

      for (IMAColumn column : extensionColumns) {
        column.setIndex(columnIndex++);
        column.dataChanged(data);
        // The mass visualization tool does not support editable columns
        column.setEditable(false);

        columnProperties.add(column.getName());
        columnPropertiesIndex.put(column.getName(), column.getIndex());
        columnList.add(column);
      }
    }

    // propagate the new data
    perspectiveManager.dataChanged(data);

    // if the data is unfolded -> update
    if (!perspectiveManager.isFolded()) {
      perspectiveManager.unfold(columnList);
    }
  }

  @Override
  public Object getDataValue(EObject rowObject, int columnIndex) {

    if (rowObject instanceof UnfoldedRowObject) {
      UnfoldedRowObject unfoldedEObject = (UnfoldedRowObject) rowObject;
      return unfoldedEObject.getDataValue(columnIndex);
    }

    return columnList.get(columnIndex).getDataValue(rowObject);
  }

  @Override
  public void setDataValue(EObject rowObject, int columnIndex, Object newValue) {
    // The mass visualization tool does not support editable columns.
  }

  /**
   * Cycles through the existing perspectives and updates the underlying data accordingly.
   */
  public void switchPerspective() {
    perspectiveManager.switchPerspective(columnList);

    // notify that the data changed
    bodyLayer.notifyListeners();
  }

  @Override
  public Collection<EObject> getCurrentDataRepresentation() {
    return perspectiveManager.getCurrentPerspectiveData();
  }

  public MVPerspectiveManager getPerspectiveManager() {
    return perspectiveManager;
  }

}
