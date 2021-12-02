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
package org.polarsys.kitalpha.sirius.rotativeimage.figures;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SVGWorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.internal.figure.svg.SimpleImageTranscoder;
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
	private int orientation;

	private String basepath;

	/**
	 * Creates a rotative image. Set private to force the use of static initialization
	 * {@linkplain RotativeSVGWorkspaceImageFigure.createImageFigure}.
	 */
	protected Rotative4ImagesSVGWorkspaceImageFigure() {
		super();
	}

	public static Rotative4ImagesSVGWorkspaceImageFigure createImageFigures(final WorkspaceImage image, String basepath) {
		Rotative4ImagesSVGWorkspaceImageFigure topFigure = Rotative4ImagesSVGWorkspaceImageFigure.createImageFigure(image, basepath, PositionConstants.NORTH);
		Rotative4ImagesSVGWorkspaceImageFigure.createImageFigure(image, basepath, PositionConstants.SOUTH);
		Rotative4ImagesSVGWorkspaceImageFigure.createImageFigure(image, basepath, PositionConstants.EAST);
		Rotative4ImagesSVGWorkspaceImageFigure.createImageFigure(image, basepath, PositionConstants.WEST);
		return topFigure;
	}

	public static Rotative4ImagesSVGWorkspaceImageFigure createImageFigure(WorkspaceImage image, String basepath, int orientation) {
		Rotative4ImagesSVGWorkspaceImageFigure figure = new Rotative4ImagesSVGWorkspaceImageFigure();
		figure.orientation = orientation;
		figure.basepath = basepath;
		figure.refreshFigure(image);
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
		String uri = RotativeWorkspaceImageHelper.get4ImagesDocumentKey(basepath, orientation);
		this.setURI(uri);
		this.contentChanged();
	}

	/**
	 * @param orientation
	 *            one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH,
	 *            PositionConstants.NORTH
	 */
	public void setOrientation(int orientation) {
		this.orientation = orientation;
		this.setURI(this.getDocumentKey());
		this.contentChanged();
	}

	@Override
	public String getDocumentKey() {
		return RotativeWorkspaceImageHelper.get4ImagesDocumentKey(basepath, orientation);
	}

}
