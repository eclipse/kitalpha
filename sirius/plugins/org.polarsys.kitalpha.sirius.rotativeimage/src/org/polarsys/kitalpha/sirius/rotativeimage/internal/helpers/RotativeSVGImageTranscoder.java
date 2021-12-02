/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.sirius.rotativeimage.internal.helpers;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SVGFigure;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.svg.SimpleImageTranscoder;
import org.eclipse.swt.graphics.Image;
import org.w3c.dom.Document;

/**
 * This transcoder renders its image and rotates it according to the value of orientation.
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class RotativeSVGImageTranscoder extends SimpleImageTranscoder {

    /**
     * one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH, PositionConstants.NORTH
     */
    private int orientation;

    public RotativeSVGImageTranscoder(Document document) {
        super(document);
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    @Override
    public Image render(SVGFigure fig, Rectangle clientArea, Graphics graphics, boolean scaleImage) {
        Rectangle rotatedRectangle = RotativeWorkspaceImageHelper.rotateRectangle(clientArea, orientation);
        Image image = super.render(fig, rotatedRectangle, graphics, scaleImage);
        return RotativeWorkspaceImageHelper.rotate(image, orientation);
    }

}
