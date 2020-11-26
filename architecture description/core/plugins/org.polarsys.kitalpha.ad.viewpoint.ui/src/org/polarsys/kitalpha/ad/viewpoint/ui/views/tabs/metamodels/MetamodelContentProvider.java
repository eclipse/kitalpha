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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.metamodels;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IMetamodelHandler;

/**
 * @author Thomas Guiu
 * 
 */
public class MetamodelContentProvider implements IStructuredContentProvider {
	public static final MetamodelContentProvider INSTANCE = new MetamodelContentProvider();

	public static final Object[] EMPTY_LIST = new Object[0];

	protected MetamodelContentProvider() {
		super();
	}

	@Override
	public Object[] getElements(Object element) {
		if (element instanceof IMetamodelHandler) {
			IMetamodelHandler handler = (IMetamodelHandler) element;
			Metamodel metamodel = handler.getMetamodel();
			return metamodel == null ? EMPTY_LIST : metamodel.getModels().toArray();
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
