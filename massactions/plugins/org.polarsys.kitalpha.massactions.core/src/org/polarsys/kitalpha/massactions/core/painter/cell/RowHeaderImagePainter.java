/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
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

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.painter.cell.ImagePainter;

import org.eclipse.swt.graphics.Image;

/**
 * A custom image painter class. This image painter doesn't require an image to be registered at creation time, instead
 * it assumes that the cell value contains the image to be painted.
 * 
 * @author Sandu Postaru
 * 
 */
public class RowHeaderImagePainter extends ImagePainter {

  @Override
  protected Image getImage(ILayerCell cell, IConfigRegistry configRegistry) {

    Object cellDataValue = cell.getDataValue();

    if (cellDataValue instanceof Image) {
      return (Image) cellDataValue;
    }

    // if the cell doesn't contain an image, continue with the default
    // behavior
    return super.getImage(cell, configRegistry);
  }

}
