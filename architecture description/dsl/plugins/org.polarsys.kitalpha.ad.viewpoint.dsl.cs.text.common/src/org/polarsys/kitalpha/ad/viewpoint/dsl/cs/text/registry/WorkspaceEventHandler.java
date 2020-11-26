/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;


/**
 * @author Faycal Abka
 */
public class WorkspaceEventHandler implements IResourceChangeListener {
	
	private final DataWorkspaceEPackage registry;
	
	public WorkspaceEventHandler(DataWorkspaceEPackage registry){
		this.registry = registry;
	}
	
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {

		IResourceDelta changes = event.getDelta();

		if (changes != null) {
			handleChanges(changes, event);
		}
	}

	private void handleChanges(IResourceDelta changes,
			IResourceChangeEvent event) {
		
		IResource resource = changes.getResource();
		IResourceDelta childrenDelta[] = changes.getAffectedChildren();

		if (childrenDelta.length != 0){
			
			for (IResourceDelta iResourceDelta : childrenDelta) {
				handleChanges(iResourceDelta, event);
			}
		}
		
		String extension = resource.getFileExtension();			
		if (extension != null && !extension.isEmpty()
				&& extension.equals("ecore")) { // $NON-NLS-1$

			handleWorkspaceChanges(changes, event);
		}

	}

	private void handleWorkspaceChanges(IResourceDelta changes, IResourceChangeEvent event) {
		
		switch (changes.getKind()) {
		case IResourceDelta.CONTENT: {
			handleContent(changes.getResource());
			break;
		}
		case IResourceDelta.REMOVED: {
			handleRemove(changes.getResource());
			break;
		}
		default:
			break;
		}
	}

	private void handleRemove(IResource resource) {
		if (resource instanceof IFile) {
			IFile file = (IFile) resource;
			registry.removeEPackagesOf(file);
		}
	}

	private void handleContent(IResource resource) {
		if (resource instanceof IFile) {
			IFile file = (IFile) resource;
			registry.registerEPackagesFrom(file);
		}
	}
}
