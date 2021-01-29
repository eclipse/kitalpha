/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class ResourceManager {
	protected static final ResourceSet set = new ResourceSetImpl();
	private final List<ModelListener> listeners = new ArrayList<ModelListener>();
	private boolean readOnly;

	public abstract long getModelTimeStamp();

	public abstract void saveModel();

	public void addListener(ModelListener list) {
		listeners.add(list);
	}

	public abstract Object getRootModel();

	public void removeListener(ModelListener list) {
		listeners.remove(list);
	}

	protected void fireEvent() {
		for (ModelListener list : listeners){
			list.workspaceHasChanged();
		}
	}

	public static ResourceSet getResourceSet() {
		return set;
	}

	public void dispose() {
		listeners.clear();
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	protected void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public abstract static class AbstractElementHandler implements IElementHandler {
		private final ResourceManager wsManager;
		private final Viewpoint viewpoint;

		protected AbstractElementHandler(Viewpoint viewpoint, ResourceManager wsManager) {
			super();
			this.viewpoint = viewpoint;
			this.wsManager = wsManager;
		}

		protected Viewpoint getViewpoint() {
			return viewpoint;
		}

		protected ResourceManager getResourceManager() {
			return wsManager;
		}

		protected void saveModel() {
			wsManager.saveModel();
		}

		protected String getIdentifier(ViewpointElement elt) {
			return elt.getId();
		}

	}

}
