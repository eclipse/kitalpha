/*******************************************************************************
 * Copyright (c) 2007, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.internal;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.common.core.command.FileModificationValidator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramGenerator;
import org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService;
import org.eclipse.sirius.diagram.ui.tools.internal.render.SiriusDiagramImageGenerator;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
/**
 * 
 * @author Faycal Abka
 * @author Arnaud Dieumegard
 *
 */
public class GenDocDiagramEditPartService extends DiagramEditPartService {
	
	public boolean isTooBig(DiagramEditPart diagramEP, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat format){
		DiagramGenerator gen = getDiagramGenerator(diagramEP, format);
		Rectangle rect = gen.calculateImageRectangle(diagramEP.getPrimaryEditParts());
		double factor = getExportResolutionFactor(diagramEP, (SiriusDiagramImageGenerator)gen);
		return (rect.height * factor) * (rect.width * factor) > getMaximumTotalSize() && 
				format != org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.SVG;
	}
	
	public List getDiagramPartInfo(DiagramEditPart diagramEditPart) {
		DiagramGenerator gen = getDiagramGenerator(diagramEditPart, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.JPG);
		return gen.getDiagramPartInfo();
	}
	
	public double getExportResolutionFactor(DiagramEditPart diagramEP) {
		DiagramGenerator gen = getDiagramGenerator(diagramEP, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.JPG);
		return super.getExportResolutionFactor(diagramEP, (SiriusDiagramImageGenerator)gen);
	}
	
	public Rectangle getImageDimension(DiagramEditPart diagramEP){
		return getDiagramGenerator(diagramEP, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat.JPG).calculateImageRectangle(diagramEP.getPrimaryEditParts());
	}

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil#saveToFile(org.eclipse.core.runtime.IPath,
     *      org.eclipse.swt.graphics.Image, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat,
     *      org.eclipse.core.runtime.IProgressMonitor)
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     */
    @Override
    protected void saveToFile(IPath destination, Image image, ImageFileFormat imageFormat, IProgressMonitor monitor) throws CoreException {
        // super.saveToFile(destination, image, imageFormat, monitor);
        IStatus fileModificationStatus = createFile(destination);
        if (!fileModificationStatus.isOK()) {
            // can't write to the file
            return;
        }

        // CHECKSTYLE:OFF (duplicate code from GMF)
        try (FileOutputStream stream = new FileOutputStream(destination.toOSString())) {
            saveToOutputStream(stream, image, imageFormat, monitor);
        } catch (Exception e) {
            SiriusPlugin.getDefault().error(e.getMessage(), e);
            IStatus status = new Status(IStatus.ERROR, "exportToFile", IStatus.OK, //$NON-NLS-1$
                    e.getMessage(), e);
            throw new CoreException(status);
        }
        // CHECKSTYLE:ON

        refreshLocal(destination);
    }

    /**
     * create a file in the workspace if the destination is in a project in the workspace.
     * Copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#createFile}: removes 
     * workspace refresh when the file does not already exists
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     */
    private IStatus createFile(IPath destination) throws CoreException {
        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(destination);
        if (file != null && !file.exists()) {
            File osFile = new File(destination.toOSString());
            if (!osFile.exists()) {
                InputStream input = new ByteArrayInputStream(new byte[0]);
                file.create(input, false, null);
            }
        }

        if (file != null) {
            return FileModificationValidator.approveFileModification(new IFile[] { file });
        }
        return Status.OK_STATUS;
    }

    /**
     * refresh the file in the workspace if the destination is in a project in the workspace.
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#refreshLocal}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     * 
     * @param destination
     *            the destination file.
     * @exception CoreException
     *                if this method fails
     */
    private void refreshLocal(IPath destination) throws CoreException {
        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(destination);
        if (file != null) {
            file.refreshLocal(IResource.DEPTH_ZERO, null);
        }
    }
    
    /**
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#saveToOutputStream}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     */
    private void saveToOutputStream(OutputStream stream, Image image, ImageFileFormat imageFormat, IProgressMonitor monitor) {
        monitor.worked(1);

        ImageData imageData = image.getImageData();
        // In original CopyToImageUtil class, the reduction to a "8BitPalette"
        // or a "WebSafePallette" is for GIF and BMP. For GIF file, it is
        // explicitly constraint by the format characteristic and by an
        // SWT.ERROR_UNSUPPORTED_DEPTH in
        // org.eclipse.swt.internal.image.GIFFileFormat.unloadIntoByteStream(ImageLoader).
        // But for BMP, there is no apparent reason so it is remove for this
        // format.
        if (imageFormat.equals(ImageFileFormat.GIF)) {
            imageData = createImageData(image);
        }

        monitor.worked(1);

        ImageLoader imageLoader = new ImageLoader();
        imageLoader.data = new ImageData[] { imageData };
        imageLoader.logicalScreenHeight = image.getBounds().width;
        imageLoader.logicalScreenHeight = image.getBounds().height;
        if (imageFormat.equals(ImageFileFormat.JPG)) {
            imageLoader.compression = 100;
        }
        imageLoader.save(stream, imageFormat.getOrdinal());

        monitor.worked(1);
    }

    /**
     * Retrieve the image data for the image, using a palette of at most 256 colours.
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#createImageData}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     * 
     * @param image
     *            the SWT image.
     * @return new image data.
     */
    private ImageData createImageData(Image image) {

        ImageData imageData = image.getImageData();

        /**
         * If the image depth is 8 bits or less, then we can use the existing image data.
         */
        if (imageData.depth <= 8) {
            return imageData;
        }

        /**
         * get an 8 bit imageData for the image
         */
        ImageData newImageData = get8BitPaletteImageData(imageData);

        /**
         * if newImageData is null, it has more than 256 colours. Use the web safe pallette to get an 8 bit image data
         * for the image.
         */
        if (newImageData == null) {
            newImageData = getWebSafePalletteImageData(imageData);
        }

        return newImageData;
    }

    /**
     * Retrieve an image data with an 8 bit palette for an image. We assume that the image has less than 256 colours.
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#get8BitPaletteImageData}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     *
     * @param imageData
     *            the imageData for the image.
     * @return the new 8 bit imageData or null if the image has more than 256 colours.
     */
    private ImageData get8BitPaletteImageData(ImageData imageData) {
        PaletteData palette = imageData.palette;
        RGB[] colours = new RGB[256];
        PaletteData newPaletteData = new PaletteData(colours);
        ImageData newImageData = new ImageData(imageData.width, imageData.height, 8, newPaletteData);

        int lastPixel = -1;
        int newPixel = -1;
        for (int i = 0; i < imageData.width; ++i) {
            for (int j = 0; j < imageData.height; ++j) {
                int pixel = imageData.getPixel(i, j);

                if (pixel != lastPixel) {
                    lastPixel = pixel;

                    RGB colour = palette.getRGB(pixel);
                    for (newPixel = 0; newPixel < 256; ++newPixel) {
                        if (colours[newPixel] == null) {
                            colours[newPixel] = colour;
                            break;
                        }
                        if (colours[newPixel].equals(colour)) {
                            break;
                        }
                    }

                    if (newPixel >= 256) {
                        /**
                         * Diagram has more than 256 colors, return null
                         */
                        return null;
                    }
                }

                newImageData.setPixel(i, j, newPixel);
            }
        }

        RGB colour = new RGB(0, 0, 0);
        for (int k = 0; k < 256; ++k) {
            if (colours[k] == null) {
                colours[k] = colour;
            }
        }

        return newImageData;
    }

    /**
     * If the image has less than 256 colours, simply create a new 8 bit palette and map the colours to the new palatte.
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#getWebSafePalletteImageData}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     */
    private ImageData getWebSafePalletteImageData(ImageData imageData) {
        PaletteData palette = imageData.palette;
        RGB[] webSafePallette = getWebSafePallette();
        PaletteData newPaletteData = new PaletteData(webSafePallette);
        ImageData newImageData = new ImageData(imageData.width, imageData.height, 8, newPaletteData);

        int lastPixel = -1;
        int newPixel = -1;
        for (int i = 0; i < imageData.width; ++i) {
            for (int j = 0; j < imageData.height; ++j) {
                int pixel = imageData.getPixel(i, j);

                if (pixel != lastPixel) {
                    lastPixel = pixel;

                    RGB colour = palette.getRGB(pixel);
                    RGB webSafeColour = getWebSafeColour(colour);
                    for (newPixel = 0; newPixel < 256; ++newPixel) {
                        if (webSafePallette[newPixel].equals(webSafeColour)) {
                            break;
                        }
                    }

                    Assert.isTrue(newPixel < 216);
                }
                newImageData.setPixel(i, j, newPixel);
            }
        }

        return newImageData;
    }

    /**
     * Retrieves a web safe colour that closely matches the provided colour.
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#getWebSafeColour}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     *
     * @param colour
     *            a colour.
     * @return the web safe colour.
     */
    private RGB getWebSafeColour(RGB colour) {
        int red = Math.round((colour.red + 25) / 51) * 51;
        int green = Math.round((colour.green + 25) / 51) * 51;
        int blue = Math.round((colour.blue + 25) / 51) * 51;
        return new RGB(red, green, blue);
    }

    /**
     * Retrieves a web safe pallette. Our palette will be 216 web safe colours and the remaining filled with white.
     * Raw copy of {@link org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService#getWebSafePallette}
     * 
     * TODO API copied for Bug {@link https://bugs.polarsys.org/show_bug.cgi?id=2672}. To remove when Sirius bug is fixed.
     * 
     * @return array of 256 colours.
     */
    private RGB[] getWebSafePallette() {
        RGB[] colours = new RGB[256];
        int i = 0;
        for (int red = 0; red <= 255; red = red + 51) {
            for (int green = 0; green <= 255; green = green + 51) {
                for (int blue = 0; blue <= 255; blue = blue + 51) {
                    RGB colour = new RGB(red, green, blue);
                    colours[i++] = colour;
                }
            }
        }

        RGB colour = new RGB(0, 0, 0);
        for (int k = 0; k < 256; ++k) {
            if (colours[k] == null) {
                colours[k] = colour;
            }
        }

        return colours;
    }
}