/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.coredomain.model.editor.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers.DiscardedModels;

/**
 * @author Thomas Guiu
 *
 */
public class FilteredResourceContentProvider implements IStructuredItemContentProvider {

	@Override
	public Collection<?> getElements(Object object) {
		 
		if (object instanceof ResourceSet)
		{
			ArrayList<Resource> result = new ArrayList<>();
			for (Resource r : ((ResourceSet)object).getResources()) {
				if (!DiscardedModels.isFiltered(r.getURI())){
					result.add(r);
				}
			}
			return result;
		}
		return Collections.emptyList();
	}

}
