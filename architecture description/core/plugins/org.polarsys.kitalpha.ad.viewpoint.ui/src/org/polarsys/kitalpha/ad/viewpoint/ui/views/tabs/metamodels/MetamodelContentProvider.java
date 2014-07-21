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

	public Object[] getElements(Object element) {
		if (element instanceof IMetamodelHandler) {
			IMetamodelHandler handler = (IMetamodelHandler) element;
			Metamodel metamodel = handler.getMetamodel();
			return metamodel == null ? EMPTY_LIST : metamodel.getModels().toArray();
		}
		return EMPTY_LIST;
	}

	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
