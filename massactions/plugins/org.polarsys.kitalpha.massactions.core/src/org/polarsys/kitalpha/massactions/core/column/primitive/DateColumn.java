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
package org.polarsys.kitalpha.massactions.core.column.primitive;

import java.text.SimpleDateFormat;

import org.eclipse.nebula.widgets.nattable.data.convert.DefaultDateDisplayConverter;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.nebula.widgets.nattable.edit.editor.DateCellEditor;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;

/**
 * A date column, using a special display converter that facilitates the selection of a date.
 * 
 * @author Sandu Postaru
 *
 */
public class DateColumn extends MAPrimitiveColumn {

  @Override
  protected ICellEditor createCellEditor() {
    return new DateCellEditor();
  }

  @Override
  protected IDisplayConverter createDisplayConverter() {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");

    return new DefaultDateDisplayConverter(formatter.toPattern());
  }
}
