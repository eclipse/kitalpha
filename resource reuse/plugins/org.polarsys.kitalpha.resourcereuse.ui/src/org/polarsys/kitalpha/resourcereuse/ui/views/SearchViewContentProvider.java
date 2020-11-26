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

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.resourcereuse.model.Resource;


/**
 * @author Thomas Guiu
 * 
 */
class SearchViewContentProvider implements IStructuredContentProvider {
	private static final Object[] EMPTY_ARRAY = new Object[0];

	@Override
	public void inputChanged(Viewer v, Object oldInput, Object newInput) { // NOSONAR
	}

	@Override
	public void dispose() { // NOSONAR
	}

	@Override
	public Object[] getElements(Object parent) {
		if (parent instanceof Resource[]) {
			return (Resource[]) parent;
		}
		return EMPTY_ARRAY;
	}
}