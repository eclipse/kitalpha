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
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.AirStyleDefaultSizeNodeFigure;
import org.polarsys.kitalpha.common.sirius.extension.internal.rotativeimage.Activator;

/**
 * Specific Edit Part for rotative image
 * 
 * @author ymortier,pdul
 */
public class RotativeImageEditPart extends ShapeNodeEditPart implements
		IStyleEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected RotativeWorkspaceImageFigure primaryShape;

	/**
	 * Creates a new port edit part.
	 * 
	 * @param view
	 *            the GMF view.
	 */
	public RotativeImageEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		// empty.
	}

	/**
	 * @generated NOT : prevent drag of elements
	 */
	public DragTracker getDragTracker(Request request) {
		return getParent().getDragTracker(request);
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		WorkspaceImageFigure figure = this.getPrimaryShape();
		EObject element = this.resolveSemanticElement();
		if (element instanceof WorkspaceImage) {
			WorkspaceImage bundledImage = (WorkspaceImage) element;
			figure.refreshFigure(bundledImage);
			if (switchImageListener != null)
				switchImageListener.updateImage();
			((GraphicalEditPart) this.getParent()).setLayoutConstraint(this,
					this.getFigure(), new Rectangle(0, 0, figure
							.getPreferredSize().width, figure
							.getPreferredSize().height));
		}
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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

		RotativeDescription desc = Activator.getDefault().getBestDescription(
				wkImage.getWorkspacePath());

		if (desc.mode == RotativeDescription.ROTATIVE) {
			primaryShape = new RotativeWorkspaceImageFigure(wkImage
					.getWorkspacePath());

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

	SwitchImageListener switchImageListener;

	/**
	 * @generated NOT
	 */
	public WorkspaceImageFigure getPrimaryShape() {
		return (WorkspaceImageFigure) primaryShape;
	}

	/**
	 * @not-generated custom size node.
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new AirStyleDefaultSizeNodeFigure(
				getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @not-generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new XYLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	protected Class<?> getMetamodelType() {
		return WorkspaceImage.class;
	}

	private static class SwitchImageListener implements AncestorListener,
			PropertyChangeListener, FigureListener {

		private RotativeImageEditPart editPart;

		boolean update = false;

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
			if (editPart.figure == null)
				return;
			update = true;
			IBorderItemLocator borderItemLocator = getBorderItemLocator();
			if (borderItemLocator != null) {
				BorderedNodeFigure borderedNodeFigure = getBorderedNodeFigure();
				int side = DBorderItemLocator.findClosestSideOfParent(editPart
						.getFigure().getBounds(), borderedNodeFigure
						.getBounds());

				switch (side) {
				case PositionConstants.SOUTH:
					editPart.primaryShape.setImage(editPart.primaryShape
							.getBottomImage());
					break;
				case PositionConstants.NORTH:
					editPart.primaryShape.setImage(editPart.primaryShape
							.getTopImage());
					break;
				case PositionConstants.WEST:
					editPart.primaryShape.setImage(editPart.primaryShape
							.getLeftImage());
					break;
				case PositionConstants.EAST:
					editPart.primaryShape.setImage(editPart.primaryShape
							.getRightImage());
					break;
				}
			}
			update = false;
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

			if (borderNodeEditPart instanceof IBorderedShapeEditPart) {
				borderedNodeFigure = ((IBorderedShapeEditPart) borderNodeEditPart)
						.getBorderedFigure();
			}

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
				borderItemLocator = ((IBorderItemEditPart) borderNodeEditPart)
						.getBorderItemLocator();
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
