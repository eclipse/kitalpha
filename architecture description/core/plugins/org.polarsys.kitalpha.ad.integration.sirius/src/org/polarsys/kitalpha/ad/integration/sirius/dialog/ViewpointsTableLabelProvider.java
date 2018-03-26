/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.dialog;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.query.IdentifiedElementQuery;
import org.eclipse.sirius.common.tools.api.util.EqualityHelper;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;
import org.polarsys.kitalpha.ad.integration.sirius.SiriusViewpointManager;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointsTableLabelProvider extends ColumnLabelProvider {
	private final Map<Viewpoint, Boolean> viewpoints;

	private int columnIndex;

	/**
	 * Constructor.
	 * 
	 * @param viewpoints
	 *            the viewpoints
	 */
	public ViewpointsTableLabelProvider(final Map<Viewpoint, Boolean> viewpoints) {
		super();
		this.viewpoints = viewpoints;
	}

	private boolean findViewpoint(final Viewpoint vp) {
		for (final Map.Entry<Viewpoint, Boolean> entry : viewpoints.entrySet()) {
			if (EqualityHelper.areEquals(entry.getKey(), vp) && entry.getValue()) {
				return true;
			}
		}
		return false;
	}

	private ImageDescriptor getOverlayedDescriptor(final Image baseImage, final String decoratorPath) {
		final ImageDescriptor decoratorDescriptor = SiriusEditPlugin.Implementation.getBundledImageDescriptor(decoratorPath);
		return new DecorationOverlayIcon(baseImage, decoratorDescriptor, IDecoration.BOTTOM_LEFT);
	}

	private Image getEnhancedImage(final Image image, final Viewpoint viewpoint) {
		if (ViewpointRegistry.getInstance().isFromPlugin(viewpoint) && image != null) {
			return SiriusEditPlugin.getPlugin().getImage(getOverlayedDescriptor(image, "icons/full/others/plugin.gif"));
		}
		return image;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image getImage(final Object element) {
		if (!(element instanceof Viewpoint)){
			return null;
		}
		Image image = null;
		final Viewpoint vp = (Viewpoint) element;

		switch (columnIndex) {
		case 0:
			boolean underControl = SiriusViewpointManager.INSTANCE.isUnderControl(vp);
			if (findViewpoint(vp)) {
				return underControl ? Activator.getDefault().getImage(Activator.IMG_CHECKBOX_GRAYED_SELECTED) : SiriusEditPlugin.getPlugin().getBundledImage("/icons/full/others/checkbox_active.gif");
			}
			return underControl ? Activator.getDefault().getImage(Activator.IMG_CHECKBOX_GRAYED_UNSELECTED) : SiriusEditPlugin.getPlugin().getBundledImage("/icons/full/others/checkbox_inactive.gif");
		case 1:
			if (vp.getIcon() != null && vp.getIcon().length() > 0) {
				final ImageDescriptor desc = SiriusEditPlugin.Implementation.findImageDescriptor(vp.getIcon());
				if (desc != null) {
					image = SiriusEditPlugin.getPlugin().getImage(desc);
					return getEnhancedImage(image, vp);
				}
			}
			image = SiriusEditPlugin.getPlugin().getImage(SiriusEditPlugin.getPlugin().getItemImageDescriptor(vp));
			return getEnhancedImage(image, vp);
		default:
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getText(final Object element) {
		switch (columnIndex) {
		case 2:
			if (element instanceof Viewpoint) {
				return new IdentifiedElementQuery((Viewpoint) element).getLabel();
			}
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String getToolTipText(final Object element) {
		String toolTip = null;
		if (columnIndex == 2 && element instanceof Viewpoint) {
			Viewpoint viewpoint = (Viewpoint) element;
			final Resource resource = ((Viewpoint) element).eResource();
			if (resource != null) {
				toolTip = resource.getURI().toString();
			}
			if (viewpoint.getEndUserDocumentation() != null && viewpoint.getEndUserDocumentation().trim().length() > 0) {
				if (toolTip != null) {
					toolTip += "\n\n";
				} else {
					toolTip = "";
				}
				toolTip += viewpoint.getEndUserDocumentation();
			}
		}
		return toolTip;
	}

	@Override
	public Point getToolTipShift(final Object object) {
		return new Point(5, 5);
	}

	@Override
	public int getToolTipDisplayDelayTime(final Object object) {
		return 200;
	}

	@Override
	public Color getBackground(Object element) {
		return super.getBackground(element);
	}

	@Override
	public void update(final ViewerCell cell) {
		columnIndex = cell.getColumnIndex();
		Font font = cell.getFont();
		super.update(cell);
		Object element = cell.getElement();
		if (font != null && font.getFontData().length != 0 && element instanceof Viewpoint && SiriusViewpointManager.INSTANCE.isUnderControl((Viewpoint) element)) {
			String name = font.getFontData()[0].getName();
			FontRegistry fontRegistry = JFaceResources.getFontRegistry();
			Font italic = fontRegistry.getItalic(name);
			cell.setFont(italic);
		} else {
			cell.setFont(null);
		}
	}

	@Override
	public int getToolTipStyle(final Object object) {
		return SWT.SHADOW_OUT;
	}

}
