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

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElementSet;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ProjectUtils;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ResourceManager;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointManager extends ResourceManager {

	private Viewpoint viewpoint;

	public ViewpointManager(Viewpoint viewpoint) {
		super();
		this.viewpoint = viewpoint;
	}

	public Object getRootModel() {
		return viewpoint;
	}

	@Override
	public long getModelTimeStamp() {
		Resource resource = viewpoint.eResource();
		return resource.getTimeStamp();
	}

	public void saveModel() {
		if (isReadOnly())
			return;
		IProject project = ProjectUtils.getContainingProject(viewpoint);
		if (project != null && project.isOpen()) {
			try {
				Resource resource = viewpoint.eResource();
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				AD_Log.getDefault().logError("An error has occured.", e);
			}
			fireEvent();
		}
	}

	public abstract static class ElementHandler extends AbstractElementHandler {

		protected ElementHandler(Viewpoint viewpoint, ResourceManager wsManager) {
			super(viewpoint, wsManager);
		}

		public boolean isRemovable(ViewpointElement element) {
			if (getResourceManager().isReadOnly())
				return false;
			ViewpointElementSet set = ((ViewpointElementSet) element.eContainer());
			return set.eContainer() == getViewpoint();
		}

	}

}
