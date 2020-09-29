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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramBorderNodeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.IWorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.AirStyleDefaultSizeNodeFigure;
import org.polarsys.kitalpha.common.sirius.extension.internal.rotativeimage.Activator;

/**
 * Specific Edit Part for rotative image
 * 
 * @author ymortier,pdul
 */
public class RotativeImageEditPart extends WorkspaceImageEditPart implements IStyleEditPart {

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	private SwitchImageListener switchImageListener;

	/**
	 * Creates a new port edit part.
	 * 
	 * @param view the GMF view.
	 */
	public RotativeImageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		WorkspaceImage wkImage = (WorkspaceImage) resolveSemanticElement();

		RotativeDescription desc = Activator.getDefault().getBestDescription(wkImage.getWorkspacePath());

		if (desc.mode == RotativeDescription.ROTATIVE) {
			primaryShape = new RotativeWorkspaceImageFigure(wkImage.getWorkspacePath());

		} else {
			int pos = desc.id.lastIndexOf(".");
			String deb = desc.id.substring(0, pos);
			String ext = desc.id.substring(pos);

			primaryShape = new RotativeWorkspaceImageFigure(desc.id,
					WorkspaceImageFigure.flyWeightImage(deb + "_top" + ext),
					WorkspaceImageFigure.flyWeightImage(deb + "_left" + ext),
					WorkspaceImageFigure.flyWeightImage(deb + "_bottom" + ext),
					WorkspaceImageFigure.flyWeightImage(deb + "_right" + ext));
		}

		switchImageListener = new SwitchImageListener(this);
		primaryShape.addAncestorListener(switchImageListener);
		primaryShape.addPropertyChangeListener(switchImageListener);
		return primaryShape;
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

		public void updateImage() {
			if (editPart.figure == null || editPart.getPrimaryShape() == null)
				return;
			IBorderItemLocator borderItemLocator = getBorderItemLocator();
			if (borderItemLocator != null) {
				BorderedNodeFigure borderedNodeFigure = getBorderedNodeFigure();
				int side = DBorderItemLocator.findClosestSideOfParent(editPart.getFigure().getBounds(),
						borderedNodeFigure.getBounds());

				RotativeWorkspaceImageFigure primaryShape = (RotativeWorkspaceImageFigure)editPart.primaryShape;
				switch (side) {
				case PositionConstants.SOUTH:
					primaryShape.setImage(primaryShape.getBottomImage());
					break;
				case PositionConstants.NORTH:
					primaryShape.setImage(primaryShape.getTopImage());
					break;
				case PositionConstants.WEST:
					primaryShape.setImage(primaryShape.getLeftImage());
					break;
				case PositionConstants.EAST:
					primaryShape.setImage(primaryShape.getRightImage());
					break;
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

		public void propertyChange(PropertyChangeEvent arg0) {
			updateImage();
		}

		public void figureMoved(IFigure source) {
			updateImage();
		}

	}

}
