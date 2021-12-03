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
package org.polarsys.kitalpha.sirius.rotativeimage.editpart;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramBorderNodeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.edit.internal.part.DiagramBorderNodeEditPartOperation;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.IWorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;
import org.eclipse.sirius.ext.draw2d.figure.ITransparentFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.Activator;
import org.polarsys.kitalpha.sirius.rotativeimage.extension.RotativeDescription;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.Rotative4ImagesSVGWorkspaceImageFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.RotativeSVGWorkspaceImageFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.figures.RotativeWorkspaceImageFigure;
import org.polarsys.kitalpha.sirius.rotativeimage.internal.helpers.RotativeWorkspaceImageHelper;
import org.polarsys.kitalpha.sirius.rotativeimage.internal.messages.Messages;

/**
 * Specific Edit Part for rotative image
 * 
 * @author ymortier,pdul,adieumegard
 */
public class RotativeImageEditPart extends WorkspaceImageEditPart implements IStyleEditPart {

    /**
     * Creates a new port edit part.
     * 
     * @param view
     *            the GMF view.
     */
    public RotativeImageEditPart(View view) {
        super(view);
    }

    /**
     * @generated NOT
     */
    @Override
    protected IFigure createNodeShape() {
        EObject element = resolveSemanticElement();
        if (element instanceof WorkspaceImage) {
            WorkspaceImage wkImage = (WorkspaceImage) element;
            String workspacePath = wkImage.getWorkspacePath();

            RotativeDescription desc = Activator.getDefault().getBestDescription(workspacePath);

            if (desc == null) {
            	throw new IllegalArgumentException(NLS.bind(Messages.rotativeImageEditPartErrorCreateNodeShapeNullDescription, workspacePath));
            }
            
            primaryShape = getWorkspaceImageFigure(wkImage, workspacePath, desc);
            SwitchImageListener switchImageListener = new SwitchImageListener(this);
            primaryShape.addAncestorListener(switchImageListener);
            primaryShape.addPropertyChangeListener(switchImageListener);
            
            EditPart parent = this.getParent();
            if (parent instanceof IDiagramBorderNodeEditPart && primaryShape instanceof ITransparentFigure) {
                DiagramBorderNodeEditPartOperation.updateTransparencyMode((IDiagramBorderNodeEditPart) parent, (ITransparentFigure) primaryShape);
            }
        }
        return primaryShape;
    }

	private IWorkspaceImageFigure getWorkspaceImageFigure(WorkspaceImage workspaceImage, String workspacePath, RotativeDescription description) {
		IWorkspaceImageFigure figure;
		if (description.mode == RotativeDescription.ROTATIVE) {
		    if (WorkspaceImageFigure.isSvgImage(workspacePath)) {
		        figure = RotativeSVGWorkspaceImageFigure.createImageFigure(workspaceImage);
		    } else {
		    	figure = new RotativeWorkspaceImageFigure(workspacePath);
		    }
		} else {
		    // RotativeDescription.FOUR_IMAGES mode
		    if (WorkspaceImageFigure.isSvgImage(description.id)) {
		    	figure = Rotative4ImagesSVGWorkspaceImageFigure.createImageFigures(workspaceImage, workspacePath);
		    } else {
		        RotativeWorkspaceImageHelper.createImage(description.id, PositionConstants.NORTH);
		        RotativeWorkspaceImageHelper.createImage(description.id, PositionConstants.WEST);
		        RotativeWorkspaceImageHelper.createImage(description.id, PositionConstants.SOUTH);
		        RotativeWorkspaceImageHelper.createImage(description.id, PositionConstants.EAST);
		        figure = new RotativeWorkspaceImageFigure(description.id);
		    }
		}
		return figure;
	}

    private static class SwitchImageListener implements AncestorListener, PropertyChangeListener, FigureListener {

        private RotativeImageEditPart editPart;

        public SwitchImageListener(final RotativeImageEditPart editPart) {
            this.editPart = editPart;

        }

        public void ancestorAdded(IFigure ancestor) {
            updateImage();
        }

        public void ancestorMoved(IFigure ancestor) {
            updateImage();
        }

        public void ancestorRemoved(IFigure ancestor) {
            updateImage();
        }

        public void propertyChange(PropertyChangeEvent arg0) {
            updateImage();
        }

        public void figureMoved(IFigure source) {
            updateImage();
        }

        @SuppressWarnings("synthetic-access")
        public void updateImage() {
            if (editPart.figure == null || editPart.getPrimaryShape() == null)
                return;
            IBorderItemLocator borderItemLocator = getBorderItemLocator();
            if (borderItemLocator != null) {
                BorderedNodeFigure borderedNodeFigure = getBorderedNodeFigure();
                if (borderedNodeFigure == null) {
                	return;
                }
                int side = DBorderItemLocator.findClosestSideOfParent(editPart.getFigure().getBounds(), borderedNodeFigure.getBounds());

                IWorkspaceImageFigure figure = editPart.getPrimaryShape();
                if (figure instanceof RotativeSVGWorkspaceImageFigure) {
                    ((RotativeSVGWorkspaceImageFigure) figure).setOrientation(side);
                } else if (figure instanceof Rotative4ImagesSVGWorkspaceImageFigure) {
                    ((Rotative4ImagesSVGWorkspaceImageFigure) figure).setOrientation(side);
                } else {
                    ((RotativeWorkspaceImageFigure) figure).setOrientation(side);
                }
            }
        }

        private BorderedNodeFigure getBorderedNodeFigure() {
            boolean first = false;
            BorderedNodeFigure borderedNodeFigure = null;
            IGraphicalEditPart current = editPart;
            IBorderedShapeEditPart borderNodeEditPart = null;
            while (current != null && borderNodeEditPart == null) {
                if (current instanceof IBorderedShapeEditPart) {
                    if (first)
                        borderNodeEditPart = (IBorderedShapeEditPart) current;
                    else
                        first = true;
                }
                current = (IGraphicalEditPart) current.getParent();
            }

            borderedNodeFigure = borderNodeEditPart != null ? borderNodeEditPart.getBorderedFigure() : null;
            return borderedNodeFigure;
        }

        private IBorderItemLocator getBorderItemLocator() {
            IBorderItemLocator borderItemLocator = null;
            IGraphicalEditPart current = editPart;
            IDiagramBorderNodeEditPart borderNodeEditPart = null;
            while (current != null && borderNodeEditPart == null) {
                if (current instanceof IDiagramBorderNodeEditPart) {
                    borderNodeEditPart = (IDiagramBorderNodeEditPart) current;
                }
                current = (IGraphicalEditPart) current.getParent();
            }

            if (borderNodeEditPart instanceof IBorderItemEditPart) {
                borderItemLocator = ((IBorderItemEditPart) borderNodeEditPart).getBorderItemLocator();
            }

            return borderItemLocator;
        }
    }

}
