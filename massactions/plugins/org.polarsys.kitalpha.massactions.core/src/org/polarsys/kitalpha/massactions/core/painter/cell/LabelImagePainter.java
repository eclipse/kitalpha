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
package org.polarsys.kitalpha.massactions.core.painter.cell;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy.GroupByObject;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.painter.cell.ImagePainter;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.massactions.core.helper.EObjectImageProvider;
import org.polarsys.kitalpha.massactions.core.helper.ImageProvider;

/**
 * An image painter based on the the label extracted from an EObject cell data value.
 * 
 * @author Sandu Postaru
 *
 */
public class LabelImagePainter extends ImagePainter {

  protected ImageProvider imageProvider;

  public LabelImagePainter() {
    this.imageProvider = EObjectImageProvider.getInstance();
  }

  public LabelImagePainter(ImageProvider imageProvider) {
    this.imageProvider = imageProvider;
  }

  @Override
  protected Image getImage(ILayerCell cell, IConfigRegistry configRegistry) {

    Image extractedImage = extractImage(cell.getDataValue());

    // if we can't extract an image from the current cell, continue with the
    // default behavior
    return extractedImage != null ? extractedImage : super.getImage(cell, configRegistry);
  }

  protected Image extractImage(Object cellDataValue) {

    if (cellDataValue instanceof EObject) {
      return imageProvider.getImage(cellDataValue);
    } else if (cellDataValue instanceof List<?>) {

      @SuppressWarnings("unchecked")
      List<EObject> cellDataValues = (List<EObject>) cellDataValue;

      if (!cellDataValues.isEmpty()) {
        return imageProvider.getImage(cellDataValues.get(0));
      }
    } else if (cellDataValue instanceof GroupByObject) {
      GroupByObject groupByObject = (GroupByObject) cellDataValue;
      return extractImage(groupByObject.getValue());
    }

    return null;
  }
}
