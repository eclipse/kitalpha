/*******************************************************************************
 * Copyright (c) 2020, 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage.figures;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.internal.helpers.RotativeWorkspaceImageHelper;

/**
 * Rotative figure
 * 
 * @author Yann mortier, Philippe dul
 */
public class RotativeWorkspaceImageFigure extends WorkspaceImageFigure {

	private String path;
	
	private int orientation;

	/**
	 * Creates a rotative image
	 * 
	 * @param path
	 *            the path of the top (also known as PositionConstants.NORTH) image.
	 */
	public RotativeWorkspaceImageFigure(String path) {
		super(RotativeWorkspaceImageHelper.getImage(path, PositionConstants.NORTH));
		this.path = path;
		this.orientation = PositionConstants.NORTH;
	}

	/**
	 * Refresh the figure.
	 * 
	 * @param bundledImage
	 *            the image associated to the figure
	 */
  @Override
	public void refreshFigure(WorkspaceImage bundledImage) {
		if (!bundledImage.getWorkspacePath().equals(path)) {
			path = bundledImage.getWorkspacePath();
			Image image = RotativeWorkspaceImageHelper.getImage(path, orientation);
			if (getImage() != image) {
				setImage(image);
			}
			this.repaint();
		}
	}

	/**
	 * @param orientation one of PositionConstants.WEST, PositionConstants.EAST,
	 *                    PositionConstants.SOUTH, PositionConstants.NORTH
	 */
	public void setOrientation(int orientation) {
		this.orientation = orientation;
		Image image = RotativeWorkspaceImageHelper.getImage(path, orientation);
		if (getImage() != image) {
			setImage(image);
		}
	}

}
