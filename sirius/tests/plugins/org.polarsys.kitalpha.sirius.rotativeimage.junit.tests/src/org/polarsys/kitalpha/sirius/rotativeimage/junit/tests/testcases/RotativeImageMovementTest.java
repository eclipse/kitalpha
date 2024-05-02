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

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.swt.graphics.Resource;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.Rotative4ImagesSVGWorkspaceImageFigure;

/**
 * Checks that displayed images in rotative bordered node move when node changes side of parent
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class RotativeImageMovementTest extends RotativeSiriusTest {

  private static final String ID_REPRESENTATION_DESCRIPTOR_SVG = "_idds4E1NEeySgagIY4HK9g";

  private static final String BOTTOM_E1_BORDERNODE_ID = "_ifBMEE1NEeySgagIY4HK9g";

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    setPreferenceAutoRefresh(true);
    setPreferenceRefreshOnOpening(true);
    Resource.setNonDisposeHandler(null);
    genericSetUp(TEST_XMI_PATH, TEST_ODESIGN_PATH, TEST_AIRD_PATH);
  }

  /**
   * Ensure that image is changed if the port is moved
   */
  public void testMoveImages() {
    DRepresentationDescriptor desc = getRepresentationDescriptor(session, ID_REPRESENTATION_DESCRIPTOR_SVG);
    DDiagram ddiagram = (DDiagram) desc.getRepresentation();
    DiagramEditor editor = openEditor(ddiagram);

    IFigure figure = getFigure(ddiagram, BOTTOM_E1_BORDERNODE_ID, editor);
    shallBe4ImagesOn(figure, PositionConstants.SOUTH);

    // We put the port on the left. After reopening the diagram, it will be moved to west according to conditional
    // style.
    DDiagramElement port = getDiagramElementFromUid(ddiagram, BOTTOM_E1_BORDERNODE_ID, DDiagramElement.class);
    setLeft(port, Boolean.TRUE);

    closeEditor(editor);
    editor = openEditor(ddiagram);

    figure = getFigure(ddiagram, BOTTOM_E1_BORDERNODE_ID, editor);
    shallBe4ImagesOn(figure, PositionConstants.WEST);
  }

  private Rotative4ImagesSVGWorkspaceImageFigure getFigure(IGraphicalEditPart editPart) {
    List<WorkspaceImageEditPart> childrens = (List<WorkspaceImageEditPart>) editPart.getChildren().stream()
        .filter(WorkspaceImageEditPart.class::isInstance).collect(Collectors.toList());
    assertNotNull(childrens);
    assertEquals(1, childrens.size());

    WorkspaceImageEditPart bottomEditPart = childrens.get(0);
    assertNotNull(bottomEditPart);
    Rotative4ImagesSVGWorkspaceImageFigure bottomFigure = (Rotative4ImagesSVGWorkspaceImageFigure) bottomEditPart
        .getContentPane();
    assertNotNull(bottomFigure);
    return bottomFigure;
  }

  private void setLeft(EObject target, Boolean isLeft) {
    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(target);
    domain.getCommandStack().execute(new RecordingCommand(domain) {
      @Override
      protected void doExecute() {
        ((DDiagramElement) target).getTarget()
            .eSet(((DDiagramElement) target).getTarget().eClass().getEStructuralFeature("left"), isLeft);
      }
    });
  }

}
