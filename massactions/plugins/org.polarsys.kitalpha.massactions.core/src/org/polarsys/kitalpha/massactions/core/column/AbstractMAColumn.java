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
package org.polarsys.kitalpha.massactions.core.column;

import java.util.Comparator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.config.CellConfigAttributes;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.config.IEditableRule;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.validate.IDataValidator;
import org.eclipse.nebula.widgets.nattable.edit.EditConfigAttributes;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;
import org.eclipse.nebula.widgets.nattable.layer.cell.ColumnLabelAccumulator;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.sort.SortConfigAttributes;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.polarsys.kitalpha.massactions.core.column.primitive.MAPrimitiveColumn;
import org.polarsys.kitalpha.massactions.core.data.convert.MADisplayConverter;
import org.polarsys.kitalpha.massactions.core.data.error.CustomDialogErrorHandling;
import org.polarsys.kitalpha.massactions.core.data.validate.MADataValidator;
import org.polarsys.kitalpha.massactions.core.editor.AbstractMACellEditor;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * An abstract representation of a {@link IMAColumn}. It configures the internal
 * table registry and takes care of some internal plumbing.
 * 
 * You should extend this class if your column is not based on a
 * {@link EStructuralFeature}, meaning that you manage this column data with a
 * internal data structure.
 * 
 * If you column is based on a {@link EStructuralFeature} you should extend the
 * {@link MAPrimitiveColumn} instead.
 * 
 * Take a look at the <bold>create*</bold> methods in order to decide what
 * features you need to provide for your column. Since the four of them are
 * optional, you should only override them if needed.
 *  
 *  @author Sandu Postaru
 *  
 */
public abstract class AbstractMAColumn implements IMAColumn {

	private static final String SORT_LABEL_PREFIX = "SORT_LABEL_PREFIX_";

	protected String name;
	protected String label;
	protected String sortLabel;
	protected String id;
	protected int index;

	protected boolean editable;

	public AbstractMAColumn() {
		editable = true;
	}

	/**
	 * The body layer of the current Mass Editing table, used for retrieving the
	 * current selection of elements when an edit command is launched.
	 */
	protected IMABodyLayer bodyLayer;

	/**
	 * Creates the cell editor for the current column. In order to easily create
	 * a cell editor, you should generally extends either
	 * {@link AbstractMACellEditor} or {@link AbstractMAPrimitiveCellEditor}.
	 * 
	 * @return the cell editor for the current column
	 */
	protected ICellEditor createCellEditor() {
		// by returning null we force the use of the default cell editor
		return null;
	}

	/**
	 * Creates the data validator for the current column. In order to easily
	 * create a data validator, you should generally extends
	 * {@link MADataValidator}.
	 * 
	 * @return the data validator for the current column
	 */
	protected IDataValidator createDataValidator() {
		// by returning null we force the use of the default data validator
		return null;
	}

	/**
	 * Creates the display converter for the current column. In order to easily
	 * create a display converter, you should generally extend
	 * {@link MADisplayConverter}.
	 * 
	 * @return the display converter for the current column
	 */
	protected IDisplayConverter createDisplayConverter() {
		// by returning null we force the use of the default display converter
		return null;
	}

	/**
	 * Creates the cell painter for the current column.
	 * 
	 * @return the cell painter for the current column
	 */
	protected ICellPainter createCellPainter() {
		// by returning null we force the use of the default cell painter
		return null;
	}

	protected Comparator<Object> createCellComparator() {
		// by returning null we force the use of the default comparator
		return null;
	}

	@Override
	public void configureRegistry(IConfigRegistry configRegistry) {

		if (this.editable) {

			configRegistry.registerConfigAttribute(EditConfigAttributes.VALIDATION_ERROR_HANDLER,
					new CustomDialogErrorHandling(), DisplayMode.EDIT, label);

			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
					IEditableRule.ALWAYS_EDITABLE, DisplayMode.EDIT, label);

			ICellEditor cellEditor = createCellEditor();

			if (cellEditor != null) {

				configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR, cellEditor, DisplayMode.EDIT,
						label);

				// check if the editor should be opened in a dialog or not
				if (cellEditor instanceof AbstractMACellEditor) {
					AbstractMACellEditor meCellEditor = (AbstractMACellEditor) cellEditor;
					boolean openInDialog = meCellEditor.isOpenInDialog();

					configRegistry.registerConfigAttribute(EditConfigAttributes.OPEN_IN_DIALOG, openInDialog,
							DisplayMode.EDIT, label);
				}
			}

			IDataValidator dataValidator = createDataValidator();

			if (dataValidator != null) {
				configRegistry.registerConfigAttribute(EditConfigAttributes.DATA_VALIDATOR, dataValidator,
						DisplayMode.EDIT, label);
			}
		}

		IDisplayConverter displayConverter = createDisplayConverter();

		if (displayConverter != null) {
			configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, displayConverter,
					DisplayMode.NORMAL, label);

			configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, displayConverter,
					DisplayMode.EDIT, label);
		}

		ICellPainter cellPainter = createCellPainter();

		if (cellPainter != null) {
			configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, cellPainter, DisplayMode.NORMAL,
					label);
		}

		Comparator<Object> cellComparator = createCellComparator();

		if (cellComparator != null) {
			configRegistry.registerConfigAttribute(SortConfigAttributes.SORT_COMPARATOR, cellComparator,
					DisplayMode.NORMAL, sortLabel);
		}

	}

	@Override
	public void destroyRegistry(IConfigRegistry configRegistry) {

		configRegistry.unregisterConfigAttribute(EditConfigAttributes.VALIDATION_ERROR_HANDLER, DisplayMode.EDIT,
				label);

		configRegistry.unregisterConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE, DisplayMode.EDIT, label);

		configRegistry.unregisterConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, DisplayMode.NORMAL, label);
		configRegistry.unregisterConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, DisplayMode.EDIT, label);

		configRegistry.unregisterConfigAttribute(EditConfigAttributes.CELL_EDITOR, DisplayMode.EDIT, label);
		configRegistry.unregisterConfigAttribute(EditConfigAttributes.OPEN_IN_DIALOG, DisplayMode.EDIT, label);

		configRegistry.unregisterConfigAttribute(EditConfigAttributes.DATA_VALIDATOR, DisplayMode.EDIT, label);

		configRegistry.unregisterConfigAttribute(CellConfigAttributes.CELL_PAINTER, DisplayMode.NORMAL, label);

		configRegistry.unregisterConfigAttribute(SortConfigAttributes.SORT_COMPARATOR, DisplayMode.NORMAL, label);
	}

	@Override
	public void dispose() {
		// Let the good guy GC do the work.
	}

	@Override
	public void setIndex(int index) {
		this.index = index;
		label = ColumnLabelAccumulator.COLUMN_LABEL_PREFIX + index;
		sortLabel = SORT_LABEL_PREFIX + label;

		// default initialization
		if (name == null) {
			name = label;
			id = label;
		}
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getSortLabel() {
		return sortLabel;
	}

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		this.id = name;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public boolean isEditable() {
		return editable;
	}

	@Override
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public void setBodyLayer(IMABodyLayer bodyLayer) {
    this.bodyLayer = bodyLayer;
  }

}
