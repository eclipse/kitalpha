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
package org.polarsys.kitalpha.massactions.shared.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.export.command.ExportCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.polarsys.kitalpha.massactions.activator.MAActivator;
import org.polarsys.kitalpha.massactions.core.config.IMAConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAConfiguration;
import org.polarsys.kitalpha.massactions.core.config.MAMenuConfiguration;
import org.polarsys.kitalpha.massactions.core.selection.LazyRowSelectionProvider;
import org.polarsys.kitalpha.massactions.core.table.IMATable;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.shared.helper.MASelectionHelper;
import org.polarsys.kitalpha.massactions.shared.messages.Messages;
import org.polarsys.kitalpha.massactions.shared.view.menucreator.MAColumnFilterMenuCreator;

/**
 * A default implementation of a Mass Action view.
 * 
 * @author Sandu Postaru
 *
 */
public abstract class MAView extends ViewPart implements IMAComponent {

  private static final Log log = LogFactory.getLog(MAView.class);
  protected static AtomicLong idGenerator = new AtomicLong();

  // The underlying data, usually a Set in order to ensure that no duplicates
  // are present
  protected Set<EObject> data;

  /**
   * We use the editing domain as a marker for the current elements, in order to prevent the user from having elements
   * from different projects in the view.
   */
  protected TransactionalEditingDomain editingDomain;

  protected IMATable table;

  protected Composite parent;

  protected Action clearViewAction;
  protected Action newViewAction;
  protected Action filterAction;
  protected Action exportToCSVAction;

  protected LazyRowSelectionProvider selectionProvider;

  private static final String COLUMN_HEADER_MENU_SUFFIX = ".columnHeader";
  private static final String ROW_HEADER_MENU_SUFFIX = ".rowHeader";
  private static final String CORNER_MENU_SUFFIX = ".corner";
  private static final String BODY_MENU_SUFFIX = ".body";

  @Override
  public void createPartControl(Composite parent) {

    this.parent = parent;
    data = new LinkedHashSet<>();

    table = createTable(parent);

    configureDropAction();

    configureBarActions();

    configureSelectionProvider();
  }

  public abstract IMATable createTable(Composite parent);

  protected void actionsSetEnabled(boolean enabled) {
    filterAction.setEnabled(enabled);
    clearViewAction.setEnabled(enabled);
    exportToCSVAction.setEnabled(enabled);
  }

  @Override
  public void dataChanged(Collection<EObject> newData) {

    boolean wasInitialized = table.isInitialized();
    data.addAll(newData);

    List<EObject> fastAccessData = new ArrayList<>(data);
    table.dataChanged(fastAccessData);

    if (!wasInitialized) {
      actionsSetEnabled(true);
      selectionProvider.enable();

      layout();
      configureContextMenus();
    }
  }

  protected void configureDropAction() {

    int operations = DND.DROP_MOVE;
    DropTarget target = new DropTarget(parent, operations);

    target.setTransfer(LocalSelectionTransfer.getTransfer());

    target.addDropListener(new DropTargetAdapter() {

      @Override
      public void drop(DropTargetEvent event) {

        ISelection selection = LocalSelectionTransfer.getTransfer().getSelection();
        List<EObject> validSelectionData = MASelectionHelper.getElementsFromSelection(selection);

        if (editingDomain == null) {
          boolean shareTheSameEditingDomain = MASelectionHelper.selectionSharesSameEditingDomain(validSelectionData);

          if (shareTheSameEditingDomain) {
            // initialize the editing domain for the current view
            editingDomain = MASelectionHelper.getEditingDomainForFirstElement(validSelectionData);
          } else {
            event.detail = DND.DROP_NONE;
            return;
          }
        }

        // check if the elements come from the same project as the current existing elements in the view
        if (MASelectionHelper.isEditingDomainEqual(validSelectionData, editingDomain)) {
          dataChanged(validSelectionData);
        } else {
          event.detail = DND.DROP_NONE;
        }
      }
    });
  }

  protected void configureBarActions() {
    IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();

    filterAction = createFilterAction();
    filterAction.setEnabled(false);
    toolBarManager.add(filterAction);

    IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();

    newViewAction = createNewViewAction();
    menuManager.add(newViewAction);

    clearViewAction = createClearViewAction();
    clearViewAction.setEnabled(false);
    menuManager.add(clearViewAction);

    menuManager.add(new Separator());

    exportToCSVAction = createExportToCSVAction();
    exportToCSVAction.setEnabled(false);
    menuManager.add(exportToCSVAction);
  }

  protected Action createClearViewAction() {
    Action action = new Action(Messages.MA_VIEW_CLEAR_TOOLTIP_TEXT) {
      @Override
      public void run() {
        clearView();
      }
    };

    action.setToolTipText(Messages.MA_VIEW_CLEAR_TOOLTIP_TEXT);
    action.setImageDescriptor(MAActivator.getDefault().getImageRegistry().getDescriptor(MAActivator.IMAGE_CLEAR));

    return action;
  }

  protected Action createFilterAction() {
    Action action = new Action(Messages.MA_VIEW_FILTER_TOOLTIP_TEXT, IAction.AS_DROP_DOWN_MENU) {
      @Override
      public void run() {
        // do nothing since all the actions are delegated to the menu
      }
    };

    action.setToolTipText(Messages.MA_VIEW_FILTER_TOOLTIP_TEXT);

    action.setImageDescriptor(MAActivator.getDefault().getImageRegistry().getDescriptor(MAActivator.IMAGE_FILTER));

    action.setMenuCreator(new MAColumnFilterMenuCreator(table));

    return action;
  }

  protected Action createNewViewAction() {
    Action action = new Action(Messages.MA_VIEW_NEW_VIEW_TOOLTIP_TEXT) {

      @Override
      public void run() {

        IWorkbenchPartReference workbenchRef = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
            .getActivePartReference();

        String primaryViewId = workbenchRef.getId();
        String secondaryViewId = getSecondaryViewId();
        
        try {
          MAView view = (MAView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
              .showView(primaryViewId, secondaryViewId, IWorkbenchPage.VIEW_ACTIVATE);
          view.setViewName(getViewName(workbenchRef.getPartName(), secondaryViewId));

        } catch (PartInitException e) {
          log.error(e.getMessage());
        }
      }
    };

    action.setToolTipText(Messages.MA_VIEW_NEW_VIEW_TOOLTIP_TEXT);
    action.setImageDescriptor(MAActivator.getDefault().getImageRegistry().getDescriptor(MAActivator.IMAGE_ADD));

    return action;
  }

  protected Action createExportToCSVAction() {
    Action action = new Action(Messages.MA_VIEW_EXPORT_TO_CSV_TOOLTIP_TEXT) {

      @Override
      public void run() {
        NatTable natTable = table.getNatTable();
        ExportCommand exportCommand = new ExportCommand(natTable.getConfigRegistry(), natTable.getShell());

        natTable.doCommand(exportCommand);
      }
    };

    action.setToolTipText(Messages.MA_VIEW_EXPORT_TO_CSV_TOOLTIP_TEXT);
    action.setImageDescriptor(MAActivator.getDefault().getImageRegistry().getDescriptor(MAActivator.IMAGE_EXPORT_CSV));

    return action;
  }

  protected void configureSelectionProvider() {
    selectionProvider = new LazyRowSelectionProvider(table);
    getViewSite().setSelectionProvider(selectionProvider);
  }

  protected void configureContextMenus() {
    IMAConfiguration configuration = table.getTableBaseConfig();
    if (configuration instanceof MAConfiguration) {
      MAMenuConfiguration config = ((MAConfiguration) configuration).getMenuConfiguration();
      
      getSite().registerContextMenu(getSite().getId() + ROW_HEADER_MENU_SUFFIX, config.getRowHeaderMenuManager(),
          selectionProvider);
      getSite().registerContextMenu(getSite().getId() + COLUMN_HEADER_MENU_SUFFIX, config.getColumnHeaderMenuManager(),
          selectionProvider);
      getSite().registerContextMenu(getSite().getId() + CORNER_MENU_SUFFIX, config.getCornerMenuManager(),
          selectionProvider);
      getSite().registerContextMenu(getSite().getId() + BODY_MENU_SUFFIX, config.getBodyMenuManager(),
          selectionProvider);
    }
  }
  
  public static String getViewName(String baseName, String secondaryViewId) {
    return baseName + " " + secondaryViewId;
  }

  /**
   * Increment and return the id generator.
   * @return
   */
  public static String getSecondaryViewId() {
    return String.valueOf(idGenerator.incrementAndGet());
  }

  protected String getCurrentSecondaryViewId() {
    return String.valueOf(idGenerator.get());
  }

  public void setViewName(String viewName) {
    setPartName(viewName);
  }

  @Override
  public void setFocus() {
    table.setFocus();
  }

  public void layout() {
    parent.layout();
  }

  public void clearView() {
    editingDomain = null;
    data.clear();
    table.dispose();
    actionsSetEnabled(false);
  }

  @Override
  public void dispose() {
    super.dispose();

    table.dispose();
    table = null;

    clearViewAction = null;
    filterAction = null;
    newViewAction = null;
    exportToCSVAction = null;

    selectionProvider = null;
    data = null;
    editingDomain = null;
  }

  public IMATable getTable() {
    return table;
  }

  public Set<EObject> getData() {
    return data;
  }

  /**
   * Returns true if the elements present in the view are linked to the session parameter, false otherwise.
   * 
   * @param session
   *          the session parameter.
   * @return true if the elements present in the view are linked to the session parameter, false otherwise
   */
  public boolean belongsToSession(Session session) {
    return session.getTransactionalEditingDomain().equals(editingDomain);
  }

}