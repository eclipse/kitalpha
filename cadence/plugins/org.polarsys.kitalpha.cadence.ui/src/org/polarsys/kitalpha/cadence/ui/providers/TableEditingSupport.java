/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.providers;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.ui.api.dialog.ITableEditingListener;


/**
 * @author Guillaume Gebhart
 */
public class TableEditingSupport extends EditingSupport {

  private CellEditor editor;
  private Viewer viewer;
  private ITableEditingListener tableEditingListener;
  public TableEditingSupport(ColumnViewer viewer,  ITableEditingListener tableEditingListener) {
    super(viewer);
    this.viewer = viewer;
    this.tableEditingListener = tableEditingListener;
    editor = new TextCellEditor((Composite) viewer.getControl());
  }

  protected boolean canEdit(Object element) {

    return true;
  }

  protected CellEditor getCellEditor(Object element) {

    return editor;
  }

  protected Object getValue(Object element) {
    if (element instanceof GenericParameter) {
      GenericParameter p = (GenericParameter) element;

      if (p.getValue() instanceof String) {
        return p.getValue();
      }
    }
    return ""; //$NON-NLS-1$Erjulcov
    
  }

  @Override
  protected void setValue(Object element, Object value) {
    // String current = (String)element;
    if (element instanceof GenericParameter && ((GenericParameter) element).getValue() instanceof String) {
      GenericParameter<String> p = (GenericParameter<String>) element;
      if (value instanceof String) {
        p.setValue((String) value);
        if (tableEditingListener != null) {
			tableEditingListener.parameterValueChanged();
		}
      }
    }

    viewer.refresh();

  }

}
