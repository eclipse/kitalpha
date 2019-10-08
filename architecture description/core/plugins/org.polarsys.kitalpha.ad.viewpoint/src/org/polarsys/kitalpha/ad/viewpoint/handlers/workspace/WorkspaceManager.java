/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers.workspace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.common.utils.URIFix;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class WorkspaceManager extends ResourceManager {
	private static final String USER_AF_FILE = ".user.af";
	public static final WorkspaceManager INSTANCE = new WorkspaceManager();

	private IProject currentProject;
	private boolean currentProjectIsOpen;
	private Workspace workspace;

	private WorkspaceManager() {
	}

	@Override
	public Object getRootModel() {
		if (isReadOnly()){
			return null;
		}
		return workspace;
	}

	public void projectSelected(IProject project) {
		if (project != null && project.equals(currentProject) && currentProjectIsOpen == project.isOpen()){
			return;
		}
		currentProject = project;
		disposeWorkspace();
		currentProjectIsOpen = currentProject != null && currentProject.isOpen();
		if (!currentProjectIsOpen) {
			setReadOnly(true);
			workspace = ViewpointFactory.eINSTANCE.createWorkspace();
			fireEvent();
			return;
		}
		setReadOnly(false);
		IFile userFile = currentProject.getFile(USER_AF_FILE);
		URI uri = URIFix.createPlatformResourceURI(currentProject.getName() + '/' + USER_AF_FILE, false);
		if (userFile.exists()) {
			EList<EObject> contents = set.getResource(uri, true).getContents();
			if (!contents.isEmpty()){
				workspace = (Workspace) contents.get(0);
			}
		}
		if (workspace == null) {
			// create workspace
			workspace = ViewpointFactory.eINSTANCE.createWorkspace();
			Resource createResource = set.createResource(uri);
			createResource.getContents().add(workspace);
			saveModel();
		}
		fireEvent();

	}

	private void disposeWorkspace() {
		if (workspace != null && workspace.eResource() != null) {
			Resource eResource = workspace.eResource();
			eResource.unload();
			set.getResources().remove(eResource);
		}
		workspace = null;
	}

	public Workspace getWorkspace() {
		return workspace;
	}

	@Override
	public boolean isReadOnly() {
		return super.isReadOnly() || workspace == null;
	}

	@Override
	public long getModelTimeStamp() {
		if (workspace == null || workspace.eResource() == null){
			return -1; // being reloaded
		}
		return workspace.eResource().getTimeStamp();
	}

	@Override
	public void saveModel() {
		if (isReadOnly()){
			return;
		}
		try {
			Resource resource = workspace.eResource();
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			AD_Log.getDefault().logError(e);
		}
		fireEvent();
	}

	public abstract static class ElementHandler extends AbstractElementHandler {

		protected ElementHandler(Viewpoint viewpoint, ResourceManager wsManager) {
			super(viewpoint, wsManager);
		}

		protected Workspace getWorkspace() {
			return ((WorkspaceManager) getResourceManager()).getWorkspace();
		}

		protected ResourceManager getWorkspaceManager() {
			return getResourceManager();
		}

		@Override
		public boolean isRemovable(ViewpointElement element) {
			if (getResourceManager().isReadOnly()){
				return false;
			}
			return EcoreUtil.getRootContainer(element) instanceof Workspace;
		}

		// Utils methods
		protected List<ViewpointElement> computeElements(List<? extends ViewpointElement> initial, List<? extends ViewpointElement> toRemove, List<? extends ViewpointElement> toAdd) {
			Map<String, ViewpointElement> name2elt = new HashMap<String, ViewpointElement>();
			for (ViewpointElement elt : initial) {
				name2elt.put(getIdentifier(elt), elt);
			}
			if (toRemove != null){
				for (ViewpointElement elt : toRemove){
					name2elt.remove(getIdentifier(elt));
				}
			}
			if (toAdd != null){
				for (ViewpointElement elt : toAdd){
					name2elt.put(getIdentifier(elt), elt);
				}
			}

			return new ArrayList<ViewpointElement>(name2elt.values());

		}

	}

}
