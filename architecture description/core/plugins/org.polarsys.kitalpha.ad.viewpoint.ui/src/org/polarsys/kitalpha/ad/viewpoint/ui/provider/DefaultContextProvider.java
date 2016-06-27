/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author Thomas Guiu
 *
 */
public class DefaultContextProvider implements AFContextProvider {

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFContextProvider#computeContext(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public ResourceSet computeContext(IWorkbenchPart part, ISelection selection) {
		if (part instanceof IEditingDomainProvider) {
			IEditingDomainProvider prov = (IEditingDomainProvider) part;
			EditingDomain editingDomain = prov.getEditingDomain();
			if (editingDomain != null)
				return editingDomain.getResourceSet();
		}
			EditingDomain obj = (EditingDomain) part.getAdapter(EditingDomain.class);
			if (obj != null) {
				return obj.getResourceSet();
		}
		return analyseSelection(selection);
	}
	
	private ResourceSet analyseSelection(ISelection selection) {

		if (selection.isEmpty())
			return null;
		if (selection instanceof TreeSelection) {
			Object[] selected = ((TreeSelection) selection).toArray();
			if (selected[0] instanceof EObject)
			{
				org.eclipse.emf.ecore.resource.Resource eResource = ((EObject) selected[0]).eResource();
				if (eResource != null)
					return eResource.getResourceSet();
			}
		}
		return null;
	}


}
