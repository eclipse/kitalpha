/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.amalgam.providers;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFContextProvider;

/**
 * @author Thomas Guiu
 *
 */
public class AmalgamContextProvider implements AFContextProvider {

	@Override
	public ResourceSet computeContext(IWorkbenchPart part, ISelection selection) {
	    if (part instanceof ActivityExplorerEditor) {
	    	ActivityExplorerEditor ae = (ActivityExplorerEditor) part;
	    	ActivityExplorerEditorInput editorInput = ae.getEditorInput();
	    	if (editorInput == null){
	    		return null;
	    	}
			Session session = editorInput.getSession();
			if (session == null) {
				return null;
			}
			TransactionalEditingDomain ed = session.getTransactionalEditingDomain();
			return ed == null ? null: ed.getResourceSet();
	    }
		return null;
	}

}
