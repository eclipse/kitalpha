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

package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.Description;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManagerContentProvider implements IStructuredContentProvider {
	public static final Object[] EMPTY_LIST = new Object[0];

	@Override
	public void dispose() {
		//nothing to do
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		//nothing to do
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Description[]) {
			return (Object[]) inputElement;
		}
		return EMPTY_LIST;
	}
}
