/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Description;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerLabelProvider extends LabelProvider implements ITableLabelProvider {

	private ResourceSet context;

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (columnIndex != 0){
			return null;
		}
		Description vp = (Description) element;
		if (context != null && ViewpointManager.getInstance(context).isUsed(vp.getId())){
			return Activator.getDefault().getImage(AFImages.RUNNING_VP);
		}
		return Activator.getDefault().getImage(AFImages.VP);
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		Description vp = (Description) element;
		switch (columnIndex) {
		case 0:
			return vp.getLabel();
		case 2:
			if (context == null){
				return "N/A";
			}
			ViewpointManager instance = ViewpointManager.getInstance(context);
			if (instance.isReferenced(vp.getId())) {
				return instance.isInactive(vp.getId())? "Inactive" : "Active";
			}
			return "Unreferenced";
		case 1:
			Version version = vp.getVersion();
			return version == null ? "no version" : version.toString();
		default:
			return "";
		}
	}

	public void setContext(ResourceSet context) {
		this.context = context;
	}

}
