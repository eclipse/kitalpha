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

package org.polarsys.kitalpha.ad.integration.sirius.dialog;

import java.util.Collections;
import java.util.Set;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointsTableContentProvider implements IStructuredContentProvider {

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public Object[] getElements(final Object inputElement) {
		if (inputElement instanceof Set<?>) {
			final Set<Viewpoint> viewpoints = (Set<Viewpoint>) inputElement;
			return viewpoints.toArray();
		}
		return Collections.EMPTY_LIST.toArray();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// nothing to do
	}

	/**
	 * {@inheritDoc}
	 */
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// nothing to do
	}
}
