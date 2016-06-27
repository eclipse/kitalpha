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

package org.polarsys.kitalpha.ad.integration.sirius.providers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFContextProvider;

/**
 * @author Thomas Guiu
 *
 */
public class SiriusContextProvider implements AFContextProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFContextProvider#computeContext(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public ResourceSet computeContext(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty())
			return null;
		if (selection instanceof IStructuredSelection) {
			Object[] selected = ((IStructuredSelection) selection).toArray();
			if (selected[0] instanceof IFile) {
				IFile file = (IFile) selected[0];
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Session existingSession = SessionManager.INSTANCE.getExistingSession(uri);
				if (existingSession != null)
					return existingSession.getTransactionalEditingDomain().getResourceSet();
			}
		}
		return null;
	}

}
