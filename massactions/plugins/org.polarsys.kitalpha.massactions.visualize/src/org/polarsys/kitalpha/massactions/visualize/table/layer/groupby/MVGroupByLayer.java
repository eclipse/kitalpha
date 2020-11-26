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
package org.polarsys.kitalpha.massactions.visualize.table.layer.groupby;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByHeaderLayer;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByModel;
import org.eclipse.nebula.widgets.nattable.hideshow.event.HideColumnPositionsEvent;
import org.eclipse.nebula.widgets.nattable.hideshow.event.ShowColumnPositionsEvent;
import org.eclipse.nebula.widgets.nattable.layer.CompositeLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayerListener;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.data.provider.ColumnHeaderDelegateDataProvider;
import org.polarsys.kitalpha.massactions.core.table.factory.IMAFactory;
import org.polarsys.kitalpha.massactions.core.table.layer.column.IMAColumnHeaderLayer;
import org.polarsys.kitalpha.massactions.core.table.layer.grid.IMAGridLayer;
import org.polarsys.kitalpha.massactions.visualize.data.accessor.MVColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.visualize.table.layer.body.MVBodyLayer;
import org.polarsys.kitalpha.massactions.visualize.unfold.MVPerspectiveManager;

/**
 * Default implementation of the {@link IMVGroupByLayer}.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVGroupByLayer extends CompositeLayer implements IMVGroupByLayer {

  private static final Log log = LogFactory.getLog(MVGroupByLayer.class);
  private static final String AT_INDEX = "] at index [";
  
  protected IMAGridLayer gridLayerStack;
  protected GroupByHeaderLayer groupByHeaderLayer;
  protected MVBodyLayer bodyLayerStack;
  protected GroupByModel groupByModel;

  protected List<String> prevColumnNames;
  protected MVColumnPropertyAccessor columnPropertyAccessor;

  /**
   * The FoldedEOChangedListener to install on each folded table element.
   */
  protected final FoldedEObjectChangedListener eObjectChangedListener = this.createFoldedEObjectChangedListener();

  /** The HideShowUnfoldListener to install on this layer. */
  protected final ILayerListener columnHideShowListener = this.createColumnHideShowListener();

  public MVGroupByLayer(IMAGridLayer gridLayerStack) {
    super(1, 2);
    this.gridLayerStack = gridLayerStack;

    initializeLayers();

    this.addLayerListener(columnHideShowListener);
  }

  /**
   * Initializes all the component stack using the provided {@link IMAFactory}.
   * 
   * @return the top NatTable layer of the stack that can be build upon by components that inherit from this one.
   */
  protected void initializeLayers() {

    bodyLayerStack = (MVBodyLayer) gridLayerStack.getBodyLayer();

    // install listeners for the objects
    bodyLayerStack.getData().forEach(this::installListener);

    columnPropertyAccessor = bodyLayerStack.getColumnPropertyAccessor();
    groupByModel = bodyLayerStack.getGroupByModel();

    prevColumnNames = columnPropertyAccessor.getColumnProperties();

    IMAColumnHeaderLayer columnHeaderLayerStack = gridLayerStack.getColumnHeaderLayer();
    ColumnHeaderDelegateDataProvider groupByDataProvider = new ColumnHeaderDelegateDataProvider(columnHeaderLayerStack);

    this.groupByHeaderLayer = new GroupByHeaderLayer(groupByModel, gridLayerStack, groupByDataProvider);
    setChildLayer(GroupByHeaderLayer.GROUP_BY_REGION, groupByHeaderLayer, 0, 0);
    setChildLayer("Grid", gridLayerStack, 0, 1);
  }

  @Override
  public void dataChanged(Collection<EObject> data) {

    Set<EObject> newAddedData = new HashSet<>(data);
    newAddedData.removeAll(bodyLayerStack.getData());

    newAddedData.forEach(this::installListener);

    // column data provider changed
    gridLayerStack.dataChanged(data);

    updateGroupedByColumns();

    // this is the final layer, notify that all changes were performed
    bodyLayerStack.notifyListeners();

    prevColumnNames = columnPropertyAccessor.getColumnProperties();
  }

  /**
   * This method updates the grouped by columns when an update is performed. Let <code>x</code> be the previous grouped
   * column. If <code>x</code> is no longer present in the current configuration, then <code>x</code> is removed. If
   * <code>x</code> is present at the same index then the column is kept. If it is present at a new index, the old
   * grouped by column index is removed and a new grouped by column corresponding to the new index is added.
   */
  protected void updateGroupedByColumns() {
    List<Integer> prevGroupedColumns = groupByModel.getGroupByColumnIndexes();

    boolean changeMade = false;

    for (int i = 0; i < prevGroupedColumns.size(); i++) {
      int prevColumnIndex = prevGroupedColumns.get(i);
      String prevColumnName = prevColumnNames.get(prevColumnIndex);
      int currColumnIndex = columnPropertyAccessor.getColumnIndex(prevColumnName);

      // column index changed
      if (currColumnIndex != prevColumnIndex) {
        changeMade = true;

        // if column still present, replace it with the new index
        // note the the direct use of the "set" method, since we want it
        // to be replaced at the same index instead of adding at the end
        if (currColumnIndex != -1) {
          prevGroupedColumns.set(i, currColumnIndex);
          
          log.info("Adding grouped column [" + prevColumnName + AT_INDEX + prevColumnIndex + "]");
        }
        // column not present, remove it
        else {          
          prevGroupedColumns.remove(Integer.valueOf(prevColumnIndex));
          // since an index was removed, decrement the counter to
          // avoid skipping a value
          i--;
          
          log.info("Removing grouped column [" + prevColumnName + AT_INDEX + prevColumnIndex + "]");
        }
      }
    }

    if (changeMade) {
      groupByModel.update();
    }
  }

  protected Adapter installListener(EObject element) {

    List<Adapter> adapters = element.eAdapters();

    // add the object listener if it does not already exists
    if (!adapters.contains(eObjectChangedListener)) {
      adapters.add(eObjectChangedListener);
    }

    return eObjectChangedListener;
  }

  protected void uninstallListener(EObject element, Adapter listener) {
    element.eAdapters().remove(listener);
  }

  @Override
  public IMAGridLayer getGridLayer() {
    return gridLayerStack;
  }

  @Override
  public GroupByHeaderLayer getGroupByHeaderLayer() {
    return groupByHeaderLayer;
  }

  @Override
  public void dispose() {
    // uninstall all the listeners
    bodyLayerStack.getData().forEach(element -> uninstallListener(element, eObjectChangedListener));

    super.dispose();
  }

  /***********************************************/
  /** Listener classes and local factory methods */
  /***********************************************/

  /**
   * A local factory method to produce the HideShowUnfoldListener which will be installed on list elements.
   */
  private ILayerListener createColumnHideShowListener() {
    return new ColumnHideShowListener();
  }

  /**
   * A listener that informs the {@link MVPerspectiveManager} when the underlying column configuration changed.
   * 
   * The unfolded state is computed only for the currently visible columns. This listener listens for
   * {@link HideColumnPositionsEvent} and {@link ShowColumnPositionsEvent} and updates the unfolded object state
   * accordingly.
   * 
   */
  public class ColumnHideShowListener implements ILayerListener {

    @Override
    public void handleLayerEvent(ILayerEvent event) {
      MVPerspectiveManager perspectiveManager = columnPropertyAccessor.getPerspectiveManager();

      if (!perspectiveManager.isFolded()
          && (event instanceof HideColumnPositionsEvent || event instanceof ShowColumnPositionsEvent)) {
        // if the data is unfolded -> update
        List<IMAColumn> columnList = columnPropertyAccessor.getColumnList();
        perspectiveManager.unfold(columnList);

        // NOTE:
        // we need to tell the GroupByDataLayer to update the
        // groupedByColumns if a ColumnEvent occurs.
        updateGroupedByColumns();

        prevColumnNames = columnPropertyAccessor.getColumnProperties();

        bodyLayerStack.notifyListeners();
      }
    }
  }

  /**
   * A local factory method to produce the FoldedObjectChangedListener which will be installed on list elements.
   */
  protected FoldedEObjectChangedListener createFoldedEObjectChangedListener() {
    return new FoldedEObjectChangedListener();
  }

  /**
   * A listener that informs the {@link MVPerspectiveManager} when the underlying data changed.
   * 
   * If the current view is unfolded, this will immediately trigger a re-computation for all the unfolded objects that
   * are based on the notifier.
   * 
   * If the current view is folded, the object is simply added to the exiting dirty object list and the re-computation
   * will be triggered when the user will pass to a unfolded perspective.
   *
   */
  public class FoldedEObjectChangedListener extends AdapterImpl {

    private void objectChangedAction(Object notifier) {
      MVPerspectiveManager perspectiveManager = columnPropertyAccessor.getPerspectiveManager();

      if (perspectiveManager.isFolded()) {
        perspectiveManager.addDirtyElement((EObject) notifier);
      } else {
        perspectiveManager.elementChanged((EObject) notifier);

        // NOTE:
        // we need to tell the GroupByDataLayer to update the
        // groupedByColumns
        updateGroupedByColumns();

        prevColumnNames = columnPropertyAccessor.getColumnProperties();

        bodyLayerStack.notifyListeners();
      }
    }

    @Override
    public void notifyChanged(Notification notification) {

      switch (notification.getEventType()) {

      case Notification.SET:
      case Notification.UNSET:
      case Notification.ADD:
      case Notification.REMOVE:
      case Notification.ADD_MANY:
      case Notification.REMOVE_MANY:
        objectChangedAction(notification.getNotifier());
        break;

      default:
        break;
      }
    }
  }

}
