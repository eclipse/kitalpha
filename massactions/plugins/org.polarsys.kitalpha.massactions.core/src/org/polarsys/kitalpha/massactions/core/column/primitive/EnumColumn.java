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

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.nebula.widgets.nattable.edit.editor.ComboBoxCellEditor;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;
import org.eclipse.nebula.widgets.nattable.painter.cell.ComboBoxPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PaddingDecorator;
import org.polarsys.kitalpha.massactions.core.data.convert.EnumDisplayConverter;

/**
 * An enumeration column that facilitates the display and selection of enum value.
 * 
 * @author Sandu Postaru
 *
 */
public class EnumColumn extends MAPrimitiveColumn {

  @Override
  protected IDisplayConverter createDisplayConverter() {
    return new EnumDisplayConverter();
  }

  @Override
  protected ICellEditor createCellEditor() {

    final EEnum featureType = (EEnum) possibleFeature.getFeature().getEType();

    final List<Enumerator> values = featureType.getELiterals().stream().map(EEnumLiteral::getInstance)
        .collect(Collectors.toList());

    return new ComboBoxCellEditor(values);
  }

  @Override
  protected ICellPainter createCellPainter() {
    return new PaddingDecorator(new ComboBoxPainter(), 0, 5, 0, 5);
  }

}
