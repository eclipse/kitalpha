/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

	@Override
	public ResourceSet computeContext(IWorkbenchPart part, ISelection selection) {
		if (part instanceof IEditingDomainProvider) {
			IEditingDomainProvider prov = (IEditingDomainProvider) part;
			EditingDomain editingDomain = prov.getEditingDomain();
			if (editingDomain != null){
				return editingDomain.getResourceSet();
			}
		}
		EditingDomain obj = part.getAdapter(EditingDomain.class);
		if (obj != null) {
			return obj.getResourceSet();
		}
		return analyseSelection(selection);
	}
	
	private ResourceSet analyseSelection(ISelection selection) {
		if (selection.isEmpty()) {
			return null;
		}
		if (selection instanceof TreeSelection) {
			Object[] selected = ((TreeSelection) selection).toArray();
			if (selected[0] instanceof EObject)
			{
				org.eclipse.emf.ecore.resource.Resource eResource = ((EObject) selected[0]).eResource();
				if (eResource != null){
					return eResource.getResourceSet();
				}
			}
		}
		return null;
	}


}
