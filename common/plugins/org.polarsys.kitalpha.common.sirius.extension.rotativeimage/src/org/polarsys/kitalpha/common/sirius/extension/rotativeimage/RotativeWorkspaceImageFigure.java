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
import org.eclipse.sirius.diagram.ContainerStyle;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;

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

	/**
	 * Path of workspace image
	 */
	private String path;

	/**
	 * Image loaded which will be rotated
	 */
	private Image root;

	/**
	 * Current position of image (SWT.LEFT, SWT.TOP, SWT.RIGHT, SWT.DOWN)
	 */
	private int position;

	private int mode = 0;
	private final int FOUR_IMAGES = 0;
	private final int ROTATIVE = 1;

	/**
	 * Creates a rotative image
	 * 
	 * @param path
	 *            the path of the top image.
	 */
	public RotativeWorkspaceImageFigure(String path) {
		super(flyWeightImage(path));
		this.path = path;
		this.root = flyWeightImage(path);
		mode = ROTATIVE;
	}

	/**
	 * Creates a rotative image
	 * 
	 * @param path
	 *            the path of the top image.
	 */
	public RotativeWorkspaceImageFigure(String path, Image top, Image left,
			Image bottom, Image right) {
		super(top);
		this.path = path;
		cache.put(path + "_top", top);
		cache.put(path + "_bottom", bottom);
		cache.put(path + "_left", left);
		cache.put(path + "_right", right);
		mode = FOUR_IMAGES;
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
	private Image rotate(Image image, int direction) {
		Image result = null;
		ImageData srcData = image.getImageData();
		int bytesPerPixel = srcData.bytesPerLine / srcData.width;
		int destBytesPerLine = (direction == SWT.DOWN) ? srcData.width
				* bytesPerPixel : srcData.height * bytesPerPixel;
		byte[] newData = new byte[srcData.data.length];

		boolean manageAlpha = srcData.alphaData != null;

		byte[] newAlphaData = null;
		if (manageAlpha)
			newAlphaData = new byte[srcData.alphaData.length];

		ImageData imgData = new ImageData(
				(direction == SWT.DOWN) ? srcData.width : srcData.height,
				(direction == SWT.DOWN) ? srcData.height : srcData.width,
				srcData.depth, srcData.palette, destBytesPerLine, newData);
		if (manageAlpha)
			imgData.alphaData = newAlphaData;
		imgData.alpha = srcData.alpha;
		imgData.palette = srcData.palette;

		for (int srcY = 0; srcY < srcData.height; srcY++) {
			for (int srcX = 0; srcX < srcData.width; srcX++) {
				int destX = 0, destY = 0;

				switch (direction) {
				case SWT.LEFT: // left 90 degrees
					destX = srcY;
					destY = srcData.width - srcX - 1;
					break;
				case SWT.RIGHT: // right 90 degrees
					destX = srcData.height - srcY - 1;
					destY = srcX;
					break;
				case SWT.DOWN: // 180 degrees
					destX = srcData.width - srcX - 1;
					destY = srcData.height - srcY - 1;
					break;
				}

				imgData.setPixel(destX, destY, srcData.getPixel(srcX, srcY));
				if (manageAlpha)
					imgData
							.setAlpha(destX, destY, srcData
									.getAlpha(srcX, srcY));
			}
		}

		//
		// rotate mask
		if (srcData.maskData != null) {
			imgData.maskData = new byte[srcData.maskData.length];
			for (int i = 0; i < imgData.maskData.length; i++) {

				imgData.maskData[i] = srcData.maskData[i];
			}
		}
		imgData.maskPad = srcData.maskPad;

		return new Image(image.getDevice(), imgData);
	}

	public Image getRightImage() {
		Image img = cache.get(path + "_right");
		if (img == null && mode == ROTATIVE) {
			cache.put(path + "_right", img = rotate(root, SWT.RIGHT));
		}
		return img;
	}

	public Image getLeftImage() {
		Image img = cache.get(path + "_left");
		if (img == null && mode == ROTATIVE) {
			cache.put(path + "_left", img = rotate(root, SWT.LEFT));
		}
		return img;
	}

	public Image getBottomImage() {
		Image img = cache.get(path + "_bottom");
		if (img == null && mode == ROTATIVE) {
			cache.put(path + "_bottom", img = rotate(root, SWT.DOWN));
		}
		return img;
	}

	public Image getTopImage() {
		if (mode == ROTATIVE)
			return root;
		Image img = cache.get(path + "_top");
		return img;
	}

	@Override
	public void setImage(Image image) {
		// FIXME ymortier by pdul - useful ?
		// if (image == left || image == right || image == top || image ==
		// bottom) {
		super.setImage(image);
		// }
	}

	/**
	 * Set the position
	 * 
	 * @param position
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * Refresh the figure.
	 * 
	 * @param bundledImage
	 *            the image associated to the figure
	 */
	public void refreshFigure(final WorkspaceImage bundledImage) {
		if (this.path != bundledImage.getWorkspacePath()) {
			this.path = bundledImage.getWorkspacePath();
			this.root = flyWeightImage(path);
			this.setImage(root);
		}
		this.repaint();
	}

	/**
	 * Refresh the figure.
	 * 
	 * @param containerStyle
	 *            the style of the container
	 */
	public void refreshFigure(final ContainerStyle containerStyle) {

		if (containerStyle instanceof WorkspaceImage) {
			refreshFigure((WorkspaceImage) containerStyle);
		}
	}

}
