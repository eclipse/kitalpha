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
package org.polarsys.kitalpha.massactions.core.editor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.edit.editor.AbstractCellEditor;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.polarsys.kitalpha.massactions.core.control.AbstractMACellControl;
import org.polarsys.kitalpha.massactions.core.helper.CellSelectionHelper;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * Abstract implementation of {@link ICellEditor} that wraps SWT controls to be cell editors. Take a look at the
 * {@link AbstractCellEditor} class for a complete overview.
 * 
 * In our implementation we take care of most of the dirty work and internal plumbing. Note that when the cell editor is
 * activated, all the behavior is delegated to the {@link AbstractMACellControl}.
 * 
 * You should extend this class if your editor is not based on a {@link EStructuralFeature}.
 * 
 * If you editor is based on a {@link EStructuralFeature} you should extend the {@link AbstractMAPrimitiveCellEditor}
 * instead.
 *
 * @author Sandu Postaru
 * 
 */
public abstract class AbstractMACellEditor extends AbstractCellEditor {

  protected IMABodyLayer bodyLayer;
  protected boolean openInDialog;

  /**
   * Contains all the selection and edition logic, created using the
   * {@link AbstractCellEditor#createEditorControl(Composite)}
   */
  protected AbstractMACellControl controller;

  public AbstractMACellEditor(IMABodyLayer bodyLayer) {
    this.bodyLayer = bodyLayer;
    openInDialog = false;
  }

  @Override
  public abstract AbstractMACellControl createEditorControl(Composite parent);

  @Override
  protected Control activateCell(Composite parent, Object originalCanonicalValue) {

    List<EObject> selectedRowObjects = CellSelectionHelper.getSelectedRowObjects(bodyLayer);

    this.controller = createEditorControl(parent);
    this.controller.setSelectedRowObjects(selectedRowObjects);
    this.controller.setCanonicalValue(originalCanonicalValue);

    return controller;
  }

  @Override
  public Object getEditorValue() {
    return controller.getEditorValue();
  }

  @Override
  public void setEditorValue(Object editorValue) {
    controller.setEditorValue(editorValue);
  }

  @Override
  public Object getCanonicalValue() {
    return controller.getCanonicalValue();
  }

  @Override
  public void setCanonicalValue(Object canonicalValue) {
    controller.setCanonicalValue(canonicalValue);
  }

  @Override
  public AbstractMACellControl getEditorControl() {
    return controller;
  }

  public boolean isOpenInDialog() {
    return openInDialog;
  }

}
