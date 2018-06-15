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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.overview;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AFLabelProvider;


/**
 * @author Thomas Guiu
 * 
 */
public class ParentslLabelProvider extends AFLabelProvider {

	private final ItemProviderAdapter provider = (ItemProviderAdapter) new ViewpointItemProviderAdapterFactory().createViewpointAdapter();

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof Viewpoint) {
			Viewpoint vp = (Viewpoint) element;
			return vp.getName();
		}
		return "";
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		Object url = provider.getImage((Object) null);
		Image image = ExtendedImageRegistry.getInstance().getImage(url);
		return image;
	}

	@Override
	protected ViewpointElement getElement(Viewpoint parent, ViewpointElement elt) {
		return null;
	}

}
