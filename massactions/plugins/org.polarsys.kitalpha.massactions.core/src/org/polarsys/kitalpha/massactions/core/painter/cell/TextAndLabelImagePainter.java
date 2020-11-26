/*******************************************************************************
 * Copyright (c) 2018, 2019  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
import org.polarsys.kitalpha.massactions.core.helper.EObjectImageProvider;
import org.polarsys.kitalpha.massactions.core.helper.ImageProvider;

/**
 * A text and label image painter.
 * 
 * @author Sandu Postaru
 *
 */
public class TextAndLabelImagePainter extends CellPainterWrapper {

  public TextAndLabelImagePainter() {
    super();
    setWrappedPainter(createTextAndLabelImagePainter(EObjectImageProvider.getInstance()));
  }

  public TextAndLabelImagePainter(ImageProvider imageProvider) {
    super();
    setWrappedPainter(createTextAndLabelImagePainter(imageProvider));
  }

  protected ICellPainter createTextAndLabelImagePainter(ImageProvider imageProvider) {

    ICellPainter labelImagePainter = createLabelImagePainter(imageProvider);
    ICellPainter textAndLabelImagePainter = createTextPainter(labelImagePainter);

    return new PaddingDecorator(textAndLabelImagePainter);
  }

  protected CellPainterDecorator createTextPainter(ICellPainter labelImagePainter) {
    return new CellPainterDecorator(new TextPainter(), CellEdgeEnum.LEFT, labelImagePainter);
  }

  protected PaddingDecorator createLabelImagePainter(ImageProvider imageProvider) {
    return new PaddingDecorator(new LabelImagePainter(imageProvider), 0, 5, 0, 5);
  }

}
