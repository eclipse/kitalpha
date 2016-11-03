/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Description;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerLabelProvider extends LabelProvider implements ITableLabelProvider {

	private ResourceSet context;

	public Image getColumnImage(Object element, int columnIndex) {
		if (columnIndex != 0)
			return null;
		Description vp = (Description) element;
		if (context != null && ViewpointManager.getInstance(context).isUsed(vp.getId()))
			return Activator.getDefault().getImage(AFImages.RUNNING_VP);
		return Activator.getDefault().getImage(AFImages.VP);
	}

	public String getColumnText(Object element, int columnIndex) {
		Description vp = (Description) element;
		switch (columnIndex) {
		case 0:
			return vp.getLabel();
		case 2:
			if (context == null)
				return "N/A";
			ViewpointManager instance = ViewpointManager.getInstance(context);
			if (instance.isReferenced(vp.getId())) {
				return instance.isInactive(vp.getId())? "Inactive" : "Active";
			}
			return "Unreferenced";
		case 1:
			Version version = vp.getVersion();
			return version == null ? "no version" : version.toString();
		}
		return "";
	}

	public void setContext(ResourceSet context) {
		this.context = context;
	}

}
