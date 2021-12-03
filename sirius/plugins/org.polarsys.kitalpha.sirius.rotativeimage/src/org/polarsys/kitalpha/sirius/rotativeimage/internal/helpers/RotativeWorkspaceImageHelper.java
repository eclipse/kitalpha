/*******************************************************************************
 * Copyright (c) 2019, 2021 THALES GLOBAL SERVICES.
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

import java.io.File;

import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.sirius.common.tools.api.resource.FileProvider;
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.polarsys.kitalpha.sirius.rotativeimage.Activator;

/**
 * An utility class to create rotated images and access them. It stores images in the ImageRegistry of this plugin
 */
public class RotativeWorkspaceImageHelper {

	private RotativeWorkspaceImageHelper() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Return an image from the given path.
	 * 
	 * @param path
	 *            {@link org.eclipse.sirius.diagram.WorkspaceImage#getWorkspacePath <em>Workspace Path</em>}</li>
	 * @param orientation
	 *            one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH,
	 *            PositionConstants.NORTH
	 * @return
	 */
	public static Image getImage(String path, int orientation) {
		String key = getKey(path, orientation);

		ImageRegistry registry = Activator.getDefault().getImageRegistry();
		Image image = registry.get(key);
		if (image != null) {
			return image;
		}

		switch (orientation) {
		case PositionConstants.SOUTH:
		case PositionConstants.WEST:
		case PositionConstants.EAST:
			image = rotate(getImage(path, PositionConstants.NORTH), orientation);
			break;
		default:
			image = WorkspaceImageFigure.getImageInstanceFromPath(path);
		}

		if (image != null) {
			registry.put(key, image);
		}
		return image;
	}

	public static Rectangle rotateRectangle(Rectangle rect, int orientation) {
		switch (orientation) {
		case PositionConstants.WEST:
		case PositionConstants.EAST:
			return rect.transpose();
		default:
			return rect;
		}
	}

	public static String get4ImagesDocumentKey(String path, int orientation) {
		String result = getImageURI(getOrientedPath(path, orientation));
		if (result == null) {
			// Default to original file path
			result = getImageURI(path);
		}
		return result;
	}

	/**
	 * Inserts {@code orientation} as "_top", "_bottom", "_left", "_right" between file name in {@code path} and file
	 * extension.
	 * 
	 * @param path
	 * @param orientation
	 *            one of PositionConstants.WEST, PositionConstants.EAST, PositionConstants.SOUTH,
	 *            PositionConstants.NORTH
	 * @return {@code path} with inserted {@code orientation}. If {@code orientation} is not among expected values then
	 *         {@code path} is kepts as is.
	 */
	public static String getOrientedPath(String path, int orientation) {
		int extentionPosition = path.lastIndexOf(".");
		String baseName = path.substring(0, extentionPosition);
		String ext = path.substring(extentionPosition);
		switch (orientation) {
		case PositionConstants.NORTH:
			baseName += "_top";
			break;
		case PositionConstants.SOUTH:
			baseName += "_bottom";
			break;
		case PositionConstants.WEST:
			baseName += "_left";
			break;
		case PositionConstants.EAST:
			baseName += "_right";
			break;
		default:
			// Do nothing to default to baseName
		}
		return baseName + ext;
	}

	private static String getImageURI(String basepath) {
		final File imageFile = FileProvider.getDefault().getFile(new Path(basepath));
		if (imageFile != null && imageFile.exists() && imageFile.canRead()) {
			return imageFile.toURI().toString();
		}
		return null;
	}

	public static void createImage(String mainPath, int orientation) {
		String key = getKey(mainPath, orientation);
		String orientedPath = getOrientedPath(mainPath, orientation);
		ImageRegistry registry = Activator.getDefault().getImageRegistry();
		Image image = registry.get(key);
		if (image == null) {
			image = WorkspaceImageFigure.flyWeightImage(orientedPath);
			registry.put(key, image);
		}
	}

	/**
	 * Rotate an image
	 * 
	 * @param image
	 *            the source
	 * @param orientation
	 *            PositionConstants.WEST will rotate by 90 degrees on the left, PositionConstants.EAST will rotate by 90
	 *            degrees on the right, PositionConstants.SOUTH will rotate by 180 degrees.
	 * @return the rotated image
	 */
	public static Image rotate(Image image, int orientation) {
		if (image == null) {
			// We don't want to rotate a null image
			return null;
		}
		ImageData srcData = image.getImageData();
		int bytesPerPixel = srcData.bytesPerLine / srcData.width;
		byte[] newData = new byte[srcData.data.length];

		boolean isAlpha = srcData.alphaData != null;
		byte[] newAlphaData = null;

		int destBytesPerLine = 0;
		ImageData imgData = null;

		switch (orientation) {
		case PositionConstants.WEST:
		case PositionConstants.EAST:
			destBytesPerLine = srcData.height * bytesPerPixel;
			imgData = new ImageData(srcData.height, srcData.width, srcData.depth, srcData.palette, destBytesPerLine, newData);
			break;
		default:
			// Default behavior for NORTH and SOUTH
			destBytesPerLine = srcData.width * bytesPerPixel;
			imgData = new ImageData(srcData.width, srcData.height, srcData.depth, srcData.palette, destBytesPerLine, newData);
		}

		if (isAlpha) {
			newAlphaData = new byte[srcData.alphaData.length];
			imgData.alphaData = newAlphaData;
		}
		imgData.alpha = srcData.alpha;

		for (int srcY = 0; srcY < srcData.height; srcY++) {
			for (int srcX = 0; srcX < srcData.width; srcX++) {
				int destX;
				int destY;

				switch (orientation) {
				case PositionConstants.WEST: // left 90 degrees
					destX = srcY;
					destY = srcData.width - srcX - 1;
					break;
				case PositionConstants.EAST: // right 90 degrees
					destX = srcData.height - srcY - 1;
					destY = srcX;
					break;
				case PositionConstants.SOUTH: // 180 degrees
					destX = srcData.width - srcX - 1;
					destY = srcData.height - srcY - 1;
					break;
				default:
					destX = srcX;
					destY = srcY;
				}

				imgData.setPixel(destX, destY, srcData.getPixel(srcX, srcY));
				if (isAlpha) {
					imgData.setAlpha(destX, destY, srcData.getAlpha(srcX, srcY));
				}
			}
		}

		return new Image(image.getDevice(), imgData);
	}

	private static String getKey(String path, int orientation) {
		return path + orientation;
	}

}
