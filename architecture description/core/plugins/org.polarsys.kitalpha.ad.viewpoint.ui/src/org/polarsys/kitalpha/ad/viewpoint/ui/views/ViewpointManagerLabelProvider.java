/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		if (columnIndex != 0)
			return null;
		Resource vp = (Resource) element;
		if (ViewpointManager.INSTANCE.isActive(vp.getId()))
			return Activator.getDefault().getImage(AFImages.RUNNING_VP);
		return Activator.getDefault().getImage(AFImages.VP);
	}

	public String getColumnText(Object element, int columnIndex) {
		Resource vp = (Resource) element;
		switch (columnIndex) {
		case 0:
			return vp.getName();
		case 1:
			return ViewpointManager.INSTANCE.isActive(vp.getId()) ? "Active" : "Unactive";
		case 2:
			return vp.getProviderLocation().toString();
		case 3:
			return vp.getProviderSymbolicName();
		case 4:
			return "";
		}
		return "";
	}
}
