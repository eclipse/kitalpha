/*******************************************************************************
 * Copyright (c) 2024 Thales Global Services S.A.S.
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.preferences.SiriusPreferencesKeys;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.tests.support.api.SiriusDiagramTestCase;
import org.eclipse.sirius.tests.support.api.TestsUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.preferences.SiriusUIPreferencesKeys;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.ui.PlatformUI;
import org.junit.Assert;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.Rotative4ImagesSVGWorkspaceImageFigure;

public class RotativeSiriusTest extends SiriusDiagramTestCase {

  protected static final String PNG = ".png";

  protected static final String SVG = ".svg";

  protected static final String ROTATIONICON = "org.polarsys.kitalpha.sirius.rotativeimage.junit.tests/icons/rotationIcon";

  protected static final String ROTATIONICON_SVG = ROTATIONICON + SVG;

  protected static final String ROTATIONICON_PNG = ROTATIONICON + PNG;

  protected static final String FOURIMAGESICON_PREFIX = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests/icons/4imagesIcon";

  protected static final String FOURIMAGESICON_ERROR = FOURIMAGESICON_PREFIX + "_error";

  protected static final String TOP = "top";

  protected static final String BOTTOM = "bottom";

  protected static final String RIGHT = "right";

  protected static final String LEFT = "left";

  protected static final String PLATFORM_PLUGIN_PATH = "platform:/plugin/";

  protected static final String ROTATIVEIMAGE_TEST_PLUGIN_NAME = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests";

  protected static final String TEST_XMI_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.xmi";

  protected static final String TEST_AIRD_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.aird";

  protected static final String TEST_ODESIGN_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/description/test.odesign";

  private String getUidValue(final EObject cur) {
    return (String) cur.eGet(uidFeature(cur.eClass()));
  }

  private EStructuralFeature uidFeature(final EClass class1) {
    return class1.getEStructuralFeature("uid");
  }

  /**
   * Set the auto refresh preference for diagram
   * 
   * @apiNote that this method will affect the running instance (not specific to a given project)
   * @see org.eclipse.sirius.business.api.session.Session.getSiriusPreferences
   * @param value
   */
  public static void setPreferenceAutoRefresh(final boolean value) {
    IPreferenceStore preferenceStore = SiriusEditPlugin.getPlugin().getCorePreferenceStore();
    preferenceStore.setValue(SiriusPreferencesKeys.PREF_AUTO_REFRESH.name(), value);
  }

  /**
   * Set the refresh on opening preference for diagram
   * 
   * @apiNote that this method will affect the running instance (not specific to a given project)
   * @see org.eclipse.sirius.business.api.session.Session.getSiriusPreferences
   * @param value
   */
  public static void setPreferenceRefreshOnOpening(final boolean value) {
    IPreferenceStore preferenceStore = SiriusEditPlugin.getPlugin().getPreferenceStore();
    preferenceStore.setValue(SiriusUIPreferencesKeys.PREF_REFRESH_ON_REPRESENTATION_OPENING.name(), value);
  }

  public DRepresentationDescriptor getRepresentationDescriptor(Session session, String id) {
    Collection<DRepresentationDescriptor> representationDescriptors = DialectManager.INSTANCE
        .getAllRepresentationDescriptors(session);
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
    Collection<DiagramEditor> editors = Stream
        .of(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences())
        .map(x -> x.getEditor(false)).filter(Objects::nonNull).filter(DiagramEditor.class::isInstance)
        .map(DiagramEditor.class::cast).collect(Collectors.toSet());
    editors.forEach(e -> closeEditor(e));
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

  protected <T extends DDiagramElement> T getDiagramElementFromUid(final DDiagram diagram, final String uid,
      final Class<T> searchedClass) {
    final List<T> found = new ArrayList<>();
    final Iterator<EObject> it = diagram.eAllContents();
    while (it.hasNext()) {
      final EObject cur = it.next();
      if (searchedClass.isInstance(cur) && (uidFeature(cur.eClass()) != null) && uid.equals(getUidValue(cur))) {
        return searchedClass.cast(cur);
      }
    }
    return null;
  }

  @SuppressWarnings({ "unchecked", "restriction" })
  private WorkspaceImageEditPart getImageEditPart(DDiagram ddiagram, String elementId, DiagramEditor editor) {
    DDiagramElement dDiagramElement = getDiagramElementFromUid(ddiagram, elementId, DDiagramElement.class);
    IGraphicalEditPart editPart = getEditPart(dDiagramElement, editor);
    if (editPart instanceof DNode2EditPart) {
      List<WorkspaceImageEditPart> childrens = (List<WorkspaceImageEditPart>) editPart.getChildren().stream()
          .filter(WorkspaceImageEditPart.class::isInstance).collect(Collectors.toList());
      assertNotNull(childrens);
      assertEquals(1, childrens.size());
      return childrens.get(0);
    }
    return null;
  }

  protected IFigure getFigure(DDiagram ddiagram, String elementId, DiagramEditor editor) {
    WorkspaceImageEditPart editPart = getImageEditPart(ddiagram, elementId, editor);
    assertNotNull(editPart);
    IFigure figure = editPart.getContentPane();
    assertNotNull(figure);
    return figure;
  }

  protected DiagramEditor openEditor(DDiagram ddiagram) {
    DiagramEditor editor = (DiagramEditor) DialectUIManager.INSTANCE.openEditor(session, ddiagram,
        new NullProgressMonitor());
    TestsUtil.synchronizationWithUIThread();
    return editor;
  }

  protected void closeEditor(DiagramEditor editor) {
    DialectUIManager.INSTANCE.closeEditor(editor, false);
    TestsUtil.synchronizationWithUIThread();
  }

  protected String buildExpectedImagePostfix(int position, String extension) {
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

  protected void shallBe4ImagesOn(IFigure figure, int position) {
    assertTrue(figure instanceof Rotative4ImagesSVGWorkspaceImageFigure);
    String figureDocumentKey = ((Rotative4ImagesSVGWorkspaceImageFigure) figure).getDocumentKey();
    String postfix = buildExpectedImagePostfix(position, SVG);
    assertTrue(
        "Figure should reference uri " + FOURIMAGESICON_PREFIX + postfix + " instead uri is " + figureDocumentKey,
        figureDocumentKey.endsWith(FOURIMAGESICON_PREFIX + postfix));
  }

}
