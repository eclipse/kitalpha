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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.overview;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public class ParentsContentProvider implements IStructuredContentProvider {
	public static final ParentsContentProvider INSTANCE = new ParentsContentProvider();

	public static final Object[] EMPTY_LIST = new Object[0];

	protected ParentsContentProvider() {
		super();
	}

	public Object[] getElements(Object element) {
		if (element instanceof Viewpoint) {
			Viewpoint vp = (Viewpoint) element;
			return vp.getParents().toArray();
		}
		return EMPTY_LIST;
	}

	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
