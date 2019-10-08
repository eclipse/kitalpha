/*******************************************************************************
 * Copyright (c) 2018, 2019  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.edit.command;

import java.util.Collection;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.nebula.widgets.nattable.edit.command.EditSelectionCommand;
import org.eclipse.nebula.widgets.nattable.edit.command.EditSelectionCommandHandler;
import org.eclipse.nebula.widgets.nattable.edit.command.EditUtils;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.massactions.core.data.accessor.IMAColumnPropertyAccessor;

/**
 * A custom edit selection command handler that allows for a more efficient mechanism for editing a selection through
 * the use of the {@link IMAColumnPropertyAccessor#beforeEditSelectionCommand()} and
 * {@link IMAColumnPropertyAccessor#afterEditSelectionCommand()} methods.
 *
 * @author Sandu Postaru
 *
 */
public class MEEditSelectionCommandHandler extends EditSelectionCommandHandler {

  private IMAColumnPropertyAccessor columnPropertyAccessor;
  private SelectionLayer selectionLayer;

  public MEEditSelectionCommandHandler(SelectionLayer selectionLayer,
      IMAColumnPropertyAccessor columnPropertyAccessor) {
    super(selectionLayer);
    this.columnPropertyAccessor = columnPropertyAccessor;
    this.selectionLayer = selectionLayer;
  }

  @Override
  public boolean doCommand(EditSelectionCommand command) {
    boolean performed;
    Collection<ILayerCell> selectedCells = EditUtils.getSelectedCellsForEditing(this.selectionLayer);
    Shell shell = command.getParent() != null ? command.getParent().getShell() : null;

    // Check that all selected cells are editable
    if (!EditUtils.allCellsEditable(selectedCells, command.getConfigRegistry())) {
      MessageDialog.openWarning(shell, "Edit",
          selectedCells.size() > 1 ? "Selected cells are not editable." : "Selected cell is not editable.");
      return true;
    }

    if (selectedCells.size() != 1) {
      // Check that all selected cells have the same ICellEditor and the same IDisplayConverter configured
      if (!(EditUtils.isEditorSame(selectedCells, command.getConfigRegistry())
          && EditUtils.isConverterSame(selectedCells, command.getConfigRegistry()))) {
        MessageDialog.openWarning(shell, "Edit", "Selected cells don't have the same type.");
        return true;
      }
      try {
        // signal the column property accessor that a edit selection
        // command will be issued
        columnPropertyAccessor.beforeEditSelectionCommand();

        // execute the command, this will indirectly call the column
        // property accessor setDataValue method for each element of the
        // selection
        performed = super.doCommand(command);

        // signal the column property accessor that an edit command was
        // issued
        columnPropertyAccessor.afterEditSelectionCommand();
      } finally {

        // signal the column property accessor to clean its internal
        // state
        columnPropertyAccessor.cleanResources();
      }

    } else {
      performed = super.doCommand(command);
    }

    return performed;
  }
}
