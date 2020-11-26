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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IElementHandler;


/**
 * @author Thomas Guiu
 * 
 */
public class GenericHandlerContentProvider implements IStructuredContentProvider {
	public static final GenericHandlerContentProvider INSTANCE = new GenericHandlerContentProvider();

	public static final Object[] EMPTY_LIST = new Object[0];

	protected GenericHandlerContentProvider() {
		super();
	}

	@Override
	public Object[] getElements(Object element) {
		if (element instanceof IElementHandler) {
			IElementHandler handler = (IElementHandler) element;
			return handler.getElements().toArray();
		}
		return EMPTY_LIST;
	}

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
