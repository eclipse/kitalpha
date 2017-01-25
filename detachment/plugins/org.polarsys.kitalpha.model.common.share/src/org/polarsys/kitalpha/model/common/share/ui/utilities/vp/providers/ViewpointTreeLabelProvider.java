/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.share.ui.utilities.vp.providers;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;

/**
 * @author Faycal Abka
 */
public class ViewpointTreeLabelProvider implements ILabelProvider {

	public void addListener(ILabelProviderListener listener) {

	}

	public void dispose() {

	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {

	}

	public Image getImage(Object element) {
		return PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_OBJ_FOLDER);
	}

	public String getText(Object element) {
		if (element instanceof IViewpointTreeDescription){
			return ((IViewpointTreeDescription)element).getViewpointName();
		}
		return "";
	}

}
