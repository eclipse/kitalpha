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
package org.polarsys.kitalpha.massactions.core.painter.cell;

import org.eclipse.nebula.widgets.nattable.painter.cell.CellPainterWrapper;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.TextPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.CellPainterDecorator;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PaddingDecorator;
import org.eclipse.nebula.widgets.nattable.ui.util.CellEdgeEnum;

/**
 * A text and label image painter.
 * 
 * @author Sandu Postaru
 *
 */
public class TextAndLabelImagePainter extends CellPainterWrapper {

  public TextAndLabelImagePainter() {
    super(createTextAndLabelImagePainter());
  }

  private static ICellPainter createTextAndLabelImagePainter() {

    ICellPainter labelImagePainter = new PaddingDecorator(new LabelImagePainter(), 0, 5, 0, 5);
    ICellPainter textAndLabelImagePainter = new CellPainterDecorator(new TextPainter(), CellEdgeEnum.LEFT,
        labelImagePainter);

    return new PaddingDecorator(textAndLabelImagePainter);
  }
}
