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
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage.figures;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SVGWorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.svg.SimpleImageTranscoder;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.internal.helpers.RotativeSVGImageTranscoder;
import org.w3c.dom.Document;

/**
 * A rotative figure
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class RotativeSVGWorkspaceImageFigure extends SVGWorkspaceImageFigure {

    /**
     * One of {@link PositionConstants} among NORTH, SOUTH, EAST, WEST
     */
    private int orientation;

    /**
     * Creates a rotative image. Set private to force the use of static initialization
     * {@linkplain RotativeSVGWorkspaceImageFigure.createImageFigure}.
     */
    private RotativeSVGWorkspaceImageFigure() {
        super();
        orientation = PositionConstants.NORTH;
    }

    public static RotativeSVGWorkspaceImageFigure createImageFigure(final WorkspaceImage image, String path, int orientation) {
        RotativeSVGWorkspaceImageFigure fig = new RotativeSVGWorkspaceImageFigure();
        fig.refreshFigure(image);
        return fig;
    }

    /**
     * @param orientation
     *            one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH,
     *            PositionConstants.NORTH
     */
    public void setOrientation(int orientation) {
        this.orientation = orientation;
        // We need to update the image according to the new orientation 
        ((RotativeSVGImageTranscoder) getTranscoder()).setOrientation(orientation);
        this.contentChanged();
    }

    @Override
    public String getDocumentKey() {
        return super.getDocumentKey() + getOrientation();
    }

    @Override
    protected SimpleImageTranscoder initTranscoder(Document document) {
        // We need a specific transcoder for Rotative images. It will rotate the image acording to the orientation
        RotativeSVGImageTranscoder transcoder = new RotativeSVGImageTranscoder(document);
        transcoder.setOrientation(getOrientation());
        return transcoder;
    }

    /**
     * @return one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH, PositionConstants.NORTH
     */
    protected int getOrientation() {
        return this.orientation;
    }

}
