/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.swt.graphics.Image;

/**
 * Rotative figure
 * 
 * @author Yann mortier, Philippe dul
 */
public class RotativeWorkspaceImageFigure extends WorkspaceImageFigure {

	/**
	 * FIXME Should not be exist, but the cache used into super class is private
	 * and not protected.......
	 */
	private static Map<String, Image> cache = new HashMap<String, Image>();

	private String path;
	
	private int orientation;

	/**
	 * Creates a rotative image
	 * 
	 * @param path
	 *            the path of the top image.
	 */
	public RotativeWorkspaceImageFigure(String path) {
		super(RotativeWorkspaceImageHelper.getImage(path, PositionConstants.NORTH));
		this.path = path;
		this.orientation = PositionConstants.NORTH;
	}

	/**
	 * Creates a rotative image
	 * 
	 * @param path
	 *            the path of the top image.
	 */
	@Deprecated
	public RotativeWorkspaceImageFigure(String path, Image top, Image left, Image bottom, Image right) {
		this(path);
	}

	/**
	 * Refresh the figure.
	 * 
	 * @param bundledImage
	 *            the image associated to the figure
	 */
  @Override
	public void refreshFigure(WorkspaceImage bundledImage) {
		if (path != bundledImage.getWorkspacePath()) {
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

	/**
	 * Rotate an image
	 * 
	 * @param image
	 *            the source
	 * @param direction :
	 *            SWT.LEFT will rotate by 90 degrees on the left, SWT.RIGHT will
	 *            rotate by 90 degrees on the right, SWT.DOWN will rotate by 180
	 *            degrees.
	 * @return the rotated image
	 */

	  @Deprecated
	  public Image getRightImage() {
	    return RotativeWorkspaceImageHelper.getImage(path, PositionConstants.EAST);
	  }
	  
	  @Deprecated
	  public Image getLeftImage() {
	    return RotativeWorkspaceImageHelper.getImage(path, PositionConstants.WEST);
	  }
	  
	  @Deprecated
	  public Image getBottomImage() {
	    return RotativeWorkspaceImageHelper.getImage(path, PositionConstants.SOUTH);
	  }

	  @Deprecated
	  public Image getTopImage() {
	    return RotativeWorkspaceImageHelper.getImage(path, PositionConstants.NORTH);
	  }

}
