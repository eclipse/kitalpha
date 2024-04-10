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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.diagram.ui.internal.refresh.listeners.WorkspaceFileResourceChangeListener;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.diagram.ui.tools.api.image.DiagramImagesPath;
import org.eclipse.sirius.tests.support.api.SiriusDiagramTestCase;
import org.eclipse.sirius.tests.support.api.TestsUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.ui.PlatformUI;
import org.junit.Assert;
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
public class RotativeImageDisplayTest extends SiriusDiagramTestCase {

	protected static final String PLATFORM_PLUGIN_PATH = "platform:/plugin/";

	protected static final String ROTATIVEIMAGE_TEST_PLUGIN_NAME = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests";

	private static final String TEST_XMI_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.xmi";

	private static final String TEST_AIRD_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.aird";

	private static final String TEST_ODESIGN_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/description/test.odesign";

	private static final String ID_REPRESENTATION_DESCRIPTOR_SVG = "_idds4E1NEeySgagIY4HK9g";

	private static final String ID_REPRESENTATION_DESCRIPTOR_PNG = "_h9U1ME4GEeyTxN2ah5Tp3g";

	private static final String ID_REPRESENTATION_DESCRIPTOR_FAULTY_4IMAGES = "_xkHCoFKBEeytGcI8gHYSmQ";

	private Map<String, Integer> dDiagramElementToPositionConstantRotationSVG;

	private Map<String, Integer> dDiagramElementToPositionConstantFourImagesSVG;

	private Map<String, Integer> dDiagramElementToPositionConstantRotationPNG;

	private Map<String, Integer> dDiagramElementToPositionConstantFourImagesPNG;

	private Map<String, String> dDiagramElementsToFileExtensionForFauly4Images;

	private static final String SVG = ".svg";

	private static final String PNG = ".png";

	private static final String ROTATIONICON = "org.polarsys.kitalpha.sirius.rotativeimage.junit.tests/icons/rotationIcon";

	private static final String ROTATIONICON_SVG = ROTATIONICON + SVG;

	private static final String ROTATIONICON_PNG = ROTATIONICON + PNG;

	private static final String FOURIMAGESICON_PREFIX = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests/icons/4imagesIcon";

	private static final String FOURIMAGESICON_ERROR = FOURIMAGESICON_PREFIX + "_error";

	private static final String TOP = "top";

	private static final String BOTTOM = "bottom";

	private static final String RIGHT = "right";

	private static final String LEFT = "left";

	@Override
	protected void setUp() throws Exception {
		super.setUp();
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
	@SuppressWarnings("restriction")
	public void testSVGDiagramImages() {
		String repId = ID_REPRESENTATION_DESCRIPTOR_SVG;
		DDiagram ddiagram = getDDiagramFromId(repId);
		DialectEditor editor = getEditor(ddiagram);

		for (Entry<String, Integer> entry : dDiagramElementToPositionConstantRotationSVG.entrySet()) {
			String elementId = entry.getKey();
			int position = entry.getValue();

			WorkspaceImageEditPart editPart = getImageEditPart(ddiagram, elementId);
			assertNotNull(editPart);
			RotativeSVGWorkspaceImageFigure figure = (RotativeSVGWorkspaceImageFigure) editPart.getContentPane();
			assertNotNull(figure);

			// Check for SVGImage DocumentKey
			String figureDocumentKey = figure.getDocumentKey();
			assertTrue("Figure " + entry.getKey() + " should reference uri " + ROTATIONICON_SVG + position + " instead uri is " + figureDocumentKey,
					figureDocumentKey.endsWith(ROTATIONICON_SVG + position));
		}

		for (Entry<String, Integer> entry : dDiagramElementToPositionConstantFourImagesSVG.entrySet()) {
			String elementId = entry.getKey();
			int position = entry.getValue();

			WorkspaceImageEditPart editPart = getImageEditPart(ddiagram, elementId);
			assertNotNull(editPart);
			Rotative4ImagesSVGWorkspaceImageFigure figure = (Rotative4ImagesSVGWorkspaceImageFigure) editPart.getContentPane();
			assertNotNull(figure);

			// Check for SVGImage DocumentKey
			String figureDocumentKey = figure.getDocumentKey();
			String postfix = buildExpectedImagePostfix(position, SVG);
			assertTrue("Figure " + entry.getKey() + " should reference uri containing " + FOURIMAGESICON_PREFIX + postfix + " instead uri is " + figureDocumentKey,
					figureDocumentKey.endsWith(FOURIMAGESICON_PREFIX + postfix));
		}
	}
	

	/**
	 * Ensure Rotative and 4Images WorkspaceImages reference expected PNG images
	 */
	@SuppressWarnings("restriction")
	public void testPNGDiagramImages() {
		String repId = ID_REPRESENTATION_DESCRIPTOR_PNG;
		DDiagram ddiagram = getDDiagramFromId(repId);
		DialectEditor editor = getEditor(ddiagram);

		// Ensure displayed images rely on the correct rotated image
		for (Entry<String, Integer> entry : dDiagramElementToPositionConstantRotationPNG.entrySet()) {
			String elementId = entry.getKey();
			int position = entry.getValue();

			// Get the EditPart and the Figure
			WorkspaceImageEditPart editPart = getImageEditPart(ddiagram, elementId);
			assertNotNull(editPart);
			RotativeWorkspaceImageFigure figure = (RotativeWorkspaceImageFigure) editPart.getContentPane();
			assertNotNull(figure);

			Image nonRotatedImage = getImageFromPath(ROTATIONICON_PNG, PNG);
			assertNotNull(nonRotatedImage);
			compareImages(figure, nonRotatedImage, position);
		}

		// Ensure displayed images rely on the correct 4Images
		for (Entry<String, Integer> entry : dDiagramElementToPositionConstantFourImagesPNG.entrySet()) {
			String elementId = entry.getKey();
			int position = entry.getValue();

			// Get the EditPart and the Figure
			WorkspaceImageEditPart editPart = getImageEditPart(ddiagram, elementId);
			assertNotNull(editPart);
			RotativeWorkspaceImageFigure figure = (RotativeWorkspaceImageFigure) editPart.getContentPane();
			assertNotNull(figure);

			// Get expected image
			Image expectedImage = getImageFromPath(FOURIMAGESICON_PREFIX + buildExpectedImagePostfix(position, PNG), PNG);
			assertNotNull(expectedImage);
			compareImages(figure, expectedImage, PositionConstants.NORTH);
		}
	}

	/**
	 * Ensure 4Images WorkspaceImages reference default WorkspaceImage (the one defined in the odesign) when no
	 * postfixed 4image exists (_top, ...)
	 */
	public void testFaultyRotativeDiagramImages() {
		String repId = ID_REPRESENTATION_DESCRIPTOR_FAULTY_4IMAGES;
		DDiagram ddiagram = getDDiagramFromId(repId);
		DialectEditor editor = getEditor(ddiagram);
		for (Entry<String, String> entry : dDiagramElementsToFileExtensionForFauly4Images.entrySet()) {
			String elementId = entry.getKey();
			String extension = entry.getValue();

			IFigure figure = getFigure(ddiagram, elementId);

			if (figure instanceof RotativeWorkspaceImageFigure) {
				// Get expected image
				Image expectedImage = getImageNotFoundImage();
				assertNotNull(expectedImage);
				compareImages((RotativeWorkspaceImageFigure) figure, expectedImage, PositionConstants.NORTH);
			} else {
				String figureDocumentKey = ((Rotative4ImagesSVGWorkspaceImageFigure) figure).getDocumentKey();
				assertTrue("Figure " + entry.getKey() + " should reference uri " + FOURIMAGESICON_ERROR + extension + " instead uri is " + figureDocumentKey,
						figureDocumentKey.endsWith(FOURIMAGESICON_ERROR + extension));
			}
		}
	}

	private DialectEditor getEditor(DDiagram ddiagram) {
		DialectEditor editor = (DialectEditor) DialectUIManager.INSTANCE.openEditor(session, ddiagram, new NullProgressMonitor());
		TestsUtil.synchronizationWithUIThread();
		DialectUIManager.INSTANCE.refreshEditor(editor, new NullProgressMonitor());
		TestsUtil.synchronizationWithUIThread();
		return editor;
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
		return DiagramUIPlugin.getPlugin().getImage(DiagramUIPlugin.Implementation.findImageWithDimensionDescriptor(DiagramImagesPath.IMAGE_NOT_FOUND));
	}

	private IFigure getFigure(DDiagram ddiagram, String elementId) {
		WorkspaceImageEditPart editPart = getImageEditPart(ddiagram, elementId);
		assertNotNull(editPart);
		IFigure figure = editPart.getContentPane();
		assertNotNull(figure);
		return figure;
	}

	private DDiagram getDDiagramFromId(String repId) {
		DRepresentationDescriptor desc = getRepresentationDescriptor(session, repId);
		DDiagram ddiagram = (DDiagram) desc.getRepresentation();
		
		return ddiagram;
	}

	private String buildExpectedImagePostfix(int position, String extension) {
		String postfix = "_";
		switch (position) {
		case PositionConstants.NORTH:
			postfix += TOP;
			break;
		case PositionConstants.EAST:
			postfix += RIGHT;
			break;
		case PositionConstants.WEST:
			postfix += LEFT;
			break;
		case PositionConstants.SOUTH:
			postfix += BOTTOM;
			break;
		}
		postfix += extension;
		return postfix;
	}

	/**
	 * Compare images through ImageData comparison. expectedImage may be rotated according to the rotation parameter
	 * whose values should be among:
	 * <ul>
	 * <li>PositionConstants.NORTH: No rotation</li>
	 * <li>PositionConstants.EAST: 90� rotation to the right</li>
	 * <li>PositionConstants.WEST: 90� rotation to the left</li>
	 * <li>PositionConstants.SOUTH: 180� rotation</li>
	 * </ul>
	 * 
	 * @param figure
	 * @param nonRotatedOriginalImage
	 * @param rotation
	 *            The rotation to apply to expectedImage
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

	@SuppressWarnings({ "unchecked", "restriction" })
	private WorkspaceImageEditPart getImageEditPart(DDiagram ddiagram, String elementId) {
		List<DDiagramElement> diagramElementsFromLabel = getDiagramElementsFromUid(ddiagram, elementId, DDiagramElement.class);
		for (DDiagramElement dDiagramElement : diagramElementsFromLabel) {
			IGraphicalEditPart editPart = getEditPart(dDiagramElement);
			if (editPart instanceof DNode2EditPart) {
				List<WorkspaceImageEditPart> childrens = (List<WorkspaceImageEditPart>) editPart.getChildren().stream().filter(WorkspaceImageEditPart.class::isInstance).collect(Collectors.toList());
				assertNotNull(childrens);
				assertEquals(1, childrens.size());
				return childrens.get(0);
			}

		}
		return null;
	}

	private <T extends DDiagramElement> List<T> getDiagramElementsFromUid(final DDiagram diagram, final String uid, final Class<T> searchedClass) {
		final List<T> found = new ArrayList<>();
		final Iterator<EObject> it = diagram.eAllContents();
		while (it.hasNext()) {
			final EObject cur = it.next();
			if (searchedClass.isInstance(cur) && (uidFeature(cur.eClass()) != null) && uid.equals(getUidValue(cur))) {
				found.add(searchedClass.cast(cur));
			}
		}
		return found;
	}

	private String getUidValue(final EObject cur) {
		return (String) cur.eGet(uidFeature(cur.eClass()));
	}

	private EStructuralFeature uidFeature(final EClass class1) {
		return class1.getEStructuralFeature("uid");
	}

	public DRepresentationDescriptor getRepresentationDescriptor(Session session, String id) {
		Collection<DRepresentationDescriptor> representationDescriptors = DialectManager.INSTANCE.getAllRepresentationDescriptors(session);
		for (DRepresentationDescriptor representationDescriptor : representationDescriptors) {

			String descriptorFragment;
			try {
				descriptorFragment = representationDescriptor.getRepPath().getResourceURI().fragment();
			} catch (NullPointerException e) {
				descriptorFragment = "";
			}

			String descriptorUid = representationDescriptor.getUid();

			if (id.equals(descriptorFragment) || id.equals(descriptorUid)) {
				return representationDescriptor;
			}
		}
		return null;
	}

	@Override
	protected void tearDown() throws Exception {
		doCleanup();
		super.tearDown();
	}

	private void doCleanup() {
		final IEditingSession sessionUI = SessionUIManager.INSTANCE.getUISession(session);
		if (sessionUI != null) {
			SessionUIManager.INSTANCE.remove(sessionUI);
			sessionUI.close();
			TestsUtil.emptyEventsFromUIThread();
		}
		if (session != null) {
			doRemoveSession();
			doCloseSession();
			session = null;
		}
		viewpoints.clear();
		Collection<DialectEditor> editors = Stream.of(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences()).map(x -> x.getEditor(false)).filter(Objects::nonNull).filter(DialectEditor.class::isInstance).map(DialectEditor.class::cast).collect(Collectors.toSet());
		editors.forEach(e -> DialectUIManager.INSTANCE.closeEditor(e, false));
		TestsUtil.emptyEventsFromUIThread();
	}

	private void doCloseSession() {
		session.close(new NullProgressMonitor());
		Assert.assertFalse("Can't close the session", session.isOpen());
	}

	private void doRemoveSession() {
		SessionManager.INSTANCE.remove(session);
		for (final Session session2 : SessionManager.INSTANCE.getSessions()) {
			Assert.assertFalse("Remove failed", session2.equals(session));
		}
	}

}
