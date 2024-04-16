/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
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
package org.polarsys.kitalpha.sirius.rotativeimage.figures;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SVGWorkspaceImageFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.internal.helpers.RotativeWorkspaceImageHelper;

/**
 * A rotative figure
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class Rotative4ImagesSVGWorkspaceImageFigure extends SVGWorkspaceImageFigure {

	/**
	 * One of {@link PositionConstants} among NORTH, SOUTH, EAST, WEST
	 */
	private int orientation = PositionConstants.NONE;

	private String basepath;

	/**
	 * Creates a rotative image. Set private to force the use of static initialization
	 * {@linkplain RotativeSVGWorkspaceImageFigure.createImageFigure}.
	 */
	protected Rotative4ImagesSVGWorkspaceImageFigure() {
		super();
	}

	public static Rotative4ImagesSVGWorkspaceImageFigure createImageFigure(WorkspaceImage image, String basepath) {
		Rotative4ImagesSVGWorkspaceImageFigure figure = new Rotative4ImagesSVGWorkspaceImageFigure();
		figure.basepath = basepath;
		return figure;
	}

	/**
	 * refresh the figure.
	 *
	 * @param workspaceImage
	 *            the image associated to the figure
	 */
	@Override
	public void refreshFigure(final WorkspaceImage workspaceImage) {
		if (this.orientation != PositionConstants.NONE) {
			String documentKey = this.getDocumentKey();
			if (!documentKey.equals(this.getURI())) {
				this.setURI(this.getDocumentKey(), false);
				this.contentChanged();
			}
		}
	}

	/**
	 * @param orientation
	 *            one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH,
	 *            PositionConstants.NORTH
	 */
	public void setOrientation(int orientation) {
	    if (this.orientation != orientation) {
    		this.orientation = orientation;
    		refreshFigure(null);
	    }
	}
	
	public int getOrientation() {
		return orientation;
	}

	@Override
	public String getDocumentKey() {
		return RotativeWorkspaceImageHelper.get4ImagesDocumentKey(basepath, orientation);
	}

}
