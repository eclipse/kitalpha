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

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Description;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerContentProvider implements IStructuredContentProvider {
	public static final Object[] EMPTY_LIST = new Object[0];

	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Description[]) {
			return (Object[]) inputElement;
		}
		return EMPTY_LIST;
	}
}
