/*******************************************************************************
 * Copyright (c) 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.sirius.rotativeimage.junit.tests.testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.ui.internal.refresh.listeners.WorkspaceFileResourceChangeListener;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.diagram.ui.tools.api.image.DiagramImagesPath;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Resource;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.Rotative4ImagesSVGWorkspaceImageFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.RotativeSVGWorkspaceImageFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.RotativeWorkspaceImageFigure;

/**
 * Checks the displayed images in rotative ports. Compares displayed images with Image registers content. PNG images are
 * stored in the static {@link org.polarsys.kitalpha.sirius.rotativeimage.Activator ImageRegistry} SVG images are stored
 * in the static {@link org.eclipse.sirius.diagram.ui.tools.api.figure.SVGFigure.ImageCache}
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class RotativeImageDisplayTest extends RotativeSiriusTest {

  private static final String ID_REPRESENTATION_DESCRIPTOR_SVG = "_idds4E1NEeySgagIY4HK9g";

  private static final String ID_REPRESENTATION_DESCRIPTOR_PNG = "_h9U1ME4GEeyTxN2ah5Tp3g";

  private static final String ID_REPRESENTATION_DESCRIPTOR_FAULTY_4IMAGES = "_xkHCoFKBEeytGcI8gHYSmQ";

  private Map<String, Integer> dDiagramElementToPositionConstantRotationSVG;

  private Map<String, Integer> dDiagramElementToPositionConstantFourImagesSVG;

  private Map<String, Integer> dDiagramElementToPositionConstantRotationPNG;

  private Map<String, Integer> dDiagramElementToPositionConstantFourImagesPNG;

  private Map<String, String> dDiagramElementsToFileExtensionForFauly4Images;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    setPreferenceAutoRefresh(true);
    setPreferenceRefreshOnOpening(true);
    Resource.setNonDisposeHandler(null);
    genericSetUp(TEST_XMI_PATH, TEST_ODESIGN_PATH, TEST_AIRD_PATH);

    // Set test data
    dDiagramElementToPositionConstantFourImagesSVG = new HashMap<>();
    dDiagramElementToPositionConstantFourImagesSVG.put("_ieoKgE1NEeySgagIY4HK9g", PositionConstants.NORTH);
    dDiagramElementToPositionConstantFourImagesSVG.put("_ie8TkE1NEeySgagIY4HK9g", PositionConstants.EAST);
    dDiagramElementToPositionConstantFourImagesSVG.put("_ie-v0E1NEeySgagIY4HK9g", PositionConstants.WEST);
    dDiagramElementToPositionConstantFourImagesSVG.put("_ifBMEE1NEeySgagIY4HK9g", PositionConstants.SOUTH);

    dDiagramElementToPositionConstantRotationSVG = new HashMap<>();
    dDiagramElementToPositionConstantRotationSVG.put("_ZRjK4U6VEey8JIaoK8ucAw", PositionConstants.NORTH);
    dDiagramElementToPositionConstantRotationSVG.put("_ZRoqcU6VEey8JIaoK8ucAw", PositionConstants.EAST);
    dDiagramElementToPositionConstantRotationSVG.put("_ZRrtwU6VEey8JIaoK8ucAw", PositionConstants.WEST);
    dDiagramElementToPositionConstantRotationSVG.put("_ZRuxEk6VEey8JIaoK8ucAw", PositionConstants.SOUTH);

    dDiagramElementToPositionConstantFourImagesPNG = new HashMap<>();
    dDiagramElementToPositionConstantFourImagesPNG.put("_iB9dkU4GEeyTxN2ah5Tp3g", PositionConstants.NORTH);
    dDiagramElementToPositionConstantFourImagesPNG.put("_iCBvAU4GEeyTxN2ah5Tp3g", PositionConstants.EAST);
    dDiagramElementToPositionConstantFourImagesPNG.put("_iCC9IU4GEeyTxN2ah5Tp3g", PositionConstants.WEST);
    dDiagramElementToPositionConstantFourImagesPNG.put("_iCDkMU4GEeyTxN2ah5Tp3g", PositionConstants.SOUTH);

    dDiagramElementToPositionConstantRotationPNG = new HashMap<>();
    dDiagramElementToPositionConstantRotationPNG.put("_bfZigE6VEey8JIaoK8ucAw", PositionConstants.NORTH);
    dDiagramElementToPositionConstantRotationPNG.put("_bfb-wk6VEey8JIaoK8ucAw", PositionConstants.EAST);
    dDiagramElementToPositionConstantRotationPNG.put("_bffCEU6VEey8JIaoK8ucAw", PositionConstants.WEST);
    dDiagramElementToPositionConstantRotationPNG.put("_bfheU06VEey8JIaoK8ucAw", PositionConstants.SOUTH);

    dDiagramElementsToFileExtensionForFauly4Images = new HashMap<>();
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkVsIFKBEeytGcI8gHYSmQ", PNG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkWTMlKBEeytGcI8gHYSmQ", PNG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkWTNlKBEeytGcI8gHYSmQ", PNG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkW6Q1KBEeytGcI8gHYSmQ", PNG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkW6R1KBEeytGcI8gHYSmQ", SVG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkXhUlKBEeytGcI8gHYSmQ", SVG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkXhVlKBEeytGcI8gHYSmQ", SVG);
    dDiagramElementsToFileExtensionForFauly4Images.put("_xkYIYVKBEeytGcI8gHYSmQ", SVG);
  }

  /**
   * Ensure Rotative and 4Images WorkspaceImages reference expected SVG images
   */
  public void testSVGDiagramImages() {
    String repId = ID_REPRESENTATION_DESCRIPTOR_SVG;
    DDiagram ddiagram = getDDiagramFromId(repId);
    DiagramEditor editor = openEditor(ddiagram);

    for (Entry<String, Integer> entry : dDiagramElementToPositionConstantRotationSVG.entrySet()) {
      String elementId = entry.getKey();
      int position = entry.getValue();

      IFigure figure = getFigure(ddiagram, elementId, editor);
      shallBeRotativeOn(figure, position);
    }

    for (Entry<String, Integer> entry : dDiagramElementToPositionConstantFourImagesSVG.entrySet()) {
      String elementId = entry.getKey();
      int position = entry.getValue();

      IFigure figure = getFigure(ddiagram, elementId, editor);
      shallBe4ImagesOn(figure, position);
    }
  }

  private void shallBeRotativeOn(IFigure figure, int position) {
    assertTrue(figure instanceof RotativeSVGWorkspaceImageFigure);

    // Check for SVGImage DocumentKey
    String figureDocumentKey = ((RotativeSVGWorkspaceImageFigure) figure).getDocumentKey();
    assertTrue("Figure should reference uri " + ROTATIONICON_SVG + position + " instead uri is " + figureDocumentKey,
        figureDocumentKey.endsWith(ROTATIONICON_SVG + position));
  }

  /**
   * Ensure Rotative and 4Images WorkspaceImages reference expected PNG images
   */
  public void testPNGDiagramImages() {
    String repId = ID_REPRESENTATION_DESCRIPTOR_PNG;
    DDiagram ddiagram = getDDiagramFromId(repId);
    DiagramEditor editor = openEditor(ddiagram);

    // Ensure displayed images rely on the correct rotated image
    for (Entry<String, Integer> entry : dDiagramElementToPositionConstantRotationPNG.entrySet()) {
      String elementId = entry.getKey();
      int position = entry.getValue();

      // Get the EditPart and the Figure
      IFigure figure = getFigure(ddiagram, elementId, editor);
      assertTrue(figure instanceof RotativeWorkspaceImageFigure);

      Image nonRotatedImage = getImageFromPath(ROTATIONICON_PNG, PNG);
      assertNotNull(nonRotatedImage);
      compareImages((RotativeWorkspaceImageFigure) figure, nonRotatedImage, position);
    }

    // Ensure displayed images rely on the correct 4Images
    for (Entry<String, Integer> entry : dDiagramElementToPositionConstantFourImagesPNG.entrySet()) {
      String elementId = entry.getKey();
      int position = entry.getValue();

      // Get the EditPart and the Figure
      IFigure figure = getFigure(ddiagram, elementId, editor);
      assertTrue(figure instanceof RotativeWorkspaceImageFigure);

      // Get expected image
      Image expectedImage = getImageFromPath(FOURIMAGESICON_PREFIX + buildExpectedImagePostfix(position, PNG), PNG);
      assertNotNull(expectedImage);
      compareImages((RotativeWorkspaceImageFigure) figure, expectedImage, PositionConstants.NORTH);
    }
  }

  /**
   * Ensure 4Images WorkspaceImages reference default WorkspaceImage (the one defined in the odesign) when no postfixed
   * 4image exists (_top, ...)
   */
  public void testFaultyRotativeDiagramImages() {
    String repId = ID_REPRESENTATION_DESCRIPTOR_FAULTY_4IMAGES;
    DDiagram ddiagram = getDDiagramFromId(repId);
    DiagramEditor editor = openEditor(ddiagram);
    for (Entry<String, String> entry : dDiagramElementsToFileExtensionForFauly4Images.entrySet()) {
      String elementId = entry.getKey();
      String extension = entry.getValue();

      IFigure figure = getFigure(ddiagram, elementId, editor);

      if (figure instanceof RotativeWorkspaceImageFigure) {
        // Get expected image
        Image expectedImage = getImageNotFoundImage();
        assertNotNull(expectedImage);
        compareImages((RotativeWorkspaceImageFigure) figure, expectedImage, PositionConstants.NORTH);
      } else {
        String figureDocumentKey = ((Rotative4ImagesSVGWorkspaceImageFigure) figure).getDocumentKey();
        assertTrue("Figure " + entry.getKey() + " should reference uri " + FOURIMAGESICON_ERROR + extension
            + " instead uri is " + figureDocumentKey, figureDocumentKey.endsWith(FOURIMAGESICON_ERROR + extension));
      }
    }
  }

  private Image getImageFromPath(String path, String extension) {
    if (extension.equals(SVG)) {
      return DiagramUIPlugin.getPlugin().getBundledImage(path);
    } else {
      final File imageFile = WorkspaceFileResourceChangeListener.getInstance().getFileFromURI(path);
      ImageDescriptor desc = null;
      if (imageFile != null && WorkspaceFileResourceChangeListener.getInstance().getReadStatusOfFile(imageFile)) {
        try {
          desc = WorkspaceFileResourceChangeListener.getInstance().findImageDescriptor(imageFile);
        } catch (MalformedURLException e) {
          // do nothing
        }
      }
      if (desc != null) {
        return DiagramUIPlugin.getPlugin().getImage(desc);
      } else {
        return getImageNotFoundImage();
      }
    }
  }

  private Image getImageNotFoundImage() {
    return DiagramUIPlugin.getPlugin()
        .getImage(DiagramUIPlugin.Implementation.findImageWithDimensionDescriptor(DiagramImagesPath.IMAGE_NOT_FOUND));
  }

  private DDiagram getDDiagramFromId(String repId) {
    DRepresentationDescriptor desc = getRepresentationDescriptor(session, repId);
    DDiagram ddiagram = (DDiagram) desc.getRepresentation();
    return ddiagram;
  }

  /**
   * Compare images through ImageData comparison. expectedImage may be rotated according to the rotation parameter whose
   * values should be among:
   * <ul>
   * <li>PositionConstants.NORTH: No rotation</li>
   * <li>PositionConstants.EAST: 90°rotation to the right</li>
   * <li>PositionConstants.WEST: 90° rotation to the left</li>
   * <li>PositionConstants.SOUTH: 180° rotation</li>
   * </ul>
   * 
   * @param figure
   * @param nonRotatedOriginalImage
   * @param rotation
   *          The rotation to apply to expectedImage
   */
  private void compareImages(RotativeWorkspaceImageFigure figure, Image nonRotatedOriginalImage, int rotation) {
    ImageData expectedImageData = nonRotatedOriginalImage.getImageData();
    ImageData actualImageData = figure.getImage().getImageData();
    compareImageData(rotation, expectedImageData, actualImageData);
  }

  private void compareImageData(int rotation, ImageData expectedImageData, ImageData actualImageData) {
    for (int x = 0; x < expectedImageData.width; x++) {
      for (int y = 0; y < expectedImageData.height; y++) {
        int expectedX = x;
        int expectedY = y;

        switch (rotation) {
        case PositionConstants.WEST: // left 90 degrees
          expectedX = y;
          expectedY = actualImageData.width - x - 1;
          break;
        case PositionConstants.EAST: // right 90 degrees
          expectedX = actualImageData.height - y - 1;
          expectedY = x;
          break;
        case PositionConstants.SOUTH: // 180 degrees
          expectedX = actualImageData.width - x - 1;
          expectedY = actualImageData.height - y - 1;
          break;
        }
        // The tested image pixel at position rotated matches the original non rotated image
        assertEquals(expectedImageData.getPixel(x, y), actualImageData.getPixel(expectedX, expectedY));
        assertEquals(expectedImageData.getAlpha(x, y), actualImageData.getAlpha(expectedX, expectedY));
      }
    }
  }

}
