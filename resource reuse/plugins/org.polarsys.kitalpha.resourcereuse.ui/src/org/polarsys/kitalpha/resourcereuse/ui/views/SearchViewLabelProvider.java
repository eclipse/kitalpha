/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.ui.views;

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
	@Override
	public String getColumnText(Object obj, int index) {
		Resource res = (Resource) obj;
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
		default: 
			return getText(obj);
		}
	}

	private String noNull(String value) {

		return value == null ? "" : value;
	}

	@Override
	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}

	@Override
	public Image getImage(Object obj) {
		return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}
}