/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers;

import java.util.Arrays;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
class SearchViewLabelProvider extends LabelProvider implements ITableLabelProvider {
	public String getColumnText(Object obj, int index) {
		
		LibraryItem item = ((LibraryItem)obj);
		Object o = item.getItem();
		Resource res = (Resource) o;
		switch (index) {
		case 0:
			return noNull(res.getId());
		case 1:
			return noNull(res.getName());
		case 2:
			return noNull(res.getDomain());
		case 3:
			return noNull(res.getVersion());
		case 4:
			return Arrays.toString(res.getTags().toArray());
		case 5:
			return noNull(res.getPath());
		}
		return getText(obj);
	}

	private String noNull(String value) {

		return value == null ? "" : value;
	}

	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}

	public Image getImage(Object obj) {
		return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}
}