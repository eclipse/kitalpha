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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.util.CommandStackUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.tests.support.api.SiriusDiagramTestCase;
import org.eclipse.sirius.tests.support.api.TestsUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.junit.Assert;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.Rotative4ImagesSVGWorkspaceImageFigure;

/**
 * Checks that displayed images in rotative bordered node move when node changes side of parent
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class RotativeImageMovementTest extends SiriusDiagramTestCase {

	protected static final String PLATFORM_PLUGIN_PATH = "platform:/plugin/";

	protected static final String ROTATIVEIMAGE_TEST_PLUGIN_NAME = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests";

	private static final String TEST_XMI_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.xmi";

	private static final String TEST_AIRD_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.aird";

	private static final String TEST_ODESIGN_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/description/test.odesign";

	private static final String ID_REPRESENTATION_DESCRIPTOR_SVG = "_idds4E1NEeySgagIY4HK9g";

	private static final String SVG = ".svg";

	private static final String FOURIMAGESICON_PREFIX = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests/icons/4imagesIcon";

	private static final String BOTTOM = "bottom";

	private static final String LEFT = "left";

	private static final String BOTTOM_E1_BORDERNODE_ID = "_ifBMEE1NEeySgagIY4HK9g";

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		genericSetUp(TEST_XMI_PATH, TEST_ODESIGN_PATH, TEST_AIRD_PATH);
	}

	/**
	 * Ensure Rotative and 4Images WorkspaceImages reference expected SVG images
	 */
	@SuppressWarnings("restriction")
	public void testMoveImages() {
		String repId = ID_REPRESENTATION_DESCRIPTOR_SVG;
		DRepresentationDescriptor desc = getRepresentationDescriptor(session, repId);
		DDiagram ddiagram = (DDiagram) desc.getRepresentation();

		DialectEditor editor = (DialectEditor) DialectUIManager.INSTANCE.openEditor(session, ddiagram, new NullProgressMonitor());
		TestsUtil.synchronizationWithUIThread();
		DialectUIManager.INSTANCE.refreshEditor(editor, new NullProgressMonitor());
		TestsUtil.synchronizationWithUIThread();

		List<DDiagramElement> diagramElementsFromLabel = getDiagramElementsFromUid(ddiagram, BOTTOM_E1_BORDERNODE_ID, DDiagramElement.class);
		for (DDiagramElement dDiagramElement : diagramElementsFromLabel) {
			IGraphicalEditPart editPart = getEditPart(dDiagramElement);
			if (editPart instanceof DNode2EditPart) {
				List<WorkspaceImageEditPart> childrens = (List<WorkspaceImageEditPart>) editPart.getChildren().stream().filter(WorkspaceImageEditPart.class::isInstance).collect(Collectors.toList());
				assertNotNull(childrens);
				assertEquals(1, childrens.size());

				WorkspaceImageEditPart bottomEditPart = childrens.get(0);
				assertNotNull(bottomEditPart);
				Rotative4ImagesSVGWorkspaceImageFigure bottomFigure = (Rotative4ImagesSVGWorkspaceImageFigure) bottomEditPart.getContentPane();
				assertNotNull(bottomFigure);

				// Check for SVGImage DocumentKey
				String figureDocumentKey = bottomFigure.getDocumentKey();
				assertTrue("Figure should reference uri " + FOURIMAGESICON_PREFIX + "_" + BOTTOM + SVG + " instead uri is " + figureDocumentKey,
						figureDocumentKey.endsWith(FOURIMAGESICON_PREFIX + "_" + BOTTOM + SVG));

				// Arrange all in diagram
				performArrangeAll(ddiagram, (DiagramEditor) editor);

				// Check new position
				figureDocumentKey = bottomFigure.getDocumentKey();
				assertTrue("Figure should reference uri " + FOURIMAGESICON_PREFIX + "_" + LEFT + SVG + " instead uri is " + figureDocumentKey,
						figureDocumentKey.endsWith(FOURIMAGESICON_PREFIX + "_" + LEFT + SVG));

			}
		}

	}

	private void performArrangeAll(DDiagram ddiagram, DiagramEditor editor) {
		final ArrangeRequest request = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
		request.setPartsToArrange(Arrays.asList(editor.getDiagramEditPart()));
		editor.getDiagramEditPart().refresh();
		editor.getDiagramEditPart().performRequest(request);
		CommandStackUtil.flushOperations(editor.getEditingDomain().getCommandStack());
		editor.getDiagramEditPart().getRoot().getViewer().flush();
		TestsUtil.synchronizationWithUIThread();
	}

	private <T extends DDiagramElement> List<T> getDiagramElementsFromUid(final DDiagram diagram, final String uid, final Class<T> searchedClass) {
		final List<T> found = new ArrayList<>();
		final Iterator<EObject> it = diagram.eAllContents();
		while (it.hasNext()) {
			final EObject cur = it.next();
			if (searchedClass.isInstance(cur) && uidFeature(cur.eClass()) != null) {
				if (uid.equals(getUidValue(cur))) {
					found.add(searchedClass.cast(cur));
				}
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
